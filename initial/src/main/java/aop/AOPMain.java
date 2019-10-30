package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@SpringBootApplication
public class AOPMain implements CommandLineRunner {
  @Autowired
  @Qualifier("aop.AOPController2")
  private IAOPController controller;

  public static void main(String[] args) {
    SpringApplication.run(AOPMain.class, args);

    // ConfigurableApplicationContext ctx = SpringApplication.run(AOPMain.class, args);
    // AOPController controller = ctx.getBean(AOPController.class);
    // controller.uploadFile(); // 呼び出ししているだけ
    // controller.downloadFile(); // 呼び出ししているだけ
  }

  @Override
  public void run(String... args) throws Exception {
    controller.uploadFile(); // 呼び出ししているだけ
    controller.downloadFile(); // 呼び出ししているだけ
  }
}
