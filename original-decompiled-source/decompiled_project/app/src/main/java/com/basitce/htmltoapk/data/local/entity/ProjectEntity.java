package com.basitce.htmltoapk.data.local.entity;

import androidx.datastore.preferences.protobuf.a1;
import androidx.room.z0;
import com.android.apksig.internal.apk.a;
import com.basitce.htmltoapk.domain.model.ProjectKind;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import l0.k;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import r.e2;
import r.o2;

/* loaded from: classes.dex */
public final class ProjectEntity {
    public static final int $stable = 0;
    private final String admobAppId;
    private final boolean admobAutoLoadInterstitial;
    private final boolean admobAutoLoadRewarded;
    private final boolean admobBannerEnabled;
    private final String admobBannerPosition;
    private final String admobBannerUnitId;
    private final int admobChildDirectedTreatment;
    private final boolean admobEnabled;
    private final boolean admobInterstitialEnabled;
    private final int admobInterstitialIntervalSeconds;
    private final int admobInterstitialPageCount;
    private final String admobInterstitialUnitId;
    private final String admobMaxAdContentRating;
    private final boolean admobRewardedEnabled;
    private final String admobRewardedUnitId;
    private final boolean admobShowBannerOnStart;
    private final String admobTestDeviceIds;
    private final int admobUnderAgeOfConsent;
    private final boolean admobUseTestAds;
    private final String appName;
    private final boolean autoIncrementVersionCode;
    private final boolean billingAcknowledge;
    private final boolean billingAutoConsume;
    private final boolean billingEnablePendingPurchases;
    private final boolean billingEnabled;
    private final int billingFreeTrialDays;
    private final String billingIntroductoryPrice;
    private final String billingProductDescription;
    private final String billingProductId;
    private final String billingProductName;
    private final String billingSubscriptionId;
    private final String billingSubscriptionPeriod;
    private final boolean billingTestMode;
    private final String billingType;
    private final String buildMode;
    private final String contentSourceType;
    private final long createdAt;
    private final String deepLinkScheme;
    private final boolean desktopMode;
    private final Long folderId;
    private final String iconPath;

    /* renamed from: id, reason: collision with root package name */
    private final long f5742id;
    private final boolean keepScreenOn;
    private final Long keystoreId;
    private final String kind;
    private final Integer maxSdk;
    private final int minSdk;
    private final String name;
    private final String orientation;
    private final String outputFormat;
    private final String packageName;
    private final String permissionsJson;
    private final String primaryColor;
    private final boolean showActionBar;
    private final boolean showCameraCutout;
    private final boolean showHeader;
    private final boolean showWatermark;
    private final String sourcePath;
    private final String sourceUrl;
    private final String splashPath;
    private final int targetSdk;
    private final boolean umpDebugEnabled;
    private final String umpDebugGeography;
    private final String umpTestDeviceIds;
    private final long updatedAt;
    private final int versionCode;
    private final String versionName;
    private final String webViewSettingsJson;

    public ProjectEntity(long j10, String name, String appName, String packageName, int i10, String versionName, int i11, int i12, Integer num, String contentSourceType, String str, String str2, String permissionsJson, String str3, String str4, String str5, String orientation, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String webViewSettingsJson, Long l10, String outputFormat, String buildMode, boolean z15, boolean z16, String str6, boolean z17, String str7, String str8, String str9, boolean z18, boolean z19, boolean z20, boolean z21, String str10, int i13, String str11, String str12, String str13, boolean z22, String str14, String str15, String str16, String str17, String str18, boolean z23, String str19, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, int i14, int i15, int i16, int i17, String admobMaxAdContentRating, boolean z30, String umpDebugGeography, String str20, String kind, Long l11, long j11, long j12) {
        r.e(name, "name");
        r.e(appName, "appName");
        r.e(packageName, "packageName");
        r.e(versionName, "versionName");
        r.e(contentSourceType, "contentSourceType");
        r.e(permissionsJson, "permissionsJson");
        r.e(orientation, "orientation");
        r.e(webViewSettingsJson, "webViewSettingsJson");
        r.e(outputFormat, "outputFormat");
        r.e(buildMode, "buildMode");
        r.e(admobMaxAdContentRating, "admobMaxAdContentRating");
        r.e(umpDebugGeography, "umpDebugGeography");
        r.e(kind, "kind");
        this.f5742id = j10;
        this.name = name;
        this.appName = appName;
        this.packageName = packageName;
        this.versionCode = i10;
        this.versionName = versionName;
        this.minSdk = i11;
        this.targetSdk = i12;
        this.maxSdk = num;
        this.contentSourceType = contentSourceType;
        this.sourcePath = str;
        this.sourceUrl = str2;
        this.permissionsJson = permissionsJson;
        this.iconPath = str3;
        this.splashPath = str4;
        this.primaryColor = str5;
        this.orientation = orientation;
        this.showHeader = z10;
        this.showActionBar = z11;
        this.keepScreenOn = z12;
        this.showCameraCutout = z13;
        this.desktopMode = z14;
        this.webViewSettingsJson = webViewSettingsJson;
        this.keystoreId = l10;
        this.outputFormat = outputFormat;
        this.buildMode = buildMode;
        this.showWatermark = z15;
        this.autoIncrementVersionCode = z16;
        this.deepLinkScheme = str6;
        this.billingEnabled = z17;
        this.billingProductId = str7;
        this.billingSubscriptionId = str8;
        this.billingType = str9;
        this.billingTestMode = z18;
        this.billingAutoConsume = z19;
        this.billingAcknowledge = z20;
        this.billingEnablePendingPurchases = z21;
        this.billingSubscriptionPeriod = str10;
        this.billingFreeTrialDays = i13;
        this.billingIntroductoryPrice = str11;
        this.billingProductName = str12;
        this.billingProductDescription = str13;
        this.admobEnabled = z22;
        this.admobAppId = str14;
        this.admobBannerUnitId = str15;
        this.admobInterstitialUnitId = str16;
        this.admobRewardedUnitId = str17;
        this.admobBannerPosition = str18;
        this.admobShowBannerOnStart = z23;
        this.admobTestDeviceIds = str19;
        this.admobAutoLoadInterstitial = z24;
        this.admobAutoLoadRewarded = z25;
        this.admobUseTestAds = z26;
        this.admobBannerEnabled = z27;
        this.admobInterstitialEnabled = z28;
        this.admobRewardedEnabled = z29;
        this.admobInterstitialIntervalSeconds = i14;
        this.admobInterstitialPageCount = i15;
        this.admobChildDirectedTreatment = i16;
        this.admobUnderAgeOfConsent = i17;
        this.admobMaxAdContentRating = admobMaxAdContentRating;
        this.umpDebugEnabled = z30;
        this.umpDebugGeography = umpDebugGeography;
        this.umpTestDeviceIds = str20;
        this.kind = kind;
        this.folderId = l11;
        this.createdAt = j11;
        this.updatedAt = j12;
    }

