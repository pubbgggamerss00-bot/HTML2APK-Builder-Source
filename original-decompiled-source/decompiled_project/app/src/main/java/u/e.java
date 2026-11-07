package u;

import pg.f0;
import u.p;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.s implements eh.l<p1.c, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.a<f0> f28881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f28882b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(eh.a<f0> aVar, p pVar) {
        super(1);
        this.f28881a = aVar;
        this.f28882b = pVar;
    }

    @Override // eh.l
    public final f0 invoke(p1.c cVar) {
        long j10 = cVar.f21129a;
        this.f28881a.invoke();
        this.f28882b.f28915a.setValue(new p.a.b(j10));
        return f0.f21461a;
    }
}
