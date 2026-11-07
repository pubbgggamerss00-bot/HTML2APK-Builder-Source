package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class hu0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5483a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5484b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f5485c;

    /* renamed from: d, reason: collision with root package name */
    public final zzu f5486d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5487e;

    /* renamed from: f, reason: collision with root package name */
    public final CsiUrlBuilder f5488f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5489g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f5490i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f5491j;

    public hu0(Executor executor, zzu zzuVar, CsiUrlBuilder csiUrlBuilder, Context context) {
        fq fqVar = (fq) hq.f5455a.get();
        if (fqVar != null) {
            fqVar.a("gads:sdk_csi_server", "https://csi.gstatic.com/csi");
        } else if (hq.a() != null) {
            hq.a().zza();
        }
        this.f5483a = new HashMap();
        this.f5490i = new AtomicBoolean();
        this.f5491j = new AtomicReference(new Bundle());
        this.f5485c = executor;
        this.f5486d = zzuVar;
        this.f5487e = ((Boolean) zzbe.zzc().a(zn.f11391f2)).booleanValue();
        this.f5488f = csiUrlBuilder;
        this.f5489g = ((Boolean) zzbe.zzc().a(zn.f11410i2)).booleanValue();
        this.h = ((Boolean) zzbe.zzc().a(zn.N6)).booleanValue();
        this.f5484b = context;
    }

    public final void a(Map map) {
        if (map == null || map.isEmpty()) {
            zzo.zze("Empty or null paramMap.");
            return;
        }
        boolean andSet = this.f5490i.getAndSet(true);
        AtomicReference atomicReference = this.f5491j;
        if (!andSet) {
            final String str = (String) zzbe.zzc().a(zn.sa);
            atomicReference.set(zzad.zza(this.f5484b, str, new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.gu0
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                    hu0 hu0Var = this.f5164a;
                    hu0Var.f5491j.set(zzad.zzb(hu0Var.f5484b, str));
                }
            }));
        }
        Bundle bundle = (Bundle) atomicReference.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    public final void b(Map map, boolean z6) {
        if (map.isEmpty()) {
            zzo.zze("Empty paramMap.");
            return;
        }
        a(map);
        String strGenerateUrl = this.f5488f.generateUrl(map);
        zze.zza(strGenerateUrl);
        boolean z7 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.f5487e) {
            if (!z6 || this.f5489g) {
                if (!z7 || this.h) {
                    this.f5485c.execute(new as1(6, this, strGenerateUrl));
                }
            }
        }
    }
}
