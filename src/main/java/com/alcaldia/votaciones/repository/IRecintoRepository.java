package com.alcaldia.votaciones.repository;

import com.alcaldia.votaciones.models.Recinto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IRecintoRepository extends JpaRepository<Recinto, Long> {
    @Modifying
    @Transactional
    @Query(value = "SELECT a2.id_recinto, a2.descripcion_recinto " +
            "FROM tblUsersRecinto a1 " +
            "INNER JOIN recinto a2 ON a1.idRecinto = a2.id_recinto " +
            "WHERE a1.idUser = :id",
            nativeQuery = true)
    List<Recinto> obtenerRecintos(@Param("id") Integer id);
}
