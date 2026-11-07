package t0;

/* loaded from: classes.dex */
public final class cb extends kotlin.jvm.internal.s implements eh.a<hb> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f25597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f3.d f25598b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ib f25599c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.l<ib, Boolean> f25600d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(boolean z10, f3.d dVar, ib ibVar, eh.l lVar) {
        super(0);
        this.f25597a = z10;
        this.f25598b = dVar;
        this.f25599c = ibVar;
        this.f25600d = lVar;
    }

    @Override // eh.a
    public final hb invoke() {
        return new hb(this.f25597a, this.f25598b, this.f25599c, this.f25600d);
    }
}
