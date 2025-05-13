
//LECCIÓN 1 - aqui crearemos objetos coche1 y coche2
public class Main {
    public static void main(String[] args) {

    /*    CODIGO DE LA SESIÓN 1 - PRÁCTICA 1

        Coche coche1 = new Coche();   //crear un objeto coche
        coche1.marca = "Toyota";
        coche1.modelo = "Corolla";
        coche1.color = "Rojo";

        Coche coche2 = new Coche();
        coche2.marca = "Ford";
        coche2.modelo = "Focus";
        coche2.color = "Azul";

        System.out.println(" coche1 - MARCA= " + coche1.marca + "  MODELO= " + coche1.modelo + "  COLOR= " + coche1.color);
        System.out.println(" coche2 - MARCA= " + coche2.marca + "  MODELO= " + coche2.modelo + "  COLOR= " + coche2.color);
*/

        //lección 2   CREAR 2 OBJETOS coche1 y Coche2 con los atributos creados en el constructor de la clase Coche
        // y utilizar los métodos acelerar y frenar
        Coche coche1 = new Coche("TOYOTA","COROLLA","ROJO");
        System.out.println("MI PRIMER COCHE ES UN  " + coche1.marca + "- " + coche1.modelo +"- "+ coche1.color);
        coche1.acelerar(20);
        coche1.acelerar(30);
        coche1.frenar(20);
        System.out.println("VELOCIDAD ACTUAL ES : " + coche1.obtenerVelocidad() + " km/h.");
        coche1.frenar(40);
        System.out.println("LA VELOCIDAD ACTUAL ES" + coche1.obtenerVelocidad()+ "  km/h");

        Coche coche2 = new Coche("FORD","FOCUS","AZUL");
        System.out.println("MI SEGUNDO COCHE ES UN "+ coche2.marca + "- "+ coche2.modelo + "- "+ coche2.color);
        coche2.acelerar(50);
        coche2.acelerar(70);
        coche2.frenar(100);
        System.out.println("VELOCIDAD ACTUAL ES : " + coche2.obtenerVelocidad() + " km/h.");
        coche1.frenar(30);
        System.out.println("LA VELOCIDAD ACTUAL ES = " + coche2.obtenerVelocidad()+ "  km/h");



    }
}
