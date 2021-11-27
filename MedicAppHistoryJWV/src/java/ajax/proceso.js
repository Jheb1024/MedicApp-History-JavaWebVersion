function realizaProceso(nom, ap, apem, alt, ed, fec, pes, seguro){
  var parametros = {
          "valornombre" : nom,
          "valorapp" : ap,
          "valorapm" : apem,
          "valoraltura" : alt,
          "valoredad" : ed,
          "valorfecha" : fec,
          "valorpeso" : pes,
          "valorseguro" : seguro
  };
  $.ajax({
          data:  parametros,
          url:   'ControladorAgregarPaciente.java',
          type:  'post',
          beforeSend: function () {
                  $("#resultado").html("Guardado");
          },
          success:  function (response) {
                  $("#resultado").html(response);
          }
  });
}