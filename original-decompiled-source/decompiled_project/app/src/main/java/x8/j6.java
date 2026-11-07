package x8;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.ConfigCrypto;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreHelper;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreStorage;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.basitce.htmltoapk.domain.model.ProjectLimits;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class j6 extends androidx.lifecycle.w0 {
    public final sh.z0 A;
    public final sh.l0 B;
    public final sh.z0 C;
    public final sh.l0 D;
    public final kotlinx.serialization.json.p E;
    public final sh.l0 F;
    public final sh.l0 G;
    public final sh.l0 H;
    public boolean I;

    /* renamed from: b, reason: collision with root package name */
    public final n8.s f32775b;

    /* renamed from: c, reason: collision with root package name */
    public final n8.l f32776c;

    /* renamed from: d, reason: collision with root package name */
    public final n8.m1 f32777d;

    /* renamed from: e, reason: collision with root package name */
    public final n8.g f32778e;

    /* renamed from: f, reason: collision with root package name */
    public final n8.i f32779f;

    /* renamed from: g, reason: collision with root package name */
    public final Hilt_HtmlToApkApplication f32780g;

    /* renamed from: h, reason: collision with root package name */
    public final h8.m f32781h;

    /* renamed from: i, reason: collision with root package name */
    public final sh.z0 f32782i;

    /* renamed from: j, reason: collision with root package name */
    public final sh.l0 f32783j;

    /* renamed from: k, reason: collision with root package name */
    public final sh.l0 f32784k;

    /* renamed from: l, reason: collision with root package name */
    public final sh.l0 f32785l;

    /* renamed from: m, reason: collision with root package name */
    public final sh.l0 f32786m;

    /* renamed from: n, reason: collision with root package name */
    public final sh.l0 f32787n;

    /* renamed from: o, reason: collision with root package name */
    public final sh.l0 f32788o;

    /* renamed from: p, reason: collision with root package name */
    public final sh.l0 f32789p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f32790q;

    /* renamed from: r, reason: collision with root package name */
    public final sh.z0 f32791r;

    /* renamed from: s, reason: collision with root package name */
    public final sh.l0 f32792s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f32793t;

    /* renamed from: u, reason: collision with root package name */
    public final sh.z0 f32794u;

    /* renamed from: v, reason: collision with root package name */
    public final sh.l0 f32795v;

    /* renamed from: w, reason: collision with root package name */
    public final sh.z0 f32796w;

    /* renamed from: x, reason: collision with root package name */
    public final sh.l0 f32797x;

    /* renamed from: y, reason: collision with root package name */
    public final sh.z0 f32798y;

    /* renamed from: z, reason: collision with root package name */
    public final sh.l0 f32799z;

    public interface a {

        /* renamed from: x8.j6$a$a, reason: collision with other inner class name */
        public static final class C0332a implements a {

            /* renamed from: a, reason: collision with root package name */
            public final ProjectEntity f32800a;

            public C0332a(ProjectEntity project) {
                kotlin.jvm.internal.r.e(project, "project");
                this.f32800a = project;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0332a) && kotlin.jvm.internal.r.a(this.f32800a, ((C0332a) obj).f32800a);
            }

            public final int hashCode() {
                return this.f32800a.hashCode();
            }

            public final String toString() {
                return "Created(project=" + this.f32800a + ")";
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            public final String f32801a;

            public b(String str) {
                this.f32801a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && kotlin.jvm.internal.r.a(this.f32801a, ((b) obj).f32801a);
            }

            public final int hashCode() {
                return this.f32801a.hashCode();
            }

            public final String toString() {
                return i8.n.d("Failed(message=", this.f32801a, ")");
            }
        }

        public static final class c implements a {

            /* renamed from: a, reason: collision with root package name */
            public final String f32802a;

            public c(String str) {
                this.f32802a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && kotlin.jvm.internal.r.a(this.f32802a, ((c) obj).f32802a);
            }

            public final int hashCode() {
                return this.f32802a.hashCode();
            }

            public final String toString() {
                return i8.n.d("LimitReached(kind=", this.f32802a, ")");
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f32803a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f32804b;

        /* renamed from: c, reason: collision with root package name */
        public final String f32805c;

        /* renamed from: d, reason: collision with root package name */
        public final int f32806d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f32807e;

        public b(Intent shareIntent, Uri uri, String str, int i10, int i11) {
            uri = (i11 & 2) != 0 ? null : uri;
            boolean z10 = (i11 & 16) == 0;
            kotlin.jvm.internal.r.e(shareIntent, "shareIntent");
            this.f32803a = shareIntent;
            this.f32804b = uri;
            this.f32805c = str;
            this.f32806d = i10;
            this.f32807e = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.r.a(this.f32803a, bVar.f32803a) && kotlin.jvm.internal.r.a(this.f32804b, bVar.f32804b) && kotlin.jvm.internal.r.a(this.f32805c, bVar.f32805c) && this.f32806d == bVar.f32806d && this.f32807e == bVar.f32807e;
        }

        public final int hashCode() {
            int iHashCode = this.f32803a.hashCode() * 31;
            Uri uri = this.f32804b;
            return Boolean.hashCode(this.f32807e) + androidx.datastore.preferences.protobuf.a1.a(this.f32806d, l0.k.a((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.f32805c), 31);
        }

        public final String toString() {
            return "ExportResult(shareIntent=" + this.f32803a + ", publicUri=" + this.f32804b + ", message=" + this.f32805c + ", titleResId=" + this.f32806d + ", isError=" + this.f32807e + ")";
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f32808a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f32809b;

        public c(String str, boolean z10) {
            this.f32808a = str;
            this.f32809b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f32808a.equals(cVar.f32808a) && this.f32809b == cVar.f32809b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f32809b) + (this.f32808a.hashCode() * 31);
        }

        public final String toString() {
            return "ImportResult(message=" + this.f32808a + ", isError=" + this.f32809b + ")";
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$createDocument$1", f = "HomeViewModel.kt", l = {439, 444, 446, 449}, m = "invokeSuspend")
    public static final class d extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public eh.l f32810a;

        /* renamed from: b, reason: collision with root package name */
        public ProjectLimits f32811b;

        /* renamed from: c, reason: collision with root package name */
        public String f32812c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f32813d;

        /* renamed from: e, reason: collision with root package name */
        public int f32814e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f32815f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Uri f32816g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ j6 f32817h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ eh.l<a, pg.f0> f32818j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ vg.i f32819k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, Uri uri, j6 j6Var, eh.l<? super a, pg.f0> lVar, eh.l<? super tg.e<? super ProjectEntity>, ? extends Object> lVar2, tg.e<? super d> eVar) {
            super(2, eVar);
            this.f32815f = str;
            this.f32816g = uri;
            this.f32817h = j6Var;
            this.f32818j = lVar;
            this.f32819k = (vg.i) lVar2;
        }

        /* JADX WARN: Type inference failed for: r5v0, types: [eh.l, vg.i] */
        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new d(this.f32815f, this.f32816g, this.f32817h, this.f32818j, this.f32819k, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((d) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x008b A[Catch: all -> 0x0021, Exception -> 0x0024, CancellationException -> 0x0027, PHI: r13
          0x008b: PHI (r13v16 java.lang.Object) = (r13v12 java.lang.Object), (r13v0 java.lang.Object) binds: [B:38:0x0088, B:21:0x003f] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {CancellationException -> 0x0027, blocks: (B:9:0x001c, B:51:0x00ce, B:52:0x00d7, B:20:0x003a, B:44:0x00aa, B:46:0x00b6, B:47:0x00bc, B:21:0x003f, B:40:0x008b, B:22:0x0043, B:32:0x006d, B:34:0x0071, B:37:0x007e, B:25:0x004a, B:27:0x0052, B:29:0x0056), top: B:64:0x0010, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00b6 A[Catch: all -> 0x0021, Exception -> 0x0024, CancellationException -> 0x0027, TryCatch #1 {CancellationException -> 0x0027, blocks: (B:9:0x001c, B:51:0x00ce, B:52:0x00d7, B:20:0x003a, B:44:0x00aa, B:46:0x00b6, B:47:0x00bc, B:21:0x003f, B:40:0x008b, B:22:0x0043, B:32:0x006d, B:34:0x0071, B:37:0x007e, B:25:0x004a, B:27:0x0052, B:29:0x0056), top: B:64:0x0010, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00bc A[Catch: all -> 0x0021, Exception -> 0x0024, CancellationException -> 0x0027, TryCatch #1 {CancellationException -> 0x0027, blocks: (B:9:0x001c, B:51:0x00ce, B:52:0x00d7, B:20:0x003a, B:44:0x00aa, B:46:0x00b6, B:47:0x00bc, B:21:0x003f, B:40:0x008b, B:22:0x0043, B:32:0x006d, B:34:0x0071, B:37:0x007e, B:25:0x004a, B:27:0x0052, B:29:0x0056), top: B:64:0x0010, outer: #0 }] */
        /* JADX WARN: Type inference failed for: r13v25, types: [eh.l, vg.i] */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Uri uri;
            boolean zBooleanValue;
            ProjectLimits projectLimits;
            eh.l<a, pg.f0> lVar;
            String str;
            eh.l<a, pg.f0> lVar2;
            a cVar;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f32814e;
            eh.l<a, pg.f0> lVar3 = this.f32818j;
            String str2 = this.f32815f;
            j6 j6Var = this.f32817h;
            try {
                try {
                    try {
                    } catch (CancellationException e10) {
                        throw e10;
                    }
                } catch (Exception e11) {
                    String message = e11.getMessage();
                    if (message == null) {
                        message = e11.getClass().getSimpleName();
                    }
                    lVar3.invoke(new a.b(message));
                }
                if (i10 == 0) {
                    pg.q.b(obj);
                    if (str2.equals(ProjectKind.APK) || (uri = this.f32816g) == null) {
                        n8.g1 g1Var = j6Var.f32777d.f18530f;
                        this.f32814e = 2;
                        obj = gg.a.f(g1Var, this);
                        if (obj == aVar) {
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            projectLimits = ProjectLimits.INSTANCE;
                            n8.s sVar = j6Var.f32775b;
                            this.f32810a = lVar3;
                            this.f32811b = projectLimits;
                            this.f32812c = str2;
                            this.f32813d = zBooleanValue;
                            this.f32814e = 3;
                            obj = sVar.f18583a.countByKind(str2, this);
                            if (obj != aVar) {
                            }
                        }
                    } else {
                        n8.g gVar = j6Var.f32778e;
                        this.f32814e = 1;
                        gVar.getClass();
                        wh.c cVar2 = ph.z0.f21632a;
                        obj = ph.h.e(wh.b.f31563c, new n8.f(uri, gVar, str2, null), this);
                        if (obj == aVar) {
                        }
                    }
                    return aVar;
                }
                if (i10 == 1) {
                    pg.q.b(obj);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            lVar2 = this.f32810a;
                            pg.q.b(obj);
                            lVar = lVar2;
                            cVar = new a.C0332a((ProjectEntity) obj);
                            lVar.invoke(cVar);
                            return pg.f0.f21461a;
                        }
                        zBooleanValue = this.f32813d;
                        str = this.f32812c;
                        projectLimits = this.f32811b;
                        lVar = this.f32810a;
                        pg.q.b(obj);
                        if (projectLimits.canCreate(str, zBooleanValue, ((Number) obj).intValue())) {
                            cVar = new a.c(str2);
                            lVar.invoke(cVar);
                            return pg.f0.f21461a;
                        }
                        ?? r13 = this.f32819k;
                        this.f32810a = lVar;
                        this.f32811b = null;
                        this.f32812c = null;
                        this.f32814e = 4;
                        obj = r13.invoke(this);
                        if (obj != aVar) {
                            lVar2 = lVar;
                            lVar = lVar2;
                            cVar = new a.C0332a((ProjectEntity) obj);
                            lVar.invoke(cVar);
                            return pg.f0.f21461a;
                        }
                        return aVar;
                    }
                    pg.q.b(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    projectLimits = ProjectLimits.INSTANCE;
                    n8.s sVar2 = j6Var.f32775b;
                    this.f32810a = lVar3;
                    this.f32811b = projectLimits;
                    this.f32812c = str2;
                    this.f32813d = zBooleanValue;
                    this.f32814e = 3;
                    obj = sVar2.f18583a.countByKind(str2, this);
                    if (obj != aVar) {
                        return aVar;
                    }
                    lVar = lVar3;
                    str = str2;
                    if (projectLimits.canCreate(str, zBooleanValue, ((Number) obj).intValue())) {
                    }
                }
                ProjectEntity projectEntity = (ProjectEntity) obj;
                if (projectEntity != null) {
                    lVar3.invoke(new a.C0332a(projectEntity));
                    return pg.f0.f21461a;
                }
                n8.g1 g1Var2 = j6Var.f32777d.f18530f;
                this.f32814e = 2;
                obj = gg.a.f(g1Var2, this);
                if (obj == aVar) {
                }
                return aVar;
            } finally {
                j6Var.I = false;
            }
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$moveToFolder$1", f = "HomeViewModel.kt", l = {397}, m = "invokeSuspend")
    public static final class e extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f32820a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f32822c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Long f32823d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10, Long l10, tg.e<? super e> eVar) {
            super(2, eVar);
            this.f32822c = j10;
            this.f32823d = l10;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return j6.this.new e(this.f32822c, this.f32823d, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((e) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f32820a;
            if (i10 == 0) {
                pg.q.b(obj);
                n8.i iVar = j6.this.f32779f;
                List<Long> listC = c0.g0.c(new Long(this.f32822c));
                this.f32820a = 1;
                Object objMoveToFolder = iVar.f18470b.moveToFolder(listC, this.f32823d, this);
                if (objMoveToFolder != aVar) {
                    objMoveToFolder = pg.f0.f21461a;
                }
                if (objMoveToFolder == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.home.HomeViewModel$onOfferDismissed$1", f = "HomeViewModel.kt", l = {267}, m = "invokeSuspend")
    public static final class f extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f32824a;

        public f(tg.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return j6.this.new f(eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            return ((f) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = ug.a.f29706a;
            int i10 = this.f32824a;
            if (i10 == 0) {
                pg.q.b(obj);
                n8.m1 m1Var = j6.this.f32777d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f32824a = 1;
                Object objA = v4.g.a(m1Var.f18526b, new n8.e0(jCurrentTimeMillis, null), this);
                if (objA != obj2) {
                    objA = pg.f0.f21461a;
                }
                if (objA == obj2) {
                    return obj2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return pg.f0.f21461a;
        }
    }

    public j6(n8.s projectRepository, n8.l keystoreRepository, n8.m1 settingsRepository, n8.g documentProjectCreator, n8.i folderRepository, Hilt_HtmlToApkApplication hilt_HtmlToApkApplication, h8.m aiProjects) {
        kotlin.jvm.internal.r.e(projectRepository, "projectRepository");
        kotlin.jvm.internal.r.e(keystoreRepository, "keystoreRepository");
        kotlin.jvm.internal.r.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.r.e(documentProjectCreator, "documentProjectCreator");
        kotlin.jvm.internal.r.e(folderRepository, "folderRepository");
        kotlin.jvm.internal.r.e(aiProjects, "aiProjects");
        this.f32775b = projectRepository;
        this.f32776c = keystoreRepository;
        this.f32777d = settingsRepository;
        this.f32778e = documentProjectCreator;
        this.f32779f = folderRepository;
        this.f32780g = hilt_HtmlToApkApplication;
        this.f32781h = aiProjects;
        sh.z0 z0VarA = sh.a1.a(null);
        this.f32782i = z0VarA;
        sh.l0 l0VarI = gg.a.i(new sh.d0(new sh.f[]{projectRepository.f18583a.getAll(), settingsRepository.f18527c, z0VarA}, new n7(4, null)), androidx.lifecycle.x0.a(this), sh.u0.a(2), new m0(0));
        this.f32783j = l0VarI;
        n8.g1 g1Var = settingsRepository.f18530f;
        l5.a aVarA = androidx.lifecycle.x0.a(this);
        sh.x0 x0VarA = sh.u0.a(2);
        Boolean bool = Boolean.FALSE;
        sh.l0 l0VarI2 = gg.a.i(g1Var, aVarA, x0VarA, bool);
        this.f32784k = l0VarI2;
        this.f32785l = gg.a.i(settingsRepository.f18528d, androidx.lifecycle.x0.a(this), sh.u0.a(2), "system");
        gg.a.i(new u7(l0VarI), androidx.lifecycle.x0.a(this), sh.u0.a(2), qg.a0.f22708a);
        this.f32786m = gg.a.i(new sh.f0(l0VarI, l0VarI2, new k6(3, null)), androidx.lifecycle.x0.a(this), sh.u0.a(2), bool);
        this.f32787n = gg.a.i(settingsRepository.f18539o, androidx.lifecycle.x0.a(this), sh.u0.a(2), bool);
        this.f32788o = gg.a.i(settingsRepository.f18544t, androidx.lifecycle.x0.a(this), sh.u0.a(2), bool);
        this.f32789p = gg.a.i(settingsRepository.f18545u, androidx.lifecycle.x0.a(this), sh.u0.a(2), bool);
        sh.z0 z0VarA2 = sh.a1.a(bool);
        this.f32791r = z0VarA2;
        this.f32792s = gg.a.a(z0VarA2);
        sh.z0 z0VarA3 = sh.a1.a(bool);
        this.f32794u = z0VarA3;
        this.f32795v = gg.a.a(z0VarA3);
        ph.h.c(androidx.lifecycle.x0.a(this), null, null, new g6(this, null), 3);
        ph.h.c(androidx.lifecycle.x0.a(this), null, null, new h6(this, null), 3);
        ph.h.c(androidx.lifecycle.x0.a(this), wh.b.f31563c, null, new i6(this, null), 2);
        sh.z0 z0VarA4 = sh.a1.a(null);
        this.f32796w = z0VarA4;
        this.f32797x = gg.a.a(z0VarA4);
        sh.z0 z0VarA5 = sh.a1.a(null);
        this.f32798y = z0VarA5;
        this.f32799z = gg.a.a(z0VarA5);
        sh.z0 z0VarA6 = sh.a1.a(bool);
        this.A = z0VarA6;
        this.B = gg.a.a(z0VarA6);
        sh.z0 z0VarA7 = sh.a1.a(bool);
        this.C = z0VarA7;
        this.D = gg.a.a(z0VarA7);
        this.E = kotlinx.serialization.json.q.a(new f6());
        this.F = gg.a.i(folderRepository.f18469a.getAll(), androidx.lifecycle.x0.a(this), sh.u0.a(2), qg.z.f22752a);
        this.G = gg.a.i(settingsRepository.f18540p, androidx.lifecycle.x0.a(this), sh.u0.a(2), null);
        this.H = gg.a.i(settingsRepository.f18541q, androidx.lifecycle.x0.a(this), sh.u0.a(2), bool);
    }

    public static final void f(j6 j6Var, ZipOutputStream zipOutputStream, KeystoreEntity keystoreEntity, String str) throws IOException {
        File file = new File(keystoreEntity.getPath());
        if (file.exists()) {
            uh.t.b(zipOutputStream, str + "/keystore.p12", file);
        }
    }

    public static final kotlinx.serialization.json.v g(j6 j6Var, ProjectEntity projectEntity, KeystoreEntity keystoreEntity) {
        kotlinx.serialization.json.w wVar = new kotlinx.serialization.json.w();
        wVar.b("id", kotlinx.serialization.json.i.a(Long.valueOf(projectEntity.getId())));
        wVar.b("name", kotlinx.serialization.json.i.b(projectEntity.getName()));
        wVar.b("appName", kotlinx.serialization.json.i.b(projectEntity.getAppName()));
        wVar.b("packageName", kotlinx.serialization.json.i.b(projectEntity.getPackageName()));
        wVar.b("versionCode", kotlinx.serialization.json.i.a(Integer.valueOf(projectEntity.getVersionCode())));
        wVar.b("versionName", kotlinx.serialization.json.i.b(projectEntity.getVersionName()));
        wVar.b("minSdk", kotlinx.serialization.json.i.a(Integer.valueOf(projectEntity.getMinSdk())));
        wVar.b("targetSdk", kotlinx.serialization.json.i.a(Integer.valueOf(projectEntity.getTargetSdk())));
        wVar.b("maxSdk", kotlinx.serialization.json.i.a(projectEntity.getMaxSdk()));
        wVar.b("contentSourceType", kotlinx.serialization.json.i.b(projectEntity.getContentSourceType()));
        wVar.b("sourcePath", kotlinx.serialization.json.i.b(projectEntity.getSourcePath()));
        wVar.b("sourceUrl", kotlinx.serialization.json.i.b(projectEntity.getSourceUrl()));
        wVar.b("permissionsJson", kotlinx.serialization.json.i.b(projectEntity.getPermissionsJson()));
        wVar.b("iconPath", kotlinx.serialization.json.i.b(projectEntity.getIconPath()));
        wVar.b("splashPath", kotlinx.serialization.json.i.b(projectEntity.getSplashPath()));
        wVar.b("primaryColor", kotlinx.serialization.json.i.b(projectEntity.getPrimaryColor()));
        wVar.b("orientation", kotlinx.serialization.json.i.b(projectEntity.getOrientation()));
        c0.u0.b(wVar, "showHeader", Boolean.valueOf(projectEntity.getShowHeader()));
        c0.u0.b(wVar, "showActionBar", Boolean.valueOf(projectEntity.getShowActionBar()));
        c0.u0.b(wVar, "keepScreenOn", Boolean.valueOf(projectEntity.getKeepScreenOn()));
        c0.u0.b(wVar, "showCameraCutout", Boolean.valueOf(projectEntity.getShowCameraCutout()));
        c0.u0.b(wVar, "desktopMode", Boolean.valueOf(projectEntity.getDesktopMode()));
        wVar.b("webViewSettingsJson", kotlinx.serialization.json.i.b(projectEntity.getWebViewSettingsJson()));
        wVar.b("keystoreId", kotlinx.serialization.json.i.a(projectEntity.getKeystoreId()));
        wVar.b("outputFormat", kotlinx.serialization.json.i.b(projectEntity.getOutputFormat()));
        wVar.b("createdAt", kotlinx.serialization.json.i.a(Long.valueOf(projectEntity.getCreatedAt())));
        wVar.b("updatedAt", kotlinx.serialization.json.i.a(Long.valueOf(projectEntity.getUpdatedAt())));
        wVar.b("buildMode", kotlinx.serialization.json.i.b(projectEntity.getBuildMode()));
        c0.u0.b(wVar, "showWatermark", Boolean.valueOf(projectEntity.getShowWatermark()));
        c0.u0.b(wVar, "autoIncrementVersionCode", Boolean.valueOf(projectEntity.getAutoIncrementVersionCode()));
        wVar.b("deepLinkScheme", kotlinx.serialization.json.i.b(projectEntity.getDeepLinkScheme()));
        c0.u0.b(wVar, "billingEnabled", Boolean.valueOf(projectEntity.getBillingEnabled()));
        wVar.b("billingProductId", kotlinx.serialization.json.i.b(projectEntity.getBillingProductId()));
        wVar.b("billingSubscriptionId", kotlinx.serialization.json.i.b(projectEntity.getBillingSubscriptionId()));
        wVar.b("billingType", kotlinx.serialization.json.i.b(projectEntity.getBillingType()));
        c0.u0.b(wVar, "billingTestMode", Boolean.valueOf(projectEntity.getBillingTestMode()));
        c0.u0.b(wVar, "billingAutoConsume", Boolean.valueOf(projectEntity.getBillingAutoConsume()));
        c0.u0.b(wVar, "billingAcknowledge", Boolean.valueOf(projectEntity.getBillingAcknowledge()));
        c0.u0.b(wVar, "billingEnablePendingPurchases", Boolean.valueOf(projectEntity.getBillingEnablePendingPurchases()));
        wVar.b("billingSubscriptionPeriod", kotlinx.serialization.json.i.b(projectEntity.getBillingSubscriptionPeriod()));
        wVar.b("billingFreeTrialDays", kotlinx.serialization.json.i.a(Integer.valueOf(projectEntity.getBillingFreeTrialDays())));
        wVar.b("billingIntroductoryPrice", kotlinx.serialization.json.i.b(projectEntity.getBillingIntroductoryPrice()));
        wVar.b("billingProductName", kotlinx.serialization.json.i.b(projectEntity.getBillingProductName()));
        wVar.b("billingProductDescription", kotlinx.serialization.json.i.b(projectEntity.getBillingProductDescription()));
        c0.u0.b(wVar, "admobEnabled", Boolean.valueOf(projectEntity.getAdmobEnabled()));
        wVar.b("admobAppId", kotlinx.serialization.json.i.b(projectEntity.getAdmobAppId()));
        wVar.b("admobBannerUnitId", kotlinx.serialization.json.i.b(projectEntity.getAdmobBannerUnitId()));
        wVar.b("admobInterstitialUnitId", kotlinx.serialization.json.i.b(projectEntity.getAdmobInterstitialUnitId()));
        wVar.b("admobRewardedUnitId", kotlinx.serialization.json.i.b(projectEntity.getAdmobRewardedUnitId()));
        wVar.b("admobBannerPosition", kotlinx.serialization.json.i.b(projectEntity.getAdmobBannerPosition()));
        c0.u0.b(wVar, "admobShowBannerOnStart", Boolean.valueOf(projectEntity.getAdmobShowBannerOnStart()));
        wVar.b("admobTestDeviceIds", kotlinx.serialization.json.i.b(projectEntity.getAdmobTestDeviceIds()));
        c0.u0.b(wVar, "admobAutoLoadInterstitial", Boolean.valueOf(projectEntity.getAdmobAutoLoadInterstitial()));
        c0.u0.b(wVar, "admobAutoLoadRewarded", Boolean.valueOf(projectEntity.getAdmobAutoLoadRewarded()));
        c0.u0.b(wVar, "admobUseTestAds", Boolean.valueOf(projectEntity.getAdmobUseTestAds()));
        c0.u0.b(wVar, "admobBannerEnabled", Boolean.valueOf(projectEntity.getAdmobBannerEnabled()));
        c0.u0.b(wVar, "admobInterstitialEnabled", Boolean.valueOf(projectEntity.getAdmobInterstitialEnabled()));
        c0.u0.b(wVar, "admobRewardedEnabled", Boolean.valueOf(projectEntity.getAdmobRewardedEnabled()));
        wVar.b("admobInterstitialIntervalSeconds", kotlinx.serialization.json.i.a(Integer.valueOf(projectEntity.getAdmobInterstitialIntervalSeconds())));
        wVar.b("admobInterstitialPageCount", kotlinx.serialization.json.i.a(Integer.valueOf(projectEntity.getAdmobInterstitialPageCount())));
        wVar.b("admobChildDirectedTreatment", kotlinx.serialization.json.i.a(Integer.valueOf(projectEntity.getAdmobChildDirectedTreatment())));
        wVar.b("admobUnderAgeOfConsent", kotlinx.serialization.json.i.a(Integer.valueOf(projectEntity.getAdmobUnderAgeOfConsent())));
        wVar.b("admobMaxAdContentRating", kotlinx.serialization.json.i.b(projectEntity.getAdmobMaxAdContentRating()));
        c0.u0.b(wVar, "umpDebugEnabled", Boolean.valueOf(projectEntity.getUmpDebugEnabled()));
        wVar.b("umpDebugGeography", kotlinx.serialization.json.i.b(projectEntity.getUmpDebugGeography()));
        wVar.b("umpTestDeviceIds", kotlinx.serialization.json.i.b(projectEntity.getUmpTestDeviceIds()));
        wVar.b("kind", kotlinx.serialization.json.i.b(projectEntity.getKind()));
        boolean z10 = keystoreEntity != null;
        c0.u0.b(wVar, "keystoreIncluded", Boolean.valueOf(z10));
        if (z10 && keystoreEntity != null) {
            wVar.b("keystoreAlias", kotlinx.serialization.json.i.b(keystoreEntity.getAlias()));
            String password = keystoreEntity.getPassword();
            ConfigCrypto configCrypto = ConfigCrypto.INSTANCE;
            Charset charset = mh.a.f18238b;
            byte[] bytes = password.getBytes(charset);
            kotlin.jvm.internal.r.d(bytes, "getBytes(...)");
            String strEncodeToString = Base64.encodeToString(configCrypto.encryptConfig(bytes), 2);
            kotlin.jvm.internal.r.d(strEncodeToString, "encodeToString(...)");
            wVar.b("keystorePasswordEncrypted", kotlinx.serialization.json.i.b(strEncodeToString));
            String keyPassword = keystoreEntity.getKeyPassword();
            if (keyPassword == null) {
                keyPassword = keystoreEntity.getPassword();
            }
            byte[] bytes2 = keyPassword.getBytes(charset);
            kotlin.jvm.internal.r.d(bytes2, "getBytes(...)");
            String strEncodeToString2 = Base64.encodeToString(configCrypto.encryptConfig(bytes2), 2);
            kotlin.jvm.internal.r.d(strEncodeToString2, "encodeToString(...)");
            wVar.b("keystoreKeyPasswordEncrypted", kotlinx.serialization.json.i.b(strEncodeToString2));
            wVar.b("keystoreAlgorithm", kotlinx.serialization.json.i.b(keystoreEntity.getAlgorithm()));
        }
        return wVar.a();
    }

    public static final pg.n h(j6 j6Var, String str, File file, String str2) throws IOException {
        File file2 = new File(str);
        if (!file2.exists()) {
            return null;
        }
        File file3 = new File(file, str2);
        file3.mkdirs();
        File file4 = new File(file3, file2.getName());
        ah.l.d(file2, file4);
        return new pg.n(file2.getAbsolutePath(), file4.getAbsolutePath());
    }

    public static final Object i(j6 j6Var, Context context, File file, vg.i iVar) {
        wh.c cVar = ph.z0.f21632a;
        return ph.h.e(wh.b.f31563c, new n6(j6Var, context, file, null), iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:13:0x0038, B:49:0x00ee, B:51:0x00f4, B:59:0x0123, B:61:0x012b, B:20:0x005a, B:29:0x00a1), top: B:70:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #1 {all -> 0x0044, blocks: (B:13:0x0038, B:49:0x00ee, B:51:0x00f4, B:59:0x0123, B:61:0x012b, B:20:0x005a, B:29:0x00a1), top: B:70:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.File] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0112 -> B:68:0x0117). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(j6 j6Var, Context context, Uri uri, vg.c cVar) throws Throwable {
        g7 g7Var;
        List listU;
        Iterator it;
        File file;
        Context context2;
        j6 j6Var2;
        List list;
        File file2;
        String string;
        File file3 = "metadata.json";
        if (cVar instanceof g7) {
            g7Var = (g7) cVar;
            int i10 = g7Var.f32694j;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                g7Var.f32694j = i10 - PKIFailureInfo.systemUnavail;
            } else {
                g7Var = new g7(j6Var, cVar);
            }
        }
        Object obj = g7Var.f32692g;
        ug.a aVar = ug.a.f29706a;
        int i11 = g7Var.f32694j;
        try {
            if (i11 == 0) {
                pg.q.b(obj);
                File file4 = new File(context.getCacheDir(), m0.r.a("import_", System.currentTimeMillis()));
                ah.l.f(file4);
                file4.mkdirs();
                try {
                    o(context, uri, file4);
                    File file5 = new File(file4, "metadata.json");
                    ArrayList arrayList = new ArrayList();
                    if (file5.exists()) {
                        g7Var.f32686a = j6Var;
                        g7Var.f32687b = file4;
                        g7Var.f32688c = arrayList;
                        g7Var.f32694j = 1;
                        Object objH = j6Var.H(context, file4, g7Var);
                        if (objH != aVar) {
                            file2 = file4;
                            obj = objH;
                            j6Var2 = j6Var;
                            list = arrayList;
                        }
                        return aVar;
                    }
                    File[] fileArrListFiles = file4.listFiles();
                    if (fileArrListFiles != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (File file6 : fileArrListFiles) {
                            if (file6.isDirectory() && new File(file6, "metadata.json").exists()) {
                                arrayList2.add(file6);
                            }
                        }
                        listU = qg.x.U(new f7(), arrayList2);
                    } else {
                        listU = qg.z.f22752a;
                    }
                    if (listU.isEmpty()) {
                        throw new IllegalStateException(j6Var.F().getString(R.string.home_import_error));
                    }
                    it = listU.iterator();
                    file = file4;
                    context2 = context;
                    j6Var2 = j6Var;
                    list = arrayList;
                    file3 = file;
                    if (it.hasNext()) {
                    }
                    string = (String) qg.x.D(list);
                    if (string == null) {
                    }
                    ah.l.f(file3);
                    return string;
                } catch (Throwable th2) {
                    th = th2;
                    file3 = file4;
                    ah.l.f(file3);
                    throw th;
                }
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = g7Var.f32691f;
                Iterator it2 = g7Var.f32690e;
                List list2 = g7Var.f32689d;
                File file7 = (File) g7Var.f32688c;
                Context context3 = (Context) g7Var.f32687b;
                j6 j6Var3 = g7Var.f32686a;
                pg.q.b(obj);
                Iterator it3 = it2;
                j6Var2 = j6Var3;
                g7 g7Var2 = g7Var;
                File file8 = file7;
                Context context4 = context3;
                Object objH2 = obj;
                try {
                    list.add(objH2);
                    list = list2;
                    it = it3;
                    context2 = context4;
                    file = file8;
                    g7Var = g7Var2;
                    file3 = file;
                    if (it.hasNext()) {
                        File file9 = (File) it.next();
                        kotlin.jvm.internal.r.b(file9);
                        g7Var.f32686a = j6Var2;
                        g7Var.f32687b = context2;
                        g7Var.f32688c = file;
                        g7Var.f32689d = list;
                        g7Var.f32690e = it;
                        g7Var.f32691f = list;
                        g7Var.f32694j = 2;
                        objH2 = j6Var2.H(context2, file9, g7Var);
                        if (objH2 != aVar) {
                            g7Var2 = g7Var;
                            file8 = file;
                            context4 = context2;
                            it3 = it;
                            list2 = list;
                            list.add(objH2);
                            list = list2;
                            it = it3;
                            context2 = context4;
                            file = file8;
                            g7Var = g7Var2;
                            file3 = file;
                            if (it.hasNext()) {
                            }
                        }
                        return aVar;
                    }
                    string = (String) qg.x.D(list);
                    if (string == null) {
                        string = j6Var2.F().getString(R.string.home_import_title);
                        kotlin.jvm.internal.r.d(string, "getString(...)");
                    }
                    ah.l.f(file3);
                    return string;
                } catch (Throwable th3) {
                    th = th3;
                    file3 = file8;
                    ah.l.f(file3);
                    throw th;
                }
            }
            list = (List) g7Var.f32688c;
            File file10 = (File) g7Var.f32687b;
            j6Var2 = g7Var.f32686a;
            pg.q.b(obj);
            file2 = file10;
            list.add((String) obj);
            file3 = file2;
            string = (String) qg.x.D(list);
            if (string == null) {
            }
            ah.l.f(file3);
            return string;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [x8.j6] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, sh.z0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(j6 j6Var, eh.l lVar, vg.c cVar) {
        r7 r7Var;
        j6 j6Var2;
        if (cVar instanceof r7) {
            r7Var = (r7) cVar;
            int i10 = r7Var.f33131d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                r7Var.f33131d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                r7Var = new r7(j6Var, cVar);
            }
        }
        Object objInvoke = r7Var.f33129b;
        ug.a aVar = ug.a.f29706a;
        int i11 = r7Var.f33131d;
        try {
            if (i11 == 0) {
                pg.q.b(objInvoke);
                sh.z0 z0Var = j6Var.A;
                Boolean bool = Boolean.TRUE;
                z0Var.getClass();
                z0Var.j(null, bool);
                r7Var.f33128a = j6Var;
                r7Var.f33131d = 1;
                objInvoke = lVar.invoke(r7Var);
                j6Var2 = j6Var;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j6 j6Var3 = r7Var.f33128a;
                pg.q.b(objInvoke);
                j6Var2 = j6Var3;
            }
            return objInvoke;
        } catch (Exception e10) {
            return pg.q.a(e10);
        } finally {
            sh.z0 z0Var2 = j6Var.A;
            Boolean bool2 = Boolean.FALSE;
            z0Var2.getClass();
            z0Var2.j(null, bool2);
        }
    }

    public static String m(File file, File file2, String str) throws IOException {
        File file3 = new File(file2, str);
        file3.mkdirs();
        if (!file.isDirectory()) {
            File file4 = new File(file3, file.getName());
            ah.l.e(file, file4);
            String absolutePath = file4.getAbsolutePath();
            kotlin.jvm.internal.r.d(absolutePath, "getAbsolutePath(...)");
            return absolutePath;
        }
        File file5 = new File(file3, file.getName());
        file5.mkdirs();
        ah.l.d(file, file5);
        String absolutePath2 = file5.getAbsolutePath();
        kotlin.jvm.internal.r.d(absolutePath2, "getAbsolutePath(...)");
        return absolutePath2;
    }

    public static void o(Context context, Uri uri, File file) throws IOException {
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            throw new IllegalStateException("Failed to open import file");
        }
        try {
            ZipInputStream zipInputStream = new ZipInputStream(inputStreamOpenInputStream);
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                while (nextEntry != null) {
                    String name = nextEntry.getName();
                    kotlin.jvm.internal.r.d(name, "getName(...)");
                    String strM = mh.t.m(name, '\\', '/');
                    if (mh.x.r(strM, "..", false) || mh.t.p(strM, "/", false)) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        File canonicalFile = new File(file, strM).getCanonicalFile();
                        File canonicalFile2 = file.getCanonicalFile();
                        String path = canonicalFile.getPath();
                        kotlin.jvm.internal.r.d(path, "getPath(...)");
                        String path2 = canonicalFile2.getPath();
                        kotlin.jvm.internal.r.d(path2, "getPath(...)");
                        if (mh.t.p(path, path2, false)) {
                            if (nextEntry.isDirectory()) {
                                canonicalFile.mkdirs();
                            } else {
                                File parentFile = canonicalFile.getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                }
                                FileOutputStream fileOutputStream = new FileOutputStream(canonicalFile);
                                try {
                                    ah.b.a(zipInputStream, fileOutputStream, 8192);
                                    fileOutputStream.close();
                                } finally {
                                }
                            }
                            zipInputStream.closeEntry();
                            nextEntry = zipInputStream.getNextEntry();
                        } else {
                            zipInputStream.closeEntry();
                            nextEntry = zipInputStream.getNextEntry();
                        }
                    }
                }
                pg.f0 f0Var = pg.f0.f21461a;
                zipInputStream.close();
                inputStreamOpenInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static Boolean q(kotlinx.serialization.json.v vVar, String str) {
        String strC;
        kotlinx.serialization.json.h hVar = (kotlinx.serialization.json.h) vVar.get(str);
        if (hVar != null && (strC = kotlinx.serialization.json.i.f(hVar).c()) != null) {
            if (strC.equals("true")) {
                return Boolean.TRUE;
            }
            if (strC.equals("false")) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    public static Integer w(kotlinx.serialization.json.v vVar, String str) {
        String strC;
        kotlinx.serialization.json.h hVar = (kotlinx.serialization.json.h) vVar.get(str);
        if (hVar == null || (strC = kotlinx.serialization.json.i.f(hVar).c()) == null) {
            return null;
        }
        return mh.s.g(strC);
    }

    public static String y(kotlinx.serialization.json.v vVar, String str) {
        kotlinx.serialization.json.h hVar = (kotlinx.serialization.json.h) vVar.get(str);
        if (hVar != null && !(hVar instanceof kotlinx.serialization.json.t)) {
            kotlinx.serialization.json.x xVarF = kotlinx.serialization.json.i.f(hVar);
            String strC = xVarF instanceof kotlinx.serialization.json.t ? null : xVarF.c();
            if (strC != null && !kotlin.jvm.internal.r.a(mh.x.W(strC).toString(), "null") && !mh.x.A(strC)) {
                return strC;
            }
        }
        return null;
    }

    public final sh.l0 A() {
        return this.H;
    }

    public final sh.l0 B() {
        return this.f32792s;
    }

    public final sh.l0 C() {
        return this.f32795v;
    }

    public final sh.l0 D() {
        return this.f32788o;
    }

    public final sh.l0 E() {
        return this.f32789p;
    }

    public final Context F() {
        l9.d0.f16789a.getClass();
        return l9.d0.g(this.f32780g);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x015f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(Context context, File file, kotlinx.serialization.json.v vVar, vg.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, InvalidAlgorithmParameterException {
        c7 c7Var;
        String strY;
        String strY2;
        String str;
        String str2;
        File file2;
        String str3;
        Context context2;
        j6 j6Var;
        String str4;
        j6 j6Var2;
        if (cVar instanceof c7) {
            c7Var = (c7) cVar;
            int i10 = c7Var.f32454k;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                c7Var.f32454k = i10 - PKIFailureInfo.systemUnavail;
            } else {
                c7Var = new c7(this, cVar);
            }
        }
        Object obj = c7Var.f32452h;
        ug.a aVar = ug.a.f29706a;
        int i11 = c7Var.f32454k;
        if (i11 == 0) {
            pg.q.b(obj);
            Boolean boolQ = q(vVar, "keystoreIncluded");
            if ((boolQ != null ? boolQ.booleanValue() : false) && (strY = y(vVar, "keystoreAlias")) != null && (strY2 = y(vVar, "keystorePasswordEncrypted")) != null) {
                String strY3 = y(vVar, "keystoreKeyPasswordEncrypted");
                String strY4 = y(vVar, "keystoreAlgorithm");
                if (strY4 == null) {
                    strY4 = "RSA";
                }
                str = strY4;
                byte[] bArrDecode = Base64.decode(strY2, 2);
                ConfigCrypto configCrypto = ConfigCrypto.INSTANCE;
                kotlin.jvm.internal.r.b(bArrDecode);
                byte[] bArrDecryptConfig = configCrypto.decryptConfig(bArrDecode);
                Charset charset = mh.a.f18238b;
                String str5 = new String(bArrDecryptConfig, charset);
                if (strY3 != null) {
                    byte[] bArrDecode2 = Base64.decode(strY3, 2);
                    kotlin.jvm.internal.r.b(bArrDecode2);
                    str2 = new String(configCrypto.decryptConfig(bArrDecode2), charset);
                } else {
                    str2 = str5;
                }
                file2 = new File(file, "keystore/keystore.p12");
                if (file2.exists()) {
                    KeystoreHelper keystoreHelper = KeystoreHelper.INSTANCE;
                    if (keystoreHelper.verifyKeystore(file2, str5, strY, str2)) {
                        String certificateFingerprint = keystoreHelper.getCertificateFingerprint(file2, str5, strY);
                        if (certificateFingerprint != null) {
                            c7Var.f32445a = this;
                            c7Var.f32446b = context;
                            c7Var.f32447c = strY;
                            c7Var.f32448d = str;
                            c7Var.f32449e = str5;
                            c7Var.f32450f = str2;
                            c7Var.f32451g = file2;
                            c7Var.f32454k = 1;
                            Object objP = p(certificateFingerprint, c7Var);
                            if (objP != aVar) {
                                str4 = str5;
                                obj = objP;
                                context2 = context;
                                j6Var2 = this;
                            }
                        }
                        str3 = str5;
                        context2 = context;
                        j6Var = this;
                        String str6 = str2;
                        String str7 = str;
                        String str8 = strY;
                        File file3 = new File(context2.getFilesDir(), "keystores");
                        file3.mkdirs();
                        File file4 = new File(file3, c2.u.a("imported_project_", KeystoreStorage.FILE_EXTENSION, System.currentTimeMillis()));
                        ah.l.e(file2, file4);
                        String absolutePath = file4.getAbsolutePath();
                        kotlin.jvm.internal.r.d(absolutePath, "getAbsolutePath(...)");
                        KeystoreEntity keystoreEntity = new KeystoreEntity(0L, str8, absolutePath, str3, str8, str7, false, null, str6, 0L, 705, null);
                        n8.l lVar = j6Var.f32776c;
                        c7Var.f32445a = null;
                        c7Var.f32446b = null;
                        c7Var.f32447c = null;
                        c7Var.f32448d = null;
                        c7Var.f32449e = null;
                        c7Var.f32450f = null;
                        c7Var.f32451g = null;
                        c7Var.f32454k = 2;
                        Object objF = lVar.f(keystoreEntity, c7Var);
                        return objF != aVar ? aVar : objF;
                    }
                }
            }
            return null;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        file2 = c7Var.f32451g;
        str2 = c7Var.f32450f;
        str4 = c7Var.f32449e;
        str = c7Var.f32448d;
        strY = c7Var.f32447c;
        context2 = c7Var.f32446b;
        j6Var2 = c7Var.f32445a;
        pg.q.b(obj);
        KeystoreEntity keystoreEntity2 = (KeystoreEntity) obj;
        if (keystoreEntity2 != null) {
            return new Long(keystoreEntity2.getId());
        }
        str3 = str4;
        j6Var = j6Var2;
        String str62 = str2;
        String str72 = str;
        String str82 = strY;
        File file32 = new File(context2.getFilesDir(), "keystores");
        file32.mkdirs();
        File file42 = new File(file32, c2.u.a("imported_project_", KeystoreStorage.FILE_EXTENSION, System.currentTimeMillis()));
        ah.l.e(file2, file42);
        String absolutePath2 = file42.getAbsolutePath();
        kotlin.jvm.internal.r.d(absolutePath2, "getAbsolutePath(...)");
        KeystoreEntity keystoreEntity3 = new KeystoreEntity(0L, str82, absolutePath2, str3, str82, str72, false, null, str62, 0L, 705, null);
        n8.l lVar2 = j6Var.f32776c;
        c7Var.f32445a = null;
        c7Var.f32446b = null;
        c7Var.f32447c = null;
        c7Var.f32448d = null;
        c7Var.f32449e = null;
        c7Var.f32450f = null;
        c7Var.f32451g = null;
        c7Var.f32454k = 2;
        Object objF2 = lVar2.f(keystoreEntity3, c7Var);
        if (objF2 != aVar) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:299:0x06a6, code lost:
    
        if (r0.c(r1, r3) != r4) goto L301;
     */
    /* JADX WARN: Removed duplicated region for block: B:260:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(Context context, File file, vg.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, IOException, InvalidKeyException, KeyStoreException, InvalidAlgorithmParameterException {
        d7 d7Var;
        int i10;
        kotlinx.serialization.json.v vVar;
        String name;
        String str;
        File file2;
        ProjectEntity projectEntity;
        String str2;
        Context context2;
        String str3;
        j6 j6Var;
        String strC;
        String strC2;
        String strC3;
        String strC4;
        String absolutePath;
        String str4;
        File[] fileArrListFiles;
        String strM;
        File[] fileArrListFiles2;
        String strM2;
        String str5;
        ProjectEntity projectEntity2;
        long j10;
        String strM3;
        String strM4;
        File[] fileArrListFiles3;
        ProjectEntity projectEntityCopy$default;
        if (cVar instanceof d7) {
            d7Var = (d7) cVar;
            int i11 = d7Var.f32525n;
            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                d7Var.f32525n = i11 - PKIFailureInfo.systemUnavail;
            } else {
                d7Var = new d7(this, cVar);
            }
        }
        Object objG = d7Var.f32523l;
        ug.a aVar = ug.a.f29706a;
        int i12 = d7Var.f32525n;
        if (i12 == 0) {
            i10 = 0;
            pg.q.b(objG);
            File file3 = new File(file, "metadata.json");
            if (!file3.exists()) {
                throw new IllegalStateException("metadata.json not found");
            }
            kotlinx.serialization.json.h hVarD = this.E.d(ah.l.k(file3, mh.a.f18238b));
            vVar = hVarD instanceof kotlinx.serialization.json.v ? (kotlinx.serialization.json.v) hVarD : null;
            if (vVar == null) {
                throw new IllegalStateException("Invalid metadata.json");
            }
            kotlinx.serialization.json.h hVar = (kotlinx.serialization.json.h) vVar.get("sourcePath");
            String name2 = (hVar == null || (strC4 = kotlinx.serialization.json.i.f(hVar).c()) == null) ? null : new File(strC4).getName();
            kotlinx.serialization.json.h hVar2 = (kotlinx.serialization.json.h) vVar.get("iconPath");
            name = (hVar2 == null || (strC3 = kotlinx.serialization.json.i.f(hVar2).c()) == null) ? null : new File(strC3).getName();
            kotlinx.serialization.json.h hVar3 = (kotlinx.serialization.json.h) vVar.get("splashPath");
            String name3 = (hVar3 == null || (strC2 = kotlinx.serialization.json.i.f(hVar3).c()) == null) ? null : new File(strC2).getName();
            String strY = y(vVar, "contentSourceType");
            if (strY == null) {
                strY = "local";
            }
            String str6 = strY;
            String strY2 = y(vVar, "name");
            if (strY2 == null) {
                strY2 = "Imported Project";
            }
            String str7 = strY2;
            String strY3 = y(vVar, "appName");
            if (strY3 == null && (strY3 = y(vVar, "name")) == null) {
                strY3 = "Imported App";
            }
            String str8 = strY3;
            String strY4 = y(vVar, "packageName");
            if (strY4 == null) {
                strY4 = "com.example.imported";
            }
            String str9 = strY4;
            Integer numW = w(vVar, "versionCode");
            int iIntValue = numW != null ? numW.intValue() : 1;
            String strY5 = y(vVar, "versionName");
            if (strY5 == null) {
                strY5 = "1.0";
            }
            String str10 = strY5;
            Integer numW2 = w(vVar, "minSdk");
            int iIntValue2 = numW2 != null ? numW2.intValue() : 24;
            Integer numW3 = w(vVar, "targetSdk");
            int iIntValue3 = numW3 != null ? numW3.intValue() : 36;
            kotlinx.serialization.json.h hVar4 = (kotlinx.serialization.json.h) vVar.get("maxSdk");
            Integer numG = (hVar4 == null || (strC = kotlinx.serialization.json.i.f(hVar4).c()) == null) ? null : mh.s.g(strC);
            String strY6 = y(vVar, "sourceUrl");
            String strY7 = y(vVar, "permissionsJson");
            if (strY7 == null) {
                strY7 = "[]";
            }
            String str11 = strY7;
            String strY8 = y(vVar, "primaryColor");
            String strY9 = y(vVar, "orientation");
            if (strY9 == null) {
                strY9 = "portrait";
            }
            String str12 = strY9;
            Boolean boolQ = q(vVar, "showHeader");
            boolean zBooleanValue = boolQ != null ? boolQ.booleanValue() : true;
            Boolean boolQ2 = q(vVar, "showActionBar");
            boolean zBooleanValue2 = boolQ2 != null ? boolQ2.booleanValue() : true;
            Boolean boolQ3 = q(vVar, "keepScreenOn");
            boolean zBooleanValue3 = boolQ3 != null ? boolQ3.booleanValue() : false;
            Boolean boolQ4 = q(vVar, "showCameraCutout");
            boolean zBooleanValue4 = boolQ4 != null ? boolQ4.booleanValue() : false;
            Boolean boolQ5 = q(vVar, "desktopMode");
            boolean zBooleanValue5 = boolQ5 != null ? boolQ5.booleanValue() : false;
            String strY10 = y(vVar, "webViewSettingsJson");
            if (strY10 == null) {
                strY10 = "{}";
            }
            String str13 = strY10;
            String strY11 = y(vVar, "outputFormat");
            if (strY11 == null) {
                strY11 = ProjectKind.APK;
            }
            String str14 = strY11;
            String strY12 = y(vVar, "buildMode");
            if (strY12 == null) {
                strY12 = "advanced";
            }
            String str15 = strY12;
            Boolean boolQ6 = q(vVar, "showWatermark");
            boolean zBooleanValue6 = boolQ6 != null ? boolQ6.booleanValue() : false;
            Boolean boolQ7 = q(vVar, "autoIncrementVersionCode");
            boolean zBooleanValue7 = boolQ7 != null ? boolQ7.booleanValue() : false;
            String strY13 = y(vVar, "deepLinkScheme");
            Boolean boolQ8 = q(vVar, "billingEnabled");
            boolean zBooleanValue8 = boolQ8 != null ? boolQ8.booleanValue() : false;
            String strY14 = y(vVar, "billingProductId");
            String strY15 = y(vVar, "billingSubscriptionId");
            String strY16 = y(vVar, "billingType");
            if (strY16 == null) {
                strY16 = "non_consumable";
            }
            String str16 = strY16;
            Boolean boolQ9 = q(vVar, "billingTestMode");
            boolean zBooleanValue9 = boolQ9 != null ? boolQ9.booleanValue() : false;
            Boolean boolQ10 = q(vVar, "billingAutoConsume");
            boolean zBooleanValue10 = boolQ10 != null ? boolQ10.booleanValue() : true;
            Boolean boolQ11 = q(vVar, "billingAcknowledge");
            boolean zBooleanValue11 = boolQ11 != null ? boolQ11.booleanValue() : true;
            Boolean boolQ12 = q(vVar, "billingEnablePendingPurchases");
            boolean zBooleanValue12 = boolQ12 != null ? boolQ12.booleanValue() : true;
            String strY17 = y(vVar, "billingSubscriptionPeriod");
            Integer numW4 = w(vVar, "billingFreeTrialDays");
            int iIntValue4 = numW4 != null ? numW4.intValue() : 0;
            String strY18 = y(vVar, "billingIntroductoryPrice");
            String strY19 = y(vVar, "billingProductName");
            String strY20 = y(vVar, "billingProductDescription");
            Boolean boolQ13 = q(vVar, "admobEnabled");
            boolean zBooleanValue13 = boolQ13 != null ? boolQ13.booleanValue() : false;
            String strY21 = y(vVar, "admobAppId");
            String strY22 = y(vVar, "admobBannerUnitId");
            String strY23 = y(vVar, "admobInterstitialUnitId");
            String strY24 = y(vVar, "admobRewardedUnitId");
            String strY25 = y(vVar, "admobBannerPosition");
            if (strY25 == null) {
                strY25 = "bottom";
            }
            String str17 = strY25;
            Boolean boolQ14 = q(vVar, "admobShowBannerOnStart");
            boolean zBooleanValue14 = boolQ14 != null ? boolQ14.booleanValue() : false;
            String strY26 = y(vVar, "admobTestDeviceIds");
            Boolean boolQ15 = q(vVar, "admobAutoLoadInterstitial");
            boolean zBooleanValue15 = boolQ15 != null ? boolQ15.booleanValue() : false;
            Boolean boolQ16 = q(vVar, "admobAutoLoadRewarded");
            boolean zBooleanValue16 = boolQ16 != null ? boolQ16.booleanValue() : false;
            Boolean boolQ17 = q(vVar, "admobUseTestAds");
            boolean zBooleanValue17 = boolQ17 != null ? boolQ17.booleanValue() : false;
            Boolean boolQ18 = q(vVar, "admobBannerEnabled");
            boolean zBooleanValue18 = boolQ18 != null ? boolQ18.booleanValue() : false;
            Boolean boolQ19 = q(vVar, "admobInterstitialEnabled");
            boolean zBooleanValue19 = boolQ19 != null ? boolQ19.booleanValue() : false;
            Boolean boolQ20 = q(vVar, "admobRewardedEnabled");
            boolean zBooleanValue20 = boolQ20 != null ? boolQ20.booleanValue() : false;
            Integer numW5 = w(vVar, "admobInterstitialIntervalSeconds");
            int iIntValue5 = numW5 != null ? numW5.intValue() : 0;
            Integer numW6 = w(vVar, "admobInterstitialPageCount");
            int iIntValue6 = numW6 != null ? numW6.intValue() : 0;
            Integer numW7 = w(vVar, "admobChildDirectedTreatment");
            int iIntValue7 = numW7 != null ? numW7.intValue() : -1;
            Integer numW8 = w(vVar, "admobUnderAgeOfConsent");
            int iIntValue8 = numW8 != null ? numW8.intValue() : -1;
            String strY27 = y(vVar, "admobMaxAdContentRating");
            if (strY27 == null) {
                strY27 = "";
            }
            String str18 = strY27;
            Boolean boolQ21 = q(vVar, "umpDebugEnabled");
            boolean zBooleanValue21 = boolQ21 != null ? boolQ21.booleanValue() : false;
            String strY28 = y(vVar, "umpDebugGeography");
            if (strY28 == null) {
                strY28 = "DISABLED";
            }
            ProjectEntity projectEntity3 = new ProjectEntity(0L, str7, str8, str9, iIntValue, str10, iIntValue2, iIntValue3, numG, str6, null, strY6, str11, null, null, strY8, str12, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, str13, null, str14, str15, zBooleanValue6, zBooleanValue7, strY13, zBooleanValue8, strY14, strY15, str16, zBooleanValue9, zBooleanValue10, zBooleanValue11, zBooleanValue12, strY17, iIntValue4, strY18, strY19, strY20, zBooleanValue13, strY21, strY22, strY23, strY24, str17, zBooleanValue14, strY26, zBooleanValue15, zBooleanValue16, zBooleanValue17, zBooleanValue18, zBooleanValue19, zBooleanValue20, iIntValue5, iIntValue6, iIntValue7, iIntValue8, str18, zBooleanValue21, strY28, y(vVar, "umpTestDeviceIds"), ProjectKind.INSTANCE.normalize(y(vVar, "kind")), null, System.currentTimeMillis(), System.currentTimeMillis(), 8414208, 0, 2, null);
            str = str6;
            d7Var.f32513a = this;
            d7Var.f32514b = context;
            d7Var.f32515c = file;
            d7Var.f32516d = vVar;
            d7Var.f32517e = name2;
            d7Var.f32518f = name;
            d7Var.f32519g = name3;
            d7Var.f32520h = str;
            d7Var.f32521j = projectEntity3;
            d7Var.f32525n = 1;
            Object objInsert = this.f32775b.f18583a.insert(projectEntity3, d7Var);
            if (objInsert != aVar) {
                file2 = file;
                projectEntity = projectEntity3;
                str2 = name3;
                objG = objInsert;
                context2 = context;
                str3 = name2;
                j6Var = this;
            }
            return aVar;
        }
        if (i12 == 1) {
            projectEntity = d7Var.f32521j;
            str = d7Var.f32520h;
            str2 = d7Var.f32519g;
            name = d7Var.f32518f;
            String str19 = d7Var.f32517e;
            vVar = (kotlinx.serialization.json.v) d7Var.f32516d;
            file2 = (File) d7Var.f32515c;
            context2 = (Context) d7Var.f32514b;
            i10 = 0;
            j6 j6Var2 = (j6) d7Var.f32513a;
            pg.q.b(objG);
            j6Var = j6Var2;
            str3 = str19;
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                projectEntityCopy$default = (ProjectEntity) d7Var.f32513a;
                pg.q.b(objG);
                return projectEntityCopy$default.getName();
            }
            long j11 = d7Var.f32522k;
            String str20 = d7Var.f32517e;
            strM = (String) d7Var.f32516d;
            str4 = (String) d7Var.f32515c;
            ProjectEntity projectEntity4 = (ProjectEntity) d7Var.f32514b;
            j6Var = (j6) d7Var.f32513a;
            pg.q.b(objG);
            str5 = str20;
            j10 = j11;
            projectEntity2 = projectEntity4;
            projectEntityCopy$default = ProjectEntity.copy$default(projectEntity2, j10, null, null, null, 0, null, 0, 0, null, null, str4, null, null, strM, str5, null, null, false, false, false, false, false, null, (Long) objG, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -8414210, -1, 15, null);
            n8.s sVar = j6Var.f32775b;
            d7Var.f32513a = projectEntityCopy$default;
            d7Var.f32514b = null;
            d7Var.f32515c = null;
            d7Var.f32516d = null;
            d7Var.f32517e = null;
            d7Var.f32525n = 3;
        }
        long jLongValue = ((Number) objG).longValue();
        if (jLongValue == 0) {
            throw new IllegalStateException("Failed to insert project");
        }
        File file4 = new File(context2.getFilesDir(), m0.r.a("projects/", jLongValue));
        file4.mkdirs();
        File file5 = new File(file2, "content");
        if (!kotlin.jvm.internal.r.a(str, "folder")) {
            if (file5.exists() && file5.isDirectory() && (fileArrListFiles3 = file5.listFiles()) != null) {
                int length = fileArrListFiles3.length;
                for (int i13 = i10; i13 < length; i13++) {
                    if (!fileArrListFiles3[i13].isDirectory()) {
                    }
                }
            }
            if (str3 != null) {
                File file6 = new File(file2, "content/".concat(str3));
                if (!file6.exists()) {
                    File[] fileArrListFiles4 = file5.listFiles();
                    if (fileArrListFiles4 != null) {
                        File file7 = fileArrListFiles4.length == 0 ? null : fileArrListFiles4[i10];
                        if (file7 != null) {
                            j6Var.getClass();
                            absolutePath = m(file7, file4, "content");
                        }
                    }
                    str4 = null;
                } else if (file6.isDirectory()) {
                    File file8 = new File(file4, "content");
                    file8.mkdirs();
                    ah.l.d(file6, file8);
                    absolutePath = file8.getAbsolutePath();
                } else {
                    j6Var.getClass();
                    absolutePath = m(file6, file4, "content");
                }
                str4 = absolutePath;
            } else {
                if (file5.exists() && file5.isDirectory()) {
                    File file9 = new File(file4, "content");
                    file9.mkdirs();
                    ah.l.d(file5, file9);
                    absolutePath = file9.getAbsolutePath();
                    str4 = absolutePath;
                }
                str4 = null;
            }
            if (name != null) {
                File file10 = new File(file2, "icon/".concat(name));
                if (file10.exists()) {
                    j6Var.getClass();
                    strM4 = m(file10, file4, "icons");
                } else {
                    strM4 = null;
                }
                if (strM4 != null) {
                    strM = strM4;
                }
                if (str2 != null) {
                    File file11 = new File(file2, "splash/".concat(str2));
                    if (file11.exists()) {
                        j6Var.getClass();
                        strM3 = m(file11, file4, "splash");
                    } else {
                        strM3 = null;
                    }
                    if (strM3 != null) {
                        strM2 = strM3;
                    }
                    d7Var.f32513a = j6Var;
                    d7Var.f32514b = projectEntity;
                    d7Var.f32515c = str4;
                    d7Var.f32516d = strM;
                    d7Var.f32517e = strM2;
                    d7Var.f32518f = null;
                    d7Var.f32519g = null;
                    d7Var.f32520h = null;
                    d7Var.f32521j = null;
                    d7Var.f32522k = jLongValue;
                    d7Var.f32525n = 2;
                    objG = j6Var.G(context2, file2, vVar, d7Var);
                    aVar = aVar;
                    if (objG != aVar) {
                        str5 = strM2;
                        projectEntity2 = projectEntity;
                        j10 = jLongValue;
                        projectEntityCopy$default = ProjectEntity.copy$default(projectEntity2, j10, null, null, null, 0, null, 0, 0, null, null, str4, null, null, strM, str5, null, null, false, false, false, false, false, null, (Long) objG, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -8414210, -1, 15, null);
                        n8.s sVar2 = j6Var.f32775b;
                        d7Var.f32513a = projectEntityCopy$default;
                        d7Var.f32514b = null;
                        d7Var.f32515c = null;
                        d7Var.f32516d = null;
                        d7Var.f32517e = null;
                        d7Var.f32525n = 3;
                    }
                    return aVar;
                }
                fileArrListFiles2 = new File(file2, "splash").listFiles();
                if (fileArrListFiles2 != null) {
                    File file12 = fileArrListFiles2.length == 0 ? null : fileArrListFiles2[i10];
                    if (file12 != null) {
                        j6Var.getClass();
                        strM2 = m(file12, file4, "splash");
                    }
                    d7Var.f32513a = j6Var;
                    d7Var.f32514b = projectEntity;
                    d7Var.f32515c = str4;
                    d7Var.f32516d = strM;
                    d7Var.f32517e = strM2;
                    d7Var.f32518f = null;
                    d7Var.f32519g = null;
                    d7Var.f32520h = null;
                    d7Var.f32521j = null;
                    d7Var.f32522k = jLongValue;
                    d7Var.f32525n = 2;
                    objG = j6Var.G(context2, file2, vVar, d7Var);
                    aVar = aVar;
                    if (objG != aVar) {
                    }
                    return aVar;
                }
                strM2 = null;
                d7Var.f32513a = j6Var;
                d7Var.f32514b = projectEntity;
                d7Var.f32515c = str4;
                d7Var.f32516d = strM;
                d7Var.f32517e = strM2;
                d7Var.f32518f = null;
                d7Var.f32519g = null;
                d7Var.f32520h = null;
                d7Var.f32521j = null;
                d7Var.f32522k = jLongValue;
                d7Var.f32525n = 2;
                objG = j6Var.G(context2, file2, vVar, d7Var);
                aVar = aVar;
                if (objG != aVar) {
                }
                return aVar;
            }
            fileArrListFiles = new File(file2, "icon").listFiles();
            if (fileArrListFiles != null) {
                File file13 = fileArrListFiles.length == 0 ? null : fileArrListFiles[i10];
                if (file13 != null) {
                    j6Var.getClass();
                    strM = m(file13, file4, "icons");
                }
                if (str2 != null) {
                }
                fileArrListFiles2 = new File(file2, "splash").listFiles();
                if (fileArrListFiles2 != null) {
                }
                strM2 = null;
                d7Var.f32513a = j6Var;
                d7Var.f32514b = projectEntity;
                d7Var.f32515c = str4;
                d7Var.f32516d = strM;
                d7Var.f32517e = strM2;
                d7Var.f32518f = null;
                d7Var.f32519g = null;
                d7Var.f32520h = null;
                d7Var.f32521j = null;
                d7Var.f32522k = jLongValue;
                d7Var.f32525n = 2;
                objG = j6Var.G(context2, file2, vVar, d7Var);
                aVar = aVar;
                if (objG != aVar) {
                }
                return aVar;
            }
            strM = null;
            if (str2 != null) {
            }
            fileArrListFiles2 = new File(file2, "splash").listFiles();
            if (fileArrListFiles2 != null) {
            }
            strM2 = null;
            d7Var.f32513a = j6Var;
            d7Var.f32514b = projectEntity;
            d7Var.f32515c = str4;
            d7Var.f32516d = strM;
            d7Var.f32517e = strM2;
            d7Var.f32518f = null;
            d7Var.f32519g = null;
            d7Var.f32520h = null;
            d7Var.f32521j = null;
            d7Var.f32522k = jLongValue;
            d7Var.f32525n = 2;
            objG = j6Var.G(context2, file2, vVar, d7Var);
            aVar = aVar;
            if (objG != aVar) {
            }
            return aVar;
        }
        if (file5.exists() && file5.isDirectory()) {
            File file14 = new File(file4, "content");
            file14.mkdirs();
            ah.l.d(file5, file14);
            absolutePath = file14.getAbsolutePath();
            str4 = absolutePath;
            if (name != null) {
            }
            fileArrListFiles = new File(file2, "icon").listFiles();
            if (fileArrListFiles != null) {
            }
            strM = null;
            if (str2 != null) {
            }
            fileArrListFiles2 = new File(file2, "splash").listFiles();
            if (fileArrListFiles2 != null) {
            }
            strM2 = null;
            d7Var.f32513a = j6Var;
            d7Var.f32514b = projectEntity;
            d7Var.f32515c = str4;
            d7Var.f32516d = strM;
            d7Var.f32517e = strM2;
            d7Var.f32518f = null;
            d7Var.f32519g = null;
            d7Var.f32520h = null;
            d7Var.f32521j = null;
            d7Var.f32522k = jLongValue;
            d7Var.f32525n = 2;
            objG = j6Var.G(context2, file2, vVar, d7Var);
            aVar = aVar;
            if (objG != aVar) {
            }
            return aVar;
        }
        str4 = null;
        if (name != null) {
        }
        fileArrListFiles = new File(file2, "icon").listFiles();
        if (fileArrListFiles != null) {
        }
        strM = null;
        if (str2 != null) {
        }
        fileArrListFiles2 = new File(file2, "splash").listFiles();
        if (fileArrListFiles2 != null) {
        }
        strM2 = null;
        d7Var.f32513a = j6Var;
        d7Var.f32514b = projectEntity;
        d7Var.f32515c = str4;
        d7Var.f32516d = strM;
        d7Var.f32517e = strM2;
        d7Var.f32518f = null;
        d7Var.f32519g = null;
        d7Var.f32520h = null;
        d7Var.f32521j = null;
        d7Var.f32522k = jLongValue;
        d7Var.f32525n = 2;
        objG = j6Var.G(context2, file2, vVar, d7Var);
        aVar = aVar;
        if (objG != aVar) {
        }
        return aVar;
    }

    public final sh.l0 I() {
        return this.B;
    }

    public final sh.l0 J() {
        return this.D;
    }

    public final sh.y0<Boolean> K() {
        return this.f32784k;
    }

    public final void L(long j10, Long l10) {
        ph.h.c(androidx.lifecycle.x0.a(this), null, null, new e(j10, l10, null), 3);
    }

    public final void M() {
        this.f32790q = true;
        Boolean bool = Boolean.FALSE;
        sh.z0 z0Var = this.f32791r;
        z0Var.getClass();
        z0Var.j(null, bool);
        ph.h.c(androidx.lifecycle.x0.a(this), null, null, new f(null), 3);
    }

    public final boolean l(String kind) {
        int i10;
        kotlin.jvm.internal.r.e(kind, "kind");
        m0 m0Var = (m0) this.f32783j.f25021a.getValue();
        if (!m0Var.f32925b) {
            ProjectLimits projectLimits = ProjectLimits.INSTANCE;
            boolean zBooleanValue = ((Boolean) this.f32784k.f25021a.getValue()).booleanValue();
            List<ProjectEntity> list = m0Var.f32924a;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.r.a(ProjectKind.INSTANCE.normalize(((ProjectEntity) it.next()).getKind()), kind) && (i10 = i10 + 1) < 0) {
                        qg.p.n();
                        throw null;
                    }
                }
            } else {
                i10 = 0;
            }
            if (projectLimits.canCreate(kind, zBooleanValue, i10)) {
                return true;
            }
        }
        return false;
    }

    public final void n(String str, eh.l<? super a, pg.f0> lVar, Uri uri, eh.l<? super tg.e<? super ProjectEntity>, ? extends Object> lVar2) {
        if (this.I) {
            return;
        }
        this.I = true;
        ph.h.c(androidx.lifecycle.x0.a(this), null, null, new d(str, uri, this, lVar, lVar2, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(String str, vg.c cVar) {
        b7 b7Var;
        String certificateFingerprint;
        Object next;
        if (cVar instanceof b7) {
            b7Var = (b7) cVar;
            int i10 = b7Var.f32337d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                b7Var.f32337d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                b7Var = new b7(this, cVar);
            }
        }
        Object objF = b7Var.f32335b;
        ug.a aVar = ug.a.f29706a;
        int i11 = b7Var.f32337d;
        if (i11 == 0) {
            pg.q.b(objF);
            sh.f<List<KeystoreEntity>> fVarE = this.f32776c.e();
            b7Var.f32334a = str;
            b7Var.f32337d = 1;
            objF = gg.a.f(fVarE, b7Var);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = b7Var.f32334a;
            pg.q.b(objF);
        }
        Iterator it = ((Iterable) objF).iterator();
        do {
            certificateFingerprint = null;
            if (!it.hasNext()) {
                return null;
            }
            next = it.next();
            KeystoreEntity keystoreEntity = (KeystoreEntity) next;
            try {
                certificateFingerprint = KeystoreHelper.INSTANCE.getCertificateFingerprint(new File(keystoreEntity.getPath()), keystoreEntity.getPassword(), keystoreEntity.getKeyAlias());
            } catch (Exception unused) {
            }
        } while (!kotlin.jvm.internal.r.a(certificateFingerprint, str));
        return next;
    }

    public final sh.l0 r() {
        return this.f32797x;
    }

    public final sh.l0 s() {
        return this.F;
    }

    public final sh.l0 t() {
        return this.f32787n;
    }

    public final sh.l0 u() {
        return this.G;
    }

    public final sh.l0 v() {
        return this.f32799z;
    }

    public final sh.l0 x() {
        return this.f32785l;
    }

    public final sh.l0 z() {
        return this.f32783j;
    }
}
