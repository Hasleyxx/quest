package qis.Personnel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PersonnelController {
	@Autowired
	LabPersonnelRepository LabPerRepository;
	@GetMapping("/getpersonnel/{id}")
	public  @ResponseBody List<LabPersonnel> LabPersonnel(@PathVariable String id) {
		int pid = Integer.parseInt(id);
        return LabPerRepository.getpersonnel(pid);
    }
}
