$(document).ready(function(){
	
	aplicarListeners();
	aplicatListenerBtnSalvar();
});

var limparModal = function(){
	$('#id').val('');
	$('#nomeAtividade').val('');
	$('#estimativa').val('');
	$('#realizado').val('');
	$('#fase').val('');
	$('#descricao').val('');

}

var aplicatListenerBtnSalvar = function(){
	
	$('#btn-salvar').on('click', function(){
		var url = 'detalheprojeto';
		var dadosAtividade = $('#form-atividade').serialize();
		
		$.post(url, dadosAtividade)
			.done(function(pagina){
				$('#section-atividade').html(pagina);
				aplicarListeners();
			})
			.fail(function(){
				alert('Erro ao salvar');
			})
			.always(function(){
				$('#modal-cad-atividade').modal('hide');
			});
	});
	
}


var aplicarListeners = function(){
	$('#modal-cad-atividade').on('hide.bs.modal', limparModal);
	
	$('.btn-editar').on('click', function(){
		var id = $(this).parents('tr').data('id');
		var url = "detalheprojeto/"+id;
		
		$.get(url)
			.success(function(detalhe){
				$('#id').val(detalhe.id);
				$('#nomeAtividade').val(detalhe.nomeAtividade);
				$('#estimativa').val(detalhe.estimativa);
				$('#realizado').val(detalhe.realizado);
				$('#fase').val(detalhe.fase);
				$('#descricao').val(detalhe.descricao);
				
				$('#modal-cad-atividade').modal('show');
			});
			
		
	});
	
	$('.btn-deletar').on('click', function(){
		var id = $(this).parents('tr').data('id');
		var csrf = $('#csrf').val();
		
		$.ajax({
			url:  "detalheprojeto/"+id,
			type: 'DELETE',
			headers:{'X-CSRF-TOKEN':csrf},
			success:function(result){
				$('tr[data-id="'+id+'"]').remove();
			}
		})
	});
}
