package project.diary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiariesTest {
    @Test
    public void createAndAddDiaries() {
        Diaries myDiarie = new Diaries();
        myDiarie.add("smart","1234");
        assertEquals(1,myDiarie.getSize());
    }
    @Test
    public void createMoreThanOneDiaries() {
        Diaries myDiarie = new Diaries();
        myDiarie.add("smart","1264");
        myDiarie.add("sam","1236");
        myDiarie.add("don","1434");
        myDiarie.add("udoka","1234");
        assertEquals(4,myDiarie.getSize());
    }
    @Test
    public void deleteDiaryFromDiaries() {
        Diaries myDiarie = new Diaries();
        myDiarie.add("smart","1264");
        myDiarie.add("sam","1236");
        myDiarie.add("don","1434");
        myDiarie.add("udoka","1234");
        assertEquals(4,myDiarie.getSize());
        myDiarie.delete("smart", "password");
        assertEquals(3,myDiarie.getSize());
    }
    @Test
    public void findDiaryByUserName(){
        Diaries myDiarie = new Diaries();
        myDiarie.add("smart","1264");
        myDiarie.add("sam","1236");
        myDiarie.add("don","1434");
        myDiarie.add("udoka","1234");
        assertEquals(4,myDiarie.getSize());
        myDiarie.findByUsername("sam");
        assertEquals(4,myDiarie.getSize());

    }

    }