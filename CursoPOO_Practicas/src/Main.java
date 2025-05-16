
// LECCIÓN 3 -
public class Main {
    public static void main(String[] args) {

        //LECCIÓN 3 INVVOAR LOS MÉTODOS GETTER DE LOS ATRIBUTOS PRIVADOS....getMarca(), getModelo() y getColor().
        Coche coche1 = new Coche("TOYOTA","COROLLA","ROJO");
        System.out.println("MI PRIMER COCHE ES UN  " + coche1.getMarca()+ "- " + coche1.getModelo()+"- "+ coche1.getColor());
        coche1.acelerar(80);
        coche1.acelerar(30);
        coche1.frenar(70);
        System.out.println("VELOCIDAD ACTUAL ES : " + coche1.obtenerVelocidad() + " km/h.");
        coche1.frenar(40);
        System.out.println("LA VELOCIDAD ACTUAL ES" + coche1.obtenerVelocidad()+ "  km/h");

        Coche coche2 = new Coche("FORD","FOCUS","AZUL");
        System.out.println("MI SEGUNDO COCHE ES UN "+ coche2.getMarca()+ "- "+ coche2.getModelo() + "- "+ coche2.getColor());
        coche2.acelerar(50);
        coche2.acelerar(70);
        coche2.frenar(100);
        System.out.println("VELOCIDAD ACTUAL ES : " + coche2.obtenerVelocidad() + " km/h.");
        coche1.frenar(30);
        System.out.println("LA VELOCIDAD ACTUAL ES = " + coche2.obtenerVelocidad()+ "  km/h");



    }
}
