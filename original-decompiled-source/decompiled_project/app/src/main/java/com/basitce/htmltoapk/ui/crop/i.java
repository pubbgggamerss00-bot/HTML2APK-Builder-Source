package com.basitce.htmltoapk.ui.crop;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c2.j0;
import eh.p;
import pg.f0;

/* loaded from: classes.dex */
public final class i implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public static final i f5773a = new i();

    @vg.e(c = "com.basitce.htmltoapk.ui.crop.CropActivity$onCreate$1$1$2$1$2$1$1", f = "CropActivity.kt", l = {239}, m = "invokeSuspend")
    public static final class a extends vg.h implements p<c2.c, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f5774a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5775b;

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(2, eVar);
            aVar.f5775b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(c2.c cVar, tg.e<? super f0> eVar) {
            ((a) create(cVar, eVar)).invokeSuspend(f0.f21461a);
            return ug.a.f29706a;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[LOOP:0: B:13:0x0036->B:15:0x003c, LOOP_END] */
        /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Iterable, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:12:0x002e). Please report as a decompilation issue!!! */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                ug.a r0 = ug.a.f29706a
                int r1 = r4.f5774a
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                java.lang.Object r1 = r4.f5775b
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
                java.lang.Object r5 = r4.f5775b
                c2.c r5 = (c2.c) r5
                r1 = r5
            L21:
                r4.f5775b = r1
                r4.f5774a = r2
                c2.t r5 = c2.t.f4695b
                java.lang.Object r5 = r1.C1(r5, r4)
                if (r5 != r0) goto L2e
                return r0
            L2e:
                c2.r r5 = (c2.r) r5
                java.lang.Object r5 = r5.f4687a
                java.util.Iterator r5 = r5.iterator()
            L36:
                boolean r3 = r5.hasNext()
                if (r3 == 0) goto L21
                java.lang.Object r3 = r5.next()
                c2.b0 r3 = (c2.b0) r3
                r3.a()
                goto L36
            */
            throw new UnsupportedOperationException("Method not decompiled: com.basitce.htmltoapk.ui.crop.i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(j0 j0Var, tg.e<? super f0> eVar) {
        Object objU0 = j0Var.U0(new a(2, null), eVar);
        return objU0 == ug.a.f29706a ? objU0 : f0.f21461a;
    }
}
