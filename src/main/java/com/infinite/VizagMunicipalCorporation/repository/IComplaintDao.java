package com.infinite.VizagMunicipalCorporation.repository;

import java.util.List;

import com.infinite.VizagMunicipalCorporation.model.Complaint;

public interface IComplaintDao {
	List<Complaint> getAllComplaints();

	public Complaint addComplaint(Complaint comp);

}
