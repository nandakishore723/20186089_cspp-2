import java.util.Scanner;
import java.util.ArrayList;


class FoodLog {
	private String fooditem;
	private String quantity;
	private String timeconsumed;
	private String datefood;
	FoodLog(String fooditem, String quantity, String dateFood, String timeconsumed) {
		this.fooditem = fooditem;
		this.quantity = quantity;
		this.timeconsumed = timeconsumed;
		this.datefood = dateFood;
	}


	public String getdateFood() {
		return this.datefood;
	}
	public void setdateFood(String datefood) {
		this.datefood = datefood;
	}
	public String getfooditem() {
		return this.fooditem;
	}
	public void setfooditem(String fooditem) {
		this.fooditem = fooditem;
	}
	public String getquantity() {
		return this.quantity;
	}
	public void setquantity(String quantity) {
		this.quantity = quantity;
	}
	public String gettimeconsumed() {
		return this.timeconsumed;
	}
	public void settimeconsumed(String timeconsumed) {
		this.timeconsumed = timeconsumed;
	}


	public String toString() {
		return "Food" + "\n" + "Date:" + getdateFood() + "\n" + "Time:"
		+ gettimeconsumed() + "\n" + "Name:" + getfooditem() + "\n" + "Quantity:" + getquantity();
	}
}


class WaterLog {
	private String date;
	private String time;
	private String amt;
	WaterLog(String amt, String date, String time) {
		this.date = date;
		this.amt = amt;
		this.time = time;
	}


	public String gettime() {
		return this.time;
	}

	public void settime(String time) {
		this.time = time;
	}
	public String getdate() {
		return this.date;
	}
	public void setdate(String date) {
		this.date = date;
	}
	public String getamt() {
		return this.amt;
	}
	public void setamt(String amt) {
		this.amt = amt;
	}


	public String toString() {
		return "Water" + "\n" + "Date:" + getdate() + "\n" + "Quantity:" + getamt() + "ml";
	}
}


class PhysicalActivityLog {
	private String activityname;
	private String date;
	private String starttime;
	private String endtime;
	private String notes;
	PhysicalActivityLog(String activityname,  String notes, String date,
	                    String starttime, String endtime) {
		this.activityname = activityname;
		this.date = date;
		this.starttime = starttime;
		this.endtime = endtime;
		this.notes = notes;
	}


	public String getactivityname() {
		return this.activityname;
	}
	public void setactivityname(String activityname) {
		this.activityname = activityname;
	}
	public String getdate() {
		return this.date;
	}
	public void setdate(String date) {
		this.date = date;
	}
	public String getstarttime() {
		return this.starttime;
	}
	public void setstarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getendtime() {
		return this.endtime;
	}
	public void setendtime(String endtime) {
		this.endtime = endtime;
	}
	public String getnotes() {
		return this.notes;
	}
	public void setnotes(String notes) {
		this.notes = notes;
	}


	public String toString() {
		return "PhysicalActivity" + "\n" + "Name:" + getactivityname() +
		"\n" + "Notes:" + getnotes() + "\n" + "Date:" + getdate() + "\n" + "Starttime:" +
		getstarttime() + "\n" + "Endtime:" + getendtime();
	}
}


class WeightLog {
	private String time;
	private String weight;
	private String fat;
	private String date;
	WeightLog(String date, String time, String weight, String fat) {
		this.time = time;
		this.weight = weight;
		this.fat = fat;
		this.date = date;
	}


	public String gettime() {
		return this.time;
	}

	public void settime(String time) {
		this.time = time;
	}
	public String getweight() {
		return this.weight;
	}
	public void setweight(String weight) {
		this.weight = weight;
	}
	public String getfat() {
		return this.fat;
	}
	public void setfat(String fat) {
		this.fat = fat;
	}
	public String getdate() {
		return this.date;
	}
	public void setdate(String date) {
		this.date = date;
	}


	public String toString() {
		return "Weight" + "\n" + "Date:" + getdate() + "\n" + "Time:" + gettime() +
		"\n" + "Weight:" + getweight() + "\n" + "Fat:" + getfat();
	}
}


class SleepLog {
	private String date;
	private String starttime;
	private String endtime;
	SleepLog(String date, String starttime, String endtime) {
		this.date = date;
		this.starttime = starttime;
		this.endtime = endtime;
	}


