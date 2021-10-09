package hu.me.iit.webalk.first;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MovieMemoryRepository implements MovieRepository {
    private final List<MovieDto> movies = new ArrayList<>();

    private int findMovieById(Long id) {
        int found = -1;
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getTitle().equals(id)) {
                found = i;
                break;
            }
        }
        return found;
    }

    @Override
    public List<MovieDto> findAll() {
        return movies;
    }

    @Override
    public MovieDto getById(Long id) {
        return null;
    }

    @Override
    public Long save(MovieDto movieDto) {
        int found = findMovieById(movieDto.getId());

        if (found != -1) {
            MovieDto foundMovie = movies.get(found);
            foundMovie.setDirector(movieDto.getDirector());
            foundMovie.setLength(movieDto.getLength());
        } else {
        	movies.add(movieDto);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        int found = findMovieById(id);

        if (found != -1) {
        	movies.remove(found);
        }
    }
}
