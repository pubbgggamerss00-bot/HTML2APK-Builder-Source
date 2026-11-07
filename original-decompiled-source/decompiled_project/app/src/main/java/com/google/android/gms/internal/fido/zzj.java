package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.d;

/* loaded from: classes2.dex */
public final class zzj extends a.AbstractC0063a {
    @Override // com.google.android.gms.common.api.a.AbstractC0063a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, d dVar, Object obj, h.a aVar, h.b bVar) {
        return new zzk(context, looper, dVar, aVar, bVar);
    }
}
