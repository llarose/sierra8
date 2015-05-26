package ca.usherbrooke.gegi.sierra6.client.application.home;

import javax.inject.Inject;

import ca.usherbrooke.gegi.sierra6.client.application.ApplicationPresenter;
import ca.usherbrooke.gegi.sierra6.client.dispatch.AsyncCallbackImpl;
import ca.usherbrooke.gegi.sierra6.client.place.NameTokens;
import ca.usherbrooke.gegi.sierra6.shared.dispatch.UserPropertyAction;
import ca.usherbrooke.gegi.sierra6.shared.dispatch.UserPropertyResult;
import com.google.gwt.user.client.Window;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.dispatch.rpc.shared.DispatchAsync;

public class HomePagePresenter extends Presenter<HomePagePresenter.MyView, HomePagePresenter.MyProxy> {
    public interface MyView extends View {
    }

    @ProxyStandard
    @NameToken(NameTokens.home)
    public interface MyProxy extends ProxyPlace<HomePagePresenter> {
    }

    private DispatchAsync dispatcher;

    @Inject
    HomePagePresenter(EventBus eventBus,
                      MyView view,
                      MyProxy proxy,
                      DispatchAsync dispatcher) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
        this.dispatcher = dispatcher;
    }

    @Override
    protected void onReveal(){
        super.onReveal();
        fetchUserProperty();
    }

    private void fetchUserProperty(){
        UserPropertyAction action = new UserPropertyAction();

        dispatcher.execute(action, new AsyncCallbackImpl<UserPropertyResult>() {
            @Override
            public void onSuccess(UserPropertyResult userPropertyResult) {
                Window.alert(userPropertyResult.getCIP().toString());
            }
        });
    }
}
