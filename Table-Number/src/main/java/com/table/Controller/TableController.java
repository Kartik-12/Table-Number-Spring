package com.table.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.table.Service.TableService;
import com.table.entity.TableNumber;

@RestController
public class TableController {
	
	@Autowired
	TableService tableService;

	@PostMapping(value="/addnumber")
	public void addnumber(@RequestBody TableNumber number)
	{
		tableService.addNumber(number);
		
	}
	@GetMapping(value="/getlastnumber")
	public int lastnumber()
	{
		return tableService.lastnumber();
	}
}
