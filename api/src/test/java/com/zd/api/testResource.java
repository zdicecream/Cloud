package com.zd.api;

public class testResource implements AutoCloseable{


    public void doot(){
        System.out.println("do");
    }

    @Override
    public void close() throws Exception {
        System.out.println("zhix");
    }

    public static void main(String[] args) {
        try(testResource myAutoClosable = new testResource()){
            myAutoClosable.doot();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
