import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;


public class Solution {
	 // an object to represent the ticket
    private List<String> Itinerary = new ArrayList<>(); // a list to store the result.
    
    boolean over; // a boolean to indicate the problem is over or not.

    class ticket{
            String from;
            String to;
            
            public ticket (String[] ticket){
                this.from = ticket[0];
                this.to = ticket[1];
            }
        }
        
    private Map<String, PriorityQueue<String>> Tickets = new HashMap<String, PriorityQueue<String>>();  // an Map to store all the tickets. pair <from, PriorityQueue of to cities>
     
    public List<String> findItinerary(String[][] tickets) {
       
       // initial object of ticket and the map.
       for( int i=0; i< tickets.length; i++){
           ticket current = new ticket(tickets[i]);
           if(!Tickets.containsKey(current.from)){
              PriorityQueue<String> toCities = new PriorityQueue<String>();
              toCities.offer(current.to);
              Tickets.put(current.from, toCities); 
           }else{
               Tickets.get(current.from).offer(current.to);
           }
       }
       System.out.println(Tickets);
       while(!Tickets.isEmpty()&&!over){
           NextTicket("JFK");
       }
       return Itinerary;
    }
    
    private ticket aside;
    private boolean lastRun;
    
    private void NextTicket (String fromCity){
    	if(!Tickets.containsKey(fromCity)){
        	Itinerary.add(fromCity);
    		over =true;
     System.out.println("end");		
    		return;
    	}
        System.out.println(fromCity);

        PriorityQueue<String> toCities = Tickets.get(fromCity);
        String toCity = toCities.poll();
        System.out.println("to: " +toCity);
        
        if( aside!=null && fromCity == aside.from && Tickets.get(aside.from).isEmpty()){
            System.out.println("The other case");		
            Itinerary.add(fromCity);
            Itinerary.add(aside.to);
            over = true;
            return;
        }
        if(toCities.isEmpty())
            Tickets.remove(fromCity);
        
        if(!toCities.isEmpty() && !Tickets.containsKey(toCity) && !lastRun){
        	String[] aTicket = {fromCity, toCity};
        	aside = new ticket (aTicket);
        	lastRun = false;
        	toCity = toCities.poll();
        	System.out.println("add an aside:" + aTicket.toString());
        }

        if(toCities.isEmpty() && !Tickets.containsKey(toCity))
        {
        	Itinerary.add(toCity);
        	over =true;
            return;
        }
    	Itinerary.add(fromCity);
        NextTicket(toCity);
    }
}
