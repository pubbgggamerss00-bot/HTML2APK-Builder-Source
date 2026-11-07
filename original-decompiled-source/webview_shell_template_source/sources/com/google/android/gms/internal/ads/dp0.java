package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dp0 implements bi {
    public final /* synthetic */ String s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ fp0 f3987t;

    public dp0(fp0 fp0Var, String str) {
        this.s = str;
        this.f3987t = fp0Var;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.gms.internal.ads.hq0, com.google.android.gms.internal.ads.sh] */
    @Override // com.google.android.gms.internal.ads.bi
    public final void C(ai aiVar) {
        if (!((Boolean) zzbe.zzc().a(zn.R1)).booleanValue()) {
            if (aiVar.f2772j) {
                fp0 fp0Var = this.f3987t;
                if (fp0Var.f4758u != null) {
                    fp0Var.E.put(this.s, Boolean.TRUE);
                    fp0 fp0Var2 = this.f3987t;
                    ?? r02 = fp0Var2.f4758u;
                    if (r02 == 0) {
                        return;
                    }
                    fp0Var2.b(r02.zzf(), this.f3987t.f4758u.zzl(), this.f3987t.f4758u.zzm(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (aiVar.f2772j) {
                    fp0 fp0Var3 = this.f3987t;
                    if (fp0Var3.f4758u != null) {
                        fp0Var3.E.put(this.s, Boolean.TRUE);
                        fp0 fp0Var4 = this.f3987t;
                        ?? r03 = fp0Var4.f4758u;
                        if (r03 == 0) {
                        } else {
                            fp0Var4.b(r03.zzf(), this.f3987t.f4758u.zzl(), this.f3987t.f4758u.zzm(), true);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
