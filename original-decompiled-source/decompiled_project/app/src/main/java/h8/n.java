package h8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import f9.fg;
import h8.m;
import h8.t;
import java.io.File;
import java.io.IOException;
import mh.x;
import mh.y;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import pg.f0;
import ph.i0;

@vg.e(c = "com.basitce.htmltoapk.ai.AiProjectStore$create$2", f = "AiProjectStore.kt", l = {HeaderItem.FIELD_START_OFFSET, 90}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n extends vg.i implements eh.p<i0, tg.e<? super pg.n<? extends Long, ? extends m.a>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Object f12424a;

    /* renamed from: b, reason: collision with root package name */
    public long f12425b;

    /* renamed from: c, reason: collision with root package name */
    public int f12426c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t.b f12427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f12428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f12429f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t.b bVar, String str, m mVar, tg.e<? super n> eVar) {
        super(2, eVar);
        this.f12427d = bVar;
        this.f12428e = str;
        this.f12429f = mVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new n(this.f12427d, this.f12428e, this.f12429f, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super pg.n<? extends Long, ? extends m.a>> eVar) {
        return ((n) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws IOException {
        Object objInsert;
        ProjectEntity projectEntity;
        m.a aVar;
        long j10;
        ug.a aVar2 = ug.a.f29706a;
        int i10 = this.f12426c;
        if (i10 == 0) {
            pg.q.b(obj);
            String strB0 = this.f12427d.f12458b.f12463a;
            if (strB0 == null) {
                strB0 = y.b0(30, this.f12428e);
                if (x.A(strB0)) {
                    strB0 = "AI App";
                }
            }
            String str = strB0;
            mh.k kVar = fg.X0;
            String str2 = (String) fg.f.c("", str).f21469a;
            n8.i iVar = this.f12429f.f12418c;
            Long l10 = iVar.f18471c;
            iVar.f18471c = null;
            ProjectEntity projectEntity2 = new ProjectEntity(0L, str, str, str2, 1, "1.0", 24, 36, null, "local", null, null, "[\"android.permission.INTERNET\",\"android.permission.ACCESS_NETWORK_STATE\",\"android.permission.VIBRATE\"]", null, null, "#2196F3", "portrait", false, false, false, false, false, "{}", null, ProjectKind.APK, "advanced", false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, l10, 0L, 0L, -54629119, -1, 13, null);
            n8.s sVar = this.f12429f.f12417b;
            this.f12424a = projectEntity2;
            this.f12426c = 1;
            objInsert = sVar.f18583a.insert(projectEntity2, this);
            if (objInsert != aVar2) {
                projectEntity = projectEntity2;
            }
            return aVar2;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = this.f12425b;
            aVar = (m.a) this.f12424a;
            pg.q.b(obj);
            return new pg.n(new Long(j10), aVar);
        }
        ProjectEntity projectEntity3 = (ProjectEntity) this.f12424a;
        pg.q.b(obj);
        projectEntity = projectEntity3;
        objInsert = obj;
        long jLongValue = ((Number) objInsert).longValue();
        if (jLongValue == 0) {
            throw new IllegalStateException("Failed to save project");
        }
        File fileD = this.f12429f.d(jLongValue);
        File parentFile = fileD.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        m.b(this.f12429f, fileD, this.f12427d.f12457a);
        ProjectEntity projectEntityCopy$default = ProjectEntity.copy$default(projectEntity, jLongValue, null, null, null, 0, null, 0, 0, null, null, fileD.getAbsolutePath(), null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -1026, -1, 15, null);
        m mVar = this.f12429f;
        t.b bVar = this.f12427d;
        pg.n nVarA = m.a(mVar, projectEntityCopy$default, bVar.f12458b, bVar.f12457a);
        ProjectEntity projectEntity4 = (ProjectEntity) nVarA.f21469a;
        m.a aVar3 = (m.a) nVarA.f21470b;
        n8.s sVar2 = this.f12429f.f12417b;
        this.f12424a = aVar3;
        this.f12425b = jLongValue;
        this.f12426c = 2;
        if (sVar2.c(projectEntity4, this) != aVar2) {
            aVar = aVar3;
            j10 = jLongValue;
            return new pg.n(new Long(j10), aVar);
        }
        return aVar2;
    }
}
