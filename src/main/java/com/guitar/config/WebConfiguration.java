package com.guitar.config;

import org.h2.server.web.WebServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Creation of ps-guitar-rest.
 * <p/>
 * Created by tttrinh
 * Created date 3/14/17 5:26 PM
 * <p/>
 * $Revision:  $ $Date:  $
 * $Log: ,v $
 */

@Configuration
public class WebConfiguration {
  @Bean
  ServletRegistrationBean h2servletRegistration() {
    ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
    registrationBean.addUrlMappings("/console/*");
    return registrationBean;
  }
}
