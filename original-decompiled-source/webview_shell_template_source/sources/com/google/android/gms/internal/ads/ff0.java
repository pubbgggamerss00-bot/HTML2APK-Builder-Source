package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ff0 implements re0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4641a;

    /* renamed from: b, reason: collision with root package name */
    public final zzj f4642b = zzv.zzp().d();

    public ff0(Context context) {
        this.f4641a = context;
    }

    @Override // com.google.android.gms.internal.ads.re0
    public final void a(HashMap map) throws IOException {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        boolean z6 = Boolean.parseBoolean(str);
        this.f4642b.zzD(z6);
        if (z6) {
            zzad.zzc(this.f4641a);
        }
    }
}
