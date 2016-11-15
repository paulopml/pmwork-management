<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="modal fade" id="modal-cad-controle" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel">
	<div class="modal-dialog modal-sm" role="document">
		<div class="modal-cad-acess" >
			<form id="form-controle" method="post">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">Cadastrar controle </h4>
				</div>
				<div class="modal-body">
					<fieldset class="row">
						<div class="col-lg-12 group">
							<label for="cargo">Nome do cargo</label>
							<input id="cargo" name="cargo" class="form-control" placeholder="Nome do cargo">
						</div>
					</fieldset>
					<fieldset class="row">
						<div class="col-lg-12 group">
							<label for="regra">Regra de acesso</label>
							<select id="regra" name="regra" class="form-control">
								<c:forEach items="${regra}" var="regraacesso">
									<option value="${regraacesso}">${regraacesso}</option>
								</c:forEach>											
							</select>
						</div>
					</fieldset>
					<input id="id" name="id" type="hidden">	
					<input type="hidden" id="_csrf" name="_csrf" value="${_csrf.token}">
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
					<button id="btn-salvar" type="button" class="btn btn-primary">Gravar</button>
				</div>
			</form>
		</div>
	</div>
</div>