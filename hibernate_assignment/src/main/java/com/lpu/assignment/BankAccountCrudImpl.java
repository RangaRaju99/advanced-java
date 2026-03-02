
package com.lpu.assignment;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class BankAccountCrudImpl implements BankAccountCrud{

	EntityManager em=JpaUtil.getManager();
	
	
	@Override
	public void saveBank(Bank bank) {
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		em.persist(bank);
		transaction.commit();
	}

	@Override
	public void updateBank(int id) {
		EntityTransaction transaction=em.getTransaction();
		Bank b1=em.find(Bank.class,id);
		b1.setName("Baroda");
		b1.setLocation("bihar");
		transaction.begin();
		em.merge(b1);
		transaction.commit();
		
	}

	@Override
	public Bank findBankById(int id) {
		
		return em.find(Bank.class,id);
	}

	@Override
	public Bank findBankByName(String name) {
		
		Query q= em.createQuery("select b from Bank b where b.name=:bankName");
		q.setParameter("bankName", name);
		return (Bank)q.getSingleResult();
	}

	@Override
	public void assignAccountToBank(int bankId, Account newAccount) {
		
		EntityTransaction transaction=em.getTransaction();
		Bank b1=em.find(Bank.class,bankId);
        List<Account> l1= b1.getAccounts();
        l1.add(newAccount);
        b1.setAccounts(l1);
   
         transaction.begin();
          em.merge(b1);
         transaction.commit();
		
	}

	@Override
	public void assignAccountsToBank(int bankId, List<Account> accounts) {
		// TODO Auto-generated method stub
		
		EntityTransaction transaction=em.getTransaction();
		Bank b1=em.find(Bank.class,bankId);
		List<Account> temp=b1.getAccounts();
		temp.addAll(accounts);
         b1.setAccounts(temp);
         transaction.begin();
          em.merge(b1);
         transaction.commit();
		
	}

	@Override
	public List<Account> findAllAccountsInBank(int bankId) {
		Bank b1=em.find(Bank.class,bankId);
        return b1.getAccounts();
	}

}
