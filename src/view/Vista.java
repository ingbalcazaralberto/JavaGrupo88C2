package view;

import model.Wallet;

public class Vista {
 
    public static void main(String[] args) {
        Wallet wallet1 = new Wallet();
        System.out.println(wallet1.saveMoney(100000));
        System.out.println(wallet1.getSaldo());
        System.out.println(wallet1.saveMoney(150000));
        System.out.println(wallet1.getSaldo());
        System.out.println(wallet1.saveMoney(300000));
        System.out.println(wallet1.getSaldo());                
        System.out.println(wallet1.takeMoney(210000));
        System.out.println(wallet1.getSaldo());                              
        
    }   
}


