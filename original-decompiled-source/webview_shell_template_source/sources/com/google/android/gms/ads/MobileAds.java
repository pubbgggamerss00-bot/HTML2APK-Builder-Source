package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.internal.ads.h20;
import com.google.android.gms.internal.ads.l60;
import java.util.List;
import p.b;
import p.d;
import p.h;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(Context context) {
        zzex.zzf().zzn(context);
    }

    public static InitializationStatus getInitializationStatus() {
        return zzex.zzf().zze();
    }

    private static String getInternalVersion() {
        return zzex.zzf().zzi();
    }

    public static RequestConfiguration getRequestConfiguration() {
        return zzex.zzf().zzc();
    }

    public static VersionInfo getVersion() {
        zzex.zzf();
        String[] strArrSplit = TextUtils.split("23.6.0", "\\.");
        if (strArrSplit.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        } catch (NumberFormatException unused) {
            return new VersionInfo(0, 0, 0);
        }
    }

    public static void initialize(Context context) {
        zzex.zzf().zzo(context, null, null);
    }

    public static void openAdInspector(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzex.zzf().zzr(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(Context context, String str) {
        zzex.zzf().zzs(context, str);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z6) {
        return zzex.zzf().zzz(z6);
    }

    public static h registerCustomTabsSession(Context context, d dVar, String str, b bVar) {
        zzex.zzf();
        l.d("#008 Must be called on the main UI thread.");
        l60 l60VarA = h20.a(context);
        if (l60VarA == null) {
            zzo.zzg("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (h) k3.b.i1(l60VarA.zze(new k3.b(context), new k3.b(dVar), str, new k3.b(bVar)));
        } catch (RemoteException | IllegalArgumentException e6) {
            zzo.zzh("Unable to register custom tabs session. Error: ", e6);
            return null;
        }
    }

    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        zzex.zzf().zzt(cls);
    }

    public static void registerWebView(WebView webView) {
        zzex.zzf();
        l.d("#008 Must be called on the main UI thread.");
        if (webView == null) {
            zzo.zzg("The webview to be registered cannot be null.");
            return;
        }
        l60 l60VarA = h20.a(webView.getContext());
        if (l60VarA == null) {
            zzo.zzg("Internal error, query info generator is null.");
            return;
        }
        try {
            l60VarA.zzj(new k3.b(webView));
        } catch (RemoteException e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }

    public static void setAppMuted(boolean z6) {
        zzex.zzf().zzu(z6);
    }

    public static void setAppVolume(float f6) {
        zzex.zzf().zzv(f6);
    }

    private static void setPlugin(String str) {
        zzex.zzf().zzw(str);
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration) {
        zzex.zzf().zzx(requestConfiguration);
    }

    public static void startPreload(Context context, List<PreloadConfiguration> list, PreloadCallback preloadCallback) {
        zzex.zzf().zzg(context, list, preloadCallback);
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        zzex.zzf().zzo(context, null, onInitializationCompleteListener);
    }
}
