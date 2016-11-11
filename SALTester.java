	import java.io.*;
		import java.util.*; //includes ArrayList
		import java.text.*; //for NumberFormat
public class SALTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	


				NumberFormat formatter = NumberFormat.getNumberInstance();
				formatter.setMinimumFractionDigits(2);
				formatter.setMaximumFractionDigits(2);
				String name;
				
				List<store>aryList = new ArrayList<store>();
			do
			{
			Scanner kbReader = new Scanner(System.in);
			System.out.print("Enter the name the customer. (\"Exit\" to abort): ");
			name = kbReader.nextLine();


				if(!name.equalsIgnoreCase("EXIT"))
				{
					System.out.print("Enter final subtotal.");
					Double amount = kbReader.nextDouble();
					System.out.println(" ");
					store nalpha = new store(name, amount);
					aryList.add(nalpha);
				}
			} while(!name.equalsIgnoreCase("EXIT"));


	
		store ba = aryList.get(0);
		double maxspent = ba.spent;
		String maxName = ba.name;
		for(int j = 1; j < aryList.size(); j++)
		{
			store a = aryList.get(j);
			if(maxspent < a.spent){
				maxspent = a.spent;
				ba = a;
				maxName = ba.name;
			}
		}
		System.out.println("The best customer today was: " + maxName);
	

	}

}
