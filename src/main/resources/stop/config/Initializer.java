package donottouch.config;

import com.dredomt.drmusicarchive.DrMusicArchiveApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class Initializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        // Customizing the application context before the application starts
        return application.sources(DrMusicArchiveApplication.class);
    }
}