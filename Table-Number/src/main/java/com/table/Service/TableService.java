package com.table.Service;

import java.util.List;

import com.table.entity.TableNumber;

public interface TableService {

	String addNumber(TableNumber number);
	
	List<Integer> getallNumbers();
}
