package operations;
import common.CalcData;

public class Division implements Compute {

    private CalcData data;
    public Division(CalcData data){
        this.data = data;
    }
    @Override
    public double compute() {
        return data.getOperand1() / data.getOperator();
    }
}
