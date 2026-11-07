package j2;

/* loaded from: classes.dex */
public final class p2 extends kotlin.jvm.internal.s implements eh.a<pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f14843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c6.c f14844b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14845c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(boolean z10, c6.c cVar, String str) {
        super(0);
        this.f14843a = z10;
        this.f14844b = cVar;
        this.f14845c = str;
    }

    @Override // eh.a
    public final pg.f0 invoke() {
        if (this.f14843a) {
            c6.c cVar = this.f14844b;
            String str = this.f14845c;
            e6.b bVar = cVar.f4993a;
            synchronized (bVar.f8391c) {
            }
        }
        return pg.f0.f21461a;
    }
}
