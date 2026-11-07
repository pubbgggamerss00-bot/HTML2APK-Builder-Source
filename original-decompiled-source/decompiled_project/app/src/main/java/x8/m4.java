package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeScreenKt$HomeScreen$4$1", f = "HomeScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class m4 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<ProjectEntity> f32931a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<List<Long>> f32932b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(List<ProjectEntity> list, x0.n1<List<Long>> n1Var, tg.e<? super m4> eVar) {
        super(2, eVar);
        this.f32931a = list;
        this.f32932b = n1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new m4(this.f32931a, this.f32932b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((m4) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        boolean z10 = g5.f32665a;
        x0.n1<List<Long>> n1Var = this.f32932b;
        List<Long> value = n1Var.getValue();
        if (value != null) {
            l4 l4Var = new l4();
            List<ProjectEntity> list = this.f32931a;
            if (w7.b(list, value, l4Var).equals(list)) {
                n1Var.setValue(null);
            }
        }
        return pg.f0.f21461a;
    }
}
