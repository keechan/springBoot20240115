package com.rubypaper.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BoardCrudRepository 
	extends CrudRepository<Board, Long>{
	
	//find + 엔티티이름(생략가능) + By + 변수이름(필드명)
	//List<Board> findByTitle(String ch2);
	//List<Board> findByPay(String ch2);
	List<Board> findByTitleContainingOrderBySeqDesc(String str);
	List<Board> findByTitleContainingOrWriterOrderBySeqDesc(String str1, String str2);	
	//List<Board> findByTitleLike(String ch2);
	List<Board> findByAgeBetweenOrderBySeqDesc(int i, int j);
}
