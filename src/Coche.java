
//practica lección 3  - encapsulamiento de atributos
public class Coche {
    private String marca;
    private String modelo;
    private String color;        //Sesión 1 -
    private int velocidadActual;

    //Crea un constructor para la clase Coche que reciba la marca, el modelo y el color como parámetros y
    // los asigne a los atributos correspondientes, inicializando velocidadActual en 0.
    // Utiliza la palabra clave this para referirte a los atributos de la clase, para diferenciarlos de los
    //parametros del constructor

    public Coche(String marcaInicial, String modeloInicial, String colorInicial){   //parametros del constructor
    this.marca = marcaInicial;
    this.modelo = modeloInicial;
    this.color = colorInicial;
    this.velocidadActual = 0;
    }

    //crear métodos setter y getter de los atributos encapsulados
    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    // Setters (para algunos atributos)
    public void setColor(String color) {
        this.color = color;
    }

    public void setVelocidadActual(int velocidadActual) {
        if (velocidadActual >= 0) {
            this.velocidadActual = velocidadActual;
        } else {
            System.out.println("La velocidad no puede ser negativa.");
        }
    }

//CREAR LOS MÉTODOS acelerar(), frenar(), obtenerVelocidad():

    // Método para acelerar el coche
    public void acelerar(int incremento) {
        this.velocidadActual += incremento;
        //+=  atajo de escritura: equivale a this.velocidadActual = this.velocidadActual + incremento;.
        System.out.println(this.marca + " " + this.modelo + " acelera a " + this.velocidadActual + " km/h.");
    }

    // Método para frenar el coche
    public void frenar(int decremento) {
        if (this.velocidadActual >= decremento) {
            this.velocidadActual -= decremento;
            System.out.println(this.marca + " " + this.modelo + " frena a " + this.velocidadActual + " km/h.");
        } else {
            this.velocidadActual = 0;
            System.out.println(this.marca + " " + this.modelo + " se ha detenido.");
        }
    }
    // Método para obtener la velocidad actual
    public int obtenerVelocidad() {     //int: El método devuelve un valor de tipo entero (int), que en este caso es la velocidad.
        return this.velocidadActual;  //el metodo devuelve o retorna el valor al ser llamado.
    }
}

