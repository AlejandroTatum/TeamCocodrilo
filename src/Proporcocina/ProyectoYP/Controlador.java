
package ProyectoYP;

import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author
 */ 
public class Controlador {

    float[] ingredientes = {250, 200, 100 , 50 , 15};
    ConversionResult[] conversor;
    String[] medida = {"gr", "gr", "gr", "gr", "gr"};
    String[] nombres = {"Queso Msscarpone", "Queque", "Azúcar", " Chocolate", "Cafe Molido"};

    public Controlador() {
        this.conversor = new ConversionResult[ingredientes.length];
        for (int i = 0; i < conversor.length; i++) {
            conversor[i] = new ConversionResult();
        }
    }

    public Controlador(float[] ingredientes, String[] medida, String[] nombres) {
        this.ingredientes = ingredientes;
        this.medida = medida;
        this.nombres = nombres;
    }

    public void choose() {
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                int index = 0;

                while ((line = br.readLine()) != null && index < ingredientes.length) {
                    try {
                        ingredientes[index] = Float.parseFloat(line.trim());
                        index++;
                    } catch (NumberFormatException e) {
                        System.out.println("No se pudo convertir: " + line);
                    }
                }
                System.out.println("Datos cargados: " + this.toString());
            } catch (IOException e) {
                System.err.println("Error al leer el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("No se seleccionó ningún archivo.");
        }
    }

    public float[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(float[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String[] getMedida() {
        return medida;
    }

    public void setMedida(String[] medida) {
        this.medida = medida;
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }
    public void modificarIngrediente(int index, float nuevaCantidad) {
        float cantidadOriginal = ingredientes[index];
        float factorEscala = nuevaCantidad / cantidadOriginal;
        ingredientes[index] = nuevaCantidad;
        for (int i = 0; i < ingredientes.length; i++) {
            if (i != index) {
                ingredientes[i] *= factorEscala;
         

            }
         conversor[i].gramostoUnidades(ingredientes[i]);
    
        }}
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nombres.length; i++) {
            String nombre = i < nombres.length ? nombres[i] : "Desconocido";
            float ingrediente = i < ingredientes.length ? ingredientes[i] : 0.0f;
            String unidad = i < medida.length ? medida[i] : "unidad";
            sb.append(String.format("- %s: %.2f %s%n", nombre, ingrediente, unidad));
            if (i < conversor.length && conversor[i] != null) {
                sb.append("  ").append(conversor[i].toString()).append(System.lineSeparator());
            }
        }
        return sb.toString();
        //valor mas nombre 
    }

    }

