
package Ave;

public class Ave implements Volador, Cantante{

    @Override
    public void volar() {
        System.out.println("Hola soy un ave y estoy volando por los cielos");
    }

    @Override
    public void Cantar() {
        System.out.println("Hola soy un ave y canto en los arboles");
    }
    
    
}
