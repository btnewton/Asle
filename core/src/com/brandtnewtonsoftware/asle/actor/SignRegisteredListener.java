package com.brandtnewtonsoftware.asle.actor;

import com.brandtnewtonsoftware.asle.sign.Sign;

/**
 * Created by Brandt on 11/1/2015.
 */
public interface SignRegisteredListener {
    void onSignRegistered(Sign sign, boolean signCorrect);
}
