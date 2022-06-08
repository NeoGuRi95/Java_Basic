package java_basic_ch11;

import java.util.*;

public class Exercise11_12 {
    public static void main(String args[]) throws Exception {
        int totalGameCnt = 10000;
        int cnt = 0;
        TreeMap gameResult = new TreeMap();

        while (cnt < totalGameCnt){
            SutdaDeck deck = new SutdaDeck();
            deck.shuffle();
            Player p1 = new Player("타짜", deck.pick(), deck.pick());
            Player p2 = new Player("고수", deck.pick(), deck.pick());
            System.out.println(p1+" "+deck.getPoint(p1));
            System.out.println(p2+" "+deck.getPoint(p2));

            if (gameResult.containsKey(deck.getPoint(p1))) {
                int value = (Integer) gameResult.get(deck.getPoint(p1));
                gameResult.put(deck.getPoint(p1), value + 1);
            } else
                gameResult.put(deck.getPoint(p1), 1);

            cnt += 1;
        }
        System.out.println(gameResult);

        SutdaDeck deck = new SutdaDeck();
        deck.shuffle();
        Player p1 = new Player("타짜", deck.pick(), deck.pick());
        Player p2 = new Player("고수", deck.pick(), deck.pick());
        System.out.println(p1+" "+deck.getPoint(p1));
        System.out.println(p2+" "+deck.getPoint(p2));

        int[] caseCntList = caseCnt(gameResult, p1.point);

        System.out.format("타짜 win property: %.2f%%\n", ((double)caseCntList[0]/(double)totalGameCnt)*100);
        System.out.format("타짜 lose property: %.2f%%\n", ((double)caseCntList[1]/(double)totalGameCnt)*100);
    }

    public static int[] caseCnt(TreeMap map, int point) {
        int lowerCnt = 0;
        int upperCnt = 0;

        Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            if (entry.getKey().compareTo(point) == -1) {
                lowerCnt += entry.getValue();
            }
            else if (entry.getKey().compareTo(point) == 1) {
                upperCnt += entry.getValue();
            }
        }

        int[] list = {lowerCnt, upperCnt};
        return list;
    }
}
class SutdaDeck
{
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];
    int pos = 0; // 다음에 가져올 카드의 위치
    HashMap jokbo = new HashMap(); // HashMap 족보를 저장할

    SutdaDeck() {
        for(int i=0;i < cards.length;i++) {
            int num = i%10+1;
            boolean isKwang = (i < 10) && (num==1 || num==3 || num==8);
            cards[i] = new SutdaCard2(num,isKwang);
        }
        registerJokbo(); // . 족보를 등록한다
    }
    void registerJokbo() {
/*
(1) . 아래의 로직에 맞게 코드를 작성하시오
1. jokbo(HashMap) . 에 족보를 저장한다
두 카드의 값을 문자열로 붙여서 로 점수를 로 저장한다 key , value .
*/
        jokbo.put("KK", 4000);
        jokbo.put("1010",3100);
        jokbo.put("99", 3090);
        jokbo.put("88", 3080);
        jokbo.put("77", 3070);
        jokbo.put("66", 3060);
        jokbo.put("55", 3050);
        jokbo.put("44", 3040);
        jokbo.put("33", 3030);
        jokbo.put("22", 3020);
        jokbo.put("11", 3010);
        jokbo.put("12", 2060);
        jokbo.put("21", 2060);
        jokbo.put("14", 2050);
        jokbo.put("41", 2050);
        jokbo.put("19", 2040);
        jokbo.put("91", 2040);
        jokbo.put("110", 2030);
        jokbo.put("101", 2030);
        jokbo.put("104", 2020);
        jokbo.put("410", 2020);
        jokbo.put("46", 2010);
        jokbo.put("64", 2010);
    }
    int getPoint(Player p) {
        if(p==null) return 0;
        SutdaCard2 c1 = p.c1;
        SutdaCard2 c2 = p.c2;
        Integer result = 0;
/*
(2) . 아래의 로직에 맞게 코드를 작성하시오
1. , jokbo "KK" . 카드 두 장이 모두 광이면 에서 키를 로 해서 점수를 조회한다
2. (num) jokbo . 두 카드의 숫자 로 에서 등급을 조회한다
3. , . 해당하는 등급이 없으면 아래의 공식으로 점수를 계산한다
(c1.num + c2.num) % 10 + 1000
4. Player (point) . 의 점수 에 계산한 값을 저장한다
*/
        if (c1.isKwang && c2.isKwang)
            result += (int)jokbo.get("KK");
        else if (jokbo.containsKey(c1.num + "" + c2.num))
            result += (int)jokbo.get(c1.num + "" + c2.num);
        else
            result += (c1.num + c2.num) % 10 + 1000;

        p.point = result;

        return result.intValue();
    }
    SutdaCard2 pick() throws Exception {
        SutdaCard2 c = null;
        if(0 <= pos && pos < CARD_NUM) {
            c = cards[pos];
            cards[pos++] = null;
        } else {
            throw new Exception("남아있는 카드가 없습니다.");
        }
        return c;
    }
    void shuffle() {
        for(int x=0; x < CARD_NUM * 2; x++) {
            int i = (int)(Math.random() * CARD_NUM);
            int j = (int)(Math.random() * CARD_NUM);
            SutdaCard2 tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }
} // SutdaDeck

class Player {
    String name;
    SutdaCard2 c1;
    SutdaCard2 c2;
    int point; // - 카드의 등급에 따른 점수 새로 추가

    Player(String name, SutdaCard2 c1, SutdaCard2 c2) {
        this.name = name ;
        this.c1 = c1 ;
        this.c2 = c2 ;
    }
    public String toString() {
        return c1.toString() +","+ c2.toString();
    }
} // class Player

class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2() {
        this(1, true);
    }
    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}
