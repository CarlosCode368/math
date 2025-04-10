//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double degrees = 90.0;
        double answer= Math.sin(degrees);
        System.out.println(answer);

        double value=1234.567;
        long WholeNumber = Math.round(value); //round up if fraction is 0.5 or greater
        System.out.println(WholeNumber);
        System.out.println(Math.ceil(value)); //round up no matter what
        System.out.println(Math.floor(value)); // round down no matter what

        }
    }
