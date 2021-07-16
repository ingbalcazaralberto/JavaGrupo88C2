package test;

//import javax.naming.spi.DirStateFactory.Result;
import model.Owner;

public class Test {
    
    public void escenarioOwner(){
        Owner owner1 = new Owner("Tiqui");
        boolean test1 = assertTrue("Alberto", owner1.getNombre());
        System.out.println((test1)? "Paso":"No paso");
    }

    public boolean assertTrue(int esperado, int obtenido){
        return esperado > obtenido;
        
    }

    public boolean assertTrue(String esperado, String obtenido){
        return esperado.equalsIgnoreCase(obtenido);
    }

}
