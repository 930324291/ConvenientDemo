package com.convenient.mudule.property.api;

import com.convenient.mudule.property.bean.HomeResponse;
import com.convenient.mudule.property.bean.RequestHome;
import com.convenient.qd.core.bean.BaseResBean;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * @author nicai
 * @date: 2019-9-23
 * desc:
 */

public interface DemoApiService {

    @POST(DemoApi.GetHomeData)
    Observable<BaseResBean<HomeResponse>> getHomeData(
            @Body RequestHome json
    );
}
