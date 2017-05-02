package first_RPG;
import java.util.Vector;

public class TBRPG {

public static void main(String[] args) 
{
	
}

public class Location
{
		// Member variables
		private String l_roomTitle;
		private String l_roomDescription;
		private Vector l_vecExits;
		
		// Returns location title
		public String getTitle()
		{
			return l_roomTitle;
		}
		
		// Assigns location title
		public void setTitle(String roomTitle)
		{
			l_roomTitle = roomTitle;
		}
			
		// Adds an exit to this location
		public void addExit (Exit exit)
		{
			l_vecExits.addElement (exit);
		}
		
		// Removes an exit from this location
		public void removeExit (Exit exit)
		{
			if (l_vecExits.contains (exit))
			{
					l_vecExits.removeElement (exit);
			}
}
	
		// Returns a vector of exits
		public Vector getExits ()
		{
			// Return clone w/o modifying original vector
			return (Vector) l_vecExits.clone();
		}
		
		
	}


public class Exit
{
	 	//Numerical codes
		public static final int UNDEFINED = 0;
		public static final int NORTH = 1;
		public static final int SOUTH = 2;
		public static final int EAST  = 3;
		public static final int WEST  = 4;
		public static final int UP    = 5;
		public static final int DOWN  = 6;
		public static final int IN  = 7;
		public static final int OUT = 8;

		// String codes
		public static final String[] dirName = 
			{
					"UNDEFINED",
					"NORTH",
					"SOUTH",
					"EAST",
					"WEST",
					"UP",
					"DOWN",
					"IN",
					"OUT"
			};
		public static final String[] shrtDirName = 
			{
					"NULL",
					"N",
					"S",
					"E",
					"W",
					"U",
					"D",
					"I",
					"O"
			};
		// Member variables
		private Location l_leadsTo = null;
		private int l_direction;
		
		//Full name of direction eg SOUTHEAST
		private String l_directionName;
		
		// Shortened version of direction eg SE
		private String l_shortDirectionName;
		
		//Default constructor
		public Exit()
		{
			l_direction = Exit.UNDEFINED;
			l_leadsTo = null;
			l_directionName = dirName[UNDEFINED];
			l_shortDirectionName = shrtDirName[UNDEFINED];
		}
		
		// Full constructor
		public Exit (int direction, Location leadsTo)
		{
				l_direction = direction;
				
				// Assign direction names
				if (direction <= dirName.length)
					l_directionName  = dirName[l_direction];
				if (direction <= shrtDirName.length)
					l_shortDirectionName = shrtDirName[l_direction];
				
				// Assign location 
				l_leadsTo = leadsTo;
		}
		
		//toString method
		public String toString()
		{
				return l_directionName;
		}
		
		// Assign direction name
		public void setDirectionName( String dirname)
		{
				l_directionName = dirname;
		}
		
		//Returns direction name
		public String getDirectionName()
		{
				return l_directionName;
		}
		
		//Assigns short direction name
		public void setShortDirectionNme ( String shortName )
		{
				l_shortDirectionName = shortName;
		}
		
		//Returns short direction name
		public String getShortDirectionName ()
		{
				return l_shortDirectionName;
		}
		
		//Assigns location
		public void setLeadsTo (Location leadsTo)
		{
				l_leadsTo = leadsTo;
		}
		
		//Returns location
		public Location getLeadsTo()
		{
				return l_leadsTo;
		}
		
}



	
}
