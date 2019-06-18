package spring.sts.popcorn;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import spring.mapper.popcorn.PayItemMapper;
import spring.model.payitem.PayItemDTO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/root-context.xml"})

public class PayItemInterTest {
	
	private static final Logger logger = LoggerFactory.getLogger(PayItemInterTest.class);
	
	@Autowired
	private PayItemMapper piMapper;

	//CREATE
	@Test
	@Ignore
	public void testCreate() {
		
		PayItemDTO dto = new PayItemDTO();
		
		dto.setPay_num(1);
		dto.setPay_item_num(7);
		dto.setPay_item_price(9900);
		dto.setMovie_num(3213);
		
		assertTrue(piMapper.create(dto)>0);
		
	}
	
	//COMPLETE
	//READ
	@Test
	@Ignore
	public void testRead() {
		//pay_num으로 접근하면 1개 or 여러개의 영화들이 반환되는데 
		//쿼리문이 주는 결과문을 List<PayItemDTO> 타입으로 받기만 하면 된다.
		//그러므로 파라메터는 int, 즉 이건 1 to many, List 는 many to many 다.
		
		List<PayItemDTO> list = piMapper.read(1);
		System.out.println(list);
		
	}
	
	//UPDATE 필요없다
	
	//COMPLETE
	//DELETE
	@Test
	@Ignore
	public void testDelete() {
		int pay_item_num = 14;
		assertTrue(piMapper.delete(pay_item_num)>0);
	}
	
	//COMPLETE
	//LIST
	@Test
	//@Ignore
	public void testList() {
		Map map = new HashMap();
		
		List<PayItemDTO> list = piMapper.list(map);
		System.out.println(list);
	}

}
