package m0;

/* loaded from: classes.dex */
public final class i3 extends kotlin.jvm.internal.s implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17358b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17359c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(int i10, Object obj, Object obj2) {
        super(0);
        this.f17357a = i10;
        this.f17358b = obj;
        this.f17359c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [eh.a, kotlin.jvm.internal.s] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
    @Override // eh.a
    public final Object invoke() {
        switch (this.f17357a) {
            case 0:
                ?? r02 = ((x2) this.f17359c).f17553g;
                if (r02 != 0) {
                    r02.invoke();
                }
                u.q.a((u.p) this.f17358b);
                break;
            default:
                ((kotlin.jvm.internal.g0) this.f17358b).f16327a = i2.i.a((t.j0) this.f17359c, g2.f1.f11378a);
                break;
        }
        return pg.f0.f21461a;
    }
}
