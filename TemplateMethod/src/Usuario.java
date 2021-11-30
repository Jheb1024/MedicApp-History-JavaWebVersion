public class Usuario 
{ 
    public static void main(String[] args) 
    { 
        Pedido pedidoMexico = new PedidoMexico(); 
        pedidoMexico.setImporteSinIVA(10000); 
        pedidoMexico.calculaPrecioConIVA(); 
        pedidoMexico.visualiza(); 
 
 
        Pedido pedidoUSA = new PedidoUSA(); 
        pedidoUSA.setImporteSinIVA(10000); 
        pedidoUSA.calculaPrecioConIVA(); 
        pedidoUSA.visualiza(); 
    } 
}

