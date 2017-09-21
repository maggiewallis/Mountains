
public class MountainRangeRunner {

	public static void main(String[] args) {
		
		MountainRange theRange = new MountainRange(70,25);
		
		theRange.addMountain(new Mountain(4,8));
		theRange.addMountain(new Mountain(7,10));
		theRange.addMountain(new Mountain(16,6));
		theRange.addMountain(new Mountain(26,21));
		theRange.addMountain(new Mountain(40,20));
		theRange.addMountain(new Mountain(60,10));
		theRange.addMountain(new Mountain(55,12));
		System.out.println("Simple Map:");
		System.out.println(theRange.simpleMap());
		
		System.out.println("Done.");
		
	}

}
