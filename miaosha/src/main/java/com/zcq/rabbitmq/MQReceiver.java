package com.zcq.rabbitmq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * @Author: zcq
 * @Date: 2019/4/21 23:14
 */
@Service
public class MQReceiver {

    private static Logger log = LoggerFactory.getLogger(MQReceiver.class);

    @RabbitListener(queues=MQConfig.QUEUE)
	public void receive(String message) {
		log.info("receive message:"+message);
	}
}
