package org.example.foodapp.email.dtos;



import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.foodapp.enums.NotificationType;

import java.time.LocalDateTime;

@Data

@Builder
@Table(name = "notifications")

public class NotificationDTO {

    private long id;

    private String Subject;

    private String Body;

    @NotBlank(message = "email is required")
    private String To;

    private NotificationType type;

    private final LocalDateTime date = LocalDateTime.now();

    private boolean isHtml;
}

