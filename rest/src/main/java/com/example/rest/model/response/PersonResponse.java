package com.example.rest.model.response;

import io.swagger.v3.oas.annotations.media.Schema;

public record PersonResponse (
    @Schema(description = "person name", example = "Vardenis")
    String firstName,
    @Schema(description = "person last name", example = "Pavardenis")
    String lastName,
    @Schema(description = "email", example = "a@mial.com")
    String email,
    @Schema(description = "phone", example = "+37061111111")
    String phone){}

