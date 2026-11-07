package f9;

import android.content.Context;
import android.net.Uri;
import com.basitce.htmltoapk.R;
import f9.t4;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.HtmlEditorScreenKt$HtmlEditorScreen$2$1", f = "HtmlEditorScreen.kt", l = {234, 250}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f9651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f9652b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fg f9653c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.n1 f9654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f9655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x0.n1<Boolean> f9656f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0.n1<y2.c0> f9657g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0.n1<String> f9658h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x0.n1<j> f9659j;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.editor.HtmlEditorScreenKt$HtmlEditorScreen$2$1$loaded$1", f = "HtmlEditorScreen.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super t4>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f9660a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Uri f9661b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Uri uri, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f9660a = context;
            this.f9661b = uri;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f9660a, this.f9661b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super t4> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws IOException {
            InputStream fileInputStream;
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            Uri uri = this.f9661b;
            List<String> list = d1.f9265a;
            Context context = this.f9660a;
            kotlin.jvm.internal.r.e(context, "context");
            try {
                String scheme = uri.getScheme();
                if (scheme != null && scheme.hashCode() == 951530617 && scheme.equals("content")) {
                    fileInputStream = context.getContentResolver().openInputStream(uri);
                } else {
                    String path = uri.getPath();
                    fileInputStream = path != null ? new FileInputStream(new File(path)) : null;
                }
                if (fileInputStream == null) {
                    return t4.a.f10556a;
                }
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[65536];
                    long j10 = 0;
                    while (true) {
                        int i10 = fileInputStream.read(bArr);
                        if (i10 < 0) {
                            String string = byteArrayOutputStream.toString(mh.a.f18238b.name());
                            kotlin.jvm.internal.r.d(string, "toString(...)");
                            t4.b bVar = new t4.b(string);
                            fileInputStream.close();
                            return bVar;
                        }
                        j10 += i10;
                        if (j10 > 2097152) {
                            t4.c cVar = t4.c.f10558a;
                            fileInputStream.close();
                            return cVar;
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                    }
                } finally {
                }
            } catch (Exception unused) {
                return t4.a.f10556a;
            } catch (OutOfMemoryError unused2) {
                return t4.a.f10556a;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(Context context, fg fgVar, x0.n1 n1Var, x0.n1 n1Var2, x0.n1 n1Var3, x0.n1 n1Var4, x0.n1 n1Var5, x0.n1 n1Var6, tg.e eVar) {
        super(2, eVar);
        this.f9652b = context;
        this.f9653c = fgVar;
        this.f9654d = n1Var;
        this.f9655e = n1Var2;
        this.f9656f = n1Var3;
        this.f9657g = n1Var4;
        this.f9658h = n1Var5;
        this.f9659j = n1Var6;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new g2(this.f9652b, this.f9653c, this.f9654d, this.f9655e, this.f9656f, this.f9657g, this.f9658h, this.f9659j, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((g2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (ph.t0.b(1500, r11) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        if (r12 == r0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f9651a;
        x0.n1<j> n1Var = this.f9659j;
        x0.n1<String> n1Var2 = this.f9658h;
        x0.n1<y2.c0> n1Var3 = this.f9657g;
        x0.n1<Boolean> n1Var4 = this.f9656f;
        Context context = this.f9652b;
        x0.n1<String> n1Var5 = this.f9655e;
        if (i10 == 0) {
            pg.q.b(obj);
            List<String> list = d1.f9265a;
            Uri uri = (Uri) this.f9654d.getValue();
            if (uri == null) {
                this.f9651a = 1;
            } else {
                r4 r4Var = this.f9653c.G;
                if (r4Var != null && r4Var.f10362a.equals(uri)) {
                    n1Var3.setValue(r4Var.f10363b);
                    n1Var2.setValue(r4Var.f10364c);
                    n1Var.setValue(r4Var.f10365d);
                    n1Var4.setValue(Boolean.FALSE);
                    n1Var5.setValue(null);
                    return pg.f0.f21461a;
                }
                n1Var4.setValue(Boolean.TRUE);
                n1Var5.setValue(null);
                wh.c cVar = ph.z0.f21632a;
                wh.b bVar = wh.b.f31563c;
                a aVar2 = new a(context, uri, null);
                this.f9651a = 2;
                obj = ph.h.e(bVar, aVar2, this);
            }
            return aVar;
        }
        if (i10 == 1) {
            pg.q.b(obj);
            String string = context.getString(R.string.editor_html_load_error);
            List<String> list2 = d1.f9265a;
            n1Var5.setValue(string);
            n1Var4.setValue(Boolean.FALSE);
            return pg.f0.f21461a;
        }
        if (i10 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pg.q.b(obj);
        t4 t4Var = (t4) obj;
        if (t4Var instanceof t4.b) {
            String str = ((t4.b) t4Var).f10557a;
            y2.c0 c0Var = new y2.c0(str, 0L, 6);
            List<String> list3 = d1.f9265a;
            n1Var3.setValue(c0Var);
            n1Var2.setValue(str);
            n1Var.setValue(new j(c0Var));
        } else if (kotlin.jvm.internal.r.a(t4Var, t4.c.f10558a)) {
            String string2 = context.getString(R.string.editor_file_too_large);
            List<String> list4 = d1.f9265a;
            n1Var5.setValue(string2);
        } else {
            if (!kotlin.jvm.internal.r.a(t4Var, t4.a.f10556a)) {
                throw new pg.l();
            }
            String string3 = context.getString(R.string.editor_html_read_failed);
            List<String> list5 = d1.f9265a;
            n1Var5.setValue(string3);
        }
        n1Var4.setValue(Boolean.FALSE);
        return pg.f0.f21461a;
    }
}
