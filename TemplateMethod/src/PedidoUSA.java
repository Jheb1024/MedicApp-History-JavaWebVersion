public class PedidoUSA extends Pedido 
{ 
    protected void calculaIVA() 
    { 
        importeIVA = importeSinIVA * 0.15; 
    } 
}
