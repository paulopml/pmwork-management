<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<jsp:include page="/WEB-INF/fragments/header.jsp" />
		<main>
			<section>
				<div class="container">
					<div class="row">
						<div class="col-lg-12">
							<section class="intro-page">
								<h1 class="heading">Help sistema</h1>
								<p>Encontre orientações para a utilização do sistema</p>
							</section>
						</div>
					</div>
				</div>
			</section>
			<div class="container">
				<div class="row">
					<div class="col-lg-10">
						<div class="panel panel-default ls-collapse">
							<div class="panel-heading">
								<a data-toggle="collapse" href="#collapseOne">
									<p>Cadastrar Projeto</p>
								</a>
							</div>
							<div id="collapseOne" class="panel-collapse collapse">
								<div class="panel-body">
						 
									<p>Aprenda a cadastrar um prejeto</p>
						 
								</div>
							</div>
						</div>
						<div class="panel panel-default ls-collapse">
							<div class="panel-heading">
								<a data-toggle="collapse" href="#collapseTwo">
									<p>Consultar um Projeto</p>
								</a>
							</div>
							<div id="collapseTwo" class="panel-collapse collapse">
								<div class="panel-body">
						 
									<p>Aprenda a consultar um prejeto</p>
						 
								</div>
							</div>
						</div>
						<div class="panel panel-default ls-collapse">
							<div class="panel-heading">
								<a data-toggle="collapse" href="#collapseThree">
									<p>Cadastrar indicador</p>
								</a>
							</div>
							<div id="collapseThree" class="panel-collapse collapse">
								<div class="panel-body">
						 
									<p>Aprenda a cadastrar um indicador</p>
						 
								</div>
							</div>
						</div>
						<div class="panel panel-default ls-collapse">
							<div class="panel-heading">
								<a data-toggle="collapse" href="#collapseFour">
									<p>Gerar relatórios</p>
								</a>
							</div>
							<div id="collapseFour" class="panel-collapse collapse">
								<div class="panel-body">
						 
									<p>Aprenda a gerar relatórios</p>
						 
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>		
		</main>
		<script type="text/javascript" src="${path}/static/js/jquery-2.2.3.min.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/jquery.mask.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/bootstrap-select.js"></script>
		<script type="text/javascript" src="${path}/static/bootstrap/js/functions.js"></script>
	</body>
</html>