<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
	<div class="container">
		<div class="row">
			<div class="col-lg-8">
				<h4>Colaboradores cadastrados</h4>
				<table class="table">
					<thead>
						<tr>
							<th>#</th>
							<th>Nome</th>
							<th>Nascimento</th>
							<th>Admissão</th>
							<th>Especialidade</th>
							<th>Cargo</th>
							<th>Email</th>
							<th></th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${colaboradores}" var="colaboradores">
							<tr data-id="${colaboradores.id}">
								<th scope="row">${colaboradores.id}</th>
								<td>${colaboradores.nome}</td>
<%-- 								<td>${colaboradores.dataNascimento.time}</td> --%>
<%-- 								<td>${colaboradores.dataAdmissao.time}</td> --%>
								<td><fmt:formatDate value="${colaboradores.dataNascimento}" pattern="dd/MM/yyyy"/></td>
								<td><fmt:formatDate value="${colaboradores.dataAdmissao}" pattern="dd/MM/yyyy"/></td>
								<td>${colaboradores.especialidade}</td>
								<td>
									<c:forEach items="${colaboradores.regra}" var="cargos">
										${cargos.regra}<br/>
									</c:forEach>
								</td>
								<td>${colaboradores.email}</td>
								<td><button type="button" class="btn-editar"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></button></td>
								<td><button type="button" class="btn-deletar"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></button></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>