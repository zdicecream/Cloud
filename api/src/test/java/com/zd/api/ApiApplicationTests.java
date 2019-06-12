package com.zd.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Test
	public void testByte(){
		byte bytes = 0b111;
		System.out.println(bytes);
	}
	@Test
	public void testSwitch(){
		String str = "a";
		switch (str){
			case "a":
				System.out.println("a");break;
			case "b":
				System.out.println("b");break;
		}
	}
	@Test
	public void testResource(){

		try (testResource r = new testResource();){


		}catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testCatch(){

		try (testResource r = new testResource();){


		}catch (NumberFormatException |FileNotFoundException e){
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testNumber(){

		int a = 1_0;
		System.out.println(a);
	}

	@Test
	public void testCollection() {
		List<String> list = new ArrayList<String>();
		List<Integer> intList = new ArrayList<>();
	}

	@Test
	public void testLambda() {
		List<String> strings = new ArrayList<>();
		strings.add("dfs");
		strings.add("dfs");
		strings.add("dfs");
		strings.add("dfs");
		strings.add("dfs");
		strings.add("dfs");
		strings.add("dfs");
		strings.add("dfs");
		strings.forEach((s1 -> System.out.println(s1)));
	}
	@Test
	public void testhanshujiekou(){
		List<Integer> strings = new ArrayList<>();
		strings.addAll(Arrays.asList(12,123,124,125,1,312,31,23));
		int aa = 0;
		this.filer(strings,( value)-> (Integer)value % 2 !=aa);
		strings.forEach((s -> System.out.println(s)));

	}


	public List<Integer> filer(List<Integer> strings,Predicate predicate){
		//strings.forEach((String s) ->predicate.test(s));
		Iterator iterator = strings.iterator();
		while (iterator.hasNext()){
			if(predicate.test(iterator.next())){
				iterator.remove();
			}
		}
		return strings;
	}

	@Test
	public void testFunctionyinyong(){
		List<Integer> strings = new ArrayList<>();
		strings.addAll(Arrays.asList(12,123,124,125,1,312,31,23));
		int aa = 0;
		this.filer(strings,( value)-> (Integer)value % 2 !=aa);
		//strings.forEach((s -> System.out.println(s)));
		strings.forEach(System.out::println);

	}
}
