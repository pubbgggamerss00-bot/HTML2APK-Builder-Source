package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kg implements AppOpsManager$OnOpActiveChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mg f6400a;

    public kg(mg mgVar) {
        this.f6400a = mgVar;
    }

    public final void onOpActiveChanged(String str, int i6, String str2, boolean z6) {
        if (z6) {
            this.f6400a.f7140a = System.currentTimeMillis();
            this.f6400a.f7143d = true;
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f6400a.f7141b > 0) {
            mg mgVar = this.f6400a;
            long j6 = mgVar.f7141b;
            if (jCurrentTimeMillis >= j6) {
                mgVar.f7142c = jCurrentTimeMillis - j6;
            }
        }
        this.f6400a.f7143d = false;
    }
}
