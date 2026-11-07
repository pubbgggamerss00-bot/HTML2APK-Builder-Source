package com.basitce.htmltoapk.data.apkgenerator;

import ah.h;
import ah.h.b;
import ah.l;
import c0.u0;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import com.basitce.htmltoapk.domain.model.ContentSource;
import com.basitce.htmltoapk.domain.model.Project;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import com.basitce.htmltoapk.domain.model.WebViewSettings;
import com.basitce.htmltoapk.domain.model.WebViewSettingsKt;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.v;
import kotlinx.serialization.json.w;
import l9.n0;
import l9.o0;
import lh.e;
import mh.t;
import mh.x;
import p5.g0;
import pg.n;
import qg.k0;
import qg.o;
import qg.p;
import qg.z;

/* loaded from: classes.dex */
public final class ProjectAssetWriter {
    public static final int $stable = 0;
    public static final ProjectAssetWriter INSTANCE = new ProjectAssetWriter();

    private ProjectAssetWriter() {
    }

    private final List<String> parsePermissions(String str) {
        try {
            try {
                b.a aVar = kotlinx.serialization.json.b.f16435d;
                aVar.getClass();
                return (List) aVar.b(new ArrayListSerializer(StringSerializer.INSTANCE), str);
            } catch (Exception unused) {
                List listO = x.O(x.L(str, "[", "]"), new String[]{","});
                ArrayList arrayList = new ArrayList(p.h(listO, 10));
                Iterator it = listO.iterator();
                while (it.hasNext()) {
                    arrayList.add(x.K(x.W((String) it.next()).toString(), "\""));
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    if (!x.A((String) obj)) {
                        arrayList2.add(obj);
                    }
                }
                return arrayList2;
            }
        } catch (Exception unused2) {
            return z.f22752a;
        }
    }

