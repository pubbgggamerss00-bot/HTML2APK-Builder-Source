package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbk;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class oj0 implements yl0, tn0 {
    public n30 s;

    /* renamed from: u, reason: collision with root package name */
    public final Context f7784u;

    /* renamed from: v, reason: collision with root package name */
    public final ie1 f7785v;

    /* renamed from: w, reason: collision with root package name */
    public final VersionInfoParcel f7786w;

    /* renamed from: x, reason: collision with root package name */
    public final Executor f7787x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7788y = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7789z = false;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f7783t = new AtomicBoolean();

    public oj0(Context context, ie1 ie1Var, VersionInfoParcel versionInfoParcel, h70 h70Var) {
        this.f7784u = context;
        this.f7785v = ie1Var;
        this.f7786w = versionInfoParcel;
        this.f7787x = h70Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        n30 n30Var;
        int i6;
        int i7;
        lx lxVarA;
        if (!this.f7783t.getAndSet(true)) {
            if (((Boolean) rp.f8682j.c()).booleanValue()) {
                i6 = 2;
                i7 = i6 - 1;
                ie1 ie1Var = this.f7785v;
                Context context = this.f7784u;
                if (i7 != 1) {
                    lxVarA = zzv.zzg().a(context, VersionInfoParcel.forPackage(), ie1Var);
                } else if (i7 == 2) {
                    lxVarA = zzv.zzg().b(context, VersionInfoParcel.forPackage(), ie1Var);
                }
                fo foVar = kx.f6519b;
                this.s = new n30(context, lxVarA.a("google.afma.sdkConstants.getSdkConstants", foVar, foVar), this.f7786w);
                this.f7788y = true;
            } else {
                i6 = 3;
                if (!((Boolean) rp.f8683k.c()).booleanValue()) {
                    if (((Boolean) rp.f8681i.c()).booleanValue()) {
                        try {
                            String strOptString = new JSONObject(zzv.zzp().d().zzg().f10066e).optString("local_flag_write");
                            if (TextUtils.equals(strOptString, "client")) {
                                i6 = 2;
                            } else if (!TextUtils.equals(strOptString, "service")) {
                            }
                        } catch (JSONException unused) {
                        }
                    } else {
                        i6 = 1;
                    }
                }
                i7 = i6 - 1;
                ie1 ie1Var2 = this.f7785v;
                Context context2 = this.f7784u;
                if (i7 != 1) {
                }
                fo foVar2 = kx.f6519b;
                this.s = new n30(context2, lxVarA.a("google.afma.sdkConstants.getSdkConstants", foVar2, foVar2), this.f7786w);
                this.f7788y = true;
            }
        }
        if (this.f7788y && (n30Var = this.s) != null) {
            c5.a aVarQ = n30Var.q();
            if (!this.f7789z && ((Boolean) lp.f6813i.c()).booleanValue()) {
                aVarQ.addListener(new t(7, this), this.f7787x);
            }
            y5.g(aVarQ, "persistFlagsClient");
        }
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void k(r30 r30Var) {
        a();
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void zze(zzbk zzbkVar) {
        a();
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void zzf(String str) {
        a();
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void b0(ac1 ac1Var) {
    }
}
