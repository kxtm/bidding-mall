package cn.sx.ebj.bidding.mall.core.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * {@code @author} chunjie
 * {@code @time} 2023/10/5
 * {@code @description}
 */
public class JsonUtil {
    static final Logger logger = LoggerFactory.getLogger(JsonUtil.class);
    static ObjectMapper objectMapper = new ObjectMapper();

    //以静态代码块初始化
    static {
        //对象的所有字段全部列入序列化
        objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
        //取消默认转换timestamps形式
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        //忽略空Bean转json的错误
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        //所有的日期格式都统一为以下的格式，即yyyy-MM-dd HH:mm:ss
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        //忽略 在json字符串中存在，但在java对象中不存在对应属性的情况。防止错误
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static String objectToJson(Object data) {
        try {
            return objectMapper.writeValueAsString(data);
        } catch (Exception e) {
            logger.error("转换JSON异常", e);
        }
        return null;
    }

    /**
     * * 将json结果集转化为对象
     * *
     * * @param jsonData json数据
     * * @param beanType 对象中的object类型
     * * @return
     */
    public static <T> T jsonToObject(String jsonData, Class<T> beanType) {
        try {
            return objectMapper.readValue(jsonData, beanType);
        } catch (Exception e) {
            logger.error("转换对象异常", e);
        }
        return null;
    }

    /**
     * Json转换对象
     *
     * @param jsonData
     * @param beanType
     * @param <T>
     * @return
     */
    public static <T> T jsonToObject(String jsonData, TypeReference<T> beanType) {
        try {
            return objectMapper.readValue(jsonData, beanType);
        } catch (Exception e) {
            logger.error("转换对象异常", e);
        }
        return null;
    }

    /**
     * * 将json数据转换成pojo对象list
     * * <p>Title: jsonToList</p>
     * * <p>Description: </p>
     * *
     * * @param jsonData
     * * @param beanType
     * * @return
     */
    public static <T> List<T> jsonToList(String jsonData, Class<T> beanType) {
        try {
            JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, beanType);
            return objectMapper.readValue(jsonData, javaType);
        } catch (Exception e) {
            logger.error("转换集合异常", e);
        }
        return null;
    }

}
