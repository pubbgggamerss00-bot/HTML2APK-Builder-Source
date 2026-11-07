package m0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class d1 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh.l<Boolean, pg.f0> f17280a;

    @vg.e(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", f = "SelectionGestures.kt", l = {94}, m = "invokeSuspend")
    public static final class a extends vg.h implements eh.p<c2.c, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f17281a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f17282b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.l<Boolean, pg.f0> f17283c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(eh.l<? super Boolean, pg.f0> lVar, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f17283c = lVar;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f17283c, eVar);
            aVar.f17282b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(c2.c cVar, tg.e<? super pg.f0> eVar) {
            ((a) create(cVar, eVar)).invokeSuspend(pg.f0.f21461a);
            return ug.a.f29706a;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:12:0x002e). Please report as a decompilation issue!!! */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                ug.a r0 = ug.a.f29706a
                int r1 = r4.f17281a
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                java.lang.Object r1 = r4.f17282b
                c2.c r1 = (c2.c) r1
                pg.q.b(r5)
                goto L2e
            L11:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L19:
                pg.q.b(r5)
                java.lang.Object r5 = r4.f17282b
                c2.c r5 = (c2.c) r5
                r1 = r5
            L21:
                c2.t r5 = c2.t.f4694a
                r4.f17282b = r1
                r4.f17281a = r2
                java.lang.Object r5 = r1.C1(r5, r4)
                if (r5 != r0) goto L2e
                return r0
            L2e:
                c2.r r5 = (c2.r) r5
                boolean r5 = m0.e1.d(r5)
                r5 = r5 ^ r2
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                eh.l<java.lang.Boolean, pg.f0> r3 = r4.f17283c
                r3.invoke(r5)
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.d1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d1(eh.l<? super Boolean, pg.f0> lVar) {
        this.f17280a = lVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(c2.j0 j0Var, tg.e<? super pg.f0> eVar) {
        Object objU0 = j0Var.U0(new a(this.f17280a, null), eVar);
        return objU0 == ug.a.f29706a ? objU0 : pg.f0.f21461a;
    }
}
