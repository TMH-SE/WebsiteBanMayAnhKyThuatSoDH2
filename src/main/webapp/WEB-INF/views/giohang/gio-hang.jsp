<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="tong" scope="session" value="0.0" />
<article class="col-9">
	<div class="shadow-sm p-3 mx-3 mb-3 bg-white rounded"><h5>Giỏ hàng hiện tại có ${cartNums } sản phẩm</h5></div>
	<table class="table table-bordered">
	  <thead>
	    <tr>
	      <th scope="col">Tên sản phẩm</th>
	      <th scope="col">Số lượng</th>
	      <th scope="col">Tổng tiền</th>
	      <th scope="col"></th>
	    </tr>
	  </thead>
	  <tbody>
	    <c:forEach items="${gioHang.chiTietGioHangs }" var="ct" >
	    	<c:set var="tong" scope="session" value="${ct.tongTien + tong }" />
	    	<tr>
		      <td scope="row">${ct.sanPham.tenSanPham }</td>
		      <td>
		      	<form id="quantity_form" method="post" action="<c:url value='/cap-nhat-gio-hang/${ct.sanPham.maSanPham }' />">
		      		<input onchange="changeQuantity()" type="number" name="quantity_update" min=0 max=5 value="${ct.soLuong }" tabindex="-1" />
		      	</form>
		      </td>
		      <td><fmt:formatNumber value="${ct.tongTien }" type="number" groupingUsed="true" maxFractionDigits="0" /> VND</td>
		      <td>
		      	<a href="#" class="btn btn-info"><i class="fas fa-edit"></i></a>
		      	<a href="#" class="btn btn-danger"><i class="fas fa-trash-alt"></i></a>
		      </td>
		    </tr>
	    </c:forEach>
	    <tr>
	    	<td class="text-rigth" colspan="3">Tổng tiền</td>
	    	<td><fmt:formatNumber value="${tong }" type="number" groupingUsed="true" maxFractionDigits="0" /> VND</td>
	    </tr>
	  </tbody>
	</table>
</article>