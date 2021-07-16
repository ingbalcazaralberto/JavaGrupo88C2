package model;

public class Transaction {
    private int value;
    private String fecha;
    /*
        1. Ingreso
        2. egreso
    */ 
    private int type;

    public Transaction(int value,String fecha, int type) {
        super();
        this.value = value;
        this.fecha = fecha;
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public String getFecha() {
        return fecha;
    }

    public int getType() {
        return type;
    }

    public String toString(){
        return "Valor: $"+value+" fecha: "+fecha+" Tipo: "+(type==1?"Ingreso":"Retiro");
    }

}
