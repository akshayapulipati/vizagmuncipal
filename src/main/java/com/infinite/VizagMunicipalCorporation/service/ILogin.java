package com.infinite.VizagMunicipalCorporation.service;

import com.infinite.VizagMunicipalCorporation.model.Login;

public interface ILogin {
	void save(Login username);

	Login findByName(String userName);
}
