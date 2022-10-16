package com.curso3.unidade3;

public class MinMax <T extends Number> implements IMinMax <T> {
    private T obj1;
    private T obj2;

    public MinMax(T obj1, T obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public T min() {
        if (this.obj1.doubleValue() < this.obj2.doubleValue()){
            System.out.println(this.obj1);
            return obj1;
        } else {
            System.out.println(this.obj2);
            return obj2;
        }
    }

    @Override
    public T max() {
        if (this.obj1.doubleValue() > this.obj2.doubleValue()){
            System.out.println(this.obj1);
            return obj1;
        } else {
            System.out.println(this.obj2);
            return obj2;
        }
    }

    
}
