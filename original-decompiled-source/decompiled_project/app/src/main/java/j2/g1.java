package j2;

import android.view.Choreographer;

@vg.e(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g1 extends vg.i implements eh.p<ph.i0, tg.e<? super Choreographer>, Object> {
    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new g1(2, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super Choreographer> eVar) {
        return ((g1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        return Choreographer.getInstance();
    }
}
