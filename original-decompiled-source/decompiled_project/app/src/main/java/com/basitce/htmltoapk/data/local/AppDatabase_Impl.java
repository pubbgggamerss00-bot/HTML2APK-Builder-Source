package com.basitce.htmltoapk.data.local;

import androidx.room.j0;
import androidx.room.m;
import b6.c;
import b6.p;
import com.basitce.htmltoapk.data.local.dao.FolderDao;
import com.basitce.htmltoapk.data.local.dao.FolderDao_Impl;
import com.basitce.htmltoapk.data.local.dao.KeystoreDao;
import com.basitce.htmltoapk.data.local.dao.KeystoreDao_Impl;
import com.basitce.htmltoapk.data.local.dao.ProjectDao;
import com.basitce.htmltoapk.data.local.dao.ProjectDao_Impl;
import h6.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z5.a;

/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {
    private volatile FolderDao _folderDao;
    private volatile KeystoreDao _keystoreDao;
    private volatile ProjectDao _projectDao;

    @Override // androidx.room.g0
    public void clearAllTables() {
        performClear(false, "projects", "keystores", "folders");
    }

    @Override // androidx.room.g0
    public m createInvalidationTracker() {
        return new m(this, new HashMap(0), new HashMap(0), "projects", "keystores", "folders");
    }

    @Override // com.basitce.htmltoapk.data.local.AppDatabase
    public FolderDao folderDao() {
        FolderDao folderDao;
        if (this._folderDao != null) {
            return this._folderDao;
        }
        synchronized (this) {
            try {
                if (this._folderDao == null) {
                    this._folderDao = new FolderDao_Impl(this);
                }
                folderDao = this._folderDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return folderDao;
    }

    @Override // androidx.room.g0
    public List<a> getAutoMigrations(Map<Class<Object>, Object> map) {
        return new ArrayList();
    }

    @Override // androidx.room.g0
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.g0
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(ProjectDao.class, ProjectDao_Impl.getRequiredConverters());
        map.put(KeystoreDao.class, KeystoreDao_Impl.getRequiredConverters());
        map.put(FolderDao.class, FolderDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.basitce.htmltoapk.data.local.AppDatabase
    public KeystoreDao keystoreDao() {
        KeystoreDao keystoreDao;
        if (this._keystoreDao != null) {
            return this._keystoreDao;
        }
        synchronized (this) {
            try {
                if (this._keystoreDao == null) {
                    this._keystoreDao = new KeystoreDao_Impl(this);
                }
                keystoreDao = this._keystoreDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return keystoreDao;
    }

    @Override // com.basitce.htmltoapk.data.local.AppDatabase
    public ProjectDao projectDao() {
        ProjectDao projectDao;
        if (this._projectDao != null) {
            return this._projectDao;
        }
        synchronized (this) {
            try {
                if (this._projectDao == null) {
                    this._projectDao = new ProjectDao_Impl(this);
                }
                projectDao = this._projectDao;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return projectDao;
    }

    @Override // androidx.room.g0
    public j0 createOpenDelegate() {
        return new j0(21, "9be93415c3690f38b7cc93a34212dfed", "7a6c55421d36f16aeba43798cba916bc") { // from class: com.basitce.htmltoapk.data.local.AppDatabase_Impl.1
            @Override // androidx.room.j0
            public void createAllTables(b bVar) {
                h6.a.a("CREATE TABLE IF NOT EXISTS `projects` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `appName` TEXT NOT NULL, `packageName` TEXT NOT NULL, `versionCode` INTEGER NOT NULL, `versionName` TEXT NOT NULL, `minSdk` INTEGER NOT NULL, `targetSdk` INTEGER NOT NULL, `maxSdk` INTEGER, `contentSourceType` TEXT NOT NULL, `sourcePath` TEXT, `sourceUrl` TEXT, `permissionsJson` TEXT NOT NULL, `iconPath` TEXT, `splashPath` TEXT, `primaryColor` TEXT, `orientation` TEXT NOT NULL, `showHeader` INTEGER NOT NULL, `showActionBar` INTEGER NOT NULL, `keepScreenOn` INTEGER NOT NULL, `showCameraCutout` INTEGER NOT NULL, `desktopMode` INTEGER NOT NULL, `webViewSettingsJson` TEXT NOT NULL, `keystoreId` INTEGER, `outputFormat` TEXT NOT NULL, `buildMode` TEXT NOT NULL, `showWatermark` INTEGER NOT NULL, `autoIncrementVersionCode` INTEGER NOT NULL, `deepLinkScheme` TEXT, `billingEnabled` INTEGER NOT NULL, `billingProductId` TEXT, `billingSubscriptionId` TEXT, `billingType` TEXT, `billingTestMode` INTEGER NOT NULL, `billingAutoConsume` INTEGER NOT NULL, `billingAcknowledge` INTEGER NOT NULL, `billingEnablePendingPurchases` INTEGER NOT NULL, `billingSubscriptionPeriod` TEXT, `billingFreeTrialDays` INTEGER NOT NULL, `billingIntroductoryPrice` TEXT, `billingProductName` TEXT, `billingProductDescription` TEXT, `admobEnabled` INTEGER NOT NULL, `admobAppId` TEXT, `admobBannerUnitId` TEXT, `admobInterstitialUnitId` TEXT, `admobRewardedUnitId` TEXT, `admobBannerPosition` TEXT, `admobShowBannerOnStart` INTEGER NOT NULL, `admobTestDeviceIds` TEXT, `admobAutoLoadInterstitial` INTEGER NOT NULL, `admobAutoLoadRewarded` INTEGER NOT NULL, `admobUseTestAds` INTEGER NOT NULL, `admobBannerEnabled` INTEGER NOT NULL, `admobInterstitialEnabled` INTEGER NOT NULL, `admobRewardedEnabled` INTEGER NOT NULL, `admobInterstitialIntervalSeconds` INTEGER NOT NULL, `admobInterstitialPageCount` INTEGER NOT NULL, `admobChildDirectedTreatment` INTEGER NOT NULL, `admobUnderAgeOfConsent` INTEGER NOT NULL, `admobMaxAdContentRating` TEXT NOT NULL, `umpDebugEnabled` INTEGER NOT NULL, `umpDebugGeography` TEXT NOT NULL, `umpTestDeviceIds` TEXT, `kind` TEXT NOT NULL, `folderId` INTEGER, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL)", bVar);
                h6.a.a("CREATE INDEX IF NOT EXISTS `index_projects_folderId` ON `projects` (`folderId`)", bVar);
                h6.a.a("CREATE TABLE IF NOT EXISTS `keystores` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `alias` TEXT NOT NULL, `path` TEXT NOT NULL, `password` TEXT NOT NULL, `keyAlias` TEXT NOT NULL, `algorithm` TEXT NOT NULL, `isPersisted` INTEGER NOT NULL, `publicUri` TEXT, `keyPassword` TEXT, `createdAt` INTEGER NOT NULL)", bVar);
                h6.a.a("CREATE TABLE IF NOT EXISTS `folders` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `sortOrder` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL)", bVar);
                h6.a.a("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", bVar);
                h6.a.a("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9be93415c3690f38b7cc93a34212dfed')", bVar);
            }

            @Override // androidx.room.j0
            public void dropAllTables(b bVar) {
                h6.a.a("DROP TABLE IF EXISTS `projects`", bVar);
                h6.a.a("DROP TABLE IF EXISTS `keystores`", bVar);
                h6.a.a("DROP TABLE IF EXISTS `folders`", bVar);
            }

            @Override // androidx.room.j0
            public void onCreate(b bVar) {
            }

            @Override // androidx.room.j0
            public void onOpen(b bVar) {
                AppDatabase_Impl.this.internalInitInvalidationTracker(bVar);
            }

            @Override // androidx.room.j0
            public void onPostMigrate(b bVar) {
            }

            @Override // androidx.room.j0
            public void onPreMigrate(b bVar) {
                c.b(bVar);
            }

            @Override // androidx.room.j0
            public j0.a onValidateSchema(b bVar) {
                HashMap map = new HashMap(68);
                map.put("id", new p.a("id", "INTEGER", true, 1, null, 1));
                map.put("name", new p.a("name", "TEXT", true, 0, null, 1));
                map.put("appName", new p.a("appName", "TEXT", true, 0, null, 1));
                map.put("packageName", new p.a("packageName", "TEXT", true, 0, null, 1));
                map.put("versionCode", new p.a("versionCode", "INTEGER", true, 0, null, 1));
                map.put("versionName", new p.a("versionName", "TEXT", true, 0, null, 1));
                map.put("minSdk", new p.a("minSdk", "INTEGER", true, 0, null, 1));
                map.put("targetSdk", new p.a("targetSdk", "INTEGER", true, 0, null, 1));
                map.put("maxSdk", new p.a("maxSdk", "INTEGER", false, 0, null, 1));
                map.put("contentSourceType", new p.a("contentSourceType", "TEXT", true, 0, null, 1));
                map.put("sourcePath", new p.a("sourcePath", "TEXT", false, 0, null, 1));
                map.put("sourceUrl", new p.a("sourceUrl", "TEXT", false, 0, null, 1));
                map.put("permissionsJson", new p.a("permissionsJson", "TEXT", true, 0, null, 1));
                map.put("iconPath", new p.a("iconPath", "TEXT", false, 0, null, 1));
                map.put("splashPath", new p.a("splashPath", "TEXT", false, 0, null, 1));
                map.put("primaryColor", new p.a("primaryColor", "TEXT", false, 0, null, 1));
                map.put("orientation", new p.a("orientation", "TEXT", true, 0, null, 1));
                map.put("showHeader", new p.a("showHeader", "INTEGER", true, 0, null, 1));
                map.put("showActionBar", new p.a("showActionBar", "INTEGER", true, 0, null, 1));
                map.put("keepScreenOn", new p.a("keepScreenOn", "INTEGER", true, 0, null, 1));
                map.put("showCameraCutout", new p.a("showCameraCutout", "INTEGER", true, 0, null, 1));
                map.put("desktopMode", new p.a("desktopMode", "INTEGER", true, 0, null, 1));
                map.put("webViewSettingsJson", new p.a("webViewSettingsJson", "TEXT", true, 0, null, 1));
                map.put("keystoreId", new p.a("keystoreId", "INTEGER", false, 0, null, 1));
                map.put("outputFormat", new p.a("outputFormat", "TEXT", true, 0, null, 1));
                map.put("buildMode", new p.a("buildMode", "TEXT", true, 0, null, 1));
                map.put("showWatermark", new p.a("showWatermark", "INTEGER", true, 0, null, 1));
                map.put("autoIncrementVersionCode", new p.a("autoIncrementVersionCode", "INTEGER", true, 0, null, 1));
                map.put("deepLinkScheme", new p.a("deepLinkScheme", "TEXT", false, 0, null, 1));
                map.put("billingEnabled", new p.a("billingEnabled", "INTEGER", true, 0, null, 1));
                map.put("billingProductId", new p.a("billingProductId", "TEXT", false, 0, null, 1));
                map.put("billingSubscriptionId", new p.a("billingSubscriptionId", "TEXT", false, 0, null, 1));
                map.put("billingType", new p.a("billingType", "TEXT", false, 0, null, 1));
                map.put("billingTestMode", new p.a("billingTestMode", "INTEGER", true, 0, null, 1));
                map.put("billingAutoConsume", new p.a("billingAutoConsume", "INTEGER", true, 0, null, 1));
                map.put("billingAcknowledge", new p.a("billingAcknowledge", "INTEGER", true, 0, null, 1));
                map.put("billingEnablePendingPurchases", new p.a("billingEnablePendingPurchases", "INTEGER", true, 0, null, 1));
                map.put("billingSubscriptionPeriod", new p.a("billingSubscriptionPeriod", "TEXT", false, 0, null, 1));
                map.put("billingFreeTrialDays", new p.a("billingFreeTrialDays", "INTEGER", true, 0, null, 1));
                map.put("billingIntroductoryPrice", new p.a("billingIntroductoryPrice", "TEXT", false, 0, null, 1));
                map.put("billingProductName", new p.a("billingProductName", "TEXT", false, 0, null, 1));
                map.put("billingProductDescription", new p.a("billingProductDescription", "TEXT", false, 0, null, 1));
                map.put("admobEnabled", new p.a("admobEnabled", "INTEGER", true, 0, null, 1));
                map.put("admobAppId", new p.a("admobAppId", "TEXT", false, 0, null, 1));
                map.put("admobBannerUnitId", new p.a("admobBannerUnitId", "TEXT", false, 0, null, 1));
                map.put("admobInterstitialUnitId", new p.a("admobInterstitialUnitId", "TEXT", false, 0, null, 1));
                map.put("admobRewardedUnitId", new p.a("admobRewardedUnitId", "TEXT", false, 0, null, 1));
                map.put("admobBannerPosition", new p.a("admobBannerPosition", "TEXT", false, 0, null, 1));
                map.put("admobShowBannerOnStart", new p.a("admobShowBannerOnStart", "INTEGER", true, 0, null, 1));
                map.put("admobTestDeviceIds", new p.a("admobTestDeviceIds", "TEXT", false, 0, null, 1));
                map.put("admobAutoLoadInterstitial", new p.a("admobAutoLoadInterstitial", "INTEGER", true, 0, null, 1));
                map.put("admobAutoLoadRewarded", new p.a("admobAutoLoadRewarded", "INTEGER", true, 0, null, 1));
                map.put("admobUseTestAds", new p.a("admobUseTestAds", "INTEGER", true, 0, null, 1));
                map.put("admobBannerEnabled", new p.a("admobBannerEnabled", "INTEGER", true, 0, null, 1));
                map.put("admobInterstitialEnabled", new p.a("admobInterstitialEnabled", "INTEGER", true, 0, null, 1));
                map.put("admobRewardedEnabled", new p.a("admobRewardedEnabled", "INTEGER", true, 0, null, 1));
                map.put("admobInterstitialIntervalSeconds", new p.a("admobInterstitialIntervalSeconds", "INTEGER", true, 0, null, 1));
                map.put("admobInterstitialPageCount", new p.a("admobInterstitialPageCount", "INTEGER", true, 0, null, 1));
                map.put("admobChildDirectedTreatment", new p.a("admobChildDirectedTreatment", "INTEGER", true, 0, null, 1));
                map.put("admobUnderAgeOfConsent", new p.a("admobUnderAgeOfConsent", "INTEGER", true, 0, null, 1));
                map.put("admobMaxAdContentRating", new p.a("admobMaxAdContentRating", "TEXT", true, 0, null, 1));
                map.put("umpDebugEnabled", new p.a("umpDebugEnabled", "INTEGER", true, 0, null, 1));
                map.put("umpDebugGeography", new p.a("umpDebugGeography", "TEXT", true, 0, null, 1));
                map.put("umpTestDeviceIds", new p.a("umpTestDeviceIds", "TEXT", false, 0, null, 1));
                map.put("kind", new p.a("kind", "TEXT", true, 0, null, 1));
                map.put("folderId", new p.a("folderId", "INTEGER", false, 0, null, 1));
                map.put("createdAt", new p.a("createdAt", "INTEGER", true, 0, null, 1));
                map.put("updatedAt", new p.a("updatedAt", "INTEGER", true, 0, null, 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new p.d("index_projects_folderId", false, Arrays.asList("folderId"), Arrays.asList("ASC")));
                p pVar = new p("projects", map, hashSet, hashSet2);
                p pVarA = p.b.a("projects", bVar);
                if (!pVar.equals(pVarA)) {
                    return new j0.a(false, "projects(com.basitce.htmltoapk.data.local.entity.ProjectEntity).\n Expected:\n" + pVar + "\n Found:\n" + pVarA);
                }
                HashMap map2 = new HashMap(10);
                map2.put("id", new p.a("id", "INTEGER", true, 1, null, 1));
                map2.put("alias", new p.a("alias", "TEXT", true, 0, null, 1));
                map2.put("path", new p.a("path", "TEXT", true, 0, null, 1));
                map2.put("password", new p.a("password", "TEXT", true, 0, null, 1));
                map2.put("keyAlias", new p.a("keyAlias", "TEXT", true, 0, null, 1));
                map2.put("algorithm", new p.a("algorithm", "TEXT", true, 0, null, 1));
                map2.put("isPersisted", new p.a("isPersisted", "INTEGER", true, 0, null, 1));
                map2.put("publicUri", new p.a("publicUri", "TEXT", false, 0, null, 1));
                map2.put("keyPassword", new p.a("keyPassword", "TEXT", false, 0, null, 1));
                map2.put("createdAt", new p.a("createdAt", "INTEGER", true, 0, null, 1));
                p pVar2 = new p("keystores", map2, new HashSet(0), new HashSet(0));
                p pVarA2 = p.b.a("keystores", bVar);
                if (!pVar2.equals(pVarA2)) {
                    return new j0.a(false, "keystores(com.basitce.htmltoapk.data.local.entity.KeystoreEntity).\n Expected:\n" + pVar2 + "\n Found:\n" + pVarA2);
                }
                HashMap map3 = new HashMap(4);
                map3.put("id", new p.a("id", "INTEGER", true, 1, null, 1));
                map3.put("name", new p.a("name", "TEXT", true, 0, null, 1));
                map3.put("sortOrder", new p.a("sortOrder", "INTEGER", true, 0, null, 1));
                map3.put("createdAt", new p.a("createdAt", "INTEGER", true, 0, null, 1));
                p pVar3 = new p("folders", map3, new HashSet(0), new HashSet(0));
                p pVarA3 = p.b.a("folders", bVar);
                if (pVar3.equals(pVarA3)) {
                    return new j0.a(true, null);
                }
                return new j0.a(false, "folders(com.basitce.htmltoapk.data.local.entity.FolderEntity).\n Expected:\n" + pVar3 + "\n Found:\n" + pVarA3);
            }
        };
    }
}
