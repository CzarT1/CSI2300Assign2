import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        while (true){
        
        String userInput = JOptionPane.showInputDialog("Enter a number, then hit space bar, then unit: in, cm, lbs, kg");
        int spacePos = userInput.indexOf(" ");
        double number = Double.parseDouble(userInput.substring(0,userInput.indexOf(" ")));
        String unit = userInput.substring(spacePos+1,userInput.length()).trim();


        final double Centimeters = 2.54;
        final double Inches = .3937;
        final double Pounds = 2.20462;
        final double Kilograms = 0.453592;

        double num = 0;
        String u = null;

        if (unit.equalsIgnoreCase("cm")){
            num = number/Centimeters;
            u = "in";
        }else if(unit.equalsIgnoreCase("in")){
            num = number/Inches;
            u = "cm";
        }else if(unit.equalsIgnoreCase("lbs")){
            num = number/Pounds;
            u = "kg";
        }else if(unit.equalsIgnoreCase("kg")){
            num = number/Kilograms;
            u = "lbs";
        }

        JOptionPane.showMessageDialog(null, number + " " + unit + " = " + num + " " + u);
    }

    }
}
