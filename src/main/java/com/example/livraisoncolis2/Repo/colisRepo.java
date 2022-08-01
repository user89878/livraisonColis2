package com.example.livraisoncolis2.Repo;

import com.example.livraisoncolis2.model.colis;
import org.springframework.data.jpa.repository.JpaRepository;

public interface colisRepo extends JpaRepository<colis,Long> {
}
