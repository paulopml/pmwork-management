$(document).ready(function(){
	
	$('#btn-salvar').on('click', function(){
		var url = 'indicador';
		var dadosIndicador = $('#form-indicador').serialize();
		
		$.post(url, dadosIndicador)
			.done(function(pagina){
				$('#section-indicador').html(pagina);
			})
			.fail(function(){
				alert('Erro ao salvar');
			})
			.always(function(){
				$('#modal-cad-indicador').modal('hide');
			});
	});
//	$('.btn-deletar').on('click', function(){
//		alert('deletando...');
//	});
});
