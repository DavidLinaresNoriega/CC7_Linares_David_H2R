package com.example.H2R_David_Linares_CC7.controller.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductoDTO {

    @NotBlank(message = "El nombre del producto no puede estar vacio")
    private String nombreProducto;

    @NotBlank(message = "La categoria del producto no puede estar vacia")
    private String nombreCategoria;

    @Min(value = 1 , message = "La cantidad del producto tiene que ser mayor a 0")
    private Long cantidad;
}
