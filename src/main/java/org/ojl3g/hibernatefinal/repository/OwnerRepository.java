package org.ojl3g.hibernatefinal.repository;

import org.ojl3g.hibernatefinal.entity.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
