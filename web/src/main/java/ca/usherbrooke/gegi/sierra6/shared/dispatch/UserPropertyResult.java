package ca.usherbrooke.gegi.sierra6.shared.dispatch;

import com.gwtplatform.dispatch.rpc.shared.Result;

/**
 * Created by LAL on 19/05/2015.
 * I know this class should be secured. But i do not know how yet and it aint my job
 */
public class UserPropertyResult implements Result{
    private Integer cip;

    public UserPropertyResult(final Integer cip){
        this.cip = cip;
    }
    //For serialization only
    private UserPropertyResult(){}

    public Integer getCIP(){
        return this.cip;
    }
}
