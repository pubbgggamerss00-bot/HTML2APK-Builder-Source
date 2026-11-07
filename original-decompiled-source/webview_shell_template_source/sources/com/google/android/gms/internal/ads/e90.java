package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e90 implements yt {
    public final /* synthetic */ int s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final Object f4170t;

    public e90(er0 er0Var) {
        this.f4170t = er0Var;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) {
        switch (this.s) {
            case 0:
                String str = (String) map.get("action");
                if (str != null) {
                    if (str.equals("src")) {
                        String str2 = (String) map.get("src");
                        if (str2 != null) {
                            ((er0) this.f4170t).accept(str2);
                            break;
                        } else {
                            zzo.zzj("src missing from video GMSG.");
                            break;
                        }
                    }
                } else {
                    zzo.zzj("Action missing from video GMSG.");
                    break;
                }
                break;
            default:
                yo0 yo0Var = (yo0) ((WeakReference) this.f4170t).get();
                if (yo0Var != null) {
                    nn0 nn0Var = yo0Var.f11042i;
                    if ("_ac".equals((String) map.get("eventName"))) {
                        yo0Var.h.onAdClicked();
                        if (((Boolean) zzbe.zzc().a(zn.Ea)).booleanValue()) {
                            nn0Var.O();
                            if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                                nn0Var.zzu();
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ e90(yo0 yo0Var) {
        this.f4170t = new WeakReference(yo0Var);
    }
}
