package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c implements DynamiteModule.b {
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DynamiteModule.b.C0031b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0031b c0031b = new DynamiteModule.b.C0031b();
        c0031b.f2521a = aVar.b(context, str);
        int i6 = 1;
        int iA = aVar.a(context, str, true);
        c0031b.f2522b = iA;
        int i7 = c0031b.f2521a;
        if (i7 == 0) {
            i7 = 0;
            if (iA == 0) {
                i6 = 0;
            } else if (i7 >= iA) {
                i6 = -1;
            }
        }
        c0031b.f2523c = i6;
        return c0031b;
    }
}
