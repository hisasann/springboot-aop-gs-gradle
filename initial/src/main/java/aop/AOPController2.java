package aop;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Component;

@Component("aop.AOPController2")
@Controller
public class AOPController2 implements IAOPController {
  public void uploadFile() {
    System.out.println("uploadFile2");
  }

  public void downloadFile() {
    System.out.println("downloadFile2");
  }
}
