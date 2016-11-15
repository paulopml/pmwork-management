$(document).ready(function(){
	
	aplicarListeners();
	aplicatListenerBtnSalvar();
});

var limparModal = function(){
	$('#id').val('');
	$('#cargo').val('');
	$('#regra').val('');
	
	
}

var aplicatListenerBtnSalvar = function(){
	$('#btn-salvar').on('click', function(){
		var url = 'controleacesso';
		var dadosAcesso = $('#form-controle').serialize();
		
		$.post(url, dadosAcesso)
			.done(function(pagina){
				$('#section-controle').html(pagina);
				aplicarListeners();
			})
			.fail(function(){
				alert('Erro ao salvar');
			})
			.always(function(){
				$('#modal-cad-controle').modal('hide');
			});
	});	
}

var aplicarListeners = function(){
	$('#modal-cad-controle').on('hide.bs.modal', limparModal);
	
	$('#btn-salvar').on('click', function(){
		var url = 'controleacesso';
		var dadosAcesso = $('#form-controle').serialize();
		
		$.post(url, dadosAcesso)
			.done(function(pagina){
				$('#section-controle').html(pagina);
				aplicarListeners();
			})
			.fail(function(){
				alert('Erro ao salvar');
			})
			.always(function(){
				$('#modal-cad-controle').modal('hide');
			});
	});
	$('.btn-editar').on('click', function(){
		var id = $(this).parents('tr').data('id');
		var url = "controleacesso/"+id;
		
		$.get(url)
			.success(function(acessos){
				$('#id').val(acessos.id);
				$('#cargo').val(acessos.cargo);
				$('#regra').val(acessos.regra);
				
				
				$('#modal-cad-controle').modal('show');
			});
			
		
	});
	
	$('.btn-deletar').on('click', function(){
		var id = $(this).parents('tr').data('id');
		var csrf = $('#csrf').val();
		
		$.ajax({
			url:  "controleacesso/"+id,
			type: 'DELETE',
			headers:{'X-CSRF-TOKEN':csrf},
			success:function(result){
				$('tr[data-id="'+id+'"]').remove();
			}
		})
	});
}
