package core.core2.dbs.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import core.core2.dbs.models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
