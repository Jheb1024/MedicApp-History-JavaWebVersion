public class VisitanteMailingComercial implements Visitante 
{ 
    public void visita(EmpresaSinFilial empresa) 
    { 
        System.out.println("Envia un email a " + 
          empresa.getNombre() + " dirección: " + empresa.getEmail() 
          + " Propuesta comercial para su empresa"); 
    } 
 
    public void visita(EmpresaMadre empresa) 
    { 
        System.out.println("Envia un email a " + 
          empresa.getNombre() + " direccion: " + empresa.getEmail() 
          + " Propuesta comercial para su grupo"); 
        System.out.println("Impresion de un correo para " + 
          empresa.getNombre() + " direccion: " + 
          empresa.getDireccion() + 
          " Propuesta comercial para su grupo"); 
    } 
}
