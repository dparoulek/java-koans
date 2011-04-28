package com.upgradingdave.koans.jpaspringhibernate;

import java.util.List;

public interface HouseDAO {
    
    public List<House> getHouses();
    public House saveHouse(House house);
    public House getHouseById(int id);
}
