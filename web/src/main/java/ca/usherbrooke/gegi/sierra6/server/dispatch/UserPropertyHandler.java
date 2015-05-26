package ca.usherbrooke.gegi.sierra6.server.dispatch;

import ca.usherbrooke.gegi.sierra6.shared.dispatch.UserPropertyAction;
import ca.usherbrooke.gegi.sierra6.shared.dispatch.UserPropertyResult;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.gwtplatform.dispatch.rpc.server.ExecutionContext;
import com.gwtplatform.dispatch.rpc.server.actionhandler.ActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;
import ca.uSherbrooke.gegi.commons.core.server.dispatch.UserSessionImpl;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by LAL on 19/05/2015.
 */

public class UserPropertyHandler implements ActionHandler<UserPropertyAction, UserPropertyResult> {

    @Inject
    UserPropertyHandler(UserSessionImpl us){
        this.userSession = us;
    }

    UserSessionImpl userSession;

    @Override
    public UserPropertyResult execute(UserPropertyAction userPropertyAction, ExecutionContext executionContext) throws ActionException {
        UserPropertyResult result =  new UserPropertyResult(userSession.getUserId());
        return result;
    }

    @Override
    public Class<UserPropertyAction> getActionType() {
        return null;
    }

    @Override
    public void undo(UserPropertyAction userPropertyAction, UserPropertyResult userPropertyResult, ExecutionContext executionContext) throws ActionException {

    }
}
