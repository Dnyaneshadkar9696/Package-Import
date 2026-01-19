package main;

import com.animal.Dog;
import com.aquatic.Fish;
import com.birds.Sparrow;

import employee.developers.Dev1;
import employee.hr.Hr01;
import employee.logistics.PackageHandler001;
import employee.marketing.Marketing101;
import hospital.beds.BedDetails;
import hospital.doctors.DoctorDetails;
import hospital.rooms.RoomDetails;
import library.LibraryDetails;
import student.StudentInfo;

public class Main {
	
	
	public static void main(String args[]) {
		Dog in1 = new Dog();
		Fish in2 = new Fish();
		Sparrow in3 = new Sparrow();
		
		// by importing all the information i am able to access the classes from the packages
		
		in1.info1();
		in2.info2();
		in3.fly();
		
		// calling student class 
		System.out.println();
		StudentInfo st = new StudentInfo();
		st.stdinfo();
		
		// calling the hr
		System.out.println();
		System.out.println("Company Details: ");
		System.out.println();
		Hr01 hrs = new Hr01();
		hrs.hrinfo();
		
		// logistis details
		System.out.println();
		PackageHandler001 pk = new PackageHandler001();
		pk.details();
		
		// marketing
		System.out.println();
		Marketing101 mark = new Marketing101();
		mark.marketinginfo();
		
		// Developer details
		System.out.println();
		System.out.println("Developer information : ");
		Dev1 dev = new Dev1();
		dev.devinfo();
		
		// Hospital Details 
		System.out.println();
		System.out.println("Hospital Information : ");

		BedDetails be = new BedDetails();
		be.bedinfo();
		
		System.out.println();
		//doctor details
		
		DoctorDetails doc1 = new DoctorDetails();
		doc1.docinfo();
		System.out.println();
		
		// room details 
		System.out.println("Room details: ");
		RoomDetails det = new RoomDetails();
		det.roominfo();
		
		System.out.println();
		System.out.println("Library Details : ");
		LibraryDetails lib = new LibraryDetails();
		lib.information();
		
	}
	
	
	
	

}
