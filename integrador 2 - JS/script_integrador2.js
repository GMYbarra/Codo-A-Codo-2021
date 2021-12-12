const precioTicket = 200;

function resumir(){

    //Se cargan valores a las variables, según lo obtenido desde el HTML
    var cantidadTicket = document.getElementById('inputCantidad').value;
    var descuento = document.getElementById('inputCategoria').value;
    
    var precio  = cantidadTicket * (precioTicket - ((precioTicket * descuento) / 100));

    //Sumatoria total, devolviendo el valor al form
    document.getElementById('compraTotal').value = "Total a pagar: $" + precio; 
}