package i0;

@vg.e(c = "androidx.compose.foundation.text.TextFieldCursorKt$cursor$1$1$1", f = "TextFieldCursor.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f13224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0.p f13225b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(k0.p pVar, tg.e<? super c3> eVar) {
        super(2, eVar);
        this.f13225b = pVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new c3(this.f13225b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((c3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = ug.a.f29706a;
        int i10 = this.f13224a;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f13224a = 1;
            k0.p pVar = this.f13225b;
            pVar.getClass();
            Object objC = ph.j0.c(new k0.o(pVar, null), this);
            if (objC != obj2) {
                objC = pg.f0.f21461a;
            }
            if (objC == obj2) {
                return obj2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
