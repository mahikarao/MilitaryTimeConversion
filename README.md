# MilitaryTimeConversion
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.  Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.


# Function Explained:
```
static String timeConversion(String s) {
int n=s.length();
String zone=s.substring(n-2);     //To check whether time will be in AM or PM
String res;
String s1[]=s.split(zone);        //Get time independent of "AM"-"PM" string
String temp=s1[0];
String time[]=temp.split(":");    //Segregate Hours, Minutes, Seconds
if(zone.equals("PM")){
   int temp2=Integer.parseInt(time[0]);
   if(temp2!=12){
   temp2=temp2+12;
   time[0]=String.valueOf(temp2);
   }
   res=time[0]+":"+time[1]+":"+time[2];
   }
   else{
   if(time[0].equals("12")){
       time[0]="00";
            }
   res=time[0]+":"+time[1]+":"+time[2];
   }
   return res;
}
```    
# Tricky thing noted:
if(zone=="PM")) doesn't work as String does not get compared implicitly
instead, if(zone.equals("PM")) will work.
