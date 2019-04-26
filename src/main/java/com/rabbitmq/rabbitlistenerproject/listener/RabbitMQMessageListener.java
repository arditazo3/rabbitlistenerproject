package com.rabbitmq.rabbitlistenerproject.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class RabbitMQMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        System.out.printf("message = [" + new String(message.getBody()) + "]");
    }
}
