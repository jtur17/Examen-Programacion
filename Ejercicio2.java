package ExamenJava;

class Ejercicio2{
    public static void main(String[] args){
        String[] dni = {"0","3","4","4","5","0","8","5","Z"};
        System.out.println("El formato del dni es: "+tieneFormatoNIF(dni));
    }

    public static boolean tieneFormatoNIF(String[] dni){
        if (dni.length != 9){
            return false;
        }

        // Miramos si la letra es mayuscula 
        if (esLetraMayuscula(dni[8].charAt(0)) == false){
            return false;
        } else {
            // Miramos si los números están bien
            for (int i = 0; i < 7; i++){
                if (esDigito(dni[i].charAt(0)) == false){
                    return false;
                }
            }
        }
        return true;
    }
    
    static boolean esLetraMayuscula (char caracter){
        return 'A' <= caracter && caracter <= 'Z';
    }

    static boolean esDigito (char caracter){
        return '0' <= caracter && caracter <= '9'; //Devuelve true si es un dígito
    }

}