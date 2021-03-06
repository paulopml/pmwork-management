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
						<section>
							<h3 class="heading">Detalhe do projeto</h3>
						</section>
						<form id="filter">
							<div class="col-lg-10 group panel panel-default">
								<fieldset class="row pn-detalhe">
									<div class="col-lg-5 group">
										<label for="">Nome do Projeto</label>
										<input type="text" class="form-control" id="nome" disabled value="Teste">
									</div>
				
				
									<div class="col-lg-2 group">
										<label for="">Data de início</label>
										<input type="text" class="form-control" id="dataInicio" disabled>
									</div>
				
									<div class="col-lg-2 group">
										<label for="">Data de término</label>
										<input type="text" class="form-control" id="dataTermino" disabled>
									</div>
				
									<div class="col-lg-3 group">
										<label for="">Status</label>
										<input type="text" class="form-control" id="status" disabled>
									</div>
									
									<div class="col-lg-2 group">
										<label for="">Risco</label>
										<input type="text" class="form-control" id="classificacaoRisco" disabled>
									</div>
									
									<div class="col-lg-4 group">
										<label for="">Gerente do projeto</label>
										<input type="text" class="form-control" id="gerenteProjeto" disabled>	
									</div>
									
								</fieldset>
							</div>
							<div class="col-lg-2">
								<fieldset class="row">
									<div class="text-right">
										<button type="button" class="btn btn-success" data-toggle="modal" data-target="#modal-cad-atividade">Criar atividade</button>						
										<button type="button" class="btn btn-success btn-fase" data-toggle="modal" data-target="#modal-cad-fase">Criar fase</button>						
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
 				<jsp:include page="tabela-atividade.jsp"/>
			</section>
	</main>
		<jsp:include page="modal-cad-atividade.jsp"/>
		<jsp:include page="../fase/modal-cad-fase.jsp"/>
		<script type="text/javascript" src="${path}/static/js/jquery-2.2.3.min.js"></script>
		<script type="text/javascript" src="${path}/static/js/projeto.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/jquery.mask.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap-select.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/functions.js"></script>
	</body>
</html>