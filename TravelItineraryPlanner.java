import java.util.ArrayList;
import java.util.List;

public class TravelItineraryPlanner {
    private List<Destination> destinations;
    private DateRange dates;
    private Preferences preferences;

    public TravelItineraryPlanner() {
        destinations = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        destinations.add(destination);
    }

    public void setDates(DateRange dates) {
        this.dates = dates;
    }

    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    public Itinerary generateItinerary() {
        Itinerary itinerary = new Itinerary();
        for (Destination destination : destinations) {
            itinerary.addDestination(destination, dates);
        }
        itinerary.setBudget(calculateBudget());
        itinerary.setWeather(getWeather());
        return itinerary;
    }

    private double calculateBudget() {
        double budget = 0;
        for (Destination destination : destinations) {
            budget += destination.getCost();
        }
        return budget;
    }

    private String getWeather() {
        // API call to weather service
        return "Sunny";
    }

    public static class Destination {
        private String name;
        private double cost;

        public Destination(String name, double cost) {
            this.name = name;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public double getCost() {
            return cost;
        }
    }

    public static class DateRange {
        private String startDate;
        private String endDate;

        public DateRange(String startDate, String endDate) {
            this.startDate = startDate;
            this.endDate = endDate;
        }

        public String getStartDate() {
            return startDate;
        }

        public String getEndDate() {
            return endDate;
        }
    }

    public static class Preferences {
        private String accommodationType;
        private String transportationType;

        public Preferences(String accommodationType, String transportationType) {
            this.accommodationType = accommodationType;
            this.transportationType = transportationType;
        }

        public String getAccommodationType() {
            return accommodationType;
        }

        public String getTransportationType() {
            return transportationType;
        }
    }

    public static class Itinerary {
        private List<Destination> destinations;
        private double budget;
        private String weather;

        public Itinerary() {
            destinations = new ArrayList<>();
        }

        public void addDestination(Destination destination, DateRange dates) {
            destinations.add(destination);
        }

        public void setBudget(double budget) {
            this.budget = budget;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public List<Destination> getDestinations() {
            return destinations;
        }

        public double getBudget() {
            return budget;
        }

        public String getWeather() {
            return weather;
        }
    }
}