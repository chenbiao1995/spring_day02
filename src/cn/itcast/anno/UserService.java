package cn.itcast.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * title:
 * Description:
 * @author: 
 * @date:2018年1月29日
 * @time:下午2:06:56
 */
@Service(value="userService")
public class UserService {
	
	//得到dao对象
	//1.定义dao类型属性
	//在dao属性上边使用注解完成属性注入
//	@Autowired
	
	
	//name属性值写的注解创建dao对象value值
	@Resource(name="userDao")
	private UserDao userDao;

	//使用注解不需要set方法
	public void add() {
		System.out.println("service...");
		userDao.add();
	}
}
