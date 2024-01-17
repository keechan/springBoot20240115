<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>       
<c:import url="/WEB-INF/frontend/include/top.jsp" /> 
<section>
<br>
<div align="center">
<h2> 로그인 </h2>
<br>
  <form  action=LogintFormOk.do >
    <table border=1>
      <tr><td>이름 </td><td> <input type=text  name="name1"> </td></tr>
      <tr><td>비밀번호 </td><td> <input type=text  name="pwd1">  </td></tr>
      <tr><td colspan=2 align="center">
          <input  type=submit  value="저장하기">
       </td></tr>
    </table> 
  </form>
</div>
<br/>
</section>
<c:import url="/WEB-INF/frontend/include/bottom.jsp" />   