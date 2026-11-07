package m0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class a1 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f17248a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0.b3 f17249b;

    @vg.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$selectionGestureInput$1$1", f = "SelectionGestures.kt", l = {107, 113, 115}, m = "invokeSuspend")
    public static final class a extends vg.h implements eh.p<c2.c, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17250a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f17251b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q f17252c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f17253d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ i0.b3 f17254e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar, m mVar, i0.b3 b3Var, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f17252c = qVar;
            this.f17253d = mVar;
            this.f17254e = b3Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f17252c, this.f17253d, this.f17254e, eVar);
            aVar.f17251b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(c2.c cVar, tg.e<? super pg.f0> eVar) {
            return ((a) create(cVar, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
        
            if (m0.e1.b(r1, r9.f17252c, r9.f17253d, r10, r9) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
        
            if (m0.e1.c(r1, r9.f17254e, r10, r9) == r0) goto L32;
         */
        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            c2.c cVar;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f17250a;
            if (i10 == 0) {
                pg.q.b(obj);
                cVar = (c2.c) this.f17251b;
                this.f17251b = cVar;
                this.f17250a = 1;
                obj = e1.a(cVar, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return pg.f0.f21461a;
            }
            cVar = (c2.c) this.f17251b;
            pg.q.b(obj);
            c2.r rVar = (c2.r) obj;
            if (e1.d(rVar) && (rVar.f4689c & 33) != 0) {
                ?? r42 = rVar.f4687a;
                int size = r42.size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (!((c2.b0) r42.get(i11)).b()) {
                    }
                }
                this.f17251b = null;
                this.f17250a = 2;
            }
            if (!e1.d(rVar)) {
                this.f17251b = null;
                this.f17250a = 3;
            }
            return pg.f0.f21461a;
        }
    }

    public a1(q qVar, i0.b3 b3Var) {
        this.f17248a = qVar;
        this.f17249b = b3Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
        Object objC = v.c0.c(j0Var, new a(this.f17248a, new m(j0Var.getViewConfiguration()), this.f17249b, null), eVar);
        return objC == ug.a.f29706a ? objC : pg.f0.f21461a;
    }
}
