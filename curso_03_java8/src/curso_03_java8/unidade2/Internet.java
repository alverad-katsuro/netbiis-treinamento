package curso_03_java8.unidade2;

public interface Internet {
    /* conectar @deprecated
    * usar conectarSSL.*/
    
    public void conectarSSL();
   
    @Deprecated
    public void conectar();
}