    public static /* synthetic */ void writeProjectAssets$default(ProjectAssetWriter projectAssetWriter, Project project, File file, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 4) != 0) {
            z10 = !project.getShowWatermark();
        }
        projectAssetWriter.writeProjectAssets(project, file, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean writeProjectAssets$lambda$18(File it) {
        r.e(it, "it");
        return it.isFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean writeProjectAssets$lambda$20(File it) {
        r.e(it, "it");
        return it.isFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String writeProjectAssets$lambda$21(File file, File it) {
        r.e(it, "it");
        return l.h(l.l(it, file));
    }

    private static final void writeProjectAssets$writeConfig(File file, Project project, String str, boolean z10, boolean z11, String str2, String str3, String str4) throws IOException {
        String string;
        String admobBannerUnitId;
        String string2;
        String admobInterstitialUnitId;
        String string3;
        String admobRewardedUnitId;
        String strC;
        List listX;
        w wVar = new w();
        wVar.b("mode", kotlinx.serialization.json.i.b(str3));
        if (str4 != null) {
            wVar.b("url", kotlinx.serialization.json.i.b(str4));
        }
        u0.b(wVar, "showHeader", Boolean.valueOf(project.getShowHeader()));
        u0.b(wVar, "showActionBar", Boolean.valueOf(project.getShowActionBar()));
        u0.b(wVar, "keepScreenOn", Boolean.valueOf(project.getKeepScreenOn()));
        u0.b(wVar, "showCameraCutout", Boolean.valueOf(project.getShowCameraCutout()));
        u0.b(wVar, "desktopMode", Boolean.valueOf(project.getDesktopMode()));
        u0.b(wVar, "pullToRefresh", Boolean.valueOf(project.getWebViewSettings().getPullToRefresh()));
        u0.b(wVar, "noInternetDialog", Boolean.valueOf(project.getWebViewSettings().getNoInternetDialog()));
        u0.b(wVar, "loadingIndicator", Boolean.valueOf(project.getWebViewSettings().getLoadingIndicator()));
        u0.b(wVar, "backHistoryNavigation", Boolean.valueOf(project.getWebViewSettings().getBackHistoryNavigation()));
        u0.b(wVar, "exitConfirmationDialog", Boolean.valueOf(project.getWebViewSettings().getExitConfirmationDialog()));
        u0.b(wVar, "bridgeOwnOriginOnly", Boolean.valueOf(project.getWebViewSettings().getBridgeOwnOriginOnly()));
        wVar.b("orientation", kotlinx.serialization.json.i.b(project.getOrientation()));
        wVar.b("primaryColor", kotlinx.serialization.json.i.b(str));
        u0.b(wVar, "hasSplash", Boolean.valueOf(z10));
        u0.b(wVar, "splashEnabled", Boolean.valueOf(project.getWebViewSettings().getSplashEnabled()));
        wVar.b("splashBgColor", kotlinx.serialization.json.i.b(project.getWebViewSettings().getSplashBgColor()));
        u0.b(wVar, "splashFadeOut", Boolean.valueOf(project.getWebViewSettings().getSplashFadeOut()));
        wVar.b("splashLoaderStyle", kotlinx.serialization.json.i.b(project.getWebViewSettings().getSplashLoaderStyle()));
        wVar.b("splashIconSize", kotlinx.serialization.json.i.a(Integer.valueOf(project.getWebViewSettings().getSplashIconSize())));
        wVar.b("splashIconRadius", kotlinx.serialization.json.i.a(Integer.valueOf(project.getWebViewSettings().getSplashIconRadius())));
        wVar.b("splashLoaderSize", kotlinx.serialization.json.i.a(Integer.valueOf(project.getWebViewSettings().getSplashLoaderSize())));
        wVar.b("splashSpacing", kotlinx.serialization.json.i.a(Integer.valueOf(project.getWebViewSettings().getSplashSpacing())));
        wVar.b("splashDuration", kotlinx.serialization.json.i.a(Integer.valueOf(project.getWebViewSettings().getSplashDuration())));
        wVar.b("splashLoaderThickness", kotlinx.serialization.json.i.a(Integer.valueOf(project.getWebViewSettings().getSplashLoaderThickness())));
        wVar.b("splashFadeDuration", kotlinx.serialization.json.i.a(Integer.valueOf(project.getWebViewSettings().getSplashFadeDuration())));
        wVar.b("splashLoaderColor", kotlinx.serialization.json.i.b(project.getWebViewSettings().getSplashLoaderColor()));
        u0.b(wVar, "splashFullScreen", Boolean.valueOf(project.getWebViewSettings().getSplashFullScreen()));
        u0.b(wVar, "splashHideLoader", Boolean.valueOf(project.getWebViewSettings().getSplashHideLoader()));
        wVar.b("colorMode", kotlinx.serialization.json.i.b(project.getWebViewSettings().getColorMode()));
        wVar.b("webBackgroundColor", kotlinx.serialization.json.i.b(project.getWebViewSettings().getWebBackgroundColor()));
        wVar.b("statusBarColor", kotlinx.serialization.json.i.b(project.getWebViewSettings().getStatusBarColor()));
        int i10 = 0;
        wVar.b("statusBarAlpha", kotlinx.serialization.json.i.a(Integer.valueOf(jh.j.m(project.getWebViewSettings().getStatusBarAlpha(), 0, 100))));
        wVar.b("statusBarIcons", kotlinx.serialization.json.i.b(project.getWebViewSettings().getStatusBarIcons()));
        wVar.b("navBarColor", kotlinx.serialization.json.i.b(project.getWebViewSettings().getNavBarColor()));
        wVar.b("navBarAlpha", kotlinx.serialization.json.i.a(Integer.valueOf(jh.j.m(project.getWebViewSettings().getNavBarAlpha(), 0, 100))));
        wVar.b("navBarIcons", kotlinx.serialization.json.i.b(project.getWebViewSettings().getNavBarIcons()));
        u0.b(wVar, "showWatermark", Boolean.valueOf(project.getShowWatermark()));
        u0.b(wVar, "isPro", Boolean.valueOf(z11));
        b.a aVar = kotlinx.serialization.json.b.f16435d;
        List<String> permissions = project.getPermissions();
        aVar.getClass();
        wVar.b("permissions", aVar.d(aVar.c(new ArrayListSerializer(StringSerializer.INSTANCE), permissions)));
        wVar.b("webViewSettings", new v(k0.g(kotlinx.serialization.json.i.e(aVar.d(str2)), new n("mixedContentMode", kotlinx.serialization.json.i.a(Integer.valueOf(WebViewSettingsKt.webViewMixedContentMode(project.getWebViewSettings())))))));
        if (r.a(str3, ProjectKind.PDF)) {
            wVar.b("pdfReader", WebViewSettingsKt.pdfReaderJson(project.getWebViewSettings()));
        }
        Boolean bool = Boolean.FALSE;
        u0.b(wVar, "billingEnabled", bool);
        wVar.b("billingProductId", kotlinx.serialization.json.i.b(""));
        wVar.b("billingSubscriptionId", kotlinx.serialization.json.i.b(""));
        wVar.b("billingType", kotlinx.serialization.json.i.b("non_consumable"));
        u0.b(wVar, "billingTestMode", bool);
        Boolean bool2 = Boolean.TRUE;
        u0.b(wVar, "billingAutoConsume", bool2);
        u0.b(wVar, "billingAcknowledge", bool2);
        u0.b(wVar, "billingEnablePendingPurchases", bool2);
        wVar.b("billingSubscriptionPeriod", kotlinx.serialization.json.i.b("P1M"));
        wVar.b("billingFreeTrialDays", kotlinx.serialization.json.i.a(0));
        wVar.b("billingIntroductoryPrice", kotlinx.serialization.json.i.b(""));
        wVar.b("billingProductName", kotlinx.serialization.json.i.b(""));
        wVar.b("billingProductDescription", kotlinx.serialization.json.i.b(""));
        boolean admobEnabled = project.getAdmobEnabled();
        boolean z12 = admobEnabled && project.getAdmobUseTestAds();
        u0.b(wVar, "admobEnabled", Boolean.valueOf(admobEnabled));
        u0.b(wVar, "admobUseTestAds", Boolean.valueOf(z12));
        String strB = l9.a.b(project);
        if (strB == null) {
            strB = "";
        }
        wVar.b("admobAppId", kotlinx.serialization.json.i.b(strB));
        if (z12) {
            string = AdMobTestIds.BANNER;
        } else if (!admobEnabled || (admobBannerUnitId = project.getAdmobBannerUnitId()) == null || (string = x.W(admobBannerUnitId).toString()) == null) {
            string = "";
        }
        wVar.b("admobBannerUnitId", kotlinx.serialization.json.i.b(string));
        if (z12) {
            string2 = AdMobTestIds.INTERSTITIAL;
        } else if (!admobEnabled || (admobInterstitialUnitId = project.getAdmobInterstitialUnitId()) == null || (string2 = x.W(admobInterstitialUnitId).toString()) == null) {
            string2 = "";
        }
        wVar.b("admobInterstitialUnitId", kotlinx.serialization.json.i.b(string2));
        if (z12) {
            string3 = AdMobTestIds.REWARDED;
        } else if (!admobEnabled || (admobRewardedUnitId = project.getAdmobRewardedUnitId()) == null || (string3 = x.W(admobRewardedUnitId).toString()) == null) {
            string3 = "";
        }
        wVar.b("admobRewardedUnitId", kotlinx.serialization.json.i.b(string3));
        u0.b(wVar, "admobBannerEnabled", Boolean.valueOf(z12 ? true : admobEnabled ? project.getAdmobBannerEnabled() : false));
        u0.b(wVar, "admobInterstitialEnabled", Boolean.valueOf(z12 ? true : admobEnabled ? project.getAdmobInterstitialEnabled() : false));
        u0.b(wVar, "admobRewardedEnabled", Boolean.valueOf(z12 ? true : admobEnabled ? project.getAdmobRewardedEnabled() : false));
        String admobBannerPosition = project.getAdmobBannerPosition();
        if (admobBannerPosition == null) {
            admobBannerPosition = "bottom";
        }
        wVar.b("admobBannerPosition", kotlinx.serialization.json.i.b(admobBannerPosition));
        u0.b(wVar, "admobShowBannerOnStart", Boolean.valueOf(project.getAdmobShowBannerOnStart()));
        String admobTestDeviceIds = project.getAdmobTestDeviceIds();
        if (admobTestDeviceIds != null) {
            List listO = x.O(admobTestDeviceIds, new String[]{",", "\n"});
            ArrayList arrayList = new ArrayList(p.h(listO, 10));
            Iterator it = listO.iterator();
            while (it.hasNext()) {
                arrayList.add(x.W((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                if (!x.A((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            b.a aVar2 = kotlinx.serialization.json.b.f16435d;
            aVar2.getClass();
            strC = aVar2.c(new ArrayListSerializer(StringSerializer.INSTANCE), arrayList2);
        } else {
            strC = "[]";
        }
        wVar.b("admobTestDeviceIds", aVar.d(strC));
        u0.b(wVar, "admobAutoLoadInterstitial", Boolean.valueOf(project.getAdmobAutoLoadInterstitial()));
        u0.b(wVar, "admobAutoLoadRewarded", Boolean.valueOf(project.getAdmobAutoLoadRewarded()));
        wVar.b("admobInterstitialIntervalSeconds", kotlinx.serialization.json.i.a(Integer.valueOf(project.getAdmobInterstitialIntervalSeconds())));
        wVar.b("admobInterstitialPageCount", kotlinx.serialization.json.i.a(Integer.valueOf(project.getAdmobInterstitialPageCount())));
        int admobChildDirectedTreatment = project.getAdmobChildDirectedTreatment();
        Integer numValueOf = Integer.valueOf(admobChildDirectedTreatment);
        if (-1 > admobChildDirectedTreatment || admobChildDirectedTreatment >= 2) {
            numValueOf = null;
        }
        wVar.b("admobChildDirectedTreatment", kotlinx.serialization.json.i.a(Integer.valueOf(numValueOf != null ? numValueOf.intValue() : -1)));
        int admobUnderAgeOfConsent = project.getAdmobUnderAgeOfConsent();
        Integer numValueOf2 = Integer.valueOf(admobUnderAgeOfConsent);
        if (-1 > admobUnderAgeOfConsent || admobUnderAgeOfConsent >= 2) {
            numValueOf2 = null;
        }
        wVar.b("admobUnderAgeOfConsent", kotlinx.serialization.json.i.a(Integer.valueOf(numValueOf2 != null ? numValueOf2.intValue() : -1)));
        String admobMaxAdContentRating = project.getAdmobMaxAdContentRating();
        if (!o.C(new String[]{"", "G", "PG", "T", "MA"}).contains(admobMaxAdContentRating)) {
            admobMaxAdContentRating = null;
        }
        if (admobMaxAdContentRating == null) {
            admobMaxAdContentRating = "";
        }
        wVar.b("admobMaxAdContentRating", kotlinx.serialization.json.i.b(admobMaxAdContentRating));
        boolean z13 = z12 && project.getUmpDebugEnabled();
        u0.b(wVar, "umpDebugEnabled", Boolean.valueOf(z13));
        String str5 = "DISABLED";
        if (z13) {
            String umpDebugGeography = project.getUmpDebugGeography();
            String str6 = o.C(new String[]{"DISABLED", "EEA", "REGULATED_US_STATE", "OTHER"}).contains(umpDebugGeography) ? umpDebugGeography : null;
            if (str6 != null) {
                str5 = str6;
            }
        }
        wVar.b("umpDebugGeography", kotlinx.serialization.json.i.b(str5));
        b.a aVar3 = kotlinx.serialization.json.b.f16435d;
        if (z13) {
            String umpTestDeviceIds = project.getUmpTestDeviceIds();
            List listO2 = x.O(umpTestDeviceIds != null ? umpTestDeviceIds : "", new String[]{",", "\n"});
            ArrayList arrayList3 = new ArrayList(p.h(listO2, 10));
            Iterator it2 = listO2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(x.W((String) it2.next()).toString());
            }
            ArrayList arrayList4 = new ArrayList();
            int size2 = arrayList3.size();
            while (i10 < size2) {
                Object obj2 = arrayList3.get(i10);
                i10++;
                if (((String) obj2).length() > 0) {
                    arrayList4.add(obj2);
                }
            }
            listX = qg.x.x(arrayList4);
        } else {
            listX = z.f22752a;
        }
        aVar3.getClass();
        wVar.b("umpTestDeviceIds", aVar3.d(aVar3.c(new ArrayListSerializer(StringSerializer.INSTANCE), listX)));
        byte[] bytes = wVar.a().toString().getBytes(mh.a.f18238b);
        r.d(bytes, "getBytes(...)");
        l.q(new File(file, "runtime.cache"), ConfigCrypto.INSTANCE.encryptConfig(bytes));
        l.q(new File(file, "config.json"), bytes);
    }

    public static /* synthetic */ void writeProjectAssets$writeConfig$default(File file, Project project, String str, boolean z10, boolean z11, String str2, String str3, String str4, int i10, Object obj) throws IOException {
        writeProjectAssets$writeConfig(file, project, str, z10, z11, str2, str3, (i10 & 128) != 0 ? null : str4);
    }

    public final Project toProject(ProjectEntity projectEntity) {
        long j10;
        WebViewSettings webViewSettings;
        r.e(projectEntity, "<this>");
        long id2 = projectEntity.getId();
        String name = projectEntity.getName();
        String appName = projectEntity.getAppName();
        String packageName = projectEntity.getPackageName();
        int versionCode = projectEntity.getVersionCode();
        String versionName = projectEntity.getVersionName();
        int minSdk = projectEntity.getMinSdk();
        int targetSdk = projectEntity.getTargetSdk();
        Integer maxSdk = projectEntity.getMaxSdk();
        String lowerCase = projectEntity.getContentSourceType().toLowerCase(Locale.ROOT);
        r.d(lowerCase, "toLowerCase(...)");
        ContentSource contentSource = lowerCase.equals("url") ? ContentSource.Url.INSTANCE : lowerCase.equals(ProjectKind.PDF) ? ContentSource.Pdf.INSTANCE : ContentSource.Local.INSTANCE;
        String sourcePath = projectEntity.getSourcePath();
        String sourceUrl = projectEntity.getSourceUrl();
        List<String> permissions = parsePermissions(projectEntity.getPermissionsJson());
        String iconPath = projectEntity.getIconPath();
        String splashPath = projectEntity.getSplashPath();
        String primaryColor = projectEntity.getPrimaryColor();
        String orientation = projectEntity.getOrientation();
        boolean showHeader = projectEntity.getShowHeader();
        boolean showActionBar = projectEntity.getShowActionBar();
        boolean keepScreenOn = projectEntity.getKeepScreenOn();
        boolean showCameraCutout = projectEntity.getShowCameraCutout();
        boolean desktopMode = projectEntity.getDesktopMode();
        try {
            j10 = id2;
            try {
                webViewSettings = (WebViewSettings) kotlinx.serialization.json.b.f16435d.b(WebViewSettings.Companion.serializer(), projectEntity.getWebViewSettingsJson());
            } catch (Exception unused) {
                webViewSettings = new WebViewSettings(false, false, false, false, false, false, false, false, false, false, 0, 0, (String) null, 0, false, false, false, false, false, false, false, (Boolean) null, false, (String) null, false, (String) null, 0, 0, 0, 0, 0, 0, 0, (String) null, false, false, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, false, false, false, false, false, false, false, 0, -1, 4194303, (kotlin.jvm.internal.j) null);
                return new Project(j10, name, appName, packageName, versionCode, versionName, minSdk, targetSdk, maxSdk, contentSource, sourcePath, sourceUrl, permissions, iconPath, splashPath, primaryColor, orientation, showHeader, showActionBar, keepScreenOn, showCameraCutout, desktopMode, webViewSettings, projectEntity.getKeystoreId(), projectEntity.getOutputFormat(), projectEntity.getBuildMode(), projectEntity.getShowWatermark(), projectEntity.getAutoIncrementVersionCode(), projectEntity.getDeepLinkScheme(), projectEntity.getBillingEnabled(), projectEntity.getBillingProductId(), projectEntity.getBillingSubscriptionId(), projectEntity.getBillingType(), projectEntity.getBillingTestMode(), projectEntity.getBillingAutoConsume(), projectEntity.getBillingAcknowledge(), projectEntity.getBillingEnablePendingPurchases(), projectEntity.getBillingSubscriptionPeriod(), projectEntity.getBillingFreeTrialDays(), projectEntity.getBillingIntroductoryPrice(), projectEntity.getBillingProductName(), projectEntity.getBillingProductDescription(), projectEntity.getAdmobEnabled(), projectEntity.getAdmobAppId(), projectEntity.getAdmobBannerUnitId(), projectEntity.getAdmobInterstitialUnitId(), projectEntity.getAdmobRewardedUnitId(), projectEntity.getAdmobBannerPosition(), projectEntity.getAdmobShowBannerOnStart(), projectEntity.getAdmobTestDeviceIds(), projectEntity.getAdmobAutoLoadInterstitial(), projectEntity.getAdmobAutoLoadRewarded(), projectEntity.getAdmobUseTestAds(), projectEntity.getAdmobBannerEnabled(), projectEntity.getAdmobInterstitialEnabled(), projectEntity.getAdmobRewardedEnabled(), projectEntity.getAdmobInterstitialIntervalSeconds(), projectEntity.getAdmobInterstitialPageCount(), projectEntity.getAdmobChildDirectedTreatment(), projectEntity.getAdmobUnderAgeOfConsent(), projectEntity.getAdmobMaxAdContentRating(), projectEntity.getUmpDebugEnabled(), projectEntity.getUmpDebugGeography(), projectEntity.getUmpTestDeviceIds(), 0L, 0L, 0, 0, 3, (kotlin.jvm.internal.j) null);
            }
        } catch (Exception unused2) {
            j10 = id2;
        }
        return new Project(j10, name, appName, packageName, versionCode, versionName, minSdk, targetSdk, maxSdk, contentSource, sourcePath, sourceUrl, permissions, iconPath, splashPath, primaryColor, orientation, showHeader, showActionBar, keepScreenOn, showCameraCutout, desktopMode, webViewSettings, projectEntity.getKeystoreId(), projectEntity.getOutputFormat(), projectEntity.getBuildMode(), projectEntity.getShowWatermark(), projectEntity.getAutoIncrementVersionCode(), projectEntity.getDeepLinkScheme(), projectEntity.getBillingEnabled(), projectEntity.getBillingProductId(), projectEntity.getBillingSubscriptionId(), projectEntity.getBillingType(), projectEntity.getBillingTestMode(), projectEntity.getBillingAutoConsume(), projectEntity.getBillingAcknowledge(), projectEntity.getBillingEnablePendingPurchases(), projectEntity.getBillingSubscriptionPeriod(), projectEntity.getBillingFreeTrialDays(), projectEntity.getBillingIntroductoryPrice(), projectEntity.getBillingProductName(), projectEntity.getBillingProductDescription(), projectEntity.getAdmobEnabled(), projectEntity.getAdmobAppId(), projectEntity.getAdmobBannerUnitId(), projectEntity.getAdmobInterstitialUnitId(), projectEntity.getAdmobRewardedUnitId(), projectEntity.getAdmobBannerPosition(), projectEntity.getAdmobShowBannerOnStart(), projectEntity.getAdmobTestDeviceIds(), projectEntity.getAdmobAutoLoadInterstitial(), projectEntity.getAdmobAutoLoadRewarded(), projectEntity.getAdmobUseTestAds(), projectEntity.getAdmobBannerEnabled(), projectEntity.getAdmobInterstitialEnabled(), projectEntity.getAdmobRewardedEnabled(), projectEntity.getAdmobInterstitialIntervalSeconds(), projectEntity.getAdmobInterstitialPageCount(), projectEntity.getAdmobChildDirectedTreatment(), projectEntity.getAdmobUnderAgeOfConsent(), projectEntity.getAdmobMaxAdContentRating(), projectEntity.getUmpDebugEnabled(), projectEntity.getUmpDebugGeography(), projectEntity.getUmpTestDeviceIds(), 0L, 0L, 0, 0, 3, (kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeProjectAssets(Project project, final File assetDir, boolean z10) throws IOException {
        String strC;
        boolean z11;
        ?? string;
        r.e(project, "project");
        r.e(assetDir, "assetDir");
        l.f(assetDir);
        assetDir.mkdirs();
        BuildLogger.INSTANCE.detail(R.string.build_log_www_dir_prepared, assetDir.getAbsolutePath());
        try {
            strC = kotlinx.serialization.json.b.f16435d.c(WebViewSettings.Companion.serializer(), project.getWebViewSettings());
        } catch (Exception e10) {
            BuildLogger buildLogger = BuildLogger.INSTANCE;
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            buildLogger.detail(R.string.build_log_webview_settings_error, message);
            strC = "{}";
        }
        String str = strC;
        String primaryColor = project.getPrimaryColor();
        if (primaryColor == null) {
            primaryColor = "#2196F3";
        }
        int i10 = 0;
        if (project.getWebViewSettings().getSplashEnabled()) {
            String splashPath = project.getSplashPath();
            if (splashPath != null) {
                File file = new File(splashPath);
                if (!file.exists()) {
                    file = null;
                }
                if (file == null) {
                    String iconPath = project.getIconPath();
                    if (iconPath != null) {
                        file = new File(iconPath);
                        if (!file.exists()) {
                            file = null;
                        }
                    }
                }
                if (file != null) {
                    File file2 = new File(assetDir, "splash.png");
                    l.e(file, file2);
                    BuildLogger.INSTANCE.detail(R.string.build_log_splash_copied, Long.valueOf(file.length()), file2.getName());
                } else {
                    BuildLogger.INSTANCE.detail(R.string.build_log_splash_missing, new Object[0]);
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (project.getContentSource() instanceof ContentSource.Pdf) {
            String sourcePath = project.getSourcePath();
            file = sourcePath != null ? new File(sourcePath) : null;
            if (file != null && file.isFile()) {
                long length = file.length();
                if (1 <= length && length < 104857601) {
                    l.e(file, new File(assetDir, "document.pdf"));
                    writeProjectAssets$writeConfig$default(assetDir, project, primaryColor, z11, z10, str, ProjectKind.PDF, null, 128, null);
                    return;
                }
            }
            throw new IllegalArgumentException("A valid PDF file up to 100 MB is required");
        }
        String str2 = primaryColor;
        if (project.getContentSource() instanceof ContentSource.Url) {
            String sourceUrl = project.getSourceUrl();
            if (sourceUrl != null && (string = x.W(sourceUrl).toString()) != 0 && !x.A(string)) {
                file = string;
            }
            ?? r82 = file;
            if (r82 == 0) {
                writeProjectAssets$writeConfig$default(assetDir, project, str2, z11, z10, str, "local", null, 128, null);
                BuildLogger.INSTANCE.detail(R.string.build_log_config_url_absent, new Object[0]);
                return;
            } else {
                BuildLogger buildLogger2 = BuildLogger.INSTANCE;
                buildLogger2.detail(R.string.build_log_config_url_prepare, r82);
                writeProjectAssets$writeConfig(assetDir, project, str2, z11, z10, str, "url", r82);
                buildLogger2.detail(R.string.build_log_config_url_written, new Object[0]);
                return;
            }
        }
        if (project.getSourcePath() == null) {
            l.r(new File(assetDir, "index.html"), g0.a("<!DOCTYPE html><html><head><meta charset=\"utf-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><title>", project.getAppName(), "</title></head><body style=\"font-family:sans-serif;display:flex;justify-content:center;align-items:center;height:100vh;margin:0;background:#121212;color:#fff;text-align:center;\"><div><h2>", project.getAppName(), "</h2><p>Application ready.</p></div></body></html>"), mh.a.f18238b);
            writeProjectAssets$writeConfig$default(assetDir, project, str2, z11, z10, str, "local", null, 128, null);
            BuildLogger.INSTANCE.detail(R.string.build_log_config_no_source, new Object[0]);
            return;
        }
        String sourcePath2 = project.getSourcePath();
        BuildLogger buildLogger3 = BuildLogger.INSTANCE;
        buildLogger3.detail(R.string.build_log_inject_assets, new Object[0]);
        File file3 = new File(sourcePath2);
        File canonicalFile = file3.getCanonicalFile();
        if (!file3.exists()) {
            buildLogger3.detail(R.string.build_log_source_missing, sourcePath2 != null ? sourcePath2 : "");
            l.r(new File(assetDir, "index.html"), g0.a("<!DOCTYPE html><html><head><meta charset=\"utf-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><title>", project.getAppName(), "</title></head><body style=\"font-family:sans-serif;display:flex;justify-content:center;align-items:center;height:100vh;margin:0;background:#121212;color:#fff;text-align:center;\"><div><h2>", project.getAppName(), "</h2><p>Application ready.</p></div></body></html>"), mh.a.f18238b);
        } else if (file3.isDirectory()) {
            e.a aVar = new e.a(lh.j.i(l.p(file3), new g()));
            int i11 = 0;
            while (aVar.hasNext()) {
                File file4 = (File) aVar.next();
                File canonicalFile2 = file4.getCanonicalFile();
                r.b(canonicalFile2);
                r.b(canonicalFile);
                if (l.m(canonicalFile2, canonicalFile)) {
                    String strH = l.h(l.l(file4, file3));
                    if (t.p(strH, "..", false) || x.r(strH, "/../", false) || t.p(strH, "/", false)) {
                        BuildLogger.INSTANCE.detail(R.string.build_log_skip_bad_relative, strH);
                    } else {
                        File file5 = new File(assetDir, strH);
                        File parentFile = file5.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        l.e(file4, file5);
                        i11++;
                        if (i11 % 25 == 0) {
                            BuildLogger.INSTANCE.detail(R.string.build_log_copy_assets_tick, Integer.valueOf(i11));
                        }
                    }
                } else {
                    BuildLogger.INSTANCE.detail(R.string.build_log_skip_traversal, new Object[0]);
                }
            }
            if (!new File(assetDir, "index.html").exists()) {
                Set<String> set = o0.f16861a;
                String strA = o0.a(lh.j.k(new lh.p(lh.j.i(l.p(assetDir), new h(i10)), new eh.l() { // from class: com.basitce.htmltoapk.data.apkgenerator.i
                    @Override // eh.l
                    public final Object invoke(Object obj) {
                        return ProjectAssetWriter.writeProjectAssets$lambda$21(assetDir, (File) obj);
                    }
                })));
                if (strA != null) {
                    File file6 = new File(assetDir, "index.html");
                    String strI = qg.x.I(x.P(strA, new char[]{'/'}), "/", null, null, new n0(i10), 30);
                    l.r(file6, g0.a("<!DOCTYPE html><html><head><meta charset=\"utf-8\"><meta http-equiv=\"refresh\" content=\"0; url=", strI, "\"><script>location.replace(\"", strI, "\"+location.search+location.hash)</script></head><body></body></html>"), mh.a.f18238b);
                    BuildLogger.INSTANCE.detail(R.string.build_log_folder_entry_redirect, strA);
                }
            }
            h.b bVar = l.p(assetDir).new b();
            int i12 = 0;
            while (bVar.hasNext()) {
                if (bVar.next().isFile() && (i12 = i12 + 1) < 0) {
                    p.n();
                    throw null;
                }
            }
            BuildLogger.INSTANCE.detail(R.string.build_log_copy_dir_total, Integer.valueOf(i12));
        } else {
            File file7 = new File(assetDir, "index.html");
            l.e(file3, file7);
            buildLogger3.detail(R.string.build_log_copy_single_file, Long.valueOf(file7.length()));
        }
        writeProjectAssets$writeConfig$default(assetDir, project, str2, z11, z10, str, "local", null, 128, null);
        BuildLogger.INSTANCE.detail(R.string.build_log_config_local_written, new Object[0]);
    }
}
