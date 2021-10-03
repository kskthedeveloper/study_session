import edu.princeton.cs.algs4.StdIn;

import java.util.Stack;

// ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )
public class DijkstraTwoStackAlgorithm {
    public static void main(String[] args) {
        Stack<String> operators = new Stack<String>();
        Stack<Double> values = new Stack<Double>();

        System.out.println(StdIn.isEmpty());

        // TODO: to check the loop is not existing
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();

            if (s.equals("(")) {
            } else if (s.equals("+")) {
                operators.push(s);
            } else if (s.equals("-")) {
                operators.push(s);
            } else if (s.equals("*")) {
                operators.push(s);
            } else if (s.equals("/")) {
                operators.push(s);
            } else if (s.equals("sqrt")) {
                operators.push(s);
            } else if (s.equals(")")) {
                String operator = operators.pop();
                double value = values.pop();

                if (operator.equals("+")) {
                    value = values.pop() + value;
                }
                else if (operator.equals("-")) {
                    value = values.pop() - value;
                }
                else if (operator.equals("*")) {
                    value = values.pop() * value;
                }
                else if (operator.equals("/")) {
                    value = values.pop() / value;
                }
                else if (operator.equals("sqrt")) {
                    value = Math.sqrt(value);
                }

                System.out.println(value);
                values.push(value);
            } else {
                values.push(Double.parseDouble(s));
            }
        }
    }
}
