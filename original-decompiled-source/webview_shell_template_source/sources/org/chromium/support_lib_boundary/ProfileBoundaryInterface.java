package org.chromium.support_lib_boundary;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import java.lang.reflect.InvocationHandler;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface ProfileBoundaryInterface {
    void cancelPrefetch(String str);

    void clearPrefetch(String str, ValueCallback<InvocationHandler> valueCallback);

    CookieManager getCookieManager();

    GeolocationPermissions getGeoLocationPermissions();

    String getName();

    ServiceWorkerController getServiceWorkerController();

    WebStorage getWebStorage();

    void prefetchUrl(String str, ValueCallback<InvocationHandler> valueCallback);

    void prefetchUrl(String str, InvocationHandler invocationHandler, ValueCallback<InvocationHandler> valueCallback);
}
