package ca.usherbrooke.gegi.sierra6.server.guice;

import ca.uSherbrooke.gegi.commons.core.server.dispatch.UserSession;
import ca.usherbrooke.gegi.sierra6.server.dispatch.UserPropertyHandler;
import ca.usherbrooke.gegi.sierra6.shared.dispatch.UserPropertyAction;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.gwtplatform.dispatch.rpc.server.guice.HandlerModule;
import ca.uSherbrooke.gegi.commons.core.server.dispatch.UserSessionImpl;

public class ServerModule extends HandlerModule {
    @Override
    protected void configureHandlers() {
        this.bindHandler(UserPropertyAction.class, UserPropertyHandler.class);
    }
}
