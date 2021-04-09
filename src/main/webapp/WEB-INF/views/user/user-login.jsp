<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<article class="col-sm-12">
  <div class="login-form shadow p-3 mt-2 bg-white rounded mx-auto ">
    <h2>Đăng nhập ngay!</h2>
    <form action="/loginuser" method="post">
      <div class="form-group">
        <label for="email">Email</label>
        <input name="username" type="email" class="form-control" id="email" placeholder="Vui lòng nhập email của bạn" required="required" />
      </div>
      <div class="form-group">
        <label for="password">Mật khẩu</label>
        <input name="password" type="password" class="form-control" id="password" placeholder="Vui lòng nhập mật khẩu của bạn" required="required" />
      </div>
      <button type="submit" class="btn btn-primary">Đăng nhập</button>
      <button type="submit" class="btn btn-primary">Đăng ký</button>
    </form>
  </div>
</article>