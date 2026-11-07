package x8;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j5 implements qg.c0<Long, Long> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f32774a;

    public j5(ArrayList arrayList) {
        this.f32774a = arrayList;
    }

    @Override // qg.c0
    public final Long a(Long l10) {
        return Long.valueOf(l10.longValue());
    }

    @Override // qg.c0
    public final Iterator<Long> b() {
        return this.f32774a.iterator();
    }
}
