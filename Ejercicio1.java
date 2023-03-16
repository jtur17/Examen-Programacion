package ExamenJava;
import java.util.HashMap;

class Ejercicio1{
    public static void main(String[] args){
        // Añadimos los dni
        String[] dni = {"0","8","9","2","8","8","6","7","F"};

        // Llamamos al metodo esNIFCorrecto
        System.out.println("El Dni es " +esNIFCorrecto(dni));
    }

    
    public static boolean esNIFCorrecto(String[] dni){
        if (dni.length != 9){
            return false;
        }
        
        // Sacamos los numeros del dni 
        String numDNI = "";
        for (int i = 0; i < dni.length -1; i++ ){
            numDNI += dni[i];
        }

        // Pasamos de String a Integer
        Integer numDNI_Integer = Integer.parseInt(numDNI);

        // Ahora tenemos que dividir el número entre 23 y nos quedaremos con el resto

        Integer resto = numDNI_Integer % 23;
        if (letraNif(resto) != dni[8]){
            return false;
        } else {
            return true;
        }
        
    }

    public static String letraNif(Integer num){
         
         if (num >= 0 && num <= 22){
            // Creamos el hasmap asignando la posicion del ultimo numero con la letra
            HashMap<Integer, String> tablaDNI = new HashMap<Integer, String>();
            tablaDNI.put(0, "T");
            tablaDNI.put(1, "R");
            tablaDNI.put(2, "W");
            tablaDNI.put(3, "A");
            tablaDNI.put(4, "G");
            tablaDNI.put(5, "M");
            tablaDNI.put(6, "Y");
            tablaDNI.put(7, "F");
            tablaDNI.put(8, "P");
            tablaDNI.put(9, "D"); 
            tablaDNI.put(10,"X"); 	 	 	 	 	 	  	  	  	  	  	  	  	  	  	  
            tablaDNI.put(11,"B"); 	 	 	 	 	 	  	  	  	  	  	  	  	   
            tablaDNI.put(12,"N"); 
            tablaDNI.put(13,"J");    
            tablaDNI.put(14,"Z");    
            tablaDNI.put(15,"S");   
            tablaDNI.put(16,"Q");   
            tablaDNI.put(17,"V");   
            tablaDNI.put(18,"H");   
            tablaDNI.put(19,"L" );
            tablaDNI.put(20,"C" );
            tablaDNI.put(21,"K" );
            tablaDNI.put(22,"E" );

            // Devolvemos la letra que le pertenece 
            return tablaDNI.get(num);

         } else {
            return "Numero incorrecto";
         }
    }
}