package salesianos.triana.dam.ejerciciodto;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class MainDeMentira {

    @PostConstruct
    public void main() {

        System.out.println("Iniciando MainDeMentira...");

        // Creamos un curso
        Curso curso = new Curso(
                1L,
                "1º DAM",
                "Grado Superior",
                "Antonio",
                "Aula 3"
        );

        // Creamos una dirección
        Direccion direccion = new Direccion(
                1L,
                "Calle",
                "Mayor 25",
                "",
                "41001",
                "Sevilla",
                "Sevilla"
        );

        // Creamos un alumno
        Alumno alumno = Alumno.builder()
                .id(1L)
                .nombre("Juan")
                .apellido1("García")
                .apellido2("López")
                .telefono("600123456")
                .email("juan@gmail.com")
                .direccion(direccion)
                .curso(curso)
                .build();

        // Transformamos Alumno -> AlumnoDTO
        AlumnoDTO alumnoDTO = AlumnoDTO.of(alumno);

        System.out.println(alumnoDTO);

    }
}