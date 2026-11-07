package m0;

@vg.e(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", l = {623}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class t2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f17519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2 f17520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f17521c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(x2 x2Var, boolean z10, tg.e<? super t2> eVar) {
        super(2, eVar);
        this.f17520b = x2Var;
        this.f17521c = z10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new t2(this.f17520b, this.f17521c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((t2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f17519a;
        x2 x2Var = this.f17520b;
        if (i10 == 0) {
            pg.q.b(obj);
            if (t2.j0.b(x2Var.k().f33683b)) {
                return pg.f0.f21461a;
            }
            j2.f2 f2Var = x2Var.f17554h;
            if (f2Var != null) {
                j2.e2 e2VarA = y.a.a(y2.d0.a(x2Var.k()));
                this.f17519a = 1;
                if (f2Var.a(e2VarA) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        if (!this.f17521c) {
            return pg.f0.f21461a;
        }
        int iD = t2.j0.d(x2Var.k().f33683b);
        x2Var.f17549c.invoke(x2.c(x2Var.k().f33682a, t2.k0.a(iD, iD)));
        x2Var.o(i0.v1.f13646a);
        return pg.f0.f21461a;
    }
}
