package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ak1 extends zj1 {

    /* renamed from: i, reason: collision with root package name */
    public static ak1 f2789i;

    public static final ak1 f(Context context) {
        ak1 ak1Var;
        synchronized (ak1.class) {
            try {
                if (f2789i == null) {
                    f2789i = new ak1(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                }
                ak1Var = f2789i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ak1Var;
    }
}
