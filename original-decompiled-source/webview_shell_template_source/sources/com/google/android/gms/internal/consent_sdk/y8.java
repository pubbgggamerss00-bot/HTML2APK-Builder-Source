package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y8 implements a9 {

    /* renamed from: u, reason: collision with root package name */
    public static final Object f11953u = new Object();
    public volatile z8 s;

    /* renamed from: t, reason: collision with root package name */
    public volatile Object f11954t;

    /* JADX WARN: Multi-variable type inference failed */
    public static y8 a(z8 z8Var) {
        if (z8Var instanceof y8) {
            return (y8) z8Var;
        }
        y8 y8Var = new y8();
        y8Var.f11954t = f11953u;
        y8Var.s = z8Var;
        return y8Var;
    }

    @Override // com.google.android.gms.internal.consent_sdk.a9
    public final Object zzb() {
        Object obj = this.f11954t;
        Object obj2 = f11953u;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f11954t;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objZzb = this.s.zzb();
                Object obj4 = this.f11954t;
                if (obj4 != obj2 && obj4 != objZzb) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objZzb + ". This is likely due to a circular dependency.");
                }
                this.f11954t = objZzb;
                this.s = null;
                return objZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
