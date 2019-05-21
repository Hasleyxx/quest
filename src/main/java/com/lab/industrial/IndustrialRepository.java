package com.lab.industrial;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.quest.tables.LabIndustrial;


public interface IndustrialRepository  extends JpaRepository <LabIndustrial, Integer> {
	//query for lab industrial
	@Query(value = " SELECT *, CONCAT (p.LastName ,', ', p.FirstName,' ', p.MiddleName) as FullName "
			+ " FROM qpd_trans t, qpd_patient p, qpd_transext x, qpd_items i "
			+ " WHERE t.patientid = p.PatientID and x.TransactionID = t.TransactionID "
			+ " and x.ItemID = i.ItemID " , nativeQuery = true)
	List<LabIndustrial> getinfo();
}
