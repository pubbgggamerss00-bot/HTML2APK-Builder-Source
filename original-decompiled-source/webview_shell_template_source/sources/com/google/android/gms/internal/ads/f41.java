package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f41 extends zzbt {
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final kd0 f4465t;

    /* renamed from: u, reason: collision with root package name */
    public final dc1 f4466u;

    /* renamed from: v, reason: collision with root package name */
    public final op0 f4467v;

    /* renamed from: w, reason: collision with root package name */
    public zzbl f4468w;

    public f41(kd0 kd0Var, Context context, String str) {
        dc1 dc1Var = new dc1();
        this.f4466u = dc1Var;
        this.f4467v = new op0();
        this.f4465t = kd0Var;
        dc1Var.f3831c = str;
        this.s = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbr zze() {
        op0 op0Var = this.f4467v;
        op0Var.getClass();
        pp0 pp0Var = new pp0(op0Var);
        ArrayList arrayList = new ArrayList();
        if (pp0Var.f8127c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (pp0Var.f8125a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (pp0Var.f8126b != null) {
            arrayList.add(Integer.toString(2));
        }
        w.g gVar = pp0Var.f8130f;
        if (!gVar.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (pp0Var.f8129e != null) {
            arrayList.add(Integer.toString(7));
        }
        dc1 dc1Var = this.f4466u;
        dc1Var.f3834f = arrayList;
        ArrayList arrayList2 = new ArrayList(gVar.f14850u);
        for (int i6 = 0; i6 < gVar.f14850u; i6++) {
            arrayList2.add((String) gVar.f(i6));
        }
        dc1Var.f3835g = arrayList2;
        if (dc1Var.f3830b == null) {
            dc1Var.f3830b = zzs.zzc();
        }
        return new g41(this.s, this.f4465t, this.f4466u, pp0Var, this.f4468w);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf(wr wrVar) {
        this.f4467v.f7831b = wrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(yr yrVar) {
        this.f4467v.f7830a = yrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzh(String str, fs fsVar, cs csVar) {
        op0 op0Var = this.f4467v;
        op0Var.f7835f.put(str, fsVar);
        if (csVar != null) {
            op0Var.f7836g.put(str, csVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(jw jwVar) {
        this.f4467v.f7834e = jwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(js jsVar, zzs zzsVar) {
        this.f4467v.f7833d = jsVar;
        this.f4466u.f3830b = zzsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk(ms msVar) {
        this.f4467v.f7832c = msVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl(zzbl zzblVar) {
        this.f4468w = zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        dc1 dc1Var = this.f4466u;
        dc1Var.f3837j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            dc1Var.f3833e = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(bw bwVar) {
        dc1 dc1Var = this.f4466u;
        dc1Var.f3841n = bwVar;
        dc1Var.f3832d = new zzga(false, true, false);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(oq oqVar) {
        this.f4466u.h = oqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        dc1 dc1Var = this.f4466u;
        dc1Var.f3838k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            dc1Var.f3833e = publisherAdViewOptions.zzc();
            dc1Var.f3839l = publisherAdViewOptions.zza();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(zzcq zzcqVar) {
        this.f4466u.f3847u = zzcqVar;
    }
}
