$(document).ready(function(){
	
	aplicarListeners();
	aplicatListenerBtnSalvar();
});

var limparModal = function(){
	$('#id').val('');
	$('#nome').val('');
	$('#dataNascimento').val('');
	$('#dataAdmissao').val('');
	$('#especialidade').val('');
	$('#cargo').val('');
	$('#email').val('');
	$('#login').val('');
	$('#senha').val('');
}

var aplicatListenerBtnSalvar = function(){
	
	$('#btn-salvar').on('click', function(){
		var url = 'cadastrocolaborador';
		var dadosColaborador = $('#form-colaborador').serialize();
		
		$.post(url, dadosColaborador)
			.done(function(pagina){
				$('#section-colaborador').html(pagina);
				aplicarListeners();
			})
			.fail(function(){
				alert('Erro ao salvar');
			})
			.always(function(){
				$('#modal-cad-colaborador').modal('hide');
			});
	});
}

var aplicarListeners = function(){
	$('#modal-cad-colaborador').on('hide.bs.modal', limparModal);
	
	$('.btn-editar').on('click', function(){
		var id = $(this).parents('tr').data('id');
		var url = "cadastrocolaborador/"+id;
		
		$.get(url)
			.success(function(colaboradores){
				
				$('#id').val(colaboradores.id);
				$('#nome').val(colaboradores.nome);
				$('#dataNascimento').val(colaboradores.dataNascimento);
				$('#dataAdmissao').val(colaboradores.dataAdmissao);
				$('#especialidade').val(colaboradores.especialidade);
				$('#cargo').val(colaboradores.cargo);
				$('#email').val(colaboradores.email);
				$('#login').val(colaboradores.login);
				$('#senha').val(colaboradores.senha);
				
				$('#modal-cad-colaborador').modal('show');
			});
			
		
	});
	
	$('.btn-deletar').on('click', function(){
		var id = $(this).parents('tr').data('id');
		var csrf = $('#csrf').val();
		
		$.ajax({
			url:  "cadastrocolaborador/"+id,
			type: 'DELETE',
			headers:{'X-CSRF-TOKEN':csrf},
			success:function(result){
				$('tr[data-id="'+id+'"]').remove();
			}
		})
	});
}
