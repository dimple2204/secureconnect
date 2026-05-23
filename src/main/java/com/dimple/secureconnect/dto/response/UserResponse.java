package com.dimple.secureconnect.dto.response;

import com.dimple.secureconnect.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private UUID ID;
    private String name;
    private String email;
    private Set<String> roles;
    private LocalDateTime createdAt;

}
