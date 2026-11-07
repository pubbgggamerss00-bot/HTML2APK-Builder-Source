package q8;

import t0.jd;
import t0.uc;

@vg.e(c = "com.basitce.htmltoapk.ui.components.SnackbarController$show$1", f = "SnackbarController.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f22343a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f22344b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22345c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f22346d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(String str, String str2, eh.a<pg.f0> aVar, tg.e<? super o2> eVar) {
        super(2, eVar);
        this.f22344b = str;
        this.f22345c = str2;
        this.f22346d = aVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new o2(this.f22344b, this.f22345c, this.f22346d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((o2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        eh.a<pg.f0> aVar;
        ug.a aVar2 = ug.a.f29706a;
        int i10 = this.f22343a;
        if (i10 == 0) {
            pg.q.b(obj);
            uc ucVar = p2.f22362a;
            if (ucVar == null) {
                kotlin.jvm.internal.r.h("hostState");
                throw null;
            }
            this.f22343a = 1;
            obj = uc.b(ucVar, this.f22344b, this.f22345c, this, 8);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        if (((jd) obj) == jd.f26174b && (aVar = this.f22346d) != null) {
            aVar.invoke();
        }
        return pg.f0.f21461a;
    }
}
