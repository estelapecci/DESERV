package com.daw.crudapi.model;
 
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
 
@Entity
@Table(name = "log_accion")
@Getter @Setter
public class LogAccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private LocalDateTime fecha;
    private String accion;   // CREAR, MODIFICAR, ELIMINAR, ASOCIAR...
    private String entidad;  // Cliente, Pedido
    private Long entidadId;
    private String detalle;
}
 

