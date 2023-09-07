package com.demo.domin;

import java.util.Random;

public class Operation {
    private int numFirst;//第一个运算数
    private char opFirst;//第一个运算符
    private int numSecond;//第二个运算数
    private char opSecond;//第二个运算符
    private int numThird;//第三个运算数
    private int result;//表达式结果

    public int getNumFirst() {
        return numFirst;
    }

    public void setNumFirst(int numFirst) {
        this.numFirst = numFirst;
    }

    public char getOpFirst() {
        return opFirst;
    }

    public void setOpFirst(char opFirst) {
        this.opFirst = opFirst;
    }

    public int getNumSecond() {
        return numSecond;
    }

    public void setNumSecond(int numSecond) {
        this.numSecond = numSecond;
    }

    public char getOpSecond() {
        return opSecond;
    }

    public void setOpSecond(char opSecond) {
        this.opSecond = opSecond;
    }

    public int getNumThird() {
        return numThird;
    }

    public void setNumThird(int numThird) {
        this.numThird = numThird;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Operation that = (Operation) o;

        if (numFirst != that.numFirst) return false;
        if (opFirst != that.opFirst) return false;
        if (numSecond != that.numSecond) return false;
        if (opSecond != that.opSecond) return false;
        return numThird == that.numThird;
    }

    @Override
    public int hashCode() {
        int result = numFirst;
        result = 31 * result + (int) opFirst;
        result = 31 * result + numSecond;
        result = 31 * result + (int) opSecond;
        result = 31 * result + numThird;
        return result;
    }

    @Override
    public String toString() {
        return numFirst +
            "" + opFirst +
            "" + numSecond +
            "" + opSecond +
            "" + numThird +
            "="+
            "   ";
    }
    public void construct(){
        Random r = new Random();
        char[] op = {'+', '-', '*', '/'};
        int numFirst;
        char opFirst;
        int numSecond;
        char opSecond;
        int numThird;

        //生成表达式
        //生成第一个运算数：
        numFirst = r.nextInt(101);

        //生成第一个运算符
        opFirst = op[r.nextInt(op.length)];
        //生成第二个运算数
        numSecond = r.nextInt(101);

        //当第一个运算符为 ’/' 和第二个运算数为0时，重新生成第二个运算数(numFirst / 0)
        while(opFirst == '/' && numSecond==0){
            //重新生成第二个运算数
            numSecond = r.nextInt(101);
        }

        //生成第二个运算符
        opSecond = op[r.nextInt(op.length)];
        //生成第三个运算数
        numThird = r.nextInt(101);

        //当第二个运算符为 ’/' 和第三个运算数为0时，重新生成第二个运算数（numFirst op numSecond / 0)
        while(opSecond == '/' && numThird == 0){
            //重新生成第三个运算数
            numThird = r.nextInt(101);
        }
        this.setNumFirst(numFirst);
        this.setOpFirst(opFirst);
        this.setNumSecond(numSecond);
        this.setOpSecond(opSecond);
        this.setNumThird(numThird);
    }


}
