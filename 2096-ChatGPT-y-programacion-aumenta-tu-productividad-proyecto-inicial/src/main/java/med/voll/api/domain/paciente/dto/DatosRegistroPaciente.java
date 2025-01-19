package med.voll.api.domain.paciente.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import med.voll.api.domain.direccion.DatosDireccion;


public record DatosRegistroPaciente(
        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String email,

        @Pattern(regexp = "\\d{10}")
        @NotBlank
        String telefono,

        @Pattern(regexp = "\\d{13}") //Se cambió para darle el formato de INE mexicano
        @NotBlank
        String documento,

        @NotNull @Valid DatosDireccion direccion) {
}
