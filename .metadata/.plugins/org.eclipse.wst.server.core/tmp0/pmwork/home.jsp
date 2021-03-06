<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<jsp:include page="/WEB-INF/fragments/header.jsp" />
		<main>
			<div class="container">
				<div class="row">
					<div class="col-lg-12">
						<div class="jumbotron">
							<h1>PMWork</h1>
							<p>Planeje e acompanhe projetos simples com o PMWork</p>
							<div id=image-home>
								<div id="planning" class="img-home">
									<img src="${path}/static/bootstrap/img/planning.png"/>
									<h4>Planeje seu projeto</h4>
								</div>
								<div id="meeting" class="img-home">
									<img src="${path}/static/bootstrap/img/meeting.png"/>
									<h4>Acompanhe o desempenho do projeto e do trabalho de sua equipe</h4>
								</div>
								<div id="result" class="img-home">
									<img src="${path}/static/bootstrap/img/result.png"/>
									<h4>Gere resultados e indicadores aos seus clientes</h4>								
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