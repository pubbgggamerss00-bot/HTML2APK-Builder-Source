package hb;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.internal.location.zzaz;

/* loaded from: classes2.dex */
public final class b0 extends a.AbstractC0063a<zzaz, a.d.c> {
    @Override // com.google.android.gms.common.api.a.AbstractC0063a
    public final /* bridge */ /* synthetic */ a.f buildClient(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, a.d.c cVar, h.a aVar, h.b bVar) {
        return new zzaz(context, looper, aVar, bVar, "locationServices", dVar);
    }
}
