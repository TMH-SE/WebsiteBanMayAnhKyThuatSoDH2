<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <button type="button" id="sidebarCollapse" class="btn btn-info">
            <i class="fas fa-align-left"></i>
        </button>
        <form action="<c:url value='/login' />" method="post" class="form-inline my-2 my-lg-0 justify-content-end">
            <input type="email" name="username" required="required" class="form-control m-2 my-lg-0" placeholder="Enter your email">
            <input type="password" name="password" required="required" class="form-control m-2 my-lg-0" placeholder="Enter your password">
            <button type="submit" class="btn btn-info m-2 my-lg-0">Sign in <i class="fas fa-sign-in-alt"></i></button>
        </form>
    </div>
</nav>