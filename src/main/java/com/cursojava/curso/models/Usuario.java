package com.cursojava.curso.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //lombok getters y setters
@AllArgsConstructor
@NoArgsConstructor
@Entity //indica que la clase es entidad de la BD
@Table(name="Usuarios") //indica tabla en la BD
public class Usuario {

    @Id //indica primary key de la BD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id") //indica el nombre de la columna en la BD
    private Long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="apellido")
    private String apellido;

    @Column(name="telefono")
    private String telefono;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

}
