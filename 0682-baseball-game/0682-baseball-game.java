class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>stack=new Stack<>();
        for(String op:operations){
            if(op.equals("C")){
                stack.pop();
            }else if(op.equals("D")){
                int last=(stack.peek())*2;
                stack.push(last);
            }else if(op.equals("+")){
                int first=stack.pop();
                int sec=stack.peek();
                stack.push(first);
                stack.push(first+sec);
            }else{
                stack.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        for(int sc:stack){
            sum+=sc;
        }return sum;
    }
}