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
			<nav class="navbar navbar-default">
				<div class="container">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="home.html"><img src="${path}/static/bootstrap/img/logo_on_transparent_254x75.png"  class="logo-home"/></a>
					</div>
					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Projetos <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="cadastrar-projeto.html">Cadastro CTRL + C</a></li>
									<li role="separator" class="divider"></li>
									<li><a href="consultar-projeto.html">Consultar Projetos</a></li>
								</ul>
							</li>
							<li><a href="cadastro-de-indicador.html">Indicadores</a></li>
							<li><a href="relatorio.html">Relatórios</a></li>
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Administrar Sistema <span class="caret"></span></a>
								<ul class="dropdown-menu">
									<li><a href="cadastro-de-colaborador.html">Cadastrar colaborador</a></li>
									<li role="separator" class="divider"></li>
									<li><a href="controlar-acesso.html">Controle de acesso</a></li>
								</ul>
							</li>
						</ul>
						<ul class="nav navbar-nav navbar-right">
							<li><a href="help.html">Help</a></li>
							<li><a href="login.html">Logout</a></li>
						</ul>
					</div>
				</div>
			</nav>
		</header>
		<main>
			<section class="filter">
				<div class="container">
					<div class="row">
						<div class="col-lg-12">
							<section class="intro-page">
								<h1 class="heading">Cadastro de indicador de desempenho</h1>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.</p>
							</section>
							<form id="filter">
								<fieldset class="row">

									<div class="col-lg-12">
										<legend><i class="glyphicon glyphicon-filter" aria-hidden="true"></i>Filtro</legend>
									</div>

									<div class="col-lg-4 group">
										<label for="">Nome do Indicador</label>
										<input type="text" class="form-control" id="" placeholder="Nome do Indicador">
									</div>

									<div class="col-lg-2 group">
										<label for="">Tipo de Indicador</label>
										<select id="tipoIndicador" name="tipoIndicador" class="form-control">
											<c:forEach items="${indicadores}" var="indicadores">
												<option value="${indicadores.tipoIndicador}">${indicadores.tipoIndicador}</option>
											</c:forEach>											
										</select>
									</div>
								</fieldset>

								<div class="text-right">
									<button type="button" class="btn btn-success" data-toggle="modal" data-target="#modal-cad-indicador">Cadastrar</button>						
									<button type="submit" class="btn btn-primary">Filtrar</button>
									<button type="button" class="btn btn-default">Limpar</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</section>
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
			<section id="section-indicador">
				<jsp:include page="tabela-indicador.jsp"/>
			</section>
		</main>
		<jsp:include page="modal-cad-indicador.jsp"/>
		<jsp:include page="modal-del-indicador.jsp"/>
		<script type="text/javascript" src="${path}/static/js/jquery-1.12.4.min.js"></script>
		<script type="text/javascript" src="${path}/static/js/indicador.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/jquery.mask.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap-select.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/functions.js"></script>
	</body>
</html>