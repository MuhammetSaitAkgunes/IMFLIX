package MSA.IMFLIX.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MSA.IMFLIX.business.abstracts.SerieCommentService;
import MSA.IMFLIX.core.utilities.results.DataResult;
import MSA.IMFLIX.core.utilities.results.Result;

import MSA.IMFLIX.entities.concretes.SerieComment;

@RestController
@RequestMapping("/api/seriecomment")
public class SerieCommentController {
	private SerieCommentService serieCommentService;
	
	@Autowired
	public SerieCommentController(SerieCommentService serieCommentService) {
		super();
		this.serieCommentService = serieCommentService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody SerieComment serieComment) {
		return this.serieCommentService.add(serieComment);
	}
	
	@GetMapping("/getall")
	public DataResult<List<SerieComment>> getAll(){
		return this.serieCommentService.getAll();
	}
}
