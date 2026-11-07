package i0;

@vg.e(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {87, 91}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r2 extends vg.h implements eh.p<c2.c, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public c2.b0 f13541a;

    /* renamed from: b, reason: collision with root package name */
    public int f13542b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13543c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b3 f13544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(b3 b3Var, tg.e<? super r2> eVar) {
        super(2, eVar);
        this.f13544d = b3Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        r2 r2Var = new r2(this.f13544d, eVar);
        r2Var.f13543c = obj;
        return r2Var;
    }

    @Override // eh.p
    public final Object invoke(c2.c cVar, tg.e<? super pg.f0> eVar) {
        return ((r2) create(cVar, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r13 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0050 -> B:17:0x0053). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c2.c cVar;
        c2.c cVar2;
        c2.b0 b0Var;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f13542b;
        b3 b3Var = this.f13544d;
        if (i10 == 0) {
            pg.q.b(obj);
            cVar = (c2.c) this.f13543c;
            this.f13543c = cVar;
            this.f13542b = 1;
            obj = v.t1.c(cVar, this, 2);
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b0Var = this.f13541a;
                cVar2 = (c2.c) this.f13543c;
                pg.q.b(obj);
                ?? r13 = ((c2.r) obj).f4687a;
                int size = r13.size();
                for (int i11 = 0; i11 < size; i11++) {
                    c2.b0 b0Var2 = (c2.b0) r13.get(i11);
                    if (b0.a0.b(b0Var2.f4593a, b0Var.f4593a) && b0Var2.f4596d) {
                        this.f13543c = cVar2;
                        this.f13541a = b0Var;
                        this.f13542b = 2;
                        obj = cVar2.C1(c2.t.f4695b, this);
                    }
                }
                b3Var.c();
                return pg.f0.f21461a;
            }
            cVar = (c2.c) this.f13543c;
            pg.q.b(obj);
        }
        c2.b0 b0Var3 = (c2.b0) obj;
        long j10 = b0Var3.f4595c;
        b3Var.d();
        cVar2 = cVar;
        b0Var = b0Var3;
        this.f13543c = cVar2;
        this.f13541a = b0Var;
        this.f13542b = 2;
        obj = cVar2.C1(c2.t.f4695b, this);
    }
}
