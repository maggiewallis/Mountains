
public class Mountain {

	private int peakLoc;
	private int height;
	
	public Mountain() 
	{
		this(0,0);
	}

	public Mountain(int loc, int hgt)
	{
		peakLoc = loc;
		height = hgt;
	}

	
	public int getPeakLoc() {
		return peakLoc;
	}

	
	public int getHeight() {
		return height;
	}
	
	
	
	public int getHeightAtLoc(int loc)
	{
		int h = 0;
		h = height - Math.abs(peakLoc - loc);
		if (h <= 0)
		{
			h = 0;
		}
		// ----------------------
		return h;
	}
	
}
