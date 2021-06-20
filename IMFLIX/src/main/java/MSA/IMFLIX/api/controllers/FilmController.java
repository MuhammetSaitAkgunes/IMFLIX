package MSA.IMFLIX.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import MSA.IMFLIX.business.abstracts.FilmService;
import MSA.IMFLIX.core.utilities.results.DataResult;
import MSA.IMFLIX.core.utilities.results.Result;
import MSA.IMFLIX.entities.concretes.Film;

@RestController
@RequestMapping("/api/films")
public class FilmController {
	
	private FilmService filmService;
	
	@Autowired
	public FilmController(FilmService filmService) {
		super();
		this.filmService = filmService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Film film) {
		return this.filmService.add(film);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Film>> getAll(){
		return this.filmService.getAll();
	}
	
	@GetMapping("/getByName")
	public DataResult<Film> getByName(@RequestParam String name){
		return this.filmService.getByFilmName(name);
	}
	
	@GetMapping("/getByCategoryId")
	public DataResult<List<Film>> getByCategoryId(@RequestParam int id){
		return this.filmService.getByCategoryIdentity(id);
	}
	
	@GetMapping("/getByNameContains")
	public DataResult<List<Film>> getByNameContains(@RequestParam String name){
		return this.filmService.getByNameContains(name);
	}
	
	@GetMapping("/getByNameStartsWith")
	public DataResult<List<Film>> getByNameStartsWith(@RequestParam String name){
		return this.filmService.getByNameStartsWith(name);
	}
}
