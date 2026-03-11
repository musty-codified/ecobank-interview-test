package com.ecobank.ecobank.repositories;

import com.ecobank.ecobank.entities.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TransferRepository extends JpaRepository<Transfer, Long> {
     boolean existsByReference(String ref);
}
