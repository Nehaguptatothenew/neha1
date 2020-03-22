package com.example.Rest2.question1_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

//Controller
@RestController
public class InternatializationController
{
    @Autowired
private MessageSource messageSource;
    @GetMapping(path = "/internationalized/{name}")
    public String internationalizationName(@RequestHeader(name = "Accept-Language",required = false) Locale locale, @PathVariable String name)
    {
     return String.format(messageSource.getMessage("good.morning.message",null,locale)+"%s",name);
    }
    @GetMapping(path = "/internationalized")
    public String internationalized(@RequestHeader(name = "Accept-Language",required = false) Locale locale)//Locale is a part of RequestHeader
    {                                                            //RequestHeader is used to tell that the message is coming from the
                                                                //header of that request
        return messageSource.getMessage("good.morning.message",null,locale);
    }
}
