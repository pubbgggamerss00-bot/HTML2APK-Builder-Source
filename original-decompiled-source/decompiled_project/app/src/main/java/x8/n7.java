package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.util.ArrayList;
import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$projectsState$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n7 extends vg.i implements eh.r<List<? extends ProjectEntity>, List<? extends Long>, List<? extends Long>, tg.e<? super m0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ List f32985a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ List f32986b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ List f32987c;

    @Override // eh.r
    public final Object f(List<? extends ProjectEntity> list, List<? extends Long> list2, List<? extends Long> list3, tg.e<? super m0> eVar) {
        n7 n7Var = new n7(4, eVar);
        n7Var.f32985a = list;
        n7Var.f32986b = list2;
        n7Var.f32987c = list3;
        return n7Var.invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        String sourceUrl;
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        List list = this.f32985a;
        List list2 = this.f32986b;
        List list3 = this.f32987c;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            ProjectEntity projectEntity = (ProjectEntity) obj2;
            if (!mh.x.A(projectEntity.getAppName()) || !mh.x.A(projectEntity.getName()) || projectEntity.getSourcePath() != null || ((sourceUrl = projectEntity.getSourceUrl()) != null && !mh.x.A(sourceUrl))) {
                arrayList.add(obj2);
            }
        }
        if (list3 != null) {
            list2 = list3;
        }
        return new m0(w7.b(arrayList, list2, new h9.b1(2)), false);
    }
}
