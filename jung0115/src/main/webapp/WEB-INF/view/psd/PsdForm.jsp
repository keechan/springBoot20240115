<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>       
<c:import url="/WEB-INF/view/include/top.jsp" /> 
<section>
<br>
<div align="center">
<h2> 게시판 글등록 </h2>
<br>
  <form  action=PsdFormOK.do  method=post  enctype="multipart/form-data" >
    <table border=1>
     
      <tr><td>제목 </td><td> <input type=text  name="title"> </td></tr>
      <tr><td>사진 </td><td> <input type=file  name="file">  </td></tr>
       <tr><td colspan=2 align="center">
          <input  type=submit  value="저장하기">
       </td></tr>
    
    </table> 
     
     

  
  </form>
</div>
<br/>
</section>
<c:import url="/WEB-INF/view/include/bottom.jsp" />   