package com.basitce.htmltoapk.data.apkgenerator;

import ah.l;
import com.android.aapt.Resources;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.AabGenerator;
import com.basitce.htmltoapk.data.apkgenerator.ApkGenerator;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import com.basitce.htmltoapk.domain.model.BuildConfiguration;
import com.basitce.htmltoapk.domain.model.ContentSource;
import com.basitce.htmltoapk.domain.model.Project;
import com.basitce.htmltoapk.domain.model.WebViewSettingsKt;
import eh.p;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.r;
import mh.k;
import pg.f0;
import pg.n;
import pg.q;
import ph.i0;
import qg.x;

@vg.e(c = "com.basitce.htmltoapk.data.apkgenerator.AabGenerator$Companion$generateBundle$2", f = "AabGenerator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AabGenerator$Companion$generateBundle$2 extends vg.i implements p<i0, tg.e<? super f0>, Object> {
    final /* synthetic */ BuildConfiguration $config;
    final /* synthetic */ String $keyAlias;
    final /* synthetic */ String $keyPassword;
    final /* synthetic */ File $keystoreFile;
    final /* synthetic */ String $keystorePassword;
    final /* synthetic */ File $outputFile;
    final /* synthetic */ InputStream $templateStream;
    final /* synthetic */ File $workDir;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AabGenerator$Companion$generateBundle$2(File file, InputStream inputStream, BuildConfiguration buildConfiguration, File file2, File file3, String str, String str2, String str3, tg.e<? super AabGenerator$Companion$generateBundle$2> eVar) {
        super(2, eVar);
        this.$workDir = file;
        this.$templateStream = inputStream;
        this.$config = buildConfiguration;
        this.$outputFile = file2;
        this.$keystoreFile = file3;
        this.$keystorePassword = str;
        this.$keyAlias = str2;
        this.$keyPassword = str3;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new AabGenerator$Companion$generateBundle$2(this.$workDir, this.$templateStream, this.$config, this.$outputFile, this.$keystoreFile, this.$keystorePassword, this.$keyAlias, this.$keyPassword, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0301 A[Catch: all -> 0x008f, Exception -> 0x0093, TryCatch #4 {Exception -> 0x0093, all -> 0x008f, blocks: (B:5:0x0025, B:7:0x0047, B:9:0x0054, B:12:0x0088, B:18:0x0099, B:19:0x00a4, B:21:0x00ac, B:22:0x00b1, B:24:0x00b9, B:25:0x00be, B:27:0x016e, B:29:0x01a0, B:31:0x01b0, B:33:0x01c0, B:35:0x01cd, B:36:0x01f3, B:37:0x01fb, B:39:0x021d, B:41:0x022f, B:45:0x0241, B:47:0x0301, B:52:0x0310, B:54:0x031d, B:57:0x034c, B:59:0x035e, B:60:0x0361, B:55:0x033b, B:56:0x0344, B:28:0x0198, B:71:0x03de, B:72:0x03ec, B:73:0x03ed, B:74:0x03fb), top: B:95:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x042c  */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        File file;
        AabGenerator.Companion companion;
        File file2;
        boolean showWatermark;
        boolean z10;
        String iconPath;
        ug.a aVar = ug.a.f29706a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.b(obj);
        BuildLogger buildLogger = BuildLogger.INSTANCE;
        buildLogger.detail(R.string.build_log_aab_generation_started, new Object[0]);
        this.$workDir.mkdirs();
        buildLogger.step(BuildLogger.BuildStage.EXTRACTING_TEMPLATE, R.string.build_log_extract_template_aab, new Object[0]);
        try {
            companion = AabGenerator.Companion;
            companion.extractTemplateAab(this.$workDir, this.$templateStream);
            buildLogger.success(BuildLogger.BuildStage.TEMPLATE_EXTRACTED, R.string.build_log_template_aab_extracted, new Object[0]);
            file2 = new File(this.$workDir, "base");
        } catch (Exception e10) {
            e = e10;
            file = null;
        } catch (Throwable th2) {
            th = th2;
            file = null;
        }
        if (!file2.exists()) {
            throw new IllegalStateException(buildLogger.localized(R.string.build_log_aab_no_base_module, new Object[0]));
        }
        File file3 = new File(file2, "manifest/AndroidManifest.xml");
        if (!file3.exists()) {
            throw new IllegalStateException(buildLogger.localized(R.string.build_log_aab_manifest_missing, new Object[0]));
        }
        AabManifestEditor aabManifestEditor = AabManifestEditor.INSTANCE;
        Resources.XmlNode xmlNode = aabManifestEditor.parse(l.j(file3));
        boolean zAdsRequested$app_release = companion.adsRequested$app_release(this.$config.getProject());
        Set setG0 = x.g0(this.$config.getProject().getPermissions());
        if (this.$config.getProject().getContentSource() instanceof ContentSource.Url) {
            setG0.add("android.permission.INTERNET");
            setG0.add("android.permission.ACCESS_NETWORK_STATE");
        }
        if (zAdsRequested$app_release) {
            setG0.add("com.google.android.gms.permission.AD_ID");
            setG0.add("android.permission.INTERNET");
            setG0.add("android.permission.ACCESS_NETWORK_STATE");
        }
        if (setG0.contains("android.permission.RECORD_AUDIO")) {
            setG0.add("android.permission.MODIFY_AUDIO_SETTINGS");
        }
        if (setG0.contains("android.permission.SCHEDULE_EXACT_ALARM")) {
            setG0.add("android.permission.USE_EXACT_ALARM");
        }
        List<String> listC0 = x.c0(setG0);
        k kVar = l9.a.f16766a;
        n<Resources.XmlNode, String> nVarUpdateManifest = aabManifestEditor.updateManifest(xmlNode, this.$config.getProject().getPackageName(), this.$config.getProject().getVersionCode(), this.$config.getProject().getVersionName(), this.$config.getProject().getAppName(), this.$config.getProject().getMinSdk(), this.$config.getProject().getTargetSdk(), this.$config.getProject().getMaxSdk(), listC0, this.$config.getProject().getDeepLinkScheme(), l9.a.b(this.$config.getProject()), WebViewSettingsKt.opensExternalPdfs(this.$config.getProject().getWebViewSettings(), this.$config.getProject().getContentSource() instanceof ContentSource.Pdf));
        Resources.XmlNode xmlNode2 = nVarUpdateManifest.f21469a;
        String str = nVarUpdateManifest.f21470b;
        l.q(file3, aabManifestEditor.serialize(xmlNode2));
        buildLogger.detail(BuildLogger.BuildStage.MANIFEST_RECREATED, R.string.build_log_manifest_updated, str);
        buildLogger.step(BuildLogger.BuildStage.UPDATING_MANIFEST, R.string.build_log_update_resources_pb, new Object[0]);
        File file4 = new File(file2, "resources.pb");
        if (file4.exists()) {
            AabResourcesEditor aabResourcesEditor = AabResourcesEditor.INSTANCE;
            l.q(file4, aabResourcesEditor.serialize(aabResourcesEditor.updatePackageName(aabResourcesEditor.parse(l.j(file4)), this.$config.getProject().getPackageName())));
            buildLogger.detail(BuildLogger.BuildStage.PACKAGE_NAME_UPDATED, R.string.build_log_resources_pb_updated, new Object[0]);
        } else {
            buildLogger.detail(R.string.build_log_resources_pb_missing, new Object[0]);
        }
        buildLogger.step(BuildLogger.BuildStage.REPACKAGING_DEX, R.string.build_log_repackage_dex, new Object[0]);
        if (str.length() > 0 && !str.equals(this.$config.getProject().getPackageName())) {
            File file5 = new File(file2, "dex");
            if (file5.exists()) {
                DexRepackager.INSTANCE.rewriteDexDirectory(file5, str, this.$config.getProject().getPackageName());
                buildLogger.detail(BuildLogger.BuildStage.DEX_REPACKAGED, R.string.build_log_dex_repackaged, str, this.$config.getProject().getPackageName());
            } else {
                buildLogger.detail(R.string.build_log_base_dex_missing, new Object[0]);
            }
        }
        buildLogger.step(BuildLogger.BuildStage.INJECTING_ASSETS, R.string.build_log_inject_assets, new Object[0]);
        File file6 = new File(file2, "assets/www");
        file6.mkdirs();
        Project project = this.$config.getProject();
        if (!this.$config.isPremium()) {
            showWatermark = true;
        } else {
            if (!r.a(this.$config.getProject().getBuildMode(), "advanced")) {
                z10 = false;
                Project projectCopy$default = Project.copy$default(project, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, z10, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, 0L, 0L, -67108865, -1, 3, null);
                ApkGenerator.Companion companion2 = ApkGenerator.Companion;
                companion2.injectAssets$app_release(BuildConfiguration.copy$default(this.$config, projectCopy$default, null, null, null, null, null, false, false, false, 510, null), file6);
                buildLogger.detail(BuildLogger.BuildStage.WEB_ASSETS_INJECTED, R.string.build_log_www_prepared, new Object[0]);
                iconPath = this.$config.getProject().getIconPath();
                if (iconPath == null) {
                    File file7 = new File(iconPath);
                    if (!file7.exists()) {
                        file7 = null;
                    }
                    if (file7 != null) {
                        File file8 = new File(file2, "res");
                        if (file8.exists()) {
                            companion2.injectIcon$app_release(file8, file7, this.$config.getProject().getPrimaryColor());
                            buildLogger.detail(BuildLogger.BuildStage.ICON_INJECTED, R.string.build_log_icon_injected_name, file7.getName());
                        } else {
                            buildLogger.detail(R.string.build_log_base_res_missing, new Object[0]);
                        }
                    } else {
                        buildLogger.detail(R.string.build_log_icon_not_selected, new Object[0]);
                    }
                    buildLogger.step(BuildLogger.BuildStage.REPACKAGING_ZIP, R.string.build_log_repackage_aab, new Object[0]);
                    File parentFile = this.$outputFile.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    File fileCreateTempFile = File.createTempFile("unsigned_", ".aab", this.$workDir.getParentFile());
                    try {
                        File parentFile2 = fileCreateTempFile.getParentFile();
                        if (parentFile2 != null) {
                            parentFile2.mkdirs();
                        }
                        companion.zipAab(this.$workDir, fileCreateTempFile);
                        buildLogger.detail(BuildLogger.BuildStage.UNSIGNED_ARTIFACT_CREATED, R.string.build_log_unsigned_aab_created, new Long(fileCreateTempFile.length()));
                        buildLogger.step(BuildLogger.BuildStage.SIGNING, R.string.build_log_signing_aab, new Object[0]);
                        companion.signAab(this.$config, fileCreateTempFile, this.$outputFile, this.$keystoreFile, this.$keystorePassword, this.$keyAlias, this.$keyPassword);
                        fileCreateTempFile.delete();
                        buildLogger.success(BuildLogger.BuildStage.COMPLETED, R.string.build_log_aab_build_completed, this.$outputFile.getName(), new Long(this.$outputFile.length()));
                        fileCreateTempFile.delete();
                        l.f(this.$workDir);
                        return f0.f21461a;
                    } catch (Exception e11) {
                        e = e11;
                        file = fileCreateTempFile;
                        try {
                            BuildLogger buildLogger2 = BuildLogger.INSTANCE;
                            String message = e.getMessage();
                            if (message == null) {
                                message = buildLogger2.localized(R.string.build_log_unknown_error, new Object[0]);
                            }
                            buildLogger2.detail(R.string.build_log_aab_generation_failed, message);
                            String message2 = e.getMessage();
                            if (message2 == null) {
                                message2 = buildLogger2.localized(R.string.build_log_unknown_error, new Object[0]);
                            }
                            buildLogger2.error(message2);
                            throw e;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        file = fileCreateTempFile;
                    }
                }
                if (file != null) {
                    file.delete();
                }
                l.f(this.$workDir);
                throw th;
            }
            showWatermark = this.$config.getProject().getShowWatermark();
        }
        z10 = showWatermark;
        Project projectCopy$default2 = Project.copy$default(project, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, z10, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, 0L, 0L, -67108865, -1, 3, null);
        ApkGenerator.Companion companion22 = ApkGenerator.Companion;
        companion22.injectAssets$app_release(BuildConfiguration.copy$default(this.$config, projectCopy$default2, null, null, null, null, null, false, false, false, 510, null), file6);
        buildLogger.detail(BuildLogger.BuildStage.WEB_ASSETS_INJECTED, R.string.build_log_www_prepared, new Object[0]);
        iconPath = this.$config.getProject().getIconPath();
        if (iconPath == null) {
        }
        if (file != null) {
        }
        l.f(this.$workDir);
        throw th;
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((AabGenerator$Companion$generateBundle$2) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }
}
