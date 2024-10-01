package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UI {

    public static int receivePurchaseMoney() {
        System.out.println("구입금액을 입력해 주세요.");
        return Integer.parseInt(Console.readLine());
    }

    public static void printBoughtLottos(List<Lotto> lottos) {
        System.out.println("\n" + lottos.size() + "개를 구매했습니다.");
        for (Lotto lotto : lottos) {
            System.out.println(lotto);
        }
    }

    public static List<Integer> receiveAnswers() {
        System.out.println("\n당첨 번호를 입력해 주세요.");
        String[] split = Console.readLine().split(",");
        return Arrays.stream(split)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public static int receiveBonus() {
        System.out.println("\n보너스 번호를 입력해 주세요.");
        return Integer.parseInt(Console.readLine());
    }

    public static void printResult(List<Integer> result) {
        System.out.println("\n당첨 통계");
        System.out.println("---");

        for (int index = 4; index >= 0; index--) {
            System.out.println(" - " + result.get(index) + "개");
        }
    }

    public static void printRate(double rate) {
        System.out.println("총 수익률은 " + rate + "입니다.");
    }
}
