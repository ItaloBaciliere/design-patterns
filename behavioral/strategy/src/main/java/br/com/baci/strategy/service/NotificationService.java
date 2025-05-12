package br.com.baci.strategy.service;

import br.com.baci.strategy.service.strategy.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class NotificationService {

  private final Map<String, NotificationStrategy> mapStrategy = Map.of(
      "discord", new DiscordNotificationStrategy(),
      "email", new EmailNotificationStrategy(),
      "sms", new SmsNotificationStrategy(),
      "twitter", new TwitterNotificationStrategy(),
      "whatsapp", new WhatsappNotificationStrategy()
  );

  private final Logger logger = LoggerFactory.getLogger(NotificationService.class);

  public void notify(String channel, String destination, String message){
    logger.info("Sending notification...");
    mapStrategy.get(channel).sendNotification(destination, message);
  }

}
