package lamdaevolv;

interface Operation {
    int increment(int num, int num2);
}

// class OperationImplts implements Operation {
// @Override
// public int increment(int num, int num2) {
// return ++num;
// }
// }

public class lamda_day1 {
    public static void main(String[] args) {
        // actual follows
//         Operation operation = new OperationImplts();
//         System.out.println(operation.increment(5, 3));

        // some enhancement pls comment only class of OperationImplts
        // sol1
        Operation operation = new Operation() {
            @Override
            public int increment(int num, int num2) {
                return ++num;
            }
        };
        int result = operation.increment(5, 6);
        System.out.println("result  " + result);

        // sol2
//        Operation operation2 = (int num, int num2) -> {
//            return ++num;
//        };
//
//        int result2 = operation2.increment(5, 6);
//        System.out.println("result2  " + result2);

        // ultra_enhanced
//        Operation operation3 = (num, num2) -> ++num;
//        int result3 = operation3.increment(5, 6);
//        System.out.println("result3  " + result3);


    }
}