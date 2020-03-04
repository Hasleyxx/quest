package qis.Xray;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class XrayController {
	@Autowired
	XrayRepository xRepository;
	@Autowired
	XMRepository xmRepository;
	
	@GetMapping("/getXray")
	public List<Xray> Xray() {
		return xRepository.XrayList();
	}

	@GetMapping("/getXray/{id}")
	public  @ResponseBody List<Xray> XrayID(@PathVariable String id) {
		int pid = Integer.parseInt(id);
		return xRepository.Xrayid(pid);
    }
	
	@GetMapping("/getOneXray/{tid}")
	public Xray getOneXray(@PathVariable String tid) {
		String Tid = tid;
		return xRepository.getOneXray(Tid);
	}
	
	@GetMapping("/getMarkers")
	public List<XrayMarkers> Markers(){
		return xmRepository.MarkerList();
	}
	
	@GetMapping("/getMarker/{tid}")
	public  @ResponseBody List<XrayMarkers> MarkerID(@PathVariable String tid) {
		return xmRepository.Markerid(tid);
    }
	
	@PostMapping("/addXray")
	public int addXray(@RequestBody Map<String, String> body){
		int trans 			= Integer.parseInt(body.get("transactionID"));
		int pid 			= Integer.parseInt(body.get("patientID"));
		String com 			= body.get("comment");
		String impre 		= body.get("impression");
		String rad 			= body.get("radiologist");
		String qa 			= body.get("qa");
		String cdate 		= body.get("creationDate");
		String udate 		= body.get("dateUpdate");
		String patientIdRef	= body.get("patientIdRef");
		int userID			= Integer.parseInt(body.get("userID"));
		
		try {
			return xRepository.addXray(trans, pid, com, impre, rad, qa, patientIdRef, userID, cdate, udate);
		}catch (DataIntegrityViolationException e) {
   			return 0;
   		}
	}
	
	@PostMapping("/updateXray")
	public int updateXray(@RequestBody Map<String, String>body) {
		String com 			= body.get("comment");
		String impre 		= body.get("impression");
		String rad 			= body.get("radiologist");
		String qa 			= body.get("qa");
		String cdate 		= body.get("creationDate");
		String udate 		= body.get("dateUpdate");
		int xid		 		= Integer.parseInt(body.get("xrayID"));
		int userID			= Integer.parseInt(body.get("userID"));
		
		try {
			return xRepository.updateXray(com, impre, rad, qa, cdate, udate, xid, userID);
		}catch(DataIntegrityViolationException e) {
			return 0;
		}
	}
	
	@PostMapping("/addMarker")
	public int addMarker(@RequestBody Map<String, String> body) {
		int pid 			= Integer.parseInt(body.get("patientID"));
		int trans 			= Integer.parseInt(body.get("transactionID"));
		String film 		= body.get("xrayFilm");
		String type 		= body.get("xrayType");
		String rad 			= body.get("radTech");
		int tc 				= Integer.parseInt(body.get("totalCount"));
		
		try {
			return xmRepository.addMarker(pid, trans, film, type, rad, tc);
		}catch(DataIntegrityViolationException e) {
			return 0;
		}
	}
	
	@PostMapping("/updateMarker")
	public int updateMarker(@RequestBody Map<String, String>body) {
		String film 		= body.get("xrayFilm");
		String type 		= body.get("xrayType");
		String rad 			= body.get("radTech");
		int tc 				= Integer.parseInt(body.get("totalCount"));
		int mid 			= Integer.parseInt(body.get("markerID"));
		try {
			return xmRepository.updateMarker(film, type, rad, tc, mid);
		}catch(DataIntegrityViolationException e) {
			return 0;
		}
	}
	
	@RequestMapping(value="/addXrayScanImage", method=RequestMethod.POST, consumes = "multipart/form-data")
	public int addXrayScan(@RequestParam("image") MultipartFile file, @RequestParam("tid") int tid) {
		String UPLOADED_FOLDER = "C:\\xampp\\htdocs\\qis-java-2020\\src\\assets\\xray\\";
		String fileName = tid + "_" + file.getOriginalFilename();

		try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + fileName);
            Files.write(path, bytes);
    	
    		try {
    			return xRepository.addXrayImage(fileName, tid);
    		}catch (DataIntegrityViolationException e) {
       			return 0;
       		}
        } catch (IOException e) {
            return 0;
        }
	}
	
}
