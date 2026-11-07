package cc;

import android.content.Context;

/* loaded from: classes2.dex */
public final class h implements dc.c {

    /* renamed from: a, reason: collision with root package name */
    public final dc.c f5367a;

    /* renamed from: b, reason: collision with root package name */
    public final dc.c f5368b;

    /* renamed from: c, reason: collision with root package name */
    public final k f5369c;

    public h(dc.c cVar, dc.c cVar2, k kVar) {
        this.f5367a = cVar;
        this.f5368b = cVar2;
        this.f5369c = kVar;
    }

    @Override // dc.c
    public final Object zza() {
        return new g((q) this.f5367a.zza(), (e) this.f5368b.zza(), (Context) this.f5369c.f5372a.f5370a);
    }
}
