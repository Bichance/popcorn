package spring.mapper.popcorn;

import java.util.List;
import java.util.Map;

import spring.model.payitem.PayItemDTO;

public interface PayItemMapper {
	
	//CREATE
	int create(PayItemDTO dto);
	
	//READ  조회는 주문번호로 카트에 담은 모든 영화를 조회한다. 그러므로 pay_num
	//근데 1개의 주문번호에 여러개의 영화(DTO)가 담길 수 있으니까 얘는 특별히 리스트로 받아줘야한다.
	List<PayItemDTO> read(int pay_num);
	
	//UPDATE 필요없다.
	
	//DELETE 여러개 영화를 담은 주문에서 일부 영화만 삭제하고싶을 때
	int delete(int pay_item_num);
	//DELETE ALL 영화 전체 즉, 주문자체를전부 삭제하고 싶을 때
	int deleteAll(int pay_num);
	
	//LIST
	List<PayItemDTO> list(Map map);
	

}
