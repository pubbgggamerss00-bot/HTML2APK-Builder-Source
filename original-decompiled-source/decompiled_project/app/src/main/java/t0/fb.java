package t0;

/* loaded from: classes.dex */
public final class fb extends kotlin.jvm.internal.s implements eh.l<ib, hb> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f25880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f3.d f25881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.l<ib, Boolean> f25882c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(boolean z10, f3.d dVar, eh.l lVar) {
        super(1);
        this.f25880a = z10;
        this.f25881b = dVar;
        this.f25882c = lVar;
    }

    @Override // eh.l
    public final hb invoke(ib ibVar) {
        f3.d dVar = this.f25881b;
        eh.l<ib, Boolean> lVar = this.f25882c;
        return new hb(this.f25880a, dVar, ibVar, lVar);
    }
}
