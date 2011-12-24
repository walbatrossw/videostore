package videostore;

public class RegularMovie extends Movie {
    public RegularMovie(String title) {
        super(title, REGULAR);
    }

    double determineAmount(int daysRented) {
        double rentalAmount = 2;
        if (daysRented > 2)
            rentalAmount += (daysRented - 2) * 1.5;
        return rentalAmount;
    }

    int determineFrequentRentalPoint(int daysRented) {
        return 1;
    }
}
