package com.ashu.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@RestController
public class MainController {

    @RequestMapping("/magicnumber")
    public String showMagicNumber(HttpServletRequest param){

        String number = param.getParameter("number");
        if(number==null) {
            return "Please enter a number greater than 0";
        }
        int startingNumber= Integer.parseInt(number);
        String results = "Starting Number:  "+startingNumber+"<br />";
        StringBuilder sb = new StringBuilder(results);
        while (startingNumber>0) {
            if (startingNumber % 2 == 0) {

                startingNumber = startingNumber / 2;
                sb.append(startingNumber+"<br />");
                if(startingNumber==1) break;
            } else if (startingNumber % 2 == 1) {
                startingNumber = (startingNumber * 3) + 1;
                sb.append(startingNumber+"<br />");
                if(startingNumber==1) break;
            }

        }

  return sb.toString();
    }


}
