package org.example.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class admin {
    private Long id;
    private String name;
    private String job_role;
    private String email;
    private String password;
}
