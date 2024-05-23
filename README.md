# codeAlpha_Travel_Itinerary_Planner
Travel Itinerary Planner
The Travel Itinerary Planner is a Java application designed to help users plan their travel itineraries. Users can add destinations, set travel dates, specify preferences for accommodation and transportation, and generate detailed itineraries.

### Features
Destination Management: Add and manage multiple destinations for your trip.
Date Selection: Set start and end dates for your travel.
Preferences: Specify your preferences for accommodation type and transportation.
Itinerary Generation: Generate a comprehensive itinerary including destinations, budget estimation, and weather forecast.
Usage
To use the Travel Itinerary Planner in your Java project, follow these steps:

Clone the repository or download the source code.
Import the TravelItineraryPlanner class into your project.
Create instances of Destination, DateRange, and Preferences.
Add destinations, set travel dates, and specify preferences using the provided methods.
Call the generateItinerary() method to generate the travel itinerary.
Example usage:


// Create a new TravelItineraryPlanner instance
TravelItineraryPlanner planner = new TravelItineraryPlanner();

// Add destinations
planner.addDestination(new TravelItineraryPlanner.Destination("Paris", 1000));
planner.addDestination(new TravelItineraryPlanner.Destination("Rome", 1200));

// Set travel dates
planner.setDates(new TravelItineraryPlanner.DateRange("2024-06-01", "2024-06-15"));

// Set preferences
planner.setPreferences(new TravelItineraryPlanner.Preferences("Hotel", "Train"));

// Generate itinerary
TravelItineraryPlanner.Itinerary itinerary = planner.generateItinerary();

// Access itinerary details
List<TravelItineraryPlanner.Destination> destinations = itinerary.getDestinations();
double budget = itinerary.getBudget();
String weather = itinerary.getWeather();
Contributing
Contributions to the Travel Itinerary Planner are welcome! If you find any bugs or have suggestions for improvements, please open an issue or submit a pull request.

### License
This project is licensed under the MIT License.

Feel free to customize the README file according to your project's specific details and requirements!







