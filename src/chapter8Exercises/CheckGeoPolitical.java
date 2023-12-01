package chapter8Exercises;

public class CheckGeoPolitical {
    public static void main(String[] args) {
        String state = "Abia";
        System.out.println(geoPoliticalZone(state));
    }

    public static String  geoPoliticalZone(String state) {
        GeoPolitical[][] political = new GeoPolitical[][]{GeoPolitical.values()};
        for (int i = 0; i < political.length; i++) {
            GeoPolitical political1 = GeoPolitical.values()[i];
            for (int j = 0; j < political1.getStates().length; j++) {
                if (state.equals(political1.getStates()[j])){
                    return  political1.name();
                }
            }
        }
        return "State Not Found";
    }

}


