<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="modal fade" id="modal-cad-projeto" tabindex="-1" role="dialog">
	<div class="modal-dialog modal-lg">
		<div class="modal-content">
			<form id="form-projeto" method="post">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">Cadastrar projeto</h4>
				</div>
				<div class="modal-body md-body-pj">
					<fieldset class="row">
						<div class="col-lg-5 group">
							<label for="nome">Nome do projeto</label>
							<input type="text" class="form-control" id="nome" name="nome" placeholder="Nome do projeto">
						</div>
						
						<div class="col-lg-3 group">
							<label for="dataInicio">Data de início</label>
							<input type="date" class="form-control fa-calendar" id="dataInicio" name="dataInicio"  value = "<fmt:formatDate value="${dataInicio}" pattern="dd-MM-yyyy" />"/>
				    	<!-- <input type="text" class="form-control" id="dataInicio" name="dataInicio" placeholder="dd/mm/aaaa"> -->
						</div>
	
						<div class="col-lg-3 group">
							<label for="dataTermino">Data de término</label>
							<input type="date" class="form-control fa-calendar" id="dataTermino" name="dataTermino"  value = "<fmt:formatDate value="${dataTermino}" pattern="dd-MM-yyyy" />"/>
						<!-- <input type="text" class="form-control" id="dataTermino" name="dataTermino" placeholder="dd/mm/aaaa">  -->
						</div>
						<div class="col-lg-3 group">
							<label for="dataRealTermino">Data real de término</label>
							<input type="date" class="form-control fa-calendar" id="dataRealTermino" name="dataRealTermino"  value = "<fmt:formatDate value="${dataRealTermino}" pattern="dd-MM-yyyy" />"/>
						<!-- <input type="text" class="form-control" id="dataRealTermino" name="dataRealTermino" placeholder="dd/mm/aaaa">  -->
						</div>
						<div class="col-lg-4 group">
							<label for="status">Status</label>
							<select id="status" name="status" class="form-control">
								<c:forEach items="${status}" var="statuspj">
									<option value="${statuspj}">${statuspj}</option>
								</c:forEach>											
							</select>
						</div>	
						<div class="col-lg-2 group">
							<label for="classificacaoRisco">Risco</label>
							<select id="classificacaoRisco" name="classificacaoRisco" class="form-control">
								<c:forEach items="${classificacaoRisco}" var="risco">
									<option value="${risco}">${risco}</option>
								</c:forEach>											
							</select>
						</div>		
						<div class="col-lg-12 group">
							<label for="descricaoEscopo">Descrição do escopo</label>
							<textarea  class="form-control" rows="6" id="descricaoEscopo" name="descricaoEscopo"></textarea>	
						</div>
						
						<div class="col-lg-3 group">
	                        <label for="orcamentoTotal">Orçamento total</label> 
	                        <input type="text" class="form-control dinheiro" value="<fmt:formatNumber value="${projeto.orcamentoTotal}" type="currency"/>">
	                    <!--    <input type="text" class="form-control" id="orcamentoTotal" name="orcamentoTotal">  -->   
	                    </div>                   
	                    <div class="col-lg-4 group">
	                        <label for="gerenteProjeto">Gerente do projeto</label>
							<select id="gerenteProjeto" name="gerenteProjeto" class="form-control">
								<c:forEach items="${equipes}" var="gerente">
									<option value="${gerente.id}">${gerente.nome}</option>
								</c:forEach>											
							</select>
	                    </div>
	                    <div class="col-lg-10 group panel panel-default md-equipe-pj">      	 	
	                       <div class="panel-body">
	                   	   		<label for="equipe">Equipe do projeto</label>
	                    		<div class="col-lg-10 group">                           
								   <select id="equipes" name="equipes" class="form-control">
										<c:forEach items="${equipes}" var="equipepj">
											<option class="selecionado" value="${equipepj.id}">${equipepj.nome}</option>
										</c:forEach>											
									</select>
								</div>
								<div class="col-lg-2 group">
									<button type="button" id="btn-incluir" class="btn btn-default" ">Incluir</button>
	                    		</div>
		                    	<div id= "equipe-projeto" class="col-lg-10 group">
		                    		<jsp:include page="tabela-equipe.jsp"/>
		                    	</div>
		                    </div>	
	                    </div>
	                    <div class="col-lg-12 group">
							<label for="justificativa">Justificativa</label>
							<textarea  class="form-control" rows="3" id="justificativa" name="justificativa"></textarea>	
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