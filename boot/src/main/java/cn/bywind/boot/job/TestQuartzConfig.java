package cn.bywind.boot.job;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestQuartzConfig {
    @Bean
    public JobDetail teatQuartzDetail(){
        return JobBuilder.newJob(TestQuartz.class)
                .withIdentity("testQuartz")
                .storeDurably()
                .requestRecovery(true)
                .build();
    }
    @Bean
    public Trigger testQuartzTrigger(){
        JobDataMap jobDataMap = new JobDataMap();
        jobDataMap.put("name","bywind");

        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder
                .simpleSchedule()
                .withIntervalInSeconds(2)  //设置时间周期单位秒
                .repeatForever();
        return TriggerBuilder.newTrigger().forJob(teatQuartzDetail())
                .withIdentity("testQuartz")
                .withSchedule(scheduleBuilder)
                .usingJobData(jobDataMap)
                .build();
    }
}