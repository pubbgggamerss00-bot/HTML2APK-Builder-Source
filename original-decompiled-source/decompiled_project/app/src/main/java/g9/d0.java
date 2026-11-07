package g9;

import android.app.Application;
import android.net.Uri;
import com.basitce.htmltoapk.R;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import ph.i0;
import sh.z0;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.simplebuild.SimpleBuildViewModel$persistPdfFile$1", f = "SimpleBuildViewModel.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d0 extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f11714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f11715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f11716c;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.simplebuild.SimpleBuildViewModel$persistPdfFile$1$file$1", f = "SimpleBuildViewModel.kt", l = {73}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<i0, tg.e<? super File>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11717a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y f11718b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f11719c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y yVar, Uri uri, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f11718b = yVar;
            this.f11719c = uri;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f11718b, this.f11719c, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super File> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws IOException {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f11717a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return obj;
            }
            pg.q.b(obj);
            y yVar = this.f11718b;
            Application application = yVar.f11829c;
            File file = new File(yVar.l(), "content");
            this.f11717a = 1;
            File fileA = l9.e0.a(application, this.f11719c, file, this);
            return fileA == aVar ? aVar : fileA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(y yVar, Uri uri, tg.e<? super d0> eVar) {
        super(2, eVar);
        this.f11715b = yVar;
        this.f11716c = uri;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new d0(this.f11715b, this.f11716c, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((d0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        y yVar = this.f11715b;
        z0 z0Var = yVar.f11835i;
        z0 z0Var2 = yVar.f11831e;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f11714a;
        try {
            try {
                if (i10 == 0) {
                    pg.q.b(obj);
                    Boolean bool = Boolean.TRUE;
                    z0Var2.getClass();
                    z0Var2.j(null, bool);
                    wh.c cVar = ph.z0.f21632a;
                    wh.b bVar = wh.b.f31563c;
                    a aVar2 = new a(yVar, this.f11716c, null);
                    this.f11714a = 1;
                    obj = ph.h.e(bVar, aVar2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                }
                File file = (File) obj;
                yVar.f11840n.setValue(Uri.fromFile(file));
                yVar.f11841o.setValue(file.getName());
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
                yVar.m(null);
            } catch (Exception e10) {
                if (e10 instanceof CancellationException) {
                    throw e10;
                }
                String message = e10.getMessage();
                if (message == null) {
                    message = yVar.f11829c.getString(R.string.pdf_invalid);
                    kotlin.jvm.internal.r.d(message, "getString(...)");
                }
                yVar.m(message);
            }
            return pg.f0.f21461a;
        } finally {
            Boolean bool2 = Boolean.FALSE;
            z0Var2.getClass();
            z0Var2.j(null, bool2);
        }
    }
}
