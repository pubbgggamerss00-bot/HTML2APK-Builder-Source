package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bk1 extends zj1 {

    /* renamed from: i, reason: collision with root package name */
    public static bk1 f3213i;

    public static final bk1 g(Context context) {
        bk1 bk1Var;
        synchronized (bk1.class) {
            try {
                if (f3213i == null) {
                    f3213i = new bk1(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                }
                bk1Var = f3213i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bk1Var;
    }

    public final y2 f(boolean z6, long j6) {
        boolean z7;
        synchronized (bk1.class) {
            try {
                xj1 xj1Var = this.f11320g;
                xj1Var.getClass();
                synchronized (xj1.class) {
                    z7 = ((yj1) xj1Var.f10619t).f11010b.getBoolean("paidv2_publisher_option", true);
                }
                if (z7) {
                    return a(null, null, j6, z6);
                }
                return new y2();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (bk1.class) {
            try {
                yj1 yj1Var = this.f11319f;
                if (yj1Var.f11010b.contains(this.f11314a)) {
                    d(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
