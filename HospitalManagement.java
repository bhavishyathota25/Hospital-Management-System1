import java.io.*;
import java.util.*;
import java.util.Calendar;
class staff
{
 String s_id,s_name,desg,gender;
 int sal;
 void new_staff()
 {
     Scanner input = new Scanner(System.in);
     System.out.print("id : ");
     s_id = input.nextLine();
     System.out.print("name : ");
     s_name = input.nextLine();
     System.out.print("designation : ");
     desg = input.nextLine();
     System.out.print("gender : ");
     gender = input.nextLine();
     System.out.print("salary : ");
     sal = input.nextInt();
 } 
  void staff_info()
  {
    System.out.println(s_id + "\t" + s_name + "\t" + gender + "\t" + sal);
  }
}
 class doctor
 {
  String doc_id , doc_name , specialist , appoint , doc_qual;
  int doc_r;
  void new_doctor()
  {
     Scanner input = new Scanner(System.in);
     System.out.print("id : ");
     doc_id = input.nextLine();
     System.out.print("name : ");
     doc_name = input.nextLine();
     System.out.print("specialization : ");
     specialist = input.nextLine();
     System.out.print("work time : ");
     appoint = input.nextLine();
     System.out.print("qualification : ");
     doc_qual = input.nextLine();
     System.out.print("room no : ");
     doc_r = input.nextInt();
  }
  void doctor_info()
  {
    System.out.println(doc_id + "\t" + doc_name + "         \t" + specialist + "     \t" + appoint + "  \t" + doc_qual + "\t\t" +  doc_r);
  }
 }
class patient
 {
  String p_id , p_name , disease , gender , admit_status;
  int age;
  void new_patient()
  {
    Scanner input = new Scanner(System.in);
    System.out.print("id : ");
    p_id = input.nextLine();
    System.out.print("name : ");
    p_name = input.nextLine();
    System.out.print("disease : ");
    disease = input.nextLine();
    System.out.print("gender : ");
    gender = input.nextLine();
    System.out.print("admit_status : ");
    admit_status = input.nextLine();
    System.out.print("age : ");
    age = input.nextInt();
  }
  void patient_info()
  {
    System.out.println(p_id + "    \t" + p_name + "    \t" + disease + "    \t" + gender + "    \t" + admit_status + "\t" + age);
  }
 }
class medical
  {
   String med_name , med_comp , exp_date;
   int med_cost , count;
   void new_med()
   {
    Scanner input = new Scanner(System.in);
    System.out.print("name : ");
    med_name = input.nextLine();
    System.out.print("comp : ");
    med_comp = input.nextLine();
    System.out.print("exp_date : ");
    exp_date = input.nextLine();
    System.out.print("cost : ");
    med_cost = input.nextInt();
    System.out.print("no of units : ");
    count = input.nextInt();
    
   }
   void find_med()
   {
    System.out.println(med_name + "    \t" + med_comp + "    \t" + exp_date + "    \t"+ med_cost);
   }
  
  }
