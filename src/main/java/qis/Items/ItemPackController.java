package qis.Items;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemPackController {
	@Autowired
    ItemsRepository itemsRepository;
	@Autowired
	PackageRepository packageRepository;
	@Autowired
	PackExtensionRepository packextRepository;
	@GetMapping("/AllItems")
    public List<Items> findAllItems(){
    	return itemsRepository.findAllItems();
    }
    
    @GetMapping("/AccountItems")
    public List<Items> findAllAccountItems(){
    	return itemsRepository.findAllAccountItems();
    }
    
    @GetMapping("/AccountItems/{id}")
    public List<Items> findAccountItemById(@PathVariable String id){
    	int pID = Integer.parseInt(id);
    	return itemsRepository.findAccountItemById(pID);
    }
    
    @GetMapping("/AllItems/{id}")
    public List<Items> findItemById(@PathVariable String id){
    	int pID = Integer.parseInt(id);
    	return itemsRepository.findItemById(pID);
    }
    
    @GetMapping("/Items/{type}")
    public List<Items> findItemByType(@PathVariable String type){
    	return itemsRepository.findItemByType(type);
    }
    
    @GetMapping("/NonAccountItems")
    public List<Items> findAllNonAccountItems()
    {
    	return itemsRepository.findAllNonAccountItems();
    	
    }
    @GetMapping("/getpackage")
    public List<Package> ListPackage() {
    	return packageRepository.listpackage();
    }
    @GetMapping("/packext")
    public List<PackageExt> PackExt(){
    	return packextRepository.packext();
    }
    
    @PostMapping("/addItem")
    public int AddItem(@RequestBody Map<String, String>body) {
    	String iname	 		= body.get("itemName");
    	double iprice 			= Double.parseDouble(body.get("itemPrice"));
    	String des 				= body.get("itemDescription");
    	String type 			= body.get("itemType");
    	int del 				= Integer.parseInt(body.get("deletedItem"));
    	int test 				= Integer.parseInt(body.get("neededTest"));
    	String cdate 			= body.get("creationDate");
    	String udate 			= body.get("dateUpdate");
    	try {
    		return itemsRepository.addItem(iname, iprice, des, type, del, test, cdate, udate);}
    	catch (DataIntegrityViolationException e) {
    		return 0;
    	}
    }
    @PostMapping("/updateItem")
    public int UpdateItem(@RequestBody Map<String, String> body) {
    	String iname 			= body.get("itemName");
    	double iprice 			= Double.parseDouble(body.get("itemPrice"));
    	String des 				= body.get("itemDescription");
    	String type 			= body.get("itemType");
    	int del 				= Integer.parseInt(body.get("deletedItem"));
    	int test 				= Integer.parseInt(body.get("neededTest"));
    	String cdate 			= body.get("creationDate");
    	String udate 			= body.get("dateUpdate");
    	try {
    		return itemsRepository.updateItem(iname, iprice, des, type, del, test, cdate, udate);
    		}catch (DataIntegrityViolationException e) {
    			return 0;
    		 }
		
    	
    }
    @PostMapping("/addPackage")
    public int addPackage(@RequestBody Map<String, String> body) {
    	String name 		= body.get("packageName");
    	double price 		= Double.parseDouble(body.get("packagePrice"));
    	String des 			= body.get("packageDescription");
    	String type 		= body.get("packageType");
    	int del 			= Integer.parseInt(body.get("deletedPackage"));
    	String cdate 		= body.get("creationDate");
    	String udate 		= body.get("dateUpdate");
    	try {
    		return packageRepository.addpackage(name, price, des, type, del, cdate, udate);
    	}catch (DataIntegrityViolationException e) {
    		return 0;
        }
		
    }
    @PostMapping("/updatePackage")
    public int updatePackage(@RequestBody Map<String, String> body) {
    	double price 		= Double.parseDouble(body.get("packagePrice"));
    	String des 			= body.get("packageDescription");
    	String type 		= body.get("packageType");
    	int del 			= Integer.parseInt(body.get("deletedPackage"));
    	String cdate 		= body.get("creationDate");
    	String udate 		= body.get("dateUpdate");
    	try {
    		return packageRepository.updatepackage(price, des, type, del, cdate, udate);
    	}catch (DataIntegrityViolationException e) {
    		return 0;
    	}
		
    }
    @PostMapping("/addpackext")
    public int addPackext(@RequestBody Map<String, String> body) {
    	String ext 		= body.get("packageName");
    	int id 			= Integer.parseInt(body.get("itemID"));
    	try {
    		return packextRepository.addpackext(ext, id);
   		}catch (DataIntegrityViolationException e) {
   			return 0;
   		}
    }
}
