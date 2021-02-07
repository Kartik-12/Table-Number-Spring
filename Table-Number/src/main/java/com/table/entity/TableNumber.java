package com.table.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class TableNumber {

	@Id@Column(name = "table_number")
	private int tableNumber;
	
	public int getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	public TableNumber() {
		super();
	}
	
	
	
}
