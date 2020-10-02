import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		 ArrayList<User> userList = new ArrayList<User>();
		 	userList.add(new User("Tudor ","Deviza  ",19,"tudor.deviza@mail.com","NEW     ","10.09.2020"));
		 	userList.add(new User("Ion   ","Ionita  ",24,"ion.ion@mail.com     ","NEW     ","09.06.2020"));
		 	userList.add(new User("Stefan","Mart    ",21,"stefan.mart@mail.com ","NEW     ","15.06.2019"));
		 	userList.add(new User("Ana   ","Munteanu",22,"ana.ana@mail.com     ","NEW     ","01.10.2020"));
		 	userList.add(new User("Artur ","Vistor  ",21,"artur.vis@mail.com   ","NEW     ","29.09.2020"));

		 	userList = changeUsersStatus(userList);
		 	
		    for(int i = 0 ; i< userList.size() ; i++) 
		    	System.out.println(userList.get(i));

	}

	private static ArrayList<User> changeUsersStatus(ArrayList<User> userList) {
	    
	    for(User u : userList){
	        if(u.getTimestamp() != null) {
	        	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		    	LocalDate startDate = LocalDate.parse(u.getTimestamp(), formatter);
		    	LocalDate endDate = LocalDate.now();
		    	
		    	int days = Period.between(startDate, endDate).getDays();
		    	int moth = Period.between(startDate, endDate).getMonths();
		    	int years = Period.between(startDate, endDate).getYears();
		    	
		    	int period = years*365 + moth*30 + days;
		    	
		    	if(period <= 1) {
		    		u.setStatus("NEW     ");
		    	} else if( period > 1 && period <= 7) {
		    		u.setStatus("ACTIVE  ");
		    	} else if( period > 7 && period <= 30) {
		    		u.setStatus("INACTIVE");
		    	} else if( period > 30 ) {
		    		u.setStatus("BLOCKED ");
		    	}
		    	
	        }
	    }

		
		return userList;
	}

}
