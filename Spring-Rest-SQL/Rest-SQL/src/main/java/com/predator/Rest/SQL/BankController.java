package com.predator.Rest.SQL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.predator.Rest.SQL.entities.Account;
import com.predator.Rest.SQL.services.AccountServices;

@RestController
@RequestMapping("/bank")
public class BankController {
	
	@Autowired
	public AccountServices accServices;
	
	@GetMapping("/test")
	public String getMessage() {
		return "Rest api working succeessfully...";
	}
	
	@GetMapping("/allaccounts")
	public List<Account> getAccounts(){
		return accServices.getAllAccounts();
		
	}
	
	@GetMapping("/search/number/{accno}")
	public Account getAccountInfo(@PathVariable int accno) {
		return accServices.getAccountOnNumber(accno);
	}
	
	@PostMapping("/add")
	public Account addNewAccount(@RequestBody Account obj) {
		return accServices.addNewAccount(obj);
	}
	
	@DeleteMapping("/delete")
	public String deleteAccount(int accno) {
		return accServices.deleteAccount(accno);
	}
	
	@PutMapping("/deposit")
	public String deposite(int accno,float amount) {
		return accServices.depositAmt(accno, amount);
	}
	
	@PutMapping("/transfer")
	public String transfer(int fromacc,int toacc,float amount) {
		return accServices.transfer(fromacc, toacc, amount);
	}
	
	
	

}
