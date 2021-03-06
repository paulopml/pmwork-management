$(document).ready(function(){
	
	aplicarListeners();
	aplicatListenerBtnSalvar();
	incluirEquipe();
	moeda();
});

var limparModal = function(){
	$('#id').val('');
	$('#nome').val('');
	$('#dataInicio').val('');
	$('#dataTermino').val('');
	$('#dataRealTermino').val('');
	$('#status').val('');
	$('#descricaoEscopo').val('');
	$('#orcamentoTotal').val('');
	$('#gerenteProjeto').val('');
	$('#classificacaoRisco').val('');
	$('#indicadores').val('');
	$('#justificativa').val('');
}
var incluirEquipe = function(){
	$('#btn-incluir').on('click', function(){
		var membro = $('option.selecionado :selected').text();
		$("td.membroeqp").append(membro);
	});
	
}
var moeda = function(){
	 $("input.dinheiro").maskMoney({showSymbol:true, symbol:"R$", decimal:",", thousands:"."});
}

var aplicatListenerBtnSalvar = function(){
	$('#btn-salvar').on('click', function(){
		var url = 'projetos';
		var dadosProjeto = $('#form-projeto').serialize();
		
		$.post(url, dadosProjeto)
			.done(function(pagina){
				$('#section-projeto').html(pagina);
				aplicarListeners();
			})
			.fail(function(){
				alert('Erro ao salvar');
			})
			.always(function(){
				$('#modal-cad-projeto').modal('hide');
			});
	});	
}

var aplicarListeners = function(){
	$('#modal-cad-projeto').on('hide.bs.modal', limparModal);
	
	$('.btn-editar').on('click', function(){
		var id = $(this).parents('tr').data('id');
		var url = "projetos/"+id;
		
		$.get(url)
			.success(function(projeto){
				$('#id').val(projeto.id);
				$('#nome').val(projeto.nome);
				$('#dataInicio').val(projeto.dataInicio);
				$('#dataTermino').val(projeto.dataTermino);
				$('#dataRealTermino').val(projeto.dataRealTermino);
				$('#status').val(projeto.status);
				$('#descricaoEscopo').val(projeto.descricaoEscopo);
				$('#orcamentoTotal').val(projeto.orcamentoTotal);
				$('#gerenteProjeto').val(projeto.gerenteProjeto);
				$('#classificacaoRisco').val(projeto.classificacaoRisco);
				$('#indicadores').val(projeto.indicadores);
				$('#justificativa').val(projeto.justificativa);
				
				
				$('#modal-cad-projeto').modal('show');
			});
			
		
	});
	
	$('.btn-deletar').on('click', function(){
		var id = $(this).parents('tr').data('id');
		
		$.ajax({
			url:  "projetos/"+id,
			type: 'DELETE',
			success:function(result){
				$('tr[data-id="'+id+'"]').remove();
			}
		})
	});
}