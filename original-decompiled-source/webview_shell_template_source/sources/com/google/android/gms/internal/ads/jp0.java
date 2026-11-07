package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jp0 {

    /* renamed from: a, reason: collision with root package name */
    public int f6123a;

    /* renamed from: b, reason: collision with root package name */
    public zzeb f6124b;

    /* renamed from: c, reason: collision with root package name */
    public sq f6125c;

    /* renamed from: d, reason: collision with root package name */
    public View f6126d;

    /* renamed from: e, reason: collision with root package name */
    public List f6127e;

    /* renamed from: g, reason: collision with root package name */
    public zzez f6129g;
    public Bundle h;

    /* renamed from: i, reason: collision with root package name */
    public xa0 f6130i;

    /* renamed from: j, reason: collision with root package name */
    public xa0 f6131j;

    /* renamed from: k, reason: collision with root package name */
    public xa0 f6132k;

    /* renamed from: l, reason: collision with root package name */
    public vz0 f6133l;

    /* renamed from: m, reason: collision with root package name */
    public c5.a f6134m;

    /* renamed from: n, reason: collision with root package name */
    public o70 f6135n;

    /* renamed from: o, reason: collision with root package name */
    public View f6136o;

    /* renamed from: p, reason: collision with root package name */
    public View f6137p;

    /* renamed from: q, reason: collision with root package name */
    public k3.a f6138q;

    /* renamed from: r, reason: collision with root package name */
    public double f6139r;
    public yq s;

    /* renamed from: t, reason: collision with root package name */
    public yq f6140t;

    /* renamed from: u, reason: collision with root package name */
    public String f6141u;

    /* renamed from: x, reason: collision with root package name */
    public float f6144x;

    /* renamed from: y, reason: collision with root package name */
    public String f6145y;

    /* renamed from: v, reason: collision with root package name */
    public final w.g f6142v = new w.g();

    /* renamed from: w, reason: collision with root package name */
    public final w.g f6143w = new w.g();

    /* renamed from: f, reason: collision with root package name */
    public List f6128f = Collections.EMPTY_LIST;

    public static jp0 e(ip0 ip0Var, sq sqVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, k3.a aVar, String str4, String str5, double d7, yq yqVar, String str6, float f6) {
        jp0 jp0Var = new jp0();
        jp0Var.f6123a = 6;
        jp0Var.f6124b = ip0Var;
        jp0Var.f6125c = sqVar;
        jp0Var.f6126d = view;
        jp0Var.d("headline", str);
        jp0Var.f6127e = list;
        jp0Var.d("body", str2);
        jp0Var.h = bundle;
        jp0Var.d("call_to_action", str3);
        jp0Var.f6136o = view2;
        jp0Var.f6138q = aVar;
        jp0Var.d("store", str4);
        jp0Var.d("price", str5);
        jp0Var.f6139r = d7;
        jp0Var.s = yqVar;
        jp0Var.d("advertiser", str6);
        synchronized (jp0Var) {
            jp0Var.f6144x = f6;
        }
        return jp0Var;
    }

    public static Object f(k3.a aVar) {
        if (aVar == null) {
            return null;
        }
        return k3.b.i1(aVar);
    }

    public static jp0 n(ty tyVar) {
        ip0 ip0Var;
        ty tyVar2;
        try {
            zzeb zzebVarZzj = tyVar.zzj();
            if (zzebVarZzj == null) {
                tyVar2 = tyVar;
                ip0Var = null;
            } else {
                tyVar2 = tyVar;
                ip0Var = new ip0(zzebVarZzj, tyVar2);
            }
            return e(ip0Var, tyVar2.zzk(), (View) f(tyVar2.zzm()), tyVar2.zzs(), tyVar2.zzv(), tyVar2.zzq(), tyVar2.zzi(), tyVar2.zzr(), (View) f(tyVar2.zzn()), tyVar2.zzo(), tyVar2.zzu(), tyVar2.zzt(), tyVar2.zze(), tyVar2.zzl(), tyVar2.zzp(), tyVar2.zzf());
        } catch (RemoteException e6) {
            zzo.zzk("Failed to get native ad assets from unified ad mapper", e6);
            return null;
        }
    }

    public final synchronized String a() {
        return this.f6141u;
    }

    public final synchronized String b() {
        return c("headline");
    }

    public final synchronized String c(String str) {
        return (String) this.f6143w.get(str);
    }

    public final synchronized void d(String str, String str2) {
        if (str2 == null) {
            this.f6143w.remove(str);
        } else {
            this.f6143w.put(str, str2);
        }
    }

    public final synchronized int g() {
        return this.f6123a;
    }

    public final synchronized Bundle h() {
        try {
            if (this.h == null) {
                this.h = new Bundle();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.h;
    }

    public final synchronized zzeb i() {
        return this.f6124b;
    }

    public final synchronized sq j() {
        return this.f6125c;
    }

    public final yq k() {
        List list = this.f6127e;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.f6127e.get(0);
        if (obj instanceof IBinder) {
            return mq.i1((IBinder) obj);
        }
        return null;
    }

    public final synchronized xa0 l() {
        return this.f6132k;
    }

    public final synchronized xa0 m() {
        return this.f6130i;
    }

    public final synchronized vz0 o() {
        return this.f6133l;
    }

    public final synchronized String p() {
        return c("advertiser");
    }

    public final synchronized String q() {
        return c("body");
    }

    public final synchronized String r() {
        return c("call_to_action");
    }
}
