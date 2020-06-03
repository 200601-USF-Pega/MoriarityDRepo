package com.revature.tourofheroes.dao;

import java.util.List;
import com.revature.tourofheroes.model.Hero;

public interface IHeroRepo {

	public Hero addHero(Hero hero);
	public List<Hero> getAllHeroes();
}
