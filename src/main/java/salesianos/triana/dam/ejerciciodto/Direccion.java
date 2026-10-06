package salesianos.triana.dam.ejerciciodto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Direccion {

    private Long id;
    private String tipoVia;
    private String linea1;
    private String linea2;
    private String cp;
    private String poblacion;
    private String provincia;

    public String formatearDireccion(){
        return cp+" "+poblacion+" "+ provincia+" "+tipoVia+" "+linea1+" "+linea2;
    }

}
