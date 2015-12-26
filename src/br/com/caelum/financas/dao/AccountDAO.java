package br.com.caelum.financas.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Account;

public class AccountDAO {

	private EntityManager entityManager;

	public AccountDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public Account find(int id){
		return this.entityManager.find(Account.class, id);
	}
	
	public List<Account>list(){
		return this.entityManager.createQuery("from Conta", Account.class).getResultList();
	}
	
	public void add(Account conta){
		this.entityManager.persist(conta);
	}
	
	public void remove(Account conta){
		this.entityManager.remove(conta);
	}

}
