public class HouseholdWatterUsage1a {
    public static void main(String[] args) {
        
        int familyMembers = 3;           
        double waterConsumed = 450.75;  
        int houseNumber = 5-8;           
        char usageStatus = 'A';          

        System.out.println("--- Household Details ---");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Number of Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + waterConsumed + " litres");
        System.out.println("Water Usage Status: " + usageStatus);
    }
}