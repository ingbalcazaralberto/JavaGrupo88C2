package model;

/*
Transferir dinero, para esta funcionalidad se recibe una instancia (objeto) de la clase Wallet como parametro y un valor, 
con lo cual se debe retirar dinero de la wallet (instancia) que llama al metodo y consignarlo en la instancia que llega por parametro
Para las transferencias considere una taza de 0.2% la cual estará contenida dentro de una constante llamada TAZA_TRANSFERENCIA
Compartir el enlace al commit donde se encuentre la solución a estas peticiones.
*/ 
public class Wallet {
    public static final int CAPACIDAD_MAXIMA=1000000;
    public static final int TOPE_TRANSACCION=200000;
    public static final double TAZA_TRANSFERENCIA=0.2;

    private int saldo;    
    private boolean tieneLimite;

    public Wallet() {
        super();
        saldo = 0;
        tieneLimite = true;        
    }    

    public String saveMoney(int valor) {
        if (valor<0){
            return "Debe digitar una cantidad valida";    
        }  
        
        else if ((tieneLimite) && (valor+saldo>CAPACIDAD_MAXIMA)){
            return "El saldo no puede superar la capacidad máxima";
        } 
        
        else if ((tieneLimite) && (valor>TOPE_TRANSACCION)){
            return "El tope máximo de ingreso es de "+TOPE_TRANSACCION;
        }
        else 
        {
        saldo+=valor;
        return "Transacción exitosa!";
        }
        

    }

    public String takeMoney(int valor){
        if (saldo<valor){
            return "El monto supera el saldo";
        } 
        else if ((tieneLimite) && (valor>TOPE_TRANSACCION)){
            return "El tope máximo de retiro es de "+TOPE_TRANSACCION;
        } 
        else{
            saldo -= valor;
            return "Transcción exitosa";
        }
    }

    public int getSaldo(){
        return saldo;
    }

    
}


