package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f11819a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f11820b = new l0();

    public static void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Method must be call on main thread.");
        }
    }
}
