package com.google.android.gms.internal.ads;

import l0.f;
import m0.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class la2 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f6643t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f6644u;

    public /* synthetic */ la2(int i6, int i7, Object obj) {
        this.s = i7;
        this.f6644u = obj;
        this.f6643t = i6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                oa2 oa2Var = ((ma2) this.f6644u).f7040b;
                int i6 = this.f6643t;
                if (i6 != -3 && i6 != -2) {
                    if (i6 == -1) {
                        oa2Var.b(-1);
                        oa2Var.a();
                        oa2Var.c(1);
                        break;
                    } else if (i6 == 1) {
                        oa2Var.c(2);
                        oa2Var.b(1);
                        break;
                    } else {
                        androidx.activity.m.g(i6, "Unknown focus change type: ", "AudioFocusManager");
                        break;
                    }
                } else if (i6 == -2) {
                    oa2Var.b(0);
                    oa2Var.c(3);
                    break;
                } else {
                    oa2Var.c(4);
                    break;
                }
            default:
                f.c cVar = ((e.a) this.f6644u).f13863a;
                if (cVar != null) {
                    cVar.b(this.f6643t);
                    break;
                }
                break;
        }
    }
}
