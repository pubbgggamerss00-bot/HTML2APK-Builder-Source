package com.google.android.gms.internal.p001authapiphone;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.internal.d;

/* loaded from: classes2.dex */
final class zzt extends a.AbstractC0063a {
    @Override // com.google.android.gms.common.api.a.AbstractC0063a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, d dVar, Object obj, f fVar, n nVar) {
        return new zzw(context, looper, dVar, fVar, nVar);
    }
}
