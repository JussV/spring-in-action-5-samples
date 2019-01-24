package tacos.kitchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TacoKitchenApplication {

  public static void main(String[] args) {
    SpringApplication.run(TacoKitchenApplication.class, args);
  }

  static final String queueName = "tacocloud.order.queue";

  @Bean
  Queue queue() {
    return new Queue(queueName, false);
  }


}
