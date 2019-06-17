package spring.model.cart;

import java.util.List;
import java.util.Map;

public interface CartService {

	//CREATE
	boolean create(CartDTO dto);
	
	//READ
	CartDTO read(int cart_num);
	
	//DELETE
	int delete(int movie_num) throws Exception;
	
	//LIST
	List<CartDTO> list(Map map);
	
}
