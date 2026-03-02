package com.lpu.assignment;

import java.util.List;

public interface BankAccountCrud {

	  void saveBank(Bank bank);
	  
	  void updateBank(int id);
	  
	  Bank findBankById(int id);
	  
	  Bank findBankByName(String name);
	  
	  void assignAccountToBank(int bankId, Account newAccount);
	  
	  void assignAccountsToBank(int bankId, List<Account> accounts);
	  
	  List<Account> findAllAccountsInBank(int bankId);
}
