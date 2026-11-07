package f9;

import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.io.File;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$clearSplash$1", f = "ProjectEditorViewModel.kt", l = {854, 856}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ig extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f9826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg f9827b;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$clearSplash$1$2", f = "ProjectEditorViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fg f9828a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f9829b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, fg fgVar, tg.e eVar) {
            super(2, eVar);
            this.f9828a = fgVar;
            this.f9829b = j10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f9829b, this.f9828a, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            long j10 = this.f9829b;
            fg fgVar = this.f9828a;
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            try {
                ah.l.f(new File(fgVar.w(j10), "splash"));
                if (j10 == 0) {
                    ah.l.f(new File(fgVar.f9562f.getFilesDir(), "projects/draft/splash"));
                }
            } catch (Exception e10) {
                BuildLogger buildLogger = BuildLogger.INSTANCE;
                String message = e10.getMessage();
                if (message == null) {
                    message = "";
                }
                buildLogger.error(R.string.build_log_editor_splash_delete_error, message);
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig(fg fgVar, tg.e<? super ig> eVar) {
        super(2, eVar);
        this.f9827b = fgVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new ig(this.f9827b, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((ig) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (ph.h.e(r8, r1, r7) == r0) goto L19;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f9826a;
        fg fgVar = this.f9827b;
        if (i10 == 0) {
            pg.q.b(obj);
            hg hgVar = new hg();
            this.f9826a = 1;
            mh.k kVar = fg.X0;
            if (fgVar.G(hgVar, this) != aVar) {
            }
            return aVar;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
        pg.q.b(obj);
        ProjectEntity projectEntity = (ProjectEntity) fgVar.f9566h.getValue();
        long id2 = projectEntity != null ? projectEntity.getId() : 0L;
        wh.c cVar = ph.z0.f21632a;
        wh.b bVar = wh.b.f31563c;
        a aVar2 = new a(id2, fgVar, null);
        this.f9826a = 2;
    }
}
