<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
	<div class="container">
		<div class="row">
			<div class="col-lg-8">
				<h4>Projetos cadastrados</h4>
				<table class="table">
					<thead>
						<tr>
							<th>#</th>
							<th>Nome do projeto</th>
							<th>Status</th>
							<th>Risco</th>
							<th>Data início</th>
							<th>Data fim</th>
							<th>Indicador</th>
							<th>Tipo indicador</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${projetos}" var="projetos">
							<tr data-id="${projetos.id}">
								<th scope="row">${projetos.id}</th>
								<td>${projetos.nome}</td>
								<td>
									<c:forEach items="${projetos.status}" var="status">
										${projetos.status}<br/>
									</c:forEach>
								</td>
								<td>
									<c:forEach items="${projetos.classificacaoRisco}" var="classificacaoRisco">
										${projetos.classificacaoRisco}<br/>
									</c:forEach>
								</td>
								<td>${projetos.nomeIndicador}</td>
								<td>${projetos.tipoIndicador}</td>
								<td>${projetos.dataInicio}</td>
								<td>${projetos.dataTermino}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>