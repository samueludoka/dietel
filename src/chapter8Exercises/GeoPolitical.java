package chapter8Exercises;

public enum GeoPolitical {
    NorthCentral("Benue","FCT","Kogi","Kwara","Nasarawa","Niger","Plateau"),
    NorthEast("Adamawa","Bauchi","Borno","Gonbe","Taraba","Yobe"),
    NorthWest("Kaduna","Katistna","Kebbi","Sokoto","Jigawa","Zamfara"),
    SouthEast("Abia","Anambra", "Ebonyi","Enugu","Imo"),
    SouthSouth("Akwa-ibom","Bayelsa","Cross-River","Delta","Edo","Rivers"),
    SouthWest("Etiti","Lagos","Osun","Ondo","Ogun","Oyo");
    private String[] states;

    GeoPolitical(String... states){
        this.states = states;

    }

    public String[] getStates() {
        return states;
    }

}
