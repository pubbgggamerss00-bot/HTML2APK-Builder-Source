package com.basitce.htmltoapk.data.apkgenerator;

import ah.l;
import android.content.Context;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import com.basitce.htmltoapk.data.apkgenerator.signer.JarSignerHelper;
import com.basitce.htmltoapk.data.apkgenerator.signer.SigningKey;
import com.basitce.htmltoapk.data.apkgenerator.signer.SigningKeyResolver;
import com.basitce.htmltoapk.domain.model.BuildConfiguration;
import com.basitce.htmltoapk.domain.model.Project;
import eh.p;
import f9.fg;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.internal.r;
import mh.k;
import mh.t;
import mh.x;
import mh.y;
import pg.f0;
import pg.n;
import pg.q;
import ph.i0;
import ph.z0;

/* loaded from: classes.dex */
public final class AabGenerator {
    private static final String TEMPLATE_ADS_ASSET_NAME = "webview_shell_template_ads.aab";
    private static final String TEMPLATE_ASSET_NAME = "webview_shell_template.aab";
    private final Context context;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void extractTemplateAab(File file, InputStream inputStream) throws IOException {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    r.b(file2);
                    l.f(file2);
                }
            }
            file.mkdirs();
            ZipInputStream zipInputStream = new ZipInputStream(inputStream);
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                int i10 = 0;
                while (nextEntry != null) {
                    String name = nextEntry.getName();
                    r.b(name);
                    if (x.A(name) || name.equals("/")) {
                        BuildLogger.INSTANCE.detail(R.string.build_log_aab_skip_root, name);
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else if (x.r(name, "..", false)) {
                        BuildLogger.INSTANCE.detail(R.string.build_log_aab_skip_security, name);
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else if (t.p(name, "META-INF/", false)) {
                        BuildLogger.INSTANCE.detail(R.string.build_log_aab_skip_signature, name);
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        File canonicalFile = new File(file, name).getCanonicalFile();
                        File canonicalFile2 = file.getCanonicalFile();
                        if (!r.a(canonicalFile, canonicalFile2)) {
                            r.b(canonicalFile);
                            r.b(canonicalFile2);
                            if (l.m(canonicalFile, canonicalFile2)) {
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
                                        i10++;
                                        if (i10 % 50 == 0) {
                                            BuildLogger buildLogger = BuildLogger.INSTANCE;
                                            buildLogger.tick(BuildLogger.BuildTick.TEMPLATE_FILE);
                                            buildLogger.detail(R.string.build_log_aab_extract_tick, Integer.valueOf(i10));
                                        }
                                    } finally {
                                    }
                                }
                                zipInputStream.closeEntry();
                                nextEntry = zipInputStream.getNextEntry();
                            }
                        }
                        BuildLogger.INSTANCE.detail(R.string.build_log_aab_skip_outside, name);
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    }
                }
                BuildLogger.INSTANCE.detail(R.string.build_log_aab_extract_total, Integer.valueOf(i10));
                f0 f0Var = f0.f21461a;
                zipInputStream.close();
            } finally {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void signAab(BuildConfiguration buildConfiguration, File file, File file2, File file3, String str, String str2, String str3) throws Throwable {
            BuildLogger buildLogger = BuildLogger.INSTANCE;
            buildLogger.detail(R.string.build_log_signing_aab, new Object[0]);
            JarSignerHelper.INSTANCE.signJar(file, file2, file3, str, str2, str3, "PKCS12");
            buildLogger.detail(BuildLogger.BuildStage.SIGNED, R.string.build_log_aab_signed, Long.valueOf(file2.length()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zipAab(File file, File file2) throws IOException {
            List<File> listK = lh.j.k(lh.j.i(l.p(file), new a()));
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file2));
            try {
                int i10 = 0;
                for (File file3 : listK) {
                    zipOutputStream.putNextEntry(new ZipEntry(l.h(l.l(file3, file))));
                    FileInputStream fileInputStream = new FileInputStream(file3);
                    try {
                        ah.b.a(fileInputStream, zipOutputStream, 8192);
                        fileInputStream.close();
                        zipOutputStream.closeEntry();
                        i10++;
                        if (i10 % 50 == 0) {
                            BuildLogger buildLogger = BuildLogger.INSTANCE;
                            buildLogger.tick(BuildLogger.BuildTick.ZIP_FILE);
                            buildLogger.detail(R.string.build_log_aab_package_tick, Integer.valueOf(i10));
                        }
                    } finally {
                    }
                }
                f0 f0Var = f0.f21461a;
                zipOutputStream.close();
                BuildLogger.INSTANCE.detail(R.string.build_log_aab_zip_completed, Long.valueOf(file2.length()), Integer.valueOf(i10));
            } finally {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean zipAab$lambda$3(File it) {
            r.e(it, "it");
            return it.isFile();
        }

        public final boolean adsRequested$app_release(Project project) {
            r.e(project, "project");
            return project.getAdmobEnabled();
        }

        public final Object generateBundle$app_release(BuildConfiguration buildConfiguration, File file, InputStream inputStream, File file2, File file3, String str, String str2, String str3, tg.e<? super f0> eVar) throws Throwable {
            wh.c cVar = z0.f21632a;
            Object objE = ph.h.e(wh.b.f31563c, new AabGenerator$Companion$generateBundle$2(file2, inputStream, buildConfiguration, file, file3, str, str2, str3, null), eVar);
            return objE == ug.a.f29706a ? objE : f0.f21461a;
        }

        private Companion() {
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.data.apkgenerator.AabGenerator$generate$2", f = "AabGenerator.kt", l = {76}, m = "invokeSuspend")
    /* renamed from: com.basitce.htmltoapk.data.apkgenerator.AabGenerator$generate$2, reason: invalid class name */
    public static final class AnonymousClass2 extends vg.i implements p<i0, tg.e<? super f0>, Object> {
        final /* synthetic */ BuildConfiguration $config;
        final /* synthetic */ File $outputFile;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AabGenerator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BuildConfiguration buildConfiguration, AabGenerator aabGenerator, File file, tg.e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$config = buildConfiguration;
            this.this$0 = aabGenerator;
            this.$outputFile = file;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return new AnonymousClass2(this.$config, this.this$0, this.$outputFile, eVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:51:0x02cc  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x02cf  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0313 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0314  */
        /* JADX WARN: Type inference failed for: r1v11, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v9 */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            File fileCreate;
            Object next;
            BuildConfiguration buildConfiguration;
            Companion companion;
            InputStream inputStreamOpen;
            File file;
            InputStream inputStream;
            Throwable th2;
            File file2;
            BuildConfiguration buildConfiguration2;
            File file3;
            String password;
            String alias;
            String keyPassword;
            ?? r12;
            String string;
            ug.a aVar = ug.a.f29706a;
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    q.b(obj);
                    BuildLogger.INSTANCE.reset();
                    String string2 = x.W(this.$config.getProject().getPackageName()).toString();
                    Iterator<String> it = x.D(this.$config.getProject().getAppName()).iterator();
                    while (true) {
                        mh.f fVar = (mh.f) it;
                        if (!fVar.hasNext()) {
                            next = null;
                            break;
                        }
                        next = fVar.next();
                        if (!x.A((String) next)) {
                            break;
                        }
                    }
                    String str = (String) next;
                    String str2 = "App";
                    if (str != null && (string = x.W(str).toString()) != null) {
                        String strB0 = y.b0(50, string);
                        if (!x.A(strB0)) {
                            str2 = strB0;
                        }
                    }
                    k kVar = fg.X0;
                    n nVarC = fg.f.c(string2, str2);
                    String str3 = (String) nVarC.f21469a;
                    String str4 = (String) nVarC.f21470b;
                    if (str4 != null) {
                        BuildLogger.INSTANCE.error(str4);
                        throw new IllegalArgumentException(str4);
                    }
                    BuildConfiguration buildConfiguration3 = this.$config;
                    BuildConfiguration buildConfigurationCopy$default = BuildConfiguration.copy$default(buildConfiguration3, Project.copy$default(buildConfiguration3.getProject(), 0L, null, str2, str3, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, 0L, 0L, -13, -1, 3, null), null, null, null, null, null, false, this.$config.isPremium() && BuildHost.INSTANCE.genuine(this.this$0.context), false, 382, null);
                    k kVar2 = l9.a.f16766a;
                    String strA = l9.a.a(buildConfigurationCopy$default.getProject());
                    if (strA != null) {
                        BuildLogger.INSTANCE.error(strA);
                        throw new IllegalArgumentException(strA);
                    }
                    BuildLogger buildLogger = BuildLogger.INSTANCE;
                    buildLogger.step(R.string.build_log_aab_build_started, new Object[0]);
                    buildLogger.detail(R.string.build_log_package_name, buildConfigurationCopy$default.getProject().getPackageName());
                    buildLogger.detail(R.string.build_log_version_pair, new Integer(buildConfigurationCopy$default.getProject().getVersionCode()), buildConfigurationCopy$default.getProject().getVersionName());
                    BuildWorkspaces buildWorkspaces = BuildWorkspaces.INSTANCE;
                    File filesDir = this.this$0.context.getFilesDir();
                    r.d(filesDir, "getFilesDir(...)");
                    fileCreate = buildWorkspaces.create(filesDir, "aab_");
                    try {
                        File file4 = new File(fileCreate, "template");
                        SigningKey signingKeyResolve = SigningKeyResolver.INSTANCE.resolve(this.this$0.context, buildConfigurationCopy$default);
                        String iconPath = buildConfigurationCopy$default.getProject().getIconPath();
                        try {
                            try {
                                if (iconPath != null) {
                                    File file5 = new File(iconPath);
                                    if (!file5.exists()) {
                                        file5 = null;
                                    }
                                    if (file5 != null) {
                                        buildConfiguration = buildConfigurationCopy$default;
                                    }
                                    companion = AabGenerator.Companion;
                                    String str5 = !companion.adsRequested$app_release(buildConfiguration.getProject()) ? AabGenerator.TEMPLATE_ADS_ASSET_NAME : AabGenerator.TEMPLATE_ASSET_NAME;
                                    buildLogger.detail(R.string.build_log_template_shell, str5);
                                    inputStreamOpen = this.this$0.context.getAssets().open(str5);
                                    file = this.$outputFile;
                                    r.b(inputStreamOpen);
                                    buildConfiguration2 = buildConfigurationCopy$default;
                                    file3 = signingKeyResolve.getFile();
                                    password = signingKeyResolve.getPassword();
                                    alias = signingKeyResolve.getAlias();
                                    keyPassword = signingKeyResolve.getKeyPassword();
                                    this.L$0 = fileCreate;
                                    this.L$1 = inputStreamOpen;
                                    this.label = 1;
                                    inputStream = inputStreamOpen;
                                    if (companion.generateBundle$app_release(buildConfiguration2, file, inputStream, file4, file3, password, alias, keyPassword, this) != aVar) {
                                        return aVar;
                                    }
                                    r12 = inputStream;
                                    file2 = fileCreate;
                                }
                                if (companion.generateBundle$app_release(buildConfiguration2, file, inputStream, file4, file3, password, alias, keyPassword, this) != aVar) {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th2 = th;
                                file2 = fileCreate;
                                throw th2;
                            }
                            r.b(inputStreamOpen);
                            buildConfiguration2 = buildConfigurationCopy$default;
                            file3 = signingKeyResolve.getFile();
                            password = signingKeyResolve.getPassword();
                            alias = signingKeyResolve.getAlias();
                            keyPassword = signingKeyResolve.getKeyPassword();
                            this.L$0 = fileCreate;
                            this.L$1 = inputStreamOpen;
                            this.label = 1;
                            inputStream = inputStreamOpen;
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream = inputStreamOpen;
                        }
                        buildConfiguration = buildConfigurationCopy$default;
                        buildConfigurationCopy$default = BuildConfiguration.copy$default(buildConfiguration, Project.copy$default(buildConfigurationCopy$default.getProject(), 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, IconGenerator.INSTANCE.generateDefaultIcon(this.this$0.context, buildConfigurationCopy$default.getProject().getAppName(), buildConfigurationCopy$default.getProject().getPrimaryColor()).getAbsolutePath(), null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, 0L, 0L, -8193, -1, 3, null), null, null, null, null, null, false, false, false, 510, null);
                        companion = AabGenerator.Companion;
                        if (!companion.adsRequested$app_release(buildConfiguration.getProject())) {
                        }
                        buildLogger.detail(R.string.build_log_template_shell, str5);
                        inputStreamOpen = this.this$0.context.getAssets().open(str5);
                        file = this.$outputFile;
                    } catch (Throwable th5) {
                        th = th5;
                        BuildWorkspaces.INSTANCE.release(fileCreate);
                        throw th;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r12 = (Closeable) this.L$1;
                    file2 = (File) this.L$0;
                    try {
                        q.b(obj);
                        r12 = r12;
                    } catch (Throwable th6) {
                        inputStream = r12;
                        th2 = th6;
                        try {
                            throw th2;
                        } catch (Throwable th7) {
                            ah.c.a(inputStream, th2);
                            throw th7;
                        }
                    }
                }
                f0 f0Var = f0.f21461a;
                ah.c.a(r12, null);
                BuildWorkspaces.INSTANCE.release(file2);
                return f0.f21461a;
            } catch (Throwable th8) {
                th = th8;
                fileCreate = file2;
            }
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((AnonymousClass2) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }
    }

    public AabGenerator(Context context) {
        r.e(context, "context");
        this.context = context;
    }

    public final Object generate(BuildConfiguration buildConfiguration, File file, tg.e<? super f0> eVar) throws Throwable {
        wh.c cVar = z0.f21632a;
        Object objE = ph.h.e(wh.b.f31563c, new AnonymousClass2(buildConfiguration, this, file, null), eVar);
        return objE == ug.a.f29706a ? objE : f0.f21461a;
    }
}
