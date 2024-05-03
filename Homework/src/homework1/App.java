package homework1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        /* 적합한 컬렉션 타입의 변수 선언 : List */
        ArrayList<Integer> countList = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int num1 = 0;
        int num2 = 0;
        int number;
        String operation;
        String exitValue;
        String removeValue;
        // String findResult; // 개인 과제 해설영상대로 Objects로 받아서 필요없어진 변수

        /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
        // int[] resultArray = new int[10];
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

            if (operation.equals("/") && (num2 == 0)) {
                System.out.println("0으로 나눌 수 없습니다.");
            }

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

//            if (count > 9){
//
//                // 배열이 다 찼으면 저장된 값을 앞으로 한칸씩 당기기
//                for (int j=0; j<8; j++) {
//                    resultArray[j] = resultArray[j+1];
//                }
//                // 배열 마지막 자리에 결과값을 저장한다
//                resultArray[count -1] = result;
//
//            } else {
//
//                // 배열이 다 안찼으면 빈 배열에 저장 후, 배열 Index ++
//                resultArray[count] = result;
//                count++;
//            }
//            // TEST
//            for (int k=0; k<10; k++) {
//                System.out.println(resultArray[k] + " count: " + count);
//            }

            /* 배열에서 컬렉션으로 변경됨으로써 변경해야하는 부분 구현 */
            // List에 결과값 저장
            countList.add(result);

            /* 위 요구사항에 맞게 구현 */

            //저장된 결과값 출력
            System.out.print(" 저장된 결과값 : ");
            for (int i = 0; i < countList.size(); i++) {
                System.out.print(countList.get(i) + " / ");
            }

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            removeValue = sc.next();
            if (removeValue.equals("remove")){

                // 삭제 후 저잘된 결과값 재출력
                countList.remove(0);

                System.out.print(" 저장된 결과값 : ");
                for (int i = 0; i < countList.size(); i++) {
                    System.out.print(countList.get(i) + " / ");
                }

            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            /* 향상된 for문을 활용하여 List 조회 */
//            findResult = sc.next();
//            if (findResult.equals("inquiry")){
            if (Objects.equals(sc.next(),("inquiry"))){
                number = 0;
                System.out.println("↓↓↓↓↓저장된 결과값↓↓↓↓↓");
                for (int i : countList) {
                    number++;
                    System.out.println(number + " : " + i);
                }
                System.out.println("↑↑↑↑↑저장된 결과값↑↑↑↑↑");
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            exitValue = sc.next();

        } while (!exitValue.equals("exit"));

        /* exit을 입력 받으면 반복 종료 */
    }
}