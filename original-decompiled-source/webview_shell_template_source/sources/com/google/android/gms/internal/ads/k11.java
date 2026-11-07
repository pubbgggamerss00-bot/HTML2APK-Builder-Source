package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k11 implements jo0 {
    public final oz0 A;
    public final cu0 B;
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final VersionInfoParcel f6214t;

    /* renamed from: u, reason: collision with root package name */
    public final o70 f6215u;

    /* renamed from: v, reason: collision with root package name */
    public final tb1 f6216v;

    /* renamed from: w, reason: collision with root package name */
    public final xa0 f6217w;

    /* renamed from: x, reason: collision with root package name */
    public final ec1 f6218x;

    /* renamed from: y, reason: collision with root package name */
    public final bu f6219y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f6220z;

    public k11(Context context, VersionInfoParcel versionInfoParcel, o70 o70Var, tb1 tb1Var, xa0 xa0Var, ec1 ec1Var, boolean z6, bu buVar, oz0 oz0Var, cu0 cu0Var) {
        this.s = context;
        this.f6214t = versionInfoParcel;
        this.f6215u = o70Var;
        this.f6216v = tb1Var;
        this.f6217w = xa0Var;
        this.f6218x = ec1Var;
        this.f6219y = buVar;
        this.f6220z = z6;
        this.A = oz0Var;
        this.B = cu0Var;
    }

    @Override // com.google.android.gms.internal.ads.jo0
    public final void c(boolean z6, Context context, vk0 vk0Var) {
        float f6;
        tb1 tb1Var = this.f6216v;
        bu buVar = this.f6219y;
        yn0 yn0Var = (yn0) bs1.s(this.f6215u);
        xa0 xa0Var = this.f6217w;
        xa0Var.Y(true);
        boolean z7 = this.f6220z;
        boolean z8 = false;
        boolean zA = z7 ? buVar.a(false) : false;
        zzv.zzq();
        boolean zZzJ = zzs.zzJ(this.s);
        if (z7) {
            synchronized (buVar) {
                z8 = buVar.f3288b;
            }
        }
        if (z7) {
            synchronized (buVar) {
                f6 = buVar.f3289c;
            }
        } else {
            f6 = 0.0f;
        }
        zzl zzlVar = new zzl(zA, zZzJ, z8, f6, -1, z6, tb1Var.O, false);
        if (vk0Var != null) {
            vk0Var.zzf();
        }
        zzv.zzj();
        fo0 fo0VarR = yn0Var.r();
        xa0 xa0Var2 = this.f6217w;
        VersionInfoParcel versionInfoParcel = this.f6214t;
        int i6 = tb1Var.Q;
        String str = tb1Var.B;
        xb1 xb1Var = tb1Var.s;
        zzn.zza(context, new AdOverlayInfoParcel(null, fo0VarR, null, xa0Var2, i6, versionInfoParcel, str, zzlVar, xb1Var.f10473b, xb1Var.f10472a, this.f6218x.f4211f, vk0Var, tb1Var.b() ? this.A : null, xa0Var.zzr()), true, this.B);
    }
}
