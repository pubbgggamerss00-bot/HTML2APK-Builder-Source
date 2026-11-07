package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.lifecycle.c1;
import c2.b0;
import c2.j0;
import com.yalantis.ucrop.view.CropImageView;
import eh.l;
import eh.p;
import f3.w;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.s;
import pg.f0;
import pg.q;
import ph.i0;
import qg.m;
import v.c0;
import v.r;
import v.t0;
import v.u;
import v.x;

/* loaded from: classes.dex */
public final class c implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.gestures.b f847a;

    @vg.e(c = "androidx.compose.foundation.gestures.DragGestureNode$initializePointerInputNode$1$1", f = "Draggable.kt", l = {512}, m = "invokeSuspend")
    public static final class a extends vg.i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f848a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f849b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.gestures.b f850c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j0 f851d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e f852e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d f853f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ C0014c f854g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ f f855h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ b f856j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.foundation.gestures.b bVar, j0 j0Var, e eVar, d dVar, C0014c c0014c, f fVar, b bVar2, tg.e eVar2) {
            super(2, eVar2);
            this.f850c = bVar;
            this.f851d = j0Var;
            this.f852e = eVar;
            this.f853f = dVar;
            this.f854g = c0014c;
            this.f855h = fVar;
            this.f856j = bVar2;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f850c, this.f851d, this.f852e, this.f853f, this.f854g, this.f855h, this.f856j, eVar);
            aVar.f849b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [int, ph.i0] */
        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = ug.a.f29706a;
            ?? r12 = this.f848a;
            androidx.compose.foundation.gestures.b bVar = this.f850c;
            try {
                if (r12 == 0) {
                    q.b(obj);
                    i0 i0Var = (i0) this.f849b;
                    t0 t0Var = bVar.f839s;
                    j0 j0Var = this.f851d;
                    e eVar = this.f852e;
                    d dVar = this.f853f;
                    C0014c c0014c = this.f854g;
                    f fVar = this.f855h;
                    b bVar2 = this.f856j;
                    this.f849b = i0Var;
                    this.f848a = 1;
                    float f10 = u.f30087a;
                    Object objC = c0.c(j0Var, new r(fVar, new kotlin.jvm.internal.f0(), t0Var, eVar, bVar2, c0014c, dVar, null), this);
                    if (objC != obj2) {
                        objC = f0.f21461a;
                    }
                    if (objC == obj2) {
                        return obj2;
                    }
                } else {
                    if (r12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.b(obj);
                }
            } catch (CancellationException e10) {
                rh.c cVar = bVar.f843x;
                if (cVar != null) {
                    cVar.g(a.C0013a.f835a);
                }
                if (!ph.j0.d(r12)) {
                    throw e10;
                }
            }
            return f0.f21461a;
        }
    }

    public static final class b extends s implements p<b0, p1.c, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d2.d f857a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.gestures.b f858b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.foundation.gestures.b bVar, d2.d dVar) {
            super(2);
            this.f857a = dVar;
            this.f858b = bVar;
        }

        @Override // eh.p
        public final f0 invoke(b0 b0Var, p1.c cVar) {
            long j10 = cVar.f21129a;
            d2.e.a(this.f857a, b0Var);
            rh.c cVar2 = this.f858b.f843x;
            if (cVar2 != null) {
                cVar2.g(new a.b(j10));
            }
            return f0.f21461a;
        }
    }

    /* renamed from: androidx.compose.foundation.gestures.c$c, reason: collision with other inner class name */
    public static final class C0014c extends s implements eh.a<f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.gestures.b f859a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0014c(androidx.compose.foundation.gestures.b bVar) {
            super(0);
            this.f859a = bVar;
        }

        @Override // eh.a
        public final f0 invoke() {
            rh.c cVar = this.f859a.f843x;
            if (cVar != null) {
                cVar.g(a.C0013a.f835a);
            }
            return f0.f21461a;
        }
    }

    public static final class d extends s implements l<b0, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d2.d f860a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f861b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.gestures.b f862c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d2.d dVar, j0 j0Var, androidx.compose.foundation.gestures.b bVar) {
            super(1);
            this.f860a = dVar;
            this.f861b = j0Var;
            this.f862c = bVar;
        }

        @Override // eh.l
        public final f0 invoke(b0 b0Var) {
            d2.d dVar = this.f860a;
            d2.c cVar = dVar.f7335b;
            d2.c cVar2 = dVar.f7334a;
            d2.e.a(dVar, b0Var);
            float fE = this.f861b.getViewConfiguration().e();
            long jA = c1.a(fE, fE);
            float fB = w.b(jA);
            float fC = CropImageView.DEFAULT_ASPECT_RATIO;
            if (fB <= CropImageView.DEFAULT_ASPECT_RATIO || w.c(jA) <= CropImageView.DEFAULT_ASPECT_RATIO) {
                f2.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) w.g(jA)));
            }
            long jA2 = c1.a(cVar2.b(w.b(jA)), cVar.b(w.c(jA)));
            d2.a[] aVarArr = cVar2.f7326d;
            m.m(aVarArr, 0, aVarArr.length, null);
            cVar2.f7327e = 0;
            d2.a[] aVarArr2 = cVar.f7326d;
            m.m(aVarArr2, 0, aVarArr2.length, null);
            cVar.f7327e = 0;
            dVar.f7336c = 0L;
            rh.c cVar3 = this.f862c.f843x;
            if (cVar3 != null) {
                x.a aVar = x.f30113a;
                float fB2 = Float.isNaN(w.b(jA2)) ? 0.0f : w.b(jA2);
                if (!Float.isNaN(w.c(jA2))) {
                    fC = w.c(jA2);
                }
                cVar3.g(new a.d(c1.a(fB2, fC)));
            }
            return f0.f21461a;
        }
    }

    public static final class e extends s implements eh.q<b0, b0, p1.c, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.gestures.b f863a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d2.d f864b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.compose.foundation.gestures.b bVar, d2.d dVar) {
            super(3);
            this.f863a = bVar;
            this.f864b = dVar;
        }

        @Override // eh.q
        public final f0 b(b0 b0Var, b0 b0Var2, p1.c cVar) {
            b0 b0Var3 = b0Var;
            b0 b0Var4 = b0Var2;
            long j10 = cVar.f21129a;
            androidx.compose.foundation.gestures.b bVar = this.f863a;
            if (bVar.f840t.invoke(b0Var3).booleanValue()) {
                if (!bVar.f845z) {
                    if (bVar.f843x == null) {
                        bVar.f843x = rh.k.a(Integer.MAX_VALUE, 6, null);
                    }
                    bVar.f845z = true;
                    ph.h.c(bVar.H1(), null, null, new androidx.compose.foundation.gestures.f(bVar, null), 3);
                }
                d2.e.a(this.f864b, b0Var3);
                long jF = p1.c.f(b0Var4.f4595c, j10);
                rh.c cVar2 = bVar.f843x;
                if (cVar2 != null) {
                    cVar2.g(new a.c(jF));
                }
            }
            return f0.f21461a;
        }
    }

    public static final class f extends s implements eh.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.gestures.b f865a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.compose.foundation.gestures.b bVar) {
            super(0);
            this.f865a = bVar;
        }

        @Override // eh.a
        public final Boolean invoke() {
            return Boolean.valueOf(!this.f865a.d2());
        }
    }

    public c(androidx.compose.foundation.gestures.b bVar) {
        this.f847a = bVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(j0 j0Var, tg.e<? super f0> eVar) {
        d2.d dVar = new d2.d();
        androidx.compose.foundation.gestures.b bVar = this.f847a;
        Object objC = ph.j0.c(new a(bVar, j0Var, new e(bVar, dVar), new d(dVar, j0Var, bVar), new C0014c(bVar), new f(bVar), new b(bVar, dVar), null), eVar);
        return objC == ug.a.f29706a ? objC : f0.f21461a;
    }
}
