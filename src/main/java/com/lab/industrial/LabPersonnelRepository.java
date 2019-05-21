package com.lab.industrial;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.quest.tables.LabPersonnel;

public interface LabPersonnelRepository extends JpaRepository <LabPersonnel, Integer> {
	@Query(value = "Select * from lab_personnel where personnelID =?1" , nativeQuery = true)
	List<LabPersonnel> getpersonnel(int id);
}
