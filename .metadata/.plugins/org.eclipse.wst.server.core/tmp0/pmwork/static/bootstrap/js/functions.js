$(document).ready(function(){
  $('.data').mask('00/00/0000');
  $('.hpra').mask('00:00:00');
  $('.data_hora').mask('00/00/0000 00:00:00');
  $('.cep').mask('00.000-000');
  $('.celular').mask('0 0000-0000');
  $('.telefone').mask('(00) 0000-0000');
  $('.cpf').mask('000.000.000-00', {reverse: true});
  $('.money').mask('000.000.000.000.000,00', {reverse: true});


  $('.selectpicker').selectpicker();
});