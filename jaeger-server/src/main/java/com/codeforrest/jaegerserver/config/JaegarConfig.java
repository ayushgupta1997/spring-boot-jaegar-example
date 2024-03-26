package com.codeforrest.jaegerserver.config;

import io.jaegertracing.internal.JaegerTracer;
import io.jaegertracing.internal.samplers.ConstSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
//import io.jaegartracing.internal.JaegerTracer;
//import io.jaegertracing.internal.samplers.ConstSimpler;

@Configuration
public class JaegarConfig {

   @Bean
   public WebClient webClient(){
      return WebClient.create();
   }

   @Bean
   public JaegerTracer jaegerTracer() {
      return new io.jaegertracing.Configuration("jaegar-server")
              .withSampler(new io.jaegertracing.Configuration.SamplerConfiguration().withType(ConstSampler.TYPE)
              .withParam(1))
              .withReporter(new io.jaegertracing.Configuration.ReporterConfiguration().withLogSpans(true))
              .getTracer();

   }

}
