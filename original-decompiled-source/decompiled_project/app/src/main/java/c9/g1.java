package c9;

/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5100a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5102c;

    public /* synthetic */ g1(int i10, Object obj, Object obj2) {
        this.f5100a = i10;
        this.f5101b = obj;
        this.f5102c = obj2;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        int i10 = this.f5100a;
        Object obj2 = this.f5102c;
        Object obj3 = this.f5101b;
        switch (i10) {
            case 0:
                Long l10 = (Long) obj;
                l10.getClass();
                ((s1) obj3).f5278j.setValue(l10);
                int i11 = r0.f5188b;
                ((x0.l1) obj2).f(1);
                break;
            default:
                eh.l lVar = (eh.l) obj2;
                y2.c0 it = (y2.c0) obj;
                kotlin.jvm.internal.r.e(it, "it");
                t2.b bVar = it.f33682a;
                if (!kotlin.jvm.internal.r.a(bVar.f27761b, (String) obj3)) {
                    lVar.invoke(bVar.f27761b);
                }
                break;
        }
        return pg.f0.f21461a;
    }
}
