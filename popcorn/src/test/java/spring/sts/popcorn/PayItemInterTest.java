package spring.sts.popcorn;

import static org.junit.Assert.*;

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

}
