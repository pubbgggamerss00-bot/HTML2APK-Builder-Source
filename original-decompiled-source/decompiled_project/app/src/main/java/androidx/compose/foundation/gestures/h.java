package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.f;
import eh.p;
import eh.q;
import f3.w;
import kotlin.jvm.internal.r;
import pg.f0;
import ph.i0;
import ph.k0;
import t.b1;
import v.t0;
import v.x;
import v.y;

/* loaded from: classes.dex */
public final class h extends androidx.compose.foundation.gestures.b {
    public y B;
    public t0 C;
    public boolean D;
    public q<? super i0, ? super p1.c, ? super tg.e<? super f0>, ? extends Object> E;
    public q<? super i0, ? super Float, ? super tg.e<? super f0>, ? extends Object> F;
    public boolean G;

    @vg.e(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", f = "Draggable.kt", l = {309}, m = "invokeSuspend")
    public static final class a extends vg.i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f893a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f894b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f896d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f896d = j10;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            a aVar = h.this.new a(this.f896d, eVar);
            aVar.f894b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f893a;
            if (i10 == 0) {
                pg.q.b(obj);
                i0 i0Var = (i0) this.f894b;
                q<? super i0, ? super p1.c, ? super tg.e<? super f0>, ? extends Object> qVar = h.this.E;
                p1.c cVar = new p1.c(this.f896d);
                this.f893a = 1;
                if (qVar.b(i0Var, cVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", l = {316}, m = "invokeSuspend")
    public static final class b extends vg.i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f897a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f898b;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f900d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f900d = j10;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            b bVar = h.this.new b(this.f900d, eVar);
            bVar.f898b = obj;
            return bVar;
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f897a;
            if (i10 == 0) {
                pg.q.b(obj);
                i0 i0Var = (i0) this.f898b;
                h hVar = h.this;
                q<? super i0, ? super Float, ? super tg.e<? super f0>, ? extends Object> qVar = hVar.F;
                boolean z10 = hVar.G;
                long jF = w.f(z10 ? -1.0f : 1.0f, this.f900d);
                t0 t0Var = hVar.C;
                x.a aVar2 = x.f30113a;
                Float f10 = new Float(t0Var == t0.f30083a ? w.c(jF) : w.b(jF));
                this.f897a = 1;
                if (qVar.b(i0Var, f10, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return f0.f21461a;
        }
    }

    public h() {
        throw null;
    }

    @Override // androidx.compose.foundation.gestures.b
    public final Object a2(f.a aVar, f fVar) {
        y yVar = this.B;
        b1 b1Var = b1.f25167a;
        Object objA = yVar.a(new g(aVar, this, null), fVar);
        return objA == ug.a.f29706a ? objA : f0.f21461a;
    }

    @Override // androidx.compose.foundation.gestures.b
    public final void b2(long j10) {
        if (!this.f1157p || r.a(this.E, x.f30113a)) {
            return;
        }
        ph.h.c(H1(), null, k0.f21556d, new a(j10, null), 1);
    }

    @Override // androidx.compose.foundation.gestures.b
    public final void c2(long j10) {
        if (!this.f1157p || r.a(this.F, x.f30114b)) {
            return;
        }
        ph.h.c(H1(), null, k0.f21556d, new b(j10, null), 1);
    }

    @Override // androidx.compose.foundation.gestures.b
    public final boolean d2() {
        return this.D;
    }
}
