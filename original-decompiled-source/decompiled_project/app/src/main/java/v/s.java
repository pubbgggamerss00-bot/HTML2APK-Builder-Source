package v;

import java.util.concurrent.CancellationException;

@vg.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {354, 355, 360}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class s extends vg.h implements eh.p<c2.c, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f30060a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30061b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x8.y f30062c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x8.z f30063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.credentials.playservices.p f30064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x8.a0 f30065f;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<c2.b0, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x8.a0 f30066a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x8.a0 a0Var) {
            super(1);
            this.f30066a = a0Var;
        }

        @Override // eh.l
        public final pg.f0 invoke(c2.b0 b0Var) {
            c2.b0 b0Var2 = b0Var;
            this.f30066a.invoke(b0Var2, new p1.c(c2.s.e(b0Var2, false)));
            b0Var2.a();
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(x8.y yVar, x8.z zVar, androidx.credentials.playservices.p pVar, x8.a0 a0Var, tg.e eVar) {
        super(2, eVar);
        this.f30062c = yVar;
        this.f30063d = zVar;
        this.f30064e = pVar;
        this.f30065f = a0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        s sVar = new s(this.f30062c, this.f30063d, this.f30064e, this.f30065f, eVar);
        sVar.f30061b = obj;
        return sVar;
    }

    @Override // eh.p
    public final Object invoke(c2.c cVar, tg.e<? super pg.f0> eVar) {
        return ((s) create(cVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x007b, B:35:0x0083, B:37:0x0090, B:39:0x009c, B:40:0x009f, B:41:0x00a2, B:42:0x00a8, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:47:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083 A[Catch: CancellationException -> 0x0019, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x007b, B:35:0x0083, B:37:0x0090, B:39:0x009c, B:40:0x009f, B:41:0x00a2, B:42:0x00a8, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:47:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8 A[Catch: CancellationException -> 0x0019, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0019, blocks: (B:8:0x0015, B:33:0x007b, B:35:0x0083, B:37:0x0090, B:39:0x009c, B:40:0x009f, B:41:0x00a2, B:42:0x00a8, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:47:0x0009 }] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c2.c cVar;
        c2.b0 b0Var;
        c2.c cVar2;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f30060a;
        androidx.credentials.playservices.p pVar = this.f30064e;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                cVar = (c2.c) this.f30061b;
                this.f30061b = cVar;
                this.f30060a = 1;
                obj = t1.c(cVar, this, 2);
                if (obj == aVar) {
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    cVar = (c2.c) this.f30061b;
                    pg.q.b(obj);
                    b0Var = (c2.b0) obj;
                    if (b0Var != null) {
                        this.f30062c.invoke(new p1.c(b0Var.f4595c));
                        long j10 = b0Var.f4593a;
                        a aVar2 = new a(this.f30065f);
                        this.f30061b = cVar;
                        this.f30060a = 3;
                        obj = u.d(cVar, j10, aVar2, this);
                        if (obj != aVar) {
                            cVar2 = cVar;
                            if (((Boolean) obj).booleanValue()) {
                            }
                        }
                        return aVar;
                    }
                    return pg.f0.f21461a;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar2 = (c2.c) this.f30061b;
                pg.q.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    pVar.invoke();
                } else {
                    ?? r92 = cVar2.M().f4687a;
                    int size = r92.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        c2.b0 b0Var2 = (c2.b0) r92.get(i11);
                        if (c2.s.b(b0Var2)) {
                            b0Var2.a();
                        }
                    }
                    this.f30063d.invoke();
                }
                return pg.f0.f21461a;
            }
            cVar = (c2.c) this.f30061b;
            pg.q.b(obj);
            long j11 = ((c2.b0) obj).f4593a;
            this.f30061b = cVar;
            this.f30060a = 2;
            obj = u.c(cVar, j11, this);
            if (obj != aVar) {
                b0Var = (c2.b0) obj;
                if (b0Var != null) {
                }
                return pg.f0.f21461a;
            }
            return aVar;
        } catch (CancellationException e10) {
            pVar.invoke();
            throw e10;
        }
    }
}
