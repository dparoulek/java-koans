package com.upgradingdave.koans.jpaspringhibernate;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class JpaSpringHibernateTest extends TestCase{
      private HouseDAO houseDAO;
      
      public void setUp() throws Exception
      {
        super.setUp();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        houseDAO = (HouseDAO)context.getBean("houseDAO");
      }

      @Test
      public void test()
      {
        Address address = new Address();
        address.setStreet("5834 Pilot Court");
        address.setCity("Fredericksburg, VA");
        address.setZip("22407");
        
        List<Room> rooms = new ArrayList<Room>();
        rooms.add(new Room("Kitchen"));
        rooms.add(new Room("Family Room"));
        rooms.add(new Room("Bath 1"));
        rooms.add(new Room("Bath 2"));
        
        House house = new House();
        house.setRooms(rooms);
        house.setAddress(address);
        
        houseDAO.saveHouse(house);
        

        //List<House> houses = houseDAO.getHouses();
//        assertEquals(2, loadedArtists.size());
//        for(Artist a:loadedArtists)
//        {
//          System.out.println(a);      
//        }
//        
//        //Create some records
//        String record1Title = "The Pick of Destiny";
//        String[] record1Tracks = {"Kickapoo", "Classico", "Baby", "Destiny", "History"};
//        String record2Title = "Tenacious D";
//        String[] record2Tracks = {"Tribute", "Wonderboy", "Dio"};
//        
//        Record record1 = createRecord(artist, record1Title, record1Tracks);    
//        Record record2 = createRecord(artist, record2Title, record2Tracks); 
//        
//        //Load back artist1
//        Artist artistOne = musicDAO.getArtistById(artist.getId());
//        assertEquals("Tenacious D", artistOne.getName());
//        assertEquals("Comedy", artistOne.getGenre());
//        
//        //Load back record 1
//        Record recordOne = musicDAO.getRecordById(record1.getId());
//        assertEquals(record1Title, recordOne.getTitle());
//        assertEquals(artistName, recordOne.getArtist().getName());
//
//        assertEquals(record1Tracks[0], recordOne.getTracks().get(0).getTitle());
//        assertEquals(record1Tracks[1], recordOne.getTracks().get(1).getTitle());
//
//        //Load back record 2
//        Record recordTwo = musicDAO.getRecordById(record2.getId());
//        assertEquals(record2Title, recordTwo.getTitle());
//        assertEquals(artistName, recordTwo.getArtist().getName());
//
//        assertEquals(record2Tracks[0], recordTwo.getTracks().get(0).getTitle());
//        assertEquals(record2Tracks[1], recordTwo.getTracks().get(1).getTitle());  
//
//        //Test Loading a Track By Id and Make sure that all associations exist
//        Track loadedTrack = musicDAO.getTrackById(recordTwo.getTracks().get(1).getId());
//        assertEquals("Wonderboy", loadedTrack.getTitle());
//        assertEquals("Tenacious D", loadedTrack.getRecord().getTitle());
//        assertEquals("Tenacious D", loadedTrack.getRecord().getArtist().getName());
//        assertEquals("Dio", loadedTrack.getRecord().getTracks().get(2).getTitle());
//      
//        //Test "searchRecordsByTitle"
//        List<Record> recordsSearch1 = musicDAO.searchRecordsByTitle("Destiny");
//        assertEquals(1, recordsSearch1.size());
//        
//        List<Record> recordsSearch2 = musicDAO.searchRecordsByTitle("e");
//        System.out.println("Searched records: " + recordsSearch2);
//        assertEquals(2, recordsSearch2.size());    
      }
}
