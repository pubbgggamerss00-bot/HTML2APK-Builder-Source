package f0;

import eh.p;
import i2.g1;
import java.util.concurrent.CancellationException;
import jh.j;
import kotlin.jvm.internal.r;
import pg.f0;
import pg.q;
import ph.i0;
import ph.m;
import ph.s1;
import v.f;
import vg.i;

@vg.e(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f extends i implements p<i0, tg.e<? super s1>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f8758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f8759c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n2.b f8760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f8761e;

    @vg.e(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", l = {183}, m = "invokeSuspend")
    public static final class a extends i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f8762a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f8763b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g1 f8764c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ n2.b f8765d;

        /* renamed from: f0.f$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0092a extends kotlin.jvm.internal.p implements eh.a<p1.e> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ h f8766a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g1 f8767b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n2.b f8768c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0092a(h hVar, g1 g1Var, n2.b bVar) {
                super(0, r.a.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.f8766a = hVar;
                this.f8767b = g1Var;
                this.f8768c = bVar;
            }

            @Override // eh.a
            public final p1.e invoke() {
                return h.T1(this.f8766a, this.f8767b, this.f8768c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, g1 g1Var, n2.b bVar, tg.e eVar) {
            super(2, eVar);
            this.f8763b = hVar;
            this.f8764c = g1Var;
            this.f8765d = bVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f8763b, this.f8764c, this.f8765d, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objO;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f8762a;
            if (i10 == 0) {
                q.b(obj);
                h hVar = this.f8763b;
                v.f fVar = hVar.f8775q;
                C0092a c0092a = new C0092a(hVar, this.f8764c, this.f8765d);
                this.f8762a = 1;
                fVar.getClass();
                p1.e eVar = (p1.e) c0092a.invoke();
                if (eVar == null || fVar.V1(eVar, fVar.f29835z)) {
                    objO = f0.f21461a;
                } else {
                    m mVar = new m(1, ah.p.c(this));
                    mVar.p();
                    f.a aVar2 = new f.a(c0092a, mVar);
                    v.c cVar = fVar.f29831v;
                    z0.b<f.a> bVar = cVar.f29787a;
                    p1.e eVar2 = (p1.e) c0092a.invoke();
                    if (eVar2 == null) {
                        mVar.resumeWith(f0.f21461a);
                    } else {
                        mVar.s(new v.b(cVar, aVar2));
                        jh.g gVarQ = j.q(0, bVar.f34702c);
                        int i11 = gVarQ.f15744a;
                        int i12 = gVarQ.f15745b;
                        if (i11 <= i12) {
                            while (true) {
                                p1.e eVar3 = (p1.e) bVar.f34700a[i12].f29836a.invoke();
                                if (eVar3 != null) {
                                    p1.e eVarF = eVar2.f(eVar3);
                                    if (eVarF.equals(eVar2)) {
                                        bVar.a(i12 + 1, aVar2);
                                        break;
                                    }
                                    if (!eVarF.equals(eVar3)) {
                                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                        int i13 = bVar.f34702c - 1;
                                        if (i13 <= i12) {
                                            while (true) {
                                                bVar.f34700a[i12].f29837b.cancel(cancellationException);
                                                if (i13 == i12) {
                                                    break;
                                                }
                                                i13++;
                                            }
                                        }
                                    }
                                }
                                if (i12 == i11) {
                                    break;
                                }
                                i12--;
                            }
                            bVar.a(0, aVar2);
                            if (!fVar.A) {
                                fVar.W1();
                            }
                        } else {
                            bVar.a(0, aVar2);
                            if (!fVar.A) {
                            }
                        }
                    }
                    objO = mVar.o();
                    if (objO != ug.a.f29706a) {
                        objO = f0.f21461a;
                    }
                }
                if (objO == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            return f0.f21461a;
        }
    }

    @vg.e(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", f = "BringIntoViewResponder.kt", l = {191}, m = "invokeSuspend")
    public static final class b extends i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f8769a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f8770b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f8771c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, g gVar, tg.e eVar) {
            super(2, eVar);
            this.f8770b = hVar;
            this.f8771c = gVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return new b(this.f8770b, this.f8771c, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f8769a;
            if (i10 == 0) {
                q.b(obj);
                this.f8769a = 1;
                if (n2.c.a(this.f8770b, this.f8771c, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            return f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, g1 g1Var, n2.b bVar, g gVar, tg.e eVar) {
        super(2, eVar);
        this.f8758b = hVar;
        this.f8759c = g1Var;
        this.f8760d = bVar;
        this.f8761e = gVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        f fVar = new f(this.f8758b, this.f8759c, this.f8760d, this.f8761e, eVar);
        fVar.f8757a = obj;
        return fVar;
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super s1> eVar) {
        return ((f) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        q.b(obj);
        i0 i0Var = (i0) this.f8757a;
        h hVar = this.f8758b;
        ph.h.c(i0Var, null, null, new a(hVar, this.f8759c, this.f8760d, null), 3);
        return ph.h.c(i0Var, null, null, new b(hVar, this.f8761e, null), 3);
    }
}
