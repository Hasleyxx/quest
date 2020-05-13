package qis.ColorFlow;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorFlowController {
	@Autowired
	ColorFlowRepository colorFlowRep;
	
	@GetMapping("/getColorFlow/{tid}")
	public ColorFlow getColorFlow(@PathVariable int tid) {
		return colorFlowRep.getColorFlow(tid);
	}
	
	@PostMapping("/addColorFlow")
	public int addColorFlow(@RequestBody Map<String, String> body) {
		int TransactionID				= Integer.parseInt(body.get("transactionID"));
		int PatientID					= Integer.parseInt(body.get("patientID"));
		int userID						= Integer.parseInt(body.get("userID"));
		
		String lvelocity				= body.get("lvelocity");
		String lpeakgrad				= body.get("lpeakgrad");
		String lvti						= body.get("lvti");
		String lvalve					= body.get("lvalve");
		String lratio					= body.get("lratio");
		String ljetarea					= body.get("ljetarea");
		String lvc						= body.get("lvc");
		String avvelocity				= body.get("avvelocity");
		String avpeakgrad				= body.get("avpeakgrad");
		String avvti					= body.get("avvti");
		String avvalve					= body.get("avvalve");
		String avratio					= body.get("avratio");
		String avjetarea				= body.get("avjetarea");
		String avvc						= body.get("avvc");
		String mvvelocity				= body.get("mvvelocity");
		String mvpeakgrad				= body.get("mvpeakgrad");
		String mvvti					= body.get("mvvti");
		String mvvalve					= body.get("mvvalve");
		String mvratio					= body.get("mvratio");
		String mvjetarea				= body.get("mvjetarea");
		String mvvc						= body.get("mvvc");
		String tvvelocity				= body.get("tvvelocity");
		String tvpeakgrad				= body.get("tvpeakgrad");
		String tvvti					= body.get("tvvti");
		String tvvalve					= body.get("tvvalve");
		String tvratio					= body.get("tvratio");
		String tvjetarea				= body.get("tvjetarea");
		String tvvc						= body.get("tvvc");
		String pvvelocity				= body.get("pvvelocity");
		String pvpeakgrad				= body.get("pvpeakgrad");
		String pvvti					= body.get("pvvti");
		String pvvalve					= body.get("pvvalve");
		String pvratio					= body.get("pvratio");
		String pvjetarea				= body.get("pvjetarea");
		String pvvc						= body.get("pvvc");
		String pat						= body.get("pat");
		String rvat						= body.get("rvat");
		String trjet					= body.get("trjet");
		String ewave					= body.get("ewave");
		String ivrt						= body.get("ivrt");
		String late						= body.get("late");
		String lata						= body.get("lata");
		String mede						= body.get("mede");
		String meda						= body.get("meda");
		String e						= body.get("e");
		String a						= body.get("a");
		String eeratio					= body.get("eeratio");
		
		return colorFlowRep.addColorFlow(TransactionID,PatientID,userID,lvelocity,lpeakgrad,lvti,lvalve,
				lratio,ljetarea,lvc,avvelocity,avpeakgrad,avvti,avvalve,avratio,avjetarea,avvc,mvvelocity,mvpeakgrad,
				mvvti,mvvalve,mvratio,mvjetarea,mvvc,tvvelocity,tvpeakgrad,tvvti,tvvalve,tvratio,tvjetarea,tvvc,
				pvvelocity,pvpeakgrad,pvvti,pvvalve,pvratio,pvjetarea,pvvc,pat,rvat,trjet,ewave,ivrt,late,lata,
				mede,meda,e,a,eeratio);
	}

	
	@PostMapping("/updateColorFlow")
	public int updateColorFlow(@RequestBody Map<String, String> body) {
		int colorID						= Integer.parseInt(body.get("colorID"));
		int userID						= Integer.parseInt(body.get("userID"));
		
		String lvelocity				= body.get("lvelocity");
		String lpeakgrad				= body.get("lpeakgrad");
		String lvti						= body.get("lvti");
		String lvalve					= body.get("lvalve");
		String lratio					= body.get("lratio");
		String ljetarea					= body.get("ljetarea");
		String lvc						= body.get("lvc");
		String avvelocity				= body.get("avvelocity");
		String avpeakgrad				= body.get("avpeakgrad");
		String avvti					= body.get("avvti");
		String avvalve					= body.get("avvalve");
		String avratio					= body.get("avratio");
		String avjetarea				= body.get("avjetarea");
		String avvc						= body.get("avvc");
		String mvvelocity				= body.get("mvvelocity");
		String mvpeakgrad				= body.get("mvpeakgrad");
		String mvvti					= body.get("mvvti");
		String mvvalve					= body.get("mvvalve");
		String mvratio					= body.get("mvratio");
		String mvjetarea				= body.get("mvjetarea");
		String mvvc						= body.get("mvvc");
		String tvvelocity				= body.get("tvvelocity");
		String tvpeakgrad				= body.get("tvpeakgrad");
		String tvvti					= body.get("tvvti");
		String tvvalve					= body.get("tvvalve");
		String tvratio					= body.get("tvratio");
		String tvjetarea				= body.get("tvjetarea");
		String tvvc						= body.get("tvvc");
		String pvvelocity				= body.get("pvvelocity");
		String pvpeakgrad				= body.get("pvpeakgrad");
		String pvvti					= body.get("pvvti");
		String pvvalve					= body.get("pvvalve");
		String pvratio					= body.get("pvratio");
		String pvjetarea				= body.get("pvjetarea");
		String pvvc						= body.get("pvvc");
		String pat						= body.get("pat");
		String rvat						= body.get("rvat");
		String trjet					= body.get("trjet");
		String ewave					= body.get("ewave");
		String ivrt						= body.get("ivrt");
		String late						= body.get("late");
		String lata						= body.get("lata");
		String mede						= body.get("mede");
		String meda						= body.get("meda");
		String e						= body.get("e");
		String a						= body.get("a");
		String eeratio					= body.get("eeratio");
		String dateUpdate				= body.get("dateUpdate");
		
		return colorFlowRep.updateColorFlow(colorID,userID,lvelocity,lpeakgrad,lvti,lvalve,
				lratio,ljetarea,lvc,avvelocity,avpeakgrad,avvti,avvalve,avratio,avjetarea,avvc,mvvelocity,mvpeakgrad,
				mvvti,mvvalve,mvratio,mvjetarea,mvvc,tvvelocity,tvpeakgrad,tvvti,tvvalve,tvratio,tvjetarea,tvvc,
				pvvelocity,pvpeakgrad,pvvti,pvvalve,pvratio,pvjetarea,pvvc,pat,rvat,trjet,ewave,ivrt,late,lata,
				mede,meda,e,a,eeratio,dateUpdate);
	}
}
