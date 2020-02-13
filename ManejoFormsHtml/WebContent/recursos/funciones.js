function validarForma(forma){
	
	var usuario = forma.usuario;
	if(usuario.value == "" || usuario.value == "Escribir Usuario"){
		
		alert("Debe proporcionar un nombre de Usuario");
		usuario.focus();
		usuario.select();
		return false;
	}
	
	var password = forma.password;
	if(password.value == "" || password.value.length < 3){
		alert("Min 3 caracteres");
		password.focus();
		password.select();
		return false;
	}
	
	var tecnologias = forma.tecnologia;
	var checkSeleccionado = false;
	for( var i = 0 ; i < tecnologias.length; i++){
		if(tecnologias[i].checked){
			checkSeleccionado = true;
		}
		
	}
	
	if(!checkSeleccionado){
		alert("Debe seleccionar alguna tecnologia");
		return false;
	}
	
	var generos = forma.genero;
	var radioSeleccionado = false;
	for( var i = 0 ; i < generos.length; i++){
		if(generos[i].checked){
			radioSeleccionado = true;
		}
		
	}
	if(!radioSeleccionado){
		alert("Debe seleccionar algun genero");
		return false;
	}
	
	var ocupacion = forma.ocupacion;
	
	if(ocupacion.value == ""){
		alert("Debe seleccionar una ocupacion");
		return false;
	}
	
	//Apartir de aqui form valido
	
	alert("Formulario valido, enviando datos al servidor");
	return true;
}