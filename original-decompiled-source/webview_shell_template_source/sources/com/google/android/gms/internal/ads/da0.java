package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class da0 extends wj1 {

    /* renamed from: e, reason: collision with root package name */
    public final Context f3806e;

    /* renamed from: f, reason: collision with root package name */
    public final lo1 f3807f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3808g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3809i;

    /* renamed from: j, reason: collision with root package name */
    public InputStream f3810j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3811k;

    /* renamed from: l, reason: collision with root package name */
    public Uri f3812l;

    /* renamed from: m, reason: collision with root package name */
    public volatile xj f3813m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3814n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3815o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3816p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3817q;

    /* renamed from: r, reason: collision with root package name */
    public long f3818r;
    public c5.a s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicLong f3819t;

    /* renamed from: u, reason: collision with root package name */
    public final dh0 f3820u;

    public da0(Context context, lo1 lo1Var, String str, int i6, o52 o52Var, dh0 dh0Var) {
        super(false);
        this.f3806e = context;
        this.f3807f = lo1Var;
        this.f3820u = dh0Var;
        this.f3808g = str;
        this.h = i6;
        this.f3814n = false;
        this.f3815o = false;
        this.f3816p = false;
        this.f3817q = false;
        this.f3818r = 0L;
        this.f3819t = new AtomicLong(-1L);
        this.s = null;
        this.f3809i = ((Boolean) zzbe.zzc().a(zn.Y1)).booleanValue();
        d(o52Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fe  */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.gms.internal.ads.xj] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    @Override // com.google.android.gms.internal.ads.lo1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(os1 os1Var) throws Throwable {
        uj ujVarA;
        boolean z6;
        long j6;
        Long l4;
        Throwable th;
        boolean z7;
        boolean z8;
        long jB;
        StringBuilder sb;
        ik ikVar;
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (this.f3811k) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z9 = true;
        this.f3811k = true;
        this.f3812l = os1Var.f7851a;
        if (!this.f3809i) {
            m(os1Var);
        }
        this.f3813m = xj.l(os1Var.f7851a);
        if (!((Boolean) zzbe.zzc().a(zn.f11464q4)).booleanValue()) {
            if (this.f3813m != null) {
                this.f3813m.f10616z = os1Var.f7853c;
                xj xjVar = this.f3813m;
                String str2 = this.f3808g;
                if (str2 != null) {
                    str = str2;
                }
                xjVar.A = str;
                this.f3813m.B = this.h;
                ujVarA = zzv.zzc().a(this.f3813m);
            } else {
                ujVarA = null;
            }
            uj ujVar = ujVarA;
            if (ujVar != null && ujVar.m()) {
                synchronized (ujVar) {
                    z6 = ujVar.f9570t;
                }
                this.f3814n = z6;
                this.f3816p = ujVar.o();
                this.f3817q = ujVar.n();
                synchronized (ujVar) {
                    j6 = ujVar.f9572v;
                }
                this.f3818r = j6;
                this.f3815o = true;
                if (!n()) {
                    this.f3810j = ujVar.l();
                    if (this.f3809i) {
                        m(os1Var);
                    }
                    return -1L;
                }
            }
        } else if (this.f3813m != null) {
            this.f3813m.f10616z = os1Var.f7853c;
            xj xjVar2 = this.f3813m;
            String str3 = this.f3808g;
            if (str3 != null) {
                str = str3;
            }
            xjVar2.A = str;
            this.f3813m.B = this.h;
            if (this.f3813m.f10615y) {
                l4 = (Long) zzbe.zzc().a(zn.s4);
            } else {
                l4 = (Long) zzbe.zzc().a(zn.f11471r4);
            }
            long jLongValue = l4.longValue();
            long jB2 = zzv.zzC().b();
            zzv.zzd();
            Context context = this.f3806e;
            ?? r42 = this.f3813m;
            ak akVarA = hk.a(context, r42);
            try {
                try {
                    ikVar = (ik) akVarA.s.get(jLongValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    th = th2;
                    z9 = r42;
                }
                try {
                    this.f3814n = ikVar.f5792b;
                    this.f3816p = ikVar.f5793c;
                    this.f3817q = ikVar.f5795e;
                    this.f3818r = ikVar.f5794d;
                } catch (InterruptedException unused) {
                    z8 = true;
                    akVarA.cancel(true);
                    Thread.currentThread().interrupt();
                    jB = zzv.zzC().b() - jB2;
                    h80 h80Var = ((ja0) this.f3820u.f3937t).D;
                    if (h80Var != null) {
                        h80Var.b(z8, jB);
                    }
                    this.f3815o = z8;
                    sb = new StringBuilder("Cache connection took ");
                    r42 = z8;
                    sb.append(jB);
                    sb.append("ms");
                    zze.zza(sb.toString());
                    this.f3815o = false;
                    if (this.f3813m != null) {
                    }
                    return this.f3807f.c(os1Var);
                } catch (ExecutionException | TimeoutException unused2) {
                    z7 = true;
                    akVarA.cancel(true);
                    jB = zzv.zzC().b() - jB2;
                    h80 h80Var2 = ((ja0) this.f3820u.f3937t).D;
                    if (h80Var2 != null) {
                        h80Var2.b(z7, jB);
                    }
                    this.f3815o = z7;
                    sb = new StringBuilder("Cache connection took ");
                    r42 = z7;
                    sb.append(jB);
                    sb.append("ms");
                    zze.zza(sb.toString());
                    this.f3815o = false;
                    if (this.f3813m != null) {
                    }
                    return this.f3807f.c(os1Var);
                } catch (Throwable th3) {
                    th = th3;
                    long jB3 = zzv.zzC().b() - jB2;
                    h80 h80Var3 = ((ja0) this.f3820u.f3937t).D;
                    if (h80Var3 != null) {
                        h80Var3.b(z9, jB3);
                    }
                    this.f3815o = z9;
                    zze.zza("Cache connection took " + jB3 + "ms");
                    throw th;
                }
            } catch (InterruptedException unused3) {
                z8 = false;
            } catch (ExecutionException | TimeoutException unused4) {
                z7 = false;
            } catch (Throwable th4) {
                th = th4;
                z9 = false;
            }
            if (!n()) {
                this.f3810j = ikVar.f5791a;
                if (this.f3809i) {
                    m(os1Var);
                }
                long jB4 = zzv.zzC().b() - jB2;
                h80 h80Var4 = ((ja0) this.f3820u.f3937t).D;
                if (h80Var4 != null) {
                    h80Var4.b(true, jB4);
                }
                this.f3815o = true;
                zze.zza("Cache connection took " + jB4 + "ms");
                return -1L;
            }
            long jB5 = zzv.zzC().b() - jB2;
            h80 h80Var5 = ((ja0) this.f3820u.f3937t).D;
            if (h80Var5 != null) {
                h80Var5.b(true, jB5);
            }
            this.f3815o = true;
            sb = new StringBuilder("Cache connection took ");
            sb.append(jB5);
            sb.append("ms");
            zze.zza(sb.toString());
        }
        this.f3815o = false;
        if (this.f3813m != null) {
            Map map = os1Var.f7852b;
            long j7 = os1Var.f7853c;
            long j8 = os1Var.f7854d;
            int i6 = os1Var.f7855e;
            Uri uri = Uri.parse(this.f3813m.s);
            if (uri == null) {
                throw new IllegalStateException("The uri must be set.");
            }
            os1Var = new os1(uri, map, j7, j8, i6);
        }
        return this.f3807f.c(os1Var);
    }

    @Override // com.google.android.gms.internal.ads.gc2
    public final int j(int i6, int i7, byte[] bArr) throws IOException {
        if (!this.f3811k) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f3810j;
        int iJ = inputStream != null ? inputStream.read(bArr, i6, i7) : this.f3807f.j(i6, i7, bArr);
        if (this.f3809i && this.f3810j == null) {
            return iJ;
        }
        a(iJ);
        return iJ;
    }

    public final boolean n() {
        if (!this.f3809i) {
            return false;
        }
        if (!((Boolean) zzbe.zzc().a(zn.f11481t4)).booleanValue() || this.f3816p) {
            return ((Boolean) zzbe.zzc().a(zn.f11487u4)).booleanValue() && !this.f3817q;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Uri zzc() {
        return this.f3812l;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void zzd() throws IOException {
        if (!this.f3811k) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f3811k = false;
        this.f3812l = null;
        boolean z6 = (this.f3809i && this.f3810j == null) ? false : true;
        InputStream inputStream = this.f3810j;
        if (inputStream != null) {
            i3.f.a(inputStream);
            this.f3810j = null;
        } else {
            this.f3807f.zzd();
        }
        if (z6) {
            k();
        }
    }
}
