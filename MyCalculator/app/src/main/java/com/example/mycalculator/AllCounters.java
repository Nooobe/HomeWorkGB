package com.example.mycalculator;

import java.io.Serializable;

public class AllCounters implements Serializable {
    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private int num5;
    private int num6;
    private int num7;
    private int num8;
    private int num9;
    private int num0;

    private int a ;
    private int b ;
    private int result;

    private char plus;
    private char min;
    private char split;
    private char multip;
    private char dot;

    public AllCounters(){

        a = 0;
        b = 0;
        result = 0;

        num0 = 0;
        num1 = 1;
        num2 = 2;
        num3 = 3;
        num4 = 4;
        num5 = 5;
        num6 = 6;
        num7 = 7;
        num8 = 8;
        num9 = 9;


        plus = '+';
        split = '/';
        min = '-';
        multip = '*';
        dot = ',';
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public int getNum5() {
        return num5;
    }

    public void setNum5(int num5) {
        this.num5 = num5;
    }

    public int getNum6() {
        return num6;
    }

    public void setNum6(int num6) {
        this.num6 = num6;
    }

    public int getNum7() {
        return num7;
    }

    public void setNum7(int num7) {
        this.num7 = num7;
    }

    public int getNum8() {
        return num8;
    }

    public void setNum8(int num8) {
        this.num8 = num8;
    }

    public int getNum9() {
        return num9;
    }

    public void setNum9(int num9) {
        this.num9 = num9;
    }

    public int getNum0() {
        return num0;
    }

    public void setNum0(int num0) {
        this.num0 = num0;
    }

    public char getPlus() {
        return plus;
    }

    public void setPlus(char plus) {
        this.plus = plus;
    }

    public char getMin() {
        return min;
    }

    public void setMin(char min) {
        this.min = min;
    }

    public char getSplit() {
        return split;
    }

    public void setSplit(char split) {
        this.split = split;
    }

    public char getMultip() {
        return multip;
    }

    public void setMultip(char multip) {
        this.multip = multip;
    }

    public char getDot() {
        return dot;
    }

    public void setDot(char dot) {
        this.dot = dot;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public float do_plus (){
      return result = a + b;
    }

    public float do_minus (){
        return result = a-b;
    }
    public float do_split (){
        return result = a/b;
    }
    public float do_multiply (){
        return result = a * b;
    }
}
