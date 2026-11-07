package com.basitce.htmltoapk.data.local;

import android.database.SQLException;
import i6.b;
import kotlin.jvm.internal.r;
import z5.a;

/* loaded from: classes.dex */
public final class AppDatabaseMigrations {
    public static final AppDatabaseMigrations INSTANCE = new AppDatabaseMigrations();
    private static final a MIGRATION_7_8 = new a() { // from class: com.basitce.htmltoapk.data.local.AppDatabaseMigrations$MIGRATION_7_8$1
        @Override // z5.a
        public void migrate(b db2) throws SQLException {
            r.e(db2, "db");
            db2.n("ALTER TABLE projects ADD COLUMN buildType TEXT NOT NULL DEFAULT 'release'");
        }
    };
    private static final a MIGRATION_8_9 = new a() { // from class: com.basitce.htmltoapk.data.local.AppDatabaseMigrations$MIGRATION_8_9$1
        @Override // z5.a
        public void migrate(b db2) throws SQLException {
            r.e(db2, "db");
            db2.n("CREATE TABLE projects_new (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    name TEXT NOT NULL,\n    appName TEXT NOT NULL,\n    packageName TEXT NOT NULL,\n    versionCode INTEGER NOT NULL,\n    versionName TEXT NOT NULL,\n    minSdk INTEGER NOT NULL,\n    targetSdk INTEGER NOT NULL,\n    maxSdk INTEGER,\n    contentSourceType TEXT NOT NULL,\n    sourcePath TEXT,\n    sourceUrl TEXT,\n    permissionsJson TEXT NOT NULL DEFAULT '[]',\n    iconPath TEXT,\n    splashPath TEXT,\n    primaryColor TEXT,\n    orientation TEXT NOT NULL DEFAULT 'portrait',\n    showHeader INTEGER NOT NULL DEFAULT 1,\n    showActionBar INTEGER NOT NULL DEFAULT 1,\n    keepScreenOn INTEGER NOT NULL DEFAULT 0,\n    webViewSettingsJson TEXT NOT NULL DEFAULT '{}',\n    keystoreId INTEGER,\n    outputFormat TEXT NOT NULL DEFAULT 'apk',\n    buildType TEXT NOT NULL DEFAULT 'release',\n    createdAt INTEGER NOT NULL DEFAULT 0,\n    updatedAt INTEGER NOT NULL DEFAULT 0\n)");
            db2.n("INSERT INTO projects_new (\n    id, name, appName, packageName, versionCode, versionName, minSdk, targetSdk,\n    maxSdk, contentSourceType, sourcePath, sourceUrl, permissionsJson, iconPath,\n    splashPath, primaryColor, orientation, showHeader, showActionBar, keepScreenOn,\n    webViewSettingsJson, keystoreId, outputFormat, buildType, createdAt, updatedAt\n)\nSELECT\n    id, name, appName, packageName, versionCode, versionName, minSdk, targetSdk,\n    maxSdk, contentSourceType, sourcePath, sourceUrl, permissionsJson, iconPath,\n    splashPath, primaryColor, orientation, showHeader, showActionBar, keepScreenOn,\n    webViewSettingsJson, keystoreId, outputFormat, buildType, createdAt, updatedAt\nFROM projects");
            db2.n("DROP TABLE projects");
            db2.n("ALTER TABLE projects_new RENAME TO projects");
        }
    };
    private static final a MIGRATION_9_10 = new a() { // from class: com.basitce.htmltoapk.data.local.AppDatabaseMigrations$MIGRATION_9_10$1
        @Override // z5.a
        public void migrate(b db2) throws SQLException {
            r.e(db2, "db");
            db2.n("ALTER TABLE projects ADD COLUMN buildMode TEXT NOT NULL DEFAULT 'advanced'");
            db2.n("ALTER TABLE projects ADD COLUMN showWatermark INTEGER NOT NULL DEFAULT 1");
        }
    };
    private static final a MIGRATION_10_11 = new a() { // from class: com.basitce.htmltoapk.data.local.AppDatabaseMigrations$MIGRATION_10_11$1
        @Override // z5.a
        public void migrate(b db2) throws SQLException {
            r.e(db2, "db");
            db2.n("ALTER TABLE keystores ADD COLUMN isPersisted INTEGER NOT NULL DEFAULT 0");
            db2.n("ALTER TABLE keystores ADD COLUMN publicUri TEXT");
            db2.n("ALTER TABLE keystores ADD COLUMN keyPassword TEXT");
        }
    };
    private static final a MIGRATION_11_12 = new a() { // from class: com.basitce.htmltoapk.data.local.AppDatabaseMigrations$MIGRATION_11_12$1
        @Override // z5.a
        public void migrate(b db2) throws SQLException {
            r.e(db2, "db");
            db2.n("ALTER TABLE projects ADD COLUMN autoIncrementVersionCode INTEGER NOT NULL DEFAULT 0");
        }
    };
    private static final a MIGRATION_12_13 = new a() { // from class: com.basitce.htmltoapk.data.local.AppDatabaseMigrations$MIGRATION_12_13$1
        @Override // z5.a
        public void migrate(b db2) throws SQLException {
            r.e(db2, "db");
            db2.n("ALTER TABLE projects ADD COLUMN deepLinkScheme TEXT");
        }
    };
    private static final a MIGRATION_13_14 = new a() { // from class: com.basitce.htmltoapk.data.local.AppDatabaseMigrations$MIGRATION_13_14$1
        @Override // z5.a
        public void migrate(b db2) throws SQLException {
            r.e(db2, "db");
            db2.n("ALTER TABLE projects ADD COLUMN billingProductId TEXT");
            db2.n("ALTER TABLE projects ADD COLUMN billingSubscriptionId TEXT");
            db2.n("ALTER TABLE projects ADD COLUMN admobAppId TEXT");
            db2.n("ALTER TABLE projects ADD COLUMN admobBannerUnitId TEXT");
            db2.n("ALTER TABLE projects ADD COLUMN admobInterstitialUnitId TEXT");
            db2.n("ALTER TABLE projects ADD COLUMN admobRewardedUnitId TEXT");
        }
    };
    private static final a MIGRATION_14_15 = new a() { // from class: com.basitce.htmltoapk.data.local.AppDatabaseMigrations$MIGRATION_14_15$1
        @Override // z5.a
        public void migrate(b db2) throws SQLException {
            r.e(db2, "db");
            db2.n("ALTER TABLE projects ADD COLUMN billingEnabled INTEGER NOT NULL DEFAULT 0");
            db2.n("ALTER TABLE projects ADD COLUMN admobEnabled INTEGER NOT NULL DEFAULT 0");
            db2.n("ALTER TABLE projects ADD COLUMN admobBannerPosition TEXT");
            db2.n("ALTER TABLE projects ADD COLUMN admobShowBannerOnStart INTEGER NOT NULL DEFAULT 0");
            db2.n("ALTER TABLE projects ADD COLUMN admobTestDeviceIds TEXT");
            db2.n("ALTER TABLE projects ADD COLUMN admobAutoLoadInterstitial INTEGER NOT NULL DEFAULT 0");
            db2.n("ALTER TABLE projects ADD COLUMN admobAutoLoadRewarded INTEGER NOT NULL DEFAULT 0");
        }
    };
    private static final a MIGRATION_15_16 = new a() { // from class: com.basitce.htmltoapk.data.local.AppDatabaseMigrations$MIGRATION_15_16$1
        @Override // z5.a
        public void migrate(b db2) throws SQLException {
            r.e(db2, "db");
            db2.n("ALTER TABLE projects ADD COLUMN admobUseTestAds INTEGER NOT NULL DEFAULT 0");
            db2.n("ALTER TABLE projects ADD COLUMN admobBannerEnabled INTEGER NOT NULL DEFAULT 0");
            db2.n("ALTER TABLE projects ADD COLUMN admobInterstitialEnabled INTEGER NOT NULL DEFAULT 0");
            db2.n("ALTER TABLE projects ADD COLUMN admobRewardedEnabled INTEGER NOT NULL DEFAULT 0");
            db2.n("ALTER TABLE projects ADD COLUMN admobInterstitialIntervalSeconds INTEGER NOT NULL DEFAULT 0");
            db2.n("ALTER TABLE projects ADD COLUMN admobInterstitialPageCount INTEGER NOT NULL DEFAULT 0");
        }
    };
    private static final a MIGRATION_16_17 = new a() { // from class: com.basitce.htmltoapk.data.local.AppDatabaseMigrations$MIGRATION_16_17$1
        @Override // z5.a
        public void migrate(b db2) throws SQLException {
            r.e(db2, "db");
            db2.n("ALTER TABLE projects ADD COLUMN billingType TEXT DEFAULT 'non_consumable'");
            db2.n("ALTER TABLE projects ADD COLUMN billingTestMode INTEGER NOT NULL DEFAULT 0");
            db2.n("ALTER TABLE projects ADD COLUMN billingAutoConsume INTEGER NOT NULL DEFAULT 1");
            db2.n("ALTER TABLE projects ADD COLUMN billingAcknowledge INTEGER NOT NULL DEFAULT 1");
            db2.n("ALTER TABLE projects ADD COLUMN billingEnablePendingPurchases INTEGER NOT NULL DEFAULT 1");
            db2.n("ALTER TABLE projects ADD COLUMN billingSubscriptionPeriod TEXT");
            db2.n("ALTER TABLE projects ADD COLUMN billingFreeTrialDays INTEGER NOT NULL DEFAULT 0");
            db2.n("ALTER TABLE projects ADD COLUMN billingIntroductoryPrice TEXT");
            db2.n("ALTER TABLE projects ADD COLUMN billingProductName TEXT");
            db2.n("ALTER TABLE projects ADD COLUMN billingProductDescription TEXT");
        }
    };
    private static final a MIGRATION_17_18 = new a() { // from class: com.basitce.htmltoapk.data.local.AppDatabaseMigrations$MIGRATION_17_18$1
        @Override // z5.a
        public void migrate(b db2) throws SQLException {
            r.e(db2, "db");
            db2.n("ALTER TABLE projects ADD COLUMN showCameraCutout INTEGER NOT NULL DEFAULT 0");
        }
    };
    private static final a MIGRATION_18_19 = new a() { // from class: com.basitce.htmltoapk.data.local.AppDatabaseMigrations$MIGRATION_18_19$1
        @Override // z5.a
        public void migrate(b db2) throws SQLException {
            r.e(db2, "db");
            db2.n("ALTER TABLE projects ADD COLUMN desktopMode INTEGER NOT NULL DEFAULT 0");
        }
    };
    private static final a MIGRATION_19_20 = new a() { // from class: com.basitce.htmltoapk.data.local.AppDatabaseMigrations$MIGRATION_19_20$1
        @Override // z5.a
        public void migrate(b db2) throws SQLException {
            r.e(db2, "db");
            db2.n("ALTER TABLE projects ADD COLUMN admobChildDirectedTreatment INTEGER NOT NULL DEFAULT -1");
            db2.n("ALTER TABLE projects ADD COLUMN admobUnderAgeOfConsent INTEGER NOT NULL DEFAULT -1");
            db2.n("ALTER TABLE projects ADD COLUMN admobMaxAdContentRating TEXT NOT NULL DEFAULT ''");
            db2.n("ALTER TABLE projects ADD COLUMN umpDebugEnabled INTEGER NOT NULL DEFAULT 0");
            db2.n("ALTER TABLE projects ADD COLUMN umpDebugGeography TEXT NOT NULL DEFAULT 'DISABLED'");
            db2.n("ALTER TABLE projects ADD COLUMN umpTestDeviceIds TEXT");
        }
    };
    private static final a MIGRATION_20_21 = new a() { // from class: com.basitce.htmltoapk.data.local.AppDatabaseMigrations$MIGRATION_20_21$1
        @Override // z5.a
        public void migrate(b db2) throws SQLException {
            r.e(db2, "db");
            db2.n("ALTER TABLE projects ADD COLUMN kind TEXT NOT NULL DEFAULT 'apk'");
            db2.n("ALTER TABLE projects ADD COLUMN folderId INTEGER");
            db2.n("CREATE INDEX IF NOT EXISTS `index_projects_folderId` ON `projects` (`folderId`)");
            db2.n("CREATE TABLE IF NOT EXISTS `folders` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `sortOrder` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL)");
        }
    };
    public static final int $stable = 8;

    private AppDatabaseMigrations() {
    }

    public final a getMIGRATION_10_11() {
        return MIGRATION_10_11;
    }

    public final a getMIGRATION_11_12() {
        return MIGRATION_11_12;
    }

    public final a getMIGRATION_12_13() {
        return MIGRATION_12_13;
    }

    public final a getMIGRATION_13_14() {
        return MIGRATION_13_14;
    }

    public final a getMIGRATION_14_15() {
        return MIGRATION_14_15;
    }

    public final a getMIGRATION_15_16() {
        return MIGRATION_15_16;
    }

    public final a getMIGRATION_16_17() {
        return MIGRATION_16_17;
    }

    public final a getMIGRATION_17_18() {
        return MIGRATION_17_18;
    }

    public final a getMIGRATION_18_19() {
        return MIGRATION_18_19;
    }

    public final a getMIGRATION_19_20() {
        return MIGRATION_19_20;
    }

    public final a getMIGRATION_20_21() {
        return MIGRATION_20_21;
    }

    public final a getMIGRATION_7_8() {
        return MIGRATION_7_8;
    }

    public final a getMIGRATION_8_9() {
        return MIGRATION_8_9;
    }

    public final a getMIGRATION_9_10() {
        return MIGRATION_9_10;
    }
}
