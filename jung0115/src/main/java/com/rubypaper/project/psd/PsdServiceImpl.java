package com.rubypaper.project.psd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PsdServiceImpl implements PsdService {

	@Autowired
	private PsdDao  dao;
	
	@Override
	public List<PsdVO> psdList() {
		// TODO Auto-generated method stub
		return dao.psdList();
	}

	@Override
	public void psdInsert(PsdVO vo) {
		dao.psdInsert(vo);		
	}

	@Override
	public void psdDelete(PsdVO vo) {
		dao.psdDelete(vo);
	}

	@Override
	public PsdVO getPsd(PsdVO vo) {
		return dao.getPsd(vo);
	}

}
