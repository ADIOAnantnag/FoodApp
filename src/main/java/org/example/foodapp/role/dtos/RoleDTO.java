package org.example.foodapp.role.dtos;

import jakarta.persistence.ManyToMany;
import lombok.Data;
import org.example.foodapp.auth_users.entity.User;

import java.util.List;

@Data
public class RoleDTO {
    String roleID;

    @ManyToMany(,mappedBy = "roles")
    private List<User> users;
}
