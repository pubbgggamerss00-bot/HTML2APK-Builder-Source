package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzah;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import com.google.android.gms.internal.ads.b7;
import com.google.android.gms.internal.ads.bd0;
import com.google.android.gms.internal.ads.c40;
import com.google.android.gms.internal.ads.cu0;
import com.google.android.gms.internal.ads.da1;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.dw0;
import com.google.android.gms.internal.ads.f0;
import com.google.android.gms.internal.ads.f41;
import com.google.android.gms.internal.ads.fa1;
import com.google.android.gms.internal.ads.fe0;
import com.google.android.gms.internal.ads.ga1;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.h41;
import com.google.android.gms.internal.ads.hc0;
import com.google.android.gms.internal.ads.ia1;
import com.google.android.gms.internal.ads.ih1;
import com.google.android.gms.internal.ads.j41;
import com.google.android.gms.internal.ads.ja1;
import com.google.android.gms.internal.ads.jf1;
import com.google.android.gms.internal.ads.jr;
import com.google.android.gms.internal.ads.kd0;
import com.google.android.gms.internal.ads.ke0;
import com.google.android.gms.internal.ads.l60;
import com.google.android.gms.internal.ads.li0;
import com.google.android.gms.internal.ads.m41;
import com.google.android.gms.internal.ads.n10;
import com.google.android.gms.internal.ads.ob1;
import com.google.android.gms.internal.ads.oz0;
import com.google.android.gms.internal.ads.r40;
import com.google.android.gms.internal.ads.rb1;
import com.google.android.gms.internal.ads.rp0;
import com.google.android.gms.internal.ads.ru0;
import com.google.android.gms.internal.ads.td0;
import com.google.android.gms.internal.ads.tp0;
import com.google.android.gms.internal.ads.u10;
import com.google.android.gms.internal.ads.uu;
import com.google.android.gms.internal.ads.w92;
import com.google.android.gms.internal.ads.we0;
import com.google.android.gms.internal.ads.xu;
import com.google.android.gms.internal.ads.y5;
import com.google.android.gms.internal.ads.y92;
import java.util.HashMap;
import p2.g;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class ClientApi extends zzco {
    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbu zzb(k3.a aVar, String str, gy gyVar, int i6) {
        Context context = (Context) k3.b.i1(aVar);
        return new f41(hc0.d(context, gyVar, i6), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzc(k3.a aVar, zzs zzsVar, String str, gy gyVar, int i6) {
        Context context = (Context) k3.b.i1(aVar);
        kd0 kd0Var = hc0.d(context, gyVar, i6).f6333c;
        str.getClass();
        context.getClass();
        y92 y92VarA = y92.a(context);
        y92 y92VarA2 = y92.a(str);
        w92 w92Var = kd0Var.H0;
        int i7 = 7;
        li0 li0Var = new li0(y92VarA, w92Var, kd0Var.I0, i7);
        w92 w92VarB = w92.b(new we0(w92Var, i7));
        w92 w92Var2 = kd0Var.f6335d;
        y92 y92Var = kd0Var.C;
        bd0 bd0Var = kd0Var.f6348k;
        return (fa1) w92.b(new ga1(y92Var, y92VarA, y92VarA2, w92.b(new da1(y92VarA, w92Var2, y92Var, li0Var, w92VarB, bd0Var)), w92VarB, bd0Var, kd0Var.f6376z)).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzd(k3.a aVar, zzs zzsVar, String str, gy gyVar, int i6) {
        Context context = (Context) k3.b.i1(aVar);
        kd0 kd0Var = hc0.d(context, gyVar, i6).f6333c;
        context.getClass();
        zzsVar.getClass();
        str.getClass();
        y92 y92VarA = y92.a(context);
        y92 y92VarA2 = y92.a(zzsVar);
        w92 w92VarB = w92.b(new ke0(kd0Var.f6376z, 8));
        ia1 ia1Var = (ia1) w92.b(new ja1(y92VarA, kd0Var.f6335d, y92VarA2, kd0Var.C, w92VarB, w92.b(f0.f4438z), w92.b(y5.R))).zzb();
        j41 j41Var = (j41) w92VarB.zzb();
        VersionInfoParcel versionInfoParcel = kd0Var.f6331b.f6320a;
        ih1.j(versionInfoParcel);
        return new h41(context, zzsVar, str, ia1Var, j41Var, versionInfoParcel, (cu0) kd0Var.f6376z.zzb());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zze(k3.a aVar, zzs zzsVar, String str, gy gyVar, int i6) {
        Context context = (Context) k3.b.i1(aVar);
        g gVarS = hc0.d(context, gyVar, i6).S();
        context.getClass();
        gVarS.f14079t = context;
        zzsVar.getClass();
        gVarS.f14081v = zzsVar;
        str.getClass();
        gVarS.f14080u = str;
        return (m41) gVarS.d().f8611a.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzf(k3.a aVar, zzs zzsVar, String str, int i6) {
        return new zzu((Context) k3.b.i1(aVar), zzsVar, str, new VersionInfoParcel(244410000, i6, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzci zzg(k3.a aVar, gy gyVar, int i6) {
        return (jf1) hc0.d((Context) k3.b.i1(aVar), gyVar, i6).B.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzcz zzh(k3.a aVar, int i6) {
        return (fe0) hc0.d((Context) k3.b.i1(aVar), null, i6).A.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzdu zzi(k3.a aVar, gy gyVar, int i6) {
        return (dw0) hc0.d((Context) k3.b.i1(aVar), gyVar, i6).f6368v.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final dr zzj(k3.a aVar, k3.a aVar2) {
        return new tp0((FrameLayout) k3.b.i1(aVar), (FrameLayout) k3.b.i1(aVar2));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final jr zzk(k3.a aVar, k3.a aVar2, k3.a aVar3) {
        return new rp0((View) k3.b.i1(aVar), (HashMap) k3.b.i1(aVar2), (HashMap) k3.b.i1(aVar3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final xu zzl(k3.a aVar, gy gyVar, int i6, uu uuVar) {
        Context context = (Context) k3.b.i1(aVar);
        kd0 kd0Var = hc0.d(context, gyVar, i6).f6333c;
        context.getClass();
        uuVar.getClass();
        return (ru0) new td0(kd0Var, context, uuVar).f9235e.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final n10 zzm(k3.a aVar, gy gyVar, int i6) {
        return (oz0) hc0.d((Context) k3.b.i1(aVar), gyVar, i6).J.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final u10 zzn(k3.a aVar) {
        Activity activity = (Activity) k3.b.i1(aVar);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new zzw(activity);
        }
        int i6 = adOverlayInfoParcelZza.zzk;
        return i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? i6 != 5 ? new zzw(activity) : new zzaf(activity) : new zzab(activity, adOverlayInfoParcelZza) : new zzai(activity) : new zzah(activity) : new com.google.android.gms.ads.internal.overlay.zzv(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final c40 zzo(k3.a aVar, gy gyVar, int i6) {
        Context context = (Context) k3.b.i1(aVar);
        b7 b7VarT = hc0.d(context, gyVar, i6).T();
        context.getClass();
        b7VarT.f2944t = context;
        return (rb1) ((w92) b7VarT.a().s).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final r40 zzp(k3.a aVar, String str, gy gyVar, int i6) {
        Context context = (Context) k3.b.i1(aVar);
        b7 b7VarT = hc0.d(context, gyVar, i6).T();
        context.getClass();
        b7VarT.f2944t = context;
        b7VarT.f2945u = str;
        return (ob1) ((w92) b7VarT.a().f8494t).zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final l60 zzq(k3.a aVar, gy gyVar, int i6) {
        return (zzau) hc0.d((Context) k3.b.i1(aVar), gyVar, i6).M.zzb();
    }
}
