package org.example.foodapp.email.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.foodapp.enums.NotificationType;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@Table(name = "notifications")
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String Subject;

    private String Body;

    private String To;

    private NotificationType type;

    private final LocalDateTime date = LocalDateTime.now();

    private boolean isHtml;
}
