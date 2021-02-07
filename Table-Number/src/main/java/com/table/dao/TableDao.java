package com.table.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.table.entity.TableNumber;
@Repository
public interface TableDao extends JpaRepository<TableNumber,Integer> {

	@Query(value = "select table_number from table_number order by table_number DESC LIMIT 1", nativeQuery = true)
	int lastnumber();
	@Query(value="select count(table_number) from table_number",nativeQuery=true)
	int countnumbers();
}
