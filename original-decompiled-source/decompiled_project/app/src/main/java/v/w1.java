package v;

@vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class w1 extends vg.h implements eh.p<c2.c, tg.e<? super c2.b0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public long f30109a;

    /* renamed from: b, reason: collision with root package name */
    public int f30110b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f30111c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c2.b0 f30112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(c2.b0 b0Var, tg.e<? super w1> eVar) {
        super(2, eVar);
        this.f30112d = b0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        w1 w1Var = new w1(this.f30112d, eVar);
        w1Var.f30111c = obj;
        return w1Var;
    }

    @Override // eh.p
    public final Object invoke(c2.c cVar, tg.e<? super c2.b0> eVar) {
        return ((w1) create(cVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:12:0x0040). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            ug.a r0 = ug.a.f29706a
            int r1 = r7.f30110b
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            long r3 = r7.f30109a
            java.lang.Object r1 = r7.f30111c
            c2.c r1 = (c2.c) r1
            pg.q.b(r8)
            goto L40
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            pg.q.b(r8)
            java.lang.Object r8 = r7.f30111c
            c2.c r8 = (c2.c) r8
            c2.b0 r1 = r7.f30112d
            long r3 = r1.f4594b
            j2.k5 r1 = r8.getViewConfiguration()
            r1.getClass()
            r5 = 40
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L32:
            r7.f30111c = r1
            r7.f30109a = r3
            r7.f30110b = r2
            r8 = 3
            java.lang.Object r8 = v.t1.c(r1, r7, r8)
            if (r8 != r0) goto L40
            return r0
        L40:
            c2.b0 r8 = (c2.b0) r8
            long r5 = r8.f4594b
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L32
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v.w1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
