package com.atish.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atish.demo.entity.RecBalanceResult;
import com.atish.demo.entity.Users;
import com.atish.demo.repository.RecBalanceResultRepository;
import com.atish.demo.repository.UserRepository;

@RestController
public class DataController {
	
	@Autowired
	private RecBalanceResultRepository repo;
	
	@Autowired
	private UserRepository uRepo;
	
	@GetMapping("rec_balance_result2")
	public List<RecBalanceResult> getRecBalanaceResult(){
		List<RecBalanceResult> myList = new ArrayList<>();
		repo.findAll().forEach(myList::add);
		return myList;
	}
	
	@GetMapping("users2")
	public List<Users> getUsers(){
		List<Users> myList = new ArrayList<>();
		uRepo.findAll().forEach(myList::add);
		return myList;
	}
}
