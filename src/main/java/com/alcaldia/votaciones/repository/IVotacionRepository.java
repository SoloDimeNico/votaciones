package com.alcaldia.votaciones.repository;

import com.alcaldia.votaciones.models.Mesa;
import com.alcaldia.votaciones.models.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IVotacionRepository extends JpaRepository<Mesa,Integer> {
    @Modifying
    @Transactional
    @Query("UPDATE Mesa e SET e.nroVotos = :valor1 WHERE e.idMesa = :id")
    Integer actualizarCamposEspecificos(@Param("id") Integer id,
                                    @Param("valor1") Integer valor1);
}
