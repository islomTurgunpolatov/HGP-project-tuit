package registration.uz.hgpuserregistration.DetectorData;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/websocket-connection/**")
                .allowedOrigins("https://high-gas-protection.vercel.app") // Replace with your global host
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//                .allowedHeaders("*")
                .allowCredentials(true);
    }
}

