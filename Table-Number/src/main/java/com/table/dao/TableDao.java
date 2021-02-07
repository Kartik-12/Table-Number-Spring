package com.table.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.table.entity.TableNumber;

public interface TableDao extends JpaRepository<TableNumber,Integer> {

}
