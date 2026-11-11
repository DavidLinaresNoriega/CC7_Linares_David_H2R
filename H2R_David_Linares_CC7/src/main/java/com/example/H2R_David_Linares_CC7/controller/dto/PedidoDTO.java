package com.example.H2R_David_Linares_CC7.controller.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.aspectj.bridge.IMessage;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PedidoDTO {

    @NotBlank(message = "El nombre del Cliente no puede estar vacio")
    private String nombreCliente;

    @NotNull(message = "El numero del pedido no puede estar vacio")
    private Long numeroPedido;

}
