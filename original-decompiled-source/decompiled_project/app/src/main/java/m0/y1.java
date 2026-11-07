package m0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import v.t1;

/* loaded from: classes.dex */
public final class y1 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r1 f17585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f17586b;

    @vg.e(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", f = "SelectionManager.kt", l = {754, 760}, m = "invokeSuspend")
    public static final class a extends vg.h implements eh.p<c2.c, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17587a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f17588b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r1 f17589c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ u1 f17590d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(r1 r1Var, u1 u1Var, tg.e eVar) {
            super(2, eVar);
            this.f17589c = r1Var;
            this.f17590d = u1Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f17589c, this.f17590d, eVar);
            aVar.f17588b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(c2.c cVar, tg.e<? super pg.f0> eVar) {
            return ((a) create(cVar, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            c2.c cVar;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f17587a;
            if (i10 == 0) {
                pg.q.b(obj);
                cVar = (c2.c) this.f17588b;
                this.f17588b = cVar;
                this.f17587a = 1;
                t1.a aVar2 = v.t1.f30086a;
                obj = v.t1.d(cVar, c2.t.f4695b, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                if (!((Boolean) obj).booleanValue() && this.f17589c.d() == null) {
                    this.f17590d.invoke();
                }
                return pg.f0.f21461a;
            }
            cVar = (c2.c) this.f17588b;
            pg.q.b(obj);
            c2.t tVar = c2.t.f4694a;
            this.f17588b = null;
            this.f17587a = 2;
            obj = v.u.a(cVar, (c2.b0) obj, tVar, this);
        }
    }

    public y1(r1 r1Var, u1 u1Var) {
        this.f17585a = r1Var;
        this.f17586b = u1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
        Object objC = v.c0.c(j0Var, new a(this.f17585a, this.f17586b, null), eVar);
        return objC == ug.a.f29706a ? objC : pg.f0.f21461a;
    }
}
