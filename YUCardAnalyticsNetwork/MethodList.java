public class School {
	1. public School (String filePath);
	2. public enum Location(NAGEL_BAGEL, CAFETERIA, C_STORE, CHOP_CHOP, BURGER_N_GRILL, GRANDMAS, LAKE_COMO, GOLAN, TIBERIAS, KOSHER_IN_MIDTOWN);
	3. public Calendar getCurrentSemesterCalendar();
	4. public Calendar getSemesterCalendar (int year, Semester semester);
}

public class Calendar {
	1. public Calendar (localDate startDate, LocalDate endDate, Set<localDate> offDays, int year, Semester semester);
	2. public enum Semester(FAll, SPRING);
	3. public localDate getStartDate();
	4. public localDate getEndDate();
	5. public Set<localDate> getOffDays();
	6. public int getYear();
	7. public Semester getSemester();
	8. public int getRemainingDays(localDate currentDate);
}

public class Account {
	1. public Account (int id, String email, int phone, double startingCash);
	2. public void insertPurchases(String filePath);
	3. public Set<Purchase> getAllPurchases();
	4. public Set<Purchase> getPurchasesByDate(LocalDate startDate, LocalDate endDate);
	5. public Set<Purchase> getPurchasesByTime(localTime startTime, localTime endTime);
	6. public Set<Purchase> getPurchasesByAmount(double lowerAmount, double upperAmount);
	7. public Set<Purchase> getPurchasesByLocation(Location location);	
	8. private double getTotalSpent (Set<Purchase> purchases);
	9. public int getLocationFrequency(Location location);
	10. public int getStartingCash();
	11. public int getCurrentCash();
	12. public int getID();
	13. public String getEmail();
	14. public int getPhoneNumber();
}

public class Purchase {
	1. public Purchase (localDate date, localTime time, double amount, Location location);
	2. public localDate getDate();
	3. public localTime getTime();
	4. public double getAmmount();
	5. public Location getLocation();
}

//Driver Class
public class AutoAccountAnalytics  {
	1. public static void main (String[] args);
	2. public void printAccountAnalytics();
	3. private void printSummary();
	4. private void printStatistics();
	5. private void printBudget();	
	//Summary
	6. public int getCashRemaining();
	7. public String[][] getLocationFrequencyAmountChart
	8. public int getDaysRemaining();
	//Statistics
	9. public int getAverageDailySpending();
	10. public Location getMostSpentLocation();
	11. public localDate getMostSpentDay();
	12. public localTime[] getMostSpentTime();
	//Budget
	13. public double getBudget(); //Daily spending average to reach 0 by the end of the semester
	14. public double getProjectedSpendingTotal(); //Total amount of money that will be sent at the rate of the account's current average spending (e.g., $2,222.17)
	15. public int getOnBudget(); //Return 1 for over, 0 for on, and -1 for under

	//NOTE: Make methods that present the analytics, e.g. getBudgetStatus() = {under, on, over}, also so that we can test it with test code. 
}

/*
Summary
- Chart: Location/Freq/Amount(avg)
- Current Cash Remaining
- Current Days Remaining in Semester

Statistics
- Average Daily Spending
- Most Spent:
	- Location
	- Day of the week (avg)
	- Time of day (avg)

Future/Projections/Budgeting/Goals
- "Based on your Average Daily Spending, You are: <On Budget (Green)>, <Over Budget (Red)>, <Under Budget (Yellow)>". Project their current spending total vs Average Daily Budget (Cash_Remaining/Days_Remaining).
	- On Budget: "Good job :-)"
	- Under Budget: Indicate reccomended amount of increase to spending per day.
	- Over Budget: Indicate either a) how much to add to card to maintain spending, or b) how much to decrease spending per day.
 
[- Using Average Daily Spending at other locations, highlight what locations to stay under budget]
*/