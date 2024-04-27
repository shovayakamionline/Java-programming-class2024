package practiceAssignment;

public class PracticeAssignment3 {
    public static void main(String[] args) {
        int x ;
        x = 15;
        x = 50;

        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x >10 && x< 20){
            System.out.println("Between 10 and 20");
        } else if (x >= 20) {
            System.out.println("Greater than or equal to 20");
        }else{
            System.out.println("Print something else.");
        }
    }
}
