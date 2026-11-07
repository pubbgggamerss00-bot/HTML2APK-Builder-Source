package com.google.android.recaptcha.internal;

import ah.l;
import java.util.concurrent.Executors;
import ph.i0;
import ph.j0;
import ph.k1;
import ph.n2;
import ph.z0;
import tg.h;
import uh.o;

/* loaded from: classes2.dex */
public final class zzbi {
    private final i0 zza;
    private final i0 zzb;
    private final i0 zzc;
    private final i0 zzd;

    public zzbi() {
        n2 n2VarA = l.a();
        wh.c cVar = z0.f21632a;
        this.zza = new uh.c(h.a.C0291a.c(n2VarA, o.f29764a));
        uh.c cVarA = j0.a(new k1(Executors.newSingleThreadExecutor()));
        ph.h.c(cVarA, null, null, new zzbh(null), 3);
        this.zzb = cVarA;
        this.zzc = j0.a(wh.b.f31563c);
        uh.c cVarA2 = j0.a(new k1(Executors.newSingleThreadExecutor()));
        ph.h.c(cVarA2, null, null, new zzbg(null), 3);
        this.zzd = cVarA2;
    }

    public final i0 zza() {
        return this.zzc;
    }

    public final i0 zzb() {
        return this.zza;
    }

    public final i0 zzc() {
        return this.zzd;
    }

    public final i0 zzd() {
        return this.zzb;
    }
}
