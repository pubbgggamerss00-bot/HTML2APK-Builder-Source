package c2;

import c2.y0;

@vg.e(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {883, 884}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class w0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f4704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4705b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0.a<Object> f4706c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(long j10, y0.a<Object> aVar, tg.e<? super w0> eVar) {
        super(2, eVar);
        this.f4705b = j10;
        this.f4706c = aVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new w0(this.f4705b, this.f4706c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((w0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (ph.t0.b(8, r10) == r0) goto L15;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f4704a;
        long j10 = this.f4705b;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f4704a = 1;
            if (ph.t0.b(j10 - 8, this) != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            ph.m mVar = this.f4706c.f4723c;
            if (mVar != null) {
                mVar.resumeWith(pg.q.a(new v(j10)));
            }
            return pg.f0.f21461a;
        }
        pg.q.b(obj);
        this.f4704a = 2;
    }
}
