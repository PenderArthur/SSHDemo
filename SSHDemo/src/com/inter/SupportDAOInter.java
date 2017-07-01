package com.inter;

import java.util.List;

public interface SupportDAOInter <T>{
	public void delete (T t);
	public void deleteByID(int id);
	public List <T> qyeryAll();
	public T queryByID(int id);
	public void save (T t);
	public void update (T t);
}
