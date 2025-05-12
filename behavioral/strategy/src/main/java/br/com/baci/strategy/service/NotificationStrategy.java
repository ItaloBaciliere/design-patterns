package br.com.baci.strategy.service;

public interface NotificationStrategy {
  void sendNotification(String destination, String message);
}
