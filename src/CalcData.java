public class CalcData {

    private final Double operand1;
    private final Double operand2;
    private final char operator;

    public static class Builder {
        private final Double operand1;
        private final Double operand2;
        private final char operator;

        public Builder(Double operand1, char operator, Double operand2) {
            this.operand1 = operand1;
            this.operand2 = operand2;
            this.operator = operator;
        }

        public CalcData build() {
            return new CalcData(this);
        }

    }

    private CalcData(Builder builder) {
        operand1 = builder.operand1;
        operand2 = builder.operand2;
        operator = builder.operator;
    }

    public Double getOperand1(){
        return operand1;
    }

    public Double getOperand2(){
        return operand2;
    }
     public char getOperator(){
        return operator;
     }



}
