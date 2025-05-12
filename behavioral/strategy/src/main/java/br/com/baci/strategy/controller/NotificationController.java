package br.com.baci.strategy.controller;

import br.com.baci.strategy.model.NotificationRequest;
import br.com.baci.strategy.service.NotificationService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/notifications")
public class NotificationController {

  private final NotificationService notificationService;

  public NotificationController(NotificationService notificationService) {
    this.notificationService = notificationService;
  }

  @PostMapping
  public ResponseEntity<String> sendNotification(@RequestBody @Valid NotificationRequest request){
    notificationService.notify(
        request.channel(),
        request.destination(),
        request.message()
    );
    return ResponseEntity.ok("deu certo");
  }

}
