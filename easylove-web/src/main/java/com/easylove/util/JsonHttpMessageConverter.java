package com.easylove.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.converter.HttpMessageNotWritableException;

import java.io.IOException;
import java.io.OutputStream;

/**
 * 2017/2/10 13:44.
 * <p>
 * Email: cheerUpPing@163.com
 * springMvc 消息转换 格式
 */
public class JsonHttpMessageConverter extends FastJsonHttpMessageConverter {

    public static SerializeConfig mapping = new SerializeConfig();


    @Override
    protected void writeInternal(Object obj, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        OutputStream out = outputMessage.getBody();
        String text = JSON.toJSONString(obj, mapping, super.getFeatures());
        byte[] bytes = text.getBytes(getCharset());
        out.write(bytes);
    }


}
