import java.util.Scanner;
public class Assignment_2
{
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int vehicleCount= 0;
      System.out.print("Please enter a vehicle count: ");
      vehicleCount= sc.nextInt();
      //String[] purchaseDate=new String[vehicleCount];
      //String[] plateNumber=new String[vehicleCount];
      //String[] model=new String[vehicleCount];
      //String[] type=new String[vehicleCount];
      // String[] registrationNumber=new String[vehicleCount];
      String word[][]=new String[vehicleCount][5];
      //double[] tonnage=new double [vehicleCount];
      //double[] price=new double[vehicleCount];
      //double[] fuelCapacity=new double[vehicleCount];
      double number[][]=new double[vehicleCount][3];
      int no[] = new int[vehicleCount];
    System.out.printf("%nE-Transport Management System (ETMS)%n");
    System.out.println("--------------------------------------------");      
    System.out.println("");  
    
      for(int count=0;count<vehicleCount;count++)
      { 
   {
   do{
   System.out.print("Plate number(inculde character): ");
   word[count][0]= sc.next();
   word[count][0]=word[count][0].toUpperCase();
   if(word[count][0].length()<=7&&word[count][0].length()>=2);
   else
   System.out.println("Please enter a correct plate number.");}
   while(word[count][0].length()>7||word[count][0].length()<2);
   
   
   do{
   System.out.print("Model(ISUZU/HINO/MAN_SE)       : ");
   word[count][1]= sc.next();
   word[count][1]=word[count][1].toUpperCase();
   
      if(word[count][1].equals("ISUZU"))
      word[count][1]="ISUZU (JAPAN)";
      else if(word[count][1].equals("HINO"))
      word[count][1]="HINO (JAPAN)";
      else if(word[count][1].equals("MAN_SE"))
      word[count][1]="MAN_SE (GERMANY)";
      else
      System.out.println("Please ENTER a correct model.");
      }while(!word[count][1].equals("ISUZU (JAPAN)")&&!word[count][1].equals("HINO (JAPAN)")&&!word[count][1].equals("MAN_SE (GERMANY)"));
      
      
    
   System.out.print("Price                          : ");
   number[count][0]= sc.nextDouble();
   
   do{
   System.out.print("Purchase Date(dd/mm/yyyy)      : ");
   word[count][2]= sc.next();
   if(word[count][2].length()==10);
   else
   System.out.println("Wrong format for purchase date.");}
   while(word[count][2].length()!=10);
   
   do{
   System.out.print("Registration Number(6digit)    : ");
   word[count][3]= sc.next();
   if(word[count][3].length()==6);
   else
   System.out.println("Please enter a 6digit number.");}
   while(word[count][3].length()!=6);

   do{
   System.out.print("Tonnage(1.0T-4.5T)             : ");
   number[count][1]= sc.nextDouble();
   
      if(number[count][1]>=1.0 && number[count][1]<=2.0)
      word[count][4]="Light Vehicle";
      else if(number[count][1]>=2.1 && number[count][1]<=4.5)
      word[count][4]="Heavy Vehicle";
      else
      System.out.println("Error:The tonnage of lorry is between 1.0T-4.5T");}
      while(number[count][1]<1||number[count][1]>4.5);
     
         switch (word[count][4])
         {
         case "Light Vehicle":
         number[count][2]=150;
         break;
         case "Heavy Vehicle":
         number[count][2]=200;
         break;   
         default:
         number[count][2]=0 ;              
         }
   no[count]=count+1;
   System.out.println("");
   }}
    
   System.out.printf("%n%n`````````````````````````````````````````%n");
   System.out.println("E-Transport Management System (ETMS)");
   System.out.printf("`````````````````````````````````````````%n%n");
   System.out.printf("%-10s%-20s%-25s%-15s%-15s%-22s%-15s%-15s%-15s","NO. ","Plate number","Model","Price(RM)","Purchase Date","Registration Number","Tonnage(T)","Type","Fuel Capacity(L)");
   System.out.printf("%n-------------------------------------------------------------------------------");  
   System.out.printf("---------------------------------------------------------------------------------%n");
   for(int count=0;count<vehicleCount;count++)
   { 
   System.out.printf("%-10s%-20s%-25s%-15.2f%-20s%-20s%-9.2f%-20s%-10.1f%n",no[count],word[count][0],word[count][1],number[count][0],word[count][2],word[count][3],number[count][1],word[count][4],number[count][2]);
   }
   
  }
}