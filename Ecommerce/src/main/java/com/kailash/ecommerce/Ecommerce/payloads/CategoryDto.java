package com.kailash.ecommerce.Ecommerce.payloads;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

    private Integer categoryId;
    @NotEmpty
    @Size(min = 4, message = "Title size must be greater than 4.")
    private String categoryTitle;
    @NotEmpty
    @Size(min = 10, message = "Description size must be greater than 10.")
    private String categoryDescription;
}