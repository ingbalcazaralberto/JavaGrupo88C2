package model;

public class Owner extends User{
    private Wallet wallet;

    public Owner(String nombre) {
        super();
        wallet = new Wallet();
        setNombre(nombre);
    }

    public Wallet getWallet() {
        return wallet;
    }

    public String comparerWallet(Wallet otraWallet){
        Wallet miWallet = getWallet();
        
        if (miWallet.getSaldo()>otraWallet.getSaldo()){
            return "Mi wallet tiene mas saldo";
        }else if (miWallet.getSaldo()==otraWallet.getSaldo()){
            return "Ambas wallet tiene el mismo saldo";
        } else {
            return "La otra wallet tiene más saldo";
        }


    }

}

