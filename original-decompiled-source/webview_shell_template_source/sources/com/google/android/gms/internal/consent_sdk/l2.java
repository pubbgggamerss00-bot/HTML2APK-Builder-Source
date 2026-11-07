package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.UserMessagingPlatform;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l2 implements UserMessagingPlatform.a {
    public static final l2 s = new l2();

    /* renamed from: t, reason: collision with root package name */
    public static final l2 f11810t = new l2();

    /* renamed from: u, reason: collision with root package name */
    public static final l2 f11811u = new l2();

    /* renamed from: v, reason: collision with root package name */
    public static final l2 f11812v = new l2();

    /* renamed from: w, reason: collision with root package name */
    public static final l2 f11813w = new l2();

    /* renamed from: x, reason: collision with root package name */
    public static final l2 f11814x = new l2();

    /* renamed from: y, reason: collision with root package name */
    public static final l2 f11815y = new l2();

    public static void a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    @Override // com.google.android.ump.UserMessagingPlatform.a
    public void c(b5.c cVar) {
        Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(cVar.f2011b)));
    }
}
