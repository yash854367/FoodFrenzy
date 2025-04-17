package repositories;

import org.springframework.data.repository.CrudRepository;

import entities.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
	public Admin findByAdminEmail(String email);
}
