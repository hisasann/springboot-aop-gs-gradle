package aop;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Component;

@Component("aop.AOPController")
@Controller
public class AOPController implements IAOPController {
  public void uploadFile() {
    System.out.println("uploadFile");
  }

  public void downloadFile() {
    System.out.println("downloadFile");
  }
}
