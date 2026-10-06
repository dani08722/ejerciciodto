package salesianos.triana.dam.ejerciciodto;

public record AlumnoDTO(
        String nombre,
        String apellidos,
        String email,
        String curso,
        String direccion
) {

    public static AlumnoDTO of(Alumno alumno) {
        return new AlumnoDTO(
                alumno.getNombre(),
                alumno.getApellidos(),
                alumno.getEmail(),
                alumno.getCurso().getNombre(),
                alumno.getDireccion().formatearDireccion()
        );
    }
}
