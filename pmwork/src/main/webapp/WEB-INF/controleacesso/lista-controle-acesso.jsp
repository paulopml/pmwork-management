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
			<title>${titulo}</title>
			<c:set var="path" value="${pageContext.request.contextPath}" scope="request" />
		 	<style type="text/css">
				@IMPORT url("${path}/static/bootstrap/css/bootstrap.min.css");
				@IMPORT url("${path}/static/bootstrap/css/style.css");
			</style>		 	
		</head>
		<body>
			<header>
				<div class="container">
					<h5>
						<a href="home.html"><img src="${path}/static/bootstrap/img/logo_on_transparent_254x75.png"  class="logo-home"/></a>
							Gerenciamento de Projetos
					</h5>
					<div class="masthead" id="bs-example-navbar-collapse-1">
						<ul class="nav nav-justified">
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Projetos <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="/pmwork/app/cadastrarprojeto">Cadastro CTRL + C</a></li>
									<li role="separator" class="divider"></li>
									<li><a href="/pmwork/app/consultarprojeto">Consultar Projetos</a></li>
								</ul>
							</li>
							<li><a href="/pmwork/app/indicador">Indicadores</a></li>
							<li><a href="/pmwork/app/relatorio">Relatórios</a></li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Administrar Sistema <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="/pmwork/app/cadastrocolaborador">Cadastrar colaborador</a></li>
									<li role="separator" class="divider"></li>
									<li><a href="/pmwork/app/controleacesso">Controle de acesso</a></li>
								</ul>
							</li>
							<li><a href="help.html">Help</a></li>
							<li><a href="login.html"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
						</ul>
					</div>
				</div>
		</header>
		<main>
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<section class="intro-page">
							<h1 class="heading">Controle de acesso</h1>
							<p></p>
						</section>
						<form id="filter">
							<div class="text-right">
								<button type="button" class="btn btn-success" data-toggle="modal" data-target="#modal-cad-controle">Cadastrar</button>						
							</div>
						</form>
					</div>
				</div>
			</div>
			<c:if test="${not empty mensagemErro}">
				<div class="container">
					<div class="alert alert-danger">${mensagemErro}</div>
				</div>
			</c:if>
			<c:if test="${not empty mensagemInfo}">
				<div class="container">
					<div class="alert alert-info">${mensagemInfo}</div>
				</div>
			</c:if>
			<section id="section-controle">
				<jsp:include page="tabela-controle.jsp"/>
			</section>
		</main>
		<jsp:include page="modal-cad-controle.jsp"/>
		<script type="text/javascript" src="${path}/static/js/jquery-1.12.4.min.js"></script>
		<script type="text/javascript" src="${path}/static/js/acesso.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/jquery.mask.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap-select.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/functions.js"></script>
	</body>
</html>