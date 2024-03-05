public class Solution {
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        double area = 0.0;
        switch(ch){
            case 1:
                 double r = a[0];
                 area = Math.PI*r*r;
                 break;
            case 2:
                double l = a[0];
                double b = a[1];
                area = l*b;
                break;
            default:
            System.out.println("Invalid Choice");
        }
        return area;
    }
}