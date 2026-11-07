package t0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ve extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f1.b f27262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f27263b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(f1.b bVar, ArrayList arrayList) {
        super(2);
        this.f27262a = bVar;
        this.f27263b = arrayList;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            this.f27262a.b(this.f27263b, jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
