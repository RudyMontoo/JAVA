class Solution {
    List<String> result = new ArrayList<>();

    public List<String> addOperators(String num, int target) {

        StringBuilder sb = new StringBuilder();

        func(0, 0, 0, sb, num, target);

        return result;
    }

    public void func(int idx, long prev, long sum,
                     StringBuilder sb, String num, int trg) {

        if (idx == num.length()) {
            if (sum == trg) {
                result.add(sb.toString());
            }
            return;
        }

        for (int i = idx; i < num.length(); i++) {

            // Don't allow numbers like 05, 01, 00
            if (num.charAt(idx) == '0' && i > idx) {
                break;
            }

            long value = Long.parseLong(num.substring(idx, i + 1));

            // First number
            if (idx == 0) {

                int oldLen = sb.length();

                sb.append(value);

                func(i + 1, value, value,
                     sb, num, trg);

                sb.delete(oldLen, sb.length());
            }

            // Other numbers
            else {

                int oldLen = sb.length();

                // +
                sb.append("+").append(value);

                func(i + 1, value,
                     sum + value,
                     sb, num, trg);

                sb.delete(oldLen, sb.length());


                // -
                sb.append("-").append(value);

                func(i + 1, -value,
                     sum - value,
                     sb, num, trg);

                sb.delete(oldLen, sb.length());


                // *
                sb.append("*").append(value);

                func(i + 1,
                     prev * value,
                     sum - prev + (prev * value),
                     sb, num, trg);

                sb.delete(oldLen, sb.length());
            }
        }
    }
}