
	function mascara(param_campo, param_funcao){
	
		if(param_campo == null)
		return;
		
		v_obj=param_campo;
		v_fun=param_funcao;
		v_call=null;
		setTimeout("execmascara()",1);

	}
	
	function mascaraCallBack(param_campo, param_funcao, callback){
	
		if(param_campo == null)
		return;
		
		v_obj=param_campo;
		v_fun=param_funcao;
		v_call=callback;
		setTimeout("execmascara()",1);

	}
	
	
	function execmascara(){

		v_obj.value=v_fun(v_obj.value);
		
		if(v_call!=null)
			v_call();
	}

	function formataMonetario(valor){
		
		valor=valor.replace(/\D/g,"");                  //Remove tudo o que não é dígito
		
		if(valor.length ==0)
		return 0,00;
		
		// passa para inteiro e depois para string novamente (retirar zeros no inicio da string)
		valor = parseInt(valor)+"";	
		
		if(valor.length ==1)
		return "0,0"+valor;
		
		if(valor.length ==2)
		return "0,"+valor;
		
		var valor = valor+'';
		valor = valor.replace(/([0-9]{2})$/g, ",$1");
		
		return valor;
	}