package u;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c2.j0;
import pg.f0;
import v.c0;

/* loaded from: classes.dex */
public final class i implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l<p1.c, f0> f28891a;

    /* JADX WARN: Multi-variable type inference failed */
    public i(eh.l<? super p1.c, f0> lVar) {
        this.f28891a = lVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(j0 j0Var, tg.e<? super f0> eVar) {
        Object objC = c0.c(j0Var, new j(this.f28891a, null), eVar);
        ug.a aVar = ug.a.f29706a;
        if (objC != aVar) {
            objC = f0.f21461a;
        }
        return objC == aVar ? objC : f0.f21461a;
    }
}
