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
package com.wxmclub.demo.datastructure.test;

import com.wxmclub.demo.datastructure.sort.BubbleSort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author wxmclub@gmail.com
 * @version 1.0
 * @date 2018-04-04
 */
public class SortTest {

    protected static final int DEFAULT_LENGTH = 100;

    private static Random random = new Random();

    protected static int[] randomArray() {
        return randomArray(DEFAULT_LENGTH);
    }

    protected static int[] randomArray(int length) {
        return randomArray(length, length * 100);
    }

    protected static int[] randomArray(int length, int max) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(max) + 1;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = randomArray(10, 100);

        // 朴素冒泡排序
        bubbleSort(array);

        // 优化冒泡排序
        optimizeBubbleSort(array);
    }

    /**
     * 朴素冒泡排序
     */
    private static void bubbleSort(int[] array) {
        // 朴素冒泡排序
        int[] data = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(data));

        System.out.println("-------------------- 朴素冒泡排序 --------------------");
        long t1 = System.nanoTime();
        BubbleSort.bubbleSort(data);
        long t2 = System.nanoTime();
        System.out.println("-------------------- 朴素冒泡排序-" + (t2 - t1) + " --------------------");
    }

    /**
     * 优化冒泡排序
     */
    private static void optimizeBubbleSort(int[] array) {
        int[] data = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(data));
        System.out.println("-------------------- 优化冒泡排序 --------------------");
        long t1 = System.nanoTime();
        BubbleSort.optimizeBubbleSort(data);
        long t2 = System.nanoTime();
        System.out.println("-------------------- 优化冒泡排序-" + (t2 - t1) + " --------------------");
    }

}
