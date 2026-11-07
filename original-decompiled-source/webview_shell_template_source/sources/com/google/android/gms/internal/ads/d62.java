package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d62 implements k62 {
    public final k62[] s;

    public d62(k62... k62VarArr) {
        this.s = k62VarArr;
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final i62 a(Class cls) {
        for (int i6 = 0; i6 < 2; i6++) {
            k62 k62Var = this.s[i6];
            if (k62Var.c(cls)) {
                return k62Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final boolean c(Class cls) {
        for (int i6 = 0; i6 < 2; i6++) {
            if (this.s[i6].c(cls)) {
                return true;
            }
        }
        return false;
    }
}
