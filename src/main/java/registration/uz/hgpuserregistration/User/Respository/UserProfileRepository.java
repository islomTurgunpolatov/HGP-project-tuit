package registration.uz.hgpuserregistration.User.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import registration.uz.hgpuserregistration.User.Entity.UserProfile;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
    UserProfile findByLogin(String login);

    boolean existsByPhone(String phone);

    UserProfile findByPassportSerialNumber(String passportSerialNumber);

    @Query("select count(*) from UserProfile")
    int countAllUsers();

    @Query("select count(*) from UserProfile a where a.enabled=true")
    int countEnabledUsers();

    Optional<UserProfile> findByEmail(String email);
}
