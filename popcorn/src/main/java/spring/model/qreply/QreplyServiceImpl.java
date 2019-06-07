package spring.model.qreply;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.mapper.popcorn.QreplyMapper;
import spring.model.qreply.QreplyDTO;

@Service
public class QreplyServiceImpl implements QreplyService {
	
	
	@Autowired
	private QreplyMapper qrMapper;

	@Override
	public int create(QreplyDTO dto) {		
		
		return qrMapper.create(dto);
	}

	@Override
	public int rcount(int qna_num) {

		return qrMapper.rcount(qna_num);
	}


}
