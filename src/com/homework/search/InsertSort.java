package com.homework.search;

import java.util.Arrays;

public class InsertSort {
	public static void insertSort(int[] arg) {
        int i, j, insertNote;// Ҫ���������
        for (i = 1; i < arg.length; i++) {// ������ĵڶ���Ԫ�ؿ�ʼѭ���������е�Ԫ�ز���
            insertNote = arg[i];// ���������еĵ�2��Ԫ��Ϊ��һ��ѭ��Ҫ���������
            j = i - 1;
            while (j >= 0 && insertNote < arg[j]) {
            	arg[j + 1] = arg[j];// ���Ҫ�����Ԫ��С�ڵ�j��Ԫ��,�ͽ���j��Ԫ������ƶ�
                j--;
            }
            arg[j + 1] = insertNote;// ֱ��Ҫ�����Ԫ�ز�С�ڵ�j��Ԫ��,��insertNote���뵽������
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 38,65,97,76,13,27,49 };
        insertSort(a);
        System.out.println(Arrays.toString(a));

	}

}
