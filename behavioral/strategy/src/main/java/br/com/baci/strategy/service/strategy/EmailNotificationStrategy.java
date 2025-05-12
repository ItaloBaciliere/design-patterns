package br.com.baci.strategy.service.strategy;

import br.com.baci.strategy.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmailNotificationStrategy implements NotificationStrategy {

  private final Logger logger = LoggerFactory.getLogger(EmailNotificationStrategy.class);

  @Override
  public void sendNotification(String destination, String message) {
    logger.info("Notification [{}] send to email [{}]", message, destination);
  }

}
