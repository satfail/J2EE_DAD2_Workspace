
function validarForma(forma){
	var usuario = forma.usuario;
	if(usuario.value == "" || usuario.value == "Escribir Usuario"){
		alert("Debe proporcionar un nombre de Usuario");
		usuario.focus();
		usuario.select();
		return false;
	}
	alert("Formulario valido, enviando datos al servidor");
	return true;
}