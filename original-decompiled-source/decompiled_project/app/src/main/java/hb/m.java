package hb;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.internal.location.zzaz;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class m extends a.AbstractC0063a<zzaz, a.d.c> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.a.AbstractC0063a
    public final a.f buildClient(Context context, Looper looper, com.google.android.gms.common.internal.d dVar, a.d.c cVar, h.a aVar, h.b bVar) {
        HashSet hashSet = new HashSet();
        new HashSet();
        p.a aVar2 = new p.a();
        p.a aVar3 = new p.a();
        Object obj = pa.d.f21386c;
        jb.b bVar2 = jb.e.f15676a;
        new ArrayList();
        new ArrayList();
        context.getMainLooper();
        String packageName = context.getPackageName();
        String name = context.getClass().getName();
        com.google.android.gms.common.api.a aVar4 = jb.e.f15677b;
        return new zzaz(context, looper, aVar, bVar, "activity_recognition", new com.google.android.gms.common.internal.d(null, hashSet, aVar2, packageName, name, aVar3.containsKey(aVar4) ? (jb.a) aVar3.get(aVar4) : jb.a.f15675a));
    }
}
