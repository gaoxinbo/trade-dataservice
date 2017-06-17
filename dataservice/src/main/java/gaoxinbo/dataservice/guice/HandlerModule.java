package gaoxinbo.dataservice.guice;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import gaoxinbo.dataservice.handler.BuildVersionHandler;

import java.io.IOException;


public class HandlerModule implements Module {
    @Override
    public void configure(Binder binder) {

    }

    @Provides
    @Singleton
    BuildVersionHandler buildVersionHandler() throws IOException {
        return new BuildVersionHandler();
    }

}
