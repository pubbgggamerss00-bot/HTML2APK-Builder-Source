package h8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import h8.m;
import java.io.File;
import java.io.IOException;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import pg.f0;
import ph.i0;

@vg.e(c = "com.basitce.htmltoapk.ai.AiProjectStore$update$2", f = "AiProjectStore.kt", l = {HeaderItem.CLASS_COUNT_OFFSET, 101, 103}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r extends vg.i implements eh.p<i0, tg.e<? super m.a>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Object f12441a;

    /* renamed from: b, reason: collision with root package name */
    public int f12442b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f12443c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f12444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f12445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f12446f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(m mVar, long j10, String str, u uVar, tg.e<? super r> eVar) {
        super(2, eVar);
        this.f12443c = mVar;
        this.f12444d = j10;
        this.f12445e = str;
        this.f12446f = uVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new r(this.f12443c, this.f12444d, this.f12445e, this.f12446f, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super m.a> eVar) {
        return ((r) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r6 == r3) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0192 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0193 A[RETURN] */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        Object byId;
        ProjectEntity projectEntity;
        String str;
        Object objH;
        File fileD;
        String sourcePath;
        m mVar = this.f12443c;
        n8.s sVar = mVar.f12417b;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f12442b;
        long j10 = this.f12444d;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f12442b = 1;
            byId = sVar.f18583a.getById(j10, this);
            if (byId != aVar) {
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m.a aVar2 = (m.a) this.f12441a;
                pg.q.b(obj);
                return aVar2;
            }
            projectEntity = (ProjectEntity) this.f12441a;
            pg.q.b(obj);
            objH = obj;
            str = (String) objH;
            if (str == null) {
                str = "";
            }
            ProjectEntity projectEntity2 = projectEntity;
            sourcePath = projectEntity2.getSourcePath();
            if (sourcePath == null) {
                sourcePath = mVar.d(j10).getAbsolutePath();
            }
            pg.n nVarA = m.a(mVar, ProjectEntity.copy$default(projectEntity2, 0L, null, null, null, 0, null, 0, 0, null, null, sourcePath, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -1025, -1, 15, null), this.f12446f, str);
            ProjectEntity projectEntity3 = (ProjectEntity) nVarA.f21469a;
            m.a aVar3 = (m.a) nVarA.f21470b;
            ProjectEntity projectEntityCopy$default = ProjectEntity.copy$default(projectEntity3, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, System.currentTimeMillis(), -1, -1, 7, null);
            this.f12441a = aVar3;
            this.f12442b = 3;
            return sVar.c(projectEntityCopy$default, this) != aVar ? aVar : aVar3;
        }
        pg.q.b(obj);
        byId = obj;
        projectEntity = (ProjectEntity) byId;
        if (projectEntity == null) {
            throw new IllegalStateException(("Project " + j10 + " is gone").toString());
        }
        str = this.f12445e;
        if (str != null) {
            String sourcePath2 = projectEntity.getSourcePath();
            if (sourcePath2 != null) {
                fileD = new File(sourcePath2);
            } else {
                fileD = mVar.d(j10);
                File parentFile = fileD.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
            }
            m.b(mVar, fileD, str);
            ProjectEntity projectEntity22 = projectEntity;
            sourcePath = projectEntity22.getSourcePath();
            if (sourcePath == null) {
            }
            pg.n nVarA2 = m.a(mVar, ProjectEntity.copy$default(projectEntity22, 0L, null, null, null, 0, null, 0, 0, null, null, sourcePath, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -1025, -1, 15, null), this.f12446f, str);
            ProjectEntity projectEntity32 = (ProjectEntity) nVarA2.f21469a;
            m.a aVar32 = (m.a) nVarA2.f21470b;
            ProjectEntity projectEntityCopy$default2 = ProjectEntity.copy$default(projectEntity32, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, System.currentTimeMillis(), -1, -1, 7, null);
            this.f12441a = aVar32;
            this.f12442b = 3;
            if (sVar.c(projectEntityCopy$default2, this) != aVar) {
            }
        } else {
            this.f12441a = projectEntity;
            this.f12442b = 2;
            objH = mVar.h(j10, this);
        }
    }
}
