package com.balaji.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProductRequest {
	private String name;
    private String description;
    private BigDecimal price;
}
