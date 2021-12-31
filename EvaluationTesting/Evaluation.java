class Evaluation {

public static double marks =0;
double marksLoacl = 0;
String answer ="";
public static String result ="";


{
	//non static methodes,variables are working fine
	marksLoacl = 70;
    answer = StaticGrade(marksLoacl);
	System.out.println("Empty block Result is "+answer);
	
	// static methodes,variables are working fine
	marks = 40;
    result = Grade(marks);
	System.out.println("Empty block Result is "+result);
	
}
public Evaluation(){

//non static methodes,variables are working fine
	marksLoacl = 70;
    answer = Grade(marksLoacl);
	System.out.println("Constructor block Result is "+answer);
	
	// static methodes,variables are working fine
	marks = 40;
    result = StaticGrade(marks);
	System.out.println("Constructor block Result is "+result);

}

static {
 // marks = 50;
 // answer = Grade(marks);
	marks = 50;
	result = StaticGrade(marks);
  System.out.println("Static block Result is "+result);
}
static {
 
  System.out.println(" 2nd Static block Result is ");
}

public String Grade(double marks){
	String result = "";
	if(marks > 30){
		result = "normal pass";
	}
	if(marks > 50){
		result = "good pass";
	}
	if(marks > 80){
		result = "Exellent pass";
	}
	return result;
}
public static String StaticGrade(double marks){
	String result = "";
	if(marks > 30){
		result = "normal pass";
	}
	if(marks > 50){
		result = "good pass";
	}
	if(marks > 80){
		result = "Exellent pass";
	}
	return result;
}


}