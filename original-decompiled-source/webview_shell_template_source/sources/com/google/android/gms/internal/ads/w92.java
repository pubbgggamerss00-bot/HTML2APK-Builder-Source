package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w92 implements ca2, u92 {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f10132c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile ca2 f10133a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f10134b = f10132c;

    public w92(ca2 ca2Var) {
        this.f10133a = ca2Var;
    }

    public static u92 a(ca2 ca2Var) {
        return ca2Var instanceof u92 ? (u92) ca2Var : new w92(ca2Var);
    }

    public static w92 b(ca2 ca2Var) {
        return ca2Var instanceof w92 ? (w92) ca2Var : new w92(ca2Var);
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        Object obj = this.f10134b;
        Object obj2 = f10132c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f10134b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objZzb = this.f10133a.zzb();
                Object obj4 = this.f10134b;
                if (obj4 != obj2 && obj4 != objZzb) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objZzb + ". This is likely due to a circular dependency.");
                }
                this.f10134b = objZzb;
                this.f10133a = null;
                return objZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
