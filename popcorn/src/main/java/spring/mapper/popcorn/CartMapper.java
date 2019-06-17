package spring.mapper.popcorn;

import java.util.List;
import java.util.Map;

import spring.model.cart.CartDTO;

public interface CartMapper {
	
	//CREATE
	int create(CartDTO dto);
	
	//READ
	CartDTO read(int cart_num);
	
	//UPDATE
	
	//DELETE
	int delete(int movie_num);
	
	//LIST
	List<CartDTO> list(Map map);
	
}
