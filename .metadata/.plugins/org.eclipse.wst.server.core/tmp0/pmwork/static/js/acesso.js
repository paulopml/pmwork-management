$(document).ready(function(){
	
	aplicarListeners();
	aplicatListenerBtnSalvar();
});

var limparModal = function(){
	$('#id').val('');
	$('#incluirProjetos').val('');
	$('#cadastrarIndicador').val('');
	$('#controlarAcesso').val('');
	$('#manterStatus').val('');
	$('#excluirProjetos').val('');
	$('#associarIndicador').val('');
	$('#gerarRelatorios').val('');
	$('#manterAtividade').val('');
	$('#editarProjetos').val('');
	$('#manterEquipe').val('');
	$('#incluirFase').val('');
	$('#visualizarProjetos').val('');
	$('#manterColaborador').val('');
	$('#classificarRisco').val('');
	$('#manterEquipe').val('');
	
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
				$('#incluirProjetos').val(acessos.incluirProjetos);
				$('#cadastrarIndicador').val(acessos.cadastrarIndicador);
				$('#controlarAcesso').val(acessos.controlarAcesso);
				$('#manterStatus').val(acessos.manterStatus);
				$('#excluirProjetos').val(acessos.excluirProjetos);
				$('#associarIndicador').val(acessos.associarIndicador);
				$('#gerarRelatorios').val(acessos.gerarRelatorios);
				$('#manterAtividade').val(acessos.manterAtividade);
				$('#editarProjetos').val(acessos.editarProjetos);
				$('#manterEquipe').val(acessos.manterEquipe);
				$('#incluirFase').val(acessos.incluirFase);
				$('#visualizarProjetos').val(acessos.visualizarProjetos);
				$('#manterColaborador').val(acessos.manterColaborador);
				$('#classificarRisco').val(acessos.classificarRisco);
				$('#manterEquipe').val(acessos.manterEquipe);
				
				
				$('#modal-cad-controle').modal('show');
			});
			
		
	});
	
	$('.btn-deletar').on('click', function(){
		var id = $(this).parents('tr').data('id');
		
		$.ajax({
			url:  "controleacesso/"+id,
			type: 'DELETE',
			success:function(result){
				$('tr[data-id="'+id+'"]').remove();
			}
		})
	});
}
