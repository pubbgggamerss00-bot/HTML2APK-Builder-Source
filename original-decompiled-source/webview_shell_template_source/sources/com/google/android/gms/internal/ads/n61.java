package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n61 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f7320a = new AtomicReference();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f7321b = new AtomicReference(Boolean.FALSE);

    /* renamed from: c, reason: collision with root package name */
    public final i3.a f7322c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f7323d;

    /* renamed from: e, reason: collision with root package name */
    public final q81 f7324e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7325f;

    /* renamed from: g, reason: collision with root package name */
    public final cu0 f7326g;

    public n61(q81 q81Var, long j6, i3.a aVar, h70 h70Var, cu0 cu0Var) {
        this.f7322c = aVar;
        this.f7324e = q81Var;
        this.f7325f = j6;
        this.f7323d = h70Var;
        this.f7326g = cu0Var;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return this.f7324e.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.google.android.gms.internal.ads.q81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c5.a zzb() {
        m61 m61Var;
        if (((Boolean) zzbe.zzc().a(zn.Fb)).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.Eb)).booleanValue() && !((Boolean) this.f7321b.getAndSet(Boolean.TRUE)).booleanValue()) {
                f70 f70Var = i70.f5589d;
                cf cfVar = new cf(9, this);
                long j6 = this.f7325f;
                f70Var.scheduleWithFixedDelay(cfVar, j6, j6, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                try {
                    m61Var = (m61) this.f7320a.get();
                    if (m61Var == null) {
                        c5.a aVarZzb = this.f7324e.zzb();
                        this.f7320a.set(new m61(aVarZzb, this.f7325f, this.f7322c));
                        return aVarZzb;
                    }
                    if (!((Boolean) this.f7321b.get()).booleanValue()) {
                        if (m61Var.f6946b < m61Var.f6947c.b()) {
                            c5.a aVar = m61Var.f6945a;
                            q81 q81Var = this.f7324e;
                            m61 m61Var2 = new m61(q81Var.zzb(), this.f7325f, this.f7322c);
                            this.f7320a.set(m61Var2);
                            if (((Boolean) zzbe.zzc().a(zn.Gb)).booleanValue()) {
                                if (((Boolean) zzbe.zzc().a(zn.Hb)).booleanValue()) {
                                    bu0 bu0VarA = this.f7326g.a();
                                    bu0VarA.a("action", "scs");
                                    bu0VarA.a("sid", String.valueOf(this.f7324e.zza()));
                                    bu0VarA.c();
                                }
                                return aVar;
                            }
                            m61Var = m61Var2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            m61Var = (m61) this.f7320a.get();
            if (m61Var != null) {
                if (m61Var.f6946b < m61Var.f6947c.b()) {
                    q81 q81Var2 = this.f7324e;
                    m61 m61Var3 = new m61(q81Var2.zzb(), this.f7325f, this.f7322c);
                    this.f7320a.set(m61Var3);
                    m61Var = m61Var3;
                }
            }
        }
        return m61Var.f6945a;
    }
}
