
package Pez;

public class Pez implements Nadador, Respirador{

    @Override
    public void Nadar() {
        System.out.println("Soy un pez que nada por el mar");   
    }

    @Override
    public void Respirar() {
        System.out.println("Soy un pez que respira debajo de el mar");
    }
    
    
}
