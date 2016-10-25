<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
	<div class="container">
		<div class="row">
			<div class="col-lg-8">
				<h4>Tipos de acessos cadastrados</h4>
				<table class="table">
					<thead>
						<tr>
							<th>#</th>
							<th>Tipo de acesso</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${acessos}" var="acessos">
							<tr data-id="${acessos.id}">
								<th scope="row">${acessos.id}</th>
								<td>${acessos.cargo}</td>
								<td><button type="button" class="btn-editar"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></button></td>
								<td><button type="button" class="btn-deletar"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></button></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
		</div>
	</div>