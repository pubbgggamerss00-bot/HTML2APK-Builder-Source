package f9;

import android.app.Application;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.r;
import pg.p;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.ProjectEditorViewModel$scanPermissionsFromCode$1", f = "ProjectEditorViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class jh extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fg f9899a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh(fg fgVar, tg.e<? super jh> eVar) {
        super(2, eVar);
        this.f9899a = fgVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new jh(this.f9899a, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((jh) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [pg.p$a] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List listC;
        ?? A;
        y2.c0 c0Var;
        String str;
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        fg fgVar = this.f9899a;
        r4 r4Var = fgVar.G;
        if (r4Var == null || (c0Var = r4Var.f10363b) == null || (str = c0Var.f33682a.f27761b) == null) {
            p8.f fVar = p8.f.f21355a;
            Application context = fgVar.f9562f;
            Uri uri = (Uri) fgVar.F.getValue();
            fVar.getClass();
            kotlin.jvm.internal.r.e(context, "context");
            listC = qg.z.f22752a;
            if (uri != null) {
                try {
                } catch (Throwable th2) {
                    A = pg.q.a(th2);
                }
                if (kotlin.jvm.internal.r.a(uri.getScheme(), "file")) {
                    String path = uri.getPath();
                    if (path != null) {
                        File file = new File(path);
                        if (file.isDirectory()) {
                            final kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                            A = lh.j.k(new lh.p(new lh.o(lh.j.i(ah.l.p(file), new p8.d(0)), new eh.l() { // from class: p8.e
                                @Override // eh.l
                                public final Object invoke(Object obj2) {
                                    File it = (File) obj2;
                                    r.e(it, "it");
                                    f0 f0Var2 = f0Var;
                                    long length = it.length() + f0Var2.f16326a;
                                    f0Var2.f16326a = length;
                                    return Boolean.valueOf(length <= 25165824);
                                }
                            }), new e9.n(1)));
                        } else {
                            String name = file.getName();
                            kotlin.jvm.internal.r.d(name, "getName(...)");
                            if (mh.t.i(name, ".zip", true)) {
                                FileInputStream fileInputStream = new FileInputStream(file);
                                try {
                                    A = p8.f.b(fileInputStream);
                                    fileInputStream.close();
                                } finally {
                                }
                            } else {
                                if (file.length() > 4194304) {
                                    file = null;
                                }
                                String strK = file != null ? ah.l.k(file, mh.a.f18238b) : null;
                                A = strK != null ? c0.g0.c(strK) : listC;
                            }
                        }
                        if (!(A instanceof p.a)) {
                            listC = A;
                        }
                        listC = listC;
                    }
                } else {
                    InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream != null) {
                        try {
                            List listC2 = c0.g0.c(p8.f.a(inputStreamOpenInputStream));
                            inputStreamOpenInputStream.close();
                            A = listC2;
                        } finally {
                        }
                    } else {
                        A = 0;
                    }
                    if (A == 0) {
                    }
                    if (!(A instanceof p.a)) {
                    }
                    listC = listC;
                }
            }
        } else {
            listC = c0.g0.c(str);
        }
        sh.z0 z0Var = fgVar.f9565g0;
        LinkedHashMap linkedHashMap = p8.c.c(listC).f21349a;
        z0Var.getClass();
        z0Var.j(null, linkedHashMap);
        return pg.f0.f21461a;
    }
}
