package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeScreenKt$HomeScreen$5$1", f = "HomeScreen.kt", l = {330}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n4 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f32973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<ProjectEntity> f32974b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j6 f32975c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f32978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f32979g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(List list, j6 j6Var, x0.n1 n1Var, x0.n1 n1Var2, x0.n1 n1Var3, x0.n1 n1Var4, tg.e eVar) {
        super(2, eVar);
        this.f32974b = list;
        this.f32975c = j6Var;
        this.f32976d = n1Var;
        this.f32977e = n1Var2;
        this.f32978f = n1Var3;
        this.f32979g = n1Var4;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new n4(this.f32974b, this.f32975c, this.f32976d, this.f32977e, this.f32978f, this.f32979g, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((n4) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f32973a;
        if (i10 == 0) {
            pg.q.b(obj);
            boolean z10 = g5.f32665a;
            if (kotlin.jvm.internal.r.a((Boolean) this.f32976d.getValue(), Boolean.FALSE) && !((m0) this.f32977e.getValue()).f32925b && this.f32974b.size() >= 3 && ((List) this.f32978f.getValue()).isEmpty()) {
                this.f32973a = 1;
                if (ph.t0.b(700L, this) == aVar) {
                    return aVar;
                }
            }
            return pg.f0.f21461a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pg.q.b(obj);
        boolean z11 = g5.f32665a;
        this.f32979g.setValue(Boolean.TRUE);
        j6 j6Var = this.f32975c;
        ph.h.c(androidx.lifecycle.x0.a(j6Var), null, null, new h7(j6Var, null), 3);
        return pg.f0.f21461a;
    }
}
