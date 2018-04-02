package coche;

import junit.framework.TestCase;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

/**
 *
 * Test de Pruebas JUnit para la Clase Coche 
 */
public class CocheTest extends TestCase {
    
    public CocheTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    
/**
* Test para el método Comprar con un valor válido. Si el método comprar es correcto la prueba debe ser exitosa. 
* Vamos a comprobar si partiendo de un stock de 300 coches si compro 100 coches
* más el stock es 400. Si es asi el resultado es correcto.
* @throws java.lang.Exception
*/

     public void testComprarValido() throws Exception {
        System.out.println("Test de prueba para Comprar un número positivo de coches");
        int cantidad = 100;
        Coche coche1 = new Coche("Ford",12000,300);
        coche1.comprar(cantidad);
        assertTrue(coche1.obtenerStock()==400); /* Como parto de un stock de 300 al comprar 100 
         * coches más ahora el stock es de 400  */     
    }

    
       /**
* Test para el método Comprar con un valor no válido. En esta prueba intento comprar una cantidad negativa de 
* coches. Debe saltar la excepción. Con esta prueba comprobamos que el método comprar no 
* acepta números negativos. 
     * @throws java.lang.Exception
*/

    
    public void testComprarNegativo()  {
        System.out.println("Test de prueba para Comprar un número negativo de coches");
        int cantidad = -100;
        Coche coche1 = new Coche("Ford",12000,300);
       try {
        coche1.comprar(cantidad);
        fail("Intento de comprar un número negativo de coches");
       } 
       catch (Exception e){
         System.out.println(e);
         assertTrue(coche1.obtenerStock()==300);  
       }  
    }
    
   /**
* Test para el método Vender con un valor válido. Si el método vender es correcto la prueba debe 
* ser exitosa. En esta prueba vamos a comprobar que si partiendo de un stock 
* de 300 coches vendo 200 el stock que me queda es 100
     * @throws java.lang.Exception
*/

    public void testVenderValido() throws Exception {
        System.out.println("Test de prueba para vender un número positivo y menor que"
                + " el stock de coches");
        int cantidad = 200;
        Coche coche1 = new Coche("Ford",12000,300);
        coche1.vender(cantidad);
        assertTrue(coche1.obtenerStock()==100); /* Como parto de un stock de 300 al comprar 100 
         * coches más ahora el stock es de 400  */
    }
       
 /**
* Test para el método Vender con valor no válido (número mayor que el stock disponible). En esta prueba intento vender más coches 
* que hay en stock. El método vender no debe permitirlo y debe saltar 
* la excepción.  */

    public void testVenderMasCantidadDisponible() throws Exception {
        System.out.println("Test de prueba para vender un número positivo pero mayor que"
                + " el stock de coches ");
        int cantidad = 400;
        Coche coche1 = new Coche("Ford",12000,300);
         try {
        coche1.vender(cantidad);
        fail("Intento de vender más coches que hay en el stock"); 
       } 
       catch (Exception e){
         System.out.println(e);
         assertTrue(coche1.obtenerStock()==300);   
       }  
         
   }    
        
/**
* Test para el método Vender no válido (negativo). En esta prueba intento vender un número negativo de coches. 
* El método vender no debe permitirlo y debe saltar 
* la excepción.
     * @throws java.lang.Exception */
   
    public void testVenderNegativo() throws Exception {
        System.out.println("Test de prueba para vender un número negativo de coches");
        int cantidad = -200;
        Coche coche1 = new Coche("Ford",12000,300);
         try {
        coche1.vender(cantidad);
       fail("Intento de vender un número negativo de coches");
       } 
       catch (Exception e){
         System.out.println(e);
         assertTrue(coche1.obtenerStock()==300);  
       }    
            
    }
}