package ExamenJava.POO;

public class Main {
    public static void main(String[] args){
        crucero crucero1 = new crucero(50);
        System.out.println(crucero1);
        crucero1.alarma();
        crucero1.mensajeSocorro("Ayudaa!!");

        pesquero pesquero1 = new pesquero(50, 100, 20);
        System.out.println(pesquero1);
        pesquero1.alarma();
        pesquero1.mensajeSocorro("Nos hundimos!!");

        portaaviones portaaviones1 = new portaaviones(10, 4);
        System.out.println(portaaviones1);
        portaaviones1.alarma();
        portaaviones1.mensajeSocorro("Estamos perdidos!");
    }
}
