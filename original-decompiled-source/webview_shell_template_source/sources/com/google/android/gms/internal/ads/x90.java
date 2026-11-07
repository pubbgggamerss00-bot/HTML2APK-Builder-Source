package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x90 extends s90 implements o52 {
    public static final AtomicInteger G = new AtomicInteger(0);
    public ByteBuffer A;
    public boolean B;
    public final Object C;
    public final String D;
    public final int E;
    public boolean F;

    /* renamed from: v, reason: collision with root package name */
    public String f10445v;

    /* renamed from: w, reason: collision with root package name */
    public final o80 f10446w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10447x;

    /* renamed from: y, reason: collision with root package name */
    public final w90 f10448y;

    /* renamed from: z, reason: collision with root package name */
    public final c90 f10449z;

    public x90(p80 p80Var, o80 o80Var) {
        super(p80Var);
        this.f10446w = o80Var;
        this.f10448y = new w90();
        this.f10449z = new c90();
        this.C = new Object();
        String strZzr = p80Var.zzr();
        this.D = (String) (strZzr == null ? kl1.s : new vl1(strZzr)).b();
        this.E = p80Var.zzf();
        G.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.o52
    public final void f(wj1 wj1Var, os1 os1Var, boolean z6) {
        if (wj1Var instanceof yw1) {
            this.f10448y.f10126a.add((yw1) wj1Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.s90
    public final void i() {
        this.f10447x = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.google.android.gms.internal.ads.a90] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    @Override // com.google.android.gms.internal.ads.s90
    public final boolean p(String str) throws IOException {
        String str2;
        String str3;
        long j6;
        this.f10445v = str;
        String str4 = "error";
        String strConcat = "cache:".concat(String.valueOf(zzf.zzf(str)));
        try {
            ro0 ro0Var = new ro0(8);
            String str5 = this.f8852t;
            o80 o80Var = this.f10446w;
            yw1 yw1Var = new yw1(str5, o80Var.f7634d, o80Var.f7635e, true, ro0Var);
            yw1Var.d(this);
            if (this.f10446w.f7638i) {
                yw1Var = new a90(this.s, yw1Var, this.D, this.E);
            }
            yw1Var.c(new os1(Uri.parse(str), 0L, -1L));
            p80 p80Var = (p80) this.f8853u.get();
            if (p80Var != null) {
                p80Var.b0(strConcat, this);
            }
            i3.a aVarZzC = zzv.zzC();
            long jA = aVarZzC.a();
            long jLongValue = ((Long) zzbe.zzc().a(zn.L)).longValue();
            long jLongValue2 = ((Long) zzbe.zzc().a(zn.K)).longValue();
            this.A = ByteBuffer.allocate(this.f10446w.f7633c);
            int i6 = 8192;
            byte[] bArr = new byte[8192];
            long j7 = jA;
            while (true) {
                int iJ = yw1Var.j(0, Math.min(this.A.remaining(), i6), bArr);
                str2 = str4;
                if (iJ == -1) {
                    this.F = true;
                    zzf.zza.post(new q90(this, str, strConcat, (int) this.f10449z.a(this.A)));
                    return true;
                }
                try {
                    synchronized (this.C) {
                        try {
                            ?? r6 = this.f10447x;
                            if (r6 == 0) {
                                ?? r62 = this.A;
                                j6 = jA;
                                r62.put(bArr, 0, iJ);
                                str3 = r62;
                            } else {
                                j6 = jA;
                                str3 = r6;
                            }
                        } finally {
                        }
                    }
                    if (this.A.remaining() <= 0) {
                        s();
                        return true;
                    }
                    try {
                        if (this.f10447x) {
                            throw new IOException("Precache abort at " + this.A.limit() + " bytes");
                        }
                        long jA2 = aVarZzC.a();
                        if (jA2 - j7 >= jLongValue) {
                            s();
                            j7 = jA2;
                        }
                        if (jA2 - j6 > 1000 * jLongValue2) {
                            throw new IOException("Timeout exceeded. Limit: " + jLongValue2 + " sec");
                        }
                        str4 = str2;
                        jA = j6;
                        i6 = 8192;
                    } catch (Exception e6) {
                        e = e6;
                        String strD = androidx.activity.m.d(e.getClass().getCanonicalName(), ":", e.getMessage());
                        zzo.zzj("Failed to preload url " + str + " Exception: " + strD);
                        j(str, strConcat, str3, strD);
                        return false;
                    }
                } catch (Exception e7) {
                    e = e7;
                    str3 = str2;
                    String strD2 = androidx.activity.m.d(e.getClass().getCanonicalName(), ":", e.getMessage());
                    zzo.zzj("Failed to preload url " + str + " Exception: " + strD2);
                    j(str, strConcat, str3, strD2);
                    return false;
                }
            }
        } catch (Exception e8) {
            e = e8;
            str2 = str4;
        }
    }

    @Override // com.google.android.gms.internal.ads.s90, d3.g
    public final void release() {
        G.decrementAndGet();
    }

    public final void s() {
        w90 w90Var = this.f10448y;
        Iterator it = w90Var.f10126a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((yw1) it.next()).zze().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        w90Var.f10127b = Math.max(w90Var.f10127b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        int i6 = (int) w90Var.f10127b;
        int iA = (int) this.f10449z.a(this.A);
        int iPosition = this.A.position();
        int iRound = Math.round((iPosition / i6) * iA);
        int i7 = i80.s.get();
        int i8 = i80.f5598t.get();
        String str = this.f10445v;
        zzf.zza.post(new o90(this, str, "cache:".concat(String.valueOf(zzf.zzf(str))), iPosition, i6, iRound, iA, iRound > 0, i7, i8));
    }

    @Override // com.google.android.gms.internal.ads.o52
    public final void d(os1 os1Var, boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.o52
    public final void o(os1 os1Var, boolean z6, int i6) {
    }
}
