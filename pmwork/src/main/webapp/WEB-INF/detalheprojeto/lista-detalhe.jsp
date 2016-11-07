<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<fmt:setLocale value="pt_BR"/>
<jsp:include page="../fragments/header.jsp" />
		<main>
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<section class="intro-page">
							<h3 class="heading">Projeto xxx</h3>
						</section>
						<form id="filter" class="filter">
							<div class="col-lg-10">
								<fieldset class="row">
				
									<div class="col-lg-12">
										<legend><i class="glyphicon glyphicon-filter" aria-hidden="true"></i>Filtro</legend>
									</div>
				
									<div class="col-lg-5 group">
										<label for="">Nome do Projeto</label>
										<input type="hidden" class="form-control" id="nome">
									</div>
				
				
									<div class="col-lg-2 group">
										<label for="">Data de início</label>
										<input type="hidden" class="form-control" id="dataInicio">
									</div>
				
									<div class="col-lg-2 group">
										<label for="">Data de término</label>
										<input type="hidden" class="form-control" id="dataTermino">
									</div>
				
									<div class="col-lg-3 group">
										<label for="">Status</label>
										<input type="hidden" class="form-control" id="status">
									</div>
									
									<div class="col-lg-2 group">
										<label for="">Risco</label>
										<input type="hidden" class="form-control" id="classificacaoRisco">
									</div>
									
									<div class="col-lg-4 group">
										<label for="">Gerente do projeto</label>
										<input type="hidden" class="form-control" id="gerenteProjeto">	
									</div>
									
								</fieldset>
							</div>
							<div class="col-lg-2">
								<fieldset class="row">
									<div class="text-right">
										<button type="button" class="btn btn-success" data-toggle="modal" data-target="#modal-cad-atividade">Criar atividade</button>						
										<button type="button" class="btn btn-success" data-toggle="modal" data-target="#modal-cad-atividade">Criar fase</button>						
									</div>
								</fieldset>
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
			<section id="section-detalhe">
<%-- 				<jsp:include page="tabela-colaborador.jsp"/> --%>
			</section>
	</main>
		<jsp:include page="modal-cad-atividade.jsp"/>
		<jsp:include page="modal-cad-fase.jsp"/>
		<script type="text/javascript" src="${path}/static/js/jquery-2.2.3.min.js"></script>
		<script type="text/javascript" src="${path}/static/js/projeto.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/jquery.mask.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap-select.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/functions.js"></script>
	</body>
</html>