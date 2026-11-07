package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ei0 implements bi {
    public final xa0 s;

    /* renamed from: t, reason: collision with root package name */
    public final Executor f4297t;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicReference f4298u = new AtomicReference();

    public ei0(xa0 xa0Var, Executor executor) {
        this.s = xa0Var;
        this.f4297t = executor;
    }

    @Override // com.google.android.gms.internal.ads.bi
    public final synchronized void C(ai aiVar) {
        if (this.s != null) {
            if (((Boolean) zzbe.zzc().a(zn.vc)).booleanValue()) {
                if (aiVar.f2772j) {
                    AtomicReference atomicReference = this.f4298u;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        Executor executor = this.f4297t;
                        xa0 xa0Var = this.s;
                        Objects.requireNonNull(xa0Var);
                        executor.execute(new ci0(xa0Var, 0));
                        return;
                    }
                }
                if (!aiVar.f2772j) {
                    AtomicReference atomicReference2 = this.f4298u;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        Executor executor2 = this.f4297t;
                        xa0 xa0Var2 = this.s;
                        Objects.requireNonNull(xa0Var2);
                        executor2.execute(new x(8, xa0Var2));
                    }
                }
            }
        }
    }
}
