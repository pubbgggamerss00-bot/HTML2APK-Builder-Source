package di;

@vg.e(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {115}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g0 extends vg.h implements eh.q<pg.b<pg.f0, kotlinx.serialization.json.h>, pg.f0, tg.e<? super kotlinx.serialization.json.h>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f8014a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ pg.b f8015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i0 f8016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, tg.e<? super g0> eVar) {
        super(3, eVar);
        this.f8016c = i0Var;
    }

    @Override // eh.q
    public final Object b(pg.b<pg.f0, kotlinx.serialization.json.h> bVar, pg.f0 f0Var, tg.e<? super kotlinx.serialization.json.h> eVar) {
        g0 g0Var = new g0(this.f8016c, eVar);
        g0Var.f8015b = bVar;
        return g0Var.invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        i0 i0Var = this.f8016c;
        n0 n0Var = i0Var.f8027a;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f8014a;
        if (i10 == 0) {
            pg.q.b(obj);
            pg.b bVar = this.f8015b;
            byte bR = n0Var.r();
            if (bR == 1) {
                return i0Var.d(true);
            }
            if (bR == 0) {
                return i0Var.d(false);
            }
            if (bR != 6) {
                if (bR == 8) {
                    return i0Var.c();
                }
                n0.n(n0Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f8014a = 1;
            obj = i0.a(i0Var, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return (kotlinx.serialization.json.h) obj;
    }
}
