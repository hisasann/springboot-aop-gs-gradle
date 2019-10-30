package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AOPComponent {
  @Before("execution(* aop.*Controller.*(..))")
  public void before(JoinPoint jp) { // メソッド名は何でもよい
    System.out.println(jp.getSignature().getDeclaringType().getSimpleName() + "クラスの" + jp.getSignature().getName() + "メソッドを開始します");
  }

  @After("execution(* aop.*Controller.*(..))")
  public void after(JoinPoint jp) { // メソッド名は何でもよい
    System.out.println(jp.getSignature().getDeclaringType().getSimpleName() + "クラスの" + jp.getSignature().getName() + "メソッドを終了します");
  }
}
