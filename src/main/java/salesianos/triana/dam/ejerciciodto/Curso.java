package salesianos.triana.dam.ejerciciodto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Curso {

    private Long id;
    private String nombre;
    private String tipo;
    private String tutor;
    private String aula;

}
