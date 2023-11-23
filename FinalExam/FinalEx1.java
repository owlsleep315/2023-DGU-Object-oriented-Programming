abstract class Apartment {
    public int squareFootage;
    public int numberOfBedrooms;
    
    abstract void setSquareFootage(int sqft);
    abstract void setNumberOfBedrooms(int nbbr);
}

class PenthouseSuite extends Apartment {
	
    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
    
    public void setNumberOfBedrooms(int nbbr) {
    	this.numberOfBedrooms = nbbr;
    }
}

class Studio extends Apartment {

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
    
    public void setNumberOfBedrooms(int nbbr) {
    	this.numberOfBedrooms = nbbr;
    }
}

class UnitUpgrader {
    public void upgrade(Apartment apartment) {
        apartment.squareFootage += 40;

        if (apartment.getClass() != Studio.class)
            apartment.numberOfBedrooms += 1;
    }
}
public class FinalEx1 {
    public static void main(String[] args) {
        Apartment penthouse = new PenthouseSuite();
        penthouse.setSquareFootage(1500);
        penthouse.setNumberOfBedrooms(4);

        Apartment studio = new Studio();
        studio.setSquareFootage(550);
        studio.setNumberOfBedrooms(0);

        System.out.println("Before Upgrade:");
        printApartmentInfo(penthouse);
        printApartmentInfo(studio);

        UnitUpgrader upgrader = new UnitUpgrader();
        upgrader.upgrade(penthouse);
        upgrader.upgrade(studio);

        System.out.println("\nAfter Upgrade:");
        printApartmentInfo(penthouse);
        printApartmentInfo(studio);
    }

    public static void printApartmentInfo(Apartment apartment) {
        System.out.println("Square Footage: " + apartment.squareFootage + ", Number of Bedrooms: " + apartment.numberOfBedrooms );
    }
}