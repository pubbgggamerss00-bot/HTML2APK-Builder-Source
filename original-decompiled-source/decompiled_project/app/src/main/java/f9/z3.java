package f9;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.HtmlEditorScreenKt$HtmlEditorScreen$save$1", f = "HtmlEditorScreen.kt", l = {309}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class z3 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f11067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fg f11069c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f11070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eh.a<pg.f0> f11071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Uri f11072f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f11073g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f11074h;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.HtmlEditorScreenKt$HtmlEditorScreen$save$1$1", f = "HtmlEditorScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f11075a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Uri f11076b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f11077c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Uri uri, String str, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f11075a = context;
            this.f11076b = uri;
            this.f11077c = str;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f11075a, this.f11076b, this.f11077c, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws IOException {
            OutputStream outputStreamOpenOutputStream;
            BufferedWriter bufferedWriter;
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            List<String> list = d1.f9265a;
            Context context = this.f11075a;
            kotlin.jvm.internal.r.e(context, "context");
            Uri uri = this.f11076b;
            kotlin.jvm.internal.r.e(uri, "uri");
            String content = this.f11077c;
            kotlin.jvm.internal.r.e(content, "content");
            if (kotlin.jvm.internal.r.a(uri.getScheme(), "content")) {
                try {
                    outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri, "wt");
                } catch (IllegalArgumentException unused) {
                    outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri, "w");
                }
                if (outputStreamOpenOutputStream == null) {
                    throw new IOException(context.getString(R.string.editor_invalid_file_uri));
                }
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStreamOpenOutputStream, mh.a.f18238b), 8192);
                try {
                    bufferedWriter.write(content);
                    pg.f0 f0Var = pg.f0.f21461a;
                    bufferedWriter.close();
                } finally {
                }
            } else {
                String path = uri.getPath();
                if (path == null) {
                    throw new IllegalArgumentException(context.getString(R.string.editor_invalid_file_uri));
                }
                File file = new File(path);
                File file2 = new File(file.getParentFile(), i8.n.d(".", file.getName(), ".saving"));
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2), mh.a.f18238b), 8192);
                    try {
                        bufferedWriter.write(content);
                        pg.f0 f0Var2 = pg.f0.f21461a;
                        bufferedWriter.close();
                        Files.move(file2.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
                    } finally {
                    }
                } finally {
                    file2.delete();
                }
            }
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(String str, fg fgVar, Context context, eh.a<pg.f0> aVar, Uri uri, x0.n1<String> n1Var, x0.n1<Boolean> n1Var2, tg.e<? super z3> eVar) {
        super(2, eVar);
        this.f11068b = str;
        this.f11069c = fgVar;
        this.f11070d = context;
        this.f11071e = aVar;
        this.f11072f = uri;
        this.f11073g = n1Var;
        this.f11074h = n1Var2;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new z3(this.f11068b, this.f11069c, this.f11070d, this.f11071e, this.f11072f, this.f11073g, this.f11074h, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((z3) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f11067a;
        x0.n1<Boolean> n1Var = this.f11074h;
        String str = this.f11068b;
        Context context = this.f11070d;
        try {
            try {
                if (i10 == 0) {
                    pg.q.b(obj);
                    wh.c cVar = ph.z0.f21632a;
                    wh.b bVar = wh.b.f31563c;
                    a aVar2 = new a(context, this.f11072f, str, null);
                    this.f11067a = 1;
                    if (ph.h.e(bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pg.q.b(obj);
                }
                x0.n1<String> n1Var2 = this.f11073g;
                List<String> list = d1.f9265a;
                n1Var2.setValue(str);
                this.f11069c.B.setValue(str);
                BuildLogger buildLogger = BuildLogger.INSTANCE;
                String string = context.getString(R.string.editor_html_saved);
                kotlin.jvm.internal.r.d(string, "getString(...)");
                buildLogger.success(string);
                eh.a<pg.f0> aVar3 = this.f11071e;
                if (aVar3 != null) {
                    aVar3.invoke();
                } else {
                    Toast.makeText(context, R.string.editor_html_saved, 0).show();
                }
            } catch (Exception e10) {
                Toast.makeText(context, context.getString(R.string.editor_html_save_error, e10.getMessage()), 1).show();
                List<String> list2 = d1.f9265a;
            }
            n1Var.setValue(Boolean.FALSE);
            return pg.f0.f21461a;
        } catch (Throwable th2) {
            List<String> list3 = d1.f9265a;
            n1Var.setValue(Boolean.FALSE);
            throw th2;
        }
    }
}
