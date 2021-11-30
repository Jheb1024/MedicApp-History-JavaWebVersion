public class PedidoMexico extends Pedido 
{ 
    protected void calculaIVA() 
    { 
        importeIVA = importeSinIVA * 0.21; 
    } 
}
