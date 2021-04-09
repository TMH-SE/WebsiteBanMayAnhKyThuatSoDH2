<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<article class="col-sm-9">
	<div class="row">
		<c:forEach items="${sanphams}" var="sp">
			<!-- Card -->
			<div class="card col-sm-12 col-md-3 col-lg-4 overflow-hidden">
				<a href="sanpham/${sp.maSanPham }"> <img class="mx-auto pro-img" src="<c:url value='${sp.hinhAnh }' />"
					alt="${sp.tenSanPham}" />
				</a>
				<div class="card-body">
					<a class="pro-name" href="sanpham/${sp.maSanPham }"
						title="${sp.tenSanPham}"> ${sp.tenSanPham} </a> 
						<span class="pro-price"><fmt:formatNumber value="${sp.gia }" type="number" groupingUsed="true" maxFractionDigits="0" />đ</span> 
						<span class="old-price"><fmt:formatNumber value="${sp.gia*1.2 }" type="number" groupingUsed="true" maxFractionDigits="0" />đ</span>
					<div class="mt-3">
						<a href="<c:url value='/them-gio-hang/${sp.maSanPham }' />" class="btn btn-success">Thêm vào giỏ hàng</a>
						<a href="#" class="btn btn-info">Mua ngay</a>
					</div>
				</div>
			</div> 
		</c:forEach>
	</div>
</article>