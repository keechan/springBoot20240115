package com.rubypaper.project.psd;

import java.util.List;

public interface PsdService {
	   List<PsdVO> psdList();

	   void psdInsert(PsdVO vo);
	   void psdDelete(PsdVO vo);
	   PsdVO getPsd(PsdVO vo);
}
