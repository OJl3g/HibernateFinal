package org.ojl3g.hibernatefinal.repository;

import org.ojl3g.hibernatefinal.entity.House;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HouseRepository extends CrudRepository<House, Long> {
}
