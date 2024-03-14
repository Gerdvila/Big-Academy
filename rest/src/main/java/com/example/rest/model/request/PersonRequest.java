package com.example.rest.model.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;



public record PersonRequest (

    @NotNull
    @Size(min = 3, max=20, message = "First name length should be in the range(3,20]")
    @Schema(description = "Person first name", example = "Vardenis")
    String firstName,

    @Schema(description = "Person last name", example = "Pavardenis")
    String lastName,

    @Pattern(regexp = "^(.+)@(.+)$", message = "Email must be valid")
    @Schema(description = "Person email", example = "email@gmail.com")
    String email,

    @Pattern(regexp = "^(\\+3706\\d{9})$",message = "Phone number must start with +3706 and have 11 digits")
    @Schema(description = "Person phone", example = "+37061111111")
    String phone
){}
