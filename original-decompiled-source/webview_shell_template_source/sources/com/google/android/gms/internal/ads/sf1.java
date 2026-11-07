package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import java.util.Optional;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class sf1 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ yf1 f8920t;

    public /* synthetic */ sf1(yf1 yf1Var, int i6) {
        this.s = i6;
        this.f8920t = yf1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                this.f8920t.h();
                break;
            default:
                yf1 yf1Var = this.f8920t;
                mf1 mf1Var = yf1Var.f10969n;
                if (mf1Var != null) {
                    mf1Var.c(AdFormat.getAdFormat(yf1Var.f10961e.zzb), Optional.empty(), "paeo_ts", yf1Var.f10970o.a(), Optional.empty());
                    break;
                }
                break;
        }
    }
}