    public static /* synthetic */ ProjectEntity copy$default(ProjectEntity projectEntity, long j10, String str, String str2, String str3, int i10, String str4, int i11, int i12, Integer num, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str13, Long l10, String str14, String str15, boolean z15, boolean z16, String str16, boolean z17, String str17, String str18, String str19, boolean z18, boolean z19, boolean z20, boolean z21, String str20, int i13, String str21, String str22, String str23, boolean z22, String str24, String str25, String str26, String str27, String str28, boolean z23, String str29, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, int i14, int i15, int i16, int i17, String str30, boolean z30, String str31, String str32, String str33, Long l11, long j11, long j12, int i18, int i19, int i20, Object obj) {
        long j13;
        long j14;
        boolean z31;
        boolean z32;
        boolean z33;
        boolean z34;
        boolean z35;
        boolean z36;
        int i21;
        int i22;
        int i23;
        int i24;
        String str34;
        boolean z37;
        String str35;
        String str36;
        String str37;
        Long l12;
        boolean z38;
        boolean z39;
        boolean z40;
        String str38;
        int i25;
        String str39;
        String str40;
        String str41;
        boolean z41;
        String str42;
        String str43;
        String str44;
        String str45;
        String str46;
        boolean z42;
        String str47;
        boolean z43;
        boolean z44;
        boolean z45;
        boolean z46;
        String str48;
        Long l13;
        String str49;
        String str50;
        boolean z47;
        boolean z48;
        String str51;
        boolean z49;
        String str52;
        String str53;
        String str54;
        boolean z50;
        String str55;
        String str56;
        String str57;
        String str58;
        int i26;
        String str59;
        int i27;
        int i28;
        Integer num2;
        String str60;
        String str61;
        String str62;
        String str63;
        String str64;
        String str65;
        boolean z51;
        ProjectEntity projectEntity2;
        String str66;
        long j15 = (i18 & 1) != 0 ? projectEntity.f5742id : j10;
        String str67 = (i18 & 2) != 0 ? projectEntity.name : str;
        String str68 = (i18 & 4) != 0 ? projectEntity.appName : str2;
        String str69 = (i18 & 8) != 0 ? projectEntity.packageName : str3;
        int i29 = (i18 & 16) != 0 ? projectEntity.versionCode : i10;
        String str70 = (i18 & 32) != 0 ? projectEntity.versionName : str4;
        int i30 = (i18 & 64) != 0 ? projectEntity.minSdk : i11;
        int i31 = (i18 & 128) != 0 ? projectEntity.targetSdk : i12;
        Integer num3 = (i18 & 256) != 0 ? projectEntity.maxSdk : num;
        String str71 = (i18 & 512) != 0 ? projectEntity.contentSourceType : str5;
        String str72 = (i18 & 1024) != 0 ? projectEntity.sourcePath : str6;
        String str73 = (i18 & 2048) != 0 ? projectEntity.sourceUrl : str7;
        long j16 = j15;
        String str74 = (i18 & 4096) != 0 ? projectEntity.permissionsJson : str8;
        String str75 = (i18 & 8192) != 0 ? projectEntity.iconPath : str9;
        String str76 = str74;
        String str77 = (i18 & 16384) != 0 ? projectEntity.splashPath : str10;
        String str78 = (i18 & 32768) != 0 ? projectEntity.primaryColor : str11;
        String str79 = (i18 & 65536) != 0 ? projectEntity.orientation : str12;
        boolean z52 = (i18 & 131072) != 0 ? projectEntity.showHeader : z10;
        boolean z53 = (i18 & PKIFailureInfo.transactionIdInUse) != 0 ? projectEntity.showActionBar : z11;
        boolean z54 = (i18 & PKIFailureInfo.signerNotTrusted) != 0 ? projectEntity.keepScreenOn : z12;
        boolean z55 = (i18 & PKIFailureInfo.badCertTemplate) != 0 ? projectEntity.showCameraCutout : z13;
        boolean z56 = (i18 & PKIFailureInfo.badSenderNonce) != 0 ? projectEntity.desktopMode : z14;
        String str80 = (i18 & 4194304) != 0 ? projectEntity.webViewSettingsJson : str13;
        Long l14 = (i18 & 8388608) != 0 ? projectEntity.keystoreId : l10;
        String str81 = (i18 & 16777216) != 0 ? projectEntity.outputFormat : str14;
        String str82 = (i18 & 33554432) != 0 ? projectEntity.buildMode : str15;
        boolean z57 = (i18 & 67108864) != 0 ? projectEntity.showWatermark : z15;
        boolean z58 = (i18 & 134217728) != 0 ? projectEntity.autoIncrementVersionCode : z16;
        String str83 = (i18 & 268435456) != 0 ? projectEntity.deepLinkScheme : str16;
        boolean z59 = (i18 & PKIFailureInfo.duplicateCertReq) != 0 ? projectEntity.billingEnabled : z17;
        String str84 = (i18 & 1073741824) != 0 ? projectEntity.billingProductId : str17;
        String str85 = (i18 & PKIFailureInfo.systemUnavail) != 0 ? projectEntity.billingSubscriptionId : str18;
        String str86 = (i19 & 1) != 0 ? projectEntity.billingType : str19;
        boolean z60 = (i19 & 2) != 0 ? projectEntity.billingTestMode : z18;
        boolean z61 = (i19 & 4) != 0 ? projectEntity.billingAutoConsume : z19;
        boolean z62 = (i19 & 8) != 0 ? projectEntity.billingAcknowledge : z20;
        boolean z63 = (i19 & 16) != 0 ? projectEntity.billingEnablePendingPurchases : z21;
        String str87 = (i19 & 32) != 0 ? projectEntity.billingSubscriptionPeriod : str20;
        int i32 = (i19 & 64) != 0 ? projectEntity.billingFreeTrialDays : i13;
        String str88 = (i19 & 128) != 0 ? projectEntity.billingIntroductoryPrice : str21;
        String str89 = (i19 & 256) != 0 ? projectEntity.billingProductName : str22;
        String str90 = (i19 & 512) != 0 ? projectEntity.billingProductDescription : str23;
        boolean z64 = (i19 & 1024) != 0 ? projectEntity.admobEnabled : z22;
        String str91 = (i19 & 2048) != 0 ? projectEntity.admobAppId : str24;
        String str92 = (i19 & 4096) != 0 ? projectEntity.admobBannerUnitId : str25;
        String str93 = (i19 & 8192) != 0 ? projectEntity.admobInterstitialUnitId : str26;
        String str94 = (i19 & 16384) != 0 ? projectEntity.admobRewardedUnitId : str27;
        String str95 = (i19 & 32768) != 0 ? projectEntity.admobBannerPosition : str28;
        boolean z65 = (i19 & 65536) != 0 ? projectEntity.admobShowBannerOnStart : z23;
        String str96 = (i19 & 131072) != 0 ? projectEntity.admobTestDeviceIds : str29;
        boolean z66 = (i19 & PKIFailureInfo.transactionIdInUse) != 0 ? projectEntity.admobAutoLoadInterstitial : z24;
        boolean z67 = (i19 & PKIFailureInfo.signerNotTrusted) != 0 ? projectEntity.admobAutoLoadRewarded : z25;
        boolean z68 = (i19 & PKIFailureInfo.badCertTemplate) != 0 ? projectEntity.admobUseTestAds : z26;
        boolean z69 = (i19 & PKIFailureInfo.badSenderNonce) != 0 ? projectEntity.admobBannerEnabled : z27;
        boolean z70 = (i19 & 4194304) != 0 ? projectEntity.admobInterstitialEnabled : z28;
        boolean z71 = (i19 & 8388608) != 0 ? projectEntity.admobRewardedEnabled : z29;
        int i33 = (i19 & 16777216) != 0 ? projectEntity.admobInterstitialIntervalSeconds : i14;
        int i34 = (i19 & 33554432) != 0 ? projectEntity.admobInterstitialPageCount : i15;
        int i35 = (i19 & 67108864) != 0 ? projectEntity.admobChildDirectedTreatment : i16;
        int i36 = (i19 & 134217728) != 0 ? projectEntity.admobUnderAgeOfConsent : i17;
        String str97 = (i19 & 268435456) != 0 ? projectEntity.admobMaxAdContentRating : str30;
        boolean z72 = (i19 & PKIFailureInfo.duplicateCertReq) != 0 ? projectEntity.umpDebugEnabled : z30;
        String str98 = (i19 & 1073741824) != 0 ? projectEntity.umpDebugGeography : str31;
        String str99 = (i19 & PKIFailureInfo.systemUnavail) != 0 ? projectEntity.umpTestDeviceIds : str32;
        String str100 = str98;
        String str101 = (i20 & 1) != 0 ? projectEntity.kind : str33;
        Long l15 = (i20 & 2) != 0 ? projectEntity.folderId : l11;
        String str102 = str99;
        long j17 = (i20 & 4) != 0 ? projectEntity.createdAt : j11;
        if ((i20 & 8) != 0) {
            j14 = j17;
            j13 = projectEntity.updatedAt;
            z33 = z68;
            z34 = z69;
            z35 = z70;
            z36 = z71;
            i21 = i33;
            i22 = i34;
            i23 = i35;
            i24 = i36;
            str34 = str97;
            z37 = z72;
            str35 = str100;
            str36 = str101;
            str37 = str102;
            l12 = l15;
            z40 = z63;
            str38 = str87;
            i25 = i32;
            str39 = str88;
            str40 = str89;
            str41 = str90;
            z41 = z64;
            str42 = str91;
            str43 = str92;
            str44 = str93;
            str45 = str94;
            str46 = str95;
            z42 = z65;
            str47 = str96;
            z31 = z66;
            z32 = z67;
            z45 = z55;
            z46 = z56;
            str48 = str80;
            l13 = l14;
            str49 = str81;
            str50 = str82;
            z47 = z57;
            z48 = z58;
            str51 = str83;
            z49 = z59;
            str52 = str84;
            str53 = str85;
            str54 = str86;
            z50 = z60;
            z38 = z61;
            z39 = z62;
            str55 = str77;
            str56 = str75;
            i26 = i29;
            str59 = str70;
            i27 = i30;
            i28 = i31;
            num2 = num3;
            str60 = str71;
            str61 = str72;
            str62 = str73;
            str63 = str76;
            str64 = str78;
            str65 = str79;
            z51 = z52;
            z43 = z53;
            z44 = z54;
            projectEntity2 = projectEntity;
            str66 = str67;
            str57 = str68;
            str58 = str69;
        } else {
            j13 = j12;
            j14 = j17;
            z31 = z66;
            z32 = z67;
            z33 = z68;
            z34 = z69;
            z35 = z70;
            z36 = z71;
            i21 = i33;
            i22 = i34;
            i23 = i35;
            i24 = i36;
            str34 = str97;
            z37 = z72;
            str35 = str100;
            str36 = str101;
            str37 = str102;
            l12 = l15;
            z38 = z61;
            z39 = z62;
            z40 = z63;
            str38 = str87;
            i25 = i32;
            str39 = str88;
            str40 = str89;
            str41 = str90;
            z41 = z64;
            str42 = str91;
            str43 = str92;
            str44 = str93;
            str45 = str94;
            str46 = str95;
            z42 = z65;
            str47 = str96;
            z43 = z53;
            z44 = z54;
            z45 = z55;
            z46 = z56;
            str48 = str80;
            l13 = l14;
            str49 = str81;
            str50 = str82;
            z47 = z57;
            z48 = z58;
            str51 = str83;
            z49 = z59;
            str52 = str84;
            str53 = str85;
            str54 = str86;
            z50 = z60;
            str55 = str77;
            str56 = str75;
            str57 = str68;
            str58 = str69;
            i26 = i29;
            str59 = str70;
            i27 = i30;
            i28 = i31;
            num2 = num3;
            str60 = str71;
            str61 = str72;
            str62 = str73;
            str63 = str76;
            str64 = str78;
            str65 = str79;
            z51 = z52;
            projectEntity2 = projectEntity;
            str66 = str67;
        }
        return projectEntity2.copy(j16, str66, str57, str58, i26, str59, i27, i28, num2, str60, str61, str62, str63, str56, str55, str64, str65, z51, z43, z44, z45, z46, str48, l13, str49, str50, z47, z48, str51, z49, str52, str53, str54, z50, z38, z39, z40, str38, i25, str39, str40, str41, z41, str42, str43, str44, str45, str46, z42, str47, z31, z32, z33, z34, z35, z36, i21, i22, i23, i24, str34, z37, str35, str37, str36, l12, j14, j13);
    }

