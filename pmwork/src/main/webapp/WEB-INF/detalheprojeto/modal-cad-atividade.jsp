<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="modal fade" id="modal-cad-atividade" tabindex="-1" role="dialog" aria-hidden="true">
	<div class="modal-dialog ">
		<div class="modal-content">
			<form id="form-atividade" method="post">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">Criar atividade</h4>
				</div>
				<div class="modal-body">
					<fieldset class="row">				
						<div class="col-sm-4 group">
							<label for="nomeAtividade">Atividade:</label>
							<input id="nomeAtividade" name="nomeAtividade" class="form-control">
						</div>	
						<div class="col-sm-4 group">
							<label for=statusAtividade>Status atividade</label>
							<select id="statusAtividade" name="statusAtividade" class="form-control">
								<c:forEach items="${statusAtividade}" var="status">
									<option value="${status}">${status}</option>
								</c:forEach>											
							</select>
						</div>
						<div class="col-sm-4 group">
							<label for=responsavel>Status atividade</label>
							<select id="responsavel" name="responsavel" class="form-control">
								<c:forEach items="${responsavel}" var="responsavelAt">
									<option value="${responsavelAt.id}">${responsavelAt.nome}</option>
								</c:forEach>											
							</select>
						</div>
						<div class="col-sm-4 group">
							<label for="estimativa">Estimativa:</label>
							<input id="estimativa" name="estimativa" class="form-control">
						</div>		
						<div class="col-sm-4 group">
							<label for="realizado">Realizado:</label>
							<input id="realizado" name="realizado" class="form-control">
						</div>
						<div class="col-sm-4 group">
							<label for="fase">Fase:</label>
							<input id="fase" name="fase" class="form-control">
						</div>
						<div class="col-sm-12 group">
							<label for="descricao">Descrição</label>
							<textarea  class="form-control" rows="3" id="descricao" name="descricao"></textarea>	
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