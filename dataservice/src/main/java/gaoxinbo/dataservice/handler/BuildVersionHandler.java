package gaoxinbo.dataservice.handler;



import gaoxinbo.dataservice.model.version.BuildVersion;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BuildVersionHandler {

    static final String BUILD_VERSION_PROPERTIES = "build.properties";


    static final String BUILD_DATE = "build_date";
    static final String BUILD_VERSION = "build_version";
    static final String BUILD_HOST = "build_host";

    final Properties properties;

    public BuildVersionHandler() throws IOException {
        final InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(BUILD_VERSION_PROPERTIES);
        properties = new Properties();
        properties.load(resourceAsStream);
    }


    public BuildVersion getBuildVersion() {
        return BuildVersion.builder()
                .buildVersion(properties.getProperty(BUILD_VERSION))
                .buildDate(properties.getProperty(BUILD_DATE))
                .buildHost(properties.getProperty(BUILD_HOST))
                .build();
    }

}
