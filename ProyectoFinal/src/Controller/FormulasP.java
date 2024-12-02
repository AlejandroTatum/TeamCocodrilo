package controller.ejercicios;
public class FormulasProyecto {
    public double gramostoUnidades (double gramos) {
        double gTokg =gramos/1000;
        double gTolb = gramos/ 453.592;
        double gTooz = gramos/ 28.3495;
        double gTotazas = gramos/ 236.588;
        double gTocda = gramos/ 15;
        double gTocdta = gramos/ 4.92892;
        double gTotoneladas = gramos/ 1000000;
    return gTokg; return gTolb; return gTooz; return gTotazas; return gTocda; return gTocdta; return gTotoneladas;
    }

    public static double kgtoUnidades (double kg ) {
        double kgTog = kg * 1000;
        double kgTolb = kg * 2.20462;
        double kgTooz = kg * 35.274;
        double kgTotaza = kg * 7.8125;
        double kgTocda = kg * 66.6667;
        double kgTocdta = kg * 200;
        double kgTotoneladas = kg / 1000;

        return kgTog; return kgTolb; return kgTooz; return kgTotaza; return kgTocda; return kgTocdta; return kgTotoneladas;
    }
    public double lbToUnidades ( double lb){
        double lbTokg =lb /2.20462;
        double lbTog =lb*453.592;
        double lbTokoz =lb *16;
        double lbTotaza =lb /1.91722;
        double lbTocda =lb * 30.6667;
        double lbTocdta =lb * 92;
        double lbTotoneldas =lb /2204.62;
        return lbTokg; return lbTog; return lbTokoz; return lbTotaza; return lbTocda; return lbTocdta; return lbTotoneldas;
    }
    public double ozToUnidades ( double oz){
        double ozTokg = oz /35.274;
        double ozTolb =oz/ 16;
        double ozTog =oz *28.3495;
        double ozTotaza =oz /4.5;
        double ozTocda =oz / 0.5333;
        double ozTocdta =oz / 0.1667;
        double ozTotoneldas =oz /35274;
        return ozTokg; return ozTolb; return ozTog; return ozTotaza; return ozTocda; return ozTocdta; return ozTotoneldas;
    }
    public double tazasToUnidades (double tazas){
        double tazasTokg = tazas/7.8125;
        double tazasTolb = tazas*0.537;
        double tazasTooz = tazas*4.5;
        double tazasTog = tazas*128;
        double tazasTocda = tazas*16;
        double tazasTocdta = tazas*48;
        double tazasTotonaladas = tazas/7812.5;
        return tazasTokg, tazasTolb, tazasTooz, tazasTog, tazasTocda, tazasTocdta, tazasTotonaladas;
    }
    public double cdaToUnidades (double cda){
        double cdaTokg = cda/ 66.6667;
        double cdaTolb = cda/ 30.6667;
        double cdaTooz = cda/ 0.5333;
        double cdaTotaza = cda/ 16;
        double cdaTog = cda * 15;
        double cdaTocdta = cda * 3;
        double cdaTotoneladas = cda / 666666.7
        return cdaTokg, cdaTolb, cdaTooz, cdaTotaza, cdaTog, cdaTocdta, cdaTotoneladas;
    }
    public double cdtaToUnidades (double cdta){
        double cdtaTokg = cdta / 200;
        double cdtaTolb = cdta / 92;
        double cdtaTooz = cdta / 0.1667;
        double cdtaTotazas = cdta / 48;
        double cdtaTocda = cdta / 3;
        double cdtaTog = cdta *5;
        double cdtaTotoneladas = cdta / 200000;
        return cdtaTokg, cdtaTolb, cdtaTooz,cdtaTotazas, cdtaTocda, cdtaTog, cdtaTotoneladas;
    }
    public double toneladasToUnidades (double toneladas){
        double toneldasTokg = toneladas * 1000;
        double toneldasTolb = toneladas * 2204.62;
        double toneldasTooz = toneladas * 35274;
        double toneldasTotaza = toneladas * 7812.5;
        double toneldasTocda = toneladas * 66666.7;
        double toneldasTocdta = toneladas * 200000;
        double toneldasTog = toneladas * 2000000;
        return toneldasTokg, toneldasTolb, toneldasTooz, toneldasTotaza, toneldasTocda, toneldasTocdta, toneldasTog;
    }
    public static void main(String[] args) {
        System.out.println("es"+ toneladasToUnidades);
    }
}