package com.myblog.blog.validate;/**
 * ClassName:validatorImpl
 * Package:com.sdp.kill.validatorResult
 * Description:Everything Is
 * Possible!
 *
 * @Date:2019/3/26 10:24
 * @Author:"15029155474@163.com"
 */


import com.myblog.blog.error.BusinessException;
import com.myblog.blog.error.EmBusinessError;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 ClassName:validatorImpl
 */

/**
 *
 * 1.首先，这个类是一个接口的实现类，我们需要通过使用他在view层完成对输入参数组装的校验
 * 2.InitializingBean的作用是当spring容器初始化完成后，回调afterPropertiesSet()方法
 *
 *
 */

@Component
public class validatorImpl implements InitializingBean {

    private Validator validator;

    @Override
    public void afterPropertiesSet() throws Exception {
        this.validator  = Validation.buildDefaultValidatorFactory().getValidator();
    }


    public validatorResult validate(Object bean) throws BusinessException {


        validatorResult result = new validatorResult();

        if(bean == null){
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
        }
        //返回值为校验过程中发生错误的字段，与改字段发生了何种错误的信息
        Set<ConstraintViolation<Object>> ErrorSets= validator.validate(bean);


        if(ErrorSets.size()>0){
            result.setHasError(true);
        }

        //使用lambda表达式遍历求出错误的参数和其错误信息
        Map<String,String> errorMap = new HashMap();

        ErrorSets.forEach(err->{
            String errMsg = err.getMessage();
            String propertyName = err.getPropertyPath().toString();
            errorMap.put(propertyName,errMsg);
        });

        result.setErrorMap(errorMap);

        return result;

    }
}
