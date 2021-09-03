package edu.wctc.salesreporting;

import edu.wctc.salesreporting.iface.SalesInput;
import edu.wctc.salesreporting.iface.SalesOutput;
import edu.wctc.salesreporting.impl.FileOutput;
import edu.wctc.salesreporting.impl.FileInput;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.salesreporting")
public class AppConfig {
    @Bean
    public SalesInput salesInput(){
        return new FileInput();
    }

    @Bean
    public SalesOutput salesOutput(){
        return new FileOutput();
    }

}
