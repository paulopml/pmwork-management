$(document).ready(function(){
	
	aplicarListeners();
	aplicatListenerBtnSalvar();
});

var limparModal = function(){
	$('#id').val('');
	$('#nomeFase').val('');
	$('#dataInicio').val('');
	$('#dataTermino').val('');

}

var aplicatListenerBtnSalvar = function(){
	
	$('#btn-salvar').on('click', function(){
		var url = 'detalheprojeto';
		var dadosFase = $('#form-fase').serialize();
		
		$.post(url, dadosFase)
			.done(function(pagina){
				$('#section-fase').html(pagina);
				aplicarListeners();
			})
			.fail(function(){
				alert('Erro ao salvar');
			})
			.always(function(){
				$('#modal-cad-fase').modal('hide');
			});
	});
	
};