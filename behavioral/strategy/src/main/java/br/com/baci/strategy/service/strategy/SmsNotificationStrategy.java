package br.com.baci.strategy.service.strategy;

import br.com.baci.strategy.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmsNotificationStrategy implements NotificationStrategy {

  private final Logger logger = LoggerFactory.getLogger(SmsNotificationStrategy.class);

  @Override
  public void sendNotification(String destination, String message) {
    logger.info("Notification [{}] send to SMS number [{}]", message, destination);
  }
  
}
