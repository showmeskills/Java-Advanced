package Case;

import java.util.*;

public class PokerGame {
    public static void main(String ... args){
        game();
    }

    public static void game(){
        Map<Integer,String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        List<String> colors = List.of("♠️","♥️","♣️","♦️");
        List<String> numbers = List.of("2","A","3","4","5","6","7","8","9","10","J","Q","K","2","A","3","4","5","6","7","8","9","10","J","Q","K");
        int index = 0;
        poker.put(index,"big");
        pokerIndex.add(index);
        index++;
        poker.put(index,"small");
        pokerIndex.add(index);
        index++;
        poker.put(index,"big");
        pokerIndex.add(index);
        index++;
        poker.put(index,"small");
        pokerIndex.add(index);
        index++;

        for(String number : numbers){
            for(String color :colors){
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }
        }

        Collections.shuffle(pokerIndex);

        ArrayList<Integer> player01 = new ArrayList<Integer>();
        ArrayList<Integer> player02 = new ArrayList<Integer>();
        ArrayList<Integer> player03 = new ArrayList<Integer>();
        ArrayList<Integer> lastPokers = new ArrayList<Integer>();

        for(int i = 0; i < pokerIndex.size();i++) {
            int idx = pokerIndex.get(i);
            if (i >= 102) {
                lastPokers.add(idx);
            } else if (i % 3 == 0) {
                player01.add(idx);
            } else if (i % 3 == 1) {
                player02.add(idx);
            } else if (i % 3 == 2) {
                player03.add(idx);
            }
        }

        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(lastPokers);

        lookPoker("Terray",poker,player01);
        lookPoker("Erick",poker,player02);
        lookPoker("Loongor",poker,player03);
        lookPoker("底牌",poker,lastPokers);
    }
    public static void lookPoker(String name,Map<Integer,String> poker,ArrayList<Integer> list){
        System.out.println(name+":");
        for(Integer key :list){
            String value = poker.get(key);
            System.out.print(value+ " ");
        }
        System.out.println();
    }
}
