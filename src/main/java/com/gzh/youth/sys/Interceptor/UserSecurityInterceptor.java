package com.gzh.youth.sys.Interceptor;

import com.gzh.youth.exception.MyException;
import com.gzh.youth.model.Value;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2017/2/9.
 */
@Component
@Service
public class UserSecurityInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        String url =request.getRequestURI();
        if(url.contains("login")){
            return true;
        }
        Object obj = request.getSession().getAttribute("cur_user");
        if (obj == null ) {
            MyException myEx = new MyException(MyException.NEED_LOGIN,MyException.getMessage(MyException.NEED_LOGIN));
            Value v = new Value(myEx);
            // 设置编码格式
            response.setContentType("text/plain;charset=UTF-8");
            response.setCharacterEncoding("UTF-8");
            JSONObject jsonObject = JSONObject.fromObject(v);
            PrintWriter out = null;
            try {
                out = response.getWriter();
                out.write(jsonObject.toString());
                out.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false;
        }
       return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
