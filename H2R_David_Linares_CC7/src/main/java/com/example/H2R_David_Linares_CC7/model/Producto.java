package com.example.H2R_David_Linares_CC7.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreProducto;
    private String categoria;
    private Integer cantidad;
    private Double precioUnitario;
    private Double total;

    private enum estado{EstadoProducto};

    @ManyToOne
    @JoinColumn(name = "pedidoId")
    private Pedido pedidoId;

}
