<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="modal fade" id="modal-cad-colaborador" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-lg">
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
					<fieldset class="row">
						<div class="col-lg-5 group">
							<label for="nome">Nome do Colaborador</label>
							<input type="text" class="form-control" id="nome" name="nome" placeholder="Nome do Colaborador">
						</div>
	
						<div class="col-lg-3 group">
							<label for="dataNascimento">Data de Nascimento</label>
							<input type="date" class="form-control" id="dataNascimento" name="dataNascimento"  value = "<fmt:formatDate value="${dataNascimento}" pattern="dd-MM-yyyy" />"/> 
				    	<!-- <input type="text" class="form-control" id="dataNascimento" name="dataNascimento" placeholder="dd/mm/aaaa"> -->
						</div>
	
						<div class="col-lg-3 group">
							<label for="dataAdmissao">Data de Admissão</label>
							<input type="date" class="form-control" id="dataAdmissao" name="dataAdmissao"  value = "<fmt:formatDate value="${dataAdmissao}" pattern="dd-MM-yyyy" />"/>
	                	<!-- <input type="text" class="form-control" id="dataAdmissao" name="dataAdmissao" placeholder="dd/mm/aaaa"> -->
						</div>
	
						<div class="col-lg-4 group">
							<label for="cargo">Cargo</label>
							<select id="cargo" name="cargo" class="form-control">
								<c:forEach items="${acessos}" var="acesso">
									<option value="${acesso.id}">${acesso.cargo}</option>
								</c:forEach>											
							</select>
						</div>	
										
						<div class="col-lg-4 group">
							<label for="email">Email</label>
							<input type="text" class="form-control" id="email" name="email">
						</div>
						
						<div class="col-lg-4 group">
							<label for="especialidade">Especialidade</label>
							<input type="text" class="form-control" id="especialidade" name="especialidade">	
						</div>
						
						<div class="col-lg-2 group">
	                        <label for="login">Login</label>
	                        <input type="text" class="form-control" id="login" name="login">    
	                    </div>
	                    
	                    <div class="col-lg-2 group">
	                        <label for="senha">Senha</label>
	                        <input type="password" class="form-control" id="senha" name="senha">    
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