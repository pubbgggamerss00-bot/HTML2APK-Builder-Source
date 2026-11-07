package g9;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import androidx.lifecycle.l0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.i0;
import ph.l2;
import sh.a1;
import sh.z0;

/* loaded from: classes.dex */
public final class y extends w0 {

    /* renamed from: v, reason: collision with root package name */
    public static final mh.k f11827v = new mh.k("<title[^>]*>(.*?)</title>", (Set<? extends mh.n>) qg.o.C(new mh.n[]{mh.n.f18276b, mh.n.f18277c}));

    /* renamed from: b, reason: collision with root package name */
    public final n8.s f11828b;

    /* renamed from: c, reason: collision with root package name */
    public final Application f11829c;

    /* renamed from: d, reason: collision with root package name */
    public final n8.i f11830d;

    /* renamed from: e, reason: collision with root package name */
    public final z0 f11831e;

    /* renamed from: f, reason: collision with root package name */
    public final z0 f11832f;

    /* renamed from: g, reason: collision with root package name */
    public l2 f11833g;

    /* renamed from: h, reason: collision with root package name */
    public l2 f11834h;

    /* renamed from: i, reason: collision with root package name */
    public final z0 f11835i;

    /* renamed from: j, reason: collision with root package name */
    public final z0 f11836j;

    /* renamed from: k, reason: collision with root package name */
    public final z0 f11837k;

    /* renamed from: l, reason: collision with root package name */
    public final z0 f11838l;

    /* renamed from: m, reason: collision with root package name */
    public final z0 f11839m;

    /* renamed from: n, reason: collision with root package name */
    public final z0 f11840n;

    /* renamed from: o, reason: collision with root package name */
    public final z0 f11841o;

    /* renamed from: p, reason: collision with root package name */
    public final z0 f11842p;

    /* renamed from: q, reason: collision with root package name */
    public final z0 f11843q;

    /* renamed from: r, reason: collision with root package name */
    public final z0 f11844r;

    /* renamed from: s, reason: collision with root package name */
    public final z0 f11845s;

    /* renamed from: t, reason: collision with root package name */
    public final z0 f11846t;

    /* renamed from: u, reason: collision with root package name */
    public final z0 f11847u;

