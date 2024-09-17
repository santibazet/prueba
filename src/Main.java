import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try {
            String ruta = "C:\\Users\\santi\\IdeaProjects\\JsonEjercicio2\\src\\config.json";

            File file = new File(ruta);
            Scanner scanner = new Scanner("config.json");
            Config config = gson.fromJson(String.valueOf(scanner), Config.class);
            System.out.println("Error, no se encontro el archivo");
        }catch (JsonSyntaxException js)
        {
            System.out.println("Error, formato incorrecto");
        }catch (Exception e)
        {
            System.out.println("Error inserperado");
        }
        System.out.println("Holaaa");
        System.out.println("Holaaa");
        System.out.println("Holaaa");
        System.out.println("Holaaa");
        System.out.println("Holaaa");
        System.out.println("Holaaa");
        System.out.println("Holaaa");
        System.out.println("Holaaa");
    }
}

