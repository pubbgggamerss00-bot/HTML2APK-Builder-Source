package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dc2 implements th2, df2 {

    /* renamed from: a, reason: collision with root package name */
    public final fc2 f3848a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hc2 f3849b;

    public dc2(hc2 hc2Var, fc2 fc2Var) {
        this.f3849b = hc2Var;
        this.f3848a = fc2Var;
    }

    @Override // com.google.android.gms.internal.ads.th2
    public final void a(int i6, oh2 oh2Var, final fh2 fh2Var, final lh2 lh2Var) {
        final Pair pairI = i(oh2Var);
        if (pairI != null) {
            this.f3849b.f5335i.e(new Runnable() { // from class: com.google.android.gms.internal.ads.bc2
                @Override // java.lang.Runnable
                public final void run() {
                    wc2 wc2Var = this.s.f3849b.h;
                    Pair pair = pairI;
                    wc2Var.a(((Integer) pair.first).intValue(), (oh2) pair.second, fh2Var, lh2Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.th2
    public final void d(int i6, oh2 oh2Var, fh2 fh2Var, lh2 lh2Var) {
        Pair pairI = i(oh2Var);
        if (pairI != null) {
            this.f3849b.f5335i.e(new cc2(this, pairI, fh2Var, lh2Var, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.th2
    public final void f(int i6, oh2 oh2Var, fh2 fh2Var, lh2 lh2Var) {
        Pair pairI = i(oh2Var);
        if (pairI != null) {
            this.f3849b.f5335i.e(new f31(this, pairI, fh2Var, lh2Var, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.th2
    public final void g(int i6, oh2 oh2Var, lh2 lh2Var) {
        Pair pairI = i(oh2Var);
        if (pairI != null) {
            this.f3849b.f5335i.e(new x70(this, pairI, lh2Var, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.th2
    public final void h(int i6, oh2 oh2Var, final fh2 fh2Var, final lh2 lh2Var, final IOException iOException, final boolean z6) {
        final Pair pairI = i(oh2Var);
        if (pairI != null) {
            this.f3849b.f5335i.e(new Runnable() { // from class: com.google.android.gms.internal.ads.ac2
                @Override // java.lang.Runnable
                public final void run() {
                    wc2 wc2Var = this.s.f3849b.h;
                    Pair pair = pairI;
                    wc2Var.h(((Integer) pair.first).intValue(), (oh2) pair.second, fh2Var, lh2Var, iOException, z6);
                }
            });
        }
    }

    public final Pair i(oh2 oh2Var) {
        oh2 oh2VarA;
        fc2 fc2Var = this.f3848a;
        oh2 oh2Var2 = null;
        if (oh2Var != null) {
            int i6 = 0;
            while (true) {
                if (i6 >= fc2Var.f4609c.size()) {
                    oh2VarA = null;
                    break;
                }
                if (((oh2) fc2Var.f4609c.get(i6)).f7772d == oh2Var.f7772d) {
                    oh2VarA = oh2Var.a(Pair.create(fc2Var.f4608b, oh2Var.f7769a));
                    break;
                }
                i6++;
            }
            if (oh2VarA == null) {
                return null;
            }
            oh2Var2 = oh2VarA;
        }
        return Pair.create(Integer.valueOf(fc2Var.f4610d), oh2Var2);
    }
}
