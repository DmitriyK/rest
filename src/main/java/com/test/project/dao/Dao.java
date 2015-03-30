package com.test.project.dao;

import com.test.project.domain.Entity;
import java.util.List;

public interface Dao<T extends Entity, I>
{

	List<T> findAll();


	T find(I id);


	T save(T newsEntry);


	void delete(I id);

}