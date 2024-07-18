package org.example.jdbcconnectionwithjakartaee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User {
    private int id;
    private String last_name;
    private String first_name;
    private String password;
}