class lab
{
   String facility;
   int lab_cost;
   void new_fac()
   {
    Scanner input = new Scanner(System.in);
    System.out.print("facility : ");
    facility = input.nextLine();
    System.out.print("cost : ");
    lab_cost = input.nextInt();
   }
   void fac_list()
   {
    System.out.println(facility + "\t\t" + lab_cost);
   }

}
class facility
{
   String fac_name;
   void add_fac()
   {
     Scanner input = new Scanner(System.in);
     System.out.print("facility : ");
     fac_name = input.nextLine();

   }
    void show_fac()
    {
     System.out.println(fac_name);
    }

}
public class HospitalManagement
{
   public static void main(String args[])
   {
      String months[] = {
         "Jan",
         "Feb",
         "Mar",
         "Apr",
         "May",
         "Jun",
         "Jul",
         "Aug",
         "Sep",
         "Oct",
         "Nov",
         "Dec"


    };
     Calendar calendar = Calendar.getInstance();
    
     int count1 = 4 , count2 = 4 , count3 = 4 , count4 = 4 , count5 = 4 , count6 = 4;
     System.out.println("\n-------------------------------------------------------------------------------------------------");
System.out.println("         *** Welcome to Hospital Management System Project in Java***                ");
System.out.println("\n------------------------------------------------------------------------------------------------------");
System.out.print("Date : " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));
System.out.println("\t\t\t\t\t\t\t\tTime " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
doctor[] d = new doctor[25];
patient[] p = new patient[100];
lab[] l = new lab[20];
facility[] f = new facility[20];
medical[] m = new medical[100];
staff[] s = new staff[100];
int i;
for(i = 0 ; i < 25 ; i++)
    d[i] = new doctor();
for(i = 0 ; i < 100 ; i++)
    p[i] = new patient();
for(i = 0 ; i < 20 ; i++)
    l[i] = new lab();
for(i = 0 ; i < 20 ; i++)
    f[i] = new facility();
for(i = 0 ; i < 100 ; i++)
    m[i] = new medical();
for(i = 0 ; i < 100 ; i++)
    s[i] = new staff();
 
//doctors details

d[0].doc_id     = "21";
d[0].doc_name   = "Dr.Yash";
d[0].specialist = "ENT";
d[0].appoint    = "5 - 11AM";
d[0].doc_qual   = "MBBS,MD";
d[0].doc_r      =  17;

d[1].doc_id     = "32";
d[1].doc_name   = "Dr.Amit";
d[1].specialist = "Physician";
d[1].appoint    = "10 - 3AM";
d[1].doc_qual   = "MBBS,MD";
d[1].doc_r      =  45;

d[2].doc_id     = "17";
d[2].doc_name   = "Dr.Vedhaswini";
d[2].specialist = "Surgeon";
d[2].appoint    = "8 - 2AM";
d[2].doc_qual   = "BDM";
d[2].doc_r      =    8;

d[3].doc_id     = "33";
d[3].doc_name   = "Dr.Vaibhav";
d[3].specialist = "Artho";
d[3].appoint    = "10 - 4PM";
d[3].doc_qual   = "MBBS,MS";
d[3].doc_r      =  40;

//patient details

p[0].p_id = "12";
p[0].p_name = "Pankaj";
p[0].disease = "Cancer";
p[0].gender = "Male";
p[0].admit_status = "y";
p[0].age = 50;

p[1].p_id = "13";
p[1].p_name = "Varshika";
p[1].disease = "Cold";
p[1].gender = "Female";
p[1].admit_status = "y";
p[1].age = 15;

p[2].p_id = "14";
p[2].p_name = "Aswin";
p[2].disease = "Malaria";
p[2].gender = "Male";
p[2].admit_status = "y";
p[2].age = 40;

p[3].p_id = "15";
p[3].p_name = "Rashi";
p[3].disease = "Diabetes";
p[3].gender = "Female";
p[3].admit_status = "y";
p[3].age = 30;

//medicine details

m[0].med_name = "Corex";
m[0].med_comp = "Cino pvt";
m[0].exp_date = "9-5-2025";
m[0].med_cost = 55;
m[0].count = 8;

m[1].med_name = "Nytra";
m[1].med_comp = "Ace pvt";
m[1].exp_date = "4-4-2029";
m[1].med_cost = 500;
m[1].count = 8;

m[2].med_name = "Brufa";
m[2].med_comp = "Reckitt";
m[2].exp_date = "12-7-2026";
m[2].med_cost = 50;
m[2].count = 56;

m[3].med_name = "Pride";
m[3].med_comp = "DDF pvt";
m[3].exp_date = "12-4-2024";
m[3].med_cost = 1100;
m[3].count = 100;

//lab details

l[0].facility = "X-ray     ";
l[0].lab_cost = 800;
l[1].facility = "CT Scan   ";
l[1].lab_cost = 1200;
l[2].facility = "OR Scan   ";
l[2].lab_cost = 500;
l[3].facility = "Blood Bank";
l[3].lab_cost = 50;

//facilities details

f[0].fac_name = "Ambulance";
f[1].fac_name = "Admit Faciity ";
f[2].fac_name = "Canteen";
f[3].fac_name = "Emergency";

//staff details

s[0].s_id = "22";
s[0].s_name = "Prakash";
s[0].desg = "Worker";
s[0].gender = "Male";
s[0].sal = 5000;

s[1].s_id = "23";
s[1].s_name = "Komal";
s[1].desg = "Nurse";
s[1].gender = "Female";
s[1].sal = 6000;

s[2].s_id = "24";
s[2].s_name = "Raj";
s[2].desg = "Worker";
s[2].gender = "Male";
s[2].sal = 4000;

s[3].s_id = "25";
s[3].s_name = "Ranvi";
s[3].desg = "Nurse";
s[3].gender = "Female";
s[3].sal = 9000;

Scanner input = new Scanner(System.in);
int choice , j , c1 , status = 1 , s1 = 1 ,s2 = 1 ,s3 = 1,s4 = 1,s5 = 1 ,s6 = 1;
while (status == 1)
{
System.out.println("\n                MAIN MENU             ");
 System.out.println("---------------------------------------------------------------------------------------------------------");
System.out.println("1.Doctors    2.Patients   3.Medicines   4.Laboratories  5.Facilities   6.Staff");
System.out.println("----------------------------------------------------------------------------------------------------------");
choice = input.nextInt();
switch (choice)
{
 case 1:
     {
         System.out.println("-------------------------------------------------------------------------------------------------");
System.out.println("                 ***DOCTORS SECTION***             ");
System.out.println("----------------------------------------------------------------------------------------------------------");
s1 = 1;
while (s1 == 1)
{
 System.out.println("1.Add New Entry\n2.Existing Doctors List");
    c1 = input.nextInt();
switch (c1)
{
  case 1:
       {
        d[count1].new_doctor();
        count1++;
        break;
       }
  case 2:
       {
        System.out.println("-----------------------------------------------------------------------------------------------");
System.out.println("id \t Name \t\t\t Specialist\tTiming\t\tQualification\tRoom No.");
System.out.println("-------------------------------------------------------------------------------------------------------");
for(j = 0;j < count1;j++)
{
  d[j].doctor_info();
}
  break;
       }
}
System.out.println("\n Return to Back Press 1 and for Main Menu Press 0");
s1 = input.nextInt();
}
break;
        }
case 2:
{
  System.out.println("------------------------------------------------------------------------------------------------------");
System.out.println("                 ***PATIENT SECTION***                     ");
System.out.println("--------------------------------------------------------------------------------------------------------");
s2 = 1;
 while(s2 == s1)
 {
   System.out.println("1.Add New Entry\n2.Existing Patients List");
   c1 = input.nextInt();
   switch(c1)
   {
     case 1:
          {
           p[count2].new_patient();
           count2++;
           break;    
          }
     case 2:
          {
System.out.println("--------------------------------------------------------------------------------------------------");
System.out.println("id \t Name \t\t  Disease\tGender\tAdmit Status \t Age");
System.out.println("--------------------------------------------------------------------------------------------------");
for(j = 0;j<count2;j++)
 {
  p[j].patient_info();
 }
 break;
          }
 }
System.out.println("\n Return to Back Press 1 and for Main Menu Press 0");
s2 = input.nextInt();
}
break;
}
case 3:
{
  s3 = 1;
  System.out.println("--------------------------------------------------------------------------------------------------");
  System.out.println("                    ***MEDICINE SECTION***                       ");
  System.out.println("--------------------------------------------------------------------------------------------------");
  while(s3 == 1)
   {
    System.out.println("1.Add New Entry\n2.Existing Medicines List");
    c1 = input.nextInt();
    switch(c1)
    {
      case 1:
         {
           m[count3].new_med();
           count3++;
           break;
         }
      case 2:
         {
           System.out.println("---------------------------------------------------------------------------------------");
           System.out.println("Name \t\t  Company \t Expiry Date \t Cost");
           System.out.println("---------------------------------------------------------------------------------------");
           for(j=0;j<count3;j++){
           m[j].find_med();
           }
           break;
         }
    }
    System.out.println("\n Return to Back Press 1 and for Main Menu 0");
    s3 = input.nextInt();
   }
   break;
}
case 4:
{
  s4 = 1;
  System.out.println("--------------------------------------------------------------------------------------------------");
  System.out.println("          ***LABORATORY SECTION***                      ");
  System.out.println("--------------------------------------------------------------------------------------------------");
  while(s4 == 1)
  {
   System.out.println("1.Add New Entry\n2.Existing Laboratories List");
   c1 = input.nextInt();
   switch(c1)
   {
    case 1:
       {
        l[count4].new_fac();
        count4++;
        break;
       }
    case 2:
     {
     System.out.println("-----------------------------------------------------------------------------------------------");
     System.out.println("Facilities\t\t Cost");
     System.out.println("-----------------------------------------------------------------------------------------------");
     for (j=0;j<count4;j++){
       l[j].fac_list();
      }
       break;
     }
   }
   System.out.println("\n Return to Back Press 1 and for Main Menu Press 0");
   s4 = input.nextInt();
  }
   break;
}
case 5:
{
 s5 = 1;
 System.out.println("---------------------------------------------------------------------------------------------------");
 System.out.println("       ***HOSPITAL FACILITY SECTION***");
 System.out.println("---------------------------------------------------------------------------------------------------");
 while(s5 == 1)
 {
  System.out.println("1.Add New Facility\n2.Existing Facilities List");
  c1 = input.nextInt();
  switch(c1)
   {
      case 1:
          {
           f[count5].add_fac();
           count5++;
           break;
          }
      case 2:
          {
           System.out.println("-------------------------------------------------------------------------------------------------");
           System.out.println("Hospital Facilities are : ");
           System.out.println("-------------------------------------------------------------------------------------------------");
           for(j=0;j<count5;j++){
           f[j].show_fac();
           }
           break;
          }
   } 
  System.out.println("\n Return to Back Press 1 and for Main Menu Press 0");
  s5 = input.nextInt();
 }
 break;
}
case 6:
{
 s6 = 1;
 System.out.println("------------------------------------------------------");
 System.out.println("               ***STAFF SECTION***              ");
 System.out.println("------------------------------------------------------");
 while(s6 == 1)
  {
   String a = "Nurse" , b = "Worker" , c = "Security";
   System.out.println("1.Add New Entry\n2.existing Nurses List\n3.existing Workers List\n4.Existing Security List");
   c1 = input.nextInt();
   switch(c1)
   {
     case 1:
      {
        s[count6].new_staff();
        count6++;
        break;
      }
     case 2:
      {
       System.out.println("-------------------------------------------------");
       System.out.println("id \t Name \t Gender \t Salary");
       System.out.println("-------------------------------------------------");
       for(j=0;j<count6;j++)
        {
         if(a.equals(s[j].desg))
          s[j].staff_info();
        }
         break; 
      }
    case 3:
       {
       System.out.println("-------------------------------------------------");
       System.out.println("id \t Name \t Gender \t Salary");
       System.out.println("-------------------------------------------------");
       for(j=0;j<count6;j++)
        {
         if(b.equals(s[j].desg))
          s[j].staff_info();
        }
         break; 
      }
    case 4:
       {
       System.out.println("-------------------------------------------------");
       System.out.println("id \t Name \t Gender \t Salary");
       System.out.println("-------------------------------------------------");
       for(j=0;j<count6;j++)
        {
         if(a.equals(s[j].desg))
          s[j].staff_info();
        }
         break; 
      }
  }
   System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s6 = input.nextInt();
                        }
                        break;
                    }
  default:
                    {
                        System.out.println(" You Have Enter Wrong Choice!!!");
                    }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
      }
   }
}
       
                                  

