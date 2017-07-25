package com.dw.springloadedadapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@ConditionalOnProperty(value = {"com.dw.springloadedadapter.disable"}, havingValue = "false",
    matchIfMissing = true)
public class SpringLoadedAdapterAutoConfiguration {

  private static final Logger logger =
      LoggerFactory.getLogger(SpringLoadedAdapterAutoConfiguration.class);

  /**
   * Log spring loaded adapter library successfully initialized.
   * 
   */
  public SpringLoadedAdapterAutoConfiguration() {
    logger.info("SpringLoadedAdapterAutoConfiguration() :: "
        + "Initialization of Spring Loadded Adapter...");
  }
}
