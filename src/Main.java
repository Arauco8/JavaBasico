import java.util.HashMap;
import java.util.Map;

public class Main {

    /**
     * Punto de entrada a la aplicacion java
     * permite ejecutar la aplicación
     * @param args - argumentos de entrada para la aplicación
     *
     */

    public static void main(String[] args) {

        //MAP
        Map<String, String> personas = new HashMap<>();

        personas.put("Juan", "Perez");
        personas.put("Pedro", "Gomez");
        personas.put("Maria", "Leiva");

        System.out.println(personas);

        for(String key : personas.keySet()){
            System.out.println(key);
        }
        System.out.println("------------------------------------------------------");
        for(String key : personas.values()){
            System.out.println(key);
        }
        System.out.println("------------------------------------------------------");
        for(Map.Entry<String, String> entry : personas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Try Catch finally Captura y Gestion de Errores
        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }finally {
            // Se Ejecuta asi se haya ido bien o mal en el try catch
            System.out.println("Cierre de recursos");
        }

        System.out.println("final");

        // throws  asignar al metodo que lanza una excepciones
        //throw palabra para crearla y lanzarla


    }
}