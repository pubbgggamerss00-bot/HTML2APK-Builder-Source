package b0;

import x0.n1;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.s implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3428b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj, int i10) {
        super(0);
        this.f3427a = i10;
        this.f3428b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f3427a) {
            case 0:
                return new m((eh.l) ((n1) this.f3428b).getValue());
            default:
                ((eh.l) this.f3428b).invoke(Boolean.FALSE);
                return pg.f0.f21461a;
        }
    }
}
