package assignmentProject;

public class ProductCategory {
    public String groceries;
    public String electronics;
    public String utensiles;
    public String clothings;

    public ProductCategory(String groceries, String electronics, String utensils, String clothings){
        this.groceries = groceries;
        this.electronics = electronics;
        this.utensiles = utensils;
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
        return utensiles;
    }

    public void setUtensiles(String utensiles) {
        this.utensiles = utensiles;
    }

    public String getClothings() {
        return clothings;
    }

    public void setClothings(String clothings) {
        this.clothings = clothings;
    }


}
