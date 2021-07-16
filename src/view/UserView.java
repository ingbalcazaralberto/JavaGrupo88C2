package view;

import model.Owner;

public class UserView {
    public static void main(String[] args) {
        Owner cliente1 = new Owner("Tiqui");
        Owner cliente2 = new Owner("Alberto");
        System.out.println(cliente1.getNombre());
        System.out.println(cliente2.getNombre());
        String response = cliente1.getWallet().saveMoney(100000);
        cliente1.getWallet().takeMoney(20000);
        cliente1.getWallet().takeMoney(30000);
        cliente1.getWallet().saveMoney(10000);
        cliente1.getWallet().saveMoney(5000);
        //System.out.println(response);  
        //System.out.println(cliente1.getWallet().getSaldo());       
        //System.out.println(cliente2.getWallet().getSaldo());
        //System.out.println(cliente1.comparerWallet(cliente2.getWallet()));
        cliente1.getWallet().getBalance();
    }
}


