package view;

import model.Owner;

public class UserView {
    public static void main(String[] args) {
        Owner cliente1 = new Owner("Tiqui");
        System.out.println(cliente1.getNombre());
        Owner cliente2 = new Owner("Alberto");
        System.out.println(cliente2.getNombre());        
    }
}
