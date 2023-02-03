package com.example.carros.persistence.persistence;

import com.example.carros.persistence.model.TituloDoSite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TituloPersistence extends JpaRepository<TituloDoSite, Long> {
}
