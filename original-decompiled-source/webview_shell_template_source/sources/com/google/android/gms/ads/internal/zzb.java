package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.a30;
import com.google.android.gms.internal.ads.r50;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final r50 zzc;
    private final a30 zzd = new a30(Collections.EMPTY_LIST, false);

    public zzb(Context context, r50 r50Var, a30 a30Var) {
        this.zza = context;
        this.zzc = r50Var;
    }

    private final boolean zzd() {
        r50 r50Var = this.zzc;
        return (r50Var != null && r50Var.zza().f7944x) || this.zzd.s;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            r50 r50Var = this.zzc;
            if (r50Var != null) {
                r50Var.a(str, null, 3);
                return;
            }
            a30 a30Var = this.zzd;
            if (!a30Var.s || (list = a30Var.f2559t) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.zza;
                    zzv.zzq();
                    zzs.zzM(context, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, strReplace);
                }
            }
        }
    }

    public final boolean zzc() {
        return !zzd() || this.zzb;
    }
}
