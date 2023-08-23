package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.UserDetails;
import com.example.demo.service.UserService;

@RestController
public class UserController {
@Autowired
UserService uss;
@PostMapping("addDetails")
public UserDetails addDetail(@RequestBody UserDetails ud) {
	return uss.saveInfo(ud);
}
@PostMapping("addnUser")
public List<UserDetails> addn(@RequestBody List<UserDetails> ud){
	return (List<UserDetails>)uss.savenInfo(ud);
}
@GetMapping("showDetails")
public List<UserDetails> showDetail(){
	return uss.showInfo();
}

//delete by id using RequestParam
@DeleteMapping("deletebyParam")
public String deleteMyIdByParam(@RequestParam long phoneNumber) {
	 uss.deleteparamid(phoneNumber);
	 return "Deleted Successfully";

}
@PutMapping("updatebyid/{phoneNumber}")
public String modifybyid(@PathVariable long phoneNumber,@RequestBody UserDetails ss) {
	 return uss.updateinfobyid(phoneNumber, ss);
 }
}