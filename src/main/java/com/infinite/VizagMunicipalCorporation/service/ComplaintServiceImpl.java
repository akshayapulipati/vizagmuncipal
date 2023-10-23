package com.infinite.VizagMunicipalCorporation.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infinite.VizagMunicipalCorporation.model.Complaint;
import com.infinite.VizagMunicipalCorporation.repository.ComplaintDaoImpl;
@Service
public class ComplaintServiceImpl implements IComplaintService{
	@Autowired
	ComplaintDaoImpl cmpl;
	@Transactional
	public List<Complaint> getAllComplaints() {
		// TODO Auto-generated method stub
		return cmpl.getAllComplaints();
	}

	@Transactional
	public Complaint addComplaint(Complaint com) {
		return cmpl.addComplaint(com);
	}

}
