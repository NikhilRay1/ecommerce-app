package Ecommerce.App.repositories;


import Ecommerce.App.model.AppRole;
import Ecommerce.App.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
