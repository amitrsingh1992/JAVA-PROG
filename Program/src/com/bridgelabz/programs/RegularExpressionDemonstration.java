/*
28. Regular Expression Demonstration
a. Desc -> Read in the following message: Hello <<name>>, We have your full
           name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.
           Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.
           Use Regex to replace name, full name, Mobile#, and Date with proper value.
b. I/P -> read in the Message
c. Logic -> Use Regex to do the following
   i.Replace <<name>> by first name of the user ( assume you are the user)
   ii.replace <<full name>> by user full name.
   iii.replace any occurance of mobile number that should be in format
       91-xxxxxxxxxx by your contact number.
   iv.replace any date in the format XX/XX/XXXX by current date.
d. O/P -> Print the Modified Message. 
*/


package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;
import java.util.regex.Pattern;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class RegularExpressionDemonstration {

		   public static void main(String[] args) {
			// TODO Auto-generated method stub
			   Utility u = new Utility();
			   
			   String Input = "Hello <<name>>,"
					   			+" We have your full name as <<full name>> in our system."
					   			+" your contact number is 91-xxxxxxxxxx."
					   			+"Please,let us know in case of any clarification" 
					   			+" Thank you BridgeLabz 01/01/2016.";
			 
			   System.out.println(Input);
			   
			   String FirstName = "abc", PhoneNumber;
				System.out.print("Enter Your Full Name: ");
				String FullName = u.readText();

				// Taking name and checking the conditions
				boolean CheckName = Pattern.matches("[A-Z][a-zA-Z]*[\\s][A-Z][a-zA-Z]*[\\s][A-Z][a-zA-Z]*", FullName);

				if (CheckName) {
					String name[] = FullName.split(" ");
					FirstName = name[0];
				} else {
					System.out.println("Format is Wrong\nPlease Enter 'Abc Pqr Xyz ' Format");
					System.exit(0);
				}

				// Taking Phone number and checking the conditions
				System.out.print("Enter Mobile Number: ");
				PhoneNumber = u.readText();

				boolean CheckNumber = Pattern.matches("[789]{1}\\d{9}", PhoneNumber);

				if (!CheckNumber) {
					System.out.println("Number is incorrect");
					System.exit(0);
		}
			   
			   DateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy");
			   String Date = DateFormat.format(new Date());
			   
			   Input=Input.replace("<<name>>",FirstName);
			   Input=Input.replace("<<full name>>",FullName);
			   Input=Input.replace("xxxxxxxxxx",PhoneNumber);
			   Input=Input.replace("01/01/2016",Date);
			   
			   System.out.println("The complete detail after modification:");
			   System.out.println(Input);
			   
			   
	}

}
