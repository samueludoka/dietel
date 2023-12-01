package project.diary;

import java.util.ArrayList;


public class Diaries {
    private int size;
    private ArrayList<Diary> listOfDiaries = new ArrayList<>();
    private String Diary;

    public void add(String userName, String password) {
        listOfDiaries.add(new Diary(userName, password));
        size++;
    }

    public int getSize() {
        return listOfDiaries.size();
    }


    public void delete(String username, String password) {
        Diary diary = findByUsername(username);
        listOfDiaries.remove(diary);
//        for(Diary daries: listOfDiaries)
//            listOfDiaries.remove(daries);
    }

    public Diary findByUsername(String userName) {
        for (Diary diary : listOfDiaries) {
            if (diary.getUserName().equals(userName)) return diary;

        }
        return null;
    }
}


