package project.diary;

import org.junit.jupiter.api.Test;
import project.diary.exception.InvalidPinException;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    @Test
    public void createDairy() throws InvalidPinException {
        Diary myDiary = new Diary("diaryName", "password");
        myDiary.createDiary("diary name","password");
        assertTrue(myDiary.isLocked());
//        myDiary.unlockDiary("password");
//        assertFalse(myDiary.isLocked());
    }
    @Test
    public void DiaryISCreatedAndISLocked(){
        Diary myDiary = new Diary("diaryName", "password");
        assertTrue(myDiary.isLocked());
        try {
            myDiary.unlockDiary("password");
        } catch (InvalidPinException e) {
            throw new RuntimeException(e);
        }
        assertFalse(myDiary.isLocked());
    }
    @Test
    public void unlockDiaryWithPassword(){
        Diary myDiary = new Diary("dairyName","password");
        assertThrows(InvalidPinException.class, () -> myDiary.unlockDiary("passwords233"));
    }
    @Test
    public void unLockDairy() {
        Diary myDiary = new Diary("diaryName", "password");
        assertTrue(myDiary.isLocked());
    }
    @Test
    public void diaryIsLocked()throws InvalidPinException{
        Diary myDiary = new Diary("diaryName", "password");
        assertTrue(myDiary.isLocked());
        myDiary.unlockDiary("password");
        myDiary.lockDiary();
        assertTrue(myDiary.isLocked());
    }
    @Test
    public void createEntryInDiary()throws InvalidPinException{
        Diary myDiary = new Diary("diaryName", "password");
        myDiary.unlockDiary("password");
        myDiary.createAnEntry("title","body");
        assertEquals(1,myDiary.getTotalNumberOfEntry());

    }
    @Test
    public void createMoreThanOneEntryInDiary()throws InvalidPinException{
        Diary myDiary = new Diary("diaryName", "password");
        myDiary.unlockDiary("password");
        myDiary.createAnEntry("title","body");
        myDiary.createAnEntry("title","body");
        myDiary.createAnEntry("title","body");
        assertEquals(3,myDiary.getTotalNumberOfEntry());

    }
    @Test
    public void deleteAnEntryInDiary()throws InvalidPinException{
        Diary myDiary = new Diary("diaryName", "password");
        myDiary.unlockDiary("password");
        myDiary.createAnEntry("title","body");
        myDiary.createAnEntry("title","body");
        myDiary.createAnEntry("title","body");
        assertEquals(3,myDiary.getTotalNumberOfEntry());
        myDiary.deleteAnEntry(1);
        assertEquals(2,myDiary.getTotalNumberOfEntry());
    }
    @Test
    public  void updateEntry() throws InvalidPinException {
        Diary myDiary = new Diary("diaryName", "password");
        myDiary.unlockDiary("password");
        myDiary.createAnEntry("My love story", "My body my choice");
        myDiary.createAnEntry("How i met the love of my life", "I broke up with him");

        myDiary.update(2, "How i met the wrong man", "I fell in love");
        assertEquals("How i met the wrong man", myDiary.findEntryById(2).getTitle());
    }

}