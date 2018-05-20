package MovieRental;

interface Price {
    
    int getPriceCode();
    double getCharge(int daysRented);
    
    default int getFrequentRenterPoints(int daysRented) {
        
        return 1;
    }
    
}

class ChildrensPrice implements Price {
    
    public int getPriceCode() {
        
        return Movie.CHILDRENS;
    }
    
    public double getCharge(int daysRented) {
    
        double result = 1.5;
        if (daysRented > 3) {
            
            result += (daysRented - 3) * 1.5;
        }
        
        return result;
    }
    
}

class NewReleasePrice implements Price {
    
    public int getPriceCode() {
        
        return Movie.NEW_RELEASE;
    }
    
    public double getCharge(int daysRented) {
     
        return daysRented * 3;
    }
    
    @Override
    public int getFrequentRenterPoints(int daysRented) {
        
        //新作を2日以上借りたらボーナスポイント
        if (daysRented > 1) {
            return 2;
        }
        else {
            return 1;
        }
    }
    
}

class RegularPrice implements Price {
    
    public int getPriceCode() {
        
        return Movie.REGULAR;
    }
    
    public double getCharge(int daysRented) {
        
        double result = 2;
        
        if (daysRented > 2) {
        
            result += (daysRented - 2) * 1.5;
        }
        
        return result;
    
    }
}