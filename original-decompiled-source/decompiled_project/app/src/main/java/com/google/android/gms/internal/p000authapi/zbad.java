package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.common.internal.d;
import ga.t;

/* loaded from: classes2.dex */
final class zbad extends a.AbstractC0063a {
    @Override // com.google.android.gms.common.api.a.AbstractC0063a
    public final /* synthetic */ a.f buildClient(Context context, Looper looper, d dVar, Object obj, f fVar, n nVar) {
        return new zbh(context, looper, (t) obj, dVar, fVar, nVar);
    }
}
