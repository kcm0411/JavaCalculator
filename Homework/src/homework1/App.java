package homework1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int num1 = 0;
        int num2 = 0;
        String operation;
        String exitYn;

        /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
        int[] resultArray = new int[10];
        /* 연산의 결과가 저장된 배열의 마지막 index를 저장하는 변수를 선언 */
        int count = 0;

        /* 반복문 사용 해서 연산을 반복 */
        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            num1 = sc.nextInt();

            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            System.out.print("사칙연산 기호를 입력하세요: ");
            operation = sc.next();

            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            num2 = sc.nextInt();

            int result = 0;
            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            if (operation.equals("+")){
                result = num1 + num2;
            } else if (operation.equals("-")){
                result = num1 - num2;
            } else if (operation.equals("*")){
                result = num1 * num2;
            } else if (operation.equals("/")){
                result = num1 / num2;
            }

            System.out.println("결과: " + result);

            if (count > 8){

                System.out.println("10번 계산 완료하여 프로그램을 종료합니다.");

            } else {

                // 배열이 다 안찼으면 빈 배열에 저장 후, 배열 Index ++
                resultArray[count] = result;
                count++;
            }

//            // TEST
//            for (int k=0; k<10; k++) {
//                System.out.println(resultArray[k] + " count: " + count);
//            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            exitYn = sc.next();

        } while (!exitYn.equals("exit"));

        /* exit을 입력 받으면 반복 종료 */
    }
}