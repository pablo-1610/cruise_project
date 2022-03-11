package fr.cruiseapp.api.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class HTTPAuth {
    private final String email;
    private final String password;
}
