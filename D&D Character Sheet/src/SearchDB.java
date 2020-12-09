import java.util.ArrayList;
import java.util.StringTokenizer;



public class SearchDB {
	public ArrayList<String> db;
	
	LoadDB db1;
	private int[] strengthValue;
	private int[] dexterityValue;
	private int[] constitutionValue;
	private int[] intelligenceValue;
	private int[] charismaValue;
	private int[] wisdomValue;
	private String[] Charactername;
	//////////////////////////////////////////////
	
	
	public SearchDB() {
		db = new ArrayList<String>();
		getDB();
		
		
	
	}
	public void getDB() {
		 db1 = new LoadDB();
		for(int i = 0; i <db1.getLines(); i++) {
			db.add(db1.getLine(i));
		}
		
		Charactername = new String[db.size()];
		strengthValue = new int[db.size()];
		dexterityValue = new int[db.size()];
		constitutionValue = new int[db.size()];
		intelligenceValue = new int[db.size()];
		charismaValue = new int[db.size()];
		wisdomValue = new int[db.size()];
		String raw="";
		for(int i=0; i!=db.size(); i++) {
			raw=db.get(i);
			StringTokenizer st = new StringTokenizer(raw,"*");
			Charactername[i]=st.nextToken();
			strengthValue[i]=Integer.parseInt(st.nextToken());
			dexterityValue[i]=Integer.parseInt(st.nextToken());
			constitutionValue[i]=Integer.parseInt(st.nextToken());
			intelligenceValue[i]=Integer.parseInt(st.nextToken());
			charismaValue[i]=Integer.parseInt(st.nextToken());
			wisdomValue[i]=Integer.parseInt(st.nextToken());
		}
		//////////////////////////////////////////////////
		
	}
	
	public boolean exists() {
		if(db1.getLines()==0) {
		return false;
		}else {
			return true;
		}
	}
	public void addtoDB(String s) {
		 db1 = new LoadDB();
		db1.addtoDB(s);
	}
	//example///////////////////////////////
	public String getName() {
		return Charactername[0];
	}
	public int getStrength() {
		return strengthValue[0];
	}
	public int getDex() {
		return dexterityValue[0];
	}
	public int getCons() {
		return constitutionValue[0];
	}
	public int getIntel() {
		return intelligenceValue[0];
	}
	public int getChari() {
		return charismaValue[0];
	}
	public int getWisdom() {
		return wisdomValue[0];
	}
	///////////////////////////////////////////

}
