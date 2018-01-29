package cn.itcast.anno;

import org.springframework.stereotype.Component;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
@Component(value="userDao")
public class UserDao {
	public void add() {
		System.out.println("dao....");
	}
}
