package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Executor {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f11933t;

    public /* synthetic */ x(int i6, Object obj) {
        this.s = i6;
        this.f11933t = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.s) {
            case 0:
                ((Handler) this.f11933t).post(runnable);
                break;
            case 1:
                ((r3.a) this.f11933t).post(runnable);
                break;
            default:
                y5.u uVar = (y5.u) this.f11933t;
                if (!uVar.y()) {
                    runnable.run();
                    break;
                } else {
                    uVar.x(g5.g.s, runnable);
                    break;
                }
        }
    }

    public String toString() {
        switch (this.s) {
            case 2:
                return ((y5.u) this.f11933t).toString();
            default:
                return super.toString();
        }
    }

    public x() {
        this.s = 1;
        r3.a aVar = new r3.a(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f11933t = aVar;
    }
}
