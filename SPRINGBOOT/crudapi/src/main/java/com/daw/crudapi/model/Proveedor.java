package com.daw.crudapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "proveedor")
@Getter @Setter
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String cif;
    private String email;
    private String telefono;

    @JsonIgnore
    @OneToMany(mappedBy = "proveedor")
    private List<Producto> productos = new ArrayList<>();
}