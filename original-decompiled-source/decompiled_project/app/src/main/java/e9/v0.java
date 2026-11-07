package e9;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.ApkGenerator;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import com.basitce.htmltoapk.data.apkgenerator.CacheManager;
import com.basitce.htmltoapk.data.apkgenerator.ProjectAssetWriter;
import com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlFormat;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreHelper;
import com.basitce.htmltoapk.data.apkgenerator.signer.KeystoreStorage;
import com.basitce.htmltoapk.data.local.entity.KeystoreEntity;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.BuildConfiguration;
import com.basitce.htmltoapk.domain.model.BuildState;
import f9.fg;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;
import n8.g1;
import ph.s1;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.project.build.BuildViewModel$startBuildInternal$2", f = "BuildViewModel.kt", l = {189, 242, BinaryXmlFormat.RES_XML_END_NAMESPACE_TYPE, 283, 311, 313, 323}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class v0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8575a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8576b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f8577c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8578d;

    /* renamed from: e, reason: collision with root package name */
    public String f8579e;

    /* renamed from: f, reason: collision with root package name */
    public String f8580f;

    /* renamed from: g, reason: collision with root package name */
    public int f8581g;

    /* renamed from: h, reason: collision with root package name */
    public int f8582h;

    /* renamed from: j, reason: collision with root package name */
    public int f8583j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Application f8584k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s0 f8585l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ProjectEntity f8586m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ File f8587n;

    @vg.e(c = "com.basitce.htmltoapk.ui.screens.project.build.BuildViewModel$startBuildInternal$2$stateJob$1", f = "BuildViewModel.kt", l = {303}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f8588a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s0 f8589b;

        /* renamed from: e9.v0$a$a, reason: collision with other inner class name */
        public static final class C0087a<T> implements sh.g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ s0 f8590a;

            public C0087a(s0 s0Var) {
                this.f8590a = s0Var;
            }

            @Override // sh.g
            public final Object c(Object obj, tg.e eVar) {
                BuildState buildState = (BuildState) obj;
                if (!(buildState instanceof BuildState.Idle) && !(buildState instanceof BuildState.Success)) {
                    this.f8590a.f8521h.setValue(buildState);
                }
                return pg.f0.f21461a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s0 s0Var, tg.e<? super a> eVar) {
            super(2, eVar);
            this.f8589b = s0Var;
        }

        @Override // vg.a
        public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
            return new a(this.f8589b, eVar);
        }

        @Override // eh.p
        public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
            ((a) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
            return ug.a.f29706a;
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f8588a;
            if (i10 == 0) {
                pg.q.b(obj);
                s0 s0Var = this.f8589b;
                sh.y0<BuildState> buildState = s0Var.f8520g.getBuildState();
                C0087a c0087a = new C0087a(s0Var);
                this.f8588a = 1;
                if (buildState.b(c0087a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            throw new pg.g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Application application, s0 s0Var, ProjectEntity projectEntity, File file, tg.e<? super v0> eVar) {
        super(2, eVar);
        this.f8584k = application;
        this.f8585l = s0Var;
        this.f8586m = projectEntity;
        this.f8587n = file;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new v0(this.f8584k, this.f8585l, this.f8586m, this.f8587n, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((v0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(4:162|(6:171|170|304|172|(12:174|175|309|176|177|322|178|(1:180)|183|184|318|185)(1:193)|198)(8:164|(1:167)|(0)|170|304|172|(0)(0)|198)|279|280)(1:199)|326|200|201|302|202|203|290|204) */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0479, code lost:
    
        if (r0 == r5) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x060c, code lost:
    
        if (r10.c(r12, r169) != r5) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0620, code lost:
    
        r17 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0623, code lost:
    
        r17 = r3;
        r16 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x07fa, code lost:
    
        if (ph.h.e(wh.b.f31563c, new e9.t0(r16, r13, r14, r2, null), r169) == r5) goto L268;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0310 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0543 A[PHI: r3 r6 r7 r8 r10 r12 r13 r15 r91 r92 r170
      0x0543: PHI (r3v9 int) = (r3v4 int), (r3v27 int) binds: [B:156:0x0411, B:160:0x047d] A[DONT_GENERATE, DONT_INLINE]
      0x0543: PHI (r6v60 int) = (r6v54 int), (r6v61 int) binds: [B:156:0x0411, B:160:0x047d] A[DONT_GENERATE, DONT_INLINE]
      0x0543: PHI (r7v34 boolean) = (r7v30 boolean), (r7v36 boolean) binds: [B:156:0x0411, B:160:0x047d] A[DONT_GENERATE, DONT_INLINE]
      0x0543: PHI (r8v20 com.basitce.htmltoapk.data.local.entity.KeystoreEntity) = 
      (r8v13 com.basitce.htmltoapk.data.local.entity.KeystoreEntity)
      (r8v28 com.basitce.htmltoapk.data.local.entity.KeystoreEntity)
     binds: [B:156:0x0411, B:160:0x047d] A[DONT_GENERATE, DONT_INLINE]
      0x0543: PHI (r10v7 'input' java.lang.String) = (r10v3 'input' java.lang.String), (r10v13 'input' java.lang.String) binds: [B:156:0x0411, B:160:0x047d] A[DONT_GENERATE, DONT_INLINE]
      0x0543: PHI (r12v6 android.app.Application) = (r12v4 android.app.Application), (r12v9 android.app.Application) binds: [B:156:0x0411, B:160:0x047d] A[DONT_GENERATE, DONT_INLINE]
      0x0543: PHI (r13v23 kotlin.jvm.internal.g0) = (r13v19 kotlin.jvm.internal.g0), (r13v25 kotlin.jvm.internal.g0) binds: [B:156:0x0411, B:160:0x047d] A[DONT_GENERATE, DONT_INLINE]
      0x0543: PHI (r15v26 com.basitce.htmltoapk.data.local.entity.ProjectEntity) = 
      (r15v24 com.basitce.htmltoapk.data.local.entity.ProjectEntity)
      (r15v27 com.basitce.htmltoapk.data.local.entity.ProjectEntity)
     binds: [B:156:0x0411, B:160:0x047d] A[DONT_GENERATE, DONT_INLINE]
      0x0543: PHI (r91v15 sh.z0) = (r91v11 sh.z0), (r91v16 sh.z0) binds: [B:156:0x0411, B:160:0x047d] A[DONT_GENERATE, DONT_INLINE]
      0x0543: PHI (r92v8 java.lang.String) = (r92v5 java.lang.String), (r92v9 java.lang.String) binds: [B:156:0x0411, B:160:0x047d] A[DONT_GENERATE, DONT_INLINE]
      0x0543: PHI (r170v7 com.basitce.htmltoapk.data.apkgenerator.ApkGenerator) = 
      (r170v4 com.basitce.htmltoapk.data.apkgenerator.ApkGenerator)
      (r170v8 com.basitce.htmltoapk.data.apkgenerator.ApkGenerator)
     binds: [B:156:0x0411, B:160:0x047d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0579 A[Catch: Exception -> 0x05bf, TRY_LEAVE, TryCatch #8 {Exception -> 0x05bf, blocks: (B:172:0x056a, B:174:0x0579), top: B:304:0x056a }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0711 A[Catch: all -> 0x003f, TryCatch #22 {all -> 0x003f, blocks: (B:8:0x0033, B:13:0x0048, B:220:0x0707, B:222:0x0711, B:226:0x072a), top: B:330:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x072a A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #22 {all -> 0x003f, blocks: (B:8:0x0033, B:13:0x0048, B:220:0x0707, B:222:0x0711, B:226:0x072a), top: B:330:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a6 A[PHI: r11
      0x01a6: PHI (r11v17 java.lang.String) = (r11v16 java.lang.String), (r11v23 java.lang.String) binds: [B:53:0x0166, B:66:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cd  */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.lifecycle.w0, e9.s0, ph.s1] */
    /* JADX WARN: Type inference failed for: r3v26, types: [T, com.basitce.htmltoapk.data.local.entity.ProjectEntity] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, com.basitce.htmltoapk.data.local.entity.ProjectEntity] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProjectEntity projectEntity;
        Object objF;
        boolean zBooleanValue;
        String sourcePath;
        String iconPath;
        Iterator<String> it;
        mh.f fVar;
        Object next;
        String str;
        String str2;
        sh.z0 z0Var;
        int i10;
        String str3;
        String str4;
        int i11;
        boolean z10;
        kotlin.jvm.internal.g0 g0Var;
        String str5;
        Long keystoreId;
        ApkGenerator apkGenerator;
        boolean z11;
        int i12;
        String input;
        int i13;
        KeystoreEntity keystoreEntityCopy;
        Object objE;
        int i14;
        String str6;
        int i15;
        ArrayList arrayList;
        PackageInfo packageInfo;
        Signature[] signatureArr;
        int[][] iArr;
        String string;
        String strB0;
        Object next2;
        String string2;
        kotlin.jvm.internal.g0 g0Var2;
        KeystoreEntity keystoreEntity;
        Object objF2;
        int i16;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Application application;
        int i17;
        boolean z12;
        String str12;
        kotlin.jvm.internal.g0 g0Var3;
        String str13;
        String str14;
        String str15;
        String message;
        File file;
        s1 s1VarC;
        ApkGenerator apkGenerator2;
        CancellationException cancellationException;
        BuildState value;
        File file2;
        String absolutePath;
        ?? r22 = this.f8585l;
        n8.l lVar = r22.f8517d;
        ApkGenerator apkGenerator3 = r22.f8520g;
        sh.z0 z0Var2 = r22.f8521h;
        ug.a aVar = ug.a.f29706a;
        int i18 = this.f8583j;
        String str16 = "";
        File file3 = this.f8587n;
        Application application2 = this.f8584k;
        ProjectEntity projectEntity2 = this.f8586m;
        try {
            switch (i18) {
                case 0:
                    pg.q.b(obj);
                    projectEntity = projectEntity2;
                    try {
                        try {
                            CacheManager.cleanAllBuildCaches$default(CacheManager.INSTANCE, application2, 0L, 2, null);
                        } catch (Exception unused) {
                            application2 = application2;
                        }
                    } catch (Exception unused2) {
                    }
                    g1 g1Var = r22.f8518e.f18530f;
                    this.f8583j = 1;
                    objF = gg.a.f(g1Var, this);
                    if (objF != aVar) {
                        zBooleanValue = ((Boolean) objF).booleanValue();
                        BuildLogger buildLogger = BuildLogger.INSTANCE;
                        sourcePath = projectEntity.getSourcePath();
                        if (sourcePath == null) {
                            sourcePath = "none";
                        }
                        iconPath = projectEntity.getIconPath();
                        if (iconPath == null) {
                            iconPath = "none";
                        }
                        String splashPath = projectEntity.getSplashPath();
                        ProjectEntity projectEntity3 = projectEntity;
                        buildLogger.detail(R.string.build_log_editor_values, sourcePath, iconPath, splashPath != null ? splashPath : "none", String.valueOf(projectEntity.getAdmobEnabled()));
                        String string3 = mh.x.W(projectEntity3.getPackageName()).toString();
                        it = mh.x.D(projectEntity3.getAppName()).iterator();
                        while (true) {
                            fVar = (mh.f) it;
                            if (fVar.hasNext()) {
                                next = null;
                            } else {
                                next = fVar.next();
                                if (!mh.x.A((String) next)) {
                                }
                            }
                        }
                        str = (String) next;
                        String str17 = "App";
                        if (str != null && (string = mh.x.W(str).toString()) != null) {
                            strB0 = mh.y.b0(50, string);
                            if (!mh.x.A(strB0)) {
                                Iterator<String> it2 = mh.x.D(projectEntity3.getName()).iterator();
                                while (true) {
                                    mh.f fVar2 = (mh.f) it2;
                                    if (fVar2.hasNext()) {
                                        next2 = fVar2.next();
                                        if (!mh.x.A((String) next2)) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                String str18 = (String) next2;
                                if (str18 != null && (string2 = mh.x.W(str18).toString()) != null) {
                                    strB0 = mh.y.b0(50, string2);
                                    if (!mh.x.A(strB0)) {
                                        str17 = strB0;
                                    }
                                }
                            }
                            return pg.f0.f21461a;
                        }
                        mh.k kVar = fg.X0;
                        pg.n nVarC = fg.f.c(string3, str17);
                        String str19 = (String) nVarC.f21469a;
                        str2 = (String) nVarC.f21470b;
                        if (str2 == null) {
                            BuildLogger.INSTANCE.error(str2);
                            BuildState.Error error = new BuildState.Error(str2);
                            z0Var2.getClass();
                            z0Var2.j(null, error);
                            return pg.f0.f21461a;
                        }
                        int versionCode = projectEntity3.getVersionCode();
                        int i19 = versionCode < 1 ? 1 : versionCode;
                        String string4 = mh.x.W(projectEntity3.getVersionName()).toString();
                        if (mh.x.A(string4)) {
                            string4 = "1.0";
                        }
                        String str20 = string4;
                        int iM = jh.j.m(projectEntity3.getMinSdk(), 21, 36);
                        int iM2 = jh.j.m(projectEntity3.getTargetSdk(), iM, 36);
                        Integer maxSdk = projectEntity3.getMaxSdk();
                        Integer num = (maxSdk == null || maxSdk.intValue() < iM2) ? null : maxSdk;
                        try {
                            arrayList = new ArrayList();
                            i10 = iM;
                        } catch (Exception unused3) {
                            z0Var = z0Var2;
                            i10 = iM;
                        }
                        try {
                            str3 = str17;
                            try {
                                SigningInfo signingInfo = application2.getPackageManager().getPackageInfo(application2.getPackageName(), 134217728).signingInfo;
                                if (signingInfo != null) {
                                    Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
                                    if (apkContentsSigners != null) {
                                        qg.t.q(arrayList, apkContentsSigners);
                                    }
                                    Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                                    if (signingCertificateHistory != null) {
                                        qg.t.q(arrayList, signingCertificateHistory);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    try {
                                        packageInfo = application2.getPackageManager().getPackageInfo(application2.getPackageName(), 64);
                                    } catch (Exception unused4) {
                                        packageInfo = null;
                                    }
                                    if (packageInfo != null && (signatureArr = packageInfo.signatures) != null) {
                                        qg.t.q(arrayList, signatureArr);
                                    }
                                }
                            } catch (Exception unused5) {
                                z0Var = z0Var2;
                            }
                        } catch (Exception unused6) {
                            z0Var = z0Var2;
                            str3 = str17;
                            str4 = "";
                            i11 = iM2;
                            z10 = false;
                            if (zBooleanValue) {
                            }
                            return pg.f0.f21461a;
                        }
                        if (!arrayList.isEmpty()) {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            i11 = iM2;
                            try {
                                z0Var = z0Var2;
                                try {
                                    iArr = new int[][]{new int[]{119, 119, 4, 1, 1, 119, 4, 1, 0, 118, 1, 118, 119, 11, 2, 6, 112, 114, 10, 2, 11, 10, 7, 3, 118, 2, 1, 117, 6, 0, 7, 4, 7, 5, 112, 0, 117, 114, 1, 1, 113, 119, 7, 114, 112, 11, 119, 4, 2, 11, 112, 112, 3, 112, 6, 6, 113, 0, 113, 2, 118, 119, 7, 114}, new int[]{4, 6, 3, 2, 112, 113, 4, 7, 2, 3, 3, 112, 10, 119, 0, 112, 3, 7, 10, 1, 0, 119, 7, 114, 0, 2, 4, 10, 3, 114, 2, 5, 10, 118, 1, 117, 10, 119, 114, 1, 118, 112, 10, 113, 118, 2, 0, 117, 117, 114, 3, 114, 6, 3, 114, 114, 6, 7, 10, 114, 6, 4, 117, 11}, new int[]{118, 118, 118, 5, 114, 0, 119, 3, 114, 6, 112, 113, 114, 7, 112, 0, 113, 1, 0, 1, 4, 6, 118, 112, 118, 0, 112, 10, 4, 114, 117, 0, 117, 6, 113, 10, 5, 3, 119, 7, 3, 11, 0, 3, 119, 118, 5, 5, 4, 3, 0, 7, 118, 11, 118, 11, 0, 10, 118, 7, 112, 11, 5, 1}, new int[]{11, 10, 1, 3, 6, 2, 118, 1, 3, 114, 1, 5, 112, 0, 11, 3, 118, 2, 4, 6, 5, 7, 11, 7, 112, 1, 3, 113, 117, 1, 7, 5, 0, 10, 4, 114, 7, 113, 4, 5, 5, 5, 11, 5, 7, 112, 118, 3, 118, 118, 6, 112, 0, 119, 0, 10, 113, 118, 112, 2, 0, 11, 118, 5}};
                                } catch (Exception unused7) {
                                }
                            } catch (Exception unused8) {
                                z0Var = z0Var2;
                            }
                            if (arrayList.isEmpty()) {
                                str4 = str16;
                                z10 = false;
                                if (zBooleanValue) {
                                    g0Var = new kotlin.jvm.internal.g0();
                                    projectEntity2 = projectEntity3;
                                    ?? Copy$default = ProjectEntity.copy$default(projectEntity2, 0L, null, str3, str19, i19, str20, i10, i11, num, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -509, -1, 15, null);
                                    String str21 = str3;
                                    str5 = str19;
                                    g0Var.f16327a = Copy$default;
                                    keystoreId = Copy$default.getKeystoreId();
                                    if (keystoreId == null) {
                                    }
                                }
                            } else {
                                int size = arrayList.size();
                                int i20 = 0;
                                while (i20 < size) {
                                    Object obj2 = arrayList.get(i20);
                                    i20++;
                                    byte[] bArrDigest = messageDigest.digest(((Signature) obj2).toByteArray());
                                    kotlin.jvm.internal.r.b(bArrDigest);
                                    int[][] iArr2 = iArr;
                                    MessageDigest messageDigest2 = messageDigest;
                                    String strY = qg.o.y(bArrDigest, str16, new r0(), 30);
                                    int i21 = 0;
                                    while (i21 < 4) {
                                        int[] iArr3 = iArr2[i21];
                                        int i22 = i21;
                                        int length = iArr3.length;
                                        int i23 = size;
                                        char[] cArr = new char[length];
                                        str4 = str16;
                                        int i24 = 0;
                                        while (i24 < length) {
                                            try {
                                                cArr[i24] = (char) (iArr3[i24] ^ 51);
                                                i24++;
                                                length = length;
                                            } catch (Exception unused9) {
                                            }
                                        }
                                        if (new String(cArr).equalsIgnoreCase(strY)) {
                                            z10 = true;
                                            if (zBooleanValue) {
                                            }
                                        } else {
                                            i21 = i22 + 1;
                                            size = i23;
                                            str16 = str4;
                                        }
                                    }
                                    iArr = iArr2;
                                    messageDigest = messageDigest2;
                                }
                                str4 = str16;
                                z10 = false;
                                if (zBooleanValue) {
                                }
                            }
                            return pg.f0.f21461a;
                        }
                        z0Var = z0Var2;
                        str4 = "";
                        i11 = iM2;
                        z10 = false;
                        ?? showWatermark = (zBooleanValue && z10) ? kotlin.jvm.internal.r.a(projectEntity3.getBuildMode(), "advanced") ? projectEntity3.getShowWatermark() : 0 : 1;
                        g0Var = new kotlin.jvm.internal.g0();
                        projectEntity2 = projectEntity3;
                        ?? Copy$default2 = ProjectEntity.copy$default(projectEntity2, 0L, null, str3, str19, i19, str20, i10, i11, num, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -509, -1, 15, null);
                        String str212 = str3;
                        str5 = str19;
                        g0Var.f16327a = Copy$default2;
                        keystoreId = Copy$default2.getKeystoreId();
                        if (keystoreId == null) {
                            long jLongValue = keystoreId.longValue();
                            this.f8576b = str212;
                            this.f8577c = str5;
                            this.f8578d = g0Var;
                            this.f8575a = zBooleanValue;
                            this.f8581g = showWatermark;
                            this.f8582h = 0;
                            this.f8583j = 2;
                            lVar.getClass();
                            wh.c cVar = ph.z0.f21632a;
                            int i25 = showWatermark;
                            apkGenerator = apkGenerator3;
                            objE = ph.h.e(wh.b.f31563c, new n8.m(lVar, jLongValue, null), this);
                            if (objE != aVar) {
                                i14 = i25;
                                str6 = str212;
                                i15 = 0;
                                boolean z13 = zBooleanValue;
                                input = str6;
                                i12 = i14;
                                z11 = z13;
                                keystoreEntityCopy = (KeystoreEntity) objE;
                                i13 = i15;
                                String str22 = str5;
                                g0Var2 = g0Var;
                                if (keystoreEntityCopy == null) {
                                    pg.t<File, String, String> orCreateAppKeystore = KeystoreHelper.INSTANCE.getOrCreateAppKeystore(application2, str22);
                                    File file4 = orCreateAppKeystore.f21479a;
                                    String str23 = orCreateAppKeystore.f21480b;
                                    String str24 = orCreateAppKeystore.f21481c;
                                    String str25 = input + " (" + str22 + ")";
                                    String absolutePath2 = file4.getAbsolutePath();
                                    kotlin.jvm.internal.r.d(absolutePath2, "getAbsolutePath(...)");
                                    keystoreEntity = new KeystoreEntity(0L, str25, absolutePath2, str23, str24, "RSA", true, null, str23, 0L, 641, null);
                                    this.f8576b = input;
                                    this.f8577c = g0Var2;
                                    this.f8578d = keystoreEntity;
                                    this.f8575a = z11;
                                    this.f8581g = i12;
                                    this.f8582h = i13;
                                    this.f8583j = 3;
                                    objF2 = lVar.f(keystoreEntity, this);
                                    break;
                                } else {
                                    if (keystoreEntityCopy == null) {
                                        String path = keystoreEntityCopy.getPath();
                                        String password = keystoreEntityCopy.getPassword();
                                        String keyAlias = keystoreEntityCopy.getKeyAlias();
                                        String keyPassword = keystoreEntityCopy.getKeyPassword();
                                        if (keyPassword == null) {
                                            keyPassword = keystoreEntityCopy.getPassword();
                                            String str26 = keyPassword;
                                            try {
                                                file = new File(keystoreEntityCopy.getPath());
                                                if (file.exists()) {
                                                    str14 = path;
                                                    str15 = password;
                                                } else {
                                                    Pattern patternCompile = Pattern.compile("[^a-zA-Z0-9_-]");
                                                    str14 = path;
                                                    try {
                                                        kotlin.jvm.internal.r.d(patternCompile, "compile(...)");
                                                        str15 = password;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        str15 = password;
                                                        BuildLogger buildLogger2 = BuildLogger.INSTANCE;
                                                        message = e.getMessage();
                                                        if (message == null) {
                                                            message = str4;
                                                        }
                                                        buildLogger2.detail(R.string.build_log_keystore_export_warn, message);
                                                        str9 = keyAlias;
                                                        str10 = str26;
                                                        str7 = str14;
                                                        str8 = str15;
                                                        i16 = 1;
                                                        n8.s sVar = r22.f8516c;
                                                        application = application2;
                                                        ProjectEntity projectEntity4 = (ProjectEntity) g0Var2.f16327a;
                                                        this.f8576b = g0Var2;
                                                        this.f8577c = str7;
                                                        this.f8578d = str8;
                                                        this.f8579e = str9;
                                                        this.f8580f = str10;
                                                        this.f8575a = z11;
                                                        this.f8581g = i12;
                                                        this.f8582h = i16;
                                                        str11 = str7;
                                                        this.f8583j = 4;
                                                        break;
                                                    }
                                                    try {
                                                        kotlin.jvm.internal.r.e(input, "input");
                                                        String strReplaceAll = patternCompile.matcher(input).replaceAll("_");
                                                        kotlin.jvm.internal.r.d(strReplaceAll, "replaceAll(...)");
                                                        if (mh.x.A(strReplaceAll)) {
                                                            strReplaceAll = "app";
                                                        }
                                                        KeystoreStorage.INSTANCE.persistKeystore(application2, file, strReplaceAll);
                                                        try {
                                                            BuildLogger.INSTANCE.detail(R.string.build_log_keystore_exported, new Object[0]);
                                                        } catch (Exception e11) {
                                                            e = e11;
                                                            BuildLogger buildLogger22 = BuildLogger.INSTANCE;
                                                            message = e.getMessage();
                                                            if (message == null) {
                                                            }
                                                            buildLogger22.detail(R.string.build_log_keystore_export_warn, message);
                                                            str9 = keyAlias;
                                                            str10 = str26;
                                                            str7 = str14;
                                                            str8 = str15;
                                                            i16 = 1;
                                                            n8.s sVar2 = r22.f8516c;
                                                            application = application2;
                                                            ProjectEntity projectEntity42 = (ProjectEntity) g0Var2.f16327a;
                                                            this.f8576b = g0Var2;
                                                            this.f8577c = str7;
                                                            this.f8578d = str8;
                                                            this.f8579e = str9;
                                                            this.f8580f = str10;
                                                            this.f8575a = z11;
                                                            this.f8581g = i12;
                                                            this.f8582h = i16;
                                                            str11 = str7;
                                                            this.f8583j = 4;
                                                        }
                                                    } catch (Exception e12) {
                                                        e = e12;
                                                        BuildLogger buildLogger222 = BuildLogger.INSTANCE;
                                                        message = e.getMessage();
                                                        if (message == null) {
                                                        }
                                                        buildLogger222.detail(R.string.build_log_keystore_export_warn, message);
                                                        str9 = keyAlias;
                                                        str10 = str26;
                                                        str7 = str14;
                                                        str8 = str15;
                                                        i16 = 1;
                                                        n8.s sVar22 = r22.f8516c;
                                                        application = application2;
                                                        ProjectEntity projectEntity422 = (ProjectEntity) g0Var2.f16327a;
                                                        this.f8576b = g0Var2;
                                                        this.f8577c = str7;
                                                        this.f8578d = str8;
                                                        this.f8579e = str9;
                                                        this.f8580f = str10;
                                                        this.f8575a = z11;
                                                        this.f8581g = i12;
                                                        this.f8582h = i16;
                                                        str11 = str7;
                                                        this.f8583j = 4;
                                                    }
                                                }
                                            } catch (Exception e13) {
                                                e = e13;
                                                str14 = path;
                                            }
                                            str9 = keyAlias;
                                            str10 = str26;
                                            str7 = str14;
                                            str8 = str15;
                                            i16 = 1;
                                        } else {
                                            if (mh.x.A(keyPassword)) {
                                                keyPassword = null;
                                            }
                                            if (keyPassword == null) {
                                            }
                                            String str262 = keyPassword;
                                            file = new File(keystoreEntityCopy.getPath());
                                            if (file.exists()) {
                                            }
                                            str9 = keyAlias;
                                            str10 = str262;
                                            str7 = str14;
                                            str8 = str15;
                                            i16 = 1;
                                        }
                                        return pg.f0.f21461a;
                                    }
                                    i16 = i13;
                                    str7 = null;
                                    str8 = null;
                                    str9 = null;
                                    str10 = null;
                                    n8.s sVar222 = r22.f8516c;
                                    application = application2;
                                    ProjectEntity projectEntity4222 = (ProjectEntity) g0Var2.f16327a;
                                    this.f8576b = g0Var2;
                                    this.f8577c = str7;
                                    this.f8578d = str8;
                                    this.f8579e = str9;
                                    this.f8580f = str10;
                                    this.f8575a = z11;
                                    this.f8581g = i12;
                                    this.f8582h = i16;
                                    str11 = str7;
                                    this.f8583j = 4;
                                }
                            }
                        } else {
                            apkGenerator = apkGenerator3;
                            int i26 = showWatermark;
                            z11 = zBooleanValue;
                            i12 = i26;
                            input = str212;
                            i13 = 0;
                            keystoreEntityCopy = null;
                            String str222 = str5;
                            g0Var2 = g0Var;
                            if (keystoreEntityCopy == null) {
                            }
                        }
                    }
                    return aVar;
                case 1:
                    pg.q.b(obj);
                    objF = obj;
                    projectEntity = projectEntity2;
                    zBooleanValue = ((Boolean) objF).booleanValue();
                    BuildLogger buildLogger3 = BuildLogger.INSTANCE;
                    sourcePath = projectEntity.getSourcePath();
                    if (sourcePath == null) {
                    }
                    iconPath = projectEntity.getIconPath();
                    if (iconPath == null) {
                    }
                    String splashPath2 = projectEntity.getSplashPath();
                    ProjectEntity projectEntity32 = projectEntity;
                    buildLogger3.detail(R.string.build_log_editor_values, sourcePath, iconPath, splashPath2 != null ? splashPath2 : "none", String.valueOf(projectEntity.getAdmobEnabled()));
                    String string32 = mh.x.W(projectEntity32.getPackageName()).toString();
                    it = mh.x.D(projectEntity32.getAppName()).iterator();
                    while (true) {
                        fVar = (mh.f) it;
                        if (fVar.hasNext()) {
                        }
                    }
                    str = (String) next;
                    String str172 = "App";
                    if (str != null) {
                        strB0 = mh.y.b0(50, string);
                        if (!mh.x.A(strB0)) {
                        }
                        return pg.f0.f21461a;
                    }
                    mh.k kVar2 = fg.X0;
                    pg.n nVarC2 = fg.f.c(string32, str172);
                    String str192 = (String) nVarC2.f21469a;
                    str2 = (String) nVarC2.f21470b;
                    if (str2 == null) {
                    }
                    break;
                case 2:
                    int i27 = this.f8582h;
                    i14 = this.f8581g;
                    zBooleanValue = this.f8575a;
                    g0Var = (kotlin.jvm.internal.g0) this.f8578d;
                    str5 = (String) this.f8577c;
                    i15 = i27;
                    str6 = (String) this.f8576b;
                    pg.q.b(obj);
                    objE = obj;
                    apkGenerator = apkGenerator3;
                    z0Var = z0Var2;
                    str4 = "";
                    boolean z132 = zBooleanValue;
                    input = str6;
                    i12 = i14;
                    z11 = z132;
                    keystoreEntityCopy = (KeystoreEntity) objE;
                    i13 = i15;
                    String str2222 = str5;
                    g0Var2 = g0Var;
                    if (keystoreEntityCopy == null) {
                    }
                    return aVar;
                case 3:
                    int i28 = this.f8582h;
                    i12 = this.f8581g;
                    z11 = this.f8575a;
                    keystoreEntity = (KeystoreEntity) this.f8578d;
                    g0Var2 = (kotlin.jvm.internal.g0) this.f8577c;
                    input = (String) this.f8576b;
                    pg.q.b(obj);
                    objF2 = obj;
                    apkGenerator = apkGenerator3;
                    i13 = i28;
                    z0Var = z0Var2;
                    str4 = "";
                    KeystoreEntity keystoreEntity2 = keystoreEntity;
                    long jLongValue2 = ((Number) objF2).longValue();
                    keystoreEntityCopy = keystoreEntity2.copy((759 & 1) != 0 ? keystoreEntity2.f5741id : jLongValue2, (759 & 2) != 0 ? keystoreEntity2.alias : null, (759 & 4) != 0 ? keystoreEntity2.path : null, (759 & 8) != 0 ? keystoreEntity2.password : null, (759 & 16) != 0 ? keystoreEntity2.keyAlias : null, (759 & 32) != 0 ? keystoreEntity2.algorithm : null, (759 & 64) != 0 ? keystoreEntity2.isPersisted : false, (759 & 128) != 0 ? keystoreEntity2.publicUri : null, (759 & 256) != 0 ? keystoreEntity2.keyPassword : null, (759 & 512) != 0 ? keystoreEntity2.createdAt : 0L);
                    g0Var2.f16327a = ProjectEntity.copy$default((ProjectEntity) g0Var2.f16327a, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, new Long(jLongValue2), null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -8388609, -1, 15, null);
                    i13 = i13;
                    if (keystoreEntityCopy == null) {
                    }
                    n8.s sVar2222 = r22.f8516c;
                    application = application2;
                    ProjectEntity projectEntity42222 = (ProjectEntity) g0Var2.f16327a;
                    this.f8576b = g0Var2;
                    this.f8577c = str7;
                    this.f8578d = str8;
                    this.f8579e = str9;
                    this.f8580f = str10;
                    this.f8575a = z11;
                    this.f8581g = i12;
                    this.f8582h = i16;
                    str11 = str7;
                    this.f8583j = 4;
                    break;
                case 4:
                    int i29 = this.f8582h;
                    i12 = this.f8581g;
                    z12 = this.f8575a;
                    str10 = this.f8580f;
                    str12 = this.f8579e;
                    str13 = (String) this.f8578d;
                    str11 = (String) this.f8577c;
                    g0Var3 = (kotlin.jvm.internal.g0) this.f8576b;
                    try {
                        pg.q.b(obj);
                    } catch (Exception unused10) {
                    }
                    apkGenerator = apkGenerator3;
                    z0Var = z0Var2;
                    str4 = "";
                    i17 = i29;
                    application = application2;
                    BuildConfiguration buildConfiguration = new BuildConfiguration(ProjectAssetWriter.INSTANCE.toProject(ProjectEntity.copy$default((ProjectEntity) g0Var3.f16327a, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, i12 == 0, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -67108865, -1, 15, null)), ((ProjectEntity) g0Var3.f16327a).getOutputFormat(), str11, str13, str12, str10, i17 == 0, z12, r22.f8519f.f12419d.contains(String.valueOf(((ProjectEntity) g0Var3.f16327a).getId())));
                    s1VarC = ph.h.c(androidx.lifecycle.x0.a(r22), null, null, new a(r22, null), 3);
                    if (kotlin.jvm.internal.r.a(projectEntity2.getOutputFormat(), "aab")) {
                        apkGenerator2 = apkGenerator;
                        this.f8576b = s1VarC;
                        cancellationException = null;
                        this.f8577c = null;
                        this.f8578d = null;
                        this.f8579e = null;
                        this.f8580f = null;
                        this.f8583j = 6;
                        if (apkGenerator2.generateApk(buildConfiguration, file3, this) != aVar) {
                            s1VarC.cancel(cancellationException);
                            value = apkGenerator2.getBuildState().getValue();
                            if (!(value instanceof BuildState.Success)) {
                            }
                        }
                    } else {
                        this.f8576b = s1VarC;
                        this.f8577c = null;
                        this.f8578d = null;
                        this.f8579e = null;
                        this.f8580f = null;
                        this.f8583j = 5;
                        apkGenerator2 = apkGenerator;
                        if (apkGenerator2.generateAab(buildConfiguration, file3, this) == aVar) {
                        }
                        cancellationException = null;
                        s1VarC.cancel(cancellationException);
                        value = apkGenerator2.getBuildState().getValue();
                        if (!(value instanceof BuildState.Success)) {
                            String str27 = kotlin.jvm.internal.r.a(projectEntity2.getOutputFormat(), "aab") ? "application/octet-stream" : "application/vnd.android.package-archive";
                            long id2 = projectEntity2.getId();
                            try {
                                File file5 = new File(application.getFilesDir(), "projects/" + id2 + "/outputs");
                                file5.mkdirs();
                                file2 = new File(file5, file3.getName());
                                File parentFile = file2.getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                }
                                FileInputStream fileInputStream = new FileInputStream(file3);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        ah.b.a(fileInputStream, fileOutputStream, 8192);
                                        fileOutputStream.close();
                                        fileInputStream.close();
                                    } finally {
                                    }
                                } finally {
                                }
                            } catch (Exception e14) {
                                BuildLogger buildLogger4 = BuildLogger.INSTANCE;
                                String message2 = e14.getMessage();
                                buildLogger4.error(R.string.build_log_history_copy_failed, message2 == null ? str4 : message2);
                                file2 = null;
                            }
                            String name = file3.getName();
                            kotlin.jvm.internal.r.d(name, "getName(...)");
                            this.f8576b = file2;
                            this.f8583j = 7;
                            wh.c cVar2 = ph.z0.f21632a;
                            break;
                        } else {
                            sh.z0 z0Var3 = z0Var;
                            if (value instanceof BuildState.Error) {
                                z0Var3.getClass();
                                z0Var3.j(null, value);
                            } else {
                                BuildState.Error error2 = new BuildState.Error("Build completed with unexpected state");
                                z0Var3.getClass();
                                z0Var3.j(null, error2);
                            }
                            return pg.f0.f21461a;
                        }
                    }
                    return aVar;
                case 5:
                    s1VarC = (s1) this.f8576b;
                    pg.q.b(obj);
                    z0Var = z0Var2;
                    str4 = "";
                    application = application2;
                    apkGenerator2 = apkGenerator3;
                    cancellationException = null;
                    s1VarC.cancel(cancellationException);
                    value = apkGenerator2.getBuildState().getValue();
                    if (!(value instanceof BuildState.Success)) {
                    }
                    break;
                case 6:
                    s1VarC = (s1) this.f8576b;
                    pg.q.b(obj);
                    z0Var = z0Var2;
                    str4 = "";
                    application = application2;
                    apkGenerator2 = apkGenerator3;
                    cancellationException = null;
                    s1VarC.cancel(cancellationException);
                    value = apkGenerator2.getBuildState().getValue();
                    if (!(value instanceof BuildState.Success)) {
                    }
                    break;
                case 7:
                    file2 = (File) this.f8576b;
                    pg.q.b(obj);
                    z0Var = z0Var2;
                    if (file2 == null || (absolutePath = file2.getAbsolutePath()) == null) {
                        absolutePath = file3.getAbsolutePath();
                    }
                    kotlin.jvm.internal.r.b(absolutePath);
                    BuildState.Success success = new BuildState.Success(absolutePath);
                    z0Var.getClass();
                    z0Var.j(null, success);
                    return pg.f0.f21461a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = i16;
            z12 = z11;
            str12 = str9;
            g0Var3 = g0Var2;
            str13 = str8;
            BuildConfiguration buildConfiguration2 = new BuildConfiguration(ProjectAssetWriter.INSTANCE.toProject(ProjectEntity.copy$default((ProjectEntity) g0Var3.f16327a, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, i12 == 0, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, null, null, 0L, 0L, -67108865, -1, 15, null)), ((ProjectEntity) g0Var3.f16327a).getOutputFormat(), str11, str13, str12, str10, i17 == 0, z12, r22.f8519f.f12419d.contains(String.valueOf(((ProjectEntity) g0Var3.f16327a).getId())));
            s1VarC = ph.h.c(androidx.lifecycle.x0.a(r22), null, null, new a(r22, null), 3);
            if (kotlin.jvm.internal.r.a(projectEntity2.getOutputFormat(), "aab")) {
            }
            return aVar;
        } catch (Throwable th2) {
            r22.cancel(null);
            throw th2;
        }
    }
}
