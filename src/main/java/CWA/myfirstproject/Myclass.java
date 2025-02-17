package CWA.myfirstproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myclass {

   @GetMapping("api")
   public String sayhello(){
        return "hello";
    }
}
