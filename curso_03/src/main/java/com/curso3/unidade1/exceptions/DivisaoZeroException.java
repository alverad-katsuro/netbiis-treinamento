package com.curso3.unidade1.exceptions;

public class DivisaoZeroException extends Exception {
    public DivisaoZeroException(){
        super();
    }

    public DivisaoZeroException(String message){
        super(message);
    }
}
