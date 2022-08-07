package uz.megatech.tarrifs.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class TarrifAspect {


    private Logger logger(JoinPoint joinPoint) {
        return LoggerFactory.getLogger(joinPoint.getSignature().getDeclaringTypeName());
    }
    @Pointcut("within(@org.springframework.stereotype.Controller *)")
    public void controller() {}

    @Pointcut("execution(* *(..))")
    public void methodPointcut() {}

    @Pointcut("within(@org.springframework.web.bind.annotation.RequestMapping *)")
    public void requestMapping() {}

    @Before("controller() && methodPointcut() && requestMapping()")
    public void aroundControllerMethod(JoinPoint joinPoint) throws Throwable {
        Logger log = logger(joinPoint);
        log.info("Starting Processing Method: {}() with args: {}, time: {}",joinPoint.getStaticPart().getSignature(),joinPoint.getArgs().toString(), System.currentTimeMillis());
    }

    @After("controller() && methodPointcut() && requestMapping()")
    public void afterControllerMethod(JoinPoint joinPoint) {
        Logger log = logger(joinPoint);
        log.info("Finished: {}() with args: {}, time: {}",joinPoint.getStaticPart().getSignature(),joinPoint.getArgs().toString(), System.currentTimeMillis());
    }


}
