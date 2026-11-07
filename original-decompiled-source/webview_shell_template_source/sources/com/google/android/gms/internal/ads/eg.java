package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class eg {

    /* renamed from: a, reason: collision with root package name */
    public long f4272a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f4273b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f4274c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f4275d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f4276e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f4277f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f4278g = -1;
    public long h = -1;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        if (r6.contains("REWARDED") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f4275d = this.f4274c;
        this.f4274c = SystemClock.uptimeMillis();
        long j6 = this.f4276e;
        if (j6 != -1) {
            this.f4277f = j6;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        int i6 = displayMetrics.widthPixels * displayMetrics.heightPixels;
        if (view != null) {
            int iMin = Math.min(view.getHeight(), displayMetrics.heightPixels) * Math.min(view.getWidth(), displayMetrics.widthPixels);
            if (iMin + iMin < i6) {
                if (iMin == 0) {
                    try {
                        if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                            view = ((ViewGroup) view).getChildAt(0);
                        }
                        Object objInvoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
                        Integer num = (Integer) objInvoke.getClass().getField("adType").get(objInvoke);
                        num.intValue();
                        String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
                        if (!str.contains("INTERSTITIAL") && !str.contains("APP_OPEN")) {
                        }
                    } catch (ReflectiveOperationException | SecurityException unused2) {
                    }
                }
            }
            this.f4276e = this.f4274c;
            return;
        }
        this.f4276e = -1L;
    }
}
