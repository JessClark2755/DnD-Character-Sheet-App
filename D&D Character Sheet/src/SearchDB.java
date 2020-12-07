import java.util.ArrayList;
import java.util.StringTokenizer;



public class SearchDB {
	public ArrayList<String> db;
	
	
	//example////////////////////////////////////
	private int[] years;
	private String[] months;
	//////////////////////////////////////////////
	
	
	public SearchDB() {
		db = new ArrayList<String>();
		addtoDB("June*2010");//example
		addtoDB("May*2000");//example
		addtoDB("April*2030");//example
		getDB();
		for(int i : years) {//print years
			//System.out.println(i);
		}
		for(String s: months){//print months
		//System.out.println(s);
		}
	}
	public void getDB() {
		LoadDB db1 = new LoadDB();
		for(int i = 0; i <db1.getLines(); i++) {
			db.add(db1.getLine(i));
		}
		
		//example///////////////////////////////////////////
		months = new String[db.size()];
		years = new int[db.size()];
		String raw="";
		for(int i=0; i!=db.size(); i++) {
			raw=db.get(i);
			StringTokenizer st = new StringTokenizer(raw,"*");
			months[i]=st.nextToken();
			years[i]=Integer.parseInt(st.nextToken());
		}
		//////////////////////////////////////////////////
		
	}
	public void addtoDB(String s) {
		LoadDB db1 = new LoadDB();
		db1.addtoDB(s);
	}
	//example///////////////////////////////
	public String[] getMonths() {
		return months;
	}
	public int[] getYears() {
		return years;
	}
	///////////////////////////////////////////

}
