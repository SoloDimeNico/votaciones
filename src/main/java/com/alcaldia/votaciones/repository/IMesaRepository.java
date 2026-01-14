package com.alcaldia.votaciones.repository;

import com.alcaldia.votaciones.models.Mesa;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMesaRepository extends JpaRepository<Mesa,Integer> {
    @Modifying
    @Transactional
    @Query(value = "SELECT * FROM mesa WHERE id_recinto = :id",nativeQuery = true)
    public List<Mesa> obtenerMesas(@Param("id") Integer id);
}
