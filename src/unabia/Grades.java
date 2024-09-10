package unabia;

public class Grades {
    
    
   String name;
    int id;
    double p, m, pf, f;

    public void addGrades(int sid, String name, double prl, double mid, double prf, double fnl){
       this.id = sid;
       this.name = name;
       this.p = prl;
       this.m = mid;
       this.pf = prf;
       this.f =fnl;

 }    

    public void viewGrades(){

        double average = (this.p + this.m  + this.pf + this.f)/4;

        String remarks = (average > 3.0) ? "Failed" : "passed";


        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                  "ID", "Name", "Prelim", "Midterm", "Prefinal", "Final", "Average", "Remarks");



        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s \n ",
                        this.id, this.name, this.p, this.m, this.pf, this.f, average, remarks);        

        System.out.println("------------------------------------------------------------------------");

    }



}  
    
    

