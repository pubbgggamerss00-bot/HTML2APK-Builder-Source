package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0031b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0031b c0031b = new DynamiteModule.b.C0031b();
        int iA = aVar.a(context, str, true);
        c0031b.f2522b = iA;
        if (iA != 0) {
            c0031b.f2523c = 1;
            return c0031b;
        }
        int iB = aVar.b(context, str);
        c0031b.f2521a = iB;
        if (iB != 0) {
            c0031b.f2523c = -1;
        }
        return c0031b;
    }
}
