package com.greedy.section02.update;

import static com.greedy.common.JDBCTemplate.close;
import static com.greedy.common.JDBCTemplate.getConnection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class Application1 {
	
	public static void main(String[] args) {
		
		Connection con = getConnection();
		
		PreparedStatement pstmt = null;
		int result = 0;
		
		Properties prop = new Properties();
		
		// menu-query.xml에서 updateMenu
		try {
			prop.loadFromXML(new FileInputStream("mapper/menu-query.xml"));
			String query = prop.getProperty("updateMenu");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("변경할 메뉴 번호를 입력하세요 : ");
			int menuCode = sc.nextInt();
			System.out.print("변경할 메뉴의 이름을 입력하세요 : ");
			sc.nextLine();
			String menuName = sc.nextLine();
			System.out.print("변경할 메뉴의 가격을 입력하세요 : ");
			int menuPrice = sc.nextInt();
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, menuName);
			pstmt.setInt(2, menuPrice);
			pstmt.setInt(3, menuCode);
			
			result = pstmt.executeUpdate();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(con);
		}
		/* insert, update, delete의 쿼리를 수행하면 (SQL에서 출력은 : 1행이 수정되었습니다.)
		 * 성공하면 1이상의 값이 반환
		 * 실행했으나 적용이 안되면 0
		 * 실패하면 -1
		 */
		if(result > 0) {
			System.out.println("메뉴 수정 성공!!");
		} else {
			System.out.println("메뉴 수정 실패!!");
		}
	}

}
