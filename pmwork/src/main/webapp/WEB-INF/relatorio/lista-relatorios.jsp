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
							<h3 class="heading">Relatório</h3>
							<p></p>
						</section>
						<form id="filter" class="panel panel-default pnl-filter">
							<fieldset class="row">
			
								<div class="col-lg-12">
									<legend><i class="glyphicon glyphicon-filter" aria-hidden="true"></i>Filtro</legend>
								</div>
			
								<div class="col-lg-5 group">
									<label for="">Projeto</label>
									<select id="nome" name="nome" class="form-control">
										<c:forEach items="${nome}" var="nomepj">
											<option value="${nomepj}">${nomepj}</option>
										</c:forEach>											
									</select>
								</div>
								
								<div class="col-lg-3 group">
									<label for="">Status</label>
									<select id="status" name="status" class="form-control">
										<c:forEach items="${status}" var="statuspj">
											<option value="${statuspj}">${statuspj}</option>
										</c:forEach>											
									</select>
								</div>
								<div class="col-lg-3 group">
									<label for="">Risco</label>
									<select id="classificacaoRisco" name="classificacaoRisco" class="form-control">
										<c:forEach items="${classificacaoRisco}" var="risco">
											<option value="${risco}">${risco}</option>
										</c:forEach>											
									</select>
								</div>	
												
								<div class="col-lg-2 group">
									<label for="">Data início</label>
									<input type="date" class="form-control" id="" placeholder="dd/mm/aaaa">
								</div>
			
								<div class="col-lg-2 group">
									<label for="">Data fim</label>
									<input type="date" class="form-control" id="" placeholder="dd/mm/aaaa">
								</div>
								<div class="col-lg-3 group">
									<label for="">Indicador</label>
									<select id="tipoIndicador" name="tipoIndicador" class="form-control">
										<c:forEach items="${indicadores}" var="indicadores">
											<option value="${indicadores.nomeIndicador}">${indicadores.nomeIndicador}</option>
										</c:forEach>											
									</select>
								</div>
								<div class="col-lg-3 group">
									<label for="">Tipo de Indicador</label>
									<select id="tipoIndicador" name="tipoIndicador" class="form-control">
										<c:forEach items="${indicadores}" var="indicadores">
											<option value="${indicadores.tipoIndicador}">${indicadores.tipoIndicador}</option>
										</c:forEach>											
									</select>
								</div>			
							</fieldset>
			
							<div class="text-right">
								<input type="button" id="btnExport" class="btn btn-default ico-excel" value="Exportar para o Excel">
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
			<section id="section-relatorio">
				<jsp:include page="tabela-relatorio.jsp"/>
			</section>
	</main>
		<script type="text/javascript" src="${path}/static/js/jquery-2.2.3.min.js"></script>
		<script type="text/javascript" src="${path}/static/js/jquery.maskMoney.js"></script>
		<script type="text/javascript" src="${path}/static/js/relatorio.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/jquery.mask.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap-select.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/functions.js"></script>
	</body>
</html>