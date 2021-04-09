<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<header class="sticky-top">
	<div class="contact">
		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link" href="#"><i
					class="fab fa-facebook-square"></i></a></li>
			<li class="nav-item"><a class="nav-link" href="#"><i
					class="fab fa-twitter-square"></i></a></li>
			<li class="nav-item"><a class="nav-link" href="#"><i
					class="fab fa-linkedin"></i></a></li>
			<li class="nav-item"><a class="nav-link" href="#"
				style="font-size: 18px;">Sign in <i
					class="fas fa-sign-in-alt"></i></a></li>
		</ul>
	</div>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="<c:url value='/' />"> <img
			src="<c:url value='/static/images/logo.svg' />" alt="logo"
			width="180px" height="80px" />
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link"
					href="<c:url value='/' />">Trang chủ <span class="sr-only">(current)</span></a>
				</li>
				<li class="nav-item dropdown">
					<div class="nav-link">
						<a href="<c:url value='/danh-sach-san-pham' />">Sản phẩm</a> 
						<span
							class="dropdown-toggle" id="navbarDropdown" role="button"
							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
						</span>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							<a class="dropdown-item" href="#">Máy ảnh Canon</a> 
							<a class="dropdown-item" href="#">Máy ảnh Nikon</a> 
							<a class="dropdown-item" href="#">Máy ảnh Sony</a> 
							<a class="dropdown-item" href="#">Máy ảnh Fujifilm</a> 
							<a class="dropdown-item" href="#">Ống kính và phụ kiện máy ảnh</a>
						</div>
					</div>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Khuyến
						mãi</a></li>
				<li class="nav-item"><a class="nav-link"
					href="<c:url value='/chinhsachbaohanh' />">Chính sách bảo hành</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#">Tin tức</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Liên hệ</a></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search" />
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">
					Search</button>
			</form>
			<div class="cart">
				<a href="<c:url value='/gio-hang' />"> <span class="fas fa-shopping-cart cart-icon"></span>
					<span class="cart-num" style="display: ${cartNums > 0 ? 'block' : 'none'};">${cartNums > 4 ? '5+' : cartNums }</span>
				</a>
			</div>
		</div>
	</nav>
</header>