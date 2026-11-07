package x8;

import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.io.File;
import java.util.Iterator;
import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$3", f = "HomeViewModel.kt", l = {249, 252, 258}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i6 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public j6 f32744a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f32745b;

    /* renamed from: c, reason: collision with root package name */
    public ProjectEntity f32746c;

    /* renamed from: d, reason: collision with root package name */
    public int f32747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j6 f32748e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(j6 j6Var, tg.e<? super i6> eVar) {
        super(2, eVar);
        this.f32748e = j6Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new i6(this.f32748e, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((i6) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        if (r13 != r2) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[Catch: Exception -> 0x00b1, TryCatch #1 {Exception -> 0x00b1, blocks: (B:12:0x0026, B:35:0x008d, B:20:0x0049, B:22:0x004f, B:24:0x0060, B:26:0x006a, B:28:0x0070, B:30:0x0076, B:32:0x007c, B:13:0x002a, B:19:0x0041, B:16:0x0031), top: B:47:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1 A[Catch: Exception -> 0x00d6, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d6, blocks: (B:7:0x0013, B:37:0x00b1, B:40:0x00d1), top: B:47:0x000b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008a -> B:35:0x008d). Please report as a decompilation issue!!! */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE;
        Iterator it;
        j6 j6Var;
        String sourceUrl;
        j6 j6Var2 = this.f32748e;
        n8.s sVar = j6Var2.f32775b;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f32747d;
        if (i10 == 0) {
            pg.q.b(obj);
            sh.f<List<ProjectEntity>> all = sVar.f18583a.getAll();
            this.f32747d = 1;
            obj = gg.a.f(all, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            pg.q.b(obj);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return pg.f0.f21461a;
            }
            ProjectEntity projectEntity = this.f32746c;
            it = this.f32745b;
            j6Var = this.f32744a;
            pg.q.b(obj);
            ah.l.f(new File(j6Var.f32780g.getFilesDir(), "projects/" + projectEntity.getId()));
            while (it.hasNext()) {
                projectEntity = (ProjectEntity) it.next();
                if (mh.x.A(projectEntity.getAppName()) && mh.x.A(projectEntity.getName()) && projectEntity.getSourcePath() == null && ((sourceUrl = projectEntity.getSourceUrl()) == null || mh.x.A(sourceUrl))) {
                    n8.s sVar2 = j6Var.f32775b;
                    this.f32744a = j6Var;
                    this.f32745b = it;
                    this.f32746c = projectEntity;
                    this.f32747d = 2;
                    if (sVar2.a(projectEntity, this) == aVar) {
                        return aVar;
                    }
                    ah.l.f(new File(j6Var.f32780g.getFilesDir(), "projects/" + projectEntity.getId()));
                    while (it.hasNext()) {
                    }
                }
            }
            n8.l lVar = j6Var2.f32776c;
            this.f32744a = null;
            this.f32745b = null;
            this.f32746c = null;
            this.f32747d = 3;
            lVar.getClass();
            wh.c cVar = ph.z0.f21632a;
            objE = ph.h.e(wh.b.f31563c, new n8.q(lVar, sVar, null), this);
            if (objE == ug.a.f29706a) {
                objE = pg.f0.f21461a;
            }
        }
        it = ((List) obj).iterator();
        j6Var = j6Var2;
        while (it.hasNext()) {
        }
        n8.l lVar2 = j6Var2.f32776c;
        this.f32744a = null;
        this.f32745b = null;
        this.f32746c = null;
        this.f32747d = 3;
        lVar2.getClass();
        wh.c cVar2 = ph.z0.f21632a;
        objE = ph.h.e(wh.b.f31563c, new n8.q(lVar2, sVar, null), this);
        if (objE == ug.a.f29706a) {
        }
    }
}
