package MovieRental;

public class Test {

    public static void main(String[] args) {
        
        Movie fastAndFurious = new Movie("Fast & Furious", Movie.REGULAR);
        Movie dispicableMe = new Movie("Dispicable Me", Movie.CHILDRENS);
        Movie theShapeOfWater = new Movie("The Shape of Water", Movie.NEW_RELEASE);
        
        Customer john = new Customer("John");
        john.addRental(new Rental(fastAndFurious, 5));
        john.addRental(new Rental(dispicableMe, 3));
        john.addRental(new Rental(theShapeOfWater, 7));
        System.out.println(john.statement());
        
    }
}
