package v;

import v.f0;

@vg.e(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", f = "MouseWheelScrollable.kt", l = {107, 110}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f29991a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f29993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(f0 f0Var, tg.e<? super m0> eVar) {
        super(2, eVar);
        this.f29993c = f0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        m0 m0Var = new m0(this.f29993c, eVar);
        m0Var.f29992b = obj;
        return m0Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((m0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (v.f0.b(r5, r6, r7, r8, r9, r12) != r0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:17:0x0032, B:19:0x003c, B:23:0x004c, B:14:0x0027), top: B:30:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006a -> B:8:0x0016). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ph.i0 i0Var;
        ph.i0 i0Var2;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f29991a;
        f0 f0Var = this.f29993c;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                i0Var = (ph.i0) this.f29992b;
                if (ph.v1.h(i0Var.getCoroutineContext())) {
                }
            } else if (i10 == 1) {
                i0Var2 = (ph.i0) this.f29992b;
                pg.q.b(obj);
                f0.a aVar2 = (f0.a) obj;
                float fN0 = f0Var.f29858d.N0(e0.f29817a);
                float fN02 = f0Var.f29858d.N0(e0.f29818b);
                s1 s1Var = f0Var.f29855a;
                this.f29992b = i0Var2;
                this.f29991a = 2;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i0Var2 = (ph.i0) this.f29992b;
                pg.q.b(obj);
                i0Var = i0Var2;
                if (ph.v1.h(i0Var.getCoroutineContext())) {
                    f0Var.f29861g = null;
                    return pg.f0.f21461a;
                }
                rh.c cVar = f0Var.f29859e;
                this.f29992b = i0Var;
                this.f29991a = 1;
                Object objB = cVar.b(this);
                if (objB == aVar) {
                    return aVar;
                }
                i0Var2 = i0Var;
                obj = objB;
                f0.a aVar22 = (f0.a) obj;
                float fN03 = f0Var.f29858d.N0(e0.f29817a);
                float fN022 = f0Var.f29858d.N0(e0.f29818b);
                s1 s1Var2 = f0Var.f29855a;
                this.f29992b = i0Var2;
                this.f29991a = 2;
            }
        } catch (Throwable th2) {
            f0Var.f29861g = null;
            throw th2;
        }
    }
}
