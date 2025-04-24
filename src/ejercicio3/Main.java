package ejercicio3;

import com.google.gson.Gson;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear coches
        Coche coche1 = new Coche("Toyota", "Corolla", 2020);
        Coche coche2 = new Coche("Honda", "Civic", 2022);

        // Crear cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 15000.50, "Ahorro");

        // Crear cliente con una lista de coches
        Cliente cliente = new Cliente("Juan Pérez", Arrays.asList(coche1, coche2), cuenta);

        // Crear objeto Gson
        Gson gson = new Gson();

        // Convertir el objeto Cliente a JSON
        String clienteJson = gson.toJson(cliente);

        // Mostrar el JSON resultante
        System.out.println("Cliente convertido a JSON:");
        System.out.println(clienteJson);
    }
}


//Cuando tienes objetos dentro de otros objetos lo que ocurre es que el objeto que está dentro del otro se convierte en un subobjeto
//y estos subobjetos se van convirtiendo en arreglos de json siguiendo su estructura