<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="modal fade" id="modal-cad-controle" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-lg">
		<div class="modal-content">
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
						<div class="col-lg-4 group">
							<label for="cargo">Nome do cargo</label>
							<input id="cargo" name="cargo" class="form-control" placeholder="Nome do cargo">
						</div>
					</fieldset>
					<fieldset class="row">
						<div class="col-lg-3 group permission-column">
							<label class="checkbox-inline check-10"><input type="checkbox" name="incluirProjetos">Incluir Projetos</label>
							<label class="checkbox-inline"><input type="checkbox" name="excluirProjetos">Excluir Projetos</label>
							<label class="checkbox-inline"><input type="checkbox" name="editarProjetos">Editar Projetos</label>
							<label class="checkbox-inline"><input type="checkbox" name="visualizarProjetos">Visualizar Projetos</label>
						</div>
						<div class="col-lg-3 group permission-column">
							<label class="checkbox-inline check-10"><input type="checkbox" name="manterEquipe">Manter equipe</label>
							<label class="checkbox-inline"><input type="checkbox" name="cadastrarIndicador">Cadastrar Indicadores</label>
							<label class="checkbox-inline"><input type="checkbox" name="associarIndicador">Associar Indicadores</label>
							<label class="checkbox-inline"><input type="checkbox" name="manterColaborador">Manter colaboradores</label>
						</div>
						<div class="col-lg-3 group permission-column">
							<label class="checkbox-inline check-10"><input type="checkbox" name="gerarRelatorios">Gerar relatórios</label>
							<label class="checkbox-inline"><input type="checkbox" name="controlarAcesso">Controle de acesso</label>
							<label class="checkbox-inline"><input type="checkbox" name="classificarRisco">Classificar risco</label>
							<label class="checkbox-inline"><input type="checkbox" name="incluirFase">Incluir fase</label>
						</div>
						<div class="col-lg-3 group permission-column">
							<label class="checkbox-inline check-10"><input type="checkbox" name="manterStatus">Manter status</label>
							<label class="checkbox-inline"><input type="checkbox" name="manterAtividade">Manter atividades</label>
						</div>
					</fieldset>
					<input id="id" name="id" type="hidden">	
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Cancelar</button>
					<button id="btn-salvar" type="button" class="btn btn-primary">Gravar</button>
				</div>
			</form>
		</div>
	</div>
</div>