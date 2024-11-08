import javax.swing.JOptionPane;

public class CiftlikciKeremAverageSnowFall{
    public static void main(String[] args) {
        
        // Take the value from user
        String november = JOptionPane.showInputDialog(" November Snowfall ?");      //November --> 2
        Double nr = Double.parseDouble(november);

        String december = JOptionPane.showInputDialog(" December Snowfall ?");      //December --> 4    
        Double dr = Double.parseDouble(december);

        String january = JOptionPane.showInputDialog(" January Snowfall ?");        //January -->  5
        Double jr = Double.parseDouble(january);

        String february = JOptionPane.showInputDialog(" February Snowfall ?");      //February --> 9
        Double fr = Double.parseDouble(february);

        String march = JOptionPane.showInputDialog(" March Snowfall ?");            //March --> 3
        Double mr = Double.parseDouble(march);

        //Do Math Operation
        JOptionPane.showMessageDialog(null, "The averege snowfall is " + (nr+dr+jr+fr+mr)/5);

    }
}