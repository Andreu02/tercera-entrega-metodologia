package ejercicio3;



import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static boolean fichero(String operacion, String fichero) {
        boolean res = false;
        Gson gson = new Gson();

        switch (operacion) {
            case "init": {
                Coche coche1 = new Coche("Toyota", "Corolla", 2020);
                Coche coche2 = new Coche("Honda", "Civic", 2022);
                CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 15000.50, "Ahorro");
                Cliente cliente = new Cliente("Juan Pérez", Arrays.asList(coche1, coche2), cuenta);

                guardarObjetoEnArchivo(fichero, cliente);
                System.out.println("Archivo creado con cliente.");
                res = true;

            }

            case "show": {
                Cliente cliente = cargarObjetoDesdeArchivo(fichero, Cliente.class);
                if (cliente != null) {
                    System.out.println("Nombre del cliente: " + cliente.getNombre());
                    System.out.println("Cuenta:");
                    System.out.println(" - Titular: " + cliente.getCuentaBancaria().getTitular());
                    System.out.println(" - Saldo: " + cliente.getCuentaBancaria().getSaldo());
                    System.out.println(" - Tipo: " + cliente.getCuentaBancaria().getTipo());

                    System.out.println("Coches:");
                    for (Coche c : cliente.getCoches()) {
                        System.out.println(" - Marca: " + c.getMarca());
                        System.out.println(" - Modelo: " + c.getModelo());
                        System.out.println(" - Año: " + c.getAnio());
                    }
                    res = true;
                }

            }

            default:
                System.out.println("Operación no válida. Usa 'init' o 'show'.");
        }
        return res;
    }

    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // Mostrar argumentos recibidos
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            sb.append("Argumento " + i + ": " + args[i] + "\n");
        }
        System.out.println("Argumentos: \n" + sb);

        // Ejecutar lógica si se pasaron correctamente los parámetros
        if (args.length == 2) {
            fichero(args[0], args[1]);
        } else {
            System.out.println("Uso correcto: java -jar TuProyecto.jar <init/show> <fichero>");
        }
    }
}



//Cuando tienes objetos dentro de otros objetos lo que ocurre es que el objeto que está dentro del otro se convierte en un subobjeto
//y estos subobjetos se van convirtiendo en arreglos de json siguiendo su estructura