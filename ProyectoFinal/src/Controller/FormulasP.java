package controller.ejercicios;

public class ConversionResult {
    public double g;
    public double kg;
    public double lb;
    public double oz;
    public double tazas;
    public double cda;
    public double cdta;
    public double toneladas;
    public double ml;
    public double gal;
    public double lt;

    public ConversionResult gramostoUnidades(double gramos){
        ConversionResult result = new ConversionResult();
        result.kg = gramos/ 1000;
        result.lb = gramos/ 453.592;
        result.oz = gramos/ 28.3495;
        result.tazas = gramos/ 236.588;
        result.cda = gramos/ 15;
        result.cdta = gramos/ 4.92892;
        result.toneladas = gramos/ 1000000;

        return result;
    }
    public ConversionResult kgtoUnidades(double kg){
        ConversionResult result = new ConversionResult();
        result.g = kg * 1000;
        result.lb = kg * 2.20462;
        result.oz = kg * 35.274;
        result.tazas = kg * 7.8125;
        result.cda = kg * 66.6667;
        result.cdta = kg * 200;
        result.toneladas = kg * 1000;

        return result;
    }
    public ConversionResult lbtoUnidades(double lb){
        ConversionResult result = new ConversionResult();
        result.kg = lb / 2.20462;
        result.g = lb * 453.592;
        result.oz = lb * 16;
        result.tazas = lb / 1.91722;
        result.cda = lb / 30.6667;
        result.cdta = lb * 92;
        result.toneladas = lb / 2204.62;

        return result;
    }
    public ConversionResult oztoUnidades(double oz){
        ConversionResult result = new ConversionResult();
        result.kg = oz /35.274;
        result.lb =oz/ 16;
        result.g =oz *28.3495;
        result.tazas =oz /4.5;
        result.cda =oz / 0.5333;
        result.cdta =oz / 0.1667;
        result.toneladas =oz /35274;

        return result;
    }
    public ConversionResult tazastoUnidades(double tazas){
        ConversionResult result = new ConversionResult();
        result.kg = tazas / 7.8125;
        result.lb = tazas * 0.537;
        result.oz = tazas * 4.5;
        result.g = tazas * 128;
        result.cda = tazas * 16;
        result.cdta = tazas * 48;
        result.toneladas = tazas / 7812.5;

        return result;
    }
    public ConversionResult cdatoUnidades(double cda){
        ConversionResult result = new ConversionResult();
        result.kg = cda / 66.6667;
        result.lb = cda / 30.6667;
        result.oz = cda / 0.5333;
        result.tazas = cda / 16;
        result.g = cda * 15;
        result.cdta = cda * 3;
        result.toneladas = cda / 666666.7;

        return result; 
    }
    public ConversionResult cdtatounidades(double cdta){
        ConversionResult result = new ConversionResult();
        result.kg = cdta / 200;
        result.lb = cdta / 92;
        result.oz = cdta / 0.1667;
        result.tazas = cdta / 48;
        result.cda = cdta / 3;
        result.g = cdta * 5;
        result.toneladas = cdta / 200000;

        return result;
    }
    public ConversionResult toneladastoUnidades(double toneladas){
        ConversionResult result = new ConversionResult();
        result.kg = toneladas * 1000;
        result.lb = toneladas * 2204.62;
        result.oz = toneladas * 35274;
        result.tazas = toneladas * 7812.5;
        result.cda = toneladas * 66666.7;
        result.cdta = toneladas * 200000;
        result.g = toneladas * 2000000;

        return result;
    }
    public ConversionResult lttoUnidades(double lt){
        ConversionResult result = new ConversionResult();
        result.ml = lt * 1000;
        result.gal = lt * 0.264172;
        
        return result;
    }
    public ConversionResult mltoUnidades(double ml){
        ConversionResult result = new ConversionResult();
        result.lt = ml / 1000;
        result.gal = ml /  378541;

        return result;
    }
    public ConversionResult galtoUnidades(double gal){
        ConversionResult result = new ConversionResult();
        result.lt = gal * 3.78541;
        result.ml = gal * 3785.41;

        return result;
    }

}
