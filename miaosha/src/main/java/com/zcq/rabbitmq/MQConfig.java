package com.zcq.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @Author: zcq
 * @Date: 2019/4/21 23:14
 */
@Configuration
public class MQConfig {
    public static final String MIAOSHA_QUEUE = "miaosha.queue";
    public static final String QUEUE = "queue";
    public static final String TOPIC_QUEUE1 = "topic.queue1";
    public static final String TOPIC_QUEUE2 = "topic.queue2";
    public static final String HEADER_QUEUE = "header.queue";
    public static final String TOPIC_EXCHANGE = "topicExchage";
    public static final String FANOUT_EXCHANGE = "fanoutxchage";
    public static final String HEADERS_EXCHANGE = "headersExchage";

    /**
     * Direct模式 交换机Exchange
     * */
    @Bean
    public org.springframework.amqp.core.Queue queue() {
        return new Queue(QUEUE, true);
    }
}
