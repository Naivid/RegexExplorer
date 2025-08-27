import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ActividadEnCLase {
    public static void main(String[] args) {
        
    String texto = "El valor es 42, la temperatura es 36.6, la respuesta es True, el mensaje es \"Hola\" y la lista es [1, 2, 3]";
        String entero = "\\d+";
        Pattern pattern = Pattern.compile(entero);
        Matcher matcher = pattern.matcher(texto);
        System.out.print("Enteros encontrados: ");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
        System.out.println();
        String flotante = "\\d{1,2}.\\d+";
        Pattern pattern2 = Pattern.compile(flotante);
        Matcher matcher2 = pattern2.matcher(texto);
        System.out.print("float encontrados: ");
        while (matcher2.find()) {
            System.out.print(matcher2.group() + " ");
        }
        System.out.println();

        String booleano = "\\b(True|False)\\b";
        Pattern pattern3 = Pattern.compile(booleano);
        Matcher matcher3 = pattern3.matcher(texto);
        System.out.print("boolan encontrado: ");
        while (matcher3.find()) {
            System.out.print(matcher3.group() + " ");
        }
        System.out.println();

        String cadenaDeTexto = "\"(.*?)\"";
        Pattern pattern4 = Pattern.compile(cadenaDeTexto);
        Matcher matcher4 = pattern4.matcher(texto);
        System.out.print("cadena de texto encontrado: ");
        while (matcher4.find()) {
            System.out.print(matcher4.group() + " ");
        }
        System.out.println();

        String lista = "\\[[\\d\\s,]+\\]";
        Pattern pattern5 = Pattern.compile(lista);
        Matcher matcher5 = pattern5.matcher(texto);
        System.out.print("lista encontrada: ");
        while (matcher5.find()) {
            System.out.print(matcher5.group() + " ");
        }
        System.out.println();
    }
}