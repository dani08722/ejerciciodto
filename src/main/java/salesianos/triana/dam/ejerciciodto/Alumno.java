package salesianos.triana.dam.ejerciciodto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Alumno {

    private Long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String email;
    private Direccion direccion;
    private Curso curso;

    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();

    public String getApellidos(){
        return apellido1+" "+apellido2;
    }
}
