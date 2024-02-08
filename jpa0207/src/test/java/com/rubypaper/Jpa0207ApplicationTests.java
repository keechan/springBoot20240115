package com.rubypaper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.querydsl.core.BooleanBuilder;
import com.rubypaper.domain.BoardCrudRepository;
import com.rubypaper.domain.BoardT;
import com.rubypaper.domain.QBoardT;

@SpringBootTest
class Jpa0207ApplicationTests {

	@Autowired
	private BoardCrudRepository  boardCrudRepo;
	
	// seq, title, age
	@Test
	void contextLoads() {
	      String ch1="title" ;
	      String ch2="연습3" ;
	      
	      BooleanBuilder builder = new BooleanBuilder();
	      QBoardT  qboard = QBoardT.boardT;
		  
	      if(ch1.equals("title") ) {
	    	  builder.and(qboard.title.like("%" +ch2 + "%")); 
	      }else if(ch1.equals("age")) {
	       	  builder.and(qboard.age.like("%" +ch2 + "%"));  
	      }
	            
	    List<BoardT>  li = (List<BoardT>) boardCrudRepo.findAll(builder);
	    for(BoardT m:li) {
	      System.out.println("==>" + m);
	    }
	}
}
