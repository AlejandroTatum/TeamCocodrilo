/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecetaKC;

/**
 *
 * @author kathe
 */
public class ConversionResult {
    
    public float g;
    public float kg;
    public float lb;
    public float oz;
    public float tazas;
    public float cda;
    public float cdta;
    public float toneladas;
    public float ml;
    public float gal;
    public float lt;

    public void gramostoUnidades(float gramos) {
        this.kg = Math.round((gramos / 1000) * 100.0f) / 100.0f;
        this.lb = Math.round((gramos / 453.592f) * 100.0f) / 100.0f;
        this.oz = Math.round((gramos / 28.3495f) * 100.0f) / 100.0f;
        this.tazas = Math.round((gramos / 236.588f) * 100.0f) / 100.0f;
        this.cda = Math.round((gramos / 15) * 100.0f) / 100.0f;
        this.cdta = Math.round((gramos / 4.92892f) * 100.0f) / 100.0f;
        this.toneladas = Math.round((gramos / 1000000) * 100.0f) / 100.0f;
    }
    
    public void mililitrostoUnidades (float militros){
        this.lt = Math.round((militros / 1000) * 100.0f) / 100.0f;
        this.gal = Math.round((militros / 3785.41f) * 100.0f) / 100.0f;;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (g != 0.0f) {
            sb.append(String.format("Gramos: %.2f g | ", g));
        }
        if (kg != 0.0f) {
            sb.append(String.format("Kilogramos: %.2f kg | ", kg));
        }
        if (lb != 0.0f) {
            sb.append(String.format("Libra: %.2f lb | ", lb));
        }
        if (oz != 0.0f) {
            sb.append(String.format("Onza: %.2f oz | ", oz));
        }
        if (tazas != 0.0f) {
            sb.append(String.format("Tazas: %.2f tazas | ", tazas));
        }
        if (cda != 0.0f) {
            sb.append(String.format("Cucharada: %.2f cda | ", cda));
        }
        if (cdta != 0.0f) {
            sb.append(String.format("Cucharadita: %.2f cdta | ", cdta));
        }
        if (toneladas != 0.0f) {
            sb.append(String.format("Toneladas: %.6f toneladas | ", toneladas));
        }
        if (ml != 0.0f) {
            sb.append(String.format("Mililitros: %.2f ml | ", ml));
        }
        if (gal != 0.0f) {
            sb.append(String.format("Galones: %.2f gal | ", gal));
        }
        if (lt != 0.0f) {
            sb.append(String.format("Litros: %.2f lt | ", lt));
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 3);
        }
        return sb.toString();
    }

}
