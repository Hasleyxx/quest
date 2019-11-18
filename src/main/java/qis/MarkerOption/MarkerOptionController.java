package qis.MarkerOption;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarkerOptionController {
	@Autowired
	MarkerOptionRepository markerOptionRepository;
	
	@GetMapping("/getMarkerOptions/{marker}")
	public @ResponseBody List<MarkerOption> getMarkerOptions(@PathVariable String marker) {
		return markerOptionRepository.getMarkerOptions(marker);
	}
	
	@GetMapping("/getFilmSize")
	public @ResponseBody List<MarkerOption> getFilmSize() {
		return markerOptionRepository.getFilmSize();
	}
	
	@GetMapping("/getRadtech")
	public @ResponseBody List<MarkerOption> getRadtech() {
		return markerOptionRepository.getRadtech();
	}
	
	@GetMapping("/getBodypart")
	public @ResponseBody List<MarkerOption> getBodypart() {
		return markerOptionRepository.getBodypart();
	}
	
	@PostMapping("/addMarkerOption")
	public int addFilmSize(@RequestBody Map<String, String> body) {
		String name = body.get("name");
		String type = body.get("type");
		
		try {
			return markerOptionRepository.addMarkerOption(name, type);
		} catch (DataIntegrityViolationException e) {
	    	return 0;
	    }
		
	}
	
	@GetMapping("/activateMarkerOption/{id}")
	public @ResponseBody int activateMarkerOption(@PathVariable String id) {
		try {
			return markerOptionRepository.activateMarkerOption(id);
		} catch (DataIntegrityViolationException e) {
			return 0;
		}
	}
	
	@GetMapping("/deactivateMarkerOption/{id}")
	public @ResponseBody int deactivateMarkerOption(@PathVariable String id) {
		try {
			return markerOptionRepository.deactivateMarkerOption(id);
		} catch (DataIntegrityViolationException e) {
			return 0;
		}
	}
	
}
