package gpstudy.leetcode.interview;

import jvm.Main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Rui.Xu Email:rui.xu@gshopper.com
 * @since 2021/8/3 19:54
 * 在二维空间中有许多球形的气球。对于每个气球，提供的输入是水平方向上，气球直径的开始和结束坐标。由于它是水平的，所以纵坐标并不重要，因此只要知道开始和结束的横坐标就足够了。开始坐标总是小于结束坐标。
 * <p>
 * 一支弓箭可以沿着 x 轴从不同点完全垂直地射出。在坐标 x 处射出一支箭，若有一个气球的直径的开始和结束坐标为 xstart，xend， 且满足  xstart ≤ x ≤ xend，则该气球会被引爆。可以射出的弓箭的数量没有限制。 弓箭一旦被射出之后，可以无限地前进。我们想找到使得所有气球全部被引爆，所需的弓箭的最小数量。
 * <p>
 * 给你一个数组 points ，其中 points [i] = [xstart,xend] ，返回引爆所有气球所必须射出的最小弓箭数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-number-of-arrows-to-burst-balloons
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class T0452 {
    private static final int MAXIMUM_CAPACITY = 1 << 30;
    public int findMinArrowShots(int[][] points) {

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(1);
        //concurrentHashMap.put();
        if (points.length == 0) return 0;
        Arrays.sort(points, Comparator.comparingInt(p0 -> p0[0]));
        int end = points[0][1];
        int count = 1;

        for (int[] point : points) {
            if (point[0] >= end) {
                end = point[1];
                count++;
            }
        }
        return count;
    }

    public int findMinArrowShots1(int[][] points) {
        if (points.length == 0) return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] p1, int[] p2) {
                return p1[0] < p2[0] ? -1 : 1;
            }
        });
        int start = points[0][0], end = points[0][1];
        int count = 1;
        for (int i = 1; i < points.length; ++i) {
            if (points[i][0] <= end) {
                start = Math.max(points[i][0], start);
                end = Math.min(points[i][1], end);
            } else {
                count++;
                start = points[i][0];
                end = points[i][1];
            }
        }
        return count;
    }

    public static void main(String args[]) {
      /*  int[][] points = new int[][]{{3, 2, 3}, {3, 4, 3}};
        System.out.println(Arrays.stream(points).toArray());*/
        new HashMap<>(100);
        System.out.println(tableSizeFor(0));
    }

    private static final int tableSizeFor(int c) {
        int n = c - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
