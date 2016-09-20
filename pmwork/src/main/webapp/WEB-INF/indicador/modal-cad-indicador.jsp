<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="modal fade" id="modal-cad-indicador" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			<form method="post">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">Cadastrar indicador</h4>
				</div>
				<div class="modal-body">
					<label for="nomeIndicador">Nome:</label>
					<input id="nomeIndicador" name="nomeIndicador" class="form-control">
					
					<label for=tipoIndicador>Tipo indicador:</label>
					<select id="tipoIndicador" name="tipoIndicador" class="form-control">
						<c:forEach items="${indicadores}" var="indicadores">
							<option value="${indicadores.tipoIndicador}">${indicadores.tipoIndicador}</option>
						</c:forEach>											
					</select>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
					<button type="submit" class="btn btn-primary">Gravar</button>
				</div>
			</form>
		</div>
	</div>
</div>