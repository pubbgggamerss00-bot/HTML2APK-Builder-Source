package n8;

import android.net.Uri;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.eac.EACTags;

@vg.e(c = "com.basitce.htmltoapk.data.repository.DocumentProjectCreator$createPdf$2", f = "DocumentProjectCreator.kt", l = {EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends vg.i implements eh.p<ph.i0, tg.e<? super ProjectEntity>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f18408a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f18409b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f18410c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f18411d;

    @vg.e(c = "com.basitce.htmltoapk.data.repository.DocumentProjectCreator$createPdf$2$1", f = "DocumentProjectCreator.kt", l = {60}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<File, tg.e<? super File>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f18412a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f18413b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f18414c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Uri f18415d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, Uri uri, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f18414c = gVar;
            this.f18415d = uri;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            a aVar = new a(this.f18414c, this.f18415d, eVar);
            aVar.f18413b = obj;
            return aVar;
        }

        @Override // eh.p
        public final Object invoke(File file, tg.e<? super File> eVar) {
            return ((a) create(file, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) throws IOException {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f18412a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
                return obj;
            }
            pg.q.b(obj);
            File file = (File) this.f18413b;
            Hilt_HtmlToApkApplication hilt_HtmlToApkApplication = this.f18414c.f18445a;
            this.f18412a = 1;
            File fileA = l9.e0.a(hilt_HtmlToApkApplication, this.f18415d, file, this);
            return fileA == aVar ? aVar : fileA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, Uri uri, Long l10, tg.e<? super d> eVar) {
        super(2, eVar);
        this.f18409b = gVar;
        this.f18410c = uri;
        this.f18411d = l10;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new d(this.f18409b, this.f18410c, this.f18411d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super ProjectEntity> eVar) {
        return ((d) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        String strB0;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f18408a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        pg.q.b(obj);
        Uri uri = this.f18410c;
        g gVar = this.f18409b;
        String strB = g.b(gVar, uri);
        if (strB != null) {
            String strV = mh.x.V(strB, '.');
            Pattern patternCompile = Pattern.compile("[_\\-]+");
            kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
            String strReplaceAll = patternCompile.matcher(strV).replaceAll(" ");
            kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
            Pattern patternCompile2 = Pattern.compile("\\s+");
            kotlin.jvm.internal.r.d(patternCompile2, "compile(...)");
            String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll(" ");
            kotlin.jvm.internal.r.d(strReplaceAll2, "replaceAll(...)");
            strB0 = mh.y.b0(30, mh.x.W(strReplaceAll2).toString());
            if (mh.x.A(strB0)) {
                strB0 = null;
            }
            if (strB0 == null) {
                strB0 = "PDF";
            }
        }
        String str = strB0;
        Uri uri2 = this.f18410c;
        a aVar2 = new a(gVar, uri2, null);
        this.f18408a = 1;
        Object objA = g.a(gVar, ProjectKind.PDF, str, ProjectKind.PDF, this.f18411d, uri2, aVar2, this);
        return objA == aVar ? aVar : objA;
    }
}
