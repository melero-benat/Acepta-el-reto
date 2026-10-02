import java.util.ArrayList;


public class reto102{
    
    //pedir  entrada descodificada codificada con p al principio
    //Entrada de ejemplo
    //pEsta cadena esta sin codificar
    //pfin
    //qbfjpvBFJPV
    //ozdhntZDHNT
    //xXzwoziui-Um
    //qGJO

    //el archivo caba cuando reciba la palabra fin codificada
    //cuando lo haga tiene que devolver cuantas vocales habia en cada uno de los mensajes

    //decodificar usando la primera letra a la p y contando el numero

    //usar ese mismo numero para decodificar las palabras hasta que una palabra decodificada de pfin

    //contar cantidad de vocales  en cada linea y printear

    public static void main(String[] args) {
        
        java.util.Scanner input = new java.util.Scanner(System.in);
        String mensaje = " ";
        int letras = 0, vocales = 0, letra_ahora;
        ArrayList<String> salida = new ArrayList<>();
        while (!mensaje.equals("pfin")) {
            vocales = 0;
            System.out.println("Mete el mensaje codificado con una p al principio y la ultima linea, para terminar el programa, tiene que ser un pfin");
            mensaje = input.nextLine();
            while (mensaje == ""){
                System.out.println("Mete el mensaje codificado con una p al principio y la ultima linea, para terminar el programa, tiene que ser un pfin");
                mensaje = input.nextLine();
            }
            letras = 0;
            char primeraletra = mensaje.charAt(0);

            while (primeraletra != 'p' ){
                if (primeraletra > 'p' ){
                   letras = letras-1;
                    primeraletra = (char) (primeraletra - 1);
                } else if (primeraletra < 'p' ){
                    letras = letras+1;
                    primeraletra = (char) (primeraletra + 1);
                }
                
                
            }
            for (int i = 0; i < mensaje.length(); i++) {
                if (letras < 0){
                    for (int n = 0; n < letras; n++){
                        letra_ahora = (mensaje.charAt(i) - 1); 
                    }
                } else if (letras > 0) {
                    for (int n = 0; n > letras; n--){
                        letra_ahora = (mensaje.charAt(i) + 1); 
                         
                    }
                    
                }
                
                if (mensaje.charAt(i) == 'a' ||  mensaje.charAt(i) == 'e' || mensaje.charAt(i) == 'i' ||  mensaje.charAt(i) == 'o' || mensaje.charAt(i) == 'u' || mensaje.charAt(i) == 'A' ||  mensaje.charAt(i) == 'E' || mensaje.charAt(i) == 'I' ||  mensaje.charAt(i) == 'O' || mensaje.charAt(i) == 'U'){
                    vocales = vocales + 1;
                }
                
            }
            
            salida.add(String.valueOf(vocales));
            System.out.println(vocales);
        }
        System.out.println(salida);
        input.close();
    }
}

