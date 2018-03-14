package com.tmall.wireless.tangram.support;

import com.tmall.wireless.tangram.view.BannerViewPager;
import io.reactivex.Observable;
import io.reactivex.Observer;

/**
 * Created by longerian on 2018/3/9.
 *
 * @author longerian
 * @date 2018/03/09
 */

public class BannerSelectedObservable extends Observable<Integer> {

    private final RxBannerListener mBannerListener;

    public BannerSelectedObservable(RxBannerSelectedListener bannerListener) {
        mBannerListener = bannerListener;
    }

    @Override
    protected void subscribeActual(Observer<? super Integer> observer) {
        observer.onSubscribe(mBannerListener);
        mBannerListener.setObserver(observer);
    }
}
