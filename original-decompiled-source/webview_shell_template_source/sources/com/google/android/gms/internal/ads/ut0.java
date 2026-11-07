package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ut0 implements fm0, zza, al0, sk0 {
    public final boolean A = ((Boolean) zzbe.zzc().a(zn.F6)).booleanValue();
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final oc1 f9624t;

    /* renamed from: u, reason: collision with root package name */
    public final cu0 f9625u;

    /* renamed from: v, reason: collision with root package name */
    public final ac1 f9626v;

    /* renamed from: w, reason: collision with root package name */
    public final tb1 f9627w;

    /* renamed from: x, reason: collision with root package name */
    public final dz0 f9628x;

    /* renamed from: y, reason: collision with root package name */
    public final String f9629y;

    /* renamed from: z, reason: collision with root package name */
    public Boolean f9630z;

    public ut0(Context context, oc1 oc1Var, cu0 cu0Var, ac1 ac1Var, tb1 tb1Var, dz0 dz0Var, String str) {
        this.s = context;
        this.f9624t = oc1Var;
        this.f9625u = cu0Var;
        this.f9626v = ac1Var;
        this.f9627w = tb1Var;
        this.f9628x = dz0Var;
        this.f9629y = str;
    }

    public final bu0 a(String str) {
        ac1 ac1Var = this.f9626v;
        v31 v31Var = ac1Var.f2647a;
        androidx.fragment.app.f0 f0Var = ac1Var.f2648b;
        bu0 bu0VarA = this.f9625u.a();
        bu0VarA.a("gqi", ((vb1) f0Var.f1103u).f9774b);
        tb1 tb1Var = this.f9627w;
        bu0VarA.b(tb1Var);
        bu0VarA.a("action", str);
        bu0VarA.a("ad_format", this.f9629y.toUpperCase(Locale.ROOT));
        List list = tb1Var.f9206t;
        if (!list.isEmpty()) {
            bu0VarA.a("ancn", (String) list.get(0));
        }
        if (tb1Var.b()) {
            bu0VarA.a("device_connectivity", true != zzv.zzp().a(this.s) ? "offline" : "online");
            bu0VarA.a("event_timestamp", String.valueOf(zzv.zzC().a()));
            bu0VarA.a("offline_ad", "1");
        }
        if (((Boolean) zzbe.zzc().a(zn.M6)).booleanValue()) {
            boolean z6 = zzaa.zzf((ec1) v31Var.f9702t) != 1;
            bu0VarA.a("scar", String.valueOf(z6));
            if (z6) {
                zzm zzmVar = ((ec1) v31Var.f9702t).f4209d;
                bu0VarA.a("ragent", zzmVar.zzp);
                bu0VarA.a("rtype", zzaa.zzb(zzaa.zzc(zzmVar)));
            }
        }
        return bu0VarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // com.google.android.gms.internal.ads.sk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(zze zzeVar) {
        String strGroup;
        zze zzeVar2;
        if (this.A) {
            bu0 bu0VarA = a("ifts");
            bu0VarA.a("reason", "adapter");
            int i6 = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zze zzeVar3 = zzeVar.zzd;
                i6 = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i6 >= 0) {
                bu0VarA.a("arec", String.valueOf(i6));
            }
            Pattern pattern = this.f9624t.f7704a;
            if (pattern == null || str == null) {
                strGroup = null;
            } else {
                Matcher matcher = pattern.matcher(str);
                if (matcher.find()) {
                    strGroup = matcher.group();
                }
            }
            if (strGroup != null) {
                bu0VarA.a("areec", strGroup);
            }
            bu0VarA.c();
        }
    }

    public final void e(bu0 bu0Var) {
        if (!this.f9627w.b()) {
            bu0Var.c();
            return;
        }
        fu0 fu0Var = bu0Var.f3292b.f3661a;
        fz0 fz0Var = new fz0(zzv.zzC().a(), ((vb1) this.f9626v.f2648b.f1103u).f9774b, fu0Var.f5488f.generateUrl(bu0Var.f3291a), 2);
        dz0 dz0Var = this.f9628x;
        dz0Var.getClass();
        dz0Var.b(new ni0(13, dz0Var, fz0Var));
    }

    public final boolean f() {
        String strZzq;
        if (this.f9630z == null) {
            synchronized (this) {
                if (this.f9630z == null) {
                    String str = (String) zzbe.zzc().a(zn.B1);
                    zzv.zzq();
                    try {
                        strZzq = zzs.zzq(this.s);
                    } catch (RemoteException unused) {
                        strZzq = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strZzq != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzq);
                        } catch (RuntimeException e6) {
                            zzv.zzp().h("CsiActionsListener.isPatternMatched", e6);
                        }
                    }
                    this.f9630z = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.f9630z.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.f9627w.b()) {
            e(a("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.sk0
    public final void v(io0 io0Var) {
        if (this.A) {
            bu0 bu0VarA = a("ifts");
            bu0VarA.a("reason", "exception");
            if (!TextUtils.isEmpty(io0Var.getMessage())) {
                bu0VarA.a("msg", io0Var.getMessage());
            }
            bu0VarA.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.sk0
    public final void zzb() {
        if (this.A) {
            bu0 bu0VarA = a("ifts");
            bu0VarA.a("reason", "blocked");
            bu0VarA.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void zzi() {
        if (f()) {
            a("adapter_shown").c();
        }
    }

    @Override // com.google.android.gms.internal.ads.fm0
    public final void zzj() {
        if (f()) {
            a("adapter_impression").c();
        }
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final void zzr() {
        if (f() || this.f9627w.b()) {
            e(a("impression"));
        }
    }
}
