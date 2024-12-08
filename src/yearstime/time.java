/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yearstime;

/**
 *
 * @author Ammar
 */
public class time {
    private int years;
    private int months;
    private int days;
    private int hours;
    private int mins;
    private int secs;
   
    
    //non parameterized consturctor
    public time(){
        this.years=12;
        this.months=12;
        this.days=12;
        this.hours=12;
        this.mins=12;
        this.secs=12;
        System.out.printf("\nYears%d\n \nMonths%d\n \nDays%d\n \nHours%d\n \nMins%d\n \nSecs%d\n", this.years,this.months,this.days,this.hours,this.hours,this.mins,this.secs);
    }
 public void setYears(int a){
     
            this.years=a;
 }
 public void setMonths(int b){
     
           if(b>=1 && b<=12){
                this.months=b;
           }
           else{
              System.out.println("Enter Valid Month");
           }
                   
 }
 public void setDays(int c){
     
            if(c>=1 && c<=30){
     this.days=c;
 }
            else{
                    System.out.println("Enter Valid Days");
                    }
 }
 public int getYears(){
     return this.years;
     
 }
  public int getMonths(){
     return this.months;
     
 }
    public int getDays(){
     return this.days;
     
 }
    public void setHours(int x){
        if(x>=0 && x<=24){
            this.hours=x;
        }
        else{
            System.out.println("Enter Valid Hours") ;
        }
    }
    public int getHours(){
        return this.hours;
    }
    public void setMins(int y){
     if(y>=0 && y<=60){
                 this.mins=y;
     }
     else {
         System.out.println("Enter Valid MINS");
     }
    }
    public int getMins(){
        return this.mins;
        
    }
    public void setSecs(int z){
    if(z>=0 && z<=60){
                this.secs=z;
    }
    else{
        System.out.println("Enter Valid Seconds");
    }
    }
    public int getSecs(){
        return this.secs;
    }
    //PARAMETERIXED CONSTRUCTOR
    public time(int a,int b, int c , int x,int y,int z){
        this.years=a;
        this.months=b;
        this.days=c;
        this.hours=x;
        this.mins=y;
        this.secs=z;
        System.out.printf("\n Years:%d\nMonth:%d\nDAY:%d\nHOURS:%d\nMIns:%d\nSecs:%d\n",this.years,this.months,this.days,this.hours,this.mins,this.secs);
        
    }
    //CONSTRUCTOR FOR COPYING
    public time(time ref){
        this.years=ref.years;
        this.months=ref.months;
        this.days=ref.days;
        this.hours=ref.hours;
        this.mins=ref.mins;
        this.secs=ref.secs;
        
    }
        public void ShowUniversalTime(){ 
         System.out.printf("%d:%d:%d:%d:%d:%d",this.getYears(),this.getMonths(),this.getDays(),this.getHours(),this.getMins(),this.getSecs()); 
     } 
}

