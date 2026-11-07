package n8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import f9.fg;
import java.io.File;
import org.bouncycastle.asn1.eac.EACTags;

@vg.e(c = "com.basitce.htmltoapk.data.repository.DocumentProjectCreator$convertToApp$2", f = "DocumentProjectCreator.kt", l = {EACTags.ANSWER_TO_RESET, 89, 91}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a extends vg.i implements eh.p<ph.i0, tg.e<? super ProjectEntity>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Object f18364a;

    /* renamed from: b, reason: collision with root package name */
    public long f18365b;

    /* renamed from: c, reason: collision with root package name */
    public int f18366c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f18367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f18368e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ProjectEntity projectEntity, g gVar, tg.e<? super a> eVar) {
        super(2, eVar);
        this.f18367d = projectEntity;
        this.f18368e = gVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new a(this.f18367d, this.f18368e, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super ProjectEntity> eVar) {
        return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        ProjectEntity projectEntityCopy$default;
        Object objInsert;
        long j10;
        ProjectEntity projectEntityCopy$default2;
        g gVar = this.f18368e;
        s sVar = gVar.f18446b;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f18366c;
        ProjectEntity projectEntity = this.f18367d;
        if (i10 == 0) {
            pg.q.b(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            mh.k kVar = fg.X0;
            projectEntityCopy$default = ProjectEntity.copy$default(this.f18367d, 0L, null, null, fg.f.a(projectEntity.getAppName()), 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, "advanced", false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, ProjectKind.APK, null, jCurrentTimeMillis, jCurrentTimeMillis, -109054986, -1, 2, null);
            this.f18364a = projectEntityCopy$default;
            this.f18366c = 1;
            objInsert = sVar.f18583a.insert(projectEntityCopy$default, this);
            if (objInsert != aVar) {
            }
        }
        if (i10 == 1) {
            projectEntityCopy$default = (ProjectEntity) this.f18364a;
            pg.q.b(obj);
            objInsert = obj;
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Exception exc = (Exception) this.f18364a;
                pg.q.b(obj);
                throw exc;
            }
            j10 = this.f18365b;
            ProjectEntity projectEntity2 = (ProjectEntity) this.f18364a;
            try {
                pg.q.b(obj);
                return projectEntity2;
            } catch (Exception e10) {
                e = e10;
                this.f18364a = e;
                this.f18366c = 3;
                if (gVar.c(j10, this) == aVar) {
                }
            }
        }
        ProjectEntity projectEntity3 = projectEntityCopy$default;
        long jLongValue = ((Number) objInsert).longValue();
        if (jLongValue == 0) {
            throw new IllegalStateException("Failed to insert project");
        }
        try {
            String sourcePath = projectEntity.getSourcePath();
            String absolutePath = null;
            if (sourcePath != null) {
                File file = new File(sourcePath);
                if (!file.exists()) {
                    file = null;
                }
                if (file != null) {
                    File file2 = new File(gVar.d(jLongValue), "content");
                    file2.mkdirs();
                    File file3 = new File(file2, file.getName());
                    ah.l.d(file, file3);
                    absolutePath = file3.getAbsolutePath();
                }
            }
            projectEntityCopy$default2 = ProjectEntity.copy$default(projectEntity3, jLongValue, null, null, null, 0, null, 0, 0, null, null, absolutePath, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -1026, -1, 15, null);
            this.f18364a = projectEntityCopy$default2;
            this.f18365b = jLongValue;
            this.f18366c = 2;
        } catch (Exception e11) {
            e = e11;
            j10 = jLongValue;
            this.f18364a = e;
            this.f18366c = 3;
            if (gVar.c(j10, this) == aVar) {
                throw e;
            }
        }
        return sVar.c(projectEntityCopy$default2, this) == aVar ? aVar : projectEntityCopy$default2;
    }
}
