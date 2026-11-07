package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a90 implements lo1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2620a;

    /* renamed from: b, reason: collision with root package name */
    public final yw1 f2621b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2622c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2623d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2624e;

    /* renamed from: f, reason: collision with root package name */
    public InputStream f2625f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2626g;
    public Uri h;

    /* renamed from: i, reason: collision with root package name */
    public volatile xj f2627i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2628j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2629k = false;

    /* renamed from: l, reason: collision with root package name */
    public os1 f2630l;

    public a90(Context context, yw1 yw1Var, String str, int i6) {
        this.f2620a = context;
        this.f2621b = yw1Var;
        this.f2622c = str;
        this.f2623d = i6;
        new AtomicLong(-1L);
        this.f2624e = ((Boolean) zzbe.zzc().a(zn.Y1)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final long c(os1 os1Var) throws IOException {
        Long l4;
        if (this.f2626g) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f2626g = true;
        Uri uri = os1Var.f7851a;
        this.h = uri;
        this.f2630l = os1Var;
        this.f2627i = xj.l(uri);
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.f11464q4)).booleanValue();
        uj ujVarA = null;
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        if (!zBooleanValue) {
            if (this.f2627i != null) {
                this.f2627i.f10616z = os1Var.f7853c;
                xj xjVar = this.f2627i;
                String str2 = this.f2622c;
                if (str2 != null) {
                    str = str2;
                }
                xjVar.A = str;
                this.f2627i.B = this.f2623d;
                ujVarA = zzv.zzc().a(this.f2627i);
            }
            if (ujVarA != null && ujVarA.m()) {
                this.f2628j = ujVarA.o();
                this.f2629k = ujVarA.n();
                if (!k()) {
                    this.f2625f = ujVarA.l();
                    return -1L;
                }
            }
        } else if (this.f2627i != null) {
            this.f2627i.f10616z = os1Var.f7853c;
            xj xjVar2 = this.f2627i;
            String str3 = this.f2622c;
            if (str3 != null) {
                str = str3;
            }
            xjVar2.A = str;
            this.f2627i.B = this.f2623d;
            if (this.f2627i.f10615y) {
                l4 = (Long) zzbe.zzc().a(zn.s4);
            } else {
                l4 = (Long) zzbe.zzc().a(zn.f11471r4);
            }
            long jLongValue = l4.longValue();
            zzv.zzC().b();
            zzv.zzd();
            ak akVarA = hk.a(this.f2620a, this.f2627i);
            try {
                try {
                    try {
                        ik ikVar = (ik) akVarA.s.get(jLongValue, TimeUnit.MILLISECONDS);
                        ikVar.getClass();
                        this.f2628j = ikVar.f5793c;
                        this.f2629k = ikVar.f5795e;
                        if (!k()) {
                            this.f2625f = ikVar.f5791a;
                        }
                    } catch (ExecutionException | TimeoutException unused) {
                        akVarA.cancel(false);
                    }
                } catch (InterruptedException unused2) {
                    akVarA.cancel(false);
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable unused3) {
            }
            zzv.zzC().b();
            throw null;
        }
        if (this.f2627i != null) {
            Map map = os1Var.f7852b;
            long j6 = os1Var.f7853c;
            long j7 = os1Var.f7854d;
            int i6 = os1Var.f7855e;
            Uri uri2 = Uri.parse(this.f2627i.s);
            if (uri2 == null) {
                throw new IllegalStateException("The uri must be set.");
            }
            this.f2630l = new os1(uri2, map, j6, j7, i6);
        }
        return this.f2621b.c(this.f2630l);
    }

    @Override // com.google.android.gms.internal.ads.gc2
    public final int j(int i6, int i7, byte[] bArr) throws IOException {
        if (!this.f2626g) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f2625f;
        return inputStream != null ? inputStream.read(bArr, i6, i7) : this.f2621b.j(i6, i7, bArr);
    }

    public final boolean k() {
        if (!this.f2624e) {
            return false;
        }
        if (!((Boolean) zzbe.zzc().a(zn.f11481t4)).booleanValue() || this.f2628j) {
            return ((Boolean) zzbe.zzc().a(zn.f11487u4)).booleanValue() && !this.f2629k;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Uri zzc() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void zzd() throws IOException {
        if (!this.f2626g) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f2626g = false;
        this.h = null;
        InputStream inputStream = this.f2625f;
        if (inputStream == null) {
            this.f2621b.zzd();
        } else {
            i3.f.a(inputStream);
            this.f2625f = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void d(o52 o52Var) {
    }
}
