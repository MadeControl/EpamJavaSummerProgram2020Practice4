package com.epam.rd.java.basic.practice4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class Part4Test {

    @Test
    public void part4Test(){

        final String expectedString =
                        "����� ������ ��������� ��������� ���� � ���������� ����������� �� �����.\r\n" +
                        "��� ������������ �������� ������������������, ������� ���������� � ������� ����� � ������������� ������.\r\n" +
                        "�������� ���� ����� ��������� �� �������.\r\n" +
                        "���������� ��������� ����� � ��������� �����������.\r\n";
        Iterator<String> iterator = new Part4().iterator();
        StringBuilder stringBuilder = new StringBuilder();

        while (iterator.hasNext()){
            stringBuilder.append(iterator.next()).append(System.lineSeparator());
        }

        Assert.assertEquals(expectedString, stringBuilder.toString());

    }

}