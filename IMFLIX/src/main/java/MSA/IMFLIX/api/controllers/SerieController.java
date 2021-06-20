package MSA.IMFLIX.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import MSA.IMFLIX.business.abstracts.SerieService;
import MSA.IMFLIX.core.utilities.results.DataResult;
import MSA.IMFLIX.core.utilities.results.Result;
import MSA.IMFLIX.entities.concretes.Serie;


@RestController
@RequestMapping("/api/serie")
public class SerieController {
	
	private SerieService serieService;
	
	@Autowired
	public SerieController(SerieService serieService) {
		super();
		this.serieService = serieService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Serie serie) {
		return this.serieService.add(serie);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Serie>> getAll(){
		return this.serieService.getAll();
	}
	
	@GetMapping("getByName")
	public DataResult<Serie> getByName(@RequestParam String name){
		return this.serieService.getBySerieName(name);
	}
	
	@GetMapping("/getByCategoryId")
	public DataResult<List<Serie>> getByCategoryId(@RequestParam int id){
		return this.serieService.getByCategoryIdentity(id);
	}
	
	@GetMapping("/getByNameContains")
	public DataResult<List<Serie>> getByNameContains(@RequestParam String name){
		return this.serieService.getByNameContains(name);
	}
	
	@GetMapping("/getByNameStartsWith")
	public DataResult<List<Serie>> getByNameStartsWith(@RequestParam String name){
		return this.serieService.getByNameStartsWith(name);
	}
}
