
var Controlador = {

    init: function(){
        const datos = document.querySelector("#datos").textContent;
        const descripcion = document.querySelector("#descripcion").textContent;

        console.log("Datos:",datos);
        console.log("Descripción:",descripcion);
        
        let separacionA = datos.split("|")
        let separacionB = descripcion.split(",");
       


    }
};


window.addEventListener("load",Controlador.init);
