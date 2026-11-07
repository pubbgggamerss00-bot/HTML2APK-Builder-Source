package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class pe2 implements Executor {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Handler f8053t;

    public /* synthetic */ pe2(Handler handler, int i6) {
        this.s = i6;
        this.f8053t = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.s) {
            case 0:
                this.f8053t.post(runnable);
                break;
            default:
                this.f8053t.post(runnable);
                break;
        }
    }
}
