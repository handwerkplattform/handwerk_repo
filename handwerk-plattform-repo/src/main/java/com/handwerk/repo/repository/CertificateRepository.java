package com.handwerk.repo.repository;

import com.handwerk.repo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificateRepository extends JpaRepository<Category, Long> {
}
