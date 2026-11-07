package u;

import pg.f0;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f28931a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f28932b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(eh.l lVar, g gVar) {
        super(2);
        this.f28931a = gVar;
        this.f28932b = (kotlin.jvm.internal.s) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [eh.l, kotlin.jvm.internal.s] */
    @Override // eh.p
    public final f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        int iIntValue = num.intValue();
        if (jVar2.A(iIntValue & 1, (iIntValue & 3) != 2)) {
            ?? r02 = this.f28932b;
            g gVar = this.f28931a;
            y.a(gVar, f1.c.b(1156688164, new v(r02, gVar), jVar2), jVar2, 384);
        } else {
            jVar2.v();
        }
        return f0.f21461a;
    }
}
