package com.convenient.mudule.property;

import android.view.View;
import android.widget.Button;

import com.blankj.utilcode.util.ToastUtils;
import com.convenient.mudule.property.api.DemoModule;
import com.convenient.mudule.property.bean.HomeResponse;
import com.convenient.qd.core.base.arouter.ARouterConstant;
import com.convenient.qd.core.base.arouter.ARouterUtils;
import com.convenient.qd.core.base.mvp.BaseActivity;
import com.convenient.qd.core.base.mvp.BasePresenter;
import com.convenient.qd.core.bean.BaseResBean;
import com.convenient.qd.core.bean.UserInfo;
import com.convenient.qd.core.constant.Constant;
import com.convenient.qd.core.net.BaseHttpObserver;
import com.convenient.qd.core.user.UserDBHelper;
import com.convenient.qd.core.utils.SocialUtil;
import com.convenient.qd.core.widget.LoadingDiaLogUtils;

import net.arvin.socialhelper.SocialHelper;


/**
 * @author nicai
 * @date: 2019-9-23
 * desc:
 */

public class TestActivity extends BaseActivity {
    private Button btn_demo;
    private SocialHelper socialHelper;

    @Override
    protected void init() {
        super.init();
        // 是否显示标题栏
        setSupportHeadLayout(true);
    }

    @Override
    protected int initLayout() {
        return R.layout.property_activity_test;
    }

    @Override
    protected void initView() {
        setTitle("物业缴费");
        btn_demo = findViewById(R.id.btn_demo);
    }

    @Override
    protected void initListener() {
        super.initListener();
        btn_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadTestData();
            }
        });
    }

    @Override
    protected void initData() {
        super.initData();

    }

    private void loadTestData(){
        // 网络请求日志开关
//        Constant.DEBUG = BuildConfig.DEBUG;

        // 统一获取登录用户信息
        UserInfo userInfo = UserDBHelper.getInstance().getUserInfo();
//        if(userInfo == null){
//            // 用户信息为空跳转登录页面
//            ARouterUtils.navigation(ARouterConstant.ACTIVITY_LOGIN_ACTIVITY);
//            return;
//        }

        //统一加载框
        showWaitingDialog();
        // 或 LoadingDiaLogUtils.showLoadingDialog(this);

        //统一网络请求
        DemoModule.getInstance().getHomeData(UserDBHelper.getInstance().getUserId(), UserDBHelper.getInstance().getAccessToken(), new BaseHttpObserver<BaseResBean<HomeResponse>>() {
            @Override
            public void onSuccess(BaseResBean<HomeResponse> homeResponseBaseResponseBean) {
                hideWaitingDialog();
                // LoadingDiaLogUtils.dismisDialog();
            }

            @Override
            public void onFailure(int status, String msg) {
                ToastUtils.showShort(msg);
            }
        });
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(socialHelper != null){
            socialHelper.clear();
        }
    }

    /**
     * 第三方登录分享集成微信、qq、微博 参考 https://github.com/arvinljw/SocialHelper
     */
    private void shareWX(){
        socialHelper = SocialUtil.INSTANCE.socialHelper;
    }
    private void loginByWeiChat(){
        ToastUtils.showLong("微信登录中~");
//        socialHelper.loginWX(this, this);
    }

    @Override
    protected BasePresenter createPresenter() {
        return null;
    }
}
