package MSA.IMFLIX.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MSA.IMFLIX.business.abstracts.FilmCommentService;
import MSA.IMFLIX.core.utilities.results.DataResult;
import MSA.IMFLIX.core.utilities.results.Result;
import MSA.IMFLIX.entities.concretes.FilmComment;

@RestController
@RequestMapping("/api/filmcomment")
public class FilmCommentController {
	
	private FilmCommentService filmCommentService;
	
	@Autowired
	public FilmCommentController(FilmCommentService filmCommentService) {
		super();
		this.filmCommentService = filmCommentService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody FilmComment filmComment) {
		return this.filmCommentService.add(filmComment);
	}
	
	@GetMapping("/getall")
	public DataResult<List<FilmComment>> getAll(){
		return this.filmCommentService.getAll();
	}
}
