package registration.uz.hgpuserregistration.Registration.Model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
public class LoginRequest {
    private String login;
    private String password;
}