    public final long component1() {
        return this.f5742id;
    }

    public final String component10() {
        return this.contentSourceType;
    }

    public final String component11() {
        return this.sourcePath;
    }

    public final String component12() {
        return this.sourceUrl;
    }

    public final String component13() {
        return this.permissionsJson;
    }

    public final String component14() {
        return this.iconPath;
    }

    public final String component15() {
        return this.splashPath;
    }

    public final String component16() {
        return this.primaryColor;
    }

    public final String component17() {
        return this.orientation;
    }

    public final boolean component18() {
        return this.showHeader;
    }

    public final boolean component19() {
        return this.showActionBar;
    }

    public final String component2() {
        return this.name;
    }

    public final boolean component20() {
        return this.keepScreenOn;
    }

    public final boolean component21() {
        return this.showCameraCutout;
    }

    public final boolean component22() {
        return this.desktopMode;
    }

    public final String component23() {
        return this.webViewSettingsJson;
    }

    public final Long component24() {
        return this.keystoreId;
    }

    public final String component25() {
        return this.outputFormat;
    }

    public final String component26() {
        return this.buildMode;
    }

    public final boolean component27() {
        return this.showWatermark;
    }

    public final boolean component28() {
        return this.autoIncrementVersionCode;
    }

    public final String component29() {
        return this.deepLinkScheme;
    }

