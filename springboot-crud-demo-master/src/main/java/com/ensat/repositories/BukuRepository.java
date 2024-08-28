package com.ensat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ensat.entities.Buku;

public interface BukuRepository extends JpaRepository<Buku, Long>{
    
}
