package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kf0 implements re0 {

    /* renamed from: a, reason: collision with root package name */
    public final CookieManager f6392a;

    public kf0(Context context) {
        this.f6392a = zzv.zzr().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.re0
    public final void a(HashMap map) {
        CookieManager cookieManager = this.f6392a;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) zzbe.zzc().a(zn.Y0), str);
            return;
        }
        String str2 = (String) zzbe.zzc().a(zn.Y0);
        String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List listB = cm1.a(new ml1(';')).b(cookie);
            for (int i6 = 0; i6 < listB.size(); i6++) {
                String str3 = (String) listB.get(i6);
                cm1 cm1VarA = cm1.a(new ml1('='));
                str3.getClass();
                am1 am1Var = (am1) cm1VarA.f3618a.i(cm1VarA, str3);
                if (!am1Var.hasNext()) {
                    throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
                }
                cookieManager.setCookie(str2, String.valueOf((String) am1Var.next()).concat(String.valueOf((String) zzbe.zzc().a(zn.K0))));
            }
        }
    }
}
