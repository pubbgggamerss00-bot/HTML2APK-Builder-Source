package f9;

import android.app.Application;
import android.net.Uri;
import android.widget.Toast;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$persistPdfFile$1", f = "ProjectEditorViewModel.kt", l = {698, 704}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ug extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f10743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg f10744b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f10745c;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$persistPdfFile$1$file$1", f = "ProjectEditorViewModel.kt", l = {699}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super File>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f10746a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fg f10747b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f10748c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fg fgVar, Uri uri, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f10747b = fgVar;
            this.f10748c = uri;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f10747b, this.f10748c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super File> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws IOException {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f10746a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return obj;
            }
            pg.q.b(obj);
            fg fgVar = this.f10747b;
            Application application = fgVar.f9562f;
            ProjectEntity projectEntity = (ProjectEntity) fgVar.f9566h.getValue();
            File file = new File(fgVar.w(projectEntity != null ? projectEntity.getId() : 0L), "content");
            this.f10746a = 1;
            File fileA = l9.e0.a(application, this.f10748c, file, this);
            return fileA == aVar ? aVar : fileA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(fg fgVar, Uri uri, tg.e<? super ug> eVar) {
        super(2, eVar);
        this.f10744b = fgVar;
        this.f10745c = uri;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new ug(this.f10744b, this.f10745c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((ug) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c8, code lost:
    
        if (r0.G(r2, r13) == r4) goto L25;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fg fgVar = this.f10744b;
        Application application = fgVar.f9562f;
        sh.z0 z0Var = fgVar.f9586r;
        sh.z0 z0Var2 = fgVar.f9582p;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f10743a;
        try {
            try {
            } catch (Exception e10) {
                if (e10 instanceof CancellationException) {
                    throw e10;
                }
                String message = e10.getMessage();
                if (message == null) {
                    message = application.getString(R.string.pdf_invalid);
                    kotlin.jvm.internal.r.d(message, "getString(...)");
                }
                Toast.makeText(application, message, 1).show();
            }
            if (i10 == 0) {
                pg.q.b(obj);
                Boolean bool = Boolean.TRUE;
                z0Var2.getClass();
                z0Var2.j(null, bool);
                wh.c cVar = ph.z0.f21632a;
                wh.b bVar = wh.b.f31563c;
                a aVar2 = new a(fgVar, this.f10745c, null);
                this.f10743a = 1;
                obj = ph.h.e(bVar, aVar2, this);
                if (obj == aVar) {
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
            File file = (File) obj;
            fgVar.D.setValue(Uri.fromFile(file));
            fgVar.E.setValue(file.getName());
            if (mh.x.A((CharSequence) z0Var.getValue())) {
                String name = file.getName();
                kotlin.jvm.internal.r.d(name, "getName(...)");
                String strV = mh.x.V(name, '.');
                Pattern patternCompile = Pattern.compile("[_\\-]+");
                kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
                String strReplaceAll = patternCompile.matcher(strV).replaceAll(" ");
                kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
                Pattern patternCompile2 = Pattern.compile("\\s+");
                kotlin.jvm.internal.r.d(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll(" ");
                kotlin.jvm.internal.r.d(strReplaceAll2, "replaceAll(...)");
                String strB0 = mh.y.b0(30, mh.x.W(strReplaceAll2).toString());
                z0Var.getClass();
                z0Var.j(null, strB0);
            }
            f8.r rVar = new f8.r(file, 1);
            this.f10743a = 2;
        } finally {
            Boolean bool2 = Boolean.FALSE;
            z0Var2.getClass();
            z0Var2.j(null, bool2);
        }
    }
}
