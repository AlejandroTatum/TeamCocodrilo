package Controller.Util;

import java.util.Random;

public class Utilidades {

    public static boolean validarInt(String numero) {
        boolean intisValid;
        int numeroLenght = numero.length();
        int i = 0;
        do {
            char c = numero.charAt(i);
            if (Character.isDigit(c)) {
                intisValid = true;
            } else {
                intisValid = false;
                break;
            }
            i++;
        } while (i < numeroLenght);
        return intisValid;
    }

    public static boolean validarFloat(String numero) {
        boolean doubleisValid = false;
        int numeroLenght = numero.length();
        int i = 0, dotCount = 0;
        do {
            char c = numero.charAt(i);
            if (Character.isDigit(c)) {
                doubleisValid = true;
            } else if(numero.charAt(i) == '.' && dotCount < 1) {
                dotCount++;
            } else{
                doubleisValid = false;
                break;
            }
            i++;
        } while (i < numeroLenght);
        return doubleisValid;
    }


    public static int transformStringInt(String num) {
        int resp = 0;
        if(Utilidades.validarInt(num)) {
            resp = (int)Utilidades.transformStringFloat(num);//Integer.parseInt(num);
        }
        return resp;
    }


    public static float transformStringFloat(String num) {
        float resp = 0;
        if(Utilidades.validarFloat(num)) {
            resp = Float.parseFloat(num);
        }
        return resp;
    }

    public static int generaNumeroRango(int minimo, int maximo) {
        Random random = new Random();
        //2 - 10
        //2 + 11 - 2   -----  2 + (9) 
        return minimo + random.nextInt((maximo + 1) - minimo);
    }

    public static float generaNumeroRangoFloat(float minimo, float maximo) {
        Random random = new Random();
        //2 - 10
        //2 + 11 - 2   -----  2 + (9) 
        return minimo + random.nextFloat((maximo + 1) - minimo);
    }

    public static float redondear (float num) {
    float aux = num*100.00f;
    float aux1 = (float)((int)aux); 
    return (aux1/100.00f);
        // return (float)(Math.round(num*100.00)/100.00);
    }
}
