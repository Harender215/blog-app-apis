package com.blog.application.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	private Integer categoryId;
	
	@NotBlank
	@Size(min = 4, max = 20, message = "Minimum size of category title is 4")
	private String categoryTitle;
	
	@NotBlank
	@Size(min = 10, max=100, message = "Minimum size of category description is 10")
	private String categoryDescription;
}
