package eims.repositories;

import eims.model.security.AuthRole;
import java.math.BigInteger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRoleRepository extends JpaRepository<AuthRole, BigInteger> {

}
