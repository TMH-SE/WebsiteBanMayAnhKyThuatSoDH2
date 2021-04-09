<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <link rel="stylesheet" href="<c:url value='/static/css/main.css' />" />
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    />
    <link
      rel="stylesheet"
      href="https://use.fontawesome.com/releases/v5.8.1/css/all.css"
    />
    <title>DH2 Digital</title>
  </head>
  <body>
  	<div class="container-fluid px-0">
	  	<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="carousel" />
		<!-- Body -->
	  	<section class="row mt-4">
	  		<tiles:insertAttribute name="body" />
	  		<tiles:insertAttribute name="aside" />
	  	</section>
	  	<tiles:insertAttribute name="footer" />
  	</div>
  	<!-- Javascript -->
  	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <script src="https://sp.zalo.me/plugins/sdk.js"></script>
    <script src="<c:url value='/static/js/main.js' />" type="text/javascript"></script>
  </body>
</html>