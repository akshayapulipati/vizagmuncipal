package com.infinite.VizagMunicipalCorporation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinite.VizagMunicipalCorporation.model.Login;
import com.infinite.VizagMunicipalCorporation.repository.LoginDaoImpl;

@Service
public class LoginService implements ILogin {
	@Autowired
	LoginDaoImpl lmpl;

	@Override
	public void save(Login username) {
		// TODO Auto-generated method stub
		lmpl.save(username);

	}

	public Login findByName(String username) {
		// TODO Auto-generated method stub
		return lmpl.findByName(username);
	}

}
