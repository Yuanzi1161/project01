package com.demo.mainApp;

import com.demo.domin.Operation;

import java.util.LinkedHashSet;

public class app {
    public static void main(String[] args) {
        LinkedHashSet<Operation> set = new LinkedHashSet<>();
        while(set.size() <  300){
            Operation operation = new Operation();
            operation.construct();
            set.add(operation);
        }
        int i=0;
        for (Operation op : set) {
            System.out.print(op);
            i++;
            if(i%9==0) System.out.println("\n");

        }
    }
}
