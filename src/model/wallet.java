package model;

import java.util.ArrayList;

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
    private int meta;
    private ArrayList<Transaction> transactions;
  
    public Wallet() {
        super();
        saldo = 0;
        tieneLimite = true; 
        transactions = new ArrayList<>();
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
        Transaction transactionEntry = new Transaction(valor,"hoy",1);
        transactions.add(transactionEntry); 
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
            Transaction transactionExit = new Transaction(valor,"hoy",2);
            transactions.add(transactionExit);             
            return "Transcción exitosa";
        }
    }

    public String bearkLimits(){
    
        if ((tieneLimite) && (saldo>=CAPACIDAD_MAXIMA-100000)){
            tieneLimite = !tieneLimite;
            return "Tu cuenta ya no tiene limites";
        }else if (tieneLimite){
            return "Te hacen falta "+((CAPACIDAD_MAXIMA-100000)-saldo);
        }else{
            return "Tu cuenta ya esta configurada sin limites";
        }

        
    }

    public void tranferMoney(Wallet tansferecnia,int valor){

    }

    public String establecerMeta(int valor){
        meta = valor;
        return "Meta establecida";
    }

    public boolean verificarMeta(){
        return meta>0;
    }

    public int getSaldo(){
        return saldo;
    }

    public void getBalance(){
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    
}


