import java.util.ArrayList;

public class MountainRange {

	private final int MAX_MOUNTAINS = 10;
	private ArrayList <Mountain> myMountains;// an array of mountain objects, initially all null.
	private int width; 				
	private int maxHeight;			
	private int numMountains; 		
	
	public MountainRange()
	{
		this(15,10);
	}
	
	public MountainRange(int w, int maxH) {
		width = w;
		maxHeight = maxH;
		myMountains = new ArrayList <Mountain>();
		numMountains = 0;
	}
	
	
	public boolean addMountain(Mountain m)
	{
		boolean wasChanged = false;
		if (numMountains < MAX_MOUNTAINS)
		{
			myMountains.add(m);
			wasChanged = true;
			numMountains++;
		}

		
		// ---------------------------
		return wasChanged;
	}
	
	public int getNumMountains()
	{
		return numMountains;
	}

	
	public int heightAtPosition(int pos)
	{
		int height = 0;
		for (int i = 0; i < myMountains.size();i++)
		{
			if (myMountains.get(i).getHeightAtLoc(pos) > height)
			{
				height = myMountains.get(i).getHeightAtLoc(pos);
			}
		}
		
		// ---------------------------
		return height;
	}
	
	
	public int tallestMountain()
	{
		int tallest = 0;
		for (int i = 0; i < myMountains.size();i++)
		{
			if (myMountains.get(i).getHeight() > tallest)
			{
				tallest = myMountains.get(i).getHeight(); 
			}
		}
		
		// ---------------------------
		return tallest;
	}
	
	
	
	public int altitudeVariance(int start, int stop)
	{
		int variance = 10000;
		int vars = 0;
	for (int i = start; i < stop; i++)
	{
		if (myMountains.get(i).getHeight() > vars)
		{
			vars = myMountains.get(i).getHeight();
		}
	}
	for (int i = start; i < stop; i++)
	{
		if (myMountains.get(i).getHeight() < variance)
		{
			variance = myMountains.get(i).getHeight();
		}
	}
	variance = vars - variance;

		// ----------------------------
		return variance;
		
	}
	
	
	public String simpleMap()
	{
		String output = " ";
		for (int i = 0; i < width; i++)
		{
			output += "_";
		}
		output += "\n";
		
		for (int row = maxHeight; row >= 0; row--)
		{
			output += "|";
			for (int column = 0; column < width; column++)
			{
				if (heightAtPosition(column) == row)
					output = output + "*";
				else
					output = output + " ";

			}
			output = output + "|\n";
		}
		// ---------------------------		
		return output;
	}
	
	public String slopeMap() // OPTIONAL
	{
		String output = "";
		
		// ---------------------------		
		return output;
	}
	
	public String toString()
	{
		return simpleMap();
	}
}
