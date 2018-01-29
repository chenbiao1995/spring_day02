package cn.itcast.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * title:
 * Description:
 * @author: 
 * @date:2018年1月29日
 * @time:上午11:16:52
 */
@Component(value="user")//<bean id="user" class="">
@Scope(value="prototype")
public class User {

	public void add() {
		System.out.println("add....");
	}
}
