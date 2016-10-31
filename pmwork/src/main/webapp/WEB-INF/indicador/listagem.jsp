<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<jsp:include page="../fragments/header.jsp" />
		<main>
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<section class="intro-page">
							<h1 class="heading">Cadastro de indicador de desempenho</h1>
							<p></p>
						</section>
						<form id="filter" class="filter">
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
		<script type="text/javascript" src="${path}/static/js/jquery-2.2.3.min.js"></script>
		<script type="text/javascript" src="${path}/static/js/indicador.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/jquery.mask.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap-select.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/functions.js"></script>
	</body>
</html>