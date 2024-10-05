import java.util.Scanner;

public class Main {

    private static String calculateResult(Integer telugu, Integer hindi,
                                          Integer english, Integer maths, Integer science,
                                          Integer social) {

        Integer totalMarks=telugu+hindi+english+maths+science+social;
        Integer marksPercantage=totalMarks*100/600;

        if(marksPercantage >80){
            return "DSTICNCTION";
        }else if(marksPercantage >60 && marksPercantage <80){
            return  "FIRST CLASS";

        }else if(marksPercantage > 40 && marksPercantage <60){
            return "second class";
        }else{
            return "Fail";
        }


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student RollNumber :");
        Integer rollNumber= sc.nextInt();

        System.out.println("Enter Student Name :");
        String name=sc.next();

       System.out.println("Enter Telugu subject marks :");
        Integer telugu= sc.nextInt();

        System.out.println("Enter Hindi subject marks :");
        Integer hindi= sc.nextInt();

        System.out.println("Enter English subject marks :");
        Integer english= sc.nextInt();

        System.out.println("Enter Maths subject marks :");
        Integer maths= sc.nextInt();

        System.out.println("Enter Science subject marks :");
        Integer science= sc.nextInt();

        System.out.println("Enter Social subject marks :");
        Integer social= sc.nextInt();

        Student student = new Student(rollNumber,name,telugu,hindi,english,maths,science,social);

        String result = calculateResult(telugu,hindi,english,maths,science,social);

        System.out.println("RollNumber-"+rollNumber +"Name-"+name+"-" +
                "result-"+result);


    }


}