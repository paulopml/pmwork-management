<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="modal fade" id="modal-cad-colaborador" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			<form id="form-colaborador" method="post">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">Cadastrar colaborador</h4>
				</div>
				<div class="modal-body">
					
					<div class="col-lg-5 group">
						<label for="nome">Nome do Colaborador</label>
						<input type="text" class="form-control" id="nome" name="nome" placeholder="Nome do Colaborador">
					</div>

					<div class="col-lg-2 group">
						<label for="">Data de Nascimento</label>
						<input type="text" class="form-control" id="dataNascimento" name="dataNascimento" placeholder="dd/mm/aaaa">
					</div>

					<div class="col-lg-2 group">
						<label for="">Data de Admissão</label>
						<input type="text" class="form-control" id="dataAdmissao" name="dataAdmissao" placeholder="dd/mm/aaaa">
					</div>

					<div class="col-lg-3 group">
						<label for="">Sexo</label>
						<span class="radio-inline"><input type="radio">Masculino</span>
						<span class="radio-inline"><input type="radio">Feminino</span>
					</div>

					<div class="col-lg-4 group">
						<label for="">Cargo</label>
						<select class="form-control selectpicker">
							<option>Cargo 1</option>
							<option>Cargo 2</option>
						</select>
					</div>	
									
					<div class="col-lg-4 group">
						<label for="">email</label>
						<input type="text" class="form-control" id="email" name="email" >
					</div>
					
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