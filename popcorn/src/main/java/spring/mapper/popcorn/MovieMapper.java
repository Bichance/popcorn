package spring.mapper.popcorn;

import spring.model.movie.MovieDTO;

public interface MovieMapper {
	//CREATE
	boolean create(MovieDTO dto);
}
