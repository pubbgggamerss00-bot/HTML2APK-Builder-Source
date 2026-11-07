package n8;

import android.net.Uri;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.data.repository.DocumentProjectCreator$findImported$2", f = "DocumentProjectCreator.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f extends vg.i implements eh.p<ph.i0, tg.e<? super ProjectEntity>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public String f18434a;

    /* renamed from: b, reason: collision with root package name */
    public int f18435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f18436c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f18437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f18438e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Uri uri, g gVar, String str, tg.e<? super f> eVar) {
        super(2, eVar);
        this.f18436c = uri;
        this.f18437d = gVar;
        this.f18438e = str;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new f(this.f18436c, this.f18437d, this.f18438e, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super ProjectEntity> eVar) {
        return ((f) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f18435b;
        if (i10 == 0) {
            pg.q.b(obj);
            String string = this.f18436c.toString();
            kotlin.jvm.internal.r.d(string, "toString(...)");
            sh.f<List<ProjectEntity>> all = this.f18437d.f18446b.f18583a.getAll();
            this.f18434a = string;
            this.f18435b = 1;
            Object objF = gg.a.f(all, this);
            if (objF == aVar) {
                return aVar;
            }
            str = string;
            obj = objF;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f18434a;
            pg.q.b(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            ProjectEntity projectEntity = (ProjectEntity) obj2;
            if (kotlin.jvm.internal.r.a(ProjectKind.INSTANCE.normalize(projectEntity.getKind()), this.f18438e) && kotlin.jvm.internal.r.a(projectEntity.getSourceUrl(), str)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj3 = arrayList.get(i11);
            i11++;
            String sourcePath = ((ProjectEntity) obj3).getSourcePath();
            if (sourcePath != null && new File(sourcePath).exists()) {
                arrayList2.add(obj3);
            }
        }
        Iterator it = arrayList2.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        long updatedAt = ((ProjectEntity) next).getUpdatedAt();
        do {
            Object next2 = it.next();
            long updatedAt2 = ((ProjectEntity) next2).getUpdatedAt();
            if (updatedAt < updatedAt2) {
                next = next2;
                updatedAt = updatedAt2;
            }
        } while (it.hasNext());
        return next;
    }
}
