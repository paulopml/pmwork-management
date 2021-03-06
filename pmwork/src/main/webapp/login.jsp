<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="pt-br">
		<head>
			<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
			<meta http-equiv="X-UA-Compatible" content="IE=edge">
			<meta name="viewport" content="width=device-width, initial-scale=1">
			<title>Projeto - login</title>
			<c:set var="path" value="${pageContext.request.contextPath}" scope="request" />
		 	<style type="text/css">
				@IMPORT url("${path}/static/bootstrap/css/bootstrap.min.css");
				@IMPORT url("${path}/static/bootstrap/css/style.css");
			</style>		 	
		</head>
		<body class="pagelogin">
			<main>
				<div class="container">
					<div class="row">
						<div class="wrapper">
							<img src="${path}/static/bootstrap/img/logo_on_transparent_254x75.png" class="logo-login"/>
							<form action="${path}/autenticar" method="post" class="form-signin">
								<c:if test='${not empty param["semacesso"]}'>
									<div class=" alert alert-warning">
										Usuário e/ou senha inválidos!
									</div>
								</c:if>
								<c:if test='${not empty param["saiu"]}'>
									<div class=" alert alert-info">
										Você agora está fora do sistema!
									</div>
								</c:if>
								<h2 class="form-signin-heading">Login</h2>
								<input class="form-control" name="login" placeholder="Login" id="login"  required/>
								<input type="password" class="form-control" name="senha" placeholder="Senha" id="senha" required/>
								<label class="checkbox">
								<input type="checkbox" value="Salvar senha" id="" name=""> Salvar Senha
								</label>
								<button class="btn btn-lg btn-primary btn-block" type="submit" onclick="home.html">Entrar</button>
							
								<input type="hidden" id="_csrf" name="_csrf" value="${_csrf.token}">
							</form>
						</div>
					</div>
				</div>
			</main>
			<script type="text/javascript" src="${path}/static/js/jquery-2.2.3.min.js"></script>
			<script type="text/javascript" src="${path}/static/js/projeto.js"></script>
			<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap.min.js"></script>
			<script type="text/javascript" src="${path}/static/bootstrap/js/jquery.mask.js"></script>
			<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap-select.js"></script>
			<script type="text/javascript" src="${path}/static/bootstrap/js/functions.js"></script>
		</body>
</html>
