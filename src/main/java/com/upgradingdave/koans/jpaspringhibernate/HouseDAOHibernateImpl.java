package com.upgradingdave.koans.jpaspringhibernate;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class HouseDAOHibernateImpl extends HibernateDaoSupport implements HouseDAO {

    public List<House> getHouses() {
        return getHibernateTemplate().loadAll(House.class);
    }

    public House saveHouse(House house) {
        getHibernateTemplate().save(house);
        return house;
    }

    public House getHouseById(int id) {
        return getHibernateTemplate().load(House.class, id);
    }

}
