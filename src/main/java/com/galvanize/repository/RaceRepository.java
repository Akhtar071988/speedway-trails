package com.galvanize.repository;

import com.galvanize.entities.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;

public interface RaceRepository extends JpaRepository<Race, Long> {
}
