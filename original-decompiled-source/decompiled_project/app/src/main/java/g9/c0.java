package g9;

import android.net.Uri;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.regex.Pattern;
import mh.i;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import ph.i0;
import sh.j0;
import sh.z0;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.simplebuild.SimpleBuildViewModel$persistHtmlFile$1", f = "SimpleBuildViewModel.kt", l = {HeaderItem.METHOD_START_OFFSET, 99}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c0 extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Object f11702a;

    /* renamed from: b, reason: collision with root package name */
    public int f11703b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f11704c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Uri f11705d;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.simplebuild.SimpleBuildViewModel$persistHtmlFile$1$1", f = "SimpleBuildViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<i0, tg.e<? super String>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f11706a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f11706a = str;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f11706a, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super String> eVar) {
            return ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws IOException {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            mh.k kVar = y.f11827v;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(this.f11706a)), mh.a.f18238b), 8192);
            try {
                char[] cArr = new char[65536];
                int i10 = bufferedReader.read(cArr);
                if (i10 < 0) {
                    i10 = 0;
                }
                String str = new String(cArr, 0, i10);
                bufferedReader.close();
                mh.i iVarB = y.f11827v.b(str);
                String str2 = iVarB != null ? (String) ((i.a) iVarB.a()).get(1) : null;
                if (str2 == null) {
                    str2 = "";
                }
                String strN = mh.t.n(mh.t.n(mh.t.n(mh.t.n(mh.t.n(mh.t.n(mh.t.n(str2, "&nbsp;", " "), "&lt;", "<"), "&gt;", ">"), "&quot;", "\""), "&#39;", "'"), "&apos;", "'"), "&amp;", "&");
                Pattern patternCompile = Pattern.compile("\\s+");
                kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
                String strReplaceAll = patternCompile.matcher(strN).replaceAll(" ");
                kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
                String string = mh.x.W(mh.y.b0(50, mh.x.W(strReplaceAll).toString())).toString();
                return string.length() == 0 ? "HTML App" : string;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ah.c.a(bufferedReader, th2);
                    throw th3;
                }
            }
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.simplebuild.SimpleBuildViewModel$persistHtmlFile$1$path$1", f = "SimpleBuildViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<i0, tg.e<? super String>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y f11707a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Uri f11708b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f11709c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y yVar, Uri uri, String str, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f11707a = yVar;
            this.f11708b = uri;
            this.f11709c = str;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new b(this.f11707a, this.f11708b, this.f11709c, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super String> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws IOException {
            String lowerCase;
            InputStream inputStreamOpenInputStream;
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            Uri uri = this.f11708b;
            mh.k kVar = y.f11827v;
            y yVar = this.f11707a;
            File fileL = yVar.l();
            String str = this.f11709c;
            try {
                File file = new File(fileL, "content");
                file.mkdirs();
                Pattern patternCompile = Pattern.compile("[^a-zA-Z0-9._-]");
                kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
                String strReplaceAll = patternCompile.matcher(str).replaceAll("_");
                kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
                File canonicalFile = new File(file, strReplaceAll).getCanonicalFile();
                File canonicalFile2 = file.getCanonicalFile();
                kotlin.jvm.internal.r.b(canonicalFile);
                kotlin.jvm.internal.r.b(canonicalFile2);
                if (!ah.l.m(canonicalFile, canonicalFile2)) {
                    BuildLogger.INSTANCE.error(R.string.build_log_security_violation, strReplaceAll);
                    return null;
                }
                String scheme = uri.getScheme();
                if (scheme != null) {
                    lowerCase = scheme.toLowerCase(Locale.ROOT);
                    kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
                } else {
                    lowerCase = null;
                }
                if (kotlin.jvm.internal.r.a(lowerCase, "file")) {
                    String path = uri.getPath();
                    inputStreamOpenInputStream = path != null ? new FileInputStream(new File(path)) : null;
                } else {
                    inputStreamOpenInputStream = yVar.f11829c.getContentResolver().openInputStream(uri);
                }
                if (inputStreamOpenInputStream == null) {
                    BuildLogger.INSTANCE.error(R.string.build_log_uri_open_failed_perm, uri);
                    return null;
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(canonicalFile);
                    try {
                        ah.b.a(inputStreamOpenInputStream, fileOutputStream, 8192);
                        fileOutputStream.close();
                        inputStreamOpenInputStream.close();
                        BuildLogger.INSTANCE.detail(R.string.build_log_sb_file_copied, canonicalFile.getAbsolutePath(), Long.valueOf(canonicalFile.length()));
                        return canonicalFile.getAbsolutePath();
                    } finally {
                    }
                } finally {
                }
            } catch (Exception e10) {
                BuildLogger buildLogger = BuildLogger.INSTANCE;
                String message = e10.getMessage();
                if (message == null) {
                    message = "";
                }
                buildLogger.error(R.string.build_log_sb_file_copy_error, message);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(y yVar, Uri uri, tg.e<? super c0> eVar) {
        super(2, eVar);
        this.f11704c = yVar;
        this.f11705d = uri;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new c0(this.f11704c, this.f11705d, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((c0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r12 == r4) goto L31;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Uri uri = this.f11705d;
        y yVar = this.f11704c;
        j0 j0Var = yVar.f11835i;
        z0 z0Var = yVar.f11831e;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f11703b;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                Boolean bool = Boolean.TRUE;
                z0Var.getClass();
                z0Var.j(null, bool);
                String lastPathSegment = uri.getLastPathSegment();
                String strT = lastPathSegment != null ? mh.x.T(lastPathSegment, '/', lastPathSegment) : "index.html";
                wh.c cVar = ph.z0.f21632a;
                wh.b bVar = wh.b.f31563c;
                b bVar2 = new b(yVar, uri, strT, null);
                this.f11702a = strT;
                this.f11703b = 1;
                Object objE = ph.h.e(bVar, bVar2, this);
                if (objE == aVar) {
                    return aVar;
                }
                str = strT;
                obj = objE;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j0Var = (j0) this.f11702a;
                    pg.q.b(obj);
                    j0Var.setValue(obj);
                    Boolean bool2 = Boolean.FALSE;
                    z0Var.getClass();
                    z0Var.j(null, bool2);
                    return pg.f0.f21461a;
                }
                str = (String) this.f11702a;
                pg.q.b(obj);
            }
            String str2 = (String) obj;
            if (str2 != null) {
                yVar.f11838l.setValue(Uri.fromFile(new File(str2)));
                yVar.f11839m.setValue(str);
                if (mh.x.A((CharSequence) j0Var.getValue())) {
                    wh.c cVar2 = ph.z0.f21632a;
                    wh.b bVar3 = wh.b.f31563c;
                    a aVar2 = new a(str2, null);
                    this.f11702a = j0Var;
                    this.f11703b = 2;
                    obj = ph.h.e(bVar3, aVar2, this);
                }
            } else {
                BuildLogger.INSTANCE.error(R.string.build_log_sb_html_copy_failed, new Object[0]);
            }
            Boolean bool22 = Boolean.FALSE;
            z0Var.getClass();
            z0Var.j(null, bool22);
            return pg.f0.f21461a;
        } catch (Throwable th2) {
            Boolean bool3 = Boolean.FALSE;
            z0Var.getClass();
            z0Var.j(null, bool3);
            throw th2;
        }
    }
}
