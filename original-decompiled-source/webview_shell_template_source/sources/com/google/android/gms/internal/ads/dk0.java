package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dk0 {

    /* renamed from: a, reason: collision with root package name */
    public final ae1 f3962a;

    /* renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f3963b;

    /* renamed from: c, reason: collision with root package name */
    public final ApplicationInfo f3964c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3965d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3966e;

    /* renamed from: f, reason: collision with root package name */
    public final PackageInfo f3967f;

    /* renamed from: g, reason: collision with root package name */
    public final u92 f3968g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public final t81 f3969i;

    /* renamed from: j, reason: collision with root package name */
    public final zzg f3970j;

    /* renamed from: k, reason: collision with root package name */
    public final ec1 f3971k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3972l;

    /* renamed from: m, reason: collision with root package name */
    public final mm0 f3973m;

    public dk0(ae1 ae1Var, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, u92 u92Var, zzj zzjVar, String str2, t81 t81Var, ec1 ec1Var, mm0 mm0Var, int i6) {
        this.f3962a = ae1Var;
        this.f3963b = versionInfoParcel;
        this.f3964c = applicationInfo;
        this.f3965d = str;
        this.f3966e = arrayList;
        this.f3967f = packageInfo;
        this.f3968g = u92Var;
        this.h = str2;
        this.f3969i = t81Var;
        this.f3970j = zzjVar;
        this.f3971k = ec1Var;
        this.f3973m = mm0Var;
        this.f3972l = i6;
    }

    public final vd1 a(Bundle bundle) {
        this.f3973m.zza();
        return new wd1(this.f3962a, yd1.f10926t, null, ae1.f2730d, Collections.EMPTY_LIST, this.f3969i.a(new ck0(new Bundle(), new Bundle()), bundle, this.f3972l == 2)).a();
    }

    public final vd1 b() {
        final Bundle bundle = new Bundle();
        if (((Boolean) zzbe.zzc().a(zn.f11424k2)).booleanValue()) {
            Bundle bundle2 = this.f3971k.s;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final vd1 vd1VarA = a(bundle);
        c5.a[] aVarArr = {vd1VarA, (c5.a) this.f3968g.zzb()};
        ae1 ae1Var = this.f3962a;
        ae1Var.getClass();
        List listAsList = Arrays.asList(aVarArr);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.bk0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ck0 ck0Var = (ck0) vd1VarA.f9834u.get();
                Bundle bundle3 = ck0Var.f3610a;
                dk0 dk0Var = this.f3210a;
                String str = (String) ((c5.a) dk0Var.f3968g.zzb()).get();
                boolean z6 = false;
                if (((Boolean) zzbe.zzc().a(zn.Q6)).booleanValue() && dk0Var.f3970j.zzN()) {
                    z6 = true;
                }
                boolean z7 = z6;
                String str2 = dk0Var.h;
                PackageInfo packageInfo = dk0Var.f3967f;
                ArrayList arrayList = dk0Var.f3966e;
                String str3 = dk0Var.f3965d;
                ApplicationInfo applicationInfo = dk0Var.f3964c;
                VersionInfoParcel versionInfoParcel = dk0Var.f3963b;
                ec1 ec1Var = dk0Var.f3971k;
                return new r30(bundle3, versionInfoParcel, applicationInfo, str3, arrayList, packageInfo, str, str2, null, null, z7, ec1Var.f4211f.matches((String) zzbe.zzc().a(zn.f11444n3)), bundle, ck0Var.f3611b);
            }
        };
        zn1 zn1Var = bo1.f3236t;
        listAsList.getClass();
        bo1 bo1VarL = bo1.l(listAsList);
        o61 o61Var = new o61(1);
        h70 h70Var = i70.f5592g;
        tr1 tr1Var = new tr1(bo1VarL, true, false);
        tr1Var.H = new sr1(tr1Var, o61Var, h70Var);
        tr1Var.u();
        hs1 hs1Var = ae1Var.f2731a;
        tr1 tr1Var2 = new tr1(bo1VarL, true, false);
        tr1Var2.H = new sr1(tr1Var2, callable, hs1Var);
        tr1Var2.u();
        return new wd1(ae1Var, yd1.f10927u, null, tr1Var, listAsList, tr1Var2).a();
    }
}
