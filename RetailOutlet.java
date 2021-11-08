
/**

 */
import java.util.*;
public class RetailOutlet
{
    double cost=0;
    double s=100.0;
    int n=100;
    int z,k;
    double disc=0;
    double gst=0;
    String name[]=new String[n];
    double price[]=new double[n];
    int num;
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        double billamt=0;
        String st;
        while(true)
        {
         System.out.println("WELCOME TO TWIQ");
        System.out.println("INDIAS FASTEST GROWING ONLINE STORE!!!!");
        System.out.print("WE OVER AT TWIQ STRIVE TO GIVE YOU QUALITY PRODUCTS ");
        System.out.println("AT THE BEST POSSIBLE OFFERS");
        System.out.print("10% OF THE PROFITS MADE PER ORDER GO TO The National ");
        System.out.println("Forest Conservation Federation");
        System.out.print("--------------------------------------------"); 
        System.out.println("--------------------------------------------"); //works properly
        RetailOutlet obj=new RetailOutlet();
        do
        {
            System.out.println("SHOP BY CATEGORY:");//MENU DISPLAY works
              System.out.println("1. WOMENS FASHION");
              System.out.println("2. MENS FASHION");
              System.out.println("3. KIDS FASHION"); 
              System.out.println("4. ACESSORIES"); 
              System.out.println("5. SHOES");
              System.out.println("6. EXIT");
              System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
              int c=sc.nextInt();
              System.out.println("--------------------------------------------");
              switch(c)
              {
                  case 1:
                  obj.Women();
                  break;
                  case 2:
                  obj.Men();
                  break;
                  case 3:
                  obj.Kids();
                  break;
                  case 4:
                  obj.Acessories();
                  break;
                  case 5:
                  obj.Shoes();
                  break;
                  case 6:
                  obj.exit();
                  default:
                  System.out.println("There seems to be a slight error. Please recheck your input.");
                }
                System.out.println("Please press 1 to go to cart");
                System.out.println(" Please type 2 to continue");
                st =sc.next();
            }
            while(!(st.equalsIgnoreCase("1")));
            System.out.println("Your bill:");
            System.out.println("SI. no.\t\t\t Item name\t\t\t Cost of item");
            for(int i=0;i<obj.z;i++)
            {
                System.out.println(i+1+"\t"+"\t"+"\t" +obj.name[i]+"\t"+"\t"+"\t"+" Rs." +obj.price[i]);
            }
            billamt=obj.cost+billamt;
            System.out.println("---------------------------------------------------");
            System.out.println("Total cost to be paid before GST:" +billamt);
            System.out.println("--------------------------------------------------");
            gst=billamt+(0.18*billamt);
            System.out.println("Total after GST:" +gst);
            System.out.println("--------------------------------------------------");
            System.out.println("Hope you enjoyed shopping!");
             System.out.println("Please do come back soon!");
             System.out.println("If you would like to exit,please Press 1");
            String str=sc.next();
            if(str.equalsIgnoreCase("1"))
             obj.exit();
            break;
           
        }
    }//end of main function
        private void Women()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Welcome to the womens clothing section!!!");
         System.out.println("PICK A CLOTHING STYLE OF YOUR CHOICE");//MENU DISPLAY works
              System.out.println("1. Ethnic wear");
              System.out.println("2. Casual wear");
              System.out.println("3. Formal wear"); 
              System.out.println("4. Western wear"); 
              System.out.println("5. Party wear"); 
              System.out.println("20% off on casual wear and 25% off on party wear");
              System.out.println("Please pick a number according to the above given menu");
             System.out.print("Enter your choice:");
              int chwo=sc.nextInt();
              System.out.println("--------------------------------------------");
              switch(chwo)
              {
                  case 1:
                  System.out.println("WELCOME TO THE ETHNIC WEAR SECTION!");
                 System.out.println("YOU CAN NOW SORT PRODUCTS ACCORDING TO PRICE");
                  System.out.println("Press 1 to sort from LOW to HIGH");
                  System.out.println("Press 2 to sort from HIGH to LOW");
                  System.out.println("Press 3 to leave as it is!");
                  System.out.println("1.Blue and Silver Saree Rs.900");
                     System.out.println("2.Pattiyalli Rs.500");
                     System.out.println("3.Churridhar Rs.400");
                     System.out.println("4.Salwar kameez Rs.650");
                     System.out.println("5.Kurti Rs.600");
                     System.out.println("6.Ghagra Rs.800"); 
       k=sc.nextInt();
       if(k==1)
      {
        int a[]={900,500,400,650,600,800};
       String b[]={"Saree","Pattiyalli","Chuddhidhar","Salwar kameez","Kurti","Ghagra"};
       int l=a.length;
                            int i,j;
                            for(i=0;i<l;i++)
                            {
                                for(j=i+1;j<l;j++)
                                {
                                    if(a[i]>a[j])
                                    {
                                            int t=a[i];
                                            a[i]=a[j];
                                            a[j]=t;
                                        }
                                    }
                                }
        
                                System.out.println("After sorting");
                                for(i=0;i<l;i++)
                                {
                                    System.out.println(i+1+"."+b[i]+": "+a[i]);
                                }
                                int num=sc.nextInt();      
                      if(num==1)
                      {
                         name[z]="Chuddhidhar";
                         price[z]=400;
                         z++;
                         System.out.println("The cost of your choice is Rs. 400");
                         cost=cost+400;
                        }
                         else if(num==2)
                         {
                            name[z]="Pattiyalli";
                         price[z]=500;
                         z++;
                         System.out.println("The cost of your choice is Rs. 500");
                         cost=cost+500;
                        }
                        else if(num==3)
                        {
                         name[z]="Kurti";
                         price[z]=600;
                         z++;
                         System.out.println("The cost of your choice is Rs. 600");
                         cost=cost+600;
                        }
                      else if(num==4)
                        {
                            name[z]="Salwar kameez";
                         price[z]=650;
                         z++;
                         System.out.println("The cost of your choice is Rs. 650");
                         cost=cost+650;
                        }
                        else if(num==5)
                        {
                         name[z]="Ghagra";
                         price[z]=800;
                         z++;
                         System.out.println("The cost of your choice is Rs. 800");
                         cost=cost+800;
                   
                        }
                         else if(num==6)
                         {
                         name[z]="Saree";
                         price[z]=900;
                         z++;
                         System.out.println("The cost of your choice is Rs. 900");
                         cost=cost+900;
                        }
                        else
                        {
                            System.out.println("Please recheck your input");
                        }  
                        break;
                    }


                        else if(k==2)
                           { 
                            int a[]={900,500,400,650,600,800};
                            String b[]={"Saree","Pattiyalli","Chuddhidhar","Salwar kameez","Kurti","Ghagra"};
                            int l=a.length;
                            int i,j;
                            for(i=0;i<l;i++)
                            {
                                for(j=i+1;j<l;j++)
                                {
                                    if(a[i]<a[j])
                                    {
                                            int t=a[i];
                                            a[i]=a[j];
                                            a[j]=t;
                                        }
                                    }
                                }
        
                                System.out.println("After sorting");
                                for(i=0;i<l;i++)
                                {
                                    System.out.println(i+1+"."+b[i]+": "+a[i]);
                                }
                                int num=sc.nextInt();
                      
                      if(num==1)
                      {
                          name[z]="Saree";
                         price[z]=900;
                         z++;
                         System.out.println("The cost of your choice is Rs. 900");
                         cost=cost+900;
                        }
                         else if(num==2)
                         {
                         name[z]="Ghagra";
                         price[z]=800;
                         z++;
                         System.out.println("The cost of your choice is Rs. 800");
                         cost=cost+800;
 
                        }
                        else if(num==3)
                        {
                            name[z]="Salwar kameez";
                         price[z]=650;
                         z++;
                         System.out.println("The cost of your choice is Rs. 650");
                         cost=cost+650;
                        }
                      else if(num==4)
                        {
                       name[z]="Kurti";
                         price[z]=600;
                         z++;
                         System.out.println("The cost of your choice is Rs. 600");
                         cost=cost+600;
                        }
                        else if(num==5)
                        {
                         name[z]="Pattiyalli";
                         price[z]=500;
                         z++;
                         System.out.println("The cost of your choice is Rs. 500");
                         cost=cost+500;   
                        }
                         else if(num==6)
                         {
                             name[z]="Chuddhidhar";
                         price[z]=400;
                         z++;
                         System.out.println("The cost of your choice is Rs. 400");
                         cost=cost+400;
                        }
                        else
                        {
                            System.out.println("Please recheck your input");
                        }  
                        break;
                        }

                  else
                        {

                     System.out.println("1.Blue and Silver Saree Rs.900");
                     System.out.println("2.Pattiyalli Rs.500");
                     System.out.println("3.Churridhar Rs.400");
                     System.out.println("4.Salwar kameez Rs.650");
                     System.out.println("5.Kurti Rs.600");
                     System.out.println("6.Ghagra Rs.800");
                     System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
                      int num=sc.nextInt();
                                     System.out.println("--------------------------------------------");
                      if(num==1)
                      {
                          name[z]="Saree";
                         price[z]=900;
                         z++;
                         System.out.println("The cost of your choice is Rs. 900");
                         cost=cost+900;
                        }
                         else if(num==2)
                         {
                            name[z]="Pattiyalli";
                         price[z]=500;
                         z++;
                         System.out.println("The cost of your choice is Rs. 500");
                         cost=cost+500;
                        }
                        else if(num==3)
                        {
                            name[z]="Chuddhidhar";
                         price[z]=400;
                         z++;
                         System.out.println("The cost of your choice is Rs. 400");
                         cost=cost+400;
                        }
                      else if(num==4)
                        {
                            name[z]="Salwar kameez";
                         price[z]=650;
                         z++;
                         System.out.println("The cost of your choice is Rs. 650");
                         cost=cost+650;
                        }
                        else if(num==5)
                        {
                            name[z]="Kurti";
                         price[z]=600;
                         z++;
                         System.out.println("The cost of your choice is Rs. 600");
                         cost=cost+600;
                        }
                         else if(num==6)
                         {
                            name[z]="Ghagra";
                         price[z]=800;
                         z++;
                         System.out.println("The cost of your choice is Rs. 800");
                         cost=cost+800;
                        }
                        else
                        {
                            System.out.println("Please recheck your input");
                        }  
                    }
                        break;
                        case 2:
                        System.out.println("This is the casual wear section");
                        System.out.println("A large varieties of sizes to choose from!");
                        System.out.println("PLEASE ENTER THE NOS. ACCORDING TO YOUR CHOICE");
                        System.out.println("1. Casual Black pant Rs.599");
                     System.out.println("2.White tshirt Rs.699");
                     System.out.println("3.Casual skirt Rs.799");
                     System.out.println("4.Sweater/jacket Rs.609");
                     System.out.println("5. Blue Dress Rs.700");
                     System.out.println("Please pick a number according to the above given menu");
             System.out.print("Enter your choice:");
                      num=sc.nextInt();
                       System.out.println("--------------------------------------------");
                       if(num==1)
                       {
                        disc=599-(0.20*599);
                        name[z]="Casual pants";
                         price[z]=disc;
                         z++;
                         System.out.println("The cost of your choice is Rs. 599 but after discount it is "+disc);
                         cost=cost+disc;
                    }
                    else if(num==2)
                    {
                        disc=699-(0.20*699);
                        name[z]="White tshirt";
                         price[z]=disc;
                         z++;
                         System.out.println("The cost of your choice is Rs. 699 but after discount it is "+disc);
                         cost=cost+disc;
                    }
                    else if(num==3)
                    {
                        disc=799-(0.20*799);
                        name[z]="casual skirt";
                         price[z]=disc;
                         z++;
                         System.out.println("The cost of your choice: is Rs. 799 but after discount it is "+disc);
                         cost=cost+disc;
                    }
                    else if(num==4)
                    {
                        disc=609-(0.20*609);
                        name[z]="Sweater/jacket";
                         price[z]=disc;
                         z++;
                         System.out.println("The cost of your choice: is Rs. 609 but after discount it is "+disc);
                         cost=cost+disc;
                    }   
                    else if(num==5)
                    {
                        disc=700-(0.20*700);
                        name[z]="Blue Dress";
                         price[z]=disc;
                         z++;
                         System.out.println("The cost of your choice: is Rs. 700 but after discount it is "+disc);
                         cost=cost+disc;
                    }
                    else
                        System.out.println("Please recheck your input");
                    break;
                 case 3:
                    System.out.println("This is the formal wear section");
                        System.out.println("A large varieties of sizes to choose from!");
                        System.out.println("PLEASE ENTER THE NOS. ACCORDING TO Enter your choice:");
                     System.out.println("1.Formal pant Rs.599");
                     System.out.println("2.Formal tshirt Rs.399");
                     System.out.println("3.Formal skirt Rs.499");
                     System.out.println("4.Brown Winter Coat Rs.1599");
                     System.out.println("Please pick a number according to the above given menu");
             System.out.print("Enter your choice:");
                      num=sc.nextInt();
                      System.out.println("--------------------------------------------");
                       if(num==1)
                       {
                        name[z]="Formal pant";
                         price[z]=599;
                         z++;
                         System.out.println("the cost of your choice: is Rs.599");
                         cost=cost+599;
                    }
                    else if(num==2)
                    {
                        name[z]="Formal tshirt";
                         price[z]=399;
                         z++;
                         System.out.println("the cost of your choice: is Rs.399");
                         cost=cost+399;
                    }
                    else if(num==3)
                    {
                        name[z]="Formal skirt";
                         price[z]=499;
                         z++;
                         System.out.println("the cost of your choice: is Rs.499");
                         cost=cost+499;
                    }
                    else if(num==4)
                    {
                        name[z]="Brown Winter Coat";
                         price[z]=599;
                         z++;
                         System.out.println("the cost of your choice: is Rs.1599");
                         cost=cost+599;
                    }   
                    else
                    System.out.println("Please recheck your input");
                    break;
                    case 4:
                     System.out.println("This is the Western wear section");
                        System.out.println("a large varieties of sizes to choose from!");
                        System.out.println("PLEASE ENTER THE NOS. ACCORDING TO Enter your choice:");
                     System.out.println("1.Jeans");
                     System.out.println("2.Fancy tops");
                     System.out.println("3.Plaid skirts");
                     System.out.println("4. Full sleeve tees");
                     System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
                      num=sc.nextInt();
                      System.out.println("--------------------------------------------");
                       if(num==1)
                       {
                        name[z]="Jeans";
                         price[z]=599;
                         z++;
                         System.out.println("the cost of Enter your choice: is Rs.599");
                         cost=cost+599;
                    }
                    else if(num==2)
                    {
                        name[z]="Fancy tops";
                         price[z]=399;
                         z++;
                         System.out.println("the cost of your choice: is Rs.399");
                         cost=cost+399;
                    }
                    else if(num==3)
                    {
                        name[z]="Plaid skirts";
                         price[z]=499;
                         z++;
                         System.out.println("the cost of your choice: is Rs.499");
                         cost=cost+499;
                    }
                    else if(num==4)
                    {
                        name[z]="Full sleeve tees";
                         price[z]=599;
                         z++;
                         System.out.println("the cost of your choice: is Rs.599");
                         cost=cost+599;
                    }   
                    else
                    System.out.println("please recheck your input");
                    break;
                    case 5:
                    System.out.println("This is the Party wear section");
                        System.out.println("a large varieties of sizes to choose from!");
                        System.out.println("PLEASE ENTER THE NOS. ACCORDING TO Enter your choice:");
                     System.out.println("1.Cocktail dress");
                     System.out.println("2.Disco dress");
                     System.out.println("3.Strapless dress");
                     System.out.println("4. Full sleeve dress");
                     System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
                      num=sc.nextInt();
                      System.out.println("--------------------------------------------");
                       if(num==1)
                       {
                       disc=599-(0.25*599);
                        name[z]="Cocktail dresses";
                         price[z]=disc;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 599 but after discount it is "+disc);
                         cost=cost+disc;
                    }
                    else if(num==2)
                    {
                        disc=699-(0.25*699);
                        name[z]="disco dresses";
                         price[z]=disc;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 699 but after discount it is "+disc);
                         cost=cost+disc;
                    }
                    else if(num==3)
                    {
                        disc=799-(0.25*799);
                        name[z]="Strapless dresses";
                         price[z]=disc;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 799 but after discount it is "+disc);
                         cost=cost+disc;
                    }
                    else if(num==4)
                    {
                        disc=609-(0.25*609);
                        name[z]="Full sleeve dresses";
                         price[z]=disc;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 609 but after discount it is "+disc);
                         cost=cost+disc;
                    }
                    else
                    System.out.println("please recheck your input");
                    break;
                    default:
                    System.out.println("please recheck your input");
                }
            }
            private void Men() 
            {
               Scanner sc=new Scanner(System.in);
            System.out.println("Welcome to the mens clothing section!!!");
         System.out.println("PICK A CLOTHING STYLE OF Enter your choice:!!!!!");//MENU DISPLAY works
              System.out.println("1. Ethnic wear");
              System.out.println("2. Casual wear");
              System.out.println("3. Formal wear"); 
              System.out.println("4. Western wear"); 
              System.out.println("5. Party wear"); 
              System.out.println("20% off on casual wear and 25% off on party wear");
              System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
              int chwo=sc.nextInt();
              System.out.println("--------------------------------------------");
              switch(chwo)
              {
                  case 1:
                  System.out.println("This is the Ethnic section");
                  System.out.println("New designs are just in!!!");
                  System.out.println("Please enter the number according to Enter your choice:!");
                  System.out.println("1.Kurtas");
                     System.out.println("2.Traditional sherwanis");
                     System.out.println("3.Jodhpuri suits");
                     System.out.println("4.Kurta pyjama");
                     System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
                      int num=sc.nextInt();
                      System.out.println("--------------------------------------------");
                      if(num==1)
                      {
                          name[z]="Kurtas";
                         price[z]=900;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 900");
                         cost=cost+900;
                        }
                         else if(num==2)
                         {
                            name[z]="Traditional sherwanis";
                         price[z]=500;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 500");
                         cost=cost+500;
                        }
                        else if(num==3)
                        {
                            name[z]="Jodhpuri suits";
                         price[z]=400;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 400");
                         cost=cost+400;
                        }
                      else if(num==4)
                        {
                            name[z]="Kurta pyjama";
                         price[z]=650;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 650");
                         cost=cost+650;
                        }
                        else
                        System.out.println("please recheck your input");
                        break;
                        case 2:
                        System.out.println("This is the casual wear section");
                        System.out.println("a large varieties of sizes to choose from!");
                        System.out.println("PLEASE ENTER THE NOS. ACCORDING TO Enter your choice:");
                        System.out.println("1.Casual pants");
                     System.out.println("2.casual tshirts");
                     System.out.println("3.casual shirts");
                     System.out.println("4.sweaters/jackets");
                     System.out.println("5. Trousers");
                     System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
                      num=sc.nextInt();
                      System.out.println("--------------------------------------------");
                       if(num==1)
                       {
                        disc=599-(0.20*599);
                        name[z]="Casual pants";
                         price[z]=disc;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 599 but after discount it is "+disc);
                         cost=cost+disc;
                    }
                    else if(num==2)
                    {
                        disc=699-(0.20*699);
                        name[z]="casual tshirts";
                         price[z]=disc;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 699 but after discount it is "+disc);
                         cost=cost+disc;
                    }
                    else if(num==3)
                    {
                        disc=799-(0.20*799);
                        name[z]="casual shirts";
                         price[z]=disc;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 799 but after discount it is "+disc);
                         cost=cost+disc;
                    }
                    else if(num==4)
                    {
                        disc=609-(0.20*609);
                        name[z]="sweaters/jackets";
                         price[z]=disc;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 609 but after discount it is "+disc);
                         cost=cost+disc;
                    }   
                    else if(num==5)
                    {
                        disc=700-(0.20*700);
                        name[z]="Trousers";
                         price[z]=disc;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 700 but after discount it is "+disc);
                         cost=cost+disc;
                    }
                    else
                    System.out.println("please recheck your input");
                    break;
                    case 3:
                    System.out.println("This is the formal wear section");
                        System.out.println("a large varieties of sizes to choose from!");
                        System.out.println("PLEASE ENTER THE NOS. ACCORDING TO Enter your choice:");
                     System.out.println("1.Formal pants");
                     System.out.println("2.Formal shirts");
                     System.out.println("3.Suits");
                     System.out.println("4. Tuxedoes");
                     System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
                      num=sc.nextInt();
                      System.out.println("--------------------------------------------");
                       if(num==1)
                       {
                        name[z]="Formal pants";
                         price[z]=599;
                         z++;
                         System.out.println("the cost of your choice: is Rs.599");
                         cost=cost+599;
                    }
                    else if(num==2)
                    {
                        name[z]="Formal shirts";
                         price[z]=399;
                         z++;
                         System.out.println("the cost of your choice: is Rs.399");
                         cost=cost+399;
                    }
                    else if(num==3)
                    {
                        name[z]="Suits";
                         price[z]=499;
                         z++;
                         System.out.println("the cost of your choice: is Rs.499");
                         cost=cost+499;
                    }
                    else if(num==4)
                    {
                        name[z]=" Tuxedoes";
                         price[z]=599;
                         z++;
                         System.out.println("the cost of your choice: is Rs.599");
                         cost=cost+599;
                    }   
                    else
                    System.out.println("Please recheck your input");
                    break;
                    case 4:
                     System.out.println("This is the Western wear section");
                        System.out.println("a large varieties of sizes to choose from!");
                        System.out.println("PLEASE ENTER THE NOS. ACCORDING TO Enter your choice:");
                     System.out.println("1.Jeans");
                     System.out.println("2.Blue Shirt");
                     System.out.println("3.Red Tie");
                     System.out.println("4.Black Pant");
                     System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
                      num=sc.nextInt();
                      System.out.println("--------------------------------------------");
                       if(num==1)
                       {
                        name[z]="Jeans";
                         price[z]=599;
                         z++;
                         System.out.println("the cost of your choice: is Rs.599");
                         cost=cost+599;
                    }
                    else if(num==2)
                    {
                        name[z]="shirts";
                         price[z]=399;
                         z++;
                         System.out.println("the cost of your choice: is Rs.399");
                         cost=cost+399;
                    }
                    else if(num==3)
                    {
                        name[z]="ties";
                         price[z]=499;
                         z++;
                         System.out.println("the cost of your choice: is Rs.499");
                         cost=cost+499;
                    }
                    else if(num==4)
                    {
                        name[z]="pants";
                         price[z]=599;
                         z++;
                         System.out.println("the cost of your choice: is Rs.599");
                         cost=cost+599;
                    }   
                    else
                    System.out.println("please recheck your input");
                    break;
                    case 5:
                    System.out.println("This is the Party wear section");
                        System.out.println("a large varieties of sizes to choose from!");
                        System.out.println("PLEASE ENTER THE NOS. ACCORDING TO Enter your choice:");
                     System.out.println("1.party wear shirts");
                     System.out.println("2. funky party wear");
                     System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
                      num=sc.nextInt();
                      System.out.println("--------------------------------------------");
                       if(num==1)
                       {
                       disc=599-(0.25*599);
                        name[z]="party wear shirts";
                         price[z]=disc;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 599 but after discount it is "+disc);
                         cost=cost+disc;
                    }
                    else if(num==2)
                    {
                        disc=699-(0.25*699);
                        name[z]="funky party wear";
                         price[z]=disc;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 699 but after discount it is "+disc);
                         cost=cost+disc;
                    }
                    else
                    System.out.println("please recheck your input");
                    break;
                    default:
                    System.out.println("Please recheck your input");
                }
            }
            private void Kids()
            {
                Scanner sc=new Scanner(System.in);
            System.out.println("welcome to the kids clothing section!!!");
            System.out.println("please enter a no. according to Enter your choice:");
            System.out.println("1. 0-12 months");
            System.out.println("2. 1-6 years");
            System.out.println("3. 7-12 years");
            System.out.println("4. 8-15 years");
            System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
            int chwo=sc.nextInt();
            System.out.println("--------------------------------------------");
            switch(chwo)
            {
                case 1:
                 System.out.println("welcome to the infants section!");
                  System.out.println("new designs are just in!!!");
                  System.out.println("Please enter the gender of your baby i.e. 1 for female and 2 for male!");
                  String sex=sc.next();
                  if(sex.equalsIgnoreCase("1"))
                  {
                      System.out.println("kindly look around and choose the correct size for your darling");
                      System.out.println("1.Skirt");
                       System.out.println("2.Plain frock");
                       System.out.println("3.Frilled frock");
                       System.out.println("4. T-shirt");
                        System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
                       int num=sc.nextInt();
                       System.out.println("--------------------------------------------");
                       if(num==1)
                       {
                           name[z]="skirts";
                           price[z]=299;
                           z++;
                           System.out.println("the cost of your choice: is 299");
                           cost=cost+299;
                        }
                        else if(num==2)
                    {
                        name[z]="Plain frocks";
                         price[z]=399;
                         z++;
                         System.out.println("the cost of your choice: is Rs.399");
                         cost=cost+399;
                    }
                    else if(num==3)
                    {
                        name[z]="frilled frocks";
                         price[z]=499;
                         z++;
                         System.out.println("the cost of your choice: is Rs.499");
                         cost=cost+499;
                    }
                    else if(num==4)
                    {
                        name[z]="t-shirts";
                         price[z]=599;
                         z++;
                         System.out.println("the cost of your choice: is Rs.599");
                         cost=cost+599;
                    }   
                    else
                    System.out.println("please recheck your input");
                    break;
                }
                    else if(sex.equalsIgnoreCase("2"));
                    {
                        System.out.println("kindly look around and choose the correct size for your darling");
                      System.out.println("1.pants");
                       System.out.println("2.plain shirts");
                       System.out.println("3.fancy shirts");
                       System.out.println("4. shorts and tshirts");
                       System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
                       num=sc.nextInt();
                       System.out.println("--------------------------------------------");
                       if(num==1)
                       {
                           name[z]="pants";
                           price[z]=299;
                           z++;
                           System.out.println("the cost of your choice: is 299");
                           cost=cost+299;
                        }
                        else if(num==2)
                    {
                        name[z]="plain shirts";
                         price[z]=399;
                         z++;
                         System.out.println("the cost of your choice: is Rs.399");
                         cost=cost+399;
                    }
                    else if(num==3)
                    {
                        name[z]="fancy shirts";
                         price[z]=499;
                         z++;
                         System.out.println("the cost of your choice: is Rs.499");
                         cost=cost+499;
                    }
                    else if(num==4)
                    {
                        name[z]="shorts and tshirts";
                         price[z]=599;
                         z++;
                         System.out.println("the cost of your choice: is Rs.599");
                         cost=cost+599;
                    }   
                    else
                    System.out.println("please recheck your input");
                    break;
                }
                    case 2:
                    System.out.println("welcome to the 1-6 years old kids section!");
                  System.out.println("new designs are just in!!!");
                  System.out.println("Please enter the gender of your baby i.e. female or male!");
                  sex=sc.next();
                  if(sex.equalsIgnoreCase("female"))
                  {
                      System.out.println("kindly look around and choose the correct size for your tiny tot");
                      System.out.println("1.skirts");
                       System.out.println("2.frocks");
                       System.out.println("3.ghagras");
                       System.out.println("4. dangrees");
                       System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
                       int num=sc.nextInt();
                       System.out.println("--------------------------------------------");
                       if(num==1)
                       {
                           name[z]="skirts";
                           price[z]=299;
                           z++;
                           System.out.println("the cost of your choice: is 299");
                           cost=cost+299;
                        }
                        else if(num==2)
                    {
                        name[z]="frocks";
                         price[z]=399;
                         z++;
                         System.out.println("the cost of your choice: is Rs.399");
                         cost=cost+399;
                    }
                    else if(num==3)
                    {
                        name[z]="ghagras";
                         price[z]=499;
                         z++;
                         System.out.println("the cost of your choice: is Rs.499");
                         cost=cost+499;
                    }
                    else if(num==4)
                    {
                        name[z]="dangrees";
                         price[z]=599;
                         z++;
                         System.out.println("the cost of Enter your choice: is Rs.599");
                         cost=cost+599;
                    }   
                    else
                    System.out.println("please recheck your input");
                    break;
                }
                    else if(sex.equalsIgnoreCase("male"));
                    System.out.println("kindly look around and choose the correct size for your darling");
                      System.out.println("1.pants");
                       System.out.println("2.shirts");
                       System.out.println("3.trousers");
                       System.out.println("4. small sherwanis");
                       System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
                       int num=sc.nextInt();
                       System.out.println("--------------------------------------------");
                       if(num==1)
                       {
                           name[z]="pants";
                           price[z]=299;
                           z++;
                           System.out.println("the cost of your choice: is 299");
                           cost=cost+299;
                        }
                        else if(num==2)
                    {
                        name[z]="shirts";
                         price[z]=399;
                         z++;
                         System.out.println("the cost of your choice: is Rs.399");
                         cost=cost+399;
                    }
                    else if(num==3)
                    {
                        name[z]="trousers";
                         price[z]=499;
                         z++;
                         System.out.println("the cost of your choice: is Rs.499");
                         cost=cost+499;
                    }
                    else if(num==4)
                    {
                        name[z]="small sherwanis";
                         price[z]=599;
                         z++;
                         System.out.println("the cost of your choice: is Rs.599");
                         cost=cost+599;
                    }   
                    else
                    System.out.println("please recheck your input");
                    break;
                    case 3:
                  System.out.println("welcome to the 7-12 years old kids section!");
                  System.out.println("new designs are just in!!!");
                  System.out.println("Please enter the gender of your baby i.e. female or male!");
                  sex=sc.next();;
                  if(sex.equalsIgnoreCase("female"))
                  {
                      System.out.println("kindly look around and choose the correct size for your tiny tot");
                      System.out.println("1.skirts");
                       System.out.println("2.frocks");
                       System.out.println("3.ghagras");
                       System.out.println("4. dangrees");
                       System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
                       num=sc.nextInt();
                       System.out.println("--------------------------------------------");
                       if(num==1)
                       {
                           name[z]="skirts";
                           price[z]=299;
                           z++;
                           System.out.println("the cost of your choice: is 299");
                           cost=cost+299;
                        }
                        else if(num==2)
                    {
                        name[z]="frocks";
                         price[z]=399;
                         z++;
                         System.out.println("the cost of your choice: is Rs.399");
                         cost=cost+399;
                    }
                    else if(num==3)
                    {
                        name[z]="ghagras";
                         price[z]=499;
                         z++;
                         System.out.println("the cost of your choice: is Rs.499");
                         cost=cost+499;
                    }
                    else if(num==4)
                    {
                        name[z]="dangrees";
                         price[z]=599;
                         z++;
                         System.out.println("the cost of your choice: is Rs.599");
                         cost=cost+599;
                    }   
                    else
                    System.out.println("please recheck your input");
                    break;
                }
                    else if(sex.equalsIgnoreCase("male"));
                    System.out.println("kindly look around and choose the correct size for your darling");
                      System.out.println("1.pants");
                       System.out.println("2.shirts");
                       System.out.println("3.trousers");
                       System.out.println("4. small sherwanis");
                       System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
                       num=sc.nextInt();
                       System.out.println("--------------------------------------------");
                       if(num==1)
                       {
                           name[z]="pants";
                           price[z]=299;
                           z++;
                           System.out.println("the cost of your choice: is 299");
                           cost=cost+299;
                        }
                        else if(num==2)
                    {
                        name[z]="shirts";
                         price[z]=399;
                         z++;
                         System.out.println("the cost of your choice: is Rs.399");
                         cost=cost+399;
                    }
                    else if(num==3)
                    {
                        name[z]="trousers";
                         price[z]=499;
                         z++;
                         System.out.println("the cost of your choice is Rs.499");
                         cost=cost+499;
                    }
                    else if(num==4)
                    {
                        name[z]="small sherwanis";
                         price[z]=599;
                         z++;
                         System.out.println("the cost of your choice is Rs.599");
                         cost=cost+599;
                    }   
                    else
                    System.out.println("please recheck your input");
                    break;
                    case 4:
                  System.out.println("welcome to the 8-15 years old kids section!");
                  System.out.println("new designs are just in!!!");
                  System.out.println("Please enter the gender of your baby i.e. female or male!");
                  sex=sc.next();
                  System.out.println("--------------------------------------------");
                  if(sex.equalsIgnoreCase("female"))
                  {
                      System.out.println("kindly look around and choose the correct size for your tiny tot");
                      System.out.println("1.skirts");
                       System.out.println("2.dresses");
                       System.out.println("3.ghagras");
                       System.out.println("4. dangrees");
                       System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
                       num=sc.nextInt();
                       System.out.println("--------------------------------------------");
                       if(num==1)
                       {
                           name[z]="skirts";
                           price[z]=299;
                           z++;
                           System.out.println("the cost of your choice: is 299");
                           cost=cost+299;
                        }
                        else if(num==2)
                    {
                        name[z]="dresses";
                         price[z]=399;
                         z++;
                         System.out.println("the cost of your choice: is Rs.399");
                         cost=cost+399;
                    }
                    else if(num==3)
                    {
                        name[z]="ghagras";
                         price[z]=499;
                         z++;
                         System.out.println("the cost of your choice: is Rs.499");
                         cost=cost+499;
                    }
                    else if(num==4)
                    {
                        name[z]="dangrees";
                         price[z]=599;
                         z++;
                         System.out.println("the cost of your choice: is Rs.599");
                         cost=cost+599;
                    }   
                    else
                    System.out.println("please recheck your input");
                    break;
                }
                    else if(sex.equalsIgnoreCase("male"));
                    {
                        System.out.println("kindly look around and choose the correct size for your darling");
                      System.out.println("1.pants");
                       System.out.println("2.shirts");
                       System.out.println("3.trousers");
                       System.out.println("4. sherwanis");
                       System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
                       num=sc.nextInt();
                       System.out.println("--------------------------------------------");
                       if(num==1)
                       {
                           name[z]="pants";
                           price[z]=299;
                           z++;
                           System.out.println("the cost of your choice: is 299");
                           cost=cost+299;
                        }
                        else if(num==2)
                    {
                        name[z]="shirts";
                         price[z]=399;
                         z++;
                         System.out.println("the cost of your choice: is Rs.399");
                         cost=cost+399;
                    }
                    else if(num==3)
                    {
                        name[z]="trousers";
                         price[z]=499;
                         z++;
                         System.out.println("the cost of your choice: is Rs.499");
                         cost=cost+499;
                    }
                    else if(num==4)
                    {
                        name[z]="sherwanis";
                         price[z]=599;
                         z++;
                         System.out.println("the cost of your choice: is Rs.599");
                         cost=cost+599;
                    }   
                    else
                    System.out.println("please recheck your input");
                    break;
                }
                    default:
                    System.out.println("please recheck your input");
                    break;
                }
            }
        private void Acessories()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("welcome to the acessories section!!!");
            System.out.println("please enter a no. according to Enter your choice:");
            System.out.println("1. cosmetics");
            System.out.println("2. belts");
            System.out.println("3. bracelets/bangels");
            System.out.println("4. pendants");
            System.out.println("5. hairbands");
            System.out.println("6. ties");
            System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
            int chwo=sc.nextInt();
            System.out.println("--------------------------------------------");
            switch(chwo)
            {
                case 1:
                 System.out.println("discount of 15% on a purchase of 2000 in this section");
                  System.out.println("new products are just in!!!");
                  disc=2000-(0.15*2000);
                  cost=cost+disc;
                  name[z]="Cosmetics";
                         price[z]=disc;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 900");
                         break;
                       case 2:
                            System.out.println("discount of 5% on a purchase of 2000 in this section");
                  System.out.println("new products are just in!!!");
                  disc=500-(0.5*500);
                  cost=cost+disc;
                  name[z]="belts";
                         price[z]=disc;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 900");
                         break;
                         case 3:
                        System.out.println("discount of 15% on a purchase of 1000 in this section");
                  System.out.println("new products are just in!!!");
                  disc=1000-(0.15*1000);
                  cost=cost+disc;
                  name[z]="bangels and bracelets";
                         price[z]=disc;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 900");
                         break;
                         case 4:
                      System.out.println("discount of 15% on a purchase of 2000 in this section");
                  System.out.println("new products are just in!!!");
                  disc=2000-(0.15*2000);
                  cost=cost+disc;
                  name[z]="Chains";
                         price[z]=disc;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 900");
                         break;
                         case 5:
                        System.out.println("discount of 25% on a purchase of 2000 in this section");
                  System.out.println("new products are just in!!!");
                  disc=2000-(0.25*2000);
                  cost=cost+disc;
                  name[z]="hairband/clips";
                         price[z]=disc;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 900");
                         break;
                         case 6:
                         System.out.println("discount of 15% on a purchase of 2000 in this section");
                  System.out.println("new products are just in!!!");
                  disc=2000-(0.15*2000);
                  cost=cost+disc;
                  name[z]="ties";
                         price[z]=disc;
                         z++;
                         System.out.println("the cost of your choice: is Rs. 900");
                         break;
                        default:
                        System.out.println("please recheck your input");
                        break;
                    }
                }
              private void Shoes()
                {
             Scanner sc=new Scanner(System.in);      
            System.out.println("welcome to shoes section!!!");
            System.out.println("please enter a no. according to Enter your choice:");
            System.out.println("1. mens footwear");
            System.out.println("2. womens footwear");
            System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
            int chwo=sc.nextInt();
            System.out.println("--------------------------------------------");
            switch(chwo)
            {
            case 1:
            System.out.println("welcome to the mens footwear section");
            System.out.println("1. running shoes");
            System.out.println("2. boots");
            System.out.println("3. sandals");
            System.out.println("4. leather shoes");
            System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
            int num=sc.nextInt();
            System.out.println("--------------------------------------------");
            if(num==1)
            {
                name[z]="running shoes";
                price[z]=3000;
                z++;
                System.out.println("the cost of your purchase is 3000");
                cost=cost+3000;
            }
            else if(num==2)
            {
                 name[z]="boots";
                price[z]=2000;
                z++;
                System.out.println("the cost of your purchase is 3000");
                cost=cost+2000;
            }
            else if(num==3)
            { 
                name[z]="sandals";
                price[z]=2000;
                z++;
                System.out.println("the cost of your purchase is 3000");
                cost=cost+2000;
            }
            else if(num==4)
            {
                 name[z]="leather shoes";
                price[z]=2000;
                z++;
                System.out.println("the cost of your purchase is 3000");
                cost=cost+2000;
            }
            else
            {
                System.out.println("please recheck of your input");
            }
            break;
            case 2:
            System.out.println("welcome to the womens footwear section");
            System.out.println("1. running shoes");
            System.out.println("2. boots");
            System.out.println("3. sandals");
            System.out.println("4. high heels");
            System.out.println("Please pick a number according to the above given menu");
              System.out.print("Enter your choice:");
            num=sc.nextInt();
            System.out.println("--------------------------------------------");
            if(num==1)
            {
                name[z]="running shoes";
                price[z]=3000;
                z++;
                System.out.println("the cost of your purchase is 3000");
                cost=cost+3000;
            }
            else if(num==2)
            {
                 name[z]="boots";
                price[z]=2000;
                z++;
                System.out.println("the cost of your purchase is 3000");
                cost=cost+2000;
            }
            else if(num==3)
            { 
                name[z]="sandals";
                price[z]=2000;
                z++;
                System.out.println("the cost of your purchase is 3000");
                cost=cost+2000;
            }
            else if(num==4)
            {
                 name[z]="high heels";
                price[z]=2000;
                z++;
                System.out.println("the cost of your purchase is 3000");
                cost=cost+2000;
            }
            else
            {
                System.out.println("please recheck your input");
            }
            break;
            default:
            System.out.println("please recheck input");
        }
    }
private void exit()
{
    System.exit(0);
}
}


            
                
                    
                    
                    