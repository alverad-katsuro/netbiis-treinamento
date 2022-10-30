package com.curso4.unidade3.model;

import java.time.LocalDateTime;

public record Venda (int cliente_id, int curso_id, LocalDateTime dataCompra){}
