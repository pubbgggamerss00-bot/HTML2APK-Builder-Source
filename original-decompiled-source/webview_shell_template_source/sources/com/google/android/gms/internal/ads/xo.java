package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import p.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xo {

    /* renamed from: a, reason: collision with root package name */
    public p.h f10649a;

    /* renamed from: b, reason: collision with root package name */
    public g.a f10650b;

    /* renamed from: c, reason: collision with root package name */
    public ha2 f10651c;

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.gms.ads.internal.util.k f10652d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i6 = 0; i6 < listQueryIntentActivities.size(); i6++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i6).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(rj1.e(context));
                    }
                }
            }
        }
        return false;
    }
}
