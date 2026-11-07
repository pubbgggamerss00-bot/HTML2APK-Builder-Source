package cc;

/* loaded from: classes2.dex */
public final class j implements dc.c {

    /* renamed from: a, reason: collision with root package name */
    public final dc.c f5371a;

    public j(dc.c cVar) {
        this.f5371a = cVar;
    }

    @Override // dc.c
    public final Object zza() {
        g gVar = (g) this.f5371a.zza();
        if (gVar != null) {
            return gVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
