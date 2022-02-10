public class Subraction implements Compute{

    private CalcData data;

    public Subraction(CalcData data){
        this.data = data;
    }

    @Override
    public double compute() {

        return data.getOperand1() - data.getOperand2();
    }
}
