package x8;

import com.basitce.htmltoapk.data.local.entity.FolderEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeFoldersKt$FolderRow$1$1", f = "HomeFolders.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class x extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<FolderEntity> f33329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Long> f33330b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<List<Long>> f33331c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(List<FolderEntity> list, x0.n1<Long> n1Var, x0.n1<List<Long>> n1Var2, tg.e<? super x> eVar) {
        super(2, eVar);
        this.f33329a = list;
        this.f33330b = n1Var;
        this.f33331c = n1Var2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new x(this.f33329a, this.f33330b, this.f33331c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((x) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        float f10 = s.f33139a;
        if (this.f33330b.getValue() == null) {
            x0.n1<List<Long>> n1Var = this.f33331c;
            List<Long> value = n1Var.getValue();
            List<FolderEntity> list = this.f33329a;
            ArrayList arrayList = new ArrayList(qg.p.h(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Long(((FolderEntity) it.next()).getId()));
            }
            if (kotlin.jvm.internal.r.a(value, arrayList)) {
                n1Var.setValue(null);
            }
        }
        return pg.f0.f21461a;
    }
}
