package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.Executor;
import org.json.JSONException;
import p.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z01 implements yz0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11123a;

    /* renamed from: b, reason: collision with root package name */
    public final go0 f11124b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f11125c;

    /* renamed from: d, reason: collision with root package name */
    public final sb1 f11126d;

    /* renamed from: e, reason: collision with root package name */
    public final cu0 f11127e;

    public z01(Context context, Executor executor, go0 go0Var, sb1 sb1Var, cu0 cu0Var) {
        this.f11123a = context;
        this.f11124b = go0Var;
        this.f11125c = executor;
        this.f11126d = sb1Var;
        this.f11127e = cu0Var;
    }

    @Override // com.google.android.gms.internal.ads.yz0
    public final boolean a(ac1 ac1Var, tb1 tb1Var) throws JSONException {
        String string;
        Context context = this.f11123a;
        if (!(context instanceof Activity) || !xo.a(context)) {
            return false;
        }
        try {
            string = tb1Var.f9210v.getString("tab_url");
        } catch (Exception unused) {
            string = null;
        }
        return !TextUtils.isEmpty(string);
    }

    @Override // com.google.android.gms.internal.ads.yz0
    public final c5.a b(final ac1 ac1Var, final tb1 tb1Var) throws JSONException {
        String string;
        if (((Boolean) zzbe.zzc().a(zn.Tc)).booleanValue()) {
            bu0 bu0VarA = this.f11127e.a();
            bu0VarA.a("action", "cstm_tbs_rndr");
            bu0VarA.c();
        }
        try {
            string = tb1Var.f9210v.getString("tab_url");
        } catch (Exception unused) {
            string = null;
        }
        final Uri uri = string != null ? Uri.parse(string) : null;
        final vb1 vb1Var = (vb1) ac1Var.f2648b.f1103u;
        return bs1.p(ds1.f4001t, new pr1() { // from class: com.google.android.gms.internal.ads.y01
            @Override // com.google.android.gms.internal.ads.pr1
            public final c5.a zza(Object obj) {
                z01 z01Var = this.f10758a;
                Uri uri2 = uri;
                ac1 ac1Var2 = ac1Var;
                tb1 tb1Var2 = tb1Var;
                vb1 vb1Var2 = vb1Var;
                try {
                    Intent intent = new e.d().a().f14043a;
                    intent.setData(uri2);
                    zzc zzcVar = new zzc(intent, null);
                    o70 o70Var = new o70();
                    ud0 ud0VarA = z01Var.f11124b.a(new androidx.camera.view.b(ac1Var2, tb1Var2, null), new bo0(new s70(z01Var, o70Var), null));
                    o70Var.a(new AdOverlayInfoParcel(zzcVar, null, (rl0) ud0VarA.K.zzb(), null, new VersionInfoParcel(0, 0, false), null, null, vb1Var2.f9774b));
                    z01Var.f11126d.c(2, 3);
                    return bs1.m(ud0VarA.q());
                } catch (Throwable th) {
                    zzo.zzh("Error in CustomTabsAdRenderer", th);
                    throw th;
                }
            }
        }, this.f11125c);
    }
}
