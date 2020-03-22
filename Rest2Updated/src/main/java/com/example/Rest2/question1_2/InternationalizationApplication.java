package com.example.Rest2.question1_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Locale;

//Add support for Internationalization in your application allowing messages to be shown in English, German and Swedish, keeping English as default.
//Create a GET request which takes "username" as param and shows a localized message "Hello Username". (Use parameters in message properties)
@EnableSwagger2
@SpringBootApplication
public class InternationalizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternationalizationApplication.class, args);
	}
    @Bean
	public LocaleResolver localResolver()
	{
		SessionLocaleResolver localeResolver= new SessionLocaleResolver();//We can customize our locale with SessionLocaleResolver
		localeResolver.setDefaultLocale(Locale.US);//Setting the default launguage as the launguage of US i.e. English
		return localeResolver;
	}
	@Bean
	public ResourceBundleMessageSource messageSource()
	{
		ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();//It resolves messages from resource bundles from diff locales
		messageSource.setBasename("messages");//This will set the basename
		return messageSource;
	}
}
