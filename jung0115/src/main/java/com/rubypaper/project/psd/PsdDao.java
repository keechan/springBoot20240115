package com.rubypaper.project.psd;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PsdDao {
   List<PsdVO> psdList();
   void psdInsert(PsdVO vo);
   void psdDelete(PsdVO vo);
   PsdVO getPsd(PsdVO vo);
}
