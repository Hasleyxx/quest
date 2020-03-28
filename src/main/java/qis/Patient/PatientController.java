package qis.Patient;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.xml.bind.DatatypeConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PatientController {
	@Autowired
	PatientRepository patientRepository;
	@GetMapping("/getPatient")
    public  @ResponseBody List<Patient> ListPatient() {
        return patientRepository.findPatient();
	}
	
	@GetMapping("/getPatient/{pid}")
	public  @ResponseBody List<Patient> PatientID(@PathVariable String pid) {
		int id = Integer.parseInt(pid);
        return patientRepository.PatientID(id);
	}
	
	@GetMapping("/checkRef/{pid}")
	public  @ResponseBody List<Patient> CheckRef(@PathVariable String pid) {
		int ref = Integer.parseInt(pid);
        return patientRepository.checkRef(ref);
	}
	
	@PostMapping("/addPatient")
	public int AddPatient(@RequestBody Map<String, String>body){
	
		String pRef			 	 = body.get("patientRef");
		String pType		 	 = body.get("patientType");
		String com			 	 = body.get("companyName");
		String pos			 	 = body.get("position");
		String fn			 	 = body.get("firstName");
		String mn			 	 = body.get("middleName");
		String ln			 	 = body.get("lastName");
		String add			 	 = body.get("address");
		String bdate		 	 = body.get("birthdate");
		String email		 	 = body.get("email");
		int age					 = Integer.parseInt(body.get("age"));
		String gen			 	 = body.get("gender");
		String no			 	 = body.get("contactNo");
		String notes		 	 = body.get("notes");
		String sid			 	 = body.get("sid");
		String cdate		 	 = body.get("creationDate");
		String udate		 	 = body.get("dateUpdate");
		String fileName;
		
		if (body.get("image") != null) {
			String[] imageTemp		 = body.get("image").split(",");
			String image 			 = imageTemp[1];
			
			String fullName		 = ln + "," + fn + " " + mn;
			
			String extension = "jpg";
			fileName = pRef + "_" + fullName + "_" + pType + "." + extension;
			byte[] data = DatatypeConverter.parseBase64Binary(image);
			String path = "C:\\xampp\\htdocs\\qis_java_dev\\src\\assets\\patients\\" + fileName;
			
			File file = new File(path);
			try (OutputStream outputstream = new BufferedOutputStream(new FileOutputStream(file))) {
				outputstream.write(data);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			fileName = "";
		}
		
		try {
			return patientRepository.addPatient(pRef, pType, com, pos, fn, mn, ln, add, bdate,
					email, age, gen, no, notes, sid, cdate, udate, fileName);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	
	
	@PostMapping("/updatePatient")
	public int UpdatePatient(@RequestBody Map<String, String>body){
		int pid 			 = Integer.parseInt(body.get("patientID"));
		String pType		 = body.get("patientType");
		String com			 = body.get("companyName");
		String pos			 = body.get("position");
		String fn			 = body.get("firstName");
		String mn			 = body.get("middleName");
		String ln			 = body.get("lastName");
		String add			 = body.get("address");
		String bdate		 = body.get("birthdate");
		String email		 = body.get("email");
		int age				 = Integer.parseInt( body.get("age"));
		String gen			 = body.get("gender");
		String no			 = body.get("contactNo");
		String notes		 = body.get("notes");
		String sid			 = body.get("sid");
		String cdate		 = body.get("creationDate");
		String udate		 = body.get("dateUpdate");
		String fileName;
		
		if (body.get("image") != null) {
			String[] imageTemp		 = body.get("image").split(",");
			String image 			 = imageTemp[1];
			
			String fullName		 = ln + "," + fn + " " + mn;
			
			String extension = "jpg";
			fileName = pType + "_" + fullName + "_" + pType + "." + extension;
			byte[] data = DatatypeConverter.parseBase64Binary(image);
			String path = "C:\\xampp\\htdocs\\qis_java_dev\\src\\assets\\patients\\" + fileName;
			
			File file = new File(path);
			try (OutputStream outputstream = new BufferedOutputStream(new FileOutputStream(file))) {
				outputstream.write(data);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			fileName = "";
		}
		
		try {
			return patientRepository.updatePatient(pType, com, pos, fn, mn, ln, add, bdate,
					email, age, gen, no, notes, sid, cdate, udate, pid, fileName);
		}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
	}
	
	@PostMapping("/updatePatientImage")
	public int updatePatientImage(@RequestBody Map<String, String> body) {
		int patientID					= Integer.parseInt(body.get("patientID"));
		String imageName				= body.get("image_name");
		String[] imageTemp		 		= body.get("image").split(",");
		String image 			 		= imageTemp[1];
		String fileName;
		
		String extension = "jpg";
		fileName = imageName + "." + extension;
		byte[] data = DatatypeConverter.parseBase64Binary(image);
		String path = "C:\\xampp\\htdocs\\qis_java_dev\\src\\assets\\patients\\" + fileName;
		
		File file = new File(path);
		try (OutputStream outputstream = new BufferedOutputStream(new FileOutputStream(file))) {
			outputstream.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return patientRepository.updatePatientImage(patientID, fileName);
	}

}
