package com.infinite.VizagMunicipalCorporation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infinite.VizagMunicipalCorporation.model.Complaint;
import com.infinite.VizagMunicipalCorporation.service.ComplaintServiceImpl;

@Controller
public class ComplaintController {
	@Autowired
	ComplaintServiceImpl csimpl;

	@RequestMapping(value = "/getAllComplaints/{username}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getAllComplaints(Model m) {
		m.addAttribute("Complaint", new Complaint());
		m.addAttribute("listOfComplaints", csimpl.getAllComplaints());
		return "complaint";
	}

	@RequestMapping(value = "/addComplaint", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addComplaint(@ModelAttribute("Complaint") Complaint com) {
		csimpl.addComplaint(com);
		return "redirect:/getAllComplaints";
	}
}
