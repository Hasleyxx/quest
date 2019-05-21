package com.lab.industrial;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.quest.tables.LabIndustrialSerology;


public interface LabInSerologyRepository extends JpaRepository <LabIndustrialSerology, Integer> {
	@Query(value ="Select * From lab_serology where seroID = ?1",nativeQuery = true)
	List<LabIndustrialSerology> serologyview(int pid);

	@Transactional
	@Modifying
	@Query(value = "INSERT INTO lab_serology (TransactionID, PatientID, HBsAG,"
			+ " AntiHav, SeroOt, VDRL, PSAnti, AntiHBS, HBeAG, AntiHBE, AntiHBC, TYDOTIgM,"
			+ " TYDOTIgG, CEA, AFP, CA125, CA19, CA15, TSH, FT3, FT4, CRPdil, CRPRes, "
			+ " HIV1, HIV2, PathID, MedID, QualityID, CreationDate, DateUpdate)\n" 
			+ " VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12, ?13, ?14, ?15,"
			+ " ?16, ?17, ?18, ?19, ?20, ?21, ?22, ?23, ?24, ?25, ?26, ?27, ?28, ?29, ?30)"
			+ "", nativeQuery = true)
	int Serologyadd(int transid, int pid, String hbsag, String antihav, String seroot, String vdrl,
			String psanti, String antihbs, String hbeag, String antihbe, String antihbc,
			String tydotigm, String tydotigg, String cea, String afp, String ca125, String ca19,
			String ca15, String tsh, String ft3, String ft4, String crpdil, String crpres,
			String hiv1, String hiv2, int pathid, int medid, int qualityid, String creationdate,
			String dateupdate);

	@Transactional
	@Modifying
	@Query(value = " UPDATE lab_serology SET TransactionID = ?1, PatientID = ?2,"
			+ " HBsAG = ?3, AntiHav = ?4, SeroOt = ?5, VDRL = ?6, PSAnti = ?7, AntiHBS = ?8,"
			+ " HBeAG = ?9, AntiHBE = ?10, AntiHBC = ?11, TYDOTIgM = ?12, TYDOTIgG = ?13,"
			+ " CEA = ?14, AFP = ?15, CA125 = ?16, CA19 = ?17, CA15 = ?18, TSH = ?19, FT3 = ?20,"
			+ " FT4 = ?21, CRPdil = ?22, CRPRes = ?23, HIV1=?24, HIV2 = ?25, PathID = ?26,"
			+ " MedID = ?27, QualityID = ?28, CreationDate = ?29, DateUpdate = ?30"
			+ " WHERE seroID = ?31", nativeQuery = true)	
	int Serologyupdate(int transid, int pid, String hbsag, String antihav, String seroot, String vdrl,
			String psanti, String antihbs, String hbeag, String antihbe, String antihbc,
			String tydotigm, String tydotigg, String cea, String afp, String ca125, String ca19,
			String ca15, String tsh, String ft3, String ft4, String crpdil, String crpres, 
			String hiv1, String hiv2, int pathid, int medid, int qualityid, String creationdate,
			String dateupdate, int seroid);
}
