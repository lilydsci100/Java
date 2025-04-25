package com.itheima.exercise.file;

public class RecursionTest3 {
    public static int totalNumber;
    public static int lastBottleNumber;
    public static int lastCoverNumber;
    public static void main(String[] args) {
        //啤酒瓶一瓶子2块，4个瓶盖换一瓶， 2个空瓶换一瓶，现有10元 能喝多少瓶？
        buy(10);
        System.out.println(totalNumber);
        System.out.println(lastBottleNumber);
        System.out.println(lastCoverNumber);
    }
    public static void buy(int buyMoney) {
        int buyNumber = buyMoney / 2;
        totalNumber += buyNumber;

        //这一局的瓶盖和空瓶数
        int bottleNumber = buyNumber + lastBottleNumber;
        int coverNumber = buyNumber + lastCoverNumber;
        //换的瓶子折换成钱进入recursion
        int moneyLeft = 0;

        if (bottleNumber >= 2) {
            moneyLeft += (bottleNumber / 2) * 2;

        }
        lastBottleNumber = bottleNumber % 2;


        if (coverNumber >= 4) {
            moneyLeft += (coverNumber / 4) * 2;

        }
        //必须放在外边，若coverNumber <4, 应该直接进lastCoverNumber. 若判断，则这一局的coverNumber就进不去lastCoverNumber
        lastCoverNumber = coverNumber % 4;


        if (moneyLeft >= 2) {
            buy(moneyLeft);
        }
    }

//    public static void buy(int money) {
//        int buyNumber = money / 2;
//        totalNumber += buyNumber;
//
//        int allBottoleNumber = buyNumber + lastBottleNumber;
//        int allCoverNumber = buyNumber + lastCoverNumber;
//
//        int allMoney = 0;
//
//        if (allBottoleNumber >= 2) {
//            allMoney += (allBottoleNumber / 2) * 2;
//        }
//        lastBottleNumber = allBottoleNumber % 2;
//
//        if (allCoverNumber >= 4) {
//            allMoney += (allCoverNumber / 4) * 2;
//        }
//        lastCoverNumber = allCoverNumber % 4;
//
//        if (allMoney >= 2) {
//            buy(allMoney);
//        }
//    }
}