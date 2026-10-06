class Solution {
    public boolean parseBoolExpr(String expression) {

        Stack<Character> brackets = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (char ch : expression.toCharArray()) {

            if (ch == '(') {
                brackets.push(ch);
            }

            else if (ch == '&' || ch == '|' || ch == '!') {
                ops.push(ch);
            }

            else if (ch == 't' || ch == 'f') {
                brackets.push(ch);
            }

            else if (ch == ')') {

                boolean hasTrue = false;
                boolean hasFalse = false;

                // Process operands inside current bracket
                while (!brackets.isEmpty() && brackets.peek() != '(') {
                    char val = brackets.pop();

                    if (val == 't')
                        hasTrue = true;
                    else
                        hasFalse = true;
                }

                // Remove '('
                brackets.pop();

                // Get corresponding operator
                char op = ops.pop();

                char result;

                if (op == '!') {
                    result = hasTrue ? 'f' : 't';
                }
                else if (op == '&') {
                    result = hasFalse ? 'f' : 't';
                }
                else {
                    result = hasTrue ? 't' : 'f';
                }

                // Store result
                brackets.push(result);
            }
        }

        return brackets.peek() == 't';
    }
}