package t0;

import androidx.compose.ui.d;

/* loaded from: classes.dex */
public final class i0 extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f26041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f26042b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(float f10, float f11) {
        super(2);
        this.f26041a = f10;
        this.f26042b = f11;
    }

    @Override // eh.p
    public final pg.f0 invoke(x0.j jVar, Integer num) {
        x0.j jVar2 = jVar;
        if ((num.intValue() & 3) == 2 && jVar2.s()) {
            jVar2.v();
        } else {
            z.g.a(androidx.compose.foundation.layout.g.o(d.a.f1143b, this.f26041a, this.f26042b), jVar2, 0);
        }
        return pg.f0.f21461a;
    }
}
