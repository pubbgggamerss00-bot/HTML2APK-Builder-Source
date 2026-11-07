package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j20 extends e20 {
    public final /* synthetic */ UpdateClickUrlCallback s;

    public j20(UpdateClickUrlCallback updateClickUrlCallback) {
        this.s = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.f20
    public final void W(List list) {
        this.s.onSuccess((Uri) list.get(0));
    }

    @Override // com.google.android.gms.internal.ads.f20
    public final void zze(String str) {
        this.s.onFailure(str);
    }
}
