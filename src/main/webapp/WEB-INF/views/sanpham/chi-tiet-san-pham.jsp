<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<article class="col-sm-9">
<div class="pro-info mx-3">
  <div class="card pro-orginal">
    <div class="card-header">
      <h3>Tổng quan</h3>
    </div>
    <div class="card-body row">
      <div class="col-3 pro-info-img d-flex align-items-center border-right">
        <img src="<c:url value='${sanpham.hinhAnh }' />" alt="" />
      </div>
      <div class="col-9 pro-info-content">
        <h1>${sanpham.tenSanPham }</h1>
        <pre>${sanpham.tinhNang }</pre>
            <hr />
            <ul>
            	<li>
            		Mã sản phẩm: ${sanpham.maSanPham }
            	</li>
            	<li>
            		Giá bán: <b class="pro-price"><fmt:formatNumber value="${sanpham.gia }" type="number" groupingUsed="true" maxFractionDigits="0" /> VND</b> 
            	</li>
            	<li>
            		Bảo hành: ${sanpham.thoiGianBaoHanh } tháng
            	</li>
            	<li>
            		Xuất xứ: ${sanpham.noiSanXuat }
            	</li>
            	<li>
            		Tình trạng: ${sanpham.trangThai == true ? "Còn hàng" : "Hết hàng" }
            	</li>
            </ul>
        <div class="pro-action">
          <button class="btn btn-primary">Thêm vào giỏ hàng</button>
          <button class="btn btn-success">Mua ngay</button>
        </div>
      </div>
    </div>
  </div>

  <div class="pro-description card">
    <div class="card-header">
      <h3>Mô tả sản phẩm</h3>
    </div>
    <div class="card-body">
      <h2 class="text-center">${sanpham.tenSanPham }</h2>
      <img class="mx-auto" src="<c:url value='${sanpham.hinhAnh }' />" alt="" />
      <p>${sanpham.moTa }</p>
    </div>
  </div>
</div>
</article>

