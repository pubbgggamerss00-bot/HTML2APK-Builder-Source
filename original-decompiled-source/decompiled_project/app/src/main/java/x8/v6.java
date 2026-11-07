package x8;

import android.content.Context;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.basitce.htmltoapk.domain.model.ProjectLimits;
import java.io.File;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$duplicateProject$1", f = "HomeViewModel.kt", l = {480, 492, 497, 516}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class v6 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Object f33281a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f33282b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33283c;

    /* renamed from: d, reason: collision with root package name */
    public long f33284d;

    /* renamed from: e, reason: collision with root package name */
    public int f33285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f33286f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j6 f33287g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f33288h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f33289j;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$duplicateProject$1$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f33290a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ProjectEntity f33291b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j6 f33292c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f33293d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, ProjectEntity projectEntity, j6 j6Var, LinkedHashMap linkedHashMap, tg.e eVar) {
            super(2, eVar);
            this.f33290a = file;
            this.f33291b = projectEntity;
            this.f33292c = j6Var;
            this.f33293d = linkedHashMap;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f33290a, this.f33291b, this.f33292c, this.f33293d, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            pg.n nVarH;
            pg.n nVarH2;
            pg.n nVarH3;
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            File file = this.f33290a;
            file.mkdirs();
            ProjectEntity projectEntity = this.f33291b;
            String sourcePath = projectEntity.getSourcePath();
            LinkedHashMap linkedHashMap = this.f33293d;
            j6 j6Var = this.f33292c;
            if (sourcePath != null && (nVarH3 = j6.h(j6Var, sourcePath, file, "content")) != null) {
                linkedHashMap.put(nVarH3.f21469a, nVarH3.f21470b);
            }
            String iconPath = projectEntity.getIconPath();
            if (iconPath != null && (nVarH2 = j6.h(j6Var, iconPath, file, "icons")) != null) {
                linkedHashMap.put(nVarH2.f21469a, nVarH2.f21470b);
            }
            String splashPath = projectEntity.getSplashPath();
            if (splashPath == null || (nVarH = j6.h(j6Var, splashPath, file, "splash")) == null) {
                return null;
            }
            linkedHashMap.put(nVarH.f21469a, nVarH.f21470b);
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(ProjectEntity projectEntity, j6 j6Var, String str, Context context, tg.e<? super v6> eVar) {
        super(2, eVar);
        this.f33286f = projectEntity;
        this.f33287g = j6Var;
        this.f33288h = str;
        this.f33289j = context;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new v6(this.f33286f, this.f33287g, this.f33288h, this.f33289j, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((v6) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0244, code lost:
    
        if (r7.c(r1, r92) != r8) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0157  */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.Map] */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objCountByKind;
        String str;
        boolean z10;
        ProjectLimits projectLimits;
        ProjectEntity projectEntityCopy$default;
        ProjectEntity projectEntity;
        Object objInsert;
        long jLongValue;
        LinkedHashMap linkedHashMap;
        ProjectEntity projectEntity2;
        long j10;
        j6 j6Var = this.f33287g;
        n8.s sVar = j6Var.f32775b;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33285e;
        ProjectEntity projectEntity3 = this.f33286f;
        if (i10 == 0) {
            pg.q.b(obj);
            String strNormalize = ProjectKind.INSTANCE.normalize(projectEntity3.getKind());
            ProjectLimits projectLimits2 = ProjectLimits.INSTANCE;
            boolean zBooleanValue = ((Boolean) j6Var.f32784k.f25021a.getValue()).booleanValue();
            this.f33281a = projectLimits2;
            this.f33282b = strNormalize;
            this.f33283c = zBooleanValue;
            this.f33285e = 1;
            objCountByKind = sVar.f18583a.countByKind(strNormalize, this);
            if (objCountByKind != aVar) {
                str = strNormalize;
                z10 = zBooleanValue;
                projectLimits = projectLimits2;
            }
            return aVar;
        }
        if (i10 == 1) {
            z10 = this.f33283c;
            String str2 = (String) this.f33282b;
            ProjectLimits projectLimits3 = (ProjectLimits) this.f33281a;
            pg.q.b(obj);
            projectLimits = projectLimits3;
            str = str2;
            objCountByKind = obj;
        } else {
            if (i10 == 2) {
                projectEntityCopy$default = (ProjectEntity) this.f33281a;
                pg.q.b(obj);
                objInsert = obj;
                projectEntity = projectEntity3;
                ProjectEntity projectEntity4 = projectEntityCopy$default;
                jLongValue = ((Number) objInsert).longValue();
                if (jLongValue != 0) {
                    return pg.f0.f21461a;
                }
                File file = new File(this.f33289j.getFilesDir(), m0.r.a("projects/", jLongValue));
                linkedHashMap = new LinkedHashMap();
                wh.c cVar = ph.z0.f21632a;
                wh.b bVar = wh.b.f31563c;
                a aVar2 = new a(file, projectEntity, j6Var, linkedHashMap, null);
                this.f33281a = projectEntity4;
                this.f33282b = linkedHashMap;
                this.f33284d = jLongValue;
                this.f33285e = 3;
                if (ph.h.e(bVar, aVar2, this) != aVar) {
                    projectEntity2 = projectEntity4;
                    j10 = jLongValue;
                    ProjectEntity projectEntityCopy$default2 = ProjectEntity.copy$default(projectEntity2, j10, null, null, null, 0, null, 0, 0, null, null, (String) linkedHashMap.get(projectEntity.getSourcePath()), null, null, (String) linkedHashMap.get(projectEntity.getIconPath()), (String) linkedHashMap.get(projectEntity.getSplashPath()), null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -25602, -1, 15, null);
                    this.f33281a = null;
                    this.f33282b = null;
                    this.f33285e = 4;
                }
                return aVar;
            }
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return pg.f0.f21461a;
            }
            long j11 = this.f33284d;
            ?? r32 = (Map) this.f33282b;
            ProjectEntity projectEntity5 = (ProjectEntity) this.f33281a;
            pg.q.b(obj);
            j10 = j11;
            linkedHashMap = r32;
            projectEntity2 = projectEntity5;
            projectEntity = projectEntity3;
            ProjectEntity projectEntityCopy$default22 = ProjectEntity.copy$default(projectEntity2, j10, null, null, null, 0, null, 0, 0, null, null, (String) linkedHashMap.get(projectEntity.getSourcePath()), null, null, (String) linkedHashMap.get(projectEntity.getIconPath()), (String) linkedHashMap.get(projectEntity.getSplashPath()), null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -25602, -1, 15, null);
            this.f33281a = null;
            this.f33282b = null;
            this.f33285e = 4;
        }
        if (!projectLimits.canCreate(str, z10, ((Number) objCountByKind).intValue())) {
            return pg.f0.f21461a;
        }
        projectEntityCopy$default = ProjectEntity.copy$default(projectEntity3, 0L, this.f33288h, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, System.currentTimeMillis(), System.currentTimeMillis(), -25604, -1, 3, null);
        projectEntity = projectEntity3;
        this.f33281a = projectEntityCopy$default;
        this.f33282b = null;
        this.f33285e = 2;
        objInsert = sVar.f18583a.insert(projectEntityCopy$default, this);
        if (objInsert != aVar) {
            ProjectEntity projectEntity42 = projectEntityCopy$default;
            jLongValue = ((Number) objInsert).longValue();
            if (jLongValue != 0) {
            }
        }
        return aVar;
    }
}
