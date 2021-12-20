/*console.log("Ejecucion de linea de comando");*/



let boton = document.querySelector('#boton_pulsar');
let inputNombre = document.querySelector('#input_nombre');
let inputTelefono = document.querySelector('#input_telefono');
let selectTipo = document.querySelector("#select_tipo");
let lis = document.querySelector("#lista_buscada li");
let lista = document.querySelector("ul");
let h1 = document.querySelectorAll("h1");
console.log(h1);

/*liBuscado.classList.add('elemento_profesor');
liBuscado.classList.remove("list-group-item");*/


/*h1.forEach((element, index) => {
    if (index % 2 == 0) {
        element.innerText += "Nodo Par"
    } else {
        element.innerText += "Nodo Impar"
    }
    console.log(index);
    console.log(element);
});*/

/*lista.innerHTML += "<li class='list-group-item'> Elemento adicional </li>"*/


//ejemplo de alumno profesor con colores.
/*boton.addEventListener("click", (element, event) => {

    if(inputNombre.value.length !=0 && inputTelefono.value.length ==9){
    
    console.log(selectTipo.value);
    lista.innerHTML += `<li class='list-group-item ${selectTipo.value}'>${inputNombre.value} - ${inputTelefono.value}</li>`;
    } else{
        alert('¿eres retrasado? esos datos no sirven ni para tomar por culo, anda a cagar SUBNORMAAL tse. ')
    }

});*/

boton.addEventListener("click", (element, event) => {

            if (inputNombre.value.length != 0 && inputTelefono.value.length == 9) {

                //console.log(selectTipo.value);
                lista.innerHTML += `<li class='list-group-item ${selectTipo.value}'>${inputNombre.value} - ${inputTelefono.value}</li>`;
                lis = document.querySelectorAll("#lista_buscada li");
                lis.forEach((element, index) => {
                    //lo que le pasa a cada elemento (li);
                    element.addEventListener("click", (e) => {
                        console.log(element.innerHTML);
                    })
                });

            } else{
                alert("No has introducido datos")
            }
        });
        





                /*for(let index = 0; index < h1.length; index++){
                    h1[index].innerText = "Modificación de todos";
                }*/

                /*h1[2].innerText = "Modificación del DOM del H1"*/