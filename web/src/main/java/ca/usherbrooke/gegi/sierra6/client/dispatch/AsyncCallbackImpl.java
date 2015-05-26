package ca.usherbrooke.gegi.sierra6.client.dispatch;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.Window;

/**
 * Created by LAL on 19/05/2015.
 * Inspired (and copied) by
 * https://github.com/ArcBees/Arcbees-Archetypes/blob/master/archetypes/gwtp-appengine-objectify/src/main/java/com/arcbees/project/client/dispatch/AsyncCallbackImpl.java
 */
public abstract class AsyncCallbackImpl<T> implements AsyncCallback<T> {
    @Override
    public void onFailure(Throwable caught){
        Window.alert("Communication to the server has failed.");
    }
}
