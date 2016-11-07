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
					<h4 class="modal-title">Criar Fase</h4>
				</div>
				<div class="modal-body">
					<fieldset class="row">				
						<div class="col-sm-4 group">
							<label for="nomeFase">Nome Fase:</label>
							<input id="nomeFase" name="nomeFase" class="form-control">
						</div>		
						<div class="col-sm-4 group">
							<label for="dataInicio">Data início:</label>
							<input id="dataInicio" name="dataInicio" class="form-control">
						</div>
						<div class="col-sm-4 group">
							<label for="dataTermino">Data término:</label>
							<input id="dataTermino" name="dataTermino" class="form-control">
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