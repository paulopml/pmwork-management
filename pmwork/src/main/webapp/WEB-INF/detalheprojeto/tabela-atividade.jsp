<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<script>
	function allowDrop(ev) {
	    ev.preventDefault();
	}
	
	function drag(ev) {
	    ev.dataTransfer.setData("text", ev.target.id);
	}
	
	function drop(ev) {
	    ev.preventDefault();
	    var data = ev.dataTransfer.getData("text");
	    ev.target.appendChild(document.getElementById(data));
	}
</script>
<div class="container">
	<div class="row">
		<div class="col-lg-12">			
			<div id="div1" class="panel panel-primary" ondrop="drop(event)" ondragover="allowDrop(event)">
			   <div class="panel-heading">
					Aberto
			   </div>
			  <div class="panel panel-info" draggable="true" ondragstart="drag(event)" id="drag1">
			    <div class="panel-heading">
			       <h3 class="panel-title">Atividade 1</h3>
			    </div>
			    <div class="panel-body">
			    	Descrição da atividade ......
			    </div>
			  </div>
			  <div class="panel panel-info" draggable="true" ondragstart="drag(event)" id="drag2">
			    <div class="panel-heading">
			       <h3 class="panel-title">Atividade 2</h3>
			    </div>
			    <div class="panel-body">
			    	Descrição da atividade ......
			    </div>
			  </div>
			</div>
			
			<div id="div2" class="panel panel-primary" ondrop="drop(event)" ondragover="allowDrop(event)">
				<div class="panel-heading">
					Em andamento
				</div>
			
			</div>
			
			<div id="div3" class="panel panel-primary" ondrop="drop(event)" ondragover="allowDrop(event)">
				<div class="panel-heading">
					Fechado
			   </div>
			</div>
		</div>
	</div>
</div>	