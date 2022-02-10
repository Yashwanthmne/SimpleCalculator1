package operations;

import common.CalcData;

public class Addition implements Compute {

    private CalcData data;

    public Addition(CalcData data){
        this.data = data;
    }

    @Override
    public double compute() {

        return data.getOperand1() + data.getOperand2();
    }
}