    public static final class a {
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.simplebuild.SimpleBuildViewModel$clearForm$1", f = "SimpleBuildViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f11848a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(File file, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f11848a = file;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new b(this.f11848a, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            try {
                ah.l.f(this.f11848a);
            } catch (Exception unused) {
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.simplebuild.SimpleBuildViewModel$persistIconFile$1", f = "SimpleBuildViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class c extends vg.i implements eh.p<i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Uri f11850b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Uri uri, tg.e<? super c> eVar) {
            super(2, eVar);
            this.f11850b = uri;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return y.this.new c(this.f11850b, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            y yVar = y.this;
            z0 z0Var = yVar.f11831e;
            Boolean bool = Boolean.TRUE;
            z0Var.getClass();
            z0Var.j(null, bool);
            try {
                File file = new File(yVar.l(), "icons");
                file.mkdirs();
                File file2 = new File(file, "icon.png");
                if (y.g(yVar, this.f11850b, file2)) {
                    yVar.f11844r.setValue(Uri.fromFile(file2));
                    z0 z0Var2 = yVar.f11845s;
                    z0Var2.getClass();
                    z0Var2.j(null, "icon.png");
                } else {
                    BuildLogger.INSTANCE.error(R.string.build_log_sb_icon_copy_failed, new Object[0]);
                }
                Boolean bool2 = Boolean.FALSE;
                z0Var.getClass();
                z0Var.j(null, bool2);
                return pg.f0.f21461a;
            } catch (Throwable th2) {
                Boolean bool3 = Boolean.FALSE;
                z0Var.getClass();
                z0Var.j(null, bool3);
                throw th2;
            }
        }
    }

    public y(n8.s projectRepository, Application application, l0 savedStateHandle, n8.i folderRepository) {
        kotlin.jvm.internal.r.e(projectRepository, "projectRepository");
        kotlin.jvm.internal.r.e(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.r.e(folderRepository, "folderRepository");
        this.f11828b = projectRepository;
        this.f11829c = application;
        this.f11830d = folderRepository;
        z0 z0VarA = a1.a(Boolean.FALSE);
        this.f11831e = z0VarA;
        this.f11832f = z0VarA;
        this.f11835i = n(savedStateHandle, "appName", "");
        this.f11836j = n(savedStateHandle, "packageName", "");
        this.f11837k = n(savedStateHandle, "contentSource", "LOCAL");
        this.f11838l = n(savedStateHandle, "htmlFileUri", null);
        this.f11839m = n(savedStateHandle, "htmlFileName", "");
        this.f11840n = n(savedStateHandle, "pdfFileUri", null);
        this.f11841o = n(savedStateHandle, "pdfFileName", "");
        this.f11842p = n(savedStateHandle, "sourceUrl", "");
        this.f11843q = c6.f.a(savedStateHandle, "pastedHtml", new File(application.getFilesDir(), "html_drafts"), x0.a(this)).f16873a;
        this.f11844r = n(savedStateHandle, "iconUri", null);
        this.f11845s = n(savedStateHandle, "iconFileName", "");
        this.f11846t = n(savedStateHandle, "errorMessage", null);
        this.f11847u = n(savedStateHandle, "draftDirName", "draft_" + UUID.randomUUID());
    }

    public static final String f(y yVar, String str, File file, File file2) throws IOException {
        if (str == null) {
            return null;
        }
        try {
            String canonicalPath = new File(str).getCanonicalPath();
            String canonicalPath2 = file.getCanonicalPath();
            kotlin.jvm.internal.r.b(canonicalPath);
            String separator = File.separator;
            if (!mh.t.p(canonicalPath, canonicalPath2 + separator, false) && !canonicalPath.equals(canonicalPath2)) {
                return canonicalPath;
            }
            kotlin.jvm.internal.r.b(canonicalPath2);
            String strI = mh.x.I(canonicalPath, canonicalPath2);
            kotlin.jvm.internal.r.d(separator, "separator");
            return new File(file2, mh.x.I(strI, separator)).getCanonicalPath();
        } catch (Exception unused) {
            return str;
        }
    }

    public static final boolean g(y yVar, Uri uri, File file) throws Throwable {
        Exception exc;
        Throwable th2;
        File element;
        String lowerCase;
        int attributeInt;
        Bitmap bitmap;
        String str = "";
        Application application = yVar.f11829c;
        File file2 = null;
        InputStream inputStreamOpenInputStream = null;
        File file3 = null;
        try {
            try {
                File parentFile = file.getParentFile();
                if (parentFile == null) {
                    parentFile = application.getCacheDir();
                }
                parentFile.mkdirs();
                element = File.createTempFile("raw_icon_", ".tmp", parentFile);
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                try {
                    String scheme = uri.getScheme();
                    if (scheme != null) {
                        lowerCase = scheme.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
                    } else {
                        lowerCase = null;
                    }
                    if (kotlin.jvm.internal.r.a(lowerCase, "file")) {
                        String path = uri.getPath();
                        if (path != null) {
                            inputStreamOpenInputStream = new FileInputStream(new File(path));
                        }
                    } else {
                        inputStreamOpenInputStream = application.getContentResolver().openInputStream(uri);
                    }
                    if (inputStreamOpenInputStream == null) {
                        BuildLogger.INSTANCE.error(R.string.build_log_uri_open_failed, uri);
                        if (element != null) {
                            element.delete();
                        }
                        return false;
                    }
                    try {
                        kotlin.jvm.internal.r.d(element, "element");
                        FileOutputStream fileOutputStream = new FileOutputStream(element);
                        try {
                            ah.b.a(inputStreamOpenInputStream, fileOutputStream, 8192);
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                            try {
                                attributeInt = new ExifInterface(element.getAbsolutePath()).getAttributeInt("Orientation", 1);
                            } catch (Exception e10) {
                                BuildLogger buildLogger = BuildLogger.INSTANCE;
                                String message = e10.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                buildLogger.detail(R.string.build_log_exif_read_error, message);
                                attributeInt = 1;
                            }
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(element.getAbsolutePath(), options);
                            if (options.outWidth <= 0 || options.outHeight <= 0) {
                                BuildLogger.INSTANCE.error(R.string.build_log_image_bounds_failed, new Object[0]);
                            } else {
                                kotlin.jvm.internal.e0 e0Var = new kotlin.jvm.internal.e0();
                                e0Var.f16324a = 1;
                                int iMax = Math.max(options.outWidth, options.outHeight);
                                while (true) {
                                    int i10 = e0Var.f16324a;
                                    if (iMax / i10 <= 1024) {
                                        break;
                                    }
                                    e0Var.f16324a = i10 * 2;
                                }
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inSampleSize = e0Var.f16324a;
                                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(element.getAbsolutePath(), options2);
                                if (bitmapDecodeFile != null) {
                                    Matrix matrix = new Matrix();
                                    try {
                                        if (attributeInt == 2) {
                                            matrix.postScale(-1.0f, 1.0f);
                                        } else if (attributeInt == 3) {
                                            matrix.postRotate(180.0f);
                                        } else if (attributeInt == 4) {
                                            matrix.postScale(1.0f, -1.0f);
                                        } else if (attributeInt == 6) {
                                            matrix.postRotate(90.0f);
                                        } else {
                                            if (attributeInt != 8) {
                                                bitmap = bitmapDecodeFile;
                                                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                                                fileOutputStream2.close();
                                                bitmap.recycle();
                                                BuildLogger.INSTANCE.detail(R.string.build_log_icon_normalized, file.getAbsolutePath());
                                                element.delete();
                                                return true;
                                            }
                                            matrix.postRotate(270.0f);
                                        }
                                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                                        fileOutputStream2.close();
                                        bitmap.recycle();
                                        BuildLogger.INSTANCE.detail(R.string.build_log_icon_normalized, file.getAbsolutePath());
                                        element.delete();
                                        return true;
                                    } catch (Throwable th4) {
                                        try {
                                            throw th4;
                                        } finally {
                                        }
                                    }
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight(), matrix, true);
                                    kotlin.jvm.internal.r.d(bitmapCreateBitmap, "createBitmap(...)");
                                    if (!bitmapCreateBitmap.equals(bitmapDecodeFile)) {
                                        bitmapDecodeFile.recycle();
                                    }
                                    bitmap = bitmapCreateBitmap;
                                    FileOutputStream fileOutputStream22 = new FileOutputStream(file);
                                }
                            }
                            element.delete();
                            return false;
                        } finally {
                        }
                    } catch (Throwable th5) {
                        try {
                            throw th5;
                        } catch (Throwable th6) {
                            ah.c.a(inputStreamOpenInputStream, th5);
                            throw th6;
                        }
                    }
                } catch (Exception e11) {
                    exc = e11;
                    file2 = element;
                    BuildLogger buildLogger2 = BuildLogger.INSTANCE;
                    String message2 = exc.getMessage();
                    if (message2 != null) {
                        str = message2;
                    }
                    buildLogger2.error(R.string.build_log_icon_normalize_error, str);
                    if (file2 == null) {
                        return false;
                    }
                    file2.delete();
                    return false;
                }
            } catch (Throwable th7) {
                th2 = th7;
                file3 = element;
                if (file3 == null) {
                    throw th2;
                }
                file3.delete();
                throw th2;
            }
        } catch (Exception e12) {
            exc = e12;
        }
    }

    public static final String h(y yVar, Uri uri) {
        String path;
        if (!kotlin.jvm.internal.r.a(uri.getScheme(), "file") || (path = uri.getPath()) == null) {
            return null;
        }
        return new File(path).getAbsolutePath();
    }

    public final void i() {
        File fileL = l();
        l5.a aVarA = x0.a(this);
        wh.c cVar = ph.z0.f21632a;
        ph.h.c(aVarA, wh.b.f31563c, null, new b(fileL, null), 2);
        z0 z0Var = this.f11835i;
        z0Var.getClass();
        z0Var.j(null, "");
        z0 z0Var2 = this.f11837k;
        z0Var2.getClass();
        z0Var2.j(null, "LOCAL");
        this.f11838l.setValue(null);
        this.f11840n.setValue(null);
        z0 z0Var3 = this.f11841o;
        z0Var3.getClass();
        z0Var3.j(null, "");
        z0 z0Var4 = this.f11839m;
        z0Var4.getClass();
        z0Var4.j(null, "");
        z0 z0Var5 = this.f11842p;
        z0Var5.getClass();
        z0Var5.j(null, "");
        z0 z0Var6 = this.f11843q;
        z0Var6.getClass();
        z0Var6.j(null, "");
        this.f11844r.setValue(null);
        z0 z0Var7 = this.f11845s;
        z0Var7.getClass();
        z0Var7.j(null, "");
        this.f11846t.setValue(null);
        this.f11847u.setValue("draft_" + UUID.randomUUID());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(vg.c cVar) {
        a0 a0Var;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i10 = a0Var.f11686c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                a0Var.f11686c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                a0Var = new a0(this, cVar);
            }
        }
        Object objE = a0Var.f11684a;
        ug.a aVar = ug.a.f29706a;
        int i11 = a0Var.f11686c;
        if (i11 == 0) {
            pg.q.b(objE);
            wh.c cVar2 = ph.z0.f21632a;
            wh.b bVar = wh.b.f31563c;
            b0 b0Var = new b0(this, null);
            a0Var.f11686c = 1;
            objE = ph.h.e(bVar, b0Var, a0Var);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(objE);
        }
        return ((pg.p) objE).f21471a;
    }

    public final void k(Uri uri) {
        kotlin.jvm.internal.r.e(uri, "uri");
        l2 l2Var = this.f11834h;
        if (l2Var != null) {
            l2Var.cancel((CancellationException) null);
        }
        l5.a aVarA = x0.a(this);
        wh.c cVar = ph.z0.f21632a;
        this.f11834h = ph.h.c(aVarA, wh.b.f31563c, null, new c(uri, null), 2);
    }

    public final File l() {
        return new File(this.f11829c.getFilesDir(), androidx.datastore.preferences.protobuf.z0.a(this.f11847u.getValue(), "projects/"));
    }

    public final void m(String str) {
        this.f11846t.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final z0 n(l0 l0Var, String str, String str2) {
        Object objA = l0Var.a(str);
        if (objA != 0) {
            str2 = objA;
        }
        z0 z0VarA = a1.a(str2);
        ph.h.c(x0.a(this), null, null, new e0(z0VarA, l0Var, str, null), 3);
        return z0VarA;
    }
}
