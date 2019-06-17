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

import spring.mapper.popcorn.CartMapper;
import spring.model.cart.CartDTO;
import spring.model.qreply.QreplyDTO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/webapp/WEB-INF/spring/root-context.xml"})

public class CartInterTest {
	
	private static final Logger logger = LoggerFactory.getLogger(CartInterTest.class);

	@Autowired
	private CartMapper cMapper;
	
	//COMPLETE
	//CREATE
	@Test
	@Ignore
	public void testCreate() {
		CartDTO dto = new CartDTO();
		
		//dto.setQna_num(6);
		//dto.setQna_title("테스트");
		//dto.setQna_content("내용");
		//dto.setQna_date("sysdate");
		//dto.setQna_type("테슷");
		//dto.setQna_pw("1234");
		//dto.setQna_grpno(6);
		//dto.setId("user1");
		dto.setCart_num(7);
		dto.setMovie_price(15800);
		dto.setId("user1");
		dto.setMovie_num(3213);
		
		assertTrue(cMapper.create(dto)>0);
	}
	
	//COMPLETE
	//READ
	@Test
	@Ignore
	public void testRead() {
		CartDTO dto = cMapper.read(2);
		logger.info("dto: "+dto);
	}
	
	//DELETE
	@Test
	@Ignore
	public void testDelete() {
		int movie_num = 3213;
		//assertTrue(cMapper.delete(movie_num)>0);
		assertTrue(cMapper.delete(movie_num)>0);
	}
	
	//COMPLETE
	//LIST
	@Test
	@Ignore
	public void testList() {
		Map map = new HashMap();
		
		List<CartDTO> list = cMapper.list(map);
		System.out.println(list);

	}

}
