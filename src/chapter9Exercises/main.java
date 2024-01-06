package chapter9Exercises;

public class main {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue",
                "Jones","222-22-2222",
                10000, 0.05);

        BasePlusEmployee basePlusEmployee = new BasePlusEmployee("Bob",
                "Lewis", "333-33-3333",
                5000, 04, 300);

        System.out.printf("%s %s:%n%n%s%n%n",
                "Call CommissionEmployee's toString with superclass reference ",
                "to superclass object", commissionEmployee.toString());

        System.out.printf("%s %s:%n%n%s%n%n",
                "Call BasePlusCommissionEmployee's toString with subclass",
                "reference to subclass object", basePlusEmployee.toString());

        CommissionEmployee commissionEmployee2 = basePlusEmployee;

        System.out.printf("%s %s:%n%n%s%n",
                "Call BasePlusCommissionEmployee's toString with superclass",
                "reference to subclass object", commissionEmployee2.toString());



    }
}
