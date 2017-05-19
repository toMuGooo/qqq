package util;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration

@EnableScheduling
public class Async {
	public static int i=0;
		@Scheduled(cron = "0/10 * * * * ?") 
		public void async(){
			i++;
			System.out.println(i);
		}
}
