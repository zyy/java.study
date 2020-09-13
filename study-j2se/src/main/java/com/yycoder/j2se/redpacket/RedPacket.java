package com.yycoder.j2se.redpacket;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: 红包算法
 *
 * @author: yangyangzhao
 * @date: 2020-09-13 上午11:30
 */
public class RedPacket {
    // 最小红包额度 1 分
    private static final int MINMONEY = 1;
    // 最大红包金额 200 元
    private static final int MAXMONEY = 200 * 200;
    // 每个红包最大额度是平均额度的倍数
    private static final double TIMES = 2.1;

    /**
     * @param money
     * @param count
     * @return
     * @Description: 拆分红包
     */
    public static List<Integer> splitRedPackets(int money, int count) {
        if (!isRight(money, count)) {
            return null;
        }
        List<Integer> list = new ArrayList<Integer>();
        //红包最大金额为平均金额的TIMES倍
        int max = (int) (money * TIMES / count);
        max = max > MAXMONEY ? MAXMONEY : max;
        for (int i = 0; i < count; i++) {
            int one = random(money, MINMONEY, max, count - i);
            list.add(one);
            money -= one;
        }
        return list;
    }

    /**
     * @param money
     * @param minS
     * @param maxS
     * @param count
     * @Description: 随机红包额度
     */
    private static int random(int money, int minS, int maxS, int count) {
        //红包数量为1，直接返回金额
        if (count == 1) {
            return money;
        }
        //如果最大金额和最小金额相等，直接返回金额
        if (minS == maxS) {
            return minS;
        }
        int max = maxS > money ? money : maxS;
        //分配红包正确情况，允许红包的最大值
        int maxY = money - (count - 1) * minS;
        //分配红包正确情况，允许红包的最小值
        int minY = money - (count - 1) * maxS;
        //随机产生红包的最小值
        int min = minY > minS ? minY : minS;
        //随机产生红包最大值
        max = maxY < max ? maxY : max;
        //随机产生一个红包
        return (int) Math.rint(Math.random() * (max - min) + min);
    }

    /**
     * @param money
     * @param count
     * @return
     * @Description: 此种红包是否合法
     */
    private static boolean isRight(int money, int count) {
        double avg = money / count;
        if (avg < MINMONEY) {
            return false;
        }
        if (avg > MAXMONEY) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (Integer integer : RedPacket.splitRedPackets(2000, 20)) {
            System.out.println(integer);
            sum += integer;
        }
        System.out.println(sum);
    }

}
