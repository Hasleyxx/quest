package qis.Industrial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndustrialController {
	
	@Autowired
	IndustrialRepository IrRespository;
	@Autowired
	Industrial1Repository IrRespository1;
	
	@GetMapping("/industrial")
    public  @ResponseBody List<LabIndustrial> Industial() {
        return IrRespository.getinfo();
	}
	@GetMapping("/industrial1")
    public  @ResponseBody List<LabIndustrial1> Industial1() {
        return IrRespository1.getinfo();
	}

}
