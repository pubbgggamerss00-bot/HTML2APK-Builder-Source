package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c3 implements eh.a<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<ProjectEntity> f32428a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f32429b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32430c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j6 f32431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<ProjectEntity> f32432e;

    public c3(List<ProjectEntity> list, ProjectEntity projectEntity, int i10, j6 j6Var, List<ProjectEntity> list2) {
        this.f32428a = list;
        this.f32429b = projectEntity;
        this.f32430c = i10;
        this.f32431d = j6Var;
        this.f32432e = list2;
    }

    @Override // eh.a
    public final Boolean invoke() {
        List<ProjectEntity> list = this.f32428a;
        ArrayList arrayList = new ArrayList(qg.p.h(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((ProjectEntity) it.next()).getId()));
        }
        g5.z(this.f32431d, this.f32432e, w7.a(arrayList, this.f32429b.getId(), list.get(this.f32430c - 1).getId()), new n0());
        return Boolean.TRUE;
    }
}
