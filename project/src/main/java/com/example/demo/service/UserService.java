package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.UserDetails;
import com.example.demo.repository.UserDetailsRepo;

@Service
public class UserService {
	@Autowired
UserDetailsRepo ur;
public UserDetails saveInfo(UserDetails ud) {
	return ur.save(ud);
}
public List<UserDetails> showInfo(){
	return ur.findAll();
}
//save a list of info
public List<UserDetails> savenInfo(List<UserDetails> ss){
	return (List<UserDetails>)ur.saveAll(ss);
}

//delete by id using requestparam
public void deleteparamid(long phoneNumber) {
	ur.deleteById(phoneNumber);
}

//update by id
public String updateinfobyid(long phoneNumber,UserDetails ss) {
	ur.saveAndFlush(ss);
	if(ur.existsById(phoneNumber))
		return "updated successfully";
		else
			return "enter valid phoneNumber";
}
}