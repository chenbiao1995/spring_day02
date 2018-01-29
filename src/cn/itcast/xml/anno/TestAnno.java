package cn.itcast.xml.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.anno.UserService;

public class TestAnno {
	@Test
	public void testService() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		BookService bookService = (BookService) context.getBean("bookService");
		bookService.add();
	}
}
