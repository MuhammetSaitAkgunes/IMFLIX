package MSA.IMFLIX.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import MSA.IMFLIX.business.abstracts.ActorService;
import MSA.IMFLIX.core.utilities.results.DataResult;
import MSA.IMFLIX.core.utilities.results.Result;
import MSA.IMFLIX.entities.concretes.Actor;

@RestController
@RequestMapping("/api/actors")
public class ActorController {
	
	private ActorService actorService;
	
	@Autowired
	public ActorController(ActorService actorService) {
		super();
		this.actorService = actorService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Actor actor) {
		return this.actorService.add(actor);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Actor>> getAll(){
		return this.actorService.getAll();
	}
	
	@GetMapping("/getByName")
	public DataResult<Actor> getByName(@RequestParam String name){
		return this.actorService.getByActorName(name);
	}
	
	@GetMapping("/getByNameContains")
	public DataResult<List<Actor>> getByNameContains(@RequestParam String name){
		return this.actorService.getByNameContains(name);
	}
	
	@GetMapping("/getByNameStartsWith")
	public DataResult<List<Actor>> getByNameStartsWith(@RequestParam String name){
		return this.actorService.getByNameStartsWith(name);
	}
}