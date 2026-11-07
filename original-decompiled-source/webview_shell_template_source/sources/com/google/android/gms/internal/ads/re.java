package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class re implements PackageManager$OnChecksumsReadyListener {

    /* renamed from: a, reason: collision with root package name */
    public final ps1 f8617a = new ps1();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.f8617a.e(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            return;
        }
        try {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                ApkChecksum apkChecksumD = pe.d(list.get(i6));
                if (apkChecksumD.getType() == 8) {
                    ps1 ps1Var = this.f8617a;
                    aq1 aq1VarG = aq1.f2828a.g();
                    byte[] value = apkChecksumD.getValue();
                    ps1Var.e(aq1VarG.d(value.length, value));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.f8617a.e(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }
}
