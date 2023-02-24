public class A{
  
  public void printMessage(String msg){
    System.out.println("Hello "+msg);
    System.out.println("End PrintMessage");	  
  }
  
  public A(){
	System.out.println("Invoked Constructor"); 
	System.out.println("In the middle of the constructor"); 
	System.out.println("End Constructor");    
  }

}
