package com.gzh.youth.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

import com.gzh.youth.util.PropertyUtil;


/**
 * @ClassName: ApplicationStartUpErrorPropListener

 * @Description: SpringApplication监听，实现spring启动时默认进行的一些操作

 * @author: zhonghui.geng

 * @date: 2016年12月28日 上午9:19:13
 */
public class ApplicationStartUpErrorPropListener implements ApplicationListener<ApplicationStartedEvent> {

	@Override
	public void onApplicationEvent(ApplicationStartedEvent paramE) {
		PropertyUtil.loadAllProperties();
	    System.out.println("ApplicationStartUpErrorPrListener EXEC");
	}

}
