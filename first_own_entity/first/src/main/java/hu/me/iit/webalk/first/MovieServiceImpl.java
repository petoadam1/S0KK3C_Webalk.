package hu.me.iit.webalk.first;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class MovieServiceImpl implements MovieService {
    private final int MAXIMUM_MOVIE_COUNT = 10;
    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<MovieDto> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public MovieDto getById(Long id) {
        return movieRepository.getById(id);
    }

    @Override
    public Long save(MovieDto movieDto) {
        if (movieRepository.findAll().size() >= MAXIMUM_MOVIE_COUNT) {
            throw new TooMuchMovieException();
        }
        return movieRepository.save(movieDto);
    }

    @Override
    public void deleteById(Long id) {
    	movieRepository.deleteById(id);
    }
}
