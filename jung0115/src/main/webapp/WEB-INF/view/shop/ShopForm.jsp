<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>       
<c:import url="/WEB-INF/view/include/top.jsp" /> 
<section>
<br>
<div align="center">
<h2> 상품등록하기 글등록 </h2>
<br>
  <!-- 상품번호, 상품이름, 상품가격, 상품상세설명, 상품사진등록  -->
  <form  action=ShopFormOK.do  method=post 
                               enctype="multipart/form-data" >
    <table border=1>
     <tr><td>상품번호 </td><td> <input type=text  name="productId" value="${seq}"  readonly> </td></tr>
     <tr><td>상품이름 </td><td> <input type=text  name="productName"> </td></tr>
     <tr><td>상품가격 </td><td> <input type=text  name="productPrice"> </td></tr>
     <tr><td>상세설명 </td><td> <textarea cols=50 rows=5 name=productDesc></textarea> </td></tr>
      <tr><td>상품사진 </td><td> <input type=file  name="productFile">  </td></tr>
       <tr><td colspan=2 align="center">
          <input  type=submit  value="상품등록">
       </td></tr>
    
    </table>  
  </form>
</div>
<br/>
</section>
<c:import url="/WEB-INF/view/include/bottom.jsp" />   