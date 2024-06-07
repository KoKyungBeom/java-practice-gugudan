package com.codestates.seb.gugudan.V2;
import java.util.Scanner;

public class gugudan {
  // 입력받기 위한 스캐너 객체 생성
  private Scanner sc = new Scanner(System.in);
  // 구구단 최소,최대값 변수에 할당
  public static final int min_gugudan = 2;
  public static final int max_gugudan = 9;
  // 숫자를 입력받는 메서드
  public int inputNumber(){
    System.out.println("[안내]희망하는 구구단을 숫자로 입력해 주세요 (2 ~ 9)");
    return Integer.parseInt(sc.nextLine());
  }
  // 받은 숫자에 알맞는 구구단을 출력하는 메서드
  public void printGugudan(int num){
    System.out.printf("%d단 이 입력되었습니다.",num);
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
  // 유효한 숫자가 아닐때 오류 메세지를 출력하는 메서드
  public void printErrorMessage(int num){
    System.out.printf("%d 단 이 입력되었습니다.\n",num);
    System.out.println("[경고]구구단은 2단 ~ 9단 까지만 선택할 수 있습니다.\n" +
            "프로그램을 종료합니다.");
  }
  // 숫자를 받고 구구단을 출력하거나 오류 메세지를 출력하는 메서드
  public void gugudanPlay(int num) {
        if (min_gugudan <= num && num <= max_gugudan) {
          printGugudan(num);
        } else
          printErrorMessage(num);
  }
}
// 구구단을 출력한뒤 더 사용하거나 종료하거나 선택할 수 있도록 만들어 보아요


