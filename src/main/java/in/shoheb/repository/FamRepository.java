package in.shoheb.repository;

import org.springframework.data.repository.CrudRepository;

import in.shoheb.entity.Family;

public interface FamRepository extends CrudRepository<Family, Integer> {

}
