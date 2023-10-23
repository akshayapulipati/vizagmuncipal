package com.infinite.VizagMunicipalCorporation.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infinite.VizagMunicipalCorporation.model.Login;

@Repository
public class LoginDaoImpl implements ILoginDao {
	private EntityManager entityManager;

	@Autowired
	public LoginDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Transactional
	public void save(Login username) {
		entityManager.persist(username);
		// TODO Auto-generated method stub

	}

	@Override
	public Login findByName(String userName) {
		// TODO Auto-generated method stub
		TypedQuery<Login> query = entityManager.createQuery("SELECT * FROM Login  WHERE username = :username",
				Login.class);
		query.setParameter("username", userName);
		List<Login> result = query.getResultList();
		return result.isEmpty() ? null : result.get(0);
	}

}
