package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzdl;
import com.google.android.gms.ads.internal.client.zzfv;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fe0 extends zzcy {
    public final sv0 A;
    public final iq B;
    public final ie1 C;
    public final pc1 D;
    public final oj0 E;
    public final cu0 F;
    public boolean G = false;
    public final Long H = Long.valueOf(zzv.zzC().b());
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final VersionInfoParcel f4620t;

    /* renamed from: u, reason: collision with root package name */
    public final mt0 f4621u;

    /* renamed from: v, reason: collision with root package name */
    public final a01 f4622v;

    /* renamed from: w, reason: collision with root package name */
    public final a41 f4623w;

    /* renamed from: x, reason: collision with root package name */
    public final fv0 f4624x;

    /* renamed from: y, reason: collision with root package name */
    public final b60 f4625y;

    /* renamed from: z, reason: collision with root package name */
    public final nt0 f4626z;

    public fe0(Context context, VersionInfoParcel versionInfoParcel, mt0 mt0Var, a01 a01Var, a41 a41Var, fv0 fv0Var, b60 b60Var, nt0 nt0Var, sv0 sv0Var, iq iqVar, ie1 ie1Var, pc1 pc1Var, oj0 oj0Var, cu0 cu0Var) {
        this.s = context;
        this.f4620t = versionInfoParcel;
        this.f4621u = mt0Var;
        this.f4622v = a01Var;
        this.f4623w = a41Var;
        this.f4624x = fv0Var;
        this.f4625y = b60Var;
        this.f4626z = nt0Var;
        this.A = sv0Var;
        this.B = iqVar;
        this.C = ie1Var;
        this.D = pc1Var;
        this.E = oj0Var;
        this.F = cu0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized float zze() {
        return zzv.zzs().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final String zzf() {
        return this.f4620t.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final List zzg() {
        return this.f4624x.a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(String str) {
        this.f4623w.b(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() {
        this.f4624x.f4802q = false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean z6) throws IOException, RemoteException {
        Context context = this.s;
        try {
            xj1.d(context).m(z6);
            if (z6) {
                return;
            }
            try {
                if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e6) {
                zzv.zzp().h("clearStorageOnGpidPubDisable_scar", e6);
            }
        } catch (IOException e7) {
            throw new RemoteException(e7.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzk() {
        if (this.G) {
            zzo.zzj("Mobile ads is initialized already.");
            return;
        }
        zn.a(this.s);
        zzv.zzp().f(this.s, this.f4620t);
        this.E.a();
        zzv.zzc().c(this.s);
        this.G = true;
        this.f4624x.b();
        a41 a41Var = this.f4623w;
        a41Var.getClass();
        zzv.zzp().d().zzo(new yh(11, a41Var));
        a41Var.f2566f.execute(new x(15, a41Var));
        if (((Boolean) zzbe.zzc().a(zn.f11378d4)).booleanValue()) {
            nt0 nt0Var = this.f4626z;
            if (!nt0Var.f7509f.getAndSet(true)) {
                zzv.zzp().d().zzo(new b(14, nt0Var));
            }
            nt0Var.f7506c.execute(new u(7, nt0Var));
        }
        this.A.c();
        if (((Boolean) zzbe.zzc().a(zn.c9)).booleanValue()) {
            i70.f5586a.execute(new u(6, this));
        }
        if (((Boolean) zzbe.zzc().a(zn.Oa)).booleanValue()) {
            i70.f5586a.execute(new cf(4, this));
        }
        if (((Boolean) zzbe.zzc().a(zn.f11361b3)).booleanValue()) {
            i70.f5586a.execute(new b(11, this));
        }
        if (((Boolean) zzbe.zzc().a(zn.G4)).booleanValue()) {
            if (((Boolean) zzbe.zzc().a(zn.H4)).booleanValue()) {
                i70.f5586a.execute(new p(7, this));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(String str, k3.a aVar) throws JSONException {
        String strZzq;
        ni niVar;
        Context context = this.s;
        zn.a(context);
        if (((Boolean) zzbe.zzc().a(zn.f11412i4)).booleanValue()) {
            try {
                zzv.zzq();
                strZzq = zzs.zzq(context);
            } catch (RemoteException | RuntimeException e6) {
                zzv.zzp().h("NonagonMobileAdsSettingManager_AppId", e6);
            }
        } else {
            strZzq = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        boolean z6 = true;
        String str2 = true == TextUtils.isEmpty(strZzq) ? str : strZzq;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.f11362b4)).booleanValue();
        nn nnVar = zn.f11351a1;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) zzbe.zzc().a(nnVar)).booleanValue();
        if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
            niVar = new ni(this, (Runnable) k3.b.i1(aVar), 2, false);
        } else {
            niVar = null;
            z6 = zBooleanValue2;
        }
        ni niVar2 = niVar;
        if (z6) {
            zzv.zza().zza(this.s, this.f4620t, str2, niVar2, this.C, this.F, this.H);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(zzdl zzdlVar) {
        this.A.d(zzdlVar, rv0.f8711t);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(k3.a aVar, String str) {
        if (aVar == null) {
            zzo.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) k3.b.i1(aVar);
        if (context == null) {
            zzo.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        zzau zzauVar = new zzau(context);
        zzauVar.zzn(str);
        zzauVar.zzo(this.f4620t.afmaVersion);
        zzauVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(gy gyVar) {
        this.D.b(gyVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzp(boolean z6) {
        zzv.zzs().zzc(z6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzq(float f6) {
        zzv.zzs().zzd(f6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzr(String str) {
        zn.a(this.s);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzbe.zzc().a(zn.f11362b4)).booleanValue()) {
                zzv.zza().zza(this.s, this.f4620t, str, null, this.C, null, null);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(xv xvVar) {
        fv0 fv0Var = this.f4624x;
        fv0Var.getClass();
        fv0Var.f4791e.s.addListener(new o30(2, fv0Var, xvVar), fv0Var.f4795j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(String str) {
        if (((Boolean) zzbe.zzc().a(zn.n9)).booleanValue()) {
            zzv.zzp().f2952g = str;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(zzfv zzfvVar) {
        b60 b60Var = this.f4625y;
        Context context = this.s;
        b60Var.getClass();
        y50 y50VarB = y50.b(context);
        ((u50) ((w92) y50VarB.f10861u).zzb()).a(-1, ((i3.a) y50VarB.s).a());
        if (((Boolean) zzbe.zzc().a(zn.A0)).booleanValue() && b60Var.e(context) && b60.g(context)) {
            synchronized (b60Var.f2942i) {
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized boolean zzv() {
        return zzv.zzs().zze();
    }
}
