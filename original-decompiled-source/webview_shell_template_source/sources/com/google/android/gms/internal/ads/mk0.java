package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.zzv;
import java.util.List;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mk0 extends zzdx {
    public final Bundle A;
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final String f7173t;

    /* renamed from: u, reason: collision with root package name */
    public final String f7174u;

    /* renamed from: v, reason: collision with root package name */
    public final String f7175v;

    /* renamed from: w, reason: collision with root package name */
    public final List f7176w;

    /* renamed from: x, reason: collision with root package name */
    public final long f7177x;

    /* renamed from: y, reason: collision with root package name */
    public final String f7178y;

    /* renamed from: z, reason: collision with root package name */
    public final e01 f7179z;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mk0(tb1 tb1Var, String str, e01 e01Var, vb1 vb1Var, String str2) throws JSONException {
        String str3;
        String string = null;
        this.f7173t = tb1Var == null ? null : tb1Var.f9174b0;
        this.f7174u = str2;
        this.f7175v = vb1Var == null ? null : vb1Var.f9774b;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && tb1Var != null) {
            try {
                string = tb1Var.f9210v.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.s = string != null ? string : str;
        this.f7176w = e01Var.f4067a;
        this.f7179z = e01Var;
        this.f7177x = zzv.zzC().a() / 1000;
        if (!((Boolean) zzbe.zzc().a(zn.E6)).booleanValue() || vb1Var == null) {
            this.A = new Bundle();
        } else {
            this.A = vb1Var.f9782k;
        }
        if (!((Boolean) zzbe.zzc().a(zn.e9)).booleanValue() || vb1Var == null) {
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else {
            str3 = vb1Var.f9780i;
            if (TextUtils.isEmpty(str3)) {
            }
        }
        this.f7178y = str3;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final Bundle zze() {
        return this.A;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final zzw zzf() {
        e01 e01Var = this.f7179z;
        if (e01Var != null) {
            return e01Var.f4072f;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzg() {
        return this.s;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzh() {
        return this.f7174u;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzi() {
        return this.f7173t;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final List zzj() {
        return this.f7176w;
    }
}
