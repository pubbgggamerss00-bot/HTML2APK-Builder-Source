package n8;

import android.net.Uri;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;

@vg.e(c = "com.basitce.htmltoapk.data.repository.DocumentProjectCreator$createHtml$2", f = "DocumentProjectCreator.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends vg.i implements eh.p<ph.i0, tg.e<? super ProjectEntity>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f18392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Uri f18393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f18394c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f18395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f18396e;

    @vg.e(c = "com.basitce.htmltoapk.data.repository.DocumentProjectCreator$createHtml$2$1", f = "DocumentProjectCreator.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<File, tg.e<? super File>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f18397a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Uri f18398b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f18399c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f18400d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri uri, g gVar, String str, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f18398b = uri;
            this.f18399c = gVar;
            this.f18400d = str;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f18398b, this.f18399c, this.f18400d, eVar);
            aVar.f18397a = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(File file, tg.e<? super File> eVar) {
            return ((a) create(file, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws IOException {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            File file = (File) this.f18397a;
            g gVar = this.f18399c;
            String strConcat = null;
            Uri uri = this.f18398b;
            String strB = uri != null ? g.b(gVar, uri) : null;
            if (strB == null) {
                strB = "";
            }
            String strT = mh.x.T(strB, '/', strB);
            String strT2 = mh.x.T(strT, '\\', strT);
            Pattern patternCompile = Pattern.compile("[\\\\/:*?\"<>|]");
            kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
            String strReplaceAll = patternCompile.matcher(strT2).replaceAll("_");
            kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
            String strB0 = mh.y.b0(CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET, mh.x.W(strReplaceAll).toString());
            if (!mh.x.A(strB0) && !strB0.equals(".") && !strB0.equals("..")) {
                strConcat = strB0;
            }
            if (strConcat == null) {
                strConcat = "index";
            }
            if (!mh.t.i(strConcat, ".".concat(ProjectKind.HTML), true) && !mh.t.i(strConcat, ".htm", true)) {
                strConcat = strConcat.concat(".html");
            }
            File file2 = new File(file, strConcat);
            if (uri == null) {
                ah.l.r(file2, mh.t.n("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n  <meta charset=\"UTF-8\">\n  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n  <title>{{title}}</title>\n  <style>\n    body { font-family: system-ui, sans-serif; margin: 0; padding: 24px; }\n  </style>\n</head>\n<body>\n  <h1>{{title}}</h1>\n  <p>Hello!</p>\n</body>\n</html>\n", "{{title}}", this.f18400d), mh.a.f18238b);
                return file2;
            }
            InputStream inputStreamOpenInputStream = gVar.f18445a.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Cannot open " + uri).toString());
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    long jA = ah.b.a(inputStreamOpenInputStream, fileOutputStream, 8192);
                    fileOutputStream.close();
                    inputStreamOpenInputStream.close();
                    i.a.b(jA);
                    return file2;
                } finally {
                }
            } finally {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Uri uri, String str, g gVar, Long l10, tg.e<? super c> eVar) {
        super(2, eVar);
        this.f18393b = uri;
        this.f18394c = str;
        this.f18395d = gVar;
        this.f18396e = l10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new c(this.f18393b, this.f18394c, this.f18395d, this.f18396e, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super ProjectEntity> eVar) {
        return ((c) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        String strV;
        String strB;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f18392a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        Uri uri = this.f18393b;
        if (uri == null || (strB = g.b(this.f18395d, uri)) == null) {
            strV = this.f18394c;
        } else {
            strV = mh.x.V(strB, '.');
            if (mh.x.A(strV)) {
                strV = null;
            }
            if (strV == null) {
            }
        }
        String str = strV;
        Uri uri2 = this.f18393b;
        g gVar = this.f18395d;
        a aVar2 = new a(uri2, gVar, str, null);
        this.f18392a = 1;
        Object objA = g.a(gVar, ProjectKind.HTML, str, "local", this.f18396e, uri2, aVar2, this);
        return objA == aVar ? aVar : objA;
    }
}
