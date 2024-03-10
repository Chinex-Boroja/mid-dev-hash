package org.chinexboroja;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class MidDevHashApplication extends Application<MidDevHashConfiguration> {

    public static void main(final String[] args) throws Exception {
        new MidDevHashApplication().run(args);
    }

    @Override
    public String getName() {
        return "MidDevHash";
    }

    @Override
    public void initialize(final Bootstrap<MidDevHashConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final MidDevHashConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
