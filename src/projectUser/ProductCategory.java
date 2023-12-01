package projectUser;

public class ProductCategory {
    public String groceries;
    public String electronics;
    public String utensils;
    public String clothings;

    public ProductCategory(String groceries, String electronics, String utensils, String clothings){
        this.groceries = groceries;
        this.electronics = electronics;
        this.utensils = utensils;
        this.clothings = clothings;
    }

    public String getGroceries() {
        return groceries;
    }

    public void setGroceries(String groceries) {
        this.groceries = groceries;
    }

    public String getElectronics() {
        return electronics;
    }

    public void setElectronics(String electronics) {
        this.electronics = electronics;
    }

    public String getUtensiles() {
        return utensils;
    }

    public void setUtensiles(String utensiles) {
        this.utensils = utensiles;
    }

    public String getClothings() {
        return clothings;
    }

    public void setClothings(String clothings) {
        this.clothings = clothings;
    }


}
