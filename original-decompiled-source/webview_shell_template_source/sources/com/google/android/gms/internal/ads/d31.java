package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d31 implements jo0 {
    public final boolean A;
    public final oz0 B;
    public final zt0 C;
    public final cu0 D;
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final ct0 f3741t;

    /* renamed from: u, reason: collision with root package name */
    public final ec1 f3742u;

    /* renamed from: v, reason: collision with root package name */
    public final VersionInfoParcel f3743v;

    /* renamed from: w, reason: collision with root package name */
    public final tb1 f3744w;

    /* renamed from: x, reason: collision with root package name */
    public final o70 f3745x;

    /* renamed from: y, reason: collision with root package name */
    public final xa0 f3746y;

    /* renamed from: z, reason: collision with root package name */
    public final bu f3747z;

    public d31(Context context, ct0 ct0Var, ec1 ec1Var, VersionInfoParcel versionInfoParcel, tb1 tb1Var, o70 o70Var, xa0 xa0Var, bu buVar, boolean z6, oz0 oz0Var, zt0 zt0Var, cu0 cu0Var) {
        this.s = context;
        this.f3741t = ct0Var;
        this.f3742u = ec1Var;
        this.f3743v = versionInfoParcel;
        this.f3744w = tb1Var;
        this.f3745x = o70Var;
        this.f3746y = xa0Var;
        this.f3747z = buVar;
        this.A = z6;
        this.B = oz0Var;
        this.C = zt0Var;
        this.D = cu0Var;
    }

    @Override // com.google.android.gms.internal.ads.jo0
    public final void c(boolean z6, Context context, vk0 vk0Var) {
        float f6;
        ec1 ec1Var = this.f3742u;
        xa0 xa0VarA = this.f3746y;
        tb1 tb1Var = this.f3744w;
        bu buVar = this.f3747z;
        boolean z7 = this.A;
        ss0 ss0Var = (ss0) bs1.s(this.f3745x);
        try {
            if (xa0VarA.f0()) {
                if (((Boolean) zzbe.zzc().a(zn.X0)).booleanValue()) {
                    xa0VarA = this.f3741t.a(ec1Var.f4210e, null, null);
                    xa0VarA.Z("/reward", new nu(0, ss0Var.q()));
                    ht0 ht0Var = new ht0();
                    ss0Var.t().a(xa0VarA, true, z7 ? buVar : null, this.C.f11577c);
                    xa0VarA.zzN().f4196y = new xj0(ht0Var, xa0VarA);
                    xa0VarA.zzN().f4197z = new ck1(9, xa0VarA);
                    xb1 xb1Var = tb1Var.s;
                    xa0VarA.K(xb1Var.f10473b, xb1Var.f10472a);
                }
            }
            xa0 xa0Var = xa0VarA;
            xa0Var.Y(true);
            boolean z8 = false;
            boolean zA = z7 ? buVar.a(false) : false;
            zzv.zzq();
            boolean zZzJ = zzs.zzJ(this.s);
            if (z7) {
                synchronized (buVar) {
                    z8 = buVar.f3288b;
                }
            }
            boolean z9 = z8;
            if (z7) {
                synchronized (buVar) {
                    f6 = buVar.f3289c;
                }
            } else {
                f6 = 0.0f;
            }
            zzl zzlVar = new zzl(zA, zZzJ, z9, f6, -1, z6, tb1Var.O, tb1Var.P);
            if (vk0Var != null) {
                vk0Var.zzf();
            }
            zzv.zzj();
            fo0 fo0VarR = ss0Var.r();
            VersionInfoParcel versionInfoParcel = this.f3743v;
            int i6 = tb1Var.Q;
            String str = tb1Var.B;
            xb1 xb1Var2 = tb1Var.s;
            zzn.zza(context, new AdOverlayInfoParcel(null, fo0VarR, null, xa0Var, i6, versionInfoParcel, str, zzlVar, xb1Var2.f10473b, xb1Var2.f10472a, ec1Var.f4211f, vk0Var, tb1Var.b() ? this.B : null, xa0Var.zzr()), true, this.D);
        } catch (hb0 e6) {
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
        }
    }
}