    public final String component3() {
        return this.appName;
    }

    public final boolean component30() {
        return this.billingEnabled;
    }

    public final String component31() {
        return this.billingProductId;
    }

    public final String component32() {
        return this.billingSubscriptionId;
    }

    public final String component33() {
        return this.billingType;
    }

    public final boolean component34() {
        return this.billingTestMode;
    }

    public final boolean component35() {
        return this.billingAutoConsume;
    }

    public final boolean component36() {
        return this.billingAcknowledge;
    }

    public final boolean component37() {
        return this.billingEnablePendingPurchases;
    }

    public final String component38() {
        return this.billingSubscriptionPeriod;
    }

    public final int component39() {
        return this.billingFreeTrialDays;
    }

    public final String component4() {
        return this.packageName;
    }

    public final String component40() {
        return this.billingIntroductoryPrice;
    }

    public final String component41() {
        return this.billingProductName;
    }

    public final String component42() {
        return this.billingProductDescription;
    }

    public final boolean component43() {
        return this.admobEnabled;
    }

    public final String component44() {
        return this.admobAppId;
    }

    public final String component45() {
        return this.admobBannerUnitId;
    }

    public final String component46() {
        return this.admobInterstitialUnitId;
    }

    public final String component47() {
        return this.admobRewardedUnitId;
    }

    public final String component48() {
        return this.admobBannerPosition;
    }

    public final boolean component49() {
        return this.admobShowBannerOnStart;
    }

    public final int component5() {
        return this.versionCode;
    }

    public final String component50() {
        return this.admobTestDeviceIds;
    }

    public final boolean component51() {
        return this.admobAutoLoadInterstitial;
    }

    public final boolean component52() {
        return this.admobAutoLoadRewarded;
    }

    public final boolean component53() {
        return this.admobUseTestAds;
    }

    public final boolean component54() {
        return this.admobBannerEnabled;
    }

    public final boolean component55() {
        return this.admobInterstitialEnabled;
    }

    public final boolean component56() {
        return this.admobRewardedEnabled;
    }

    public final int component57() {
        return this.admobInterstitialIntervalSeconds;
    }

    public final int component58() {
        return this.admobInterstitialPageCount;
    }

    public final int component59() {
        return this.admobChildDirectedTreatment;
    }

    public final String component6() {
        return this.versionName;
    }

    public final int component60() {
        return this.admobUnderAgeOfConsent;
    }

    public final String component61() {
        return this.admobMaxAdContentRating;
    }

    public final boolean component62() {
        return this.umpDebugEnabled;
    }

    public final String component63() {
        return this.umpDebugGeography;
    }

    public final String component64() {
        return this.umpTestDeviceIds;
    }

    public final String component65() {
        return this.kind;
    }

    public final Long component66() {
        return this.folderId;
    }

    public final long component67() {
        return this.createdAt;
    }

    public final long component68() {
        return this.updatedAt;
    }

    public final int component7() {
        return this.minSdk;
    }

    public final int component8() {
        return this.targetSdk;
    }

    public final Integer component9() {
        return this.maxSdk;
    }

