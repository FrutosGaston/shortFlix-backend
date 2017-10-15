package com.boot.ember.model;

public class RegisteredUser extends TypeOfUser {

	@Override
	public Object changeDescription(ShortFilm aShort, User user) {
		return user.notADirectorException();
	}
	

}
