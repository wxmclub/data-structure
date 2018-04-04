/*
MIT License

Copyright (c) 2018 wxmclub@gmail.com

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package com.wxmclub.demo.datastructure.sort;

import java.util.Arrays;

/**
 * 交换排序 - 冒泡排序
 * <p>
 * 因为越大的元素会经由交换慢慢"浮"到数列的顶端(最后位置)，最大的数最后才确定下来，所以称为冒泡排序<br>
 * 时间复杂度：最好情形O(n)，平均情形O(n^2)，最差情形O(n^2)<br>
 * 空间复杂度：O(1)<br>
 * 稳 定 性：稳定<br>
 * 内部排序(在排序过程中数据元素完全在内存)
 *
 * @author wxmclub@gmail.com
 * @version 1.0
 * @date 2018-04-03
 */
public class BubbleSort {

    /**
     * 朴素冒泡排序(共进行n-1次比较)
     */
    public static int[] bubbleSort(int[] target) {
        // 最多需要进行n-1躺，每一趟将比较小的元素移到前面，比较大的元素自然就逐渐沉到最后面了，这就是冒泡
        for (int i = 0, n = target.length; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (target[j] < target[j - 1]) {
                    int temp = target[j];
                    target[j] = target[j - 1];
                    target[j - 1] = temp;
                }
            }
            System.out.println(Arrays.toString(target));
        }
        return target;
    }

    /**
     * 优化冒泡排序
     */
    public static int[] optimizeBubbleSort(int[] target) {
        // 最多需要进行n-1躺，每一趟将比较小的元素移到前面，比较大的元素自然就逐渐沉到最后面了，这就是冒泡
        for (int i = 0, n = target.length; i < n - 1; i++) {
            boolean exchange = false;
            for (int j = n - 1; j > i; j--) {
                if (target[j] < target[j - 1]) {
                    int temp = target[j];
                    target[j] = target[j - 1];
                    target[j - 1] = temp;
                    exchange = true;
                }
            }
            System.out.println(Arrays.toString(target));
            if (!exchange) {
                // 若 i 到 n-1 这部分元素已经有序，则直接返回
                System.out.println("break from " + i);
                return target;
            }
        }
        return target;
    }
}
