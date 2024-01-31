package izeic.diploma.kiberone.repository;

import izeic.diploma.kiberone.models.Resident;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ResidentRepository extends JpaRepository<Resident, Long> {
     Optional<Resident> findByName(String url);
     Optional<Resident> updateById(Long id);

}
