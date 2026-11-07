package g9;

import androidx.lifecycle.l0;
import ph.i0;
import sh.z0;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.simplebuild.SimpleBuildViewModel$stateFlow$1", f = "SimpleBuildViewModel.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e0 extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f11722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f11723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f11724c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f11725d;

    public static final class a<T> implements sh.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l0 f11726a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f11727b;

        public a(l0 l0Var, String str) {
            this.f11726a = l0Var;
            this.f11727b = str;
        }

        @Override // sh.g
        public final Object c(T t3, tg.e<? super pg.f0> eVar) {
            this.f11726a.c(t3, this.f11727b);
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(z0 z0Var, l0 l0Var, String str, tg.e eVar) {
        super(2, eVar);
        this.f11723b = z0Var;
        this.f11724c = l0Var;
        this.f11725d = str;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new e0(this.f11723b, this.f11724c, this.f11725d, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
        ((e0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        return ug.a.f29706a;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f11722a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            throw new pg.g();
        }
        pg.q.b(obj);
        a aVar2 = new a(this.f11724c, this.f11725d);
        this.f11722a = 1;
        this.f11723b.b(aVar2, this);
        return aVar;
    }
}
