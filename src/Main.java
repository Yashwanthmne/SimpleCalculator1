import java.util.Scanner;
import java.util.StringTokenizer;

import common.CalcData;
import operations.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine()," ");

        CalcData co = new CalcData.Builder(Double.parseDouble(st.nextToken()),
                                            st.nextToken().charAt(0),
                                            Double.parseDouble(st.nextToken())).build();

        try {
            switch (co.getOperator()) {
                case '+':
                    Compute addCommand = new Addition(co);
                    System.out.println(addCommand.compute());
                    break;
                case '-':
                    Compute subCommand = new Subraction(co);
                    System.out.println(subCommand.compute());
                    break;
                case '/':
                    Compute divCommand = new Division(co);
                    System.out.println(divCommand.compute());
                    break;
                case '*':
                    Compute mulCommand = new Multiplication(co);
                    System.out.println(mulCommand.compute());
                    break;
                case '^':
//                    return Math.pow(operand1, operand2);
                default:
                    throw new IllegalArgumentException("The operator is incorrect or unsupported.");
            }
        } catch (Exception e){
            throw new Exception("Illegal Expression");
        }


    }
}
