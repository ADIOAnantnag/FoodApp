package org.example.foodapp.auth_users.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data

//ignore the fields that are null and return remaining
@JsonInclude(JsonInclude.Include.NON_NULL)

//ignore properties that are null
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String profileUrl;

//    only used for writing (deserialize)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private boolean isActive;

    private String address;

    private List<RoleDTO>roles;

    private MultipartFile image;

}
