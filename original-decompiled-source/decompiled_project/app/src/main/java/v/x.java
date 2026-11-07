package v;

import androidx.compose.foundation.gestures.DraggableElement;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final a f30113a = new a(3, null);

    /* renamed from: b, reason: collision with root package name */
    public static final b f30114b = new b(3, null);

    @vg.e(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.q<ph.i0, p1.c, tg.e<? super pg.f0>, Object> {
        @Override // eh.q
        public final Object b(ph.i0 i0Var, p1.c cVar, tg.e<? super pg.f0> eVar) {
            long j10 = cVar.f21129a;
            return new a(3, eVar).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.q<ph.i0, Float, tg.e<? super pg.f0>, Object> {
        @Override // eh.q
        public final Object b(ph.i0 i0Var, Float f10, tg.e<? super pg.f0> eVar) {
            f10.floatValue();
            return new b(3, eVar).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
    }

    public static androidx.compose.ui.d a(androidx.compose.ui.d dVar, y yVar, t0 t0Var, boolean z10, x.m mVar, boolean z11, eh.q qVar, boolean z12, int i10) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z13 = z10;
        if ((i10 & 8) != 0) {
            mVar = null;
        }
        return dVar.h(new DraggableElement(yVar, t0Var, z13, mVar, (i10 & 16) != 0 ? false : z11, f30113a, qVar, (i10 & 128) != 0 ? false : z12));
    }
}
