package com.basitce.htmltoapk.data.local.dao;

import androidx.room.g0;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.internal.o0;
import pg.f0;

/* loaded from: classes.dex */
public final class ProjectDao_Impl implements ProjectDao {
    private final g0 __db;
    private final androidx.room.f<ProjectEntity> __insertAdapterOfProjectEntity = new androidx.room.f<ProjectEntity>() { // from class: com.basitce.htmltoapk.data.local.dao.ProjectDao_Impl.1
        @Override // androidx.room.f
        public String createQuery() {
            return "INSERT OR REPLACE INTO `projects` (`id`,`name`,`appName`,`packageName`,`versionCode`,`versionName`,`minSdk`,`targetSdk`,`maxSdk`,`contentSourceType`,`sourcePath`,`sourceUrl`,`permissionsJson`,`iconPath`,`splashPath`,`primaryColor`,`orientation`,`showHeader`,`showActionBar`,`keepScreenOn`,`showCameraCutout`,`desktopMode`,`webViewSettingsJson`,`keystoreId`,`outputFormat`,`buildMode`,`showWatermark`,`autoIncrementVersionCode`,`deepLinkScheme`,`billingEnabled`,`billingProductId`,`billingSubscriptionId`,`billingType`,`billingTestMode`,`billingAutoConsume`,`billingAcknowledge`,`billingEnablePendingPurchases`,`billingSubscriptionPeriod`,`billingFreeTrialDays`,`billingIntroductoryPrice`,`billingProductName`,`billingProductDescription`,`admobEnabled`,`admobAppId`,`admobBannerUnitId`,`admobInterstitialUnitId`,`admobRewardedUnitId`,`admobBannerPosition`,`admobShowBannerOnStart`,`admobTestDeviceIds`,`admobAutoLoadInterstitial`,`admobAutoLoadRewarded`,`admobUseTestAds`,`admobBannerEnabled`,`admobInterstitialEnabled`,`admobRewardedEnabled`,`admobInterstitialIntervalSeconds`,`admobInterstitialPageCount`,`admobChildDirectedTreatment`,`admobUnderAgeOfConsent`,`admobMaxAdContentRating`,`umpDebugEnabled`,`umpDebugGeography`,`umpTestDeviceIds`,`kind`,`folderId`,`createdAt`,`updatedAt`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // androidx.room.f
        public void bind(h6.d dVar, ProjectEntity projectEntity) {
            dVar.d(1, projectEntity.getId());
            if (projectEntity.getName() == null) {
                dVar.e(2);
            } else {
                dVar.C(2, projectEntity.getName());
            }
            if (projectEntity.getAppName() == null) {
                dVar.e(3);
            } else {
                dVar.C(3, projectEntity.getAppName());
            }
            if (projectEntity.getPackageName() == null) {
                dVar.e(4);
            } else {
                dVar.C(4, projectEntity.getPackageName());
            }
            dVar.d(5, projectEntity.getVersionCode());
            if (projectEntity.getVersionName() == null) {
                dVar.e(6);
            } else {
                dVar.C(6, projectEntity.getVersionName());
            }
            dVar.d(7, projectEntity.getMinSdk());
            dVar.d(8, projectEntity.getTargetSdk());
            if (projectEntity.getMaxSdk() == null) {
                dVar.e(9);
            } else {
                dVar.d(9, projectEntity.getMaxSdk().intValue());
            }
            if (projectEntity.getContentSourceType() == null) {
                dVar.e(10);
            } else {
                dVar.C(10, projectEntity.getContentSourceType());
            }
            if (projectEntity.getSourcePath() == null) {
                dVar.e(11);
            } else {
                dVar.C(11, projectEntity.getSourcePath());
            }
            if (projectEntity.getSourceUrl() == null) {
                dVar.e(12);
            } else {
                dVar.C(12, projectEntity.getSourceUrl());
            }
            if (projectEntity.getPermissionsJson() == null) {
                dVar.e(13);
            } else {
                dVar.C(13, projectEntity.getPermissionsJson());
            }
            if (projectEntity.getIconPath() == null) {
                dVar.e(14);
            } else {
                dVar.C(14, projectEntity.getIconPath());
            }
            if (projectEntity.getSplashPath() == null) {
                dVar.e(15);
            } else {
                dVar.C(15, projectEntity.getSplashPath());
            }
            if (projectEntity.getPrimaryColor() == null) {
                dVar.e(16);
            } else {
                dVar.C(16, projectEntity.getPrimaryColor());
            }
            if (projectEntity.getOrientation() == null) {
                dVar.e(17);
            } else {
                dVar.C(17, projectEntity.getOrientation());
            }
            dVar.d(18, projectEntity.getShowHeader() ? 1L : 0L);
            dVar.d(19, projectEntity.getShowActionBar() ? 1L : 0L);
            dVar.d(20, projectEntity.getKeepScreenOn() ? 1L : 0L);
            dVar.d(21, projectEntity.getShowCameraCutout() ? 1L : 0L);
            dVar.d(22, projectEntity.getDesktopMode() ? 1L : 0L);
            if (projectEntity.getWebViewSettingsJson() == null) {
                dVar.e(23);
            } else {
                dVar.C(23, projectEntity.getWebViewSettingsJson());
            }
            if (projectEntity.getKeystoreId() == null) {
                dVar.e(24);
            } else {
                dVar.d(24, projectEntity.getKeystoreId().longValue());
            }
            if (projectEntity.getOutputFormat() == null) {
                dVar.e(25);
            } else {
                dVar.C(25, projectEntity.getOutputFormat());
            }
            if (projectEntity.getBuildMode() == null) {
                dVar.e(26);
            } else {
                dVar.C(26, projectEntity.getBuildMode());
            }
            dVar.d(27, projectEntity.getShowWatermark() ? 1L : 0L);
            dVar.d(28, projectEntity.getAutoIncrementVersionCode() ? 1L : 0L);
            if (projectEntity.getDeepLinkScheme() == null) {
                dVar.e(29);
            } else {
                dVar.C(29, projectEntity.getDeepLinkScheme());
            }
            dVar.d(30, projectEntity.getBillingEnabled() ? 1L : 0L);
            if (projectEntity.getBillingProductId() == null) {
                dVar.e(31);
            } else {
                dVar.C(31, projectEntity.getBillingProductId());
            }
            if (projectEntity.getBillingSubscriptionId() == null) {
                dVar.e(32);
            } else {
                dVar.C(32, projectEntity.getBillingSubscriptionId());
            }
            if (projectEntity.getBillingType() == null) {
                dVar.e(33);
            } else {
                dVar.C(33, projectEntity.getBillingType());
            }
            dVar.d(34, projectEntity.getBillingTestMode() ? 1L : 0L);
            dVar.d(35, projectEntity.getBillingAutoConsume() ? 1L : 0L);
            dVar.d(36, projectEntity.getBillingAcknowledge() ? 1L : 0L);
            dVar.d(37, projectEntity.getBillingEnablePendingPurchases() ? 1L : 0L);
            if (projectEntity.getBillingSubscriptionPeriod() == null) {
                dVar.e(38);
            } else {
                dVar.C(38, projectEntity.getBillingSubscriptionPeriod());
            }
            dVar.d(39, projectEntity.getBillingFreeTrialDays());
            if (projectEntity.getBillingIntroductoryPrice() == null) {
                dVar.e(40);
            } else {
                dVar.C(40, projectEntity.getBillingIntroductoryPrice());
            }
            if (projectEntity.getBillingProductName() == null) {
                dVar.e(41);
            } else {
                dVar.C(41, projectEntity.getBillingProductName());
            }
            if (projectEntity.getBillingProductDescription() == null) {
                dVar.e(42);
            } else {
                dVar.C(42, projectEntity.getBillingProductDescription());
            }
            dVar.d(43, projectEntity.getAdmobEnabled() ? 1L : 0L);
            if (projectEntity.getAdmobAppId() == null) {
                dVar.e(44);
            } else {
                dVar.C(44, projectEntity.getAdmobAppId());
            }
            if (projectEntity.getAdmobBannerUnitId() == null) {
                dVar.e(45);
            } else {
                dVar.C(45, projectEntity.getAdmobBannerUnitId());
            }
            if (projectEntity.getAdmobInterstitialUnitId() == null) {
                dVar.e(46);
            } else {
                dVar.C(46, projectEntity.getAdmobInterstitialUnitId());
            }
            if (projectEntity.getAdmobRewardedUnitId() == null) {
                dVar.e(47);
            } else {
                dVar.C(47, projectEntity.getAdmobRewardedUnitId());
            }
            if (projectEntity.getAdmobBannerPosition() == null) {
                dVar.e(48);
            } else {
                dVar.C(48, projectEntity.getAdmobBannerPosition());
            }
            dVar.d(49, projectEntity.getAdmobShowBannerOnStart() ? 1L : 0L);
            if (projectEntity.getAdmobTestDeviceIds() == null) {
                dVar.e(50);
            } else {
                dVar.C(50, projectEntity.getAdmobTestDeviceIds());
            }
            dVar.d(51, projectEntity.getAdmobAutoLoadInterstitial() ? 1L : 0L);
            dVar.d(52, projectEntity.getAdmobAutoLoadRewarded() ? 1L : 0L);
            dVar.d(53, projectEntity.getAdmobUseTestAds() ? 1L : 0L);
            dVar.d(54, projectEntity.getAdmobBannerEnabled() ? 1L : 0L);
            dVar.d(55, projectEntity.getAdmobInterstitialEnabled() ? 1L : 0L);
            dVar.d(56, projectEntity.getAdmobRewardedEnabled() ? 1L : 0L);
            dVar.d(57, projectEntity.getAdmobInterstitialIntervalSeconds());
            dVar.d(58, projectEntity.getAdmobInterstitialPageCount());
            dVar.d(59, projectEntity.getAdmobChildDirectedTreatment());
            dVar.d(60, projectEntity.getAdmobUnderAgeOfConsent());
            if (projectEntity.getAdmobMaxAdContentRating() == null) {
                dVar.e(61);
            } else {
                dVar.C(61, projectEntity.getAdmobMaxAdContentRating());
            }
            dVar.d(62, projectEntity.getUmpDebugEnabled() ? 1L : 0L);
            if (projectEntity.getUmpDebugGeography() == null) {
                dVar.e(63);
            } else {
                dVar.C(63, projectEntity.getUmpDebugGeography());
            }
            if (projectEntity.getUmpTestDeviceIds() == null) {
                dVar.e(64);
            } else {
                dVar.C(64, projectEntity.getUmpTestDeviceIds());
            }
            if (projectEntity.getKind() == null) {
                dVar.e(65);
            } else {
                dVar.C(65, projectEntity.getKind());
            }
            if (projectEntity.getFolderId() == null) {
                dVar.e(66);
            } else {
                dVar.d(66, projectEntity.getFolderId().longValue());
            }
            dVar.d(67, projectEntity.getCreatedAt());
            dVar.d(68, projectEntity.getUpdatedAt());
        }
    };
    private final androidx.room.e<ProjectEntity> __deleteAdapterOfProjectEntity = new androidx.room.e<ProjectEntity>() { // from class: com.basitce.htmltoapk.data.local.dao.ProjectDao_Impl.2
        @Override // androidx.room.e
        public String createQuery() {
            return "DELETE FROM `projects` WHERE `id` = ?";
        }

        @Override // androidx.room.e
        public void bind(h6.d dVar, ProjectEntity projectEntity) {
            dVar.d(1, projectEntity.getId());
        }
    };
    private final androidx.room.e<ProjectEntity> __updateAdapterOfProjectEntity = new androidx.room.e<ProjectEntity>() { // from class: com.basitce.htmltoapk.data.local.dao.ProjectDao_Impl.3
        @Override // androidx.room.e
        public String createQuery() {
            return "UPDATE OR ABORT `projects` SET `id` = ?,`name` = ?,`appName` = ?,`packageName` = ?,`versionCode` = ?,`versionName` = ?,`minSdk` = ?,`targetSdk` = ?,`maxSdk` = ?,`contentSourceType` = ?,`sourcePath` = ?,`sourceUrl` = ?,`permissionsJson` = ?,`iconPath` = ?,`splashPath` = ?,`primaryColor` = ?,`orientation` = ?,`showHeader` = ?,`showActionBar` = ?,`keepScreenOn` = ?,`showCameraCutout` = ?,`desktopMode` = ?,`webViewSettingsJson` = ?,`keystoreId` = ?,`outputFormat` = ?,`buildMode` = ?,`showWatermark` = ?,`autoIncrementVersionCode` = ?,`deepLinkScheme` = ?,`billingEnabled` = ?,`billingProductId` = ?,`billingSubscriptionId` = ?,`billingType` = ?,`billingTestMode` = ?,`billingAutoConsume` = ?,`billingAcknowledge` = ?,`billingEnablePendingPurchases` = ?,`billingSubscriptionPeriod` = ?,`billingFreeTrialDays` = ?,`billingIntroductoryPrice` = ?,`billingProductName` = ?,`billingProductDescription` = ?,`admobEnabled` = ?,`admobAppId` = ?,`admobBannerUnitId` = ?,`admobInterstitialUnitId` = ?,`admobRewardedUnitId` = ?,`admobBannerPosition` = ?,`admobShowBannerOnStart` = ?,`admobTestDeviceIds` = ?,`admobAutoLoadInterstitial` = ?,`admobAutoLoadRewarded` = ?,`admobUseTestAds` = ?,`admobBannerEnabled` = ?,`admobInterstitialEnabled` = ?,`admobRewardedEnabled` = ?,`admobInterstitialIntervalSeconds` = ?,`admobInterstitialPageCount` = ?,`admobChildDirectedTreatment` = ?,`admobUnderAgeOfConsent` = ?,`admobMaxAdContentRating` = ?,`umpDebugEnabled` = ?,`umpDebugGeography` = ?,`umpTestDeviceIds` = ?,`kind` = ?,`folderId` = ?,`createdAt` = ?,`updatedAt` = ? WHERE `id` = ?";
        }

        @Override // androidx.room.e
        public void bind(h6.d dVar, ProjectEntity projectEntity) {
            dVar.d(1, projectEntity.getId());
            if (projectEntity.getName() == null) {
                dVar.e(2);
            } else {
                dVar.C(2, projectEntity.getName());
            }
            if (projectEntity.getAppName() == null) {
                dVar.e(3);
            } else {
                dVar.C(3, projectEntity.getAppName());
            }
            if (projectEntity.getPackageName() == null) {
                dVar.e(4);
            } else {
                dVar.C(4, projectEntity.getPackageName());
            }
            dVar.d(5, projectEntity.getVersionCode());
            if (projectEntity.getVersionName() == null) {
                dVar.e(6);
            } else {
                dVar.C(6, projectEntity.getVersionName());
            }
            dVar.d(7, projectEntity.getMinSdk());
            dVar.d(8, projectEntity.getTargetSdk());
            if (projectEntity.getMaxSdk() == null) {
                dVar.e(9);
            } else {
                dVar.d(9, projectEntity.getMaxSdk().intValue());
            }
            if (projectEntity.getContentSourceType() == null) {
                dVar.e(10);
            } else {
                dVar.C(10, projectEntity.getContentSourceType());
            }
            if (projectEntity.getSourcePath() == null) {
                dVar.e(11);
            } else {
                dVar.C(11, projectEntity.getSourcePath());
            }
            if (projectEntity.getSourceUrl() == null) {
                dVar.e(12);
            } else {
                dVar.C(12, projectEntity.getSourceUrl());
            }
            if (projectEntity.getPermissionsJson() == null) {
                dVar.e(13);
            } else {
                dVar.C(13, projectEntity.getPermissionsJson());
            }
            if (projectEntity.getIconPath() == null) {
                dVar.e(14);
            } else {
                dVar.C(14, projectEntity.getIconPath());
            }
            if (projectEntity.getSplashPath() == null) {
                dVar.e(15);
            } else {
                dVar.C(15, projectEntity.getSplashPath());
            }
            if (projectEntity.getPrimaryColor() == null) {
                dVar.e(16);
            } else {
                dVar.C(16, projectEntity.getPrimaryColor());
            }
            if (projectEntity.getOrientation() == null) {
                dVar.e(17);
            } else {
                dVar.C(17, projectEntity.getOrientation());
            }
            dVar.d(18, projectEntity.getShowHeader() ? 1L : 0L);
            dVar.d(19, projectEntity.getShowActionBar() ? 1L : 0L);
            dVar.d(20, projectEntity.getKeepScreenOn() ? 1L : 0L);
            dVar.d(21, projectEntity.getShowCameraCutout() ? 1L : 0L);
            dVar.d(22, projectEntity.getDesktopMode() ? 1L : 0L);
            if (projectEntity.getWebViewSettingsJson() == null) {
                dVar.e(23);
            } else {
                dVar.C(23, projectEntity.getWebViewSettingsJson());
            }
            if (projectEntity.getKeystoreId() == null) {
                dVar.e(24);
            } else {
                dVar.d(24, projectEntity.getKeystoreId().longValue());
            }
            if (projectEntity.getOutputFormat() == null) {
                dVar.e(25);
            } else {
                dVar.C(25, projectEntity.getOutputFormat());
            }
            if (projectEntity.getBuildMode() == null) {
                dVar.e(26);
            } else {
                dVar.C(26, projectEntity.getBuildMode());
            }
            dVar.d(27, projectEntity.getShowWatermark() ? 1L : 0L);
            dVar.d(28, projectEntity.getAutoIncrementVersionCode() ? 1L : 0L);
            if (projectEntity.getDeepLinkScheme() == null) {
                dVar.e(29);
            } else {
                dVar.C(29, projectEntity.getDeepLinkScheme());
            }
            dVar.d(30, projectEntity.getBillingEnabled() ? 1L : 0L);
            if (projectEntity.getBillingProductId() == null) {
                dVar.e(31);
            } else {
                dVar.C(31, projectEntity.getBillingProductId());
            }
            if (projectEntity.getBillingSubscriptionId() == null) {
                dVar.e(32);
            } else {
                dVar.C(32, projectEntity.getBillingSubscriptionId());
            }
            if (projectEntity.getBillingType() == null) {
                dVar.e(33);
            } else {
                dVar.C(33, projectEntity.getBillingType());
            }
            dVar.d(34, projectEntity.getBillingTestMode() ? 1L : 0L);
            dVar.d(35, projectEntity.getBillingAutoConsume() ? 1L : 0L);
            dVar.d(36, projectEntity.getBillingAcknowledge() ? 1L : 0L);
            dVar.d(37, projectEntity.getBillingEnablePendingPurchases() ? 1L : 0L);
            if (projectEntity.getBillingSubscriptionPeriod() == null) {
                dVar.e(38);
            } else {
                dVar.C(38, projectEntity.getBillingSubscriptionPeriod());
            }
            dVar.d(39, projectEntity.getBillingFreeTrialDays());
            if (projectEntity.getBillingIntroductoryPrice() == null) {
                dVar.e(40);
            } else {
                dVar.C(40, projectEntity.getBillingIntroductoryPrice());
            }
            if (projectEntity.getBillingProductName() == null) {
                dVar.e(41);
            } else {
                dVar.C(41, projectEntity.getBillingProductName());
            }
            if (projectEntity.getBillingProductDescription() == null) {
                dVar.e(42);
            } else {
                dVar.C(42, projectEntity.getBillingProductDescription());
            }
            dVar.d(43, projectEntity.getAdmobEnabled() ? 1L : 0L);
            if (projectEntity.getAdmobAppId() == null) {
                dVar.e(44);
            } else {
                dVar.C(44, projectEntity.getAdmobAppId());
            }
            if (projectEntity.getAdmobBannerUnitId() == null) {
                dVar.e(45);
            } else {
                dVar.C(45, projectEntity.getAdmobBannerUnitId());
            }
            if (projectEntity.getAdmobInterstitialUnitId() == null) {
                dVar.e(46);
            } else {
                dVar.C(46, projectEntity.getAdmobInterstitialUnitId());
            }
            if (projectEntity.getAdmobRewardedUnitId() == null) {
                dVar.e(47);
            } else {
                dVar.C(47, projectEntity.getAdmobRewardedUnitId());
            }
            if (projectEntity.getAdmobBannerPosition() == null) {
                dVar.e(48);
            } else {
                dVar.C(48, projectEntity.getAdmobBannerPosition());
            }
            dVar.d(49, projectEntity.getAdmobShowBannerOnStart() ? 1L : 0L);
            if (projectEntity.getAdmobTestDeviceIds() == null) {
                dVar.e(50);
            } else {
                dVar.C(50, projectEntity.getAdmobTestDeviceIds());
            }
            dVar.d(51, projectEntity.getAdmobAutoLoadInterstitial() ? 1L : 0L);
            dVar.d(52, projectEntity.getAdmobAutoLoadRewarded() ? 1L : 0L);
            dVar.d(53, projectEntity.getAdmobUseTestAds() ? 1L : 0L);
            dVar.d(54, projectEntity.getAdmobBannerEnabled() ? 1L : 0L);
            dVar.d(55, projectEntity.getAdmobInterstitialEnabled() ? 1L : 0L);
            dVar.d(56, projectEntity.getAdmobRewardedEnabled() ? 1L : 0L);
            dVar.d(57, projectEntity.getAdmobInterstitialIntervalSeconds());
            dVar.d(58, projectEntity.getAdmobInterstitialPageCount());
            dVar.d(59, projectEntity.getAdmobChildDirectedTreatment());
            dVar.d(60, projectEntity.getAdmobUnderAgeOfConsent());
            if (projectEntity.getAdmobMaxAdContentRating() == null) {
                dVar.e(61);
            } else {
                dVar.C(61, projectEntity.getAdmobMaxAdContentRating());
            }
            dVar.d(62, projectEntity.getUmpDebugEnabled() ? 1L : 0L);
            if (projectEntity.getUmpDebugGeography() == null) {
                dVar.e(63);
            } else {
                dVar.C(63, projectEntity.getUmpDebugGeography());
            }
            if (projectEntity.getUmpTestDeviceIds() == null) {
                dVar.e(64);
            } else {
                dVar.C(64, projectEntity.getUmpTestDeviceIds());
            }
            if (projectEntity.getKind() == null) {
                dVar.e(65);
            } else {
                dVar.C(65, projectEntity.getKind());
            }
            if (projectEntity.getFolderId() == null) {
                dVar.e(66);
            } else {
                dVar.d(66, projectEntity.getFolderId().longValue());
            }
            dVar.d(67, projectEntity.getCreatedAt());
            dVar.d(68, projectEntity.getUpdatedAt());
            dVar.d(69, projectEntity.getId());
        }
    };

    public ProjectDao_Impl(g0 g0Var) {
        this.__db = g0Var;
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$clearWatermarks$8(h6.b bVar) throws Exception {
        h6.d dVarB0 = bVar.B0("UPDATE projects SET showWatermark = 0 WHERE showWatermark = 1");
        try {
            dVarB0.t0();
            return Integer.valueOf(b6.m.b(bVar));
        } finally {
            dVarB0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$count$5(h6.b bVar) throws Exception {
        h6.d dVarB0 = bVar.B0("SELECT COUNT(*) FROM projects");
        try {
            Integer numValueOf = null;
            if (dVarB0.t0() && !dVarB0.isNull(0)) {
                numValueOf = Integer.valueOf((int) dVarB0.getLong(0));
            }
            return numValueOf;
        } finally {
            dVarB0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$countByKind$6(String str, h6.b bVar) throws Exception {
        h6.d dVarB0 = bVar.B0("SELECT COUNT(*) FROM projects WHERE kind = ?");
        try {
            if (str == null) {
                dVarB0.e(1);
            } else {
                dVarB0.C(1, str);
            }
            Integer numValueOf = null;
            if (dVarB0.t0() && !dVarB0.isNull(0)) {
                numValueOf = Integer.valueOf((int) dVarB0.getLong(0));
            }
            return numValueOf;
        } finally {
            dVarB0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ f0 lambda$delete$1(ProjectEntity projectEntity, h6.b bVar) {
        this.__deleteAdapterOfProjectEntity.handle(bVar, projectEntity);
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$getAll$3(h6.b bVar) throws Exception {
        String strW;
        int i10;
        int i11;
        int i12;
        Integer numValueOf;
        String strW2;
        int i13;
        int i14;
        int i15;
        boolean z10;
        String strW3;
        int i16;
        String strW4;
        int i17;
        int i18;
        String strW5;
        int i19;
        String strW6;
        int i20;
        int i21;
        String strW7;
        int i22;
        int i23;
        h6.d dVarB0 = bVar.B0("SELECT * FROM projects ORDER BY updatedAt DESC");
        try {
            int iC = b6.n.c(dVarB0, "id");
            int iC2 = b6.n.c(dVarB0, "name");
            int iC3 = b6.n.c(dVarB0, "appName");
            int iC4 = b6.n.c(dVarB0, "packageName");
            int iC5 = b6.n.c(dVarB0, "versionCode");
            int iC6 = b6.n.c(dVarB0, "versionName");
            int iC7 = b6.n.c(dVarB0, "minSdk");
            int iC8 = b6.n.c(dVarB0, "targetSdk");
            int iC9 = b6.n.c(dVarB0, "maxSdk");
            int iC10 = b6.n.c(dVarB0, "contentSourceType");
            int iC11 = b6.n.c(dVarB0, "sourcePath");
            int iC12 = b6.n.c(dVarB0, "sourceUrl");
            int iC13 = b6.n.c(dVarB0, "permissionsJson");
            int iC14 = b6.n.c(dVarB0, "iconPath");
            int iC15 = b6.n.c(dVarB0, "splashPath");
            int iC16 = b6.n.c(dVarB0, "primaryColor");
            int iC17 = b6.n.c(dVarB0, "orientation");
            int iC18 = b6.n.c(dVarB0, "showHeader");
            int iC19 = b6.n.c(dVarB0, "showActionBar");
            int iC20 = b6.n.c(dVarB0, "keepScreenOn");
            int iC21 = b6.n.c(dVarB0, "showCameraCutout");
            int iC22 = b6.n.c(dVarB0, "desktopMode");
            int iC23 = b6.n.c(dVarB0, "webViewSettingsJson");
            int iC24 = b6.n.c(dVarB0, "keystoreId");
            int iC25 = b6.n.c(dVarB0, "outputFormat");
            int iC26 = b6.n.c(dVarB0, "buildMode");
            int iC27 = b6.n.c(dVarB0, "showWatermark");
            int iC28 = b6.n.c(dVarB0, "autoIncrementVersionCode");
            int iC29 = b6.n.c(dVarB0, "deepLinkScheme");
            int iC30 = b6.n.c(dVarB0, "billingEnabled");
            int iC31 = b6.n.c(dVarB0, "billingProductId");
            int iC32 = b6.n.c(dVarB0, "billingSubscriptionId");
            int iC33 = b6.n.c(dVarB0, "billingType");
            int iC34 = b6.n.c(dVarB0, "billingTestMode");
            int iC35 = b6.n.c(dVarB0, "billingAutoConsume");
            int iC36 = b6.n.c(dVarB0, "billingAcknowledge");
            int iC37 = b6.n.c(dVarB0, "billingEnablePendingPurchases");
            int iC38 = b6.n.c(dVarB0, "billingSubscriptionPeriod");
            int iC39 = b6.n.c(dVarB0, "billingFreeTrialDays");
            int iC40 = b6.n.c(dVarB0, "billingIntroductoryPrice");
            int iC41 = b6.n.c(dVarB0, "billingProductName");
            int iC42 = b6.n.c(dVarB0, "billingProductDescription");
            int iC43 = b6.n.c(dVarB0, "admobEnabled");
            int iC44 = b6.n.c(dVarB0, "admobAppId");
            int iC45 = b6.n.c(dVarB0, "admobBannerUnitId");
            int iC46 = b6.n.c(dVarB0, "admobInterstitialUnitId");
            int iC47 = b6.n.c(dVarB0, "admobRewardedUnitId");
            int iC48 = b6.n.c(dVarB0, "admobBannerPosition");
            int iC49 = b6.n.c(dVarB0, "admobShowBannerOnStart");
            int iC50 = b6.n.c(dVarB0, "admobTestDeviceIds");
            int iC51 = b6.n.c(dVarB0, "admobAutoLoadInterstitial");
            int iC52 = b6.n.c(dVarB0, "admobAutoLoadRewarded");
            int iC53 = b6.n.c(dVarB0, "admobUseTestAds");
            int iC54 = b6.n.c(dVarB0, "admobBannerEnabled");
            int iC55 = b6.n.c(dVarB0, "admobInterstitialEnabled");
            int iC56 = b6.n.c(dVarB0, "admobRewardedEnabled");
            int iC57 = b6.n.c(dVarB0, "admobInterstitialIntervalSeconds");
            int iC58 = b6.n.c(dVarB0, "admobInterstitialPageCount");
            int iC59 = b6.n.c(dVarB0, "admobChildDirectedTreatment");
            int iC60 = b6.n.c(dVarB0, "admobUnderAgeOfConsent");
            int iC61 = b6.n.c(dVarB0, "admobMaxAdContentRating");
            int iC62 = b6.n.c(dVarB0, "umpDebugEnabled");
            int iC63 = b6.n.c(dVarB0, "umpDebugGeography");
            int iC64 = b6.n.c(dVarB0, "umpTestDeviceIds");
            int iC65 = b6.n.c(dVarB0, "kind");
            int iC66 = b6.n.c(dVarB0, "folderId");
            int iC67 = b6.n.c(dVarB0, "createdAt");
            int iC68 = b6.n.c(dVarB0, "updatedAt");
            ArrayList arrayList = new ArrayList();
            while (dVarB0.t0()) {
                long j10 = dVarB0.getLong(iC);
                String strW8 = dVarB0.isNull(iC2) ? null : dVarB0.W(iC2);
                String strW9 = dVarB0.isNull(iC3) ? null : dVarB0.W(iC3);
                if (dVarB0.isNull(iC4)) {
                    strW = null;
                    i11 = iC2;
                    i10 = iC3;
                } else {
                    strW = dVarB0.W(iC4);
                    i10 = iC3;
                    i11 = iC2;
                }
                int i24 = (int) dVarB0.getLong(iC5);
                String strW10 = dVarB0.isNull(iC6) ? null : dVarB0.W(iC6);
                int i25 = (int) dVarB0.getLong(iC7);
                int i26 = (int) dVarB0.getLong(iC8);
                if (dVarB0.isNull(iC9)) {
                    i12 = i26;
                    numValueOf = null;
                } else {
                    i12 = i26;
                    numValueOf = Integer.valueOf((int) dVarB0.getLong(iC9));
                }
                String strW11 = dVarB0.isNull(iC10) ? null : dVarB0.W(iC10);
                String strW12 = dVarB0.isNull(iC11) ? null : dVarB0.W(iC11);
                String strW13 = dVarB0.isNull(iC12) ? null : dVarB0.W(iC12);
                String strW14 = dVarB0.isNull(iC13) ? null : dVarB0.W(iC13);
                String strW15 = dVarB0.isNull(iC14) ? null : dVarB0.W(iC14);
                int i27 = iC15;
                String strW16 = dVarB0.isNull(i27) ? null : dVarB0.W(i27);
                int i28 = iC16;
                String strW17 = dVarB0.isNull(i28) ? null : dVarB0.W(i28);
                int i29 = iC;
                int i30 = iC17;
                if (dVarB0.isNull(i30)) {
                    strW2 = null;
                    iC17 = i30;
                    i14 = i27;
                    i13 = iC18;
                } else {
                    strW2 = dVarB0.W(i30);
                    iC17 = i30;
                    i13 = iC18;
                    i14 = i27;
                }
                boolean z11 = true;
                if (((int) dVarB0.getLong(i13)) != 0) {
                    i15 = iC19;
                    z10 = true;
                } else {
                    i15 = iC19;
                    z10 = true;
                    z11 = false;
                }
                int i31 = iC4;
                boolean z12 = ((int) dVarB0.getLong(i15)) != 0 ? z10 : false;
                int i32 = iC20;
                int i33 = iC5;
                boolean z13 = ((int) dVarB0.getLong(i32)) != 0 ? z10 : false;
                int i34 = iC21;
                int i35 = iC6;
                boolean z14 = ((int) dVarB0.getLong(i34)) != 0 ? z10 : false;
                int i36 = iC22;
                int i37 = iC7;
                boolean z15 = ((int) dVarB0.getLong(i36)) != 0 ? z10 : false;
                int i38 = iC23;
                String strW18 = dVarB0.isNull(i38) ? null : dVarB0.W(i38);
                int i39 = iC24;
                Long lValueOf = dVarB0.isNull(i39) ? null : Long.valueOf(dVarB0.getLong(i39));
                int i40 = i13;
                int i41 = iC25;
                String strW19 = dVarB0.isNull(i41) ? null : dVarB0.W(i41);
                iC25 = i41;
                int i42 = iC26;
                if (dVarB0.isNull(i42)) {
                    strW3 = null;
                    iC26 = i42;
                    i16 = i32;
                } else {
                    strW3 = dVarB0.W(i42);
                    i16 = i32;
                    iC26 = i42;
                }
                int i43 = iC27;
                int i44 = i15;
                boolean z16 = ((int) dVarB0.getLong(i43)) != 0 ? z10 : false;
                int i45 = iC28;
                boolean z17 = ((int) dVarB0.getLong(i45)) != 0 ? z10 : false;
                int i46 = iC29;
                String strW20 = dVarB0.isNull(i46) ? null : dVarB0.W(i46);
                int i47 = iC30;
                boolean z18 = ((int) dVarB0.getLong(i47)) != 0 ? z10 : false;
                int i48 = iC31;
                String strW21 = dVarB0.isNull(i48) ? null : dVarB0.W(i48);
                int i49 = iC32;
                String strW22 = dVarB0.isNull(i49) ? null : dVarB0.W(i49);
                int i50 = iC33;
                if (dVarB0.isNull(i50)) {
                    strW4 = null;
                    iC33 = i50;
                    i18 = i48;
                    i17 = iC34;
                } else {
                    strW4 = dVarB0.W(i50);
                    iC33 = i50;
                    i17 = iC34;
                    i18 = i48;
                }
                boolean z19 = ((int) dVarB0.getLong(i17)) != 0 ? z10 : false;
                int i51 = iC35;
                boolean z20 = ((int) dVarB0.getLong(i51)) != 0 ? z10 : false;
                int i52 = iC36;
                boolean z21 = ((int) dVarB0.getLong(i52)) != 0 ? z10 : false;
                int i53 = iC37;
                boolean z22 = ((int) dVarB0.getLong(i53)) != 0 ? z10 : false;
                int i54 = iC38;
                String strW23 = dVarB0.isNull(i54) ? null : dVarB0.W(i54);
                int i55 = iC39;
                int i56 = (int) dVarB0.getLong(i55);
                int i57 = iC40;
                String strW24 = dVarB0.isNull(i57) ? null : dVarB0.W(i57);
                int i58 = i17;
                int i59 = iC41;
                String strW25 = dVarB0.isNull(i59) ? null : dVarB0.W(i59);
                iC41 = i59;
                int i60 = iC42;
                if (dVarB0.isNull(i60)) {
                    strW5 = null;
                    iC42 = i60;
                    i19 = i55;
                } else {
                    strW5 = dVarB0.W(i60);
                    i19 = i55;
                    iC42 = i60;
                }
                int i61 = iC43;
                boolean z23 = ((int) dVarB0.getLong(i61)) != 0 ? z10 : false;
                int i62 = iC44;
                String strW26 = dVarB0.isNull(i62) ? null : dVarB0.W(i62);
                int i63 = iC45;
                String strW27 = dVarB0.isNull(i63) ? null : dVarB0.W(i63);
                int i64 = iC46;
                String strW28 = dVarB0.isNull(i64) ? null : dVarB0.W(i64);
                iC46 = i64;
                int i65 = iC47;
                String strW29 = dVarB0.isNull(i65) ? null : dVarB0.W(i65);
                iC47 = i65;
                int i66 = iC48;
                if (dVarB0.isNull(i66)) {
                    strW6 = null;
                    iC48 = i66;
                    i21 = i62;
                    i20 = iC49;
                } else {
                    strW6 = dVarB0.W(i66);
                    iC48 = i66;
                    i20 = iC49;
                    i21 = i62;
                }
                boolean z24 = ((int) dVarB0.getLong(i20)) != 0 ? z10 : false;
                int i67 = iC50;
                String strW30 = dVarB0.isNull(i67) ? null : dVarB0.W(i67);
                int i68 = iC51;
                boolean z25 = ((int) dVarB0.getLong(i68)) != 0 ? z10 : false;
                iC51 = i68;
                int i69 = iC52;
                boolean z26 = ((int) dVarB0.getLong(i69)) != 0 ? z10 : false;
                iC52 = i69;
                int i70 = iC53;
                boolean z27 = ((int) dVarB0.getLong(i70)) != 0 ? z10 : false;
                int i71 = iC54;
                boolean z28 = ((int) dVarB0.getLong(i71)) != 0 ? z10 : false;
                iC54 = i71;
                int i72 = iC55;
                boolean z29 = ((int) dVarB0.getLong(i72)) != 0 ? z10 : false;
                iC55 = i72;
                int i73 = iC56;
                boolean z30 = ((int) dVarB0.getLong(i73)) != 0 ? z10 : false;
                int i74 = iC57;
                int i75 = (int) dVarB0.getLong(i74);
                int i76 = iC58;
                int i77 = (int) dVarB0.getLong(i76);
                int i78 = iC59;
                int i79 = (int) dVarB0.getLong(i78);
                int i80 = iC60;
                int i81 = (int) dVarB0.getLong(i80);
                int i82 = iC61;
                if (dVarB0.isNull(i82)) {
                    strW7 = null;
                    i23 = i20;
                    i22 = i81;
                } else {
                    strW7 = dVarB0.W(i82);
                    i22 = i81;
                    i23 = i20;
                }
                int i83 = iC62;
                boolean z31 = ((int) dVarB0.getLong(i83)) != 0 ? z10 : false;
                int i84 = iC63;
                String strW31 = dVarB0.isNull(i84) ? null : dVarB0.W(i84);
                int i85 = iC64;
                String strW32 = dVarB0.isNull(i85) ? null : dVarB0.W(i85);
                int i86 = iC65;
                String strW33 = dVarB0.isNull(i86) ? null : dVarB0.W(i86);
                iC65 = i86;
                int i87 = iC66;
                Long lValueOf2 = dVarB0.isNull(i87) ? null : Long.valueOf(dVarB0.getLong(i87));
                iC66 = i87;
                int i88 = iC67;
                Long l10 = lValueOf2;
                long j11 = dVarB0.getLong(i88);
                iC67 = i88;
                int i89 = iC68;
                arrayList.add(new ProjectEntity(j10, strW8, strW9, strW, i24, strW10, i25, i12, numValueOf, strW11, strW12, strW13, strW14, strW15, strW16, strW17, strW2, z11, z12, z13, z14, z15, strW18, lValueOf, strW19, strW3, z16, z17, strW20, z18, strW21, strW22, strW4, z19, z20, z21, z22, strW23, i56, strW24, strW25, strW5, z23, strW26, strW27, strW28, strW29, strW6, z24, strW30, z25, z26, z27, z28, z29, z30, i75, i77, i79, i22, strW7, z31, strW31, strW32, strW33, l10, j11, dVarB0.getLong(i89)));
                iC68 = i89;
                iC63 = i84;
                iC64 = i85;
                iC23 = i38;
                iC6 = i35;
                iC21 = i34;
                iC28 = i45;
                iC29 = i46;
                iC30 = i47;
                iC35 = i51;
                iC2 = i11;
                iC3 = i10;
                iC4 = i31;
                iC39 = i19;
                iC = i29;
                iC15 = i14;
                iC16 = i28;
                iC18 = i40;
                iC24 = i39;
                iC7 = i37;
                iC22 = i36;
                iC36 = i52;
                iC37 = i53;
                iC38 = i54;
                iC43 = i61;
                iC44 = i21;
                iC45 = i63;
                iC49 = i23;
                iC61 = i82;
                iC62 = i83;
                iC19 = i44;
                iC27 = i43;
                iC31 = i18;
                iC32 = i49;
                iC34 = i58;
                iC40 = i57;
                iC50 = i67;
                iC53 = i70;
                iC56 = i73;
                iC57 = i74;
                iC58 = i76;
                iC59 = i78;
                iC60 = i80;
                iC5 = i33;
                iC20 = i16;
            }
            return arrayList;
        } finally {
            dVarB0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ProjectEntity lambda$getById$4(long j10, h6.b bVar) throws Exception {
        h6.d dVarB0 = bVar.B0("SELECT * FROM projects WHERE id = ?");
        try {
            dVarB0.d(1, j10);
            int iC = b6.n.c(dVarB0, "id");
            int iC2 = b6.n.c(dVarB0, "name");
            int iC3 = b6.n.c(dVarB0, "appName");
            int iC4 = b6.n.c(dVarB0, "packageName");
            int iC5 = b6.n.c(dVarB0, "versionCode");
            int iC6 = b6.n.c(dVarB0, "versionName");
            int iC7 = b6.n.c(dVarB0, "minSdk");
            int iC8 = b6.n.c(dVarB0, "targetSdk");
            int iC9 = b6.n.c(dVarB0, "maxSdk");
            int iC10 = b6.n.c(dVarB0, "contentSourceType");
            int iC11 = b6.n.c(dVarB0, "sourcePath");
            int iC12 = b6.n.c(dVarB0, "sourceUrl");
            int iC13 = b6.n.c(dVarB0, "permissionsJson");
            int iC14 = b6.n.c(dVarB0, "iconPath");
            int iC15 = b6.n.c(dVarB0, "splashPath");
            int iC16 = b6.n.c(dVarB0, "primaryColor");
            int iC17 = b6.n.c(dVarB0, "orientation");
            int iC18 = b6.n.c(dVarB0, "showHeader");
            int iC19 = b6.n.c(dVarB0, "showActionBar");
            int iC20 = b6.n.c(dVarB0, "keepScreenOn");
            int iC21 = b6.n.c(dVarB0, "showCameraCutout");
            int iC22 = b6.n.c(dVarB0, "desktopMode");
            int iC23 = b6.n.c(dVarB0, "webViewSettingsJson");
            int iC24 = b6.n.c(dVarB0, "keystoreId");
            int iC25 = b6.n.c(dVarB0, "outputFormat");
            int iC26 = b6.n.c(dVarB0, "buildMode");
            int iC27 = b6.n.c(dVarB0, "showWatermark");
            int iC28 = b6.n.c(dVarB0, "autoIncrementVersionCode");
            int iC29 = b6.n.c(dVarB0, "deepLinkScheme");
            int iC30 = b6.n.c(dVarB0, "billingEnabled");
            int iC31 = b6.n.c(dVarB0, "billingProductId");
            int iC32 = b6.n.c(dVarB0, "billingSubscriptionId");
            int iC33 = b6.n.c(dVarB0, "billingType");
            int iC34 = b6.n.c(dVarB0, "billingTestMode");
            int iC35 = b6.n.c(dVarB0, "billingAutoConsume");
            int iC36 = b6.n.c(dVarB0, "billingAcknowledge");
            int iC37 = b6.n.c(dVarB0, "billingEnablePendingPurchases");
            int iC38 = b6.n.c(dVarB0, "billingSubscriptionPeriod");
            int iC39 = b6.n.c(dVarB0, "billingFreeTrialDays");
            int iC40 = b6.n.c(dVarB0, "billingIntroductoryPrice");
            int iC41 = b6.n.c(dVarB0, "billingProductName");
            int iC42 = b6.n.c(dVarB0, "billingProductDescription");
            int iC43 = b6.n.c(dVarB0, "admobEnabled");
            int iC44 = b6.n.c(dVarB0, "admobAppId");
            int iC45 = b6.n.c(dVarB0, "admobBannerUnitId");
            int iC46 = b6.n.c(dVarB0, "admobInterstitialUnitId");
            int iC47 = b6.n.c(dVarB0, "admobRewardedUnitId");
            int iC48 = b6.n.c(dVarB0, "admobBannerPosition");
            int iC49 = b6.n.c(dVarB0, "admobShowBannerOnStart");
            int iC50 = b6.n.c(dVarB0, "admobTestDeviceIds");
            int iC51 = b6.n.c(dVarB0, "admobAutoLoadInterstitial");
            int iC52 = b6.n.c(dVarB0, "admobAutoLoadRewarded");
            int iC53 = b6.n.c(dVarB0, "admobUseTestAds");
            int iC54 = b6.n.c(dVarB0, "admobBannerEnabled");
            int iC55 = b6.n.c(dVarB0, "admobInterstitialEnabled");
            int iC56 = b6.n.c(dVarB0, "admobRewardedEnabled");
            int iC57 = b6.n.c(dVarB0, "admobInterstitialIntervalSeconds");
            int iC58 = b6.n.c(dVarB0, "admobInterstitialPageCount");
            int iC59 = b6.n.c(dVarB0, "admobChildDirectedTreatment");
            int iC60 = b6.n.c(dVarB0, "admobUnderAgeOfConsent");
            int iC61 = b6.n.c(dVarB0, "admobMaxAdContentRating");
            int iC62 = b6.n.c(dVarB0, "umpDebugEnabled");
            int iC63 = b6.n.c(dVarB0, "umpDebugGeography");
            int iC64 = b6.n.c(dVarB0, "umpTestDeviceIds");
            int iC65 = b6.n.c(dVarB0, "kind");
            int iC66 = b6.n.c(dVarB0, "folderId");
            int iC67 = b6.n.c(dVarB0, "createdAt");
            int iC68 = b6.n.c(dVarB0, "updatedAt");
            ProjectEntity projectEntity = null;
            if (dVarB0.t0()) {
                projectEntity = new ProjectEntity(dVarB0.getLong(iC), dVarB0.isNull(iC2) ? null : dVarB0.W(iC2), dVarB0.isNull(iC3) ? null : dVarB0.W(iC3), dVarB0.isNull(iC4) ? null : dVarB0.W(iC4), (int) dVarB0.getLong(iC5), dVarB0.isNull(iC6) ? null : dVarB0.W(iC6), (int) dVarB0.getLong(iC7), (int) dVarB0.getLong(iC8), dVarB0.isNull(iC9) ? null : Integer.valueOf((int) dVarB0.getLong(iC9)), dVarB0.isNull(iC10) ? null : dVarB0.W(iC10), dVarB0.isNull(iC11) ? null : dVarB0.W(iC11), dVarB0.isNull(iC12) ? null : dVarB0.W(iC12), dVarB0.isNull(iC13) ? null : dVarB0.W(iC13), dVarB0.isNull(iC14) ? null : dVarB0.W(iC14), dVarB0.isNull(iC15) ? null : dVarB0.W(iC15), dVarB0.isNull(iC16) ? null : dVarB0.W(iC16), dVarB0.isNull(iC17) ? null : dVarB0.W(iC17), ((int) dVarB0.getLong(iC18)) != 0, ((int) dVarB0.getLong(iC19)) != 0, ((int) dVarB0.getLong(iC20)) != 0, ((int) dVarB0.getLong(iC21)) != 0, ((int) dVarB0.getLong(iC22)) != 0, dVarB0.isNull(iC23) ? null : dVarB0.W(iC23), dVarB0.isNull(iC24) ? null : Long.valueOf(dVarB0.getLong(iC24)), dVarB0.isNull(iC25) ? null : dVarB0.W(iC25), dVarB0.isNull(iC26) ? null : dVarB0.W(iC26), ((int) dVarB0.getLong(iC27)) != 0, ((int) dVarB0.getLong(iC28)) != 0, dVarB0.isNull(iC29) ? null : dVarB0.W(iC29), ((int) dVarB0.getLong(iC30)) != 0, dVarB0.isNull(iC31) ? null : dVarB0.W(iC31), dVarB0.isNull(iC32) ? null : dVarB0.W(iC32), dVarB0.isNull(iC33) ? null : dVarB0.W(iC33), ((int) dVarB0.getLong(iC34)) != 0, ((int) dVarB0.getLong(iC35)) != 0, ((int) dVarB0.getLong(iC36)) != 0, ((int) dVarB0.getLong(iC37)) != 0, dVarB0.isNull(iC38) ? null : dVarB0.W(iC38), (int) dVarB0.getLong(iC39), dVarB0.isNull(iC40) ? null : dVarB0.W(iC40), dVarB0.isNull(iC41) ? null : dVarB0.W(iC41), dVarB0.isNull(iC42) ? null : dVarB0.W(iC42), ((int) dVarB0.getLong(iC43)) != 0, dVarB0.isNull(iC44) ? null : dVarB0.W(iC44), dVarB0.isNull(iC45) ? null : dVarB0.W(iC45), dVarB0.isNull(iC46) ? null : dVarB0.W(iC46), dVarB0.isNull(iC47) ? null : dVarB0.W(iC47), dVarB0.isNull(iC48) ? null : dVarB0.W(iC48), ((int) dVarB0.getLong(iC49)) != 0, dVarB0.isNull(iC50) ? null : dVarB0.W(iC50), ((int) dVarB0.getLong(iC51)) != 0, ((int) dVarB0.getLong(iC52)) != 0, ((int) dVarB0.getLong(iC53)) != 0, ((int) dVarB0.getLong(iC54)) != 0, ((int) dVarB0.getLong(iC55)) != 0, ((int) dVarB0.getLong(iC56)) != 0, (int) dVarB0.getLong(iC57), (int) dVarB0.getLong(iC58), (int) dVarB0.getLong(iC59), (int) dVarB0.getLong(iC60), dVarB0.isNull(iC61) ? null : dVarB0.W(iC61), ((int) dVarB0.getLong(iC62)) != 0, dVarB0.isNull(iC63) ? null : dVarB0.W(iC63), dVarB0.isNull(iC64) ? null : dVarB0.W(iC64), dVarB0.isNull(iC65) ? null : dVarB0.W(iC65), dVarB0.isNull(iC66) ? null : Long.valueOf(dVarB0.getLong(iC66)), dVarB0.getLong(iC67), dVarB0.getLong(iC68));
            }
            return projectEntity;
        } finally {
            dVarB0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$insert$0(ProjectEntity projectEntity, h6.b bVar) {
        return Long.valueOf(this.__insertAdapterOfProjectEntity.insertAndReturnId(bVar, projectEntity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f0 lambda$moveToFolder$7(String str, Long l10, List list, h6.b bVar) throws Exception {
        h6.d dVarB0 = bVar.B0(str);
        try {
            if (l10 == null) {
                dVarB0.e(1);
            } else {
                dVarB0.d(1, l10.longValue());
            }
            Iterator it = list.iterator();
            int i10 = 2;
            while (it.hasNext()) {
                Long l11 = (Long) it.next();
                if (l11 == null) {
                    dVarB0.e(i10);
                } else {
                    dVarB0.d(i10, l11.longValue());
                }
                i10++;
            }
            dVarB0.t0();
            f0 f0Var = f0.f21461a;
            dVarB0.close();
            return f0Var;
        } catch (Throwable th2) {
            dVarB0.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ f0 lambda$update$2(ProjectEntity projectEntity, h6.b bVar) {
        this.__updateAdapterOfProjectEntity.handle(bVar, projectEntity);
        return f0.f21461a;
    }

    @Override // com.basitce.htmltoapk.data.local.dao.ProjectDao
    public Object clearWatermarks(tg.e<? super Integer> eVar) {
        return b6.c.g(this.__db, new u(), eVar, false, true);
    }

    @Override // com.basitce.htmltoapk.data.local.dao.ProjectDao
    public Object count(tg.e<? super Integer> eVar) {
        return b6.c.g(this.__db, new s(), eVar, true, false);
    }

    @Override // com.basitce.htmltoapk.data.local.dao.ProjectDao
    public Object countByKind(String str, tg.e<? super Integer> eVar) {
        return b6.c.g(this.__db, new o(str, 0), eVar, true, false);
    }

    @Override // com.basitce.htmltoapk.data.local.dao.ProjectDao
    public Object delete(final ProjectEntity projectEntity, tg.e<? super f0> eVar) {
        projectEntity.getClass();
        return b6.c.g(this.__db, new eh.l() { // from class: com.basitce.htmltoapk.data.local.dao.r
            @Override // eh.l
            public final Object invoke(Object obj) {
                return this.f5733a.lambda$delete$1(projectEntity, (h6.b) obj);
            }
        }, eVar, false, true);
    }

    @Override // com.basitce.htmltoapk.data.local.dao.ProjectDao
    public sh.f<List<ProjectEntity>> getAll() {
        return o0.a(this.__db, new String[]{"projects"}, new v());
    }

    @Override // com.basitce.htmltoapk.data.local.dao.ProjectDao
    public Object getById(final long j10, tg.e<? super ProjectEntity> eVar) {
        return b6.c.g(this.__db, new eh.l() { // from class: com.basitce.htmltoapk.data.local.dao.p
            @Override // eh.l
            public final Object invoke(Object obj) {
                return ProjectDao_Impl.lambda$getById$4(j10, (h6.b) obj);
            }
        }, eVar, true, false);
    }

    @Override // com.basitce.htmltoapk.data.local.dao.ProjectDao
    public Object insert(final ProjectEntity projectEntity, tg.e<? super Long> eVar) {
        projectEntity.getClass();
        return b6.c.g(this.__db, new eh.l() { // from class: com.basitce.htmltoapk.data.local.dao.q
            @Override // eh.l
            public final Object invoke(Object obj) {
                return this.f5731a.lambda$insert$0(projectEntity, (h6.b) obj);
            }
        }, eVar, false, true);
    }

    @Override // com.basitce.htmltoapk.data.local.dao.ProjectDao
    public Object moveToFolder(final List<Long> list, final Long l10, tg.e<? super f0> eVar) {
        StringBuilder sb = new StringBuilder("UPDATE projects SET folderId = ? WHERE id IN (");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb.append("?");
            if (i10 < size - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        final String string = sb.toString();
        return b6.c.g(this.__db, new eh.l() { // from class: com.basitce.htmltoapk.data.local.dao.w
            @Override // eh.l
            public final Object invoke(Object obj) {
                return ProjectDao_Impl.lambda$moveToFolder$7(string, l10, list, (h6.b) obj);
            }
        }, eVar, false, true);
    }

    @Override // com.basitce.htmltoapk.data.local.dao.ProjectDao
    public Object update(final ProjectEntity projectEntity, tg.e<? super f0> eVar) {
        projectEntity.getClass();
        return b6.c.g(this.__db, new eh.l() { // from class: com.basitce.htmltoapk.data.local.dao.t
            @Override // eh.l
            public final Object invoke(Object obj) {
                return this.f5735a.lambda$update$2(projectEntity, (h6.b) obj);
            }
        }, eVar, false, true);
    }
}
