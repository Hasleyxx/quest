package qis.TwodEcho;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwodController {
	@Autowired
	TwodRepository twodRep;
	
	@GetMapping("/getTwod/{tid}")
	public Twod getTwod(@PathVariable int tid) {
		return twodRep.getTwod(tid);
	}
	
	@PostMapping("/addTwod")
	public int addTwod(@RequestBody Map<String, String> body) {
		int transactionID					= Integer.parseInt(body.get("transactionID"));
		int patientID						= Integer.parseInt(body.get("patientID"));
		int echoCarID                		= Integer.parseInt(body.get("echoCarID"));
		int qualityID                		= Integer.parseInt(body.get("qualityID"));
		int cardioID                 		= Integer.parseInt(body.get("cardioID"));
		int userID                 			= Integer.parseInt(body.get("userID"));
	    
	    String lvedd                		= body.get("lvedd");
	    String lvedv                		= body.get("lvedv");
	    String laap                 		= body.get("laap");
	    String lvesd                		= body.get("lvesd");
	    String lvesv                		= body.get("lvesv");
	    String larl                 		= body.get("larl");
	    String lveddbsa                 	= body.get("lveddbsa");
	    String sv               			= body.get("sv");
	    String labsa                		= body.get("labsa");
	    String lvesdbsa                 	= body.get("lvesdbsa");
	    String co               			= body.get("co");
	    String a1               			= body.get("a1");
	    String ivsd                 		= body.get("ivsd");
	    String efm              			= body.get("efm");
	    String a2               			= body.get("a2");
	    String ivss                 		= body.get("ivss");
	    String efs              			= body.get("efs");
	    String lavi                 		= body.get("lavi");
	    String pwd              			= body.get("pwd");
	    String fs               			= body.get("fs");
	    String aorta                		= body.get("aorta");
	    String pws              			= body.get("pws");
	    String epss                 		= body.get("epss");
	    String lvot                 		= body.get("lvot");
	    String lvmi                 		= body.get("lvmi");
	    String lvet                 		= body.get("lvet");
	    String mva              			= body.get("mva");
	    String rwt              			= body.get("rwt");
	    String rvm              			= body.get("rvm");
	    String tva              			= body.get("tva");
	    String rarl                 		= body.get("rarl");
	    String rvfac                		= body.get("rvfac");
	    String rvot                 		= body.get("rvot");
	    String rabsa                		= body.get("rabsa");
	    String tapse                		= body.get("tapse");
	    String mpa              			= body.get("mpa");
	    String rvwt                 		= body.get("rvwt");
	    
	    return twodRep.addTwod(transactionID,patientID,echoCarID,qualityID,cardioID,userID,lvedd,lvedv,laap,lvesd,
	    		lvesv,larl,lveddbsa,sv,labsa,lvesdbsa,co,a1,ivsd,efm,a2,ivss,efs,lavi,pwd,fs,aorta,pws,epss,lvot,
	    		lvmi,lvet,mva,rwt,rvm,tva,rarl,rvfac,rvot,rabsa,tapse,mpa,rvwt);
	}

	@PostMapping("/updateTwod")
	public int updateTwod(@RequestBody Map<String, String> body) {
		int echoID                			= Integer.parseInt(body.get("echoID"));
		int echoCarID                		= Integer.parseInt(body.get("echoCarID"));
		int qualityID                		= Integer.parseInt(body.get("qualityID"));
		int cardioID                 		= Integer.parseInt(body.get("cardioID"));
		int userID                 			= Integer.parseInt(body.get("userID"));
	    
	    String lvedd                		= body.get("lvedd");
	    String lvedv                		= body.get("lvedv");
	    String laap                 		= body.get("laap");
	    String lvesd                		= body.get("lvesd");
	    String lvesv                		= body.get("lvesv");
	    String larl                 		= body.get("larl");
	    String lveddbsa                 	= body.get("lveddbsa");
	    String sv               			= body.get("sv");
	    String labsa                		= body.get("labsa");
	    String lvesdbsa                 	= body.get("lvesdbsa");
	    String co               			= body.get("co");
	    String a1               			= body.get("a1");
	    String ivsd                 		= body.get("ivsd");
	    String efm              			= body.get("efm");
	    String a2               			= body.get("a2");
	    String ivss                 		= body.get("ivss");
	    String efs              			= body.get("efs");
	    String lavi                 		= body.get("lavi");
	    String pwd              			= body.get("pwd");
	    String fs               			= body.get("fs");
	    String aorta                		= body.get("aorta");
	    String pws              			= body.get("pws");
	    String epss                 		= body.get("epss");
	    String lvot                 		= body.get("lvot");
	    String lvmi                 		= body.get("lvmi");
	    String lvet                 		= body.get("lvet");
	    String mva              			= body.get("mva");
	    String rwt              			= body.get("rwt");
	    String rvm              			= body.get("rvm");
	    String tva              			= body.get("tva");
	    String rarl                 		= body.get("rarl");
	    String rvfac                		= body.get("rvfac");
	    String rvot                 		= body.get("rvot");
	    String rabsa                		= body.get("rabsa");
	    String tapse                		= body.get("tapse");
	    String mpa              			= body.get("mpa");
	    String rvwt                 		= body.get("rvwt");
	    String dateUpdate                 	= body.get("dateUpdate");
	    
	    return twodRep.updateTwod(echoID,echoCarID,qualityID,cardioID,userID,lvedd,lvedv,laap,lvesd,
	    		lvesv,larl,lveddbsa,sv,labsa,lvesdbsa,co,a1,ivsd,efm,a2,ivss,efs,lavi,pwd,fs,aorta,pws,epss,lvot,
	    		lvmi,lvet,mva,rwt,rvm,tva,rarl,rvfac,rvot,rabsa,tapse,mpa,rvwt,dateUpdate);
	}
}
