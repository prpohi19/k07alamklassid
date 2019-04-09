
// Base Class 
class Employee 
{ 
	public static int base = 500; 
	int salary() 
	{ 
		return base; 
	} 
} 

// Inherited class 
class Manager extends Employee 
{ 
	// This method overrides show() of Parent 
	int salary() 
	{ 
		return base + 1000; 
	} 
   
    
} 

// Inherited class 
class Clerk extends Employee 
{ 
	// This method overrides show() of Parent 
	int salary() 
	{ 
		return base + 500; 
	} 
   
} 

 
class Main 
{ 
	
	static void printSalary(Employee e) 
	{ 
		System.out.println(e.salary()); 
	} 

	public static void main(String[] args) 
	{ 
		Employee obj1 = new Manager(); 

		 
		System.out.print("Manager's salary : "); 
		printSalary(obj1); 

		Employee obj2 = new Clerk(); 
		System.out.print("1st Clerk's salary : "); 
		printSalary(obj2); 
      	
      	Employee obj3 = new Clerk(); 
		System.out.print("2nd Clerk's salary : "); 
		printSalary(obj3); 
      
      	Employee obj4 = new Clerk(); 
		System.out.print("3rd Clerk's salary : "); 
		printSalary(obj4); 
	} 
} 
