package com.curso3.unidade2;

public interface Internet {
    /* conectar @deprecated
    * usar conectarSSL.*/
    
    public void conectarSSL();
   
    @Deprecated
    public void conectar();
}
