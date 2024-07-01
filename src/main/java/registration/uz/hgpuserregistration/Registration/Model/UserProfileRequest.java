package registration.uz.hgpuserregistration.Registration.Model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import registration.uz.hgpuserregistration.Registration.Entity.Gender;

@Data
@Getter
@Setter
@Builder
public class UserProfileRequest {
    @NotEmpty
    private String firstname;
    @NotEmpty
    private String lastname;
    @NotEmpty
    @Size(min = 7)
    private String email;
    @NotEmpty
    private String address;
    @NotEmpty
    @Size(min = 6)
    private String password;
    @NotEmpty
    @Size(min = 9)
    private String passportSerialNumber;
    @NotEmpty
    @Size(min = 12)
    private String phone;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public UserProfileRequest() {

    }

    public UserProfileRequest(String firstname, String lastname, String email, String address, String password, String passportSerialNumber, String phone, Gender gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.password = password;
        this.passportSerialNumber = passportSerialNumber;
        this.phone = phone;
        this.gender = gender;
    }
}
