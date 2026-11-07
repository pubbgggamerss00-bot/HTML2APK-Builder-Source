package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bv {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3298a;

    /* renamed from: b, reason: collision with root package name */
    public final OnH5AdsEventListener f3299b;

    /* renamed from: c, reason: collision with root package name */
    public xu f3300c;

    public bv(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        com.google.android.gms.common.internal.l.f(context);
        com.google.android.gms.common.internal.l.f(onH5AdsEventListener);
        this.f3298a = context;
        this.f3299b = onH5AdsEventListener;
        zn.a(context);
    }

    public static final boolean a(String str) {
        if (((Boolean) zzbe.zzc().a(zn.N9)).booleanValue()) {
            com.google.android.gms.common.internal.l.f(str);
            if (str.length() > ((Integer) zzbe.zzc().a(zn.P9)).intValue()) {
                zzo.zze("H5 GMSG exceeds max length");
                return false;
            }
            Uri uri = Uri.parse(str);
            if ("gmsg".equals(uri.getScheme()) && "mobileads.google.com".equals(uri.getHost()) && "/h5ads".equals(uri.getPath())) {
                return true;
            }
        }
        return false;
    }
}
