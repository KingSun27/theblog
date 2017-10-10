package com.korvin.common.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.korvin.TheBlogApplication;

public class UserRealm extends AuthorizingRealm{
	private static final Logger log = LoggerFactory.getLogger(TheBlogApplication.class);

	//权限验证
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		log.info("UserRealm 权限验证");
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		return authorizationInfo;
	}

	//登陆验证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		log.info("UserRealm 登陆验证");
		String principal = (String) authcToken.getPrincipal();
		if(!"admin".equals(principal) ) {
			 throw new UnknownAccountException();
		}

        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(authcToken.getPrincipal(),authcToken.getCredentials(),getName());

		return authenticationInfo;
	}

}
