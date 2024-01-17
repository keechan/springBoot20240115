<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jstl/core_rt"  prefix="c" %>       
<c:import url="/WEB-INF/view/include/top.jsp" /> 
<section>
<br>
<div align="center">
<h2> 상품 상세 보기  </h2>
<br>
  <!-- 상품번호, 상품이름, 상품가격, 상품상세설명, 상품사진등록  -->
  <form  action=ShoppingOK.do >
    <table border=1>
     <tr><td>상품번호 </td><td> <input type=text  name="productId" value="${m.productId}"  readonly> </td>
     <td rowspan=3><img src="/shop/img/${m.productImg}"  >  </td>
     </tr>
     <tr><td>상품이름 </td><td > <input type=text  name="productName" value="${m.productName}" readonly> </td></tr>
     <tr><td>상품가격 </td><td > <input type=text  name="productPrice" value="${m.productPrice}" readonly> </td></tr>
     <tr><td>상세설명 </td><td colspan=2> <textarea cols=50 rows=5 name=productDesc >${m.productDesc}</textarea> </td></tr>
     <tr><td>구매개수 </td><td colspan=2> <input  type=text  name=amount >  </td></tr>
 
       <tr><td colspan=3 align="center" >
          <input  type=submit  value="상품구매">
       </td></tr>
    
    </table>  
  </form>
</div>
<br/>
</section>
<c:import url="/WEB-INF/view/include/bottom.jsp" />   