package pizza;

import java.util.Scanner;

public class PizzaHut {


        private int largeBox = 10;
        private int mediumBox = 6;
        private int smallBox = 4;
        private int boxSize;
        private  int superHungry;
        private  int normalHungry;
        private  int classic;
        private int largeBoxPrice = 5000;
        private int mediumBoxPrice = 3000;
        private int smallBoxPrice = 1200;


        public static int numberOfHungryPersons(int superHungry, int normalHungry, int classicHungry){
                int hungryPersons = (superHungry * 4 + normalHungry * 2 + classicHungry * 1);

                return hungryPersons;
        }

        public static int numberOfSlices(int superHungry, int normalHungry, int classicHungry) {
                int slices = (superHungry * 4 + normalHungry * 2 + classicHungry * 1);
                int hungryPersons = slices;


           return hungryPersons;
        }

        public static int numberOfBoxes(int superHungry, int normalHungry, int classicHungry, double box) {
                int smallBox = (superHungry * 4 + normalHungry * 2 + classicHungry) / 4;
                int mediumBox = (superHungry * 4 + normalHungry * 2 + classicHungry) / 6;
                int largeBox = (superHungry * 4 + normalHungry * 2 + classicHungry) / 10;

                if (box == 4) box = smallBox;
                if (box == 6) box = mediumBox;
                if (box == 10) box = largeBox;

                return (int) box;
        }

        public static int numberOfSlicesLeft(int superHungry, int normalHungry, int classicHungry, int box) {
                int smallBox = (superHungry * 4 + normalHungry * 2 + classicHungry) % 4;
                int mediumBox = (superHungry * 4 + normalHungry * 2 + classicHungry) % 6;
                int largeBox = (superHungry * 4 + normalHungry * 2 + classicHungry) % 10;

                if (box == 4) box = smallBox;
                if (box == 6) box = mediumBox;
                if (box == 10) box = largeBox;

                return box;
        }
        public static int boxesTotalAmount(int superHungry, int normalHungry, int classicHungry, int box) {
                int smallBox = (superHungry * 4 + normalHungry * 2 + classicHungry) / 4;
                int mediumBox = (superHungry * 4 + normalHungry * 2 + classicHungry) / 6;
                int largeBox = (superHungry * 4 + normalHungry * 2 + classicHungry) / 10;

                if (box == 4) box = smallBox * 1200;
                if (box == 6) box = mediumBox * 3000;
                if (box == 10) box = largeBox * 5000;

                return box;
        }

}