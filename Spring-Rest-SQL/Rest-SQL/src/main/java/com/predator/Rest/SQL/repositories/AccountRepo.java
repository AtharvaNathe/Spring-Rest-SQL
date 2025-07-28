package com.predator.Rest.SQL.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.predator.Rest.SQL.entities.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {
	
	Account findByAccno(int accno);
	List<Account> findByAcctype(String acctype);

}
