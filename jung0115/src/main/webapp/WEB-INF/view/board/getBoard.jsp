<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>       
<c:import url="/WEB-INF/view/include/top.jsp" /> 
<section>
<br>
<div align="center">
<h2> 게시판 글등록 </h2>
<br>
  <form  action=BoardUpdate.do >
  
    <table border=1>
      <tr><td>번호 </td><td> <input type=text  name="seq" value="${m.seq}" readonly> </td></tr>
      <tr><td>제목 </td><td> <input type=text  name="title" value="${m.title}" > </td></tr>
      <tr><td>작성자 </td><td> <input type=text  name="writer"  value="${m.writer}" >  </td></tr>
      <tr><td>글내용 </td><td> <textarea cols=50  rows=5  name="content">${m.content}</textarea>  </td></tr>
      <tr><td colspan=2 align="center">
          <input  type=submit  value="수정하기">
       </td></tr>
    
    </table> 
     
     

  
  </form>
</div>
<br/>
</section>
<c:import url="/WEB-INF/view/include/bottom.jsp" />   