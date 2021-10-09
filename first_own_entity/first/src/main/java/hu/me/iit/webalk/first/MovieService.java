package hu.me.iit.webalk.first;

import java.util.List;

public interface MovieService {
    List<MovieDto> findAll();
    MovieDto getById(Long id);
    Long save(MovieDto articleDto);
    void deleteById(Long id);
}
