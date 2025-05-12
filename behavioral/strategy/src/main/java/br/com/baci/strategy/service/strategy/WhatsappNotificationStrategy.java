package br.com.baci.strategy.service.strategy;

import br.com.baci.strategy.service.NotificationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhatsappNotificationStrategy implements NotificationStrategy {

  private final Logger logger = LoggerFactory.getLogger(WhatsappNotificationStrategy.class);

  @Override
  public void sendNotification(String destination, String message) {
    logger.info("Notification [{}] send to whatsapp number [{}]", message, destination);
  }
  
}
