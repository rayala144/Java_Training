package com.inheritanceExamples;




class student {
    
    String name;
    int no;
    
    public void read(String k, int l) {
        name = k;
        no = l;
    }
    
    public void display() {
        System.out.println("Student name: "+name);
        System.out.println("Student no: "+no);
    }
}



class dept extends student {
    
    String dname;
    int dno;
    
    public void readd(String a, int b, String c, int d) {
        read(a,b);
        dname = c;
        dno = d;
    }
    
    public void displayd() {
        
        display();
        System.out.println("Dept name: "+dname);
        System.out.println("Dept no: "+dno);
    }
}



class course extends dept {
    
    String cname;
    int cno;
    
    public void readc(String x, int m, String l, int n, String o, int p) {
        
        readd(x,m,l,n);
        cname = o;
        cno = p;
    }
    
    public void displayc() {
        displayd();
        System.out.println("Course name: "+cname);
        System.out.println("Course no: "+cno);
     }
}



public class MultilevelInheritance {



   public static void main(String[] args) {



       course c = new course();
        c.readc("Akhil",23,"Btech",22,"TechLead",100);
        c.displayc();
    }

}