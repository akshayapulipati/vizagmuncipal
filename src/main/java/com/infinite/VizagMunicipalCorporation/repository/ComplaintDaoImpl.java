package com.infinite.VizagMunicipalCorporation.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infinite.VizagMunicipalCorporation.model.Complaint;

@Repository
public class ComplaintDaoImpl implements IComplaintDao {
	@Autowired
	private SessionFactory sfactory;
	public void setsf(SessionFactory sfactory){
		this.sfactory=sfactory;
	}
	@Override
	public List<Complaint> getAllComplaints() {
		// TODO Auto-generated method stub
		Session s= this.sfactory.getCurrentSession();
		List<Complaint> ls=s.createQuery("From Complaint").list();
		return ls;
	}

	@Override
	public Complaint addComplaint(Complaint com) {
		// TODO Auto-generated method stub
		Session s= this.sfactory.getCurrentSession();
		s.save(com);
		return null;
	}
	
}
