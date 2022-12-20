package com.exercise;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService() {}

    public String printNotificationService() {
        return "¡Notificación de servicio!";
    }

}
