package i0;

import t0.hc;

/* loaded from: classes.dex */
public final class n2 extends kotlin.jvm.internal.s implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13446b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(Object obj, int i10) {
        super(1);
        this.f13445a = i10;
        this.f13446b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f13445a) {
            case 0:
                ((b3) this.f13446b).a(((p1.c) obj).f21129a);
                break;
            default:
                long j10 = ((f3.p) obj).f8826a;
                ((hc) this.f13446b).f26024i.e((int) (j10 >> 32));
                break;
        }
        return pg.f0.f21461a;
    }
}
