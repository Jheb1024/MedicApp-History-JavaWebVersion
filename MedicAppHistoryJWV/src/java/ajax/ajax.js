/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
let btnJugar = document.querySelector("#btnEnviar");
let xhr = new XMLHttpRequest();


function crearXmlHttpRequest(){  
    let nombre = document.querySelector("#nombre").value;
    let app = document.querySelector("#app").value;
    let apm = document.querySelector("#apm").value;
    let altura = document.querySelector("#altura").value;
    let edad = document.querySelector("#edad").value;
    let fecha = document.querySelector("#fecha").value;
    let peso = document.querySelector("#peso").value;
    let no_seguro = document.querySelector("#no_seguro").value;
    
    xhr.open("POST","ControladorAgregarPaciente.java?nombre="+nombre+"&app="+app+"&apm="+apm+"&altura="+altura+"&edad="+edad+"&fecha="+fecha+"&peso="+peso+"&no_seguro="+no_seguro,true);
    xhr.onreadystatechange = ajaxFuntion
    xhr.send();
}

function ajaxFunction(){
	   
//2.El servidor responde al cliente.(Registrarse)
	var data = null;
	var xhr = ajaxFunction();
	xhr.onreadystatechange=function(){
			if(xhr.readyState==4){
				if(xhr.status==200||xhr.status==304){
					data = xhr.responseText;
				}
			}
		}}
            
            btnJugar.addEventListener("click",crearXmlHttpRequest);