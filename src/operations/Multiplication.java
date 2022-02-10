package operations;
import common.CalcData;

public class Multiplication implements Compute {

    private CalcData data;

    public Multiplication(CalcData data){
        this.data = data;
    }

    @Override
    public double compute() {

        return data.getOperand1() * data.getOperand2();
    }

}
