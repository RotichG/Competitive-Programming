class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> answer = new ArrayList<String>();

        for (int num = 1; num <= n; num++) {

            boolean divby3 = (num % 3 == 0);
            boolean divby5 = (num % 5 == 0);

            if (divby3 && divby5) {
                answer.add("FizzBuzz");
            } else if (divby3) {
                answer.add("Fizz");
            } else if (divby5) {
                answer.add("Buzz");
            } else {
                answer.add(Integer.toString(num));
            }
        }

        return answer;
    }
}