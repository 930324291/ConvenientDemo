package com.convenient.mudule.property.app;

import android.app.Application;
import android.content.Context;

import com.convenient.qd.core.base.callback.IAppLife;

/**
 * @author nicai
 * @date: 2019-9-23
 * desc: 组件全局application的实现和数据的初始化，module Application需要继承IAppLife
 */

public class DemoApp implements IAppLife {

    @Override
    public void attachBaseContext(Context base) {

    }

    @Override
    public void onCreate(Application application) {

    }

    @Override
    public void onTerminate(Application application) {

    }
}
