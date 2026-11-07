package g9;

import android.net.Uri;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import f9.fg;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import ph.i0;
import ph.l2;
import sh.z0;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.simplebuild.SimpleBuildViewModel$createProject$2", f = "SimpleBuildViewModel.kt", l = {148, 149, 237, 253}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b0 extends vg.i implements eh.p<i0, tg.e<? super pg.p<? extends Long>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public String f11692a;

    /* renamed from: b, reason: collision with root package name */
    public String f11693b;

    /* renamed from: c, reason: collision with root package name */
    public ProjectEntity f11694c;

    /* renamed from: d, reason: collision with root package name */
    public long f11695d;

    /* renamed from: e, reason: collision with root package name */
    public int f11696e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f11697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y f11698g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(y yVar, tg.e<? super b0> eVar) {
        super(2, eVar);
        this.f11698g = yVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        b0 b0Var = new b0(this.f11698g, eVar);
        b0Var.f11697f = obj;
        return b0Var;
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super pg.p<? extends Long>> eVar) {
        return ((b0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r8.join(r85) == r0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (r8.join(r85) == r0) goto L130;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0361 A[Catch: all -> 0x001c, Exception -> 0x001f, TRY_ENTER, TryCatch #0 {Exception -> 0x001f, blocks: (B:9:0x0017, B:132:0x0454, B:122:0x0361, B:124:0x0388, B:126:0x038c, B:127:0x03a1, B:128:0x03a3), top: B:142:0x000b, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        Object objA;
        i0 i0Var;
        l2 l2Var;
        Iterator<String> it;
        mh.f fVar;
        Object next;
        String strB0;
        String str;
        String str2;
        ProjectEntity projectEntity;
        String str3;
        Object objInsert;
        File file;
        String str4;
        String string;
        long jLongValue;
        long j10;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f11696e;
        try {
            try {
            } catch (Exception e10) {
                objA = pg.q.a(e10);
            }
            if (i10 == 0) {
                pg.q.b(obj);
                i0Var = (i0) this.f11697f;
                z0 z0Var = this.f11698g.f11831e;
                Boolean bool = Boolean.TRUE;
                z0Var.getClass();
                z0Var.j(null, bool);
                l2 l2Var2 = this.f11698g.f11833g;
                if (l2Var2 != null) {
                    this.f11697f = i0Var;
                    this.f11696e = 1;
                } else {
                    l2Var = this.f11698g.f11834h;
                    if (l2Var != null) {
                        it = mh.x.D((CharSequence) this.f11698g.f11835i.getValue()).iterator();
                        while (true) {
                            fVar = (mh.f) it;
                            if (fVar.hasNext()) {
                            }
                        }
                        String str5 = (String) next;
                        if (str5 != null) {
                            strB0 = (str5 != null || (string = mh.x.W(str5).toString()) == null) ? "" : mh.y.b0(50, string);
                            String lowerCase = ((String) this.f11698g.f11837k.getValue()).toLowerCase(Locale.ROOT);
                            kotlin.jvm.internal.r.d(lowerCase, "toLowerCase(...)");
                            String str6 = (String) this.f11698g.f11842p.getValue();
                            String str7 = (String) this.f11698g.f11843q.getValue();
                            if (!mh.x.A(strB0)) {
                            }
                        }
                        return new pg.p(objA);
                    }
                    this.f11697f = i0Var;
                    this.f11696e = 2;
                }
                return aVar;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j10 = this.f11695d;
                        pg.q.b(obj);
                        this.f11698g.i();
                        objA = new Long(j10);
                        return new pg.p(objA);
                    }
                    ProjectEntity projectEntity2 = this.f11694c;
                    String str8 = this.f11693b;
                    str4 = this.f11692a;
                    file = (File) this.f11697f;
                    pg.q.b(obj);
                    projectEntity = projectEntity2;
                    str3 = str8;
                    objInsert = obj;
                    jLongValue = ((Number) objInsert).longValue();
                    if (jLongValue != 0) {
                        return new pg.p(pg.q.a(new IllegalStateException("Failed to save project")));
                    }
                    File file2 = new File(this.f11698g.f11829c.getFilesDir(), "projects/" + jLongValue);
                    file2.mkdirs();
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null) {
                        for (File file3 : fileArrListFiles) {
                            kotlin.jvm.internal.r.b(file3);
                            ah.l.d(file3, new File(file2, file3.getName()));
                        }
                        pg.f0 f0Var = pg.f0.f21461a;
                    }
                    ah.l.f(file);
                    ProjectEntity projectEntityCopy$default = ProjectEntity.copy$default(projectEntity, jLongValue, null, null, null, 0, null, 0, 0, null, null, y.f(this.f11698g, str4, file, file2), null, null, y.f(this.f11698g, str3, file, file2), null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -25602, -1, 15, null);
                    n8.s sVar = this.f11698g.f11828b;
                    this.f11697f = null;
                    this.f11692a = null;
                    this.f11693b = null;
                    this.f11694c = null;
                    this.f11695d = jLongValue;
                    this.f11696e = 4;
                    if (sVar.c(projectEntityCopy$default, this) != aVar) {
                        j10 = jLongValue;
                        this.f11698g.i();
                        objA = new Long(j10);
                        return new pg.p(objA);
                    }
                    return aVar;
                }
                pg.q.b(obj);
                pg.f0 f0Var2 = pg.f0.f21461a;
                it = mh.x.D((CharSequence) this.f11698g.f11835i.getValue()).iterator();
                while (true) {
                    fVar = (mh.f) it;
                    if (fVar.hasNext()) {
                        next = null;
                        break;
                    }
                    next = fVar.next();
                    if (!mh.x.A((String) next)) {
                        break;
                    }
                }
                String str52 = (String) next;
                strB0 = (str52 != null || (string = mh.x.W(str52).toString()) == null) ? "" : mh.y.b0(50, string);
                String lowerCase2 = ((String) this.f11698g.f11837k.getValue()).toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.r.d(lowerCase2, "toLowerCase(...)");
                String str62 = (String) this.f11698g.f11842p.getValue();
                String str72 = (String) this.f11698g.f11843q.getValue();
                if (!mh.x.A(strB0)) {
                    z0 z0Var2 = this.f11698g.f11831e;
                    Boolean bool2 = Boolean.FALSE;
                    z0Var2.getClass();
                    z0Var2.j(null, bool2);
                    return new pg.p(pg.q.a(new IllegalArgumentException("App name is required")));
                }
                mh.k kVar = fg.X0;
                pg.n nVarC = fg.f.c((String) this.f11698g.f11836j.getValue(), strB0);
                String str9 = (String) nVarC.f21469a;
                String str10 = (String) nVarC.f21470b;
                if (str10 != null) {
                    z0 z0Var3 = this.f11698g.f11831e;
                    Boolean bool3 = Boolean.FALSE;
                    z0Var3.getClass();
                    z0Var3.j(null, bool3);
                    this.f11698g.m(str10);
                    return new pg.p(pg.q.a(new IllegalArgumentException(str10)));
                }
                File fileL = this.f11698g.l();
                int iHashCode = lowerCase2.hashCode();
                if (iHashCode == 110834) {
                    if (lowerCase2.equals(ProjectKind.PDF)) {
                        Uri uri = (Uri) this.f11698g.f11840n.getValue();
                        if (uri == null || (strH = y.h(this.f11698g, uri)) == null) {
                            y yVar = this.f11698g;
                            z0 z0Var4 = yVar.f11831e;
                            Boolean bool4 = Boolean.FALSE;
                            z0Var4.getClass();
                            z0Var4.j(null, bool4);
                            return new pg.p(pg.q.a(new IllegalStateException(yVar.f11829c.getString(R.string.pdf_required))));
                        }
                        str = strH;
                    }
                    str = null;
                } else if (iHashCode != 103145323) {
                    if (iHashCode == 106438291 && lowerCase2.equals("paste")) {
                        if (mh.x.A(str72)) {
                            return new pg.p(pg.q.a(new IllegalArgumentException("HTML content is required")));
                        }
                        File file4 = new File(fileL, "content");
                        file4.mkdirs();
                        File file5 = new File(file4, "index.html");
                        Set<String> set = l9.w.f16906a;
                        ah.l.r(file5, l9.w.a(str72), mh.a.f18238b);
                        String strH = file5.getAbsolutePath();
                        str = strH;
                    }
                    str = null;
                } else {
                    if (lowerCase2.equals("local")) {
                        Uri uri2 = (Uri) this.f11698g.f11838l.getValue();
                        if (uri2 == null || (strH = y.h(this.f11698g, uri2)) == null) {
                            return new pg.p(pg.q.a(new IllegalStateException("Failed to copy HTML file")));
                        }
                        str = strH;
                    }
                    str = null;
                }
                if (!lowerCase2.equals("url") || mh.x.A(str62)) {
                    str2 = null;
                } else {
                    mh.k kVar2 = y.f11827v;
                    String string2 = mh.x.W(str62).toString();
                    if (!mh.t.p(string2, "http://", true) && !mh.t.p(string2, "https://", true)) {
                        string2 = "https://".concat(string2);
                    }
                    str2 = string2;
                }
                if (lowerCase2.equals("url") && str2 == null) {
                    z0 z0Var5 = this.f11698g.f11831e;
                    Boolean bool5 = Boolean.FALSE;
                    z0Var5.getClass();
                    z0Var5.j(null, bool5);
                    return new pg.p(pg.q.a(new IllegalArgumentException("Valid URL is required")));
                }
                if (lowerCase2.equals("local") && str == null) {
                    z0 z0Var6 = this.f11698g.f11831e;
                    Boolean bool6 = Boolean.FALSE;
                    z0Var6.getClass();
                    z0Var6.j(null, bool6);
                    return new pg.p(pg.q.a(new IllegalArgumentException("HTML file is required")));
                }
                Uri uri3 = (Uri) this.f11698g.f11844r.getValue();
                String strH2 = uri3 != null ? y.h(this.f11698g, uri3) : null;
                n8.i iVar = this.f11698g.f11830d;
                Long l10 = iVar.f18471c;
                iVar.f18471c = null;
                projectEntity = new ProjectEntity(0L, strB0, strB0, str9, 1, "1.0", 24, 36, null, lowerCase2, str, str2, "[\"android.permission.INTERNET\",\"android.permission.ACCESS_NETWORK_STATE\",\"android.permission.VIBRATE\"]", strH2, null, "#2196F3", "portrait", true, false, false, false, false, "{}", null, ProjectKind.APK, "simple", false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, l10, 0L, 0L, -134217728, -1, 13, null);
                String str11 = str;
                str3 = strH2;
                n8.s sVar2 = this.f11698g.f11828b;
                this.f11697f = fileL;
                this.f11692a = str11;
                this.f11693b = str3;
                this.f11694c = projectEntity;
                this.f11696e = 3;
                objInsert = sVar2.f18583a.insert(projectEntity, this);
                if (objInsert != aVar) {
                    file = fileL;
                    str4 = str11;
                    jLongValue = ((Number) objInsert).longValue();
                    if (jLongValue != 0) {
                    }
                }
                return aVar;
            }
            i0Var = (i0) this.f11697f;
            pg.q.b(obj);
            pg.f0 f0Var3 = pg.f0.f21461a;
            l2Var = this.f11698g.f11834h;
            if (l2Var != null) {
            }
            return aVar;
        } finally {
            z0 z0Var7 = this.f11698g.f11831e;
            Boolean bool7 = Boolean.FALSE;
            z0Var7.getClass();
            z0Var7.j(null, bool7);
        }
    }
}
