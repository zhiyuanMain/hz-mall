package com.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.platform.util.ApiUserUtils;
import com.qiniu.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class PlatformTest {

    @Autowired
    private RestTemplate restTemplate;

    public void test() {
        String code = "011mt8Ni0Q8vGr14WAMi03i6Ni0mt8N2";
        String requestUrl = ApiUserUtils.getWebAccess(code);//通过自定义工具类组合出小程序需要的登录凭证 code
        System.out.println("》》》组合token为：" + requestUrl);
        String res = restTemplate.getForObject(requestUrl, String.class);
        System.out.println("res=="+res);
        JSONObject sessionData = JSON.parseObject(res);
        String openid=sessionData.getString("openid");
        System.out.println("》》》promoterId：" + openid);
        String session_key=sessionData.getString("session_key");//不知道啥用。
        System.out.println("》》》session_key：" + session_key);
    }

    public static void main(String[] args) {
        PlatformTest platformTest = new PlatformTest();
        platformTest.test();;
    }
}
