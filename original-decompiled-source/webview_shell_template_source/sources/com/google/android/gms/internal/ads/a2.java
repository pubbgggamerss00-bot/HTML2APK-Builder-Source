package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a2 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f2547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f2548b;

    public a2(c2 c2Var, long j6) {
        this.f2548b = c2Var;
        this.f2547a = j6;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final k1 b(long j6) {
        c2 c2Var = this.f2548b;
        k1 k1VarA = c2Var.f3371i[0].a(j6);
        int i6 = 1;
        while (true) {
            f2[] f2VarArr = c2Var.f3371i;
            if (i6 >= f2VarArr.length) {
                return k1VarA;
            }
            k1 k1VarA2 = f2VarArr[i6].a(j6);
            if (k1VarA2.f6212a.f7278b < k1VarA.f6212a.f7278b) {
                k1VarA = k1VarA2;
            }
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final long zza() {
        return this.f2547a;
    }

    @Override // com.google.android.gms.internal.ads.m1
    public final boolean zzh() {
        return true;
    }
}
