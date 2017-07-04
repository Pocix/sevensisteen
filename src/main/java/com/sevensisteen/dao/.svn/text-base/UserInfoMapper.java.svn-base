package com.sevensisteen.dao;

import org.apache.ibatis.annotations.Select;

import com.github.pagehelper.Page;
import com.sevensisteen.model.UserInfo;

public interface UserInfoMapper{
	
	/**
	 * 根据登录名称查询用户
	 * @param loginName
	 * @return
	 */
	@Select("<script> SELECT * from sys_user where 1=1 <when test = 'login_name!=null'> and instr(login_name,#{loginName}) > 0 </when> </script>")  
	public Page<UserInfo> getByLoginName(String loginName);
	
	@Select("<script> SELECT count(1) from sys_user where 1=1 <when test = 'login_name!=null'> and instr(login_name,#{loginName}) > 0 </when> </script>")
	public int getCount(String loginName);
	
	@Select("SELECT * from sys_user where 1=1 and login_name = #{loginName}")
	public UserInfo getUserByName(String loginName);

}
