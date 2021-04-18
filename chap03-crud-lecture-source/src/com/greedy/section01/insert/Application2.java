package com.greedy.section01.insert;

import static com.greedy.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Application2 {
	
	public static void main(String[] args) {
		/* 메뉴의 이름을 입력하세요. 메뉴의 가격을 입력하세요, 카테고리 코드를 입력하세요,
		 * 판매 여부를 결정해주세요(Y/N): 무조건 Y/N */
		
		Connection con = getConnection();
		PreparedStatement stmt = null;
		int result = 0;
		
		String menu = null;
		int price = 0;
		String category = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴의 이름을 입력하세요 :");
		menu = sc.nextLine();
		System.out.print("메뉴의 가격을 입력하세요 : ");
		price = sc.nextInt();
		System.out.print("판매 여부를 결정해주세요(Y/N");
		category = sc.nextLine();
		
		
		
		
	}

}
