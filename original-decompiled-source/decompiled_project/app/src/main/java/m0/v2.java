package m0;

import i0.y4;
import t2.b;

@vg.e(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$cut$1", f = "TextFieldSelectionManager.kt", l = {677}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class v2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f17537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x2 f17538b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(x2 x2Var, tg.e<? super v2> eVar) {
        super(2, eVar);
        this.f17538b = x2Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new v2(this.f17538b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((v2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f17537a;
        x2 x2Var = this.f17538b;
        if (i10 == 0) {
            pg.q.b(obj);
            if (t2.j0.b(x2Var.k().f33683b)) {
                return pg.f0.f21461a;
            }
            j2.f2 f2Var = x2Var.f17554h;
            if (f2Var != null) {
                j2.e2 e2VarA = y.a.a(y2.d0.a(x2Var.k()));
                this.f17537a = 1;
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
        t2.b bVarC = y2.d0.c(x2Var.k(), x2Var.k().f33682a.f27761b.length());
        t2.b bVarB = y2.d0.b(x2Var.k(), x2Var.k().f33682a.f27761b.length());
        b.C0288b c0288b = new b.C0288b(bVarC);
        c0288b.c(bVarB);
        t2.b bVarE = c0288b.e();
        int iE = t2.j0.e(x2Var.k().f33683b);
        x2Var.f17549c.invoke(x2.c(bVarE, t2.k0.a(iE, iE)));
        x2Var.o(i0.v1.f13646a);
        y4 y4Var = x2Var.f17547a;
        if (y4Var != null) {
            y4Var.f13712f = true;
        }
        return pg.f0.f21461a;
    }
}
