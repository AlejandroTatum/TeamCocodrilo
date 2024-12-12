package Controller;

import java.util.ArrayList;
import java.util.List;

public class Recetas{
    private String nombre;
    private List<Ingrediente> ingredientes;

    public Recetas(String nombre){
        this.nombre = nombre;
        this.ingredientes = new ArrayList<>();
    }

    public String getNombre(){
        return nombre;
    }

    public void agregarIngredientes(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }

    public void showIngredientes(){
        System.out.println("Ingredientes para "+nombre+": ");
        int i = 1;
        for(Ingrediente ingrediente : ingredientes){
            System.out.println(i+". "+ingrediente);
            i++;
        }
    }
}