package cn.itcast.xml.anno;

import javax.annotation.Resource;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class BookService {
	//得到bookdao和ordersdao的对象
	@Resource(name="bookDao")
	private BookDao bookDao;
	
	@Resource(name="ordersDao")
	private OrdersDao ordersDao;
	public void add() {
		System.out.println("service...");
		bookDao.buy();
		ordersDao.buy();
	}
}
