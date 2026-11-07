package m0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class m0 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0.b3 f17413a;

    public m0(i0.b3 b3Var) {
        this.f17413a = b3Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
        Object objA = i0.m2.a(j0Var, this.f17413a, eVar);
        return objA == ug.a.f29706a ? objA : pg.f0.f21461a;
    }
}
