package ExamenJava.POO;

public class portaaviones implements barcos {
    private Integer aviones;
    private Integer marinos;

    portaaviones(Integer aviones, Integer marinos){
        this.aviones = aviones;
        this.marinos = marinos;
    }

    // Getters
    public Integer getAviones(){
        return aviones;
    }

    public Integer getMarinos() {
        return marinos;
    }

    // Setters
    public void setAviones(Integer aviones){
        this.aviones = aviones;
    }

    public void setMarinos(Integer marinos){
        this.marinos = marinos;
    }

    @Override
    public void alarma() {
        System.out.println("Mensaje enviado desde el barco portaaviones");
    }


    @Override
    public void mensajeSocorro(String cadena){
        alarma();
        System.out.println(cadena);
    }

    // Creamos el toString
    public String toString(){
        return "Esto es un barco portaaviones y puede almacenar " + aviones + " aviones y " +
        marinos + "marinos";
    }

    
}
