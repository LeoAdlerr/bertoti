function cadastrar(){		
		var vNome = $("#nome").val();
	var vEmail = $("#email").val();
	var vSenha = $("#senha").val();
	
	//Função ajax de atribuição do front para uma classe no java
	$.ajax({
		method: "POST", //Especificando qual o metodo
		url: "/UsuarioCadastro", //Definindo a url que conecta no mapeamento
		//Passando os atribuyos da classe e quais variaveis representa eles no front
		data: JSON.stringify({nome : vNome , email : vEmail , senha : vSenha}), 
		contentType: "application/json; charset=utf-8", //Explicitando que se trata de um conteudo JSON
		//Alerta de sucesso ou falha no envio do JSON
		success: function (data){
			alert("Salvo com Sucesso!");
			console.log(data);
		}
	}).fail(function(xhr, status, errorThrow){
		alert("Erro ao Salvar: " + xhr.responseText);
	});
}

function cadastro(){		
	
	window.location.replace("/cadastro");
}
function cadastro2(){		
	
	window.location.replace("/cadastro2");
}

function logon(){		
	
	window.location.replace("/login");
}

function home(){		
	
	window.location.replace("/home");
}

function logar(){		
	var vEmail = $("#email").val();
	var vSenha = $("#senha").val();
	
	//Função ajax de atribuição do front para uma classe no java
	$.ajax({
		method: "POST", //Especificando qual o metodo
		url: "/UsuarioLogin", //Definindo a url que conecta no mapeamento
		//Passando os atribuyos da classe e quais variaveis representa eles no front
		data: JSON.stringify({email : vEmail , senha : vSenha}), 
		contentType: "application/json; charset=utf-8", //Explicitando que se trata de um conteudo JSON
		//Alerta de sucesso ou falha no envio do JSON
		success: function (data){
			alert("Salvo com Sucesso!");
			console.log(data);
			window.location.replace("/home");
		}
	}).fail(function(xhr, status, errorThrow){
		alert("Erro ao Salvar: " + xhr.responseText);
	});
}