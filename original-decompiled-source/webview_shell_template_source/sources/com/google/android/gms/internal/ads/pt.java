package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class pt implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8143b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8144c;

    public /* synthetic */ pt(int i6, Object obj, String str) {
        this.f8142a = i6;
        this.f8144c = obj;
        this.f8143b = str;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final c5.a zza(Object obj) {
        vf0 vf0Var;
        int i6 = this.f8142a;
        String str = this.f8143b;
        Object obj2 = this.f8144c;
        switch (i6) {
            case 0:
                String str2 = (String) obj;
                mt mtVar = xt.f10667a;
                return (((Boolean) zzbe.zzc().a(zn.T9)).booleanValue() && (vf0Var = (vf0) obj2) != null && vf0.b(str)) ? vf0Var.a(str2, zzbc.zze()) : bs1.m(str2);
            default:
                gr0 gr0Var = (gr0) obj2;
                gr0Var.getClass();
                zzv.zzA();
                xa0 xa0VarA = ib0.a(gr0Var.f5124a, new cc0(0, 0, 0), "native-omid", false, false, gr0Var.f5126c, null, gr0Var.f5127d, null, gr0Var.f5128e, gr0Var.f5129f, null, null, gr0Var.f5138p, gr0Var.f5139q);
                n70 n70Var = new n70(xa0VarA);
                xa0VarA.zzN().f4196y = new ck1(6, n70Var);
                if (((Boolean) zzbe.zzc().a(zn.f11413i5)).booleanValue()) {
                    xa0VarA.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
                } else {
                    xa0VarA.loadData(str, "text/html", "UTF-8");
                }
                return n70Var;
        }
    }
}
