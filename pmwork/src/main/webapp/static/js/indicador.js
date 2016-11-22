$(document).ready(function(){
	
	aplicarListeners();
	aplicatListenerBtnSalvar();
});

var limparModal = function(){
	$('#id').val('');
	$('#nomeIndicador').val('');
	$('#tipoIndicador').val('');
}

var aplicatListenerBtnSalvar = function(){
	
	$('#btn-salvar').on('click', function(){
		var url = 'indicador';
		var dadosIndicador = $('#form-indicador').serialize();
		
		$.post(url, dadosIndicador)
			.done(function(pagina){
				$('#section-indicador').html(pagina);
				aplicarListeners();
			})
			.fail(function(){
				alert('Erro ao salvar');
			})
			.always(function(){
				$('#modal-cad-indicador').modal('hide');
			});
	});
	
}


var aplicarListeners = function(){
	$('#modal-cad-indicador').on('hide.bs.modal', limparModal);
	
	$('.btn-editar').on('click', function(){
		var id = $(this).parents('tr').data('id');
		var url = "indicador/"+id;
		
		$.get(url)
			.success(function(indicadores){
				$('#id').val(indicadores.id);
				$('#nomeIndicador').val(indicadores.nomeIndicador);
				$('#tipoIndicador').val(indicadores.tipoIndicador);
				
				$('#modal-cad-indicador').modal('show');
			});
			
		
	});
	
	$('.btn-deletar').on('click', function(){
		var id = $(this).parents('tr').data('id');
		var csrf = $('#_csrf').val();
		
		$.ajax({
			url:  "indicador/"+id,
			type: 'DELETE',
			headers:{'X-CSRF-TOKEN':csrf},
			success:function(result){
				$('tr[data-id="'+id+'"]').remove();
			}
		})
	});
}
