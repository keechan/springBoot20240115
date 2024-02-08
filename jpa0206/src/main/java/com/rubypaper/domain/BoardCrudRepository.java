package com.rubypaper.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BoardCrudRepository 
	extends CrudRepository<BoardT, Long>{
	
	//find + 엔티티이름(생략가능) + By + 변수이름(필드명)
	//List<Board> findByTitle(String ch2);
	//List<Board> findByPay(String ch2);
	//List<Board> findByTitleContainingOrderBySeqDesc(String str);
//	List<Board> findByTitleContainingOrWriterOrderBySeqDesc(String str1, String str2);	
	//List<Board> findByTitleLike(String ch2);
//	List<Board> findByAgeBetweenOrderBySeqDesc(int i, int j);
	
	
	  //  seq, title , age	 , BoardT : 엔티티 명
	  //  seq, title , age	 , BoardT : 엔티티 명
	  @Query("SELECT b  FROM BoardT b WHERE b.title like %?1%  ORDER BY  b.seq DESC ")	
	  List<BoardT> queryAnnotationTest1(String str);
	  //
	  @Query("SELECT b  FROM BoardT b "
	  		+ " WHERE b.title like %:strVal%  ORDER BY  b.seq DESC ")	
	  List<BoardT> queryAnnotationTest2(@Param("strVal") String str);
	  //
	  @Query("SELECT b.seq, b.title  FROM BoardT b "
		  		+ " WHERE b.title like %:strVal%  ORDER BY  b.seq DESC ")	
	  List<Object[]> queryAnnotationTest3(@Param("strVal") String str);
	  //
	  @Query(value="SELECT seq, title  FROM  T0207 "
		  		+ " WHERE title like '%'|| ?1 ||'%'  ORDER BY  seq DESC " ,
		  		nativeQuery=true )	
	  List<Object[]> queryAnnotationTest4(@Param("strVal") String str);
	  //
	  @Query(value="SELECT *  FROM  T0207 "
		  		+ " WHERE title like '%'|| ?1 ||'%'  ORDER BY  seq DESC " ,
		  		nativeQuery=true )	
	  List<BoardT> queryAnnotationTest5(@Param("strVal") String str);
}
