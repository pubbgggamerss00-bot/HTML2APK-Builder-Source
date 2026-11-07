package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class iu0 {

    /* renamed from: e, reason: collision with root package name */
    public final String f5853e;

    /* renamed from: f, reason: collision with root package name */
    public final fu0 f5854f;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5850b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f5851c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5852d = false;

    /* renamed from: a, reason: collision with root package name */
    public final zzj f5849a = zzv.zzp().d();

    public iu0(String str, fu0 fu0Var) {
        this.f5853e = str;
        this.f5854f = fu0Var;
    }

    public final synchronized void a(String str, String str2) {
        if (((Boolean) zzbe.zzc().a(zn.f11403h2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_finished");
            mapE.put("ancn", str);
            mapE.put("rqe", str2);
            this.f5850b.add(mapE);
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) zzbe.zzc().a(zn.f11403h2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_started");
            mapE.put("ancn", str);
            this.f5850b.add(mapE);
        }
    }

    public final synchronized void c(String str) {
        if (((Boolean) zzbe.zzc().a(zn.f11403h2)).booleanValue()) {
            HashMap mapE = e();
            mapE.put("action", "adapter_init_finished");
            mapE.put("ancn", str);
            this.f5850b.add(mapE);
        }
    }

    public final synchronized void d() {
        if (((Boolean) zzbe.zzc().a(zn.f11403h2)).booleanValue() && !this.f5851c) {
            HashMap mapE = e();
            mapE.put("action", "init_started");
            this.f5850b.add(mapE);
            this.f5851c = true;
        }
    }

    public final HashMap e() {
        fu0 fu0Var = this.f5854f;
        fu0Var.getClass();
        HashMap map = new HashMap(fu0Var.f5483a);
        map.put("tms", Long.toString(zzv.zzC().b(), 10));
        map.put("tid", this.f5849a.zzN() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : this.f5853e);
        return map;
    }
}
