package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
public final class b implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0066b a(Context context, DynamiteModule.b.a aVar) throws DynamiteModule.a {
        int iB;
        DynamiteModule.b.C0066b c0066b = new DynamiteModule.b.C0066b();
        c0066b.f6228a = 0;
        c0066b.f6229b = 0;
        c0066b.f6230c = 0;
        int iA = aVar.a(context);
        c0066b.f6228a = iA;
        int i10 = 1;
        int i11 = 0;
        if (iA != 0) {
            iB = aVar.b(context, false);
            c0066b.f6229b = iB;
        } else {
            iB = aVar.b(context, true);
            c0066b.f6229b = iB;
        }
        int i12 = c0066b.f6228a;
        if (i12 == 0) {
            if (iB == 0) {
                i10 = 0;
            }
            c0066b.f6230c = i10;
            return c0066b;
        }
        i11 = i12;
        if (i11 >= iB) {
            i10 = -1;
        }
        c0066b.f6230c = i10;
        return c0066b;
    }
}
