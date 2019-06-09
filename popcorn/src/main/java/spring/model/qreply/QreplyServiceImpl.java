package spring.model.qreply;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mapper.popcorn.QreplyMapper;
import spring.model.qna.QnaDTO;
import spring.model.qreply.QreplyDTO;

@Service
public class QreplyServiceImpl implements QreplyService {
	
	
	@Autowired
	private QreplyMapper qrMapper;

	
	//CREATE
	@Override
	public int create(QreplyDTO dto) {		
		
		return qrMapper.create(dto);
	}
	
	//READ
	@Override
	public QreplyDTO read(int qreply_num) {
		QreplyDTO dto = qrMapper.read(qreply_num);
		
		return dto;
	}

	//UPDATE
	@Override
	public int update(QreplyDTO dto) {
		// TODO Auto-generated method stub
		return qrMapper.update(dto);
	}
	
	//DELETE
	@Override
	public int delete(int qreply_num) {
		
		return qrMapper.delete(qreply_num);
	}
	
	//LIST
	@Override
	public List<QreplyDTO> list(Map map) {
		// TODO Auto-generated method stub
		return qrMapper.list(map);
	}
	
	//TOTAL
	@Override
	public int total(int qna_num) {
		
		return qrMapper.total(qna_num);
	}
	
	//REPLY COUNT
	@Override
	public int rcount(int qna_num) {

		return qrMapper.rcount(qna_num);
	}
}
