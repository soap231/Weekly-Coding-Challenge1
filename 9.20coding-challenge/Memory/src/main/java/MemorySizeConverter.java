import java.text.DecimalFormat;

public class MemorySizeConverter {
    public static void returnActualMemorySize(String input){
        // input format must be number followed by GB or MB
        double number = Double.parseDouble(input.substring(0, input.length()-2));
        String unit = input.substring(input.length()-2).toUpperCase();
        String actualUnit = "MB";
        double actual = number * (1-0.07);
        if(unit.equals("GB")){
            actual = actual * 1024;
        }
        String StringActual = String.format("%.0f", actual);
        DecimalFormat df2 = new DecimalFormat("#.##");
        if(actual >= 1024){
            actual = actual/1024;
            StringActual = df2.format(actual);
            actualUnit = "GB";
        }
        System.out.println("actualMemorySize(" + input + ") --> " + StringActual + actualUnit);
    }
    public static void main(String[] args) {
        //Demo
        returnActualMemorySize("32GB");
        returnActualMemorySize("2GB");
        returnActualMemorySize("512MB");
        System.out.println();
        returnActualMemorySize("1GB");
        returnActualMemorySize("100MB");
    }
}
