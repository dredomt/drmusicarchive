package stop.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtResponse {

    private String token;
    private String type = "Bearer";

    // Additional fields can be added, like roles or expiration time if needed

    public JwtResponse(String token) {
        this.token = token;
    }

}
