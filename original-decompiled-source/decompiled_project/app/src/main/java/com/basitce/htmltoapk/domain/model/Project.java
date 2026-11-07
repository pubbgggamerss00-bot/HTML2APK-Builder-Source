package com.basitce.htmltoapk.domain.model;

import a2.a;
import androidx.datastore.preferences.protobuf.a1;
import androidx.room.z0;
import bi.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.v0;
import l0.k;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import qg.z;
import r.e2;
import r.o2;
import zh.b;
import zh.c;
import zh.g;

@g
/* loaded from: classes.dex */
public final class Project {
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
    private final ContentSource contentSource;
    private final long createdAt;
    private final String deepLinkScheme;
    private final boolean desktopMode;
    private final String iconPath;

    /* renamed from: id, reason: collision with root package name */
    private final long f5744id;
    private final boolean keepScreenOn;
    private final Long keystoreId;
    private final Integer maxSdk;
    private final int minSdk;
    private final String name;
    private final String orientation;
    private final String outputFormat;
    private final String packageName;
    private final List<String> permissions;
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
    private final WebViewSettings webViewSettings;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final b<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, ContentSource.Companion.serializer(), null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public static final class Companion {
        private Companion() {
        }

        public final b<Project> serializer() {
            return Project$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public Project(int i10, int i11, int i12, long j10, String str, String str2, String str3, int i13, String str4, int i14, int i15, Integer num, ContentSource contentSource, String str5, String str6, List list, String str7, String str8, String str9, String str10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, WebViewSettings webViewSettings, Long l10, String str11, String str12, boolean z15, boolean z16, String str13, boolean z17, String str14, String str15, String str16, boolean z18, boolean z19, boolean z20, boolean z21, String str17, int i16, String str18, String str19, String str20, boolean z22, String str21, String str22, String str23, String str24, String str25, boolean z23, String str26, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, int i17, int i18, int i19, int i20, String str27, boolean z30, String str28, String str29, long j11, long j12, v0 v0Var) {
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        if (766 != (i10 & 766)) {
            int[] iArr = {i10, i11, i12};
            int[] iArr2 = {766, 0, 0};
            f descriptor = Project$$serializer.INSTANCE.getDescriptor();
            r.e(descriptor, "descriptor");
            ArrayList arrayList = new ArrayList();
            for (int i26 = 0; i26 < 3; i26++) {
                int i27 = iArr2[i26] & (~iArr[i26]);
                if (i27 != 0) {
                    for (int i28 = 0; i28 < 32; i28++) {
                        if ((i27 & 1) != 0) {
                            arrayList.add(descriptor.f((i26 * 32) + i28));
                        }
                        i27 >>>= 1;
                    }
                }
            }
            throw new c(descriptor.a(), arrayList);
        }
        this.f5744id = (i10 & 1) == 0 ? 0L : j10;
        this.name = str;
        this.appName = str2;
        this.packageName = str3;
        this.versionCode = i13;
        this.versionName = str4;
        this.minSdk = i14;
        this.targetSdk = i15;
        if ((i10 & 256) == 0) {
            this.maxSdk = null;
        } else {
            this.maxSdk = num;
        }
        this.contentSource = contentSource;
        if ((i10 & 1024) == 0) {
            this.sourcePath = null;
        } else {
            this.sourcePath = str5;
        }
        if ((i10 & 2048) == 0) {
            this.sourceUrl = null;
        } else {
            this.sourceUrl = str6;
        }
        this.permissions = (i10 & 4096) == 0 ? z.f22752a : list;
        if ((i10 & 8192) == 0) {
            this.iconPath = null;
        } else {
            this.iconPath = str7;
        }
        if ((i10 & 16384) == 0) {
            this.splashPath = null;
        } else {
            this.splashPath = str8;
        }
        if ((i10 & 32768) == 0) {
            this.primaryColor = null;
        } else {
            this.primaryColor = str9;
        }
        this.orientation = (i10 & 65536) == 0 ? "portrait" : str10;
        if ((i10 & 131072) == 0) {
            this.showHeader = true;
        } else {
            this.showHeader = z10;
        }
        if ((i10 & PKIFailureInfo.transactionIdInUse) == 0) {
            this.showActionBar = false;
        } else {
            this.showActionBar = z11;
        }
        if ((i10 & PKIFailureInfo.signerNotTrusted) == 0) {
            this.keepScreenOn = false;
        } else {
            this.keepScreenOn = z12;
        }
        if ((i10 & PKIFailureInfo.badCertTemplate) == 0) {
            this.showCameraCutout = false;
        } else {
            this.showCameraCutout = z13;
        }
        if ((i10 & PKIFailureInfo.badSenderNonce) == 0) {
            this.desktopMode = false;
        } else {
            this.desktopMode = z14;
        }
        if ((i10 & 4194304) == 0) {
            this.webViewSettings = new WebViewSettings(false, false, false, false, false, false, false, false, false, false, 0, 0, (String) null, 0, false, false, false, false, false, false, false, (Boolean) null, false, (String) null, false, (String) null, 0, 0, 0, 0, 0, 0, 0, (String) null, false, false, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, false, false, false, false, false, false, false, 0, -1, 4194303, (j) null);
        } else {
            this.webViewSettings = webViewSettings;
        }
        if ((i10 & 8388608) == 0) {
            this.keystoreId = null;
        } else {
            this.keystoreId = l10;
        }
        this.outputFormat = (i10 & 16777216) == 0 ? ProjectKind.APK : str11;
        this.buildMode = (i10 & 33554432) == 0 ? "advanced" : str12;
        if ((i10 & 67108864) == 0) {
            this.showWatermark = false;
            i21 = 67108864;
        } else {
            i21 = 67108864;
            this.showWatermark = z15;
        }
        if ((i10 & 134217728) == 0) {
            this.autoIncrementVersionCode = false;
            i22 = 134217728;
        } else {
            i22 = 134217728;
            this.autoIncrementVersionCode = z16;
        }
        if ((i10 & 268435456) == 0) {
            this.deepLinkScheme = null;
            i23 = 268435456;
        } else {
            i23 = 268435456;
            this.deepLinkScheme = str13;
        }
        if ((i10 & PKIFailureInfo.duplicateCertReq) == 0) {
            this.billingEnabled = false;
            i24 = 536870912;
        } else {
            i24 = 536870912;
            this.billingEnabled = z17;
        }
        if ((i10 & 1073741824) == 0) {
            this.billingProductId = null;
            i25 = 1073741824;
        } else {
            i25 = 1073741824;
            this.billingProductId = str14;
        }
        if ((i10 & PKIFailureInfo.systemUnavail) == 0) {
            this.billingSubscriptionId = null;
        } else {
            this.billingSubscriptionId = str15;
        }
        this.billingType = (i11 & 1) == 0 ? "non_consumable" : str16;
        if ((i11 & 2) == 0) {
            this.billingTestMode = false;
        } else {
            this.billingTestMode = z18;
        }
        if ((i11 & 4) == 0) {
            this.billingAutoConsume = true;
        } else {
            this.billingAutoConsume = z19;
        }
        if ((i11 & 8) == 0) {
            this.billingAcknowledge = true;
        } else {
            this.billingAcknowledge = z20;
        }
        if ((i11 & 16) == 0) {
            this.billingEnablePendingPurchases = true;
        } else {
            this.billingEnablePendingPurchases = z21;
        }
        if ((i11 & 32) == 0) {
            this.billingSubscriptionPeriod = null;
        } else {
            this.billingSubscriptionPeriod = str17;
        }
        if ((i11 & 64) == 0) {
            this.billingFreeTrialDays = 0;
        } else {
            this.billingFreeTrialDays = i16;
        }
        if ((i11 & 128) == 0) {
            this.billingIntroductoryPrice = null;
        } else {
            this.billingIntroductoryPrice = str18;
        }
        if ((i11 & 256) == 0) {
            this.billingProductName = null;
        } else {
            this.billingProductName = str19;
        }
        if ((i11 & 512) == 0) {
            this.billingProductDescription = null;
        } else {
            this.billingProductDescription = str20;
        }
        if ((i11 & 1024) == 0) {
            this.admobEnabled = false;
        } else {
            this.admobEnabled = z22;
        }
        if ((i11 & 2048) == 0) {
            this.admobAppId = null;
        } else {
            this.admobAppId = str21;
        }
        if ((i11 & 4096) == 0) {
            this.admobBannerUnitId = null;
        } else {
            this.admobBannerUnitId = str22;
        }
        if ((i11 & 8192) == 0) {
            this.admobInterstitialUnitId = null;
        } else {
            this.admobInterstitialUnitId = str23;
        }
        if ((i11 & 16384) == 0) {
            this.admobRewardedUnitId = null;
        } else {
            this.admobRewardedUnitId = str24;
        }
        this.admobBannerPosition = (i11 & 32768) == 0 ? "bottom" : str25;
        if ((i11 & 65536) == 0) {
            this.admobShowBannerOnStart = false;
        } else {
            this.admobShowBannerOnStart = z23;
        }
        if ((i11 & 131072) == 0) {
            this.admobTestDeviceIds = null;
        } else {
            this.admobTestDeviceIds = str26;
        }
        if ((i11 & PKIFailureInfo.transactionIdInUse) == 0) {
            this.admobAutoLoadInterstitial = false;
        } else {
            this.admobAutoLoadInterstitial = z24;
        }
        if ((i11 & PKIFailureInfo.signerNotTrusted) == 0) {
            this.admobAutoLoadRewarded = false;
        } else {
            this.admobAutoLoadRewarded = z25;
        }
        if ((i11 & PKIFailureInfo.badCertTemplate) == 0) {
            this.admobUseTestAds = false;
        } else {
            this.admobUseTestAds = z26;
        }
        if ((i11 & PKIFailureInfo.badSenderNonce) == 0) {
            this.admobBannerEnabled = false;
        } else {
            this.admobBannerEnabled = z27;
        }
        if ((i11 & 4194304) == 0) {
            this.admobInterstitialEnabled = false;
        } else {
            this.admobInterstitialEnabled = z28;
        }
        if ((i11 & 8388608) == 0) {
            this.admobRewardedEnabled = false;
        } else {
            this.admobRewardedEnabled = z29;
        }
        if ((i11 & 16777216) == 0) {
            this.admobInterstitialIntervalSeconds = 0;
        } else {
            this.admobInterstitialIntervalSeconds = i17;
        }
        if ((i11 & 33554432) == 0) {
            this.admobInterstitialPageCount = 0;
        } else {
            this.admobInterstitialPageCount = i18;
        }
        if ((i11 & i21) == 0) {
            this.admobChildDirectedTreatment = -1;
        } else {
            this.admobChildDirectedTreatment = i19;
        }
        if ((i11 & i22) == 0) {
            this.admobUnderAgeOfConsent = -1;
        } else {
            this.admobUnderAgeOfConsent = i20;
        }
        this.admobMaxAdContentRating = (i11 & i23) == 0 ? "" : str27;
        if ((i11 & i24) == 0) {
            this.umpDebugEnabled = false;
        } else {
            this.umpDebugEnabled = z30;
        }
        this.umpDebugGeography = (i11 & i25) == 0 ? "DISABLED" : str28;
        if ((i11 & PKIFailureInfo.systemUnavail) == 0) {
            this.umpTestDeviceIds = null;
        } else {
            this.umpTestDeviceIds = str29;
        }
        this.createdAt = (i12 & 1) == 0 ? System.currentTimeMillis() : j11;
        this.updatedAt = (i12 & 2) == 0 ? System.currentTimeMillis() : j12;
    }

    public static /* synthetic */ Project copy$default(Project project, long j10, String str, String str2, String str3, int i10, String str4, int i11, int i12, Integer num, ContentSource contentSource, String str5, String str6, List list, String str7, String str8, String str9, String str10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, WebViewSettings webViewSettings, Long l10, String str11, String str12, boolean z15, boolean z16, String str13, boolean z17, String str14, String str15, String str16, boolean z18, boolean z19, boolean z20, boolean z21, String str17, int i13, String str18, String str19, String str20, boolean z22, String str21, String str22, String str23, String str24, String str25, boolean z23, String str26, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, int i14, int i15, int i16, int i17, String str27, boolean z30, String str28, String str29, long j11, long j12, int i18, int i19, int i20, Object obj) {
        long j13;
        long j14;
        boolean z31;
        String str30;
        boolean z32;
        boolean z33;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        int i21;
        int i22;
        int i23;
        int i24;
        String str31;
        boolean z38;
        String str32;
        String str33;
        String str34;
        boolean z39;
        boolean z40;
        boolean z41;
        boolean z42;
        String str35;
        int i25;
        String str36;
        String str37;
        String str38;
        boolean z43;
        String str39;
        String str40;
        String str41;
        String str42;
        String str43;
        String str44;
        boolean z44;
        boolean z45;
        boolean z46;
        boolean z47;
        boolean z48;
        WebViewSettings webViewSettings2;
        Long l11;
        String str45;
        String str46;
        boolean z49;
        boolean z50;
        String str47;
        boolean z51;
        String str48;
        String str49;
        String str50;
        String str51;
        String str52;
        String str53;
        String str54;
        int i26;
        String str55;
        int i27;
        int i28;
        Integer num2;
        ContentSource contentSource2;
        String str56;
        String str57;
        List list2;
        String str58;
        Project project2;
        long j15 = (i18 & 1) != 0 ? project.f5744id : j10;
        String str59 = (i18 & 2) != 0 ? project.name : str;
        String str60 = (i18 & 4) != 0 ? project.appName : str2;
        String str61 = (i18 & 8) != 0 ? project.packageName : str3;
        int i29 = (i18 & 16) != 0 ? project.versionCode : i10;
        String str62 = (i18 & 32) != 0 ? project.versionName : str4;
        int i30 = (i18 & 64) != 0 ? project.minSdk : i11;
        int i31 = (i18 & 128) != 0 ? project.targetSdk : i12;
        Integer num3 = (i18 & 256) != 0 ? project.maxSdk : num;
        ContentSource contentSource3 = (i18 & 512) != 0 ? project.contentSource : contentSource;
        String str63 = (i18 & 1024) != 0 ? project.sourcePath : str5;
        String str64 = (i18 & 2048) != 0 ? project.sourceUrl : str6;
        long j16 = j15;
        List list3 = (i18 & 4096) != 0 ? project.permissions : list;
        String str65 = (i18 & 8192) != 0 ? project.iconPath : str7;
        List list4 = list3;
        String str66 = (i18 & 16384) != 0 ? project.splashPath : str8;
        String str67 = (i18 & 32768) != 0 ? project.primaryColor : str9;
        String str68 = (i18 & 65536) != 0 ? project.orientation : str10;
        boolean z52 = (i18 & 131072) != 0 ? project.showHeader : z10;
        boolean z53 = (i18 & PKIFailureInfo.transactionIdInUse) != 0 ? project.showActionBar : z11;
        boolean z54 = (i18 & PKIFailureInfo.signerNotTrusted) != 0 ? project.keepScreenOn : z12;
        boolean z55 = (i18 & PKIFailureInfo.badCertTemplate) != 0 ? project.showCameraCutout : z13;
        boolean z56 = (i18 & PKIFailureInfo.badSenderNonce) != 0 ? project.desktopMode : z14;
        WebViewSettings webViewSettings3 = (i18 & 4194304) != 0 ? project.webViewSettings : webViewSettings;
        Long l12 = (i18 & 8388608) != 0 ? project.keystoreId : l10;
        String str69 = (i18 & 16777216) != 0 ? project.outputFormat : str11;
        String str70 = (i18 & 33554432) != 0 ? project.buildMode : str12;
        boolean z57 = (i18 & 67108864) != 0 ? project.showWatermark : z15;
        boolean z58 = (i18 & 134217728) != 0 ? project.autoIncrementVersionCode : z16;
        String str71 = (i18 & 268435456) != 0 ? project.deepLinkScheme : str13;
        boolean z59 = (i18 & PKIFailureInfo.duplicateCertReq) != 0 ? project.billingEnabled : z17;
        String str72 = (i18 & 1073741824) != 0 ? project.billingProductId : str14;
        String str73 = (i18 & PKIFailureInfo.systemUnavail) != 0 ? project.billingSubscriptionId : str15;
        String str74 = (i19 & 1) != 0 ? project.billingType : str16;
        boolean z60 = (i19 & 2) != 0 ? project.billingTestMode : z18;
        boolean z61 = (i19 & 4) != 0 ? project.billingAutoConsume : z19;
        boolean z62 = (i19 & 8) != 0 ? project.billingAcknowledge : z20;
        boolean z63 = (i19 & 16) != 0 ? project.billingEnablePendingPurchases : z21;
        String str75 = (i19 & 32) != 0 ? project.billingSubscriptionPeriod : str17;
        int i32 = (i19 & 64) != 0 ? project.billingFreeTrialDays : i13;
        String str76 = (i19 & 128) != 0 ? project.billingIntroductoryPrice : str18;
        String str77 = (i19 & 256) != 0 ? project.billingProductName : str19;
        String str78 = (i19 & 512) != 0 ? project.billingProductDescription : str20;
        boolean z64 = (i19 & 1024) != 0 ? project.admobEnabled : z22;
        String str79 = (i19 & 2048) != 0 ? project.admobAppId : str21;
        String str80 = (i19 & 4096) != 0 ? project.admobBannerUnitId : str22;
        String str81 = (i19 & 8192) != 0 ? project.admobInterstitialUnitId : str23;
        String str82 = (i19 & 16384) != 0 ? project.admobRewardedUnitId : str24;
        String str83 = (i19 & 32768) != 0 ? project.admobBannerPosition : str25;
        boolean z65 = (i19 & 65536) != 0 ? project.admobShowBannerOnStart : z23;
        String str84 = (i19 & 131072) != 0 ? project.admobTestDeviceIds : str26;
        boolean z66 = (i19 & PKIFailureInfo.transactionIdInUse) != 0 ? project.admobAutoLoadInterstitial : z24;
        boolean z67 = (i19 & PKIFailureInfo.signerNotTrusted) != 0 ? project.admobAutoLoadRewarded : z25;
        boolean z68 = (i19 & PKIFailureInfo.badCertTemplate) != 0 ? project.admobUseTestAds : z26;
        boolean z69 = (i19 & PKIFailureInfo.badSenderNonce) != 0 ? project.admobBannerEnabled : z27;
        boolean z70 = (i19 & 4194304) != 0 ? project.admobInterstitialEnabled : z28;
        boolean z71 = (i19 & 8388608) != 0 ? project.admobRewardedEnabled : z29;
        int i33 = (i19 & 16777216) != 0 ? project.admobInterstitialIntervalSeconds : i14;
        int i34 = (i19 & 33554432) != 0 ? project.admobInterstitialPageCount : i15;
        int i35 = (i19 & 67108864) != 0 ? project.admobChildDirectedTreatment : i16;
        int i36 = (i19 & 134217728) != 0 ? project.admobUnderAgeOfConsent : i17;
        String str85 = (i19 & 268435456) != 0 ? project.admobMaxAdContentRating : str27;
        boolean z72 = (i19 & PKIFailureInfo.duplicateCertReq) != 0 ? project.umpDebugEnabled : z30;
        String str86 = (i19 & 1073741824) != 0 ? project.umpDebugGeography : str28;
        String str87 = (i19 & PKIFailureInfo.systemUnavail) != 0 ? project.umpTestDeviceIds : str29;
        long j17 = (i20 & 1) != 0 ? project.createdAt : j11;
        if ((i20 & 2) != 0) {
            j14 = j17;
            j13 = project.updatedAt;
            z32 = z66;
            z33 = z67;
            z34 = z68;
            z35 = z69;
            z36 = z70;
            z37 = z71;
            i21 = i33;
            i22 = i34;
            i23 = i35;
            i24 = i36;
            str31 = str85;
            z38 = z72;
            str32 = str86;
            str33 = str87;
            z40 = z61;
            z41 = z62;
            z42 = z63;
            str35 = str75;
            i25 = i32;
            str36 = str76;
            str37 = str77;
            str38 = str78;
            z43 = z64;
            str39 = str79;
            str40 = str80;
            str41 = str81;
            str42 = str82;
            str43 = str83;
            z31 = z65;
            str30 = str84;
            z45 = z53;
            z46 = z54;
            z47 = z55;
            z48 = z56;
            webViewSettings2 = webViewSettings3;
            l11 = l12;
            str45 = str69;
            str46 = str70;
            z49 = z57;
            z50 = z58;
            str47 = str71;
            z51 = z59;
            str48 = str72;
            str49 = str73;
            str34 = str74;
            z39 = z60;
            str50 = str66;
            str51 = str65;
            str53 = str60;
            str54 = str61;
            i26 = i29;
            str55 = str62;
            i27 = i30;
            i28 = i31;
            num2 = num3;
            contentSource2 = contentSource3;
            str56 = str63;
            str57 = str64;
            list2 = list4;
            str58 = str67;
            str44 = str68;
            z44 = z52;
            project2 = project;
            str52 = str59;
        } else {
            j13 = j12;
            j14 = j17;
            z31 = z65;
            str30 = str84;
            z32 = z66;
            z33 = z67;
            z34 = z68;
            z35 = z69;
            z36 = z70;
            z37 = z71;
            i21 = i33;
            i22 = i34;
            i23 = i35;
            i24 = i36;
            str31 = str85;
            z38 = z72;
            str32 = str86;
            str33 = str87;
            str34 = str74;
            z39 = z60;
            z40 = z61;
            z41 = z62;
            z42 = z63;
            str35 = str75;
            i25 = i32;
            str36 = str76;
            str37 = str77;
            str38 = str78;
            z43 = z64;
            str39 = str79;
            str40 = str80;
            str41 = str81;
            str42 = str82;
            str43 = str83;
            str44 = str68;
            z44 = z52;
            z45 = z53;
            z46 = z54;
            z47 = z55;
            z48 = z56;
            webViewSettings2 = webViewSettings3;
            l11 = l12;
            str45 = str69;
            str46 = str70;
            z49 = z57;
            z50 = z58;
            str47 = str71;
            z51 = z59;
            str48 = str72;
            str49 = str73;
            str50 = str66;
            str51 = str65;
            str52 = str59;
            str53 = str60;
            str54 = str61;
            i26 = i29;
            str55 = str62;
            i27 = i30;
            i28 = i31;
            num2 = num3;
            contentSource2 = contentSource3;
            str56 = str63;
            str57 = str64;
            list2 = list4;
            str58 = str67;
            project2 = project;
        }
        return project2.copy(j16, str52, str53, str54, i26, str55, i27, i28, num2, contentSource2, str56, str57, list2, str51, str50, str58, str44, z44, z45, z46, z47, z48, webViewSettings2, l11, str45, str46, z49, z50, str47, z51, str48, str49, str34, z39, z40, z41, z42, str35, i25, str36, str37, str38, z43, str39, str40, str41, str42, str43, z31, str30, z32, z33, z34, z35, z36, z37, i21, i22, i23, i24, str31, z38, str32, str33, j14, j13);
    }

    public static final /* synthetic */ void write$Self$app_release(Project project, ci.c cVar, f fVar) {
        b<Object>[] bVarArr = $childSerializers;
        if (cVar.i(fVar) || project.f5744id != 0) {
            cVar.e(fVar, 0, project.f5744id);
        }
        cVar.M(fVar, 1, project.name);
        cVar.M(fVar, 2, project.appName);
        cVar.M(fVar, 3, project.packageName);
        cVar.O(4, project.versionCode, fVar);
        cVar.M(fVar, 5, project.versionName);
        cVar.O(6, project.minSdk, fVar);
        cVar.O(7, project.targetSdk, fVar);
        if (cVar.i(fVar) || project.maxSdk != null) {
            cVar.g(fVar, 8, IntSerializer.INSTANCE, project.maxSdk);
        }
        cVar.y(fVar, 9, bVarArr[9], project.contentSource);
        if (cVar.i(fVar) || project.sourcePath != null) {
            cVar.g(fVar, 10, StringSerializer.INSTANCE, project.sourcePath);
        }
        if (cVar.i(fVar) || project.sourceUrl != null) {
            cVar.g(fVar, 11, StringSerializer.INSTANCE, project.sourceUrl);
        }
        if (cVar.i(fVar) || !r.a(project.permissions, z.f22752a)) {
            cVar.y(fVar, 12, bVarArr[12], project.permissions);
        }
        if (cVar.i(fVar) || project.iconPath != null) {
            cVar.g(fVar, 13, StringSerializer.INSTANCE, project.iconPath);
        }
        if (cVar.i(fVar) || project.splashPath != null) {
            cVar.g(fVar, 14, StringSerializer.INSTANCE, project.splashPath);
        }
        if (cVar.i(fVar) || project.primaryColor != null) {
            cVar.g(fVar, 15, StringSerializer.INSTANCE, project.primaryColor);
        }
        if (cVar.i(fVar) || !r.a(project.orientation, "portrait")) {
            cVar.M(fVar, 16, project.orientation);
        }
        if (cVar.i(fVar) || !project.showHeader) {
            cVar.L(fVar, 17, project.showHeader);
        }
        if (cVar.i(fVar) || project.showActionBar) {
            cVar.L(fVar, 18, project.showActionBar);
        }
        if (cVar.i(fVar) || project.keepScreenOn) {
            cVar.L(fVar, 19, project.keepScreenOn);
        }
        if (cVar.i(fVar) || project.showCameraCutout) {
            cVar.L(fVar, 20, project.showCameraCutout);
        }
        if (cVar.i(fVar) || project.desktopMode) {
            cVar.L(fVar, 21, project.desktopMode);
        }
        if (cVar.i(fVar) || !r.a(project.webViewSettings, new WebViewSettings(false, false, false, false, false, false, false, false, false, false, 0, 0, (String) null, 0, false, false, false, false, false, false, false, (Boolean) null, false, (String) null, false, (String) null, 0, 0, 0, 0, 0, 0, 0, (String) null, false, false, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, false, false, false, false, false, false, false, 0, -1, 4194303, (j) null))) {
            cVar.y(fVar, 22, WebViewSettings$$serializer.INSTANCE, project.webViewSettings);
        }
        if (cVar.i(fVar) || project.keystoreId != null) {
            cVar.g(fVar, 23, LongSerializer.INSTANCE, project.keystoreId);
        }
        if (cVar.i(fVar) || !r.a(project.outputFormat, ProjectKind.APK)) {
            cVar.M(fVar, 24, project.outputFormat);
        }
        if (cVar.i(fVar) || !r.a(project.buildMode, "advanced")) {
            cVar.M(fVar, 25, project.buildMode);
        }
        if (cVar.i(fVar) || project.showWatermark) {
            cVar.L(fVar, 26, project.showWatermark);
        }
        if (cVar.i(fVar) || project.autoIncrementVersionCode) {
            cVar.L(fVar, 27, project.autoIncrementVersionCode);
        }
        if (cVar.i(fVar) || project.deepLinkScheme != null) {
            cVar.g(fVar, 28, StringSerializer.INSTANCE, project.deepLinkScheme);
        }
        if (cVar.i(fVar) || project.billingEnabled) {
            cVar.L(fVar, 29, project.billingEnabled);
        }
        if (cVar.i(fVar) || project.billingProductId != null) {
            cVar.g(fVar, 30, StringSerializer.INSTANCE, project.billingProductId);
        }
        if (cVar.i(fVar) || project.billingSubscriptionId != null) {
            cVar.g(fVar, 31, StringSerializer.INSTANCE, project.billingSubscriptionId);
        }
        if (cVar.i(fVar) || !r.a(project.billingType, "non_consumable")) {
            cVar.g(fVar, 32, StringSerializer.INSTANCE, project.billingType);
        }
        if (cVar.i(fVar) || project.billingTestMode) {
            cVar.L(fVar, 33, project.billingTestMode);
        }
        if (cVar.i(fVar) || !project.billingAutoConsume) {
            cVar.L(fVar, 34, project.billingAutoConsume);
        }
        if (cVar.i(fVar) || !project.billingAcknowledge) {
            cVar.L(fVar, 35, project.billingAcknowledge);
        }
        if (cVar.i(fVar) || !project.billingEnablePendingPurchases) {
            cVar.L(fVar, 36, project.billingEnablePendingPurchases);
        }
        if (cVar.i(fVar) || project.billingSubscriptionPeriod != null) {
            cVar.g(fVar, 37, StringSerializer.INSTANCE, project.billingSubscriptionPeriod);
        }
        if (cVar.i(fVar) || project.billingFreeTrialDays != 0) {
            cVar.O(38, project.billingFreeTrialDays, fVar);
        }
        if (cVar.i(fVar) || project.billingIntroductoryPrice != null) {
            cVar.g(fVar, 39, StringSerializer.INSTANCE, project.billingIntroductoryPrice);
        }
        if (cVar.i(fVar) || project.billingProductName != null) {
            cVar.g(fVar, 40, StringSerializer.INSTANCE, project.billingProductName);
        }
        if (cVar.i(fVar) || project.billingProductDescription != null) {
            cVar.g(fVar, 41, StringSerializer.INSTANCE, project.billingProductDescription);
        }
        if (cVar.i(fVar) || project.admobEnabled) {
            cVar.L(fVar, 42, project.admobEnabled);
        }
        if (cVar.i(fVar) || project.admobAppId != null) {
            cVar.g(fVar, 43, StringSerializer.INSTANCE, project.admobAppId);
        }
        if (cVar.i(fVar) || project.admobBannerUnitId != null) {
            cVar.g(fVar, 44, StringSerializer.INSTANCE, project.admobBannerUnitId);
        }
        if (cVar.i(fVar) || project.admobInterstitialUnitId != null) {
            cVar.g(fVar, 45, StringSerializer.INSTANCE, project.admobInterstitialUnitId);
        }
        if (cVar.i(fVar) || project.admobRewardedUnitId != null) {
            cVar.g(fVar, 46, StringSerializer.INSTANCE, project.admobRewardedUnitId);
        }
        if (cVar.i(fVar) || !r.a(project.admobBannerPosition, "bottom")) {
            cVar.g(fVar, 47, StringSerializer.INSTANCE, project.admobBannerPosition);
        }
        if (cVar.i(fVar) || project.admobShowBannerOnStart) {
            cVar.L(fVar, 48, project.admobShowBannerOnStart);
        }
        if (cVar.i(fVar) || project.admobTestDeviceIds != null) {
            cVar.g(fVar, 49, StringSerializer.INSTANCE, project.admobTestDeviceIds);
        }
        if (cVar.i(fVar) || project.admobAutoLoadInterstitial) {
            cVar.L(fVar, 50, project.admobAutoLoadInterstitial);
        }
        if (cVar.i(fVar) || project.admobAutoLoadRewarded) {
            cVar.L(fVar, 51, project.admobAutoLoadRewarded);
        }
        if (cVar.i(fVar) || project.admobUseTestAds) {
            cVar.L(fVar, 52, project.admobUseTestAds);
        }
        if (cVar.i(fVar) || project.admobBannerEnabled) {
            cVar.L(fVar, 53, project.admobBannerEnabled);
        }
        if (cVar.i(fVar) || project.admobInterstitialEnabled) {
            cVar.L(fVar, 54, project.admobInterstitialEnabled);
        }
        if (cVar.i(fVar) || project.admobRewardedEnabled) {
            cVar.L(fVar, 55, project.admobRewardedEnabled);
        }
        if (cVar.i(fVar) || project.admobInterstitialIntervalSeconds != 0) {
            cVar.O(56, project.admobInterstitialIntervalSeconds, fVar);
        }
        if (cVar.i(fVar) || project.admobInterstitialPageCount != 0) {
            cVar.O(57, project.admobInterstitialPageCount, fVar);
        }
        if (cVar.i(fVar) || project.admobChildDirectedTreatment != -1) {
            cVar.O(58, project.admobChildDirectedTreatment, fVar);
        }
        if (cVar.i(fVar) || project.admobUnderAgeOfConsent != -1) {
            cVar.O(59, project.admobUnderAgeOfConsent, fVar);
        }
        if (cVar.i(fVar) || !r.a(project.admobMaxAdContentRating, "")) {
            cVar.M(fVar, 60, project.admobMaxAdContentRating);
        }
        if (cVar.i(fVar) || project.umpDebugEnabled) {
            cVar.L(fVar, 61, project.umpDebugEnabled);
        }
        if (cVar.i(fVar) || !r.a(project.umpDebugGeography, "DISABLED")) {
            cVar.M(fVar, 62, project.umpDebugGeography);
        }
        if (cVar.i(fVar) || project.umpTestDeviceIds != null) {
            cVar.g(fVar, 63, StringSerializer.INSTANCE, project.umpTestDeviceIds);
        }
        if (cVar.i(fVar) || project.createdAt != System.currentTimeMillis()) {
            cVar.e(fVar, 64, project.createdAt);
        }
        if (!cVar.i(fVar) && project.updatedAt == System.currentTimeMillis()) {
            return;
        }
        cVar.e(fVar, 65, project.updatedAt);
    }

    public final long component1() {
        return this.f5744id;
    }

    public final ContentSource component10() {
        return this.contentSource;
    }

    public final String component11() {
        return this.sourcePath;
    }

    public final String component12() {
        return this.sourceUrl;
    }

    public final List<String> component13() {
        return this.permissions;
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

    public final WebViewSettings component23() {
        return this.webViewSettings;
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

    public final long component65() {
        return this.createdAt;
    }

    public final long component66() {
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

    public final Project copy(long j10, String name, String appName, String packageName, int i10, String versionName, int i11, int i12, Integer num, ContentSource contentSource, String str, String str2, List<String> permissions, String str3, String str4, String str5, String orientation, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, WebViewSettings webViewSettings, Long l10, String outputFormat, String buildMode, boolean z15, boolean z16, String str6, boolean z17, String str7, String str8, String str9, boolean z18, boolean z19, boolean z20, boolean z21, String str10, int i13, String str11, String str12, String str13, boolean z22, String str14, String str15, String str16, String str17, String str18, boolean z23, String str19, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, int i14, int i15, int i16, int i17, String admobMaxAdContentRating, boolean z30, String umpDebugGeography, String str20, long j11, long j12) {
        r.e(name, "name");
        r.e(appName, "appName");
        r.e(packageName, "packageName");
        r.e(versionName, "versionName");
        r.e(contentSource, "contentSource");
        r.e(permissions, "permissions");
        r.e(orientation, "orientation");
        r.e(webViewSettings, "webViewSettings");
        r.e(outputFormat, "outputFormat");
        r.e(buildMode, "buildMode");
        r.e(admobMaxAdContentRating, "admobMaxAdContentRating");
        r.e(umpDebugGeography, "umpDebugGeography");
        return new Project(j10, name, appName, packageName, i10, versionName, i11, i12, num, contentSource, str, str2, permissions, str3, str4, str5, orientation, z10, z11, z12, z13, z14, webViewSettings, l10, outputFormat, buildMode, z15, z16, str6, z17, str7, str8, str9, z18, z19, z20, z21, str10, i13, str11, str12, str13, z22, str14, str15, str16, str17, str18, z23, str19, z24, z25, z26, z27, z28, z29, i14, i15, i16, i17, admobMaxAdContentRating, z30, umpDebugGeography, str20, j11, j12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Project)) {
            return false;
        }
        Project project = (Project) obj;
        return this.f5744id == project.f5744id && r.a(this.name, project.name) && r.a(this.appName, project.appName) && r.a(this.packageName, project.packageName) && this.versionCode == project.versionCode && r.a(this.versionName, project.versionName) && this.minSdk == project.minSdk && this.targetSdk == project.targetSdk && r.a(this.maxSdk, project.maxSdk) && r.a(this.contentSource, project.contentSource) && r.a(this.sourcePath, project.sourcePath) && r.a(this.sourceUrl, project.sourceUrl) && r.a(this.permissions, project.permissions) && r.a(this.iconPath, project.iconPath) && r.a(this.splashPath, project.splashPath) && r.a(this.primaryColor, project.primaryColor) && r.a(this.orientation, project.orientation) && this.showHeader == project.showHeader && this.showActionBar == project.showActionBar && this.keepScreenOn == project.keepScreenOn && this.showCameraCutout == project.showCameraCutout && this.desktopMode == project.desktopMode && r.a(this.webViewSettings, project.webViewSettings) && r.a(this.keystoreId, project.keystoreId) && r.a(this.outputFormat, project.outputFormat) && r.a(this.buildMode, project.buildMode) && this.showWatermark == project.showWatermark && this.autoIncrementVersionCode == project.autoIncrementVersionCode && r.a(this.deepLinkScheme, project.deepLinkScheme) && this.billingEnabled == project.billingEnabled && r.a(this.billingProductId, project.billingProductId) && r.a(this.billingSubscriptionId, project.billingSubscriptionId) && r.a(this.billingType, project.billingType) && this.billingTestMode == project.billingTestMode && this.billingAutoConsume == project.billingAutoConsume && this.billingAcknowledge == project.billingAcknowledge && this.billingEnablePendingPurchases == project.billingEnablePendingPurchases && r.a(this.billingSubscriptionPeriod, project.billingSubscriptionPeriod) && this.billingFreeTrialDays == project.billingFreeTrialDays && r.a(this.billingIntroductoryPrice, project.billingIntroductoryPrice) && r.a(this.billingProductName, project.billingProductName) && r.a(this.billingProductDescription, project.billingProductDescription) && this.admobEnabled == project.admobEnabled && r.a(this.admobAppId, project.admobAppId) && r.a(this.admobBannerUnitId, project.admobBannerUnitId) && r.a(this.admobInterstitialUnitId, project.admobInterstitialUnitId) && r.a(this.admobRewardedUnitId, project.admobRewardedUnitId) && r.a(this.admobBannerPosition, project.admobBannerPosition) && this.admobShowBannerOnStart == project.admobShowBannerOnStart && r.a(this.admobTestDeviceIds, project.admobTestDeviceIds) && this.admobAutoLoadInterstitial == project.admobAutoLoadInterstitial && this.admobAutoLoadRewarded == project.admobAutoLoadRewarded && this.admobUseTestAds == project.admobUseTestAds && this.admobBannerEnabled == project.admobBannerEnabled && this.admobInterstitialEnabled == project.admobInterstitialEnabled && this.admobRewardedEnabled == project.admobRewardedEnabled && this.admobInterstitialIntervalSeconds == project.admobInterstitialIntervalSeconds && this.admobInterstitialPageCount == project.admobInterstitialPageCount && this.admobChildDirectedTreatment == project.admobChildDirectedTreatment && this.admobUnderAgeOfConsent == project.admobUnderAgeOfConsent && r.a(this.admobMaxAdContentRating, project.admobMaxAdContentRating) && this.umpDebugEnabled == project.umpDebugEnabled && r.a(this.umpDebugGeography, project.umpDebugGeography) && r.a(this.umpTestDeviceIds, project.umpTestDeviceIds) && this.createdAt == project.createdAt && this.updatedAt == project.updatedAt;
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

    public final ContentSource getContentSource() {
        return this.contentSource;
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

    public final String getIconPath() {
        return this.iconPath;
    }

    public final long getId() {
        return this.f5744id;
    }

    public final boolean getKeepScreenOn() {
        return this.keepScreenOn;
    }

    public final Long getKeystoreId() {
        return this.keystoreId;
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

    public final List<String> getPermissions() {
        return this.permissions;
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

    public final WebViewSettings getWebViewSettings() {
        return this.webViewSettings;
    }

    public int hashCode() {
        int iA = a1.a(this.targetSdk, a1.a(this.minSdk, k.a(a1.a(this.versionCode, k.a(k.a(k.a(Long.hashCode(this.f5744id) * 31, 31, this.name), 31, this.appName), 31, this.packageName), 31), 31, this.versionName), 31), 31);
        Integer num = this.maxSdk;
        int iHashCode = (this.contentSource.hashCode() + ((iA + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        String str = this.sourcePath;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sourceUrl;
        int iA2 = a.a(this.permissions, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.iconPath;
        int iHashCode3 = (iA2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.splashPath;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.primaryColor;
        int iHashCode5 = (this.webViewSettings.hashCode() + o2.a(o2.a(o2.a(o2.a(o2.a(k.a((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.orientation), 31, this.showHeader), 31, this.showActionBar), 31, this.keepScreenOn), 31, this.showCameraCutout), 31, this.desktopMode)) * 31;
        Long l10 = this.keystoreId;
        int iA3 = o2.a(o2.a(k.a(k.a((iHashCode5 + (l10 == null ? 0 : l10.hashCode())) * 31, 31, this.outputFormat), 31, this.buildMode), 31, this.showWatermark), 31, this.autoIncrementVersionCode);
        String str6 = this.deepLinkScheme;
        int iA4 = o2.a((iA3 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.billingEnabled);
        String str7 = this.billingProductId;
        int iHashCode6 = (iA4 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.billingSubscriptionId;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.billingType;
        int iA5 = o2.a(o2.a(o2.a(o2.a((iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.billingTestMode), 31, this.billingAutoConsume), 31, this.billingAcknowledge), 31, this.billingEnablePendingPurchases);
        String str10 = this.billingSubscriptionPeriod;
        int iA6 = a1.a(this.billingFreeTrialDays, (iA5 + (str10 == null ? 0 : str10.hashCode())) * 31, 31);
        String str11 = this.billingIntroductoryPrice;
        int iHashCode8 = (iA6 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.billingProductName;
        int iHashCode9 = (iHashCode8 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.billingProductDescription;
        int iA7 = o2.a((iHashCode9 + (str13 == null ? 0 : str13.hashCode())) * 31, 31, this.admobEnabled);
        String str14 = this.admobAppId;
        int iHashCode10 = (iA7 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.admobBannerUnitId;
        int iHashCode11 = (iHashCode10 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.admobInterstitialUnitId;
        int iHashCode12 = (iHashCode11 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.admobRewardedUnitId;
        int iHashCode13 = (iHashCode12 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.admobBannerPosition;
        int iA8 = o2.a((iHashCode13 + (str18 == null ? 0 : str18.hashCode())) * 31, 31, this.admobShowBannerOnStart);
        String str19 = this.admobTestDeviceIds;
        int iA9 = k.a(o2.a(k.a(a1.a(this.admobUnderAgeOfConsent, a1.a(this.admobChildDirectedTreatment, a1.a(this.admobInterstitialPageCount, a1.a(this.admobInterstitialIntervalSeconds, o2.a(o2.a(o2.a(o2.a(o2.a(o2.a((iA8 + (str19 == null ? 0 : str19.hashCode())) * 31, 31, this.admobAutoLoadInterstitial), 31, this.admobAutoLoadRewarded), 31, this.admobUseTestAds), 31, this.admobBannerEnabled), 31, this.admobInterstitialEnabled), 31, this.admobRewardedEnabled), 31), 31), 31), 31), 31, this.admobMaxAdContentRating), 31, this.umpDebugEnabled), 31, this.umpDebugGeography);
        String str20 = this.umpTestDeviceIds;
        return Long.hashCode(this.updatedAt) + e2.a((iA9 + (str20 != null ? str20.hashCode() : 0)) * 31, 31, this.createdAt);
    }

    public String toString() {
        long j10 = this.f5744id;
        String str = this.name;
        String str2 = this.appName;
        String str3 = this.packageName;
        int i10 = this.versionCode;
        String str4 = this.versionName;
        int i11 = this.minSdk;
        int i12 = this.targetSdk;
        Integer num = this.maxSdk;
        ContentSource contentSource = this.contentSource;
        String str5 = this.sourcePath;
        String str6 = this.sourceUrl;
        List<String> list = this.permissions;
        String str7 = this.iconPath;
        String str8 = this.splashPath;
        String str9 = this.primaryColor;
        String str10 = this.orientation;
        boolean z10 = this.showHeader;
        boolean z11 = this.showActionBar;
        boolean z12 = this.keepScreenOn;
        boolean z13 = this.showCameraCutout;
        boolean z14 = this.desktopMode;
        WebViewSettings webViewSettings = this.webViewSettings;
        Long l10 = this.keystoreId;
        String str11 = this.outputFormat;
        String str12 = this.buildMode;
        boolean z15 = this.showWatermark;
        boolean z16 = this.autoIncrementVersionCode;
        String str13 = this.deepLinkScheme;
        boolean z17 = this.billingEnabled;
        String str14 = this.billingProductId;
        String str15 = this.billingSubscriptionId;
        String str16 = this.billingType;
        boolean z18 = this.billingTestMode;
        boolean z19 = this.billingAutoConsume;
        boolean z20 = this.billingAcknowledge;
        boolean z21 = this.billingEnablePendingPurchases;
        String str17 = this.billingSubscriptionPeriod;
        int i13 = this.billingFreeTrialDays;
        String str18 = this.billingIntroductoryPrice;
        String str19 = this.billingProductName;
        String str20 = this.billingProductDescription;
        boolean z22 = this.admobEnabled;
        String str21 = this.admobAppId;
        String str22 = this.admobBannerUnitId;
        String str23 = this.admobInterstitialUnitId;
        String str24 = this.admobRewardedUnitId;
        String str25 = this.admobBannerPosition;
        boolean z23 = this.admobShowBannerOnStart;
        String str26 = this.admobTestDeviceIds;
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
        String str27 = this.admobMaxAdContentRating;
        boolean z30 = this.umpDebugEnabled;
        String str28 = this.umpDebugGeography;
        String str29 = this.umpTestDeviceIds;
        long j11 = this.createdAt;
        long j12 = this.updatedAt;
        StringBuilder sb = new StringBuilder("Project(id=");
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
        sb.append(", contentSource=");
        sb.append(contentSource);
        z0.a(sb, ", sourcePath=", str5, ", sourceUrl=", str6);
        sb.append(", permissions=");
        sb.append(list);
        sb.append(", iconPath=");
        sb.append(str7);
        z0.a(sb, ", splashPath=", str8, ", primaryColor=", str9);
        sb.append(", orientation=");
        sb.append(str10);
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
        sb.append(", webViewSettings=");
        sb.append(webViewSettings);
        sb.append(", keystoreId=");
        sb.append(l10);
        z0.a(sb, ", outputFormat=", str11, ", buildMode=", str12);
        sb.append(", showWatermark=");
        sb.append(z15);
        sb.append(", autoIncrementVersionCode=");
        sb.append(z16);
        sb.append(", deepLinkScheme=");
        sb.append(str13);
        sb.append(", billingEnabled=");
        sb.append(z17);
        z0.a(sb, ", billingProductId=", str14, ", billingSubscriptionId=", str15);
        sb.append(", billingType=");
        sb.append(str16);
        sb.append(", billingTestMode=");
        sb.append(z18);
        sb.append(", billingAutoConsume=");
        sb.append(z19);
        sb.append(", billingAcknowledge=");
        sb.append(z20);
        sb.append(", billingEnablePendingPurchases=");
        sb.append(z21);
        sb.append(", billingSubscriptionPeriod=");
        sb.append(str17);
        sb.append(", billingFreeTrialDays=");
        sb.append(i13);
        sb.append(", billingIntroductoryPrice=");
        sb.append(str18);
        z0.a(sb, ", billingProductName=", str19, ", billingProductDescription=", str20);
        sb.append(", admobEnabled=");
        sb.append(z22);
        sb.append(", admobAppId=");
        sb.append(str21);
        z0.a(sb, ", admobBannerUnitId=", str22, ", admobInterstitialUnitId=", str23);
        z0.a(sb, ", admobRewardedUnitId=", str24, ", admobBannerPosition=", str25);
        sb.append(", admobShowBannerOnStart=");
        sb.append(z23);
        sb.append(", admobTestDeviceIds=");
        sb.append(str26);
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
        sb.append(str27);
        sb.append(", umpDebugEnabled=");
        sb.append(z30);
        z0.a(sb, ", umpDebugGeography=", str28, ", umpTestDeviceIds=", str29);
        sb.append(", createdAt=");
        sb.append(j11);
        sb.append(", updatedAt=");
        return com.android.apksig.internal.apk.a.a(j12, ")", sb);
    }

    public Project(long j10, String name, String appName, String packageName, int i10, String versionName, int i11, int i12, Integer num, ContentSource contentSource, String str, String str2, List<String> permissions, String str3, String str4, String str5, String orientation, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, WebViewSettings webViewSettings, Long l10, String outputFormat, String buildMode, boolean z15, boolean z16, String str6, boolean z17, String str7, String str8, String str9, boolean z18, boolean z19, boolean z20, boolean z21, String str10, int i13, String str11, String str12, String str13, boolean z22, String str14, String str15, String str16, String str17, String str18, boolean z23, String str19, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, int i14, int i15, int i16, int i17, String admobMaxAdContentRating, boolean z30, String umpDebugGeography, String str20, long j11, long j12) {
        r.e(name, "name");
        r.e(appName, "appName");
        r.e(packageName, "packageName");
        r.e(versionName, "versionName");
        r.e(contentSource, "contentSource");
        r.e(permissions, "permissions");
        r.e(orientation, "orientation");
        r.e(webViewSettings, "webViewSettings");
        r.e(outputFormat, "outputFormat");
        r.e(buildMode, "buildMode");
        r.e(admobMaxAdContentRating, "admobMaxAdContentRating");
        r.e(umpDebugGeography, "umpDebugGeography");
        this.f5744id = j10;
        this.name = name;
        this.appName = appName;
        this.packageName = packageName;
        this.versionCode = i10;
        this.versionName = versionName;
        this.minSdk = i11;
        this.targetSdk = i12;
        this.maxSdk = num;
        this.contentSource = contentSource;
        this.sourcePath = str;
        this.sourceUrl = str2;
        this.permissions = permissions;
        this.iconPath = str3;
        this.splashPath = str4;
        this.primaryColor = str5;
        this.orientation = orientation;
        this.showHeader = z10;
        this.showActionBar = z11;
        this.keepScreenOn = z12;
        this.showCameraCutout = z13;
        this.desktopMode = z14;
        this.webViewSettings = webViewSettings;
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
        this.createdAt = j11;
        this.updatedAt = j12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Project(long j10, String str, String str2, String str3, int i10, String str4, int i11, int i12, Integer num, ContentSource contentSource, String str5, String str6, List list, String str7, String str8, String str9, String str10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, WebViewSettings webViewSettings, Long l10, String str11, String str12, boolean z15, boolean z16, String str13, boolean z17, String str14, String str15, String str16, boolean z18, boolean z19, boolean z20, boolean z21, String str17, int i13, String str18, String str19, String str20, boolean z22, String str21, String str22, String str23, String str24, String str25, boolean z23, String str26, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, int i14, int i15, int i16, int i17, String str27, boolean z30, String str28, String str29, long j11, long j12, int i18, int i19, int i20, j jVar) {
        long jCurrentTimeMillis;
        String str30;
        String str31;
        int i21;
        String str32;
        int i22;
        int i23;
        ContentSource contentSource2;
        String str33;
        Long l11;
        String str34;
        String str35;
        boolean z31;
        boolean z32;
        String str36;
        boolean z33;
        String str37;
        String str38;
        boolean z34;
        boolean z35;
        boolean z36;
        String str39;
        int i24;
        long j13 = (i18 & 1) != 0 ? 0L : j10;
        Integer num2 = (i18 & 256) != 0 ? null : num;
        String str40 = (i18 & 1024) != 0 ? null : str5;
        String str41 = (i18 & 2048) != 0 ? null : str6;
        List list2 = (i18 & 4096) != 0 ? z.f22752a : list;
        String str42 = (i18 & 8192) != 0 ? null : str7;
        String str43 = (i18 & 16384) != 0 ? null : str8;
        String str44 = (i18 & 32768) != 0 ? null : str9;
        String str45 = (i18 & 65536) != 0 ? "portrait" : str10;
        boolean z37 = (i18 & 131072) != 0 ? true : z10;
        boolean z38 = (i18 & PKIFailureInfo.transactionIdInUse) != 0 ? false : z11;
        boolean z39 = (i18 & PKIFailureInfo.signerNotTrusted) != 0 ? false : z12;
        boolean z40 = (i18 & PKIFailureInfo.badCertTemplate) != 0 ? false : z13;
        boolean z41 = (i18 & PKIFailureInfo.badSenderNonce) != 0 ? false : z14;
        WebViewSettings webViewSettings2 = (i18 & 4194304) != 0 ? new WebViewSettings(false, false, false, false, false, false, false, false, false, false, 0, 0, (String) null, 0, false, false, false, false, false, false, false, (Boolean) null, false, (String) null, false, (String) null, 0, 0, 0, 0, 0, 0, 0, (String) null, false, false, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, false, false, false, false, false, false, false, 0, -1, 4194303, (j) null) : webViewSettings;
        Long l12 = (i18 & 8388608) != 0 ? null : l10;
        String str46 = (i18 & 16777216) != 0 ? ProjectKind.APK : str11;
        String str47 = (i18 & 33554432) != 0 ? "advanced" : str12;
        boolean z42 = (i18 & 67108864) != 0 ? false : z15;
        boolean z43 = (i18 & 134217728) != 0 ? false : z16;
        String str48 = (i18 & 268435456) != 0 ? null : str13;
        boolean z44 = (i18 & PKIFailureInfo.duplicateCertReq) != 0 ? false : z17;
        String str49 = (i18 & 1073741824) != 0 ? null : str14;
        String str50 = (i18 & PKIFailureInfo.systemUnavail) != 0 ? null : str15;
        String str51 = (i19 & 1) != 0 ? "non_consumable" : str16;
        boolean z45 = (i19 & 2) != 0 ? false : z18;
        boolean z46 = (i19 & 4) != 0 ? true : z19;
        boolean z47 = (i19 & 8) != 0 ? true : z20;
        boolean z48 = (i19 & 16) == 0 ? z21 : true;
        String str52 = (i19 & 32) != 0 ? null : str17;
        int i25 = (i19 & 64) != 0 ? 0 : i13;
        String str53 = (i19 & 128) != 0 ? null : str18;
        String str54 = (i19 & 256) != 0 ? null : str19;
        String str55 = (i19 & 512) != 0 ? null : str20;
        boolean z49 = (i19 & 1024) != 0 ? false : z22;
        String str56 = (i19 & 2048) != 0 ? null : str21;
        String str57 = (i19 & 4096) != 0 ? null : str22;
        String str58 = (i19 & 8192) != 0 ? null : str23;
        String str59 = (i19 & 16384) != 0 ? null : str24;
        String str60 = (i19 & 32768) != 0 ? "bottom" : str25;
        boolean z50 = (i19 & 65536) != 0 ? false : z23;
        String str61 = (i19 & 131072) != 0 ? null : str26;
        boolean z51 = (i19 & PKIFailureInfo.transactionIdInUse) != 0 ? false : z24;
        boolean z52 = (i19 & PKIFailureInfo.signerNotTrusted) != 0 ? false : z25;
        boolean z53 = (i19 & PKIFailureInfo.badCertTemplate) != 0 ? false : z26;
        boolean z54 = (i19 & PKIFailureInfo.badSenderNonce) != 0 ? false : z27;
        boolean z55 = (i19 & 4194304) != 0 ? false : z28;
        boolean z56 = (i19 & 8388608) != 0 ? false : z29;
        int i26 = (i19 & 16777216) != 0 ? 0 : i14;
        int i27 = (i19 & 33554432) != 0 ? 0 : i15;
        int i28 = (i19 & 67108864) != 0 ? -1 : i16;
        int i29 = (i19 & 134217728) != 0 ? -1 : i17;
        String str62 = (268435456 & i19) != 0 ? "" : str27;
        boolean z57 = (536870912 & i19) != 0 ? false : z30;
        String str63 = (1073741824 & i19) != 0 ? "DISABLED" : str28;
        String str64 = (i19 & PKIFailureInfo.systemUnavail) != 0 ? null : str29;
        long jCurrentTimeMillis2 = (i20 & 1) != 0 ? System.currentTimeMillis() : j11;
        if ((i20 & 2) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
            i21 = i10;
            str32 = str4;
            i22 = i11;
            i23 = i12;
            contentSource2 = contentSource;
            str33 = str50;
            l11 = l12;
            str34 = str46;
            str35 = str47;
            z31 = z42;
            z32 = z43;
            str36 = str48;
            z33 = z44;
            str37 = str49;
            str38 = str51;
            z34 = z45;
            z35 = z46;
            z36 = z47;
            str39 = str52;
            i24 = i25;
            str30 = str;
            str31 = str2;
        } else {
            jCurrentTimeMillis = j12;
            str30 = str;
            str31 = str2;
            i21 = i10;
            str32 = str4;
            i22 = i11;
            i23 = i12;
            contentSource2 = contentSource;
            str33 = str50;
            l11 = l12;
            str34 = str46;
            str35 = str47;
            z31 = z42;
            z32 = z43;
            str36 = str48;
            z33 = z44;
            str37 = str49;
            str38 = str51;
            z34 = z45;
            z35 = z46;
            z36 = z47;
            str39 = str52;
            i24 = i25;
        }
        this(j13, str30, str31, str3, i21, str32, i22, i23, num2, contentSource2, str40, str41, list2, str42, str43, str44, str45, z37, z38, z39, z40, z41, webViewSettings2, l11, str34, str35, z31, z32, str36, z33, str37, str33, str38, z34, z35, z36, z48, str39, i24, str53, str54, str55, z49, str56, str57, str58, str59, str60, z50, str61, z51, z52, z53, z54, z55, z56, i26, i27, i28, i29, str62, z57, str63, str64, jCurrentTimeMillis2, jCurrentTimeMillis);
    }
}
