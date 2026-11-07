package h8;

import pg.f0;
import ph.i0;

@vg.e(c = "com.basitce.htmltoapk.ai.AiBackgroundTurns$cancel$1", f = "AiBackgroundTurns.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f12367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f12368b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12369c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12370d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, String str, String str2, tg.e<? super c> eVar) {
        super(2, eVar);
        this.f12368b = aVar;
        this.f12369c = str;
        this.f12370d = str2;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new c(this.f12368b, this.f12369c, this.f12370d, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((c) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f12367a;
        String str = this.f12370d;
        a aVar2 = this.f12368b;
        if (i10 == 0) {
            pg.q.b(obj);
            g8.p pVar = aVar2.f12344c;
            this.f12367a = 1;
            obj = pVar.c(this.f12369c, str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            aVar2.c(str);
        } else {
            aVar2.f();
        }
        return f0.f21461a;
    }
}
