package t0;

import x.o;

@vg.e(c = "androidx.compose.material3.CardElevation$animateElevation$2$1", f = "Card.kt", l = {731, 741}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f25502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.b<f3.h, s.o> f25503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f25504c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f25505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c1 f25506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x.k f25507f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(s.b<f3.h, s.o> bVar, float f10, boolean z10, c1 c1Var, x.k kVar, tg.e<? super b1> eVar) {
        super(2, eVar);
        this.f25503b = bVar;
        this.f25504c = f10;
        this.f25505d = z10;
        this.f25506e = c1Var;
        this.f25507f = kVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new b1(this.f25503b, this.f25504c, this.f25505d, this.f25506e, this.f25507f, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((b1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (r8.f(r1, r7) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        if (u0.g0.a(r8, r4, r1, r7.f25507f, r7) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f25502a;
        if (i10 == 0) {
            pg.q.b(obj);
            s.b<f3.h, s.o> bVar = this.f25503b;
            float f10 = ((f3.h) bVar.f23656e.getValue()).f8817a;
            float f11 = this.f25504c;
            if (!f3.h.a(f10, f11)) {
                if (this.f25505d) {
                    float f12 = ((f3.h) bVar.f23656e.getValue()).f8817a;
                    c1 c1Var = this.f25506e;
                    x.k bVar2 = f3.h.a(f12, c1Var.f25561b) ? new o.b(0L) : f3.h.a(f12, c1Var.f25563d) ? new x.i() : f3.h.a(f12, c1Var.f25562c) ? new x.e() : f3.h.a(f12, c1Var.f25564e) ? new x.b() : null;
                    this.f25502a = 2;
                } else {
                    f3.h hVar = new f3.h(f11);
                    this.f25502a = 1;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
