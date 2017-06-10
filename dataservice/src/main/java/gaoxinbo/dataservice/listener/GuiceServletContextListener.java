package gaoxinbo.dataservice.listener;


import com.google.common.collect.ImmutableList;
import com.google.inject.Module;
import com.squarespace.jersey2.guice.JerseyGuiceServletContextListener;

import java.util.List;

public class GuiceServletContextListener extends JerseyGuiceServletContextListener {
    @Override
    protected List<? extends Module> modules() {
        return ImmutableList.of();
    }
}
