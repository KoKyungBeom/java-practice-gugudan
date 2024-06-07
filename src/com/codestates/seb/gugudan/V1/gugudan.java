package com.codestates.seb.gugudan.V1;
import java.util.Scanner;

public class gugudan {
  public static final int min_gugudan = 2;
  public static final int max_gugudan = 9;

  public static void main(String[] args) {
    //TODO:
    // 0. 구구단을 정의하기 전 구구단 연산을 위한 변수를 선언합니다.
    // 1. 단을 입력합니다.
    // 클래스에 포함된 메서드를 활용하기 위해 객체 생성
    gugudan test = new gugudan();
    // Scanner(클래스명) s(변수명) = new(객체 생성을 위한 키워드) Scanner(클래스명)(System.in);
    Scanner sc = new Scanner(System.in);
    // 사용자 입력을 받기 위한 안내 문구
    System.out.println("숫자를 입력해주세요");
    int inputNum;
    inputNum = Integer.parseInt(sc.nextLine());
    // 입력받은 값을 출력합니다.
    test.gugudanPlay(inputNum);
    // 2. 구구단은 2단에서 9단까지만 가능합니다.
    // 조건 1. 입력값이 min_gugudan(2)보다 작다.
    // 조건 2. 입력값이 max_gugudan(9)보다 크다.
    // 두 조건이 모두 참 인 경우를 판단하여 [경고] 문구 출력(OR 연산자 활용)
  }
  public void gugudanPlay(int num) {
    if(min_gugudan <= num && num <= max_gugudan){
      System.out.printf(num + "* 1 =  %d\n",num);
      System.out.printf(num + "* 2 =  %d\n",num*2);
      System.out.printf(num + "* 3 =  %d\n",num*3);
      System.out.printf(num + "* 4 =  %d\n",num*4);
      System.out.printf(num + "* 5 =  %d\n",num*5);
      System.out.printf(num + "* 6 =  %d\n",num*6);
      System.out.printf(num + "* 7 =  %d\n",num*7);
      System.out.printf(num + "* 8 =  %d\n",num*8);
      System.out.printf(num + "* 9 =  %d\n",num*9);
    }
    if(num < min_gugudan || num > max_gugudan){
      System.out.printf("%d 단 이 입력되었습니다.\n",num);
      System.out.println("[경고]구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.\n" +
              "프로그램을 종료합니다.");
    }
  }
}
//클래스를 나누어 보아요
