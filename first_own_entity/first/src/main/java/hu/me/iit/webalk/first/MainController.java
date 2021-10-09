package hu.me.iit.webalk.first;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path="movie")
public class MainController {

	private final MovieService movieService;

	public MainController(MovieService movieService) {
		this.movieService = movieService;
	}

	@GetMapping(path="", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<MovieDto> allMovies() {
		return movieService.findAll();
	}

	@PostMapping(path="")
	public void newMovie(@RequestBody @Valid MovieDto movieDto) {
		movieService.save(movieDto);
	}

	@PutMapping(path="/")
	public void replaceMovie(@RequestBody @Valid MovieDto movieDto) {
		movieService.save(movieDto);
	}

	@DeleteMapping (path="/{id}")
	public void deleteArticle(@PathVariable("id") Long id) {
		movieService.deleteById(id);
	}

}
