import java.util.Scanner;
public class Appointments {
	
	private String[] schedule = new String[6];
	
	public void sched() {
		
		try {
			setSchedule();
			}
		
		catch(InvalidTimeException e) {
			System.out.println(e.getMessage());
			}	
		catch(TimeInUseException e) {
			System.out.println(e.getMessage());
			}
		
		}
	
	public void setSchedule() throws InvalidTimeException, TimeInUseException {
		
		Scanner keys = new Scanner(System.in);
		System.out.println("Enter time slot!");
		int x = keys.nextInt();
			
		if (!(x >= 0 && x <= 5)) {
			throw new InvalidTimeException();
			}
		System.out.println("Enter name...");
		String name = keys.next();
				
		if (schedule[x] == null) {
			schedule[x] = name;			
			}
		else {
			throw new TimeInUseException();
			}			
		}
	
	public static void main(String[] args) {
		Appointments demo = new Appointments();
		demo.sched();
		demo.sched();
		}
	} 
