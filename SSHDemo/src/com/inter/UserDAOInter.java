package com.inter;

import com.model.User;

public interface UserDAOInter<T> extends SupportDAOInter<T>{
	public User queryByNumber(String number);
	public User queryByNumberAndPsw(String number ,String Psq);
	public User queryByEmail(String email);
}
