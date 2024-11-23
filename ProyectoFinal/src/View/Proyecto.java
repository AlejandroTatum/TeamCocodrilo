package View;

import java.util.Scanner;

public class Proyecto {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("--BIENVENIDO al menu Proporcocina--");
        System.out.println("Seleccione el número perteneciente a cada opcion.");
        System.out.println("1. Pan casero");
        System.out.println("2. Galletas de mantequilla");
        System.out.println("3. Ingresa tu propia receta");
        System.out.println("4. Salir del menu");
        opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("-PAN CASERO-");
                System.out.println("a)Harina de trigo 500g");
                    System.out.println("b)Agua 325ml");
                    System.out.println("c)Levadura seca 15g");
                    System.out.println("d)Azucar 10g");
                    System.out.println("e)Aceite de oliva 45ml");
                    break;
                case 2:
                System.out.println("-GALLETAS DE MANTEQUILLA-");
                System.out.println("a)Harina de trigo 250g");
                System.out.println("b)Azucar 100g");
                System.out.println("c)Mantequilla 50g");
                System.out.println("d)Polvo de hornear 5g");
                System.out.println("e)Sal 2,5g");
                    
                    break;
                case 3:
                int numingredientes = 0;
                float ingrediente = 0;

                System.out.println("Ingrese el número de ingredientes de su receta:");
                numingredientes = sc.nextInt();
                for(int i = 0; i<=numingredientes; i++){
                    System.out.println("Ingrese el ingrediente");
                    ingrediente = sc.nextFloat();

                }
                    break;
                case 4:
                    System.out.println("El programa a finalizado.");
                    break;
            
                default:
                System.out.println("Porfavor ingrese un numero del 1 al 4.");
                    break;
            }
        } while (opcion != 4);
        sc.close();
    }
    
    
}
