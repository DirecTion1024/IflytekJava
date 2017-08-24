package com.homework.search;

import java.util.Arrays;

public class InsertSort {
	public static void insertSort(int[] arg) {
        int i, j, insertNote;// 要插入的数据
        for (i = 1; i < arg.length; i++) {// 从数组的第二个元素开始循环将数组中的元素插入
            insertNote = arg[i];// 设置数组中的第2个元素为第一次循环要插入的数据
            j = i - 1;
            while (j >= 0 && insertNote < arg[j]) {
            	arg[j + 1] = arg[j];// 如果要插入的元素小于第j个元素,就将第j个元素向后移动
                j--;
            }
            arg[j + 1] = insertNote;// 直到要插入的元素不小于第j个元素,将insertNote插入到数组中
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 38,65,97,76,13,27,49 };
        insertSort(a);
        System.out.println(Arrays.toString(a));

	}

}
