package k0;

import j2.u3;

@vg.e(c = "androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1", f = "LegacyAdaptingPlatformTextInputModifierNode.kt", l = {137}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i1 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f15849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j1 f15850b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f15851c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var, b bVar, tg.e eVar) {
        super(2, eVar);
        this.f15850b = j1Var;
        this.f15851c = bVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new i1(this.f15850b, this.f15851c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        ((i1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        return ug.a.f29706a;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f15849a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            throw new pg.g();
        }
        pg.q.b(obj);
        this.f15849a = 1;
        u3.a(this.f15850b, this.f15851c, this);
        return aVar;
    }
}
