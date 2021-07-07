/**
 *  Validacao de form
 */

function validar (){
	let nome = frm.cliente.value
	if (nome === "") {
		alert('Preencha Todos os Campos')
		frm.cliente.focus()
		return false
	}else {
		document.forms["frm"].submit()
	}
	
}



