package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzv;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ee1 implements de1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4244a;

    /* renamed from: p, reason: collision with root package name */
    public final int f4258p;

    /* renamed from: b, reason: collision with root package name */
    public long f4245b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f4246c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4247d = false;

    /* renamed from: q, reason: collision with root package name */
    public int f4259q = 2;

    /* renamed from: r, reason: collision with root package name */
    public int f4260r = 2;

    /* renamed from: e, reason: collision with root package name */
    public int f4248e = 0;

    /* renamed from: f, reason: collision with root package name */
    public String f4249f = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* renamed from: g, reason: collision with root package name */
    public String f4250g = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public String h = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* renamed from: i, reason: collision with root package name */
    public String f4251i = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* renamed from: j, reason: collision with root package name */
    public ke1 f4252j = ke1.SCAR_REQUEST_TYPE_UNSPECIFIED;

    /* renamed from: k, reason: collision with root package name */
    public String f4253k = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* renamed from: l, reason: collision with root package name */
    public String f4254l = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* renamed from: m, reason: collision with root package name */
    public String f4255m = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4256n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4257o = false;

    public ee1(Context context, int i6) {
        this.f4244a = context;
        this.f4258p = i6;
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final de1 a(int i6) {
        synchronized (this) {
            this.f4259q = i6;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final de1 b(ke1 ke1Var) {
        synchronized (this) {
            this.f4252j = ke1Var;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final de1 c(zze zzeVar) {
        synchronized (this) {
            try {
                IBinder iBinder = zzeVar.zze;
                if (iBinder != null) {
                    mk0 mk0Var = (mk0) iBinder;
                    String str = mk0Var.f7175v;
                    if (!TextUtils.isEmpty(str)) {
                        this.f4249f = str;
                    }
                    String str2 = mk0Var.f7173t;
                    if (!TextUtils.isEmpty(str2)) {
                        this.f4250g = str2;
                    }
                }
            } finally {
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r2.f4250g = r0.f9174b0;
     */
    @Override // com.google.android.gms.internal.ads.de1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final de1 d(androidx.fragment.app.f0 f0Var) {
        synchronized (this) {
            try {
                if (!TextUtils.isEmpty(((vb1) f0Var.f1103u).f9774b)) {
                    this.f4249f = ((vb1) f0Var.f1103u).f9774b;
                }
                Iterator it = ((List) f0Var.s).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    tb1 tb1Var = (tb1) it.next();
                    if (!TextUtils.isEmpty(tb1Var.f9174b0)) {
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final de1 e(String str) {
        synchronized (this) {
            if (((Boolean) zzbe.zzc().a(zn.I8)).booleanValue()) {
                this.f4255m = str;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final de1 f(String str) {
        synchronized (this) {
            this.h = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final de1 g(Throwable th) {
        synchronized (this) {
            if (((Boolean) zzbe.zzc().a(zn.I8)).booleanValue()) {
                String strZzg = zzf.zzg(t20.f(th));
                if (strZzg == null) {
                    strZzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                this.f4254l = strZzg;
                String strF = t20.f(th);
                cm1 cm1VarA = cm1.a(new ml1('\n'));
                strF.getClass();
                this.f4253k = (String) ((am1) cm1VarA.f3618a.i(cm1VarA, strF)).next();
            }
        }
        return this;
    }

    public final synchronized void h() {
        Configuration configuration;
        this.f4248e = zzv.zzr().zzm(this.f4244a);
        Resources resources = this.f4244a.getResources();
        int i6 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i6 = configuration.orientation == 2 ? 4 : 3;
        }
        this.f4260r = i6;
        this.f4245b = zzv.zzC().b();
        this.f4257o = true;
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final de1 s(boolean z6) {
        synchronized (this) {
            this.f4247d = z6;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final de1 zze(String str) {
        synchronized (this) {
            this.f4251i = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final /* bridge */ /* synthetic */ de1 zzi() {
        h();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final de1 zzj() {
        synchronized (this) {
            this.f4246c = zzv.zzC().b();
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final synchronized boolean zzk() {
        return this.f4257o;
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.h);
    }

    @Override // com.google.android.gms.internal.ads.de1
    public final synchronized fe1 zzm() {
        try {
            if (this.f4256n) {
                return null;
            }
            this.f4256n = true;
            if (!this.f4257o) {
                h();
            }
            if (this.f4246c < 0) {
                synchronized (this) {
                    this.f4246c = zzv.zzC().b();
                }
            }
            return new fe1(this);
        } catch (Throwable th) {
            throw th;
        }
    }
}
