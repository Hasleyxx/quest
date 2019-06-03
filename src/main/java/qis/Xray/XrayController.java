package qis.Xray;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class XrayController {
	@Autowired
	XrayRepository xRepository;
	
	@GetMapping("/getXray")
	public List<Xray> Xray() {
		return xRepository.XrayList();
	}

}
