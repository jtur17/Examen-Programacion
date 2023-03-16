package ExamenJava.POO;

public class pesquero implements barcos {
    private Integer metrosEslora;
    private Integer potencia;
    private Integer numPescadores;

    public pesquero(Integer metrosEslora, Integer potencia, Integer numPescadores) {
        this.metrosEslora = metrosEslora;
        this.potencia = potencia;
        this.numPescadores = numPescadores;
    }

    @Override
    public void alarma() {
        System.out.println("Mensaje enviado desde el barco pesquero");
    }

    @Override
    public void mensajeSocorro(String cadena){
        alarma();
        System.out.println(cadena);
    }

    // Creamos el toString()
    public String toString(){
        return "Esto es un barco pesquero y los metros de eslora es de " + metrosEslora +
        " metros y la potencia es de " + potencia + " y tiene un número de pescadores de " +
        numPescadores;
    }
}
