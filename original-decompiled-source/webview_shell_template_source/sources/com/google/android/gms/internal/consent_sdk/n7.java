package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n7 implements u7 {

    /* renamed from: a, reason: collision with root package name */
    public final u7[] f11846a;

    public n7(u7... u7VarArr) {
        this.f11846a = u7VarArr;
    }

    @Override // com.google.android.gms.internal.consent_sdk.u7
    public final t7 a(Class cls) {
        for (int i6 = 0; i6 < 2; i6++) {
            u7 u7Var = this.f11846a[i6];
            if (u7Var.c(cls)) {
                return u7Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.consent_sdk.u7
    public final boolean c(Class cls) {
        for (int i6 = 0; i6 < 2; i6++) {
            if (this.f11846a[i6].c(cls)) {
                return true;
            }
        }
        return false;
    }
}
