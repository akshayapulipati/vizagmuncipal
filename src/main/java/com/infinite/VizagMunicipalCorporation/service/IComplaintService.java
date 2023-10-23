package com.infinite.VizagMunicipalCorporation.service;

import java.util.List;

import com.infinite.VizagMunicipalCorporation.model.Complaint;

public interface IComplaintService {
	public List<Complaint> getAllComplaints();

	public Complaint addComplaint(Complaint com);

}
