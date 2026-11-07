package x8;

import android.os.SystemClock;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeScreenKt$HomeScreen$7$1", f = "HomeScreen.kt", l = {487, 490}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q4 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f33095a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f33096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f33097c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f33098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Long> f33099e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(boolean z10, s.b<Float, s.o> bVar, x0.n1<Boolean> n1Var, x0.n1<Long> n1Var2, tg.e<? super q4> eVar) {
        super(2, eVar);
        this.f33096b = z10;
        this.f33097c = bVar;
        this.f33098d = n1Var;
        this.f33099e = n1Var2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new q4(this.f33096b, this.f33097c, this.f33098d, this.f33099e, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((q4) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        if (s.b.c(r10.f33097c, r5, r6, null, r10, 12) != r0) goto L20;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33095a;
        if (i10 == 0) {
            pg.q.b(obj);
            boolean z10 = g5.f32665a;
            if (this.f33098d.getValue().booleanValue() && this.f33096b) {
                p4 p4Var = new p4();
                this.f33095a = 1;
                if (x0.f1.a(getContext()).f0(p4Var, this) != aVar) {
                    Long l10 = new Long(SystemClock.uptimeMillis());
                    boolean z11 = g5.f32665a;
                    this.f33099e.setValue(l10);
                    g5.f32665a = true;
                    Float f10 = new Float(1.0f);
                    s.q0<Float> q0Var = e.f32528a;
                    this.f33095a = 2;
                }
                return aVar;
            }
            return pg.f0.f21461a;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
        pg.q.b(obj);
        Long l102 = new Long(SystemClock.uptimeMillis());
        boolean z112 = g5.f32665a;
        this.f33099e.setValue(l102);
        g5.f32665a = true;
        Float f102 = new Float(1.0f);
        s.q0<Float> q0Var2 = e.f32528a;
        this.f33095a = 2;
    }
}
