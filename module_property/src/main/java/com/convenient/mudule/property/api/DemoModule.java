package com.convenient.mudule.property.api;

import com.convenient.mudule.property.bean.HomeResponse;
import com.convenient.mudule.property.bean.RequestHome;
import com.convenient.qd.core.base.AppInfo;
import com.convenient.qd.core.bean.BaseResBean;
import com.convenient.qd.core.net.BaseHttpObserver;
import com.convenient.qd.core.net.RetrofitHelper;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

import static com.convenient.qd.core.constant.Constant.appId;

/**
 * @author nicai
 * @date: 2019-9-23
 * desc:
 */

public class DemoModule {
    private static DemoModule model;
    private DemoApiService mApiService;

    private DemoModule() {
        mApiService = RetrofitHelper.getInstance(DemoApi.SERVER_URL).create(DemoApiService.class);
    }

    public static DemoModule getInstance(){
        if(model == null) {
            model = new DemoModule();
        }
        return model;
    }

    /**
     * 9、获取首页数据
     */
    public void getHomeData(String userId, String accessToken,BaseHttpObserver<BaseResBean<HomeResponse>> observer) {
        RequestHome request = new RequestHome();
        request.setAppId(appId);
        request.setUserId(userId);
        request.setAccessToken(accessToken);
        request.setAppInfo(new AppInfo());

        mApiService.getHomeData(request)
                .subscribeOn(Schedulers.io()) // 在子线程中进行Http访问
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(observer);
    }
}