    public final ProjectEntity copy(long j10, String name, String appName, String packageName, int i10, String versionName, int i11, int i12, Integer num, String contentSourceType, String str, String str2, String permissionsJson, String str3, String str4, String str5, String orientation, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String webViewSettingsJson, Long l10, String outputFormat, String buildMode, boolean z15, boolean z16, String str6, boolean z17, String str7, String str8, String str9, boolean z18, boolean z19, boolean z20, boolean z21, String str10, int i13, String str11, String str12, String str13, boolean z22, String str14, String str15, String str16, String str17, String str18, boolean z23, String str19, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, int i14, int i15, int i16, int i17, String admobMaxAdContentRating, boolean z30, String umpDebugGeography, String str20, String kind, Long l11, long j11, long j12) {
        r.e(name, "name");
        r.e(appName, "appName");
        r.e(packageName, "packageName");
        r.e(versionName, "versionName");
        r.e(contentSourceType, "contentSourceType");
        r.e(permissionsJson, "permissionsJson");
        r.e(orientation, "orientation");
        r.e(webViewSettingsJson, "webViewSettingsJson");
        r.e(outputFormat, "outputFormat");
        r.e(buildMode, "buildMode");
        r.e(admobMaxAdContentRating, "admobMaxAdContentRating");
        r.e(umpDebugGeography, "umpDebugGeography");
        r.e(kind, "kind");
        return new ProjectEntity(j10, name, appName, packageName, i10, versionName, i11, i12, num, contentSourceType, str, str2, permissionsJson, str3, str4, str5, orientation, z10, z11, z12, z13, z14, webViewSettingsJson, l10, outputFormat, buildMode, z15, z16, str6, z17, str7, str8, str9, z18, z19, z20, z21, str10, i13, str11, str12, str13, z22, str14, str15, str16, str17, str18, z23, str19, z24, z25, z26, z27, z28, z29, i14, i15, i16, i17, admobMaxAdContentRating, z30, umpDebugGeography, str20, kind, l11, j11, j12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectEntity)) {
            return false;
        }
        ProjectEntity projectEntity = (ProjectEntity) obj;
        return this.f5742id == projectEntity.f5742id && r.a(this.name, projectEntity.name) && r.a(this.appName, projectEntity.appName) && r.a(this.packageName, projectEntity.packageName) && this.versionCode == projectEntity.versionCode && r.a(this.versionName, projectEntity.versionName) && this.minSdk == projectEntity.minSdk && this.targetSdk == projectEntity.targetSdk && r.a(this.maxSdk, projectEntity.maxSdk) && r.a(this.contentSourceType, projectEntity.contentSourceType) && r.a(this.sourcePath, projectEntity.sourcePath) && r.a(this.sourceUrl, projectEntity.sourceUrl) && r.a(this.permissionsJson, projectEntity.permissionsJson) && r.a(this.iconPath, projectEntity.iconPath) && r.a(this.splashPath, projectEntity.splashPath) && r.a(this.primaryColor, projectEntity.primaryColor) && r.a(this.orientation, projectEntity.orientation) && this.showHeader == projectEntity.showHeader && this.showActionBar == projectEntity.showActionBar && this.keepScreenOn == projectEntity.keepScreenOn && this.showCameraCutout == projectEntity.showCameraCutout && this.desktopMode == projectEntity.desktopMode && r.a(this.webViewSettingsJson, projectEntity.webViewSettingsJson) && r.a(this.keystoreId, projectEntity.keystoreId) && r.a(this.outputFormat, projectEntity.outputFormat) && r.a(this.buildMode, projectEntity.buildMode) && this.showWatermark == projectEntity.showWatermark && this.autoIncrementVersionCode == projectEntity.autoIncrementVersionCode && r.a(this.deepLinkScheme, projectEntity.deepLinkScheme) && this.billingEnabled == projectEntity.billingEnabled && r.a(this.billingProductId, projectEntity.billingProductId) && r.a(this.billingSubscriptionId, projectEntity.billingSubscriptionId) && r.a(this.billingType, projectEntity.billingType) && this.billingTestMode == projectEntity.billingTestMode && this.billingAutoConsume == projectEntity.billingAutoConsume && this.billingAcknowledge == projectEntity.billingAcknowledge && this.billingEnablePendingPurchases == projectEntity.billingEnablePendingPurchases && r.a(this.billingSubscriptionPeriod, projectEntity.billingSubscriptionPeriod) && this.billingFreeTrialDays == projectEntity.billingFreeTrialDays && r.a(this.billingIntroductoryPrice, projectEntity.billingIntroductoryPrice) && r.a(this.billingProductName, projectEntity.billingProductName) && r.a(this.billingProductDescription, projectEntity.billingProductDescription) && this.admobEnabled == projectEntity.admobEnabled && r.a(this.admobAppId, projectEntity.admobAppId) && r.a(this.admobBannerUnitId, projectEntity.admobBannerUnitId) && r.a(this.admobInterstitialUnitId, projectEntity.admobInterstitialUnitId) && r.a(this.admobRewardedUnitId, projectEntity.admobRewardedUnitId) && r.a(this.admobBannerPosition, projectEntity.admobBannerPosition) && this.admobShowBannerOnStart == projectEntity.admobShowBannerOnStart && r.a(this.admobTestDeviceIds, projectEntity.admobTestDeviceIds) && this.admobAutoLoadInterstitial == projectEntity.admobAutoLoadInterstitial && this.admobAutoLoadRewarded == projectEntity.admobAutoLoadRewarded && this.admobUseTestAds == projectEntity.admobUseTestAds && this.admobBannerEnabled == projectEntity.admobBannerEnabled && this.admobInterstitialEnabled == projectEntity.admobInterstitialEnabled && this.admobRewardedEnabled == projectEntity.admobRewardedEnabled && this.admobInterstitialIntervalSeconds == projectEntity.admobInterstitialIntervalSeconds && this.admobInterstitialPageCount == projectEntity.admobInterstitialPageCount && this.admobChildDirectedTreatment == projectEntity.admobChildDirectedTreatment && this.admobUnderAgeOfConsent == projectEntity.admobUnderAgeOfConsent && r.a(this.admobMaxAdContentRating, projectEntity.admobMaxAdContentRating) && this.umpDebugEnabled == projectEntity.umpDebugEnabled && r.a(this.umpDebugGeography, projectEntity.umpDebugGeography) && r.a(this.umpTestDeviceIds, projectEntity.umpTestDeviceIds) && r.a(this.kind, projectEntity.kind) && r.a(this.folderId, projectEntity.folderId) && this.createdAt == projectEntity.createdAt && this.updatedAt == projectEntity.updatedAt;
    }

    public final String getAdmobAppId() {
        return this.admobAppId;
    }

    public final boolean getAdmobAutoLoadInterstitial() {
        return this.admobAutoLoadInterstitial;
    }

    public final boolean getAdmobAutoLoadRewarded() {
        return this.admobAutoLoadRewarded;
    }

    public final boolean getAdmobBannerEnabled() {
        return this.admobBannerEnabled;
    }

    public final String getAdmobBannerPosition() {
        return this.admobBannerPosition;
    }

    public final String getAdmobBannerUnitId() {
        return this.admobBannerUnitId;
    }

    public final int getAdmobChildDirectedTreatment() {
        return this.admobChildDirectedTreatment;
    }

    public final boolean getAdmobEnabled() {
        return this.admobEnabled;
    }

    public final boolean getAdmobInterstitialEnabled() {
        return this.admobInterstitialEnabled;
    }

    public final int getAdmobInterstitialIntervalSeconds() {
        return this.admobInterstitialIntervalSeconds;
    }

    public final int getAdmobInterstitialPageCount() {
        return this.admobInterstitialPageCount;
    }

    public final String getAdmobInterstitialUnitId() {
        return this.admobInterstitialUnitId;
    }

    public final String getAdmobMaxAdContentRating() {
        return this.admobMaxAdContentRating;
    }

    public final boolean getAdmobRewardedEnabled() {
        return this.admobRewardedEnabled;
    }

    public final String getAdmobRewardedUnitId() {
        return this.admobRewardedUnitId;
    }

    public final boolean getAdmobShowBannerOnStart() {
        return this.admobShowBannerOnStart;
    }

    public final String getAdmobTestDeviceIds() {
        return this.admobTestDeviceIds;
    }

    public final int getAdmobUnderAgeOfConsent() {
        return this.admobUnderAgeOfConsent;
    }

    public final boolean getAdmobUseTestAds() {
        return this.admobUseTestAds;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final boolean getAutoIncrementVersionCode() {
        return this.autoIncrementVersionCode;
    }

    public final boolean getBillingAcknowledge() {
        return this.billingAcknowledge;
    }

    public final boolean getBillingAutoConsume() {
        return this.billingAutoConsume;
    }

    public final boolean getBillingEnablePendingPurchases() {
        return this.billingEnablePendingPurchases;
    }

    public final boolean getBillingEnabled() {
        return this.billingEnabled;
    }

    public final int getBillingFreeTrialDays() {
        return this.billingFreeTrialDays;
    }

    public final String getBillingIntroductoryPrice() {
        return this.billingIntroductoryPrice;
    }

    public final String getBillingProductDescription() {
        return this.billingProductDescription;
    }

    public final String getBillingProductId() {
        return this.billingProductId;
    }

    public final String getBillingProductName() {
        return this.billingProductName;
    }

    public final String getBillingSubscriptionId() {
        return this.billingSubscriptionId;
    }

    public final String getBillingSubscriptionPeriod() {
        return this.billingSubscriptionPeriod;
    }

    public final boolean getBillingTestMode() {
        return this.billingTestMode;
    }

    public final String getBillingType() {
        return this.billingType;
    }

    public final String getBuildMode() {
        return this.buildMode;
    }

    public final String getContentSourceType() {
        return this.contentSourceType;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getDeepLinkScheme() {
        return this.deepLinkScheme;
    }

    public final boolean getDesktopMode() {
        return this.desktopMode;
    }

    public final Long getFolderId() {
        return this.folderId;
    }

    public final String getIconPath() {
        return this.iconPath;
    }

    public final long getId() {
        return this.f5742id;
    }

    public final boolean getKeepScreenOn() {
        return this.keepScreenOn;
    }

    public final Long getKeystoreId() {
        return this.keystoreId;
    }

    public final String getKind() {
        return this.kind;
    }

    public final Integer getMaxSdk() {
        return this.maxSdk;
    }

    public final int getMinSdk() {
        return this.minSdk;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOrientation() {
        return this.orientation;
    }

    public final String getOutputFormat() {
        return this.outputFormat;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPermissionsJson() {
        return this.permissionsJson;
    }

    public final String getPrimaryColor() {
        return this.primaryColor;
    }

    public final boolean getShowActionBar() {
        return this.showActionBar;
    }

    public final boolean getShowCameraCutout() {
        return this.showCameraCutout;
    }

    public final boolean getShowHeader() {
        return this.showHeader;
    }

    public final boolean getShowWatermark() {
        return this.showWatermark;
    }

    public final String getSourcePath() {
        return this.sourcePath;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public final String getSplashPath() {
        return this.splashPath;
    }

    public final int getTargetSdk() {
        return this.targetSdk;
    }

    public final boolean getUmpDebugEnabled() {
        return this.umpDebugEnabled;
    }

    public final String getUmpDebugGeography() {
        return this.umpDebugGeography;
    }

    public final String getUmpTestDeviceIds() {
        return this.umpTestDeviceIds;
    }

    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public final String getWebViewSettingsJson() {
        return this.webViewSettingsJson;
    }

    public int hashCode() {
        int iA = a1.a(this.targetSdk, a1.a(this.minSdk, k.a(a1.a(this.versionCode, k.a(k.a(k.a(Long.hashCode(this.f5742id) * 31, 31, this.name), 31, this.appName), 31, this.packageName), 31), 31, this.versionName), 31), 31);
        Integer num = this.maxSdk;
        int iA2 = k.a((iA + (num == null ? 0 : num.hashCode())) * 31, 31, this.contentSourceType);
        String str = this.sourcePath;
        int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sourceUrl;
        int iA3 = k.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.permissionsJson);
        String str3 = this.iconPath;
        int iHashCode2 = (iA3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.splashPath;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.primaryColor;
        int iA4 = k.a(o2.a(o2.a(o2.a(o2.a(o2.a(k.a((iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.orientation), 31, this.showHeader), 31, this.showActionBar), 31, this.keepScreenOn), 31, this.showCameraCutout), 31, this.desktopMode), 31, this.webViewSettingsJson);
        Long l10 = this.keystoreId;
        int iA5 = o2.a(o2.a(k.a(k.a((iA4 + (l10 == null ? 0 : l10.hashCode())) * 31, 31, this.outputFormat), 31, this.buildMode), 31, this.showWatermark), 31, this.autoIncrementVersionCode);
        String str6 = this.deepLinkScheme;
        int iA6 = o2.a((iA5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.billingEnabled);
        String str7 = this.billingProductId;
        int iHashCode4 = (iA6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.billingSubscriptionId;
        int iHashCode5 = (iHashCode4 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.billingType;
        int iA7 = o2.a(o2.a(o2.a(o2.a((iHashCode5 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.billingTestMode), 31, this.billingAutoConsume), 31, this.billingAcknowledge), 31, this.billingEnablePendingPurchases);
        String str10 = this.billingSubscriptionPeriod;
        int iA8 = a1.a(this.billingFreeTrialDays, (iA7 + (str10 == null ? 0 : str10.hashCode())) * 31, 31);
        String str11 = this.billingIntroductoryPrice;
        int iHashCode6 = (iA8 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.billingProductName;
        int iHashCode7 = (iHashCode6 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.billingProductDescription;
        int iA9 = o2.a((iHashCode7 + (str13 == null ? 0 : str13.hashCode())) * 31, 31, this.admobEnabled);
        String str14 = this.admobAppId;
        int iHashCode8 = (iA9 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.admobBannerUnitId;
        int iHashCode9 = (iHashCode8 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.admobInterstitialUnitId;
        int iHashCode10 = (iHashCode9 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.admobRewardedUnitId;
        int iHashCode11 = (iHashCode10 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.admobBannerPosition;
        int iA10 = o2.a((iHashCode11 + (str18 == null ? 0 : str18.hashCode())) * 31, 31, this.admobShowBannerOnStart);
        String str19 = this.admobTestDeviceIds;
        int iA11 = k.a(o2.a(k.a(a1.a(this.admobUnderAgeOfConsent, a1.a(this.admobChildDirectedTreatment, a1.a(this.admobInterstitialPageCount, a1.a(this.admobInterstitialIntervalSeconds, o2.a(o2.a(o2.a(o2.a(o2.a(o2.a((iA10 + (str19 == null ? 0 : str19.hashCode())) * 31, 31, this.admobAutoLoadInterstitial), 31, this.admobAutoLoadRewarded), 31, this.admobUseTestAds), 31, this.admobBannerEnabled), 31, this.admobInterstitialEnabled), 31, this.admobRewardedEnabled), 31), 31), 31), 31), 31, this.admobMaxAdContentRating), 31, this.umpDebugEnabled), 31, this.umpDebugGeography);
        String str20 = this.umpTestDeviceIds;
        int iA12 = k.a((iA11 + (str20 == null ? 0 : str20.hashCode())) * 31, 31, this.kind);
        Long l11 = this.folderId;
        return Long.hashCode(this.updatedAt) + e2.a((iA12 + (l11 != null ? l11.hashCode() : 0)) * 31, 31, this.createdAt);
    }

    public String toString() {
        long j10 = this.f5742id;
        String str = this.name;
        String str2 = this.appName;
        String str3 = this.packageName;
        int i10 = this.versionCode;
        String str4 = this.versionName;
        int i11 = this.minSdk;
        int i12 = this.targetSdk;
        Integer num = this.maxSdk;
        String str5 = this.contentSourceType;
        String str6 = this.sourcePath;
        String str7 = this.sourceUrl;
        String str8 = this.permissionsJson;
        String str9 = this.iconPath;
        String str10 = this.splashPath;
        String str11 = this.primaryColor;
        String str12 = this.orientation;
        boolean z10 = this.showHeader;
        boolean z11 = this.showActionBar;
        boolean z12 = this.keepScreenOn;
        boolean z13 = this.showCameraCutout;
        boolean z14 = this.desktopMode;
        String str13 = this.webViewSettingsJson;
        Long l10 = this.keystoreId;
        String str14 = this.outputFormat;
        String str15 = this.buildMode;
        boolean z15 = this.showWatermark;
        boolean z16 = this.autoIncrementVersionCode;
        String str16 = this.deepLinkScheme;
        boolean z17 = this.billingEnabled;
        String str17 = this.billingProductId;
        String str18 = this.billingSubscriptionId;
        String str19 = this.billingType;
        boolean z18 = this.billingTestMode;
        boolean z19 = this.billingAutoConsume;
        boolean z20 = this.billingAcknowledge;
        boolean z21 = this.billingEnablePendingPurchases;
        String str20 = this.billingSubscriptionPeriod;
        int i13 = this.billingFreeTrialDays;
        String str21 = this.billingIntroductoryPrice;
        String str22 = this.billingProductName;
        String str23 = this.billingProductDescription;
        boolean z22 = this.admobEnabled;
        String str24 = this.admobAppId;
        String str25 = this.admobBannerUnitId;
        String str26 = this.admobInterstitialUnitId;
        String str27 = this.admobRewardedUnitId;
        String str28 = this.admobBannerPosition;
        boolean z23 = this.admobShowBannerOnStart;
        String str29 = this.admobTestDeviceIds;
        boolean z24 = this.admobAutoLoadInterstitial;
        boolean z25 = this.admobAutoLoadRewarded;
        boolean z26 = this.admobUseTestAds;
        boolean z27 = this.admobBannerEnabled;
        boolean z28 = this.admobInterstitialEnabled;
        boolean z29 = this.admobRewardedEnabled;
        int i14 = this.admobInterstitialIntervalSeconds;
        int i15 = this.admobInterstitialPageCount;
        int i16 = this.admobChildDirectedTreatment;
        int i17 = this.admobUnderAgeOfConsent;
        String str30 = this.admobMaxAdContentRating;
        boolean z30 = this.umpDebugEnabled;
        String str31 = this.umpDebugGeography;
        String str32 = this.umpTestDeviceIds;
        String str33 = this.kind;
        Long l11 = this.folderId;
        long j11 = this.createdAt;
        long j12 = this.updatedAt;
        StringBuilder sb = new StringBuilder("ProjectEntity(id=");
        sb.append(j10);
        sb.append(", name=");
        sb.append(str);
        z0.a(sb, ", appName=", str2, ", packageName=", str3);
        sb.append(", versionCode=");
        sb.append(i10);
        sb.append(", versionName=");
        sb.append(str4);
        sb.append(", minSdk=");
        sb.append(i11);
        sb.append(", targetSdk=");
        sb.append(i12);
        sb.append(", maxSdk=");
        sb.append(num);
        sb.append(", contentSourceType=");
        sb.append(str5);
        z0.a(sb, ", sourcePath=", str6, ", sourceUrl=", str7);
        z0.a(sb, ", permissionsJson=", str8, ", iconPath=", str9);
        z0.a(sb, ", splashPath=", str10, ", primaryColor=", str11);
        sb.append(", orientation=");
        sb.append(str12);
        sb.append(", showHeader=");
        sb.append(z10);
        sb.append(", showActionBar=");
        sb.append(z11);
        sb.append(", keepScreenOn=");
        sb.append(z12);
        sb.append(", showCameraCutout=");
        sb.append(z13);
        sb.append(", desktopMode=");
        sb.append(z14);
        sb.append(", webViewSettingsJson=");
        sb.append(str13);
        sb.append(", keystoreId=");
        sb.append(l10);
        z0.a(sb, ", outputFormat=", str14, ", buildMode=", str15);
        sb.append(", showWatermark=");
        sb.append(z15);
        sb.append(", autoIncrementVersionCode=");
        sb.append(z16);
        sb.append(", deepLinkScheme=");
        sb.append(str16);
        sb.append(", billingEnabled=");
        sb.append(z17);
        z0.a(sb, ", billingProductId=", str17, ", billingSubscriptionId=", str18);
        sb.append(", billingType=");
        sb.append(str19);
        sb.append(", billingTestMode=");
        sb.append(z18);
        sb.append(", billingAutoConsume=");
        sb.append(z19);
        sb.append(", billingAcknowledge=");
        sb.append(z20);
        sb.append(", billingEnablePendingPurchases=");
        sb.append(z21);
        sb.append(", billingSubscriptionPeriod=");
        sb.append(str20);
        sb.append(", billingFreeTrialDays=");
        sb.append(i13);
        sb.append(", billingIntroductoryPrice=");
        sb.append(str21);
        z0.a(sb, ", billingProductName=", str22, ", billingProductDescription=", str23);
        sb.append(", admobEnabled=");
        sb.append(z22);
        sb.append(", admobAppId=");
        sb.append(str24);
        z0.a(sb, ", admobBannerUnitId=", str25, ", admobInterstitialUnitId=", str26);
        z0.a(sb, ", admobRewardedUnitId=", str27, ", admobBannerPosition=", str28);
        sb.append(", admobShowBannerOnStart=");
        sb.append(z23);
        sb.append(", admobTestDeviceIds=");
        sb.append(str29);
        sb.append(", admobAutoLoadInterstitial=");
        sb.append(z24);
        sb.append(", admobAutoLoadRewarded=");
        sb.append(z25);
        sb.append(", admobUseTestAds=");
        sb.append(z26);
        sb.append(", admobBannerEnabled=");
        sb.append(z27);
        sb.append(", admobInterstitialEnabled=");
        sb.append(z28);
        sb.append(", admobRewardedEnabled=");
        sb.append(z29);
        sb.append(", admobInterstitialIntervalSeconds=");
        sb.append(i14);
        sb.append(", admobInterstitialPageCount=");
        sb.append(i15);
        sb.append(", admobChildDirectedTreatment=");
        sb.append(i16);
        sb.append(", admobUnderAgeOfConsent=");
        sb.append(i17);
        sb.append(", admobMaxAdContentRating=");
        sb.append(str30);
        sb.append(", umpDebugEnabled=");
        sb.append(z30);
        z0.a(sb, ", umpDebugGeography=", str31, ", umpTestDeviceIds=", str32);
        sb.append(", kind=");
        sb.append(str33);
        sb.append(", folderId=");
        sb.append(l11);
        sb.append(", createdAt=");
        sb.append(j11);
        sb.append(", updatedAt=");
        return a.a(j12, ")", sb);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProjectEntity(long j10, String str, String str2, String str3, int i10, String str4, int i11, int i12, Integer num, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str13, Long l10, String str14, String str15, boolean z15, boolean z16, String str16, boolean z17, String str17, String str18, String str19, boolean z18, boolean z19, boolean z20, boolean z21, String str20, int i13, String str21, String str22, String str23, boolean z22, String str24, String str25, String str26, String str27, String str28, boolean z23, String str29, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, int i14, int i15, int i16, int i17, String str30, boolean z30, String str31, String str32, String str33, Long l11, long j11, long j12, int i18, int i19, int i20, j jVar) {
        long jCurrentTimeMillis;
        String str34;
        String str35;
        int i21;
        String str36;
        int i22;
        int i23;
        String str37;
        Long l12;
        String str38;
        String str39;
        boolean z31;
        boolean z32;
        String str40;
        boolean z33;
        String str41;
        String str42;
        boolean z34;
        boolean z35;
        boolean z36;
        String str43;
        int i24;
        long j13 = (i18 & 1) != 0 ? 0L : j10;
        Integer num2 = (i18 & 256) != 0 ? null : num;
        String str44 = (i18 & 1024) != 0 ? null : str6;
        String str45 = (i18 & 2048) != 0 ? null : str7;
        String str46 = (i18 & 4096) != 0 ? "[]" : str8;
        String str47 = (i18 & 8192) != 0 ? null : str9;
        String str48 = (i18 & 16384) != 0 ? null : str10;
        String str49 = (i18 & 32768) != 0 ? null : str11;
        String str50 = (i18 & 65536) != 0 ? "portrait" : str12;
        boolean z37 = (i18 & 131072) != 0 ? true : z10;
        boolean z38 = (i18 & PKIFailureInfo.transactionIdInUse) != 0 ? false : z11;
        boolean z39 = (i18 & PKIFailureInfo.signerNotTrusted) != 0 ? false : z12;
        boolean z40 = (i18 & PKIFailureInfo.badCertTemplate) != 0 ? false : z13;
        boolean z41 = (i18 & PKIFailureInfo.badSenderNonce) != 0 ? false : z14;
        String str51 = (i18 & 4194304) != 0 ? "{}" : str13;
        Long l13 = (i18 & 8388608) != 0 ? null : l10;
        String str52 = (i18 & 16777216) != 0 ? ProjectKind.APK : str14;
        String str53 = (i18 & 33554432) != 0 ? "advanced" : str15;
        boolean z42 = (i18 & 67108864) != 0 ? false : z15;
        boolean z43 = (i18 & 134217728) != 0 ? false : z16;
        String str54 = (i18 & 268435456) != 0 ? null : str16;
        boolean z44 = (i18 & PKIFailureInfo.duplicateCertReq) != 0 ? false : z17;
        String str55 = (i18 & 1073741824) != 0 ? null : str17;
        String str56 = (i18 & PKIFailureInfo.systemUnavail) != 0 ? null : str18;
        String str57 = (i19 & 1) != 0 ? "non_consumable" : str19;
        boolean z45 = (i19 & 2) != 0 ? false : z18;
        boolean z46 = (i19 & 4) != 0 ? true : z19;
        boolean z47 = (i19 & 8) != 0 ? true : z20;
        boolean z48 = (i19 & 16) == 0 ? z21 : true;
        String str58 = (i19 & 32) != 0 ? null : str20;
        int i25 = (i19 & 64) != 0 ? 0 : i13;
        String str59 = (i19 & 128) != 0 ? null : str21;
        String str60 = (i19 & 256) != 0 ? null : str22;
        String str61 = (i19 & 512) != 0 ? null : str23;
        boolean z49 = (i19 & 1024) != 0 ? false : z22;
        String str62 = (i19 & 2048) != 0 ? null : str24;
        String str63 = (i19 & 4096) != 0 ? null : str25;
        String str64 = (i19 & 8192) != 0 ? null : str26;
        String str65 = (i19 & 16384) != 0 ? null : str27;
        String str66 = (i19 & 32768) != 0 ? "bottom" : str28;
        boolean z50 = (i19 & 65536) != 0 ? false : z23;
        String str67 = (i19 & 131072) != 0 ? null : str29;
        boolean z51 = (i19 & PKIFailureInfo.transactionIdInUse) != 0 ? false : z24;
        boolean z52 = (i19 & PKIFailureInfo.signerNotTrusted) != 0 ? false : z25;
        boolean z53 = (i19 & PKIFailureInfo.badCertTemplate) != 0 ? false : z26;
        boolean z54 = (i19 & PKIFailureInfo.badSenderNonce) != 0 ? false : z27;
        boolean z55 = (i19 & 4194304) != 0 ? false : z28;
        boolean z56 = (i19 & 8388608) != 0 ? false : z29;
        int i26 = (i19 & 16777216) != 0 ? 0 : i14;
        int i27 = (i19 & 33554432) != 0 ? 0 : i15;
        int i28 = (i19 & 67108864) != 0 ? -1 : i16;
        int i29 = (134217728 & i19) != 0 ? -1 : i17;
        String str68 = (268435456 & i19) != 0 ? "" : str30;
        boolean z57 = (536870912 & i19) != 0 ? false : z30;
        String str69 = (1073741824 & i19) != 0 ? "DISABLED" : str31;
        String str70 = (i19 & PKIFailureInfo.systemUnavail) != 0 ? null : str32;
        String str71 = (i20 & 1) != 0 ? ProjectKind.APK : str33;
        Long l14 = (i20 & 2) != 0 ? null : l11;
        long jCurrentTimeMillis2 = (i20 & 4) != 0 ? System.currentTimeMillis() : j11;
        if ((i20 & 8) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            i21 = i10;
            str36 = str4;
            i22 = i11;
            i23 = i12;
            str37 = str5;
            l12 = l13;
            str38 = str52;
            str39 = str53;
            z31 = z42;
            z32 = z43;
            str40 = str54;
            z33 = z44;
            str41 = str55;
            str42 = str57;
            z34 = z45;
            z35 = z46;
            z36 = z47;
            str43 = str58;
            i24 = i25;
            str34 = str;
            str35 = str2;
        } else {
            jCurrentTimeMillis = j12;
            str34 = str;
            str35 = str2;
            i21 = i10;
            str36 = str4;
            i22 = i11;
            i23 = i12;
            str37 = str5;
            l12 = l13;
            str38 = str52;
            str39 = str53;
            z31 = z42;
            z32 = z43;
            str40 = str54;
            z33 = z44;
            str41 = str55;
            str42 = str57;
            z34 = z45;
            z35 = z46;
            z36 = z47;
            str43 = str58;
            i24 = i25;
        }
        this(j13, str34, str35, str3, i21, str36, i22, i23, num2, str37, str44, str45, str46, str47, str48, str49, str50, z37, z38, z39, z40, z41, str51, l12, str38, str39, z31, z32, str40, z33, str41, str56, str42, z34, z35, z36, z48, str43, i24, str59, str60, str61, z49, str62, str63, str64, str65, str66, z50, str67, z51, z52, z53, z54, z55, z56, i26, i27, i28, i29, str68, z57, str69, str70, str71, l14, jCurrentTimeMillis2, jCurrentTimeMillis);
    }
}
