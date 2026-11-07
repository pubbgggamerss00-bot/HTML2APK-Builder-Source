package f9;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.basitce.htmltoapk.domain.model.ProjectLimits;
import java.util.concurrent.CancellationException;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.DocumentConvertViewModel$convert$1", f = "DocumentConvertViewModel.kt", l = {36, 37, 38, 41}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Object f9507a;

    /* renamed from: b, reason: collision with root package name */
    public ProjectLimits f9508b;

    /* renamed from: c, reason: collision with root package name */
    public String f9509c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9510d;

    /* renamed from: e, reason: collision with root package name */
    public int f9511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f9512f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f9513g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ lb f9514h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s8.p0 f9515j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, long j10, lb lbVar, s8.p0 p0Var, tg.e eVar) {
        super(2, eVar);
        this.f9512f = gVar;
        this.f9513g = j10;
        this.f9514h = lbVar;
        this.f9515j = p0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new f(this.f9512f, this.f9513g, this.f9514h, this.f9515j, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((f) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9 A[Catch: all -> 0x0022, Exception -> 0x0025, CancellationException -> 0x0028, TryCatch #1 {CancellationException -> 0x0028, blocks: (B:9:0x001d, B:50:0x00d6, B:20:0x003d, B:43:0x009c, B:45:0x00a9, B:46:0x00b4, B:23:0x0048, B:39:0x007c, B:24:0x004c, B:30:0x0061, B:32:0x0065, B:35:0x006a, B:27:0x0053), top: B:62:0x000f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4 A[Catch: all -> 0x0022, Exception -> 0x0025, CancellationException -> 0x0028, TryCatch #1 {CancellationException -> 0x0028, blocks: (B:9:0x001d, B:50:0x00d6, B:20:0x003d, B:43:0x009c, B:45:0x00a9, B:46:0x00b4, B:23:0x0048, B:39:0x007c, B:24:0x004c, B:30:0x0061, B:32:0x0065, B:35:0x006a, B:27:0x0053), top: B:62:0x000f, outer: #0 }] */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ProjectEntity projectEntity;
        Object objCountByKind;
        boolean z10;
        ProjectEntity projectEntity2;
        ProjectLimits projectLimits;
        eh.l lVar;
        String str = ProjectKind.APK;
        g gVar = this.f9512f;
        n8.s sVar = gVar.f9643b;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f9511e;
        try {
            try {
                try {
                } catch (CancellationException e10) {
                    throw e10;
                }
            } catch (Exception e11) {
                s8.p0 p0Var = this.f9515j;
                String message = e11.getMessage();
                if (message == null) {
                    message = e11.getClass().getSimpleName();
                }
                p0Var.invoke(message);
            }
            if (i10 == 0) {
                pg.q.b(obj);
                long j10 = this.f9513g;
                this.f9511e = 1;
                obj = sVar.f18583a.getById(j10, this);
                if (obj == aVar) {
                }
                return aVar;
            }
            if (i10 == 1) {
                pg.q.b(obj);
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lVar = (eh.l) this.f9507a;
                        pg.q.b(obj);
                        lVar.invoke(new Long(((ProjectEntity) obj).getId()));
                        return pg.f0.f21461a;
                    }
                    boolean z11 = this.f9510d;
                    String str2 = this.f9509c;
                    projectLimits = this.f9508b;
                    projectEntity2 = (ProjectEntity) this.f9507a;
                    pg.q.b(obj);
                    z10 = z11;
                    str = str2;
                    if (projectLimits.canCreate(str, z10, ((Number) obj).intValue())) {
                        sh.z0 z0Var = gVar.f9646e;
                        Boolean bool = Boolean.TRUE;
                        z0Var.getClass();
                        z0Var.j(null, bool);
                        return pg.f0.f21461a;
                    }
                    lb lbVar = this.f9514h;
                    n8.g gVar2 = gVar.f9645d;
                    this.f9507a = lbVar;
                    this.f9508b = null;
                    this.f9509c = null;
                    this.f9511e = 4;
                    gVar2.getClass();
                    wh.c cVar = ph.z0.f21632a;
                    Object objE = ph.h.e(wh.b.f31563c, new n8.a(projectEntity2, gVar2, null), this);
                    if (objE != aVar) {
                        lVar = lbVar;
                        obj = objE;
                        lVar.invoke(new Long(((ProjectEntity) obj).getId()));
                        return pg.f0.f21461a;
                    }
                    return aVar;
                }
                projectEntity = (ProjectEntity) this.f9507a;
                pg.q.b(obj);
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ProjectLimits projectLimits2 = ProjectLimits.INSTANCE;
                this.f9507a = projectEntity;
                this.f9508b = projectLimits2;
                this.f9509c = ProjectKind.APK;
                this.f9510d = zBooleanValue;
                this.f9511e = 3;
                objCountByKind = sVar.f18583a.countByKind(ProjectKind.APK, this);
                if (objCountByKind != aVar) {
                    return aVar;
                }
                z10 = zBooleanValue;
                obj = objCountByKind;
                projectEntity2 = projectEntity;
                projectLimits = projectLimits2;
                if (projectLimits.canCreate(str, z10, ((Number) obj).intValue())) {
                }
            }
            ProjectEntity projectEntity3 = (ProjectEntity) obj;
            if (projectEntity3 == null) {
                return pg.f0.f21461a;
            }
            n8.g1 g1Var = gVar.f9644c.f18530f;
            this.f9507a = projectEntity3;
            this.f9511e = 2;
            Object objF = gg.a.f(g1Var, this);
            if (objF == aVar) {
                return aVar;
            }
            projectEntity = projectEntity3;
            obj = objF;
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            ProjectLimits projectLimits22 = ProjectLimits.INSTANCE;
            this.f9507a = projectEntity;
            this.f9508b = projectLimits22;
            this.f9509c = ProjectKind.APK;
            this.f9510d = zBooleanValue2;
            this.f9511e = 3;
            objCountByKind = sVar.f18583a.countByKind(ProjectKind.APK, this);
            if (objCountByKind != aVar) {
            }
        } finally {
            gVar.f9648g = false;
        }
    }
}
