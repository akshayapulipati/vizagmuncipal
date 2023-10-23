package com.infinite.VizagMunicipalCorporation.repository;

import com.infinite.VizagMunicipalCorporation.model.Login;

public interface ILoginDao {
	void save(Login username);

	Login findByName(String userName);
}