	public String getDate() {
		return this.date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getstarttime() {
		return this.starttime;
	}
	public void setendtime(String starttime) {
		this.starttime = starttime;
	}
	public String getendtime() {
		return this.endtime;
	}
	public void setendtime() {
		this.endtime = endtime;
	}


	public String toString() {
		return "Sleep" + "\n" + "Date:" + getDate() + "\n" + "Starttime:" +
		getstarttime() + "\n" + "EndTime:" + getendtime();
	}
}


class FitByte {
	public ArrayList<FoodLog> arrayFood;
	public ArrayList<WaterLog> arrayWater;
	public ArrayList<PhysicalActivityLog> arrayPhysicalActivity;
	public ArrayList<WeightLog> arrayWeight;
	public ArrayList<SleepLog> arraySleep;
	FitByte() {
		arrayFood = new ArrayList<>();
		arrayWater = new ArrayList<>();
		arrayPhysicalActivity = new ArrayList<>();
		arrayWeight = new ArrayList<>();
		arraySleep = new ArrayList<>();
	}


	public void addFood(FoodLog foodDitepassed) {
		arrayFood.add(foodDitepassed);
	}
	public void addWater(WaterLog wateondietDitepassed) {
		arrayWater.add(wateondietDitepassed);
	}
	public void addSleep(SleepLog sleeponDitepassed) {
		arraySleep.add(sleeponDitepassed);
	}
	public void addWeight(WeightLog weightdiet) {
		arrayWeight.add(weightdiet);
	}
	public void addPhyActivity(PhysicalActivityLog phyAct) {
		arrayPhysicalActivity.add(phyAct);
	}

	public void summary() {
		for (FoodLog f : arrayFood) {
			System.out.println(f);
		}
		for (WaterLog w : arrayWater) {
			System.out.println(w);
		}
		for (PhysicalActivityLog p : arrayPhysicalActivity) {
			System.out.println(p);
		}
		for (WeightLog wt : arrayWeight) {
			System.out.println(wt);
		}
		for (SleepLog s : arraySleep) {
			System.out.println(s);
		}
	}
}


public class Solution {
	private Solution() {
	}
	public static void main(String[] args) {
		FitByte fb = new FitByte();
		Scanner ip = new Scanner(System.in);
		while (ip.hasNext()) {
			String line = ip.nextLine();
			String[] tokens = line.split(" ");
			String[] localin = new String[10];
			if (tokens.length == 2) {
				localin = tokens[1].split(",");
			}
			switch (tokens[0]) {
			case "Food":
				fb.addFood(new FoodLog(localin[0], localin[1], localin[2], localin[3]));
				break;
			case "Water":
				fb.addWater(new WaterLog(localin[0], localin[1], localin[2]));
				break;
			case "PhysicalActivity":
				fb.addPhyActivity(new PhysicalActivityLog(localin[0], localin[1],
				localin[2], localin[3], localin[4]));
				break;
			case "Weight":
				fb.addWeight(new WeightLog(localin[0], localin[1], localin[2], localin[3]));
				break;
			case "Sleep":
				fb.addSleep(new SleepLog(localin[0], localin[1], localin[2]));
				break;
			case "Foodlog":
				System.out.println(fb.arrayFood.toString().replace(
				"[", "").replace("]", "").replace(", ", "\n"));
				System.out.println();
				break;

			case "Waterlog":
				System.out.println(fb.arrayWater.toString().replace(
				"[", "").replace("]", "").replace(", ", "\n"));
				System.out.println();
				break;

			case "PhysicalActivitylog":
				System.out.println(fb.arrayPhysicalActivity.toString().replace(
				"[", "").replace("]", "").replace(", ", "\n"));
				System.out.println();
				break;

			case "Weightlog":
				System.out.println(fb.arrayWeight.toString().replace(
				"[", "").replace("]", "").replace(", ", "\n"));
				System.out.println();
				break;

			case "Sleeplog":
				System.out.println(fb.arraySleep.toString().replace(
				"[", "").replace("]", "").replace(", ", "\n"));
				System.out.println();
				break;

			case "Summary":
				fb.summary();
				break;
			default:
				break;
			}
		}

	}
}

