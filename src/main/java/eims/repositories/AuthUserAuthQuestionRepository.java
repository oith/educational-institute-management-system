package eims.repositories;

import eims.model.security.AuthUserAuthQuestion;
import java.math.BigInteger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthUserAuthQuestionRepository extends JpaRepository<AuthUserAuthQuestion, BigInteger> {

}
