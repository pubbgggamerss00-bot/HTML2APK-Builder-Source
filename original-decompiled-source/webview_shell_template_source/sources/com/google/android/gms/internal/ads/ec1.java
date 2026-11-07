package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzfx;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ec1 {

    /* renamed from: a, reason: collision with root package name */
    public final zzga f4206a;

    /* renamed from: b, reason: collision with root package name */
    public final bw f4207b;

    /* renamed from: c, reason: collision with root package name */
    public final j41 f4208c;

    /* renamed from: d, reason: collision with root package name */
    public final zzm f4209d;

    /* renamed from: e, reason: collision with root package name */
    public final zzs f4210e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4211f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f4212g;
    public final ArrayList h;

    /* renamed from: i, reason: collision with root package name */
    public final oq f4213i;

    /* renamed from: j, reason: collision with root package name */
    public final zzy f4214j;

    /* renamed from: k, reason: collision with root package name */
    public final int f4215k;

    /* renamed from: l, reason: collision with root package name */
    public final AdManagerAdViewOptions f4216l;

    /* renamed from: m, reason: collision with root package name */
    public final PublisherAdViewOptions f4217m;

    /* renamed from: n, reason: collision with root package name */
    public final zzcm f4218n;

    /* renamed from: o, reason: collision with root package name */
    public final c6.h f4219o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f4220p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f4221q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4222r;
    public final Bundle s;

    /* renamed from: t, reason: collision with root package name */
    public final zzcq f4223t;

    public /* synthetic */ ec1(dc1 dc1Var) {
        this.f4210e = dc1Var.f3830b;
        this.f4211f = dc1Var.f3831c;
        this.f4223t = dc1Var.f3847u;
        zzm zzmVar = dc1Var.f3829a;
        int i6 = zzmVar.zza;
        long j6 = zzmVar.zzb;
        Bundle bundle = zzmVar.zzc;
        int i7 = zzmVar.zzd;
        List list = zzmVar.zze;
        boolean z6 = zzmVar.zzf;
        int i8 = zzmVar.zzg;
        boolean z7 = true;
        if (!zzmVar.zzh && !dc1Var.f3833e) {
            z7 = false;
        }
        boolean z8 = z7;
        String str = zzmVar.zzi;
        zzfx zzfxVar = zzmVar.zzj;
        Location location = zzmVar.zzk;
        String str2 = zzmVar.zzl;
        Bundle bundle2 = zzmVar.zzm;
        Bundle bundle3 = zzmVar.zzn;
        List list2 = zzmVar.zzo;
        String str3 = zzmVar.zzp;
        String str4 = zzmVar.zzq;
        boolean z9 = zzmVar.zzr;
        zzc zzcVar = zzmVar.zzs;
        int i9 = zzmVar.zzt;
        String str5 = zzmVar.zzu;
        List list3 = zzmVar.zzv;
        int iZza = com.google.android.gms.ads.internal.util.zzs.zza(zzmVar.zzw);
        zzm zzmVar2 = dc1Var.f3829a;
        this.f4209d = new zzm(i6, j6, bundle, i7, list, z6, i8, z8, str, zzfxVar, location, str2, bundle2, bundle3, list2, str3, str4, z9, zzcVar, i9, str5, list3, iZza, zzmVar2.zzx, zzmVar2.zzy, zzmVar2.zzz);
        zzga zzgaVar = dc1Var.f3832d;
        oq oqVar = null;
        if (zzgaVar == null) {
            oq oqVar2 = dc1Var.h;
            zzgaVar = oqVar2 != null ? oqVar2.f7842x : null;
        }
        this.f4206a = zzgaVar;
        ArrayList arrayList = dc1Var.f3834f;
        this.f4212g = arrayList;
        this.h = dc1Var.f3835g;
        if (arrayList != null && (oqVar = dc1Var.h) == null) {
            oqVar = new oq(new NativeAdOptions.Builder().build());
        }
        this.f4213i = oqVar;
        this.f4214j = dc1Var.f3836i;
        this.f4215k = dc1Var.f3840m;
        this.f4216l = dc1Var.f3837j;
        this.f4217m = dc1Var.f3838k;
        this.f4218n = dc1Var.f3839l;
        this.f4207b = dc1Var.f3841n;
        this.f4219o = new c6.h(dc1Var.f3842o);
        this.f4220p = dc1Var.f3843p;
        this.f4221q = dc1Var.f3844q;
        this.f4208c = dc1Var.f3845r;
        this.f4222r = dc1Var.s;
        this.s = dc1Var.f3846t;
    }

    public final ps a() {
        AdManagerAdViewOptions adManagerAdViewOptions = this.f4216l;
        PublisherAdViewOptions publisherAdViewOptions = this.f4217m;
        if (publisherAdViewOptions == null && adManagerAdViewOptions == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : adManagerAdViewOptions.zza();
    }
}
