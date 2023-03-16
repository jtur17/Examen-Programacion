package ExamenJava.POO;

public class crucero implements barcos{
    private Integer metrosEslora;
    public static Integer contador;

    // constructor
    
    public crucero(Integer metrosEslora) {
        this.metrosEslora = metrosEslora;
    }

    @Override
    public void alarma() {
        System.out.println("Mensaje enviado desde el crucero");
    }

    @Override
    public void mensajeSocorro(String cadena){
        alarma();
        System.out.println(cadena);
    }

    // Creamos el toString
    public String toString(){
        return "Esto es un crucero y el metro de eslora es de " + metrosEslora;
    }

    



// metodos que podran ser accedido desde fuera de la clase
}
