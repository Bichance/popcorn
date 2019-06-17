package spring.mapper.popcorn;

import java.util.List;
import java.util.Map;

import spring.model.payitem.PayItemDTO;

public interface PayItemMapper {
	
	//CREATE
	int create(PayItemDTO dto);
	
	//READ  조회는 주문번호로 카트에 담은 모든 영화를 조회한다. 그러므로 pay_num
	PayItemDTO read(int pay_num);
	
	//UPDATE 필요없다.
	
	//DELETE 여러개 영화를 담은 주문에서 일부 영화만 삭제하고싶을 때
	void delete(int pay_item_num);
	//DELETE ALL 영화 전체 즉, 주문자체를전부 삭제하고 싶을 때
	void deleteAll(int pay_num);
	
	//LIST
	List<PayItemDTO> list(Map map);
	

}
