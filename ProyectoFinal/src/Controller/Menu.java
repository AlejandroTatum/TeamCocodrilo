package Controller;
import Controller.Util.Utilidades;
import java.util.ArrayList;
import java.util.List; 
import java.util.Scanner;
public class Menu{
    private List<Recetas> recetas;
    public Menu(){
        recetas = new ArrayList<>();

        Recetas panCasero = new Recetas("Pan Casero");
        panCasero.agregarIngredientes(new Ingrediente("Harina de trigo", 500, "g"));
        panCasero.agregarIngredientes(new Ingrediente("Agua", 300, "ml"));
        panCasero.agregarIngredientes(new Ingrediente("Levadura seca", 15, "g"));
        panCasero.agregarIngredientes(new Ingrediente("Azucar", 10, "g"));
        panCasero.agregarIngredientes(new Ingrediente("Aceite de oliva", 45, "ml"));

        Recetas galletasMantequilla = new Recetas("Galletas de mantequilla");
        galletasMantequilla.agregarIngredientes(new Ingrediente("Harina de trigo", 250, "g"));
        galletasMantequilla.agregarIngredientes(new Ingrediente("Azucar", 100, "g"));
        galletasMantequilla.agregarIngredientes(new Ingrediente("Mantequilla", 50, "g"));
        galletasMantequilla.agregarIngredientes(new Ingrediente("Polvo para hornear", 5, "g"));
        galletasMantequilla.agregarIngredientes(new Ingrediente("Sal", 2.5f, "g"));

        recetas.add(panCasero);
        recetas.add(galletasMantequilla);
    }

    public void runMenu(){
        int option;
        do{
            System.out.println("--RECETARIO--");
            showMenu();
            option = readInt("Ingrese una opcion: ");
            handleMenuOption(option);
        } while(option!=0);
    }

    public int readInt(String mensaje){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print(mensaje);
            String entrada = sc.next();
            if(Utilidades.validarInt(entrada)){
                return Utilidades.transformStringInt(entrada);
            } else{
                System.out.println("Valor incorrecto, vuelva a ingresar...");
            }
        }
    }
    public float readFloat(String mensaje){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print(mensaje);
            String entrada = sc.next();
            if(Utilidades.validarFloat(entrada)){
                return Utilidades.transformStringFloat(entrada);
            }else{
                System.out.println("Valor incorrecto, vuelva a ingresar...");
            }
        }
    }
    public void showMenu(){
        System.out.println("0. Salir");
        System.out.println("1. Ver recetas");
        System.out.println("2. Ingresar receta");
    }
    public void handleMenuOption(int option){
        switch (option){
            case 1:
                System.out.println("RECETAS");
                System.out.println("1. Pan casero");
                System.out.println("2. Galletas de mantequilla");
                int optionRecetas = readInt("Ingrese una opcion: ");
                menuRecetas(optionRecetas);
                break;
            case 2:
        }
    }

    public void menuRecetas(int option){
        int optionIngrediente;
        switch (option){
            case 1:
                recetas.get(0).showIngredientes();
                optionIngrediente = readInt("Ingrese el numero del ingrediente con el que se va a trabajar: ");

                break;
            case 2:
                recetas.get(1).showIngredientes();
                optionIngrediente = readInt("Ingrese el numero del ingrediente con el que se va a trabajar: ");
                break;
        }
    }

}

