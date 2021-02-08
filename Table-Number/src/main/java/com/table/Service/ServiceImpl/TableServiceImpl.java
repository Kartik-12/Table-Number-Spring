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
	int count =0;
	TableNumber tablenumber;
	@Override
	public synchronized String addNumber(TableNumber number) {
		
		if(tableDao.countnumbers()==0)
		{
		for(int i=0;i<=number.getTableNumber();i++)
		{
			TableNumber number1 = new TableNumber();
			number1.setTableNumber(i);
			tableDao.save(number1);
				
		}
		}
		else
		{
			if (number.getTableNumber()<=tableDao.lastnumber())
			{
				return "Number already exists";
			}
			else if (number.getTableNumber()>tableDao.lastnumber())
			{
				for(int i =tableDao.lastnumber()+1;i<=number.getTableNumber();i++)
				{
					TableNumber number1 = new TableNumber();
					number1.setTableNumber(i);
					tableDao.save(number1);	
				}
			}	
		}
		
		return "Operation Successfull";
		
		}


	@Override
	public synchronized String addcounter() {
		
		count++;
		tablenumber.setTableNumber(count);
		tableDao.save(tablenumber);
		return "Operation Successfull";
		
		}

	
}
