package com.table.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.table.Service.TableService;
import com.table.dao.TableDao;
import com.table.entity.TableNumber;

@Service
public class TableServiceImpl implements TableService {

	@Autowired
	TableDao tableDao;
	
	@Override
	public String addNumber(TableNumber number) {
		
		for(int i=0;i<number.getTableNumber();i++)
		{
			TableNumber number1 = new TableNumber();
			number1.setTableNumber(i);
			tableDao.save(number1);
				
		}
		return "Added number";
	}

	@Override
	public List<Integer> getallNumbers() {
		return null;
	}

}
