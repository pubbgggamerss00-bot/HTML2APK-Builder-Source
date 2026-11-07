package com.basitce.htmltoapk.data.apkgenerator;

import ah.h;
import ah.h.b;
import ah.l;
import android.content.Context;
import androidx.room.z0;
import com.android.apksig.apk.ApkUtils;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.ApkGenerator;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import com.basitce.htmltoapk.data.apkgenerator.IconGenerator;
import com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlDecoder;
import com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlEncoder;
import com.basitce.htmltoapk.data.apkgenerator.signer.ApkSignerHelper;
import com.basitce.htmltoapk.data.apkgenerator.signer.SigningKey;
import com.basitce.htmltoapk.data.apkgenerator.signer.SigningKeyResolver;
import com.basitce.htmltoapk.domain.model.BuildConfiguration;
import com.basitce.htmltoapk.domain.model.BuildState;
import com.basitce.htmltoapk.domain.model.ContentSource;
import com.basitce.htmltoapk.domain.model.Project;
import com.basitce.htmltoapk.domain.model.WebViewSettingsKt;
import f9.fg;
import i0.x1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.internal.r;
import mh.k;
import mh.p;
import mh.t;
import mh.y;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import org.xml.sax.SAXException;
import p5.g0;
import pg.f0;
import pg.n;
import pg.q;
import ph.i0;
import qg.k0;
import qg.x;
import sh.a1;
import sh.j0;
import sh.y0;

/* loaded from: classes.dex */
public final class ApkGenerator {
    private final j0<BuildState> _buildState;
    private final y0<BuildState> buildState;
    private final Context context;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Map<String, Integer> DENSITY_ICON_PX = k0.d(new n("mdpi", 48), new n("hdpi", 72), new n("xhdpi", 96), new n("xxhdpi", 144), new n("xxxhdpi", 192));
    private static final Map<String, Integer> ADAPTIVE_DENSITY_ICON_PX = k0.d(new n("mdpi", Integer.valueOf(HeaderItem.DATA_START_OFFSET)), new n("hdpi", 162), new n("xhdpi", 216), new n("xxhdpi", 324), new n("xxxhdpi", 432));

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence createManifestXml$lambda$0(String perm) {
            r.e(perm, "perm");
            return "    <uses-permission android:name=\"" + perm + "\" />";
        }

        private final String escapeXmlAttr(String str) {
            return t.n(t.n(t.n(t.n(t.n(str, "&", "&amp;"), "<", "&lt;"), ">", "&gt;"), "\"", "&quot;"), "'", "&apos;");
        }

        public static /* synthetic */ void injectIcon$app_release$default(Companion companion, File file, File file2, String str, int i10, Object obj) throws IOException {
            if ((i10 & 4) != 0) {
                str = null;
            }
            companion.injectIcon$app_release(file, file2, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean zipDirectory$lambda$13(File file, File it) {
            r.e(it, "it");
            return it.isFile() && !it.equals(file);
        }

        public final String createManifestXml$app_release(BuildConfiguration config) {
            String strB;
            String string;
            r.e(config, "config");
            Set setG0 = x.g0(config.getProject().getPermissions());
            if (config.getProject().getContentSource() instanceof ContentSource.Url) {
                setG0.add("android.permission.INTERNET");
                setG0.add("android.permission.ACCESS_NETWORK_STATE");
            }
            boolean admobEnabled = config.getProject().getAdmobEnabled();
            if (admobEnabled) {
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
            String strI = x.I(x.T(setG0), "\n", null, null, new b(), 30);
            k kVar = l9.a.f16766a;
            String strB2 = l9.a.b(config.getProject());
            String strA = (!admobEnabled || strB2 == null) ? "" : g0.a("\n        <meta-data\n            android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n            android:value=\"", escapeXmlAttr(strB2), "\" />\n        <meta-data\n            android:name=\"com.google.android.gms.version\"\n            android:value=\"@integer/google_play_services_version\" />\n        <activity\n            android:name=\"com.google.android.gms.ads.AdActivity\"\n            android:configChanges=\"0x00000fb0\"\n            android:exported=\"false\"\n            android:theme=\"@0x0103000f\" />\n        <provider\n            android:name=\"com.google.android.gms.ads.MobileAdsInitProvider\"\n            android:authorities=\"", config.getProject().getPackageName(), ".mobileadsinitprovider\"\n            android:exported=\"false\"\n            android:initOrder=\"100\" />\n        <service\n            android:name=\"com.google.android.gms.ads.AdService\"\n            android:enabled=\"true\"\n            android:exported=\"false\" />\n        <activity\n            android:name=\"com.google.android.gms.common.api.GoogleApiActivity\"\n            android:exported=\"false\"\n            android:theme=\"@0x01030010\" />");
            Integer maxSdk = config.getProject().getMaxSdk();
            if (maxSdk == null || (strB = ad.b.b(maxSdk.intValue(), " android:maxSdkVersion=\"", "\"")) == null) {
                strB = "";
            }
            String string2 = mh.x.W(config.getProject().getVersionName()).toString();
            if (mh.x.A(string2)) {
                string2 = "1.0";
            }
            String string3 = mh.x.W(config.getProject().getAppName()).toString();
            if (mh.x.A(string3)) {
                string3 = "App";
            }
            String strEscapeXmlAttr = escapeXmlAttr(string2);
            String strEscapeXmlAttr2 = escapeXmlAttr(string3);
            String orientation = config.getProject().getOrientation();
            int iHashCode = orientation.hashCode();
            String str = "0x00000001";
            if (iHashCode != 3005871) {
                if (iHashCode == 729267099) {
                    orientation.equals("portrait");
                } else if (iHashCode == 1430647483 && orientation.equals("landscape")) {
                    str = "0x00000000";
                }
            } else if (orientation.equals("auto")) {
                str = "0x00000004";
            }
            String strA2 = k3.a.a(config.getProject().getPackageName(), ".WebViewActivity");
            String deepLinkScheme = config.getProject().getDeepLinkScheme();
            String str2 = null;
            if (deepLinkScheme != null && (string = mh.x.W(deepLinkScheme).toString()) != null && !mh.x.A(string)) {
                str2 = string;
            }
            String strD = str2 != null ? i8.n.d("\n            <intent-filter>\n                <action android:name=\"android.intent.action.VIEW\" />\n                <category android:name=\"android.intent.category.DEFAULT\" />\n                <category android:name=\"android.intent.category.BROWSABLE\" />\n                <data android:scheme=\"", str2, "\" />\n            </intent-filter>") : "";
            String str3 = WebViewSettingsKt.opensExternalPdfs(config.getProject().getWebViewSettings(), config.getProject().getContentSource() instanceof ContentSource.Pdf) ? "\n            <intent-filter>\n                <action android:name=\"android.intent.action.VIEW\" />\n                <category android:name=\"android.intent.category.DEFAULT\" />\n                <data android:scheme=\"content\" android:mimeType=\"application/pdf\" />\n            </intent-filter>" : "";
            String strD2 = setG0.contains("android.permission.RECEIVE_BOOT_COMPLETED") ? i8.n.d("\n        <receiver\n            android:name=\"", config.getProject().getPackageName(), ".BootReceiver\"\n            android:enabled=\"true\"\n            android:exported=\"true\">\n            <intent-filter>\n                <action android:name=\"android.intent.action.BOOT_COMPLETED\" />\n                <action android:name=\"android.intent.action.MY_PACKAGE_REPLACED\" />\n                <action android:name=\"android.intent.action.TIME_SET\" />\n                <action android:name=\"android.intent.action.TIMEZONE_CHANGED\" />\n            </intent-filter>\n        </receiver>") : "";
            String strA3 = g0.a("\n    <permission\n        android:name=\"", config.getProject().getPackageName(), ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION\"\n        android:protectionLevel=\"0x00000002\" />\n    <uses-permission android:name=\"", config.getProject().getPackageName(), ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION\" />");
            String str4 = admobEnabled ? "\n        <uses-library\n            android:name=\"android.ext.adservices\"\n            android:required=\"false\" />\n        <property\n            android:name=\"android.adservices.AD_SERVICES_CONFIG\"\n            android:resource=\"@xml/gma_ad_services_config\" />\n        <activity\n            android:name=\"com.google.android.gms.ads.NotificationHandlerActivity\"\n            android:exported=\"false\"\n            android:taskAffinity=\"\"\n            android:excludeFromRecents=\"true\"\n            android:launchMode=\"2\"\n            android:theme=\"@0x01030010\" />" : "";
            String strD3 = i8.n.d("\n        <provider\n            android:name=\"androidx.startup.InitializationProvider\"\n            android:authorities=\"", config.getProject().getPackageName(), ".androidx-startup\"\n            android:exported=\"false\">\n            <meta-data android:name=\"androidx.emoji2.text.EmojiCompatInitializer\" android:value=\"androidx.startup\" />\n            <meta-data android:name=\"androidx.work.WorkManagerInitializer\" android:value=\"androidx.startup\" />\n            <meta-data android:name=\"androidx.lifecycle.ProcessLifecycleInitializer\" android:value=\"androidx.startup\" />\n            <meta-data android:name=\"androidx.profileinstaller.ProfileInstallerInitializer\" android:value=\"androidx.startup\" />\n        </provider>\n        <service\n            android:name=\"androidx.work.impl.background.systemalarm.SystemAlarmService\"\n            android:enabled=\"@bool/enable_system_alarm_service_default\"\n            android:exported=\"false\"\n            android:directBootAware=\"false\" />\n        <service\n            android:name=\"androidx.work.impl.background.systemjob.SystemJobService\"\n            android:permission=\"android.permission.BIND_JOB_SERVICE\"\n            android:enabled=\"@bool/enable_system_job_service_default\"\n            android:exported=\"true\"\n            android:directBootAware=\"false\" />\n        <service\n            android:name=\"androidx.work.impl.foreground.SystemForegroundService\"\n            android:enabled=\"@bool/enable_system_foreground_service_default\"\n            android:exported=\"false\"\n            android:directBootAware=\"false\" />\n        <receiver\n            android:name=\"androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver\"\n            android:enabled=\"true\"\n            android:exported=\"false\"\n            android:directBootAware=\"false\" />\n        <receiver\n            android:name=\"androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy\"\n            android:enabled=\"false\"\n            android:exported=\"false\"\n            android:directBootAware=\"false\">\n            <intent-filter>\n                <action android:name=\"android.intent.action.ACTION_POWER_CONNECTED\" />\n                <action android:name=\"android.intent.action.ACTION_POWER_DISCONNECTED\" />\n            </intent-filter>\n        </receiver>\n        <receiver\n            android:name=\"androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy\"\n            android:enabled=\"false\"\n            android:exported=\"false\"\n            android:directBootAware=\"false\">\n            <intent-filter>\n                <action android:name=\"android.intent.action.BATTERY_OKAY\" />\n                <action android:name=\"android.intent.action.BATTERY_LOW\" />\n            </intent-filter>\n        </receiver>\n        <receiver\n            android:name=\"androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy\"\n            android:enabled=\"false\"\n            android:exported=\"false\"\n            android:directBootAware=\"false\">\n            <intent-filter>\n                <action android:name=\"android.intent.action.DEVICE_STORAGE_LOW\" />\n                <action android:name=\"android.intent.action.DEVICE_STORAGE_OK\" />\n            </intent-filter>\n        </receiver>\n        <receiver\n            android:name=\"androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy\"\n            android:enabled=\"false\"\n            android:exported=\"false\"\n            android:directBootAware=\"false\">\n            <intent-filter>\n                <action android:name=\"android.net.conn.CONNECTIVITY_CHANGE\" />\n            </intent-filter>\n        </receiver>\n        <receiver\n            android:name=\"androidx.work.impl.background.systemalarm.RescheduleReceiver\"\n            android:enabled=\"false\"\n            android:exported=\"false\"\n            android:directBootAware=\"false\">\n            <intent-filter>\n                <action android:name=\"android.intent.action.BOOT_COMPLETED\" />\n                <action android:name=\"android.intent.action.TIME_SET\" />\n                <action android:name=\"android.intent.action.TIMEZONE_CHANGED\" />\n            </intent-filter>\n        </receiver>\n        <receiver\n            android:name=\"androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver\"\n            android:enabled=\"@bool/enable_system_alarm_service_default\"\n            android:exported=\"false\"\n            android:directBootAware=\"false\">\n            <intent-filter>\n                <action android:name=\"androidx.work.impl.background.systemalarm.UpdateProxies\" />\n            </intent-filter>\n        </receiver>\n        <receiver\n            android:name=\"androidx.work.impl.diagnostics.DiagnosticsReceiver\"\n            android:permission=\"android.permission.DUMP\"\n            android:enabled=\"true\"\n            android:exported=\"true\"\n            android:directBootAware=\"false\">\n            <intent-filter>\n                <action android:name=\"androidx.work.diagnostics.REQUEST_DIAGNOSTICS\" />\n            </intent-filter>\n        </receiver>\n        <receiver\n            android:name=\"androidx.profileinstaller.ProfileInstallReceiver\"\n            android:permission=\"android.permission.DUMP\"\n            android:enabled=\"true\"\n            android:exported=\"true\"\n            android:directBootAware=\"false\">\n            <intent-filter>\n                <action android:name=\"androidx.profileinstaller.action.INSTALL_PROFILE\" />\n            </intent-filter>\n            <intent-filter>\n                <action android:name=\"androidx.profileinstaller.action.SKIP_FILE\" />\n            </intent-filter>\n            <intent-filter>\n                <action android:name=\"androidx.profileinstaller.action.SAVE_PROFILE\" />\n            </intent-filter>\n            <intent-filter>\n                <action android:name=\"androidx.profileinstaller.action.BENCHMARK_OPERATION\" />\n            </intent-filter>\n        </receiver>\n        <service\n            android:name=\"androidx.room.MultiInstanceInvalidationService\"\n            android:exported=\"false\"\n            android:directBootAware=\"true\" />");
            String packageName = config.getProject().getPackageName();
            int versionCode = config.getProject().getVersionCode();
            int minSdk = config.getProject().getMinSdk();
            String str5 = str4;
            int targetSdk = config.getProject().getTargetSdk();
            String str6 = strD2;
            String packageName2 = config.getProject().getPackageName();
            String packageName3 = config.getProject().getPackageName();
            String packageName4 = config.getProject().getPackageName();
            StringBuilder sbA = androidx.datastore.preferences.protobuf.h.a(versionCode, "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"\n    package=\"", packageName, "\"\n    android:versionCode=\"", "\"\n    android:versionName=\"");
            sbA.append(strEscapeXmlAttr);
            sbA.append("\"\n    android:compileSdkVersion=\"36\"\n    android:compileSdkVersionCodename=\"Baklava\"\n    platformBuildVersionCode=\"36\"\n    platformBuildVersionName=\"Baklava\">\n\n    <uses-sdk\n        android:minSdkVersion=\"");
            sbA.append(minSdk);
            sbA.append("\"\n        android:targetSdkVersion=\"");
            sbA.append(targetSdk);
            sbA.append("\"");
            sbA.append(strB);
            sbA.append(" />\n\n");
            z0.a(sbA, strI, "\n", strA3, "\n\n    <uses-feature android:name=\"android.hardware.camera\" android:required=\"false\" />\n    <uses-feature android:name=\"android.hardware.location.gps\" android:required=\"false\" />\n    <uses-feature android:name=\"android.hardware.sensor.accelerometer\" android:required=\"false\" />\n    <uses-feature android:name=\"android.hardware.sensor.gyroscope\" android:required=\"false\" />\n    <uses-feature android:name=\"android.hardware.sensor.compass\" android:required=\"false\" />\n    <uses-feature android:name=\"android.hardware.sensor.stepcounter\" android:required=\"false\" />\n\n    <queries>\n        <intent>\n            <action android:name=\"android.intent.action.VIEW\" />\n            <category android:name=\"android.intent.category.BROWSABLE\" />\n            <data android:scheme=\"https\" />\n        </intent>\n        <intent>\n            <action android:name=\"android.support.customtabs.action.CustomTabsService\" />\n        </intent>\n        <intent>\n            <action android:name=\"android.intent.action.INSERT\" />\n            <data android:mimeType=\"vnd.android.cursor.dir/event\" />\n        </intent>\n        <intent>\n            <action android:name=\"android.intent.action.VIEW\" />\n            <data android:scheme=\"sms\" />\n        </intent>\n        <intent>\n            <action android:name=\"android.intent.action.DIAL\" />\n            <data android:path=\"tel:\" />\n        </intent>\n    </queries>\n\n    <application\n        android:label=\"");
            z0.a(sbA, strEscapeXmlAttr2, "\"\n        android:icon=\"@mipmap/ic_launcher\"\n        android:roundIcon=\"@mipmap/ic_launcher_round\"\n        android:theme=\"@style/Theme.HTMLTemplate\"\n        android:allowBackup=\"false\"\n        android:extractNativeLibs=\"false\"\n        android:usesCleartextTraffic=\"true\"\n        android:networkSecurityConfig=\"@xml/network_security_config\"\n        android:appComponentFactory=\"androidx.core.app.CoreComponentFactory\"\n        android:enableOnBackInvokedCallback=\"true\">", strA, "\n        <activity\n            android:name=\"");
            z0.a(sbA, strA2, "\"\n            android:exported=\"true\"\n            android:theme=\"@style/Theme.HTMLTemplate\"\n            android:configChanges=\"0x000006a0\"\n            android:screenOrientation=\"", str, "\"\n            android:windowSoftInputMode=\"0x00000010\">\n            <intent-filter>\n                <action android:name=\"android.intent.action.MAIN\" />\n                <category android:name=\"android.intent.category.LAUNCHER\" />\n            </intent-filter>");
            z0.a(sbA, strD, str3, "\n        </activity>\n        <activity android:name=\"", packageName2);
            z0.a(sbA, ".PdfActivity\"\n            android:exported=\"false\" android:theme=\"@style/Theme.HTMLTemplate\" />\n        <receiver\n            android:name=\"", packageName3, ".AlarmReceiver\"\n            android:exported=\"false\" />\n", str6);
            z0.a(sbA, "\n        <provider\n            android:name=\"androidx.core.content.FileProvider\"\n            android:authorities=\"", packageName4, ".fileprovider\"\n            android:exported=\"false\"\n            android:grantUriPermissions=\"true\">\n            <meta-data\n                android:name=\"android.support.FILE_PROVIDER_PATHS\"\n                android:resource=\"@xml/file_paths\" />\n        </provider>\n\n        <service\n            android:name=\"androidx.camera.core.impl.MetadataHolderService\"\n            android:enabled=\"false\"\n            android:exported=\"false\">\n            <meta-data\n                android:name=\"androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER\"\n                android:value=\"androidx.camera.camera2.Camera2Config$DefaultProvider\" />\n        </service>", str5);
            sbA.append(strD3);
            sbA.append("\n    </application>\n\n</manifest>");
            return p.c(sbA.toString());
        }

        public final byte[] encodeManifestXml$app_release(Context context, String manifestXml) throws SAXException, IOException {
            r.e(context, "context");
            r.e(manifestXml, "manifestXml");
            BuildLogger buildLogger = BuildLogger.INSTANCE;
            buildLogger.detail(BuildLogger.BuildStage.MANIFEST_ENCODING_UNICODE, R.string.build_log_manifest_binary_xml, new Object[0]);
            byte[] bArrEncode = BinaryXmlEncoder.INSTANCE.encode(manifestXml);
            buildLogger.detail(BuildLogger.BuildStage.MANIFEST_ENCODED, R.string.build_log_manifest_encoded, Integer.valueOf(bArrEncode.length));
            try {
                BinaryXmlDecoder binaryXmlDecoder = BinaryXmlDecoder.INSTANCE;
                buildLogger.detail(BuildLogger.BuildStage.MANIFEST_DECODED, R.string.build_log_manifest_decode_ok, y.b0(2000, binaryXmlDecoder.dump(binaryXmlDecoder.decode(bArrEncode))));
                return bArrEncode;
            } catch (Exception e10) {
                BuildLogger buildLogger2 = BuildLogger.INSTANCE;
                BuildLogger.BuildStage buildStage = BuildLogger.BuildStage.MANIFEST_DECODED;
                String message = e10.getMessage();
                if (message == null) {
                    message = context.getString(R.string.build_log_unknown_error);
                    r.d(message, "getString(...)");
                }
                buildLogger2.detail(buildStage, R.string.build_log_manifest_decode_failed, message);
                String message2 = e10.getMessage();
                if (message2 == null) {
                    message2 = "";
                }
                throw new RuntimeException(context.getString(R.string.build_log_manifest_corrupt, message2), e10);
            }
        }

        public final void injectAssets$app_release(BuildConfiguration config, File assetDir) throws IOException {
            r.e(config, "config");
            r.e(assetDir, "assetDir");
            ProjectAssetWriter.INSTANCE.writeProjectAssets(config.getProject(), assetDir, config.isPremium() || config.getNativeApisUnlocked());
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void injectIcon$app_release(File resRoot, File iconFile, String str) throws IOException {
            File parentFile;
            String name;
            Integer num;
            File circleIcon;
            Integer num2;
            String name2;
            r.e(resRoot, "resRoot");
            r.e(iconFile, "iconFile");
            IconGenerator iconGenerator = IconGenerator.INSTANCE;
            File parentFile2 = resRoot.getParentFile();
            if (parentFile2 == null) {
                parentFile2 = resRoot;
            }
            IconGenerator.StyledIconResult styledIconResultCreateFullStyledIconFiles = iconGenerator.createFullStyledIconFiles(iconFile, parentFile2, str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            h.b bVar = l.p(resRoot).new b();
            int i10 = 0;
            while (bVar.hasNext()) {
                File next = bVar.next();
                if (next.isFile() && (parentFile = next.getParentFile()) != null && (name = parentFile.getName()) != null && t.p(name, "mipmap", false) && !l.g(next).equals("xml")) {
                    File parentFile3 = next.getParentFile();
                    String strU = (parentFile3 == null || (name2 = parentFile3.getName()) == null) ? null : mh.x.U(mh.x.I(name2, "mipmap-"), '-');
                    String name3 = next.getName();
                    r.d(name3, "getName(...)");
                    if (!mh.x.r(name3, "foreground", false)) {
                        String name4 = next.getName();
                        r.d(name4, "getName(...)");
                        int iIntValue = mh.x.r(name4, "background", false) ? (strU == null || (num = (Integer) ApkGenerator.ADAPTIVE_DENSITY_ICON_PX.get(strU)) == null) ? 432 : num.intValue() : (strU == null || (num2 = (Integer) ApkGenerator.DENSITY_ICON_PX.get(strU)) == null) ? 192 : num2.intValue();
                        String name5 = next.getName();
                        r.d(name5, "getName(...)");
                        if (mh.x.r(name5, "foreground", false)) {
                            circleIcon = styledIconResultCreateFullStyledIconFiles.getForegroundIcon();
                        } else {
                            String name6 = next.getName();
                            r.d(name6, "getName(...)");
                            if (mh.x.r(name6, "background", false)) {
                                circleIcon = styledIconResultCreateFullStyledIconFiles.getBackgroundIcon();
                            } else {
                                String name7 = next.getName();
                                r.d(name7, "getName(...)");
                                circleIcon = mh.x.r(name7, "round", false) ? styledIconResultCreateFullStyledIconFiles.getCircleIcon() : styledIconResultCreateFullStyledIconFiles.getSquareIcon();
                            }
                        }
                        String str2 = circleIcon.getName() + "-" + iIntValue;
                        Object obj = linkedHashMap.get(str2);
                        Object obj2 = obj;
                        if (obj == null) {
                            File fileCreateTempFile = File.createTempFile("icon_" + iIntValue + "_", ".png");
                            try {
                                IconGenerator iconGenerator2 = IconGenerator.INSTANCE;
                                r.b(fileCreateTempFile);
                                iconGenerator2.scaleTo(circleIcon, iIntValue, fileCreateTempFile);
                            } catch (Exception e10) {
                                BuildLogger buildLogger = BuildLogger.INSTANCE;
                                Integer numValueOf = Integer.valueOf(iIntValue);
                                String message = e10.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                buildLogger.detail(R.string.build_log_icon_scale_failed, numValueOf, message);
                                r.b(fileCreateTempFile);
                                l.e(circleIcon, fileCreateTempFile);
                            }
                            r.d(fileCreateTempFile, "apply(...)");
                            linkedHashMap.put(str2, fileCreateTempFile);
                            obj2 = fileCreateTempFile;
                        }
                        FileInputStream fileInputStream = new FileInputStream((File) obj2);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(next);
                            try {
                                ah.b.a(fileInputStream, fileOutputStream, 8192);
                                fileOutputStream.close();
                                fileInputStream.close();
                                i10++;
                                BuildLogger.INSTANCE.detail(BuildLogger.BuildStage.ICON_INJECTED, R.string.build_log_icon_injected_path, l.l(next, resRoot).getPath(), Integer.valueOf(iIntValue));
                            } finally {
                            }
                        } finally {
                        }
                    }
                }
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
            if (!r.a(styledIconResultCreateFullStyledIconFiles.getForegroundIcon(), iconFile)) {
                styledIconResultCreateFullStyledIconFiles.getForegroundIcon().delete();
            }
            if (!r.a(styledIconResultCreateFullStyledIconFiles.getBackgroundIcon(), iconFile)) {
                styledIconResultCreateFullStyledIconFiles.getBackgroundIcon().delete();
            }
            if (!r.a(styledIconResultCreateFullStyledIconFiles.getSquareIcon(), iconFile)) {
                styledIconResultCreateFullStyledIconFiles.getSquareIcon().delete();
            }
            if (!r.a(styledIconResultCreateFullStyledIconFiles.getCircleIcon(), iconFile)) {
                styledIconResultCreateFullStyledIconFiles.getCircleIcon().delete();
            }
            BuildLogger.INSTANCE.detail(BuildLogger.BuildStage.ICON_FILES_INJECTED, R.string.build_log_icon_files_total, Integer.valueOf(i10));
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:40:0x013d A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:18:0x00a9, B:20:0x00b3, B:22:0x00e0, B:24:0x00ee, B:26:0x00f7, B:28:0x00ff, B:30:0x0107, B:32:0x010f, B:34:0x0117, B:39:0x0124, B:40:0x013d, B:42:0x014d, B:47:0x015b, B:49:0x0163, B:52:0x016c, B:64:0x01d1, B:71:0x01eb, B:73:0x01f7, B:77:0x021a, B:78:0x021d, B:53:0x0176, B:57:0x0195, B:61:0x01a3, B:62:0x01a5, B:63:0x01c4, B:79:0x021e, B:65:0x01d9, B:67:0x01e0, B:70:0x01e8, B:75:0x0218), top: B:86:0x00a9, inners: #2, #4 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void zipDirectory$app_release(File file, File outputFile) throws IOException {
            Object obj;
            ArrayList arrayList;
            int i10;
            char c10;
            boolean z10;
            final File sourceDir = file;
            r.e(sourceDir, "sourceDir");
            r.e(outputFile, "outputFile");
            List<File> listU = x.U(new Comparator() { // from class: com.basitce.htmltoapk.data.apkgenerator.ApkGenerator$Companion$zipDirectory$$inlined$compareBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t3, T t10) {
                    Integer num;
                    Integer num2 = 3;
                    File file2 = (File) t3;
                    if (r.a(file2.getName(), ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME)) {
                        num = 0;
                    } else {
                        String name = file2.getName();
                        r.d(name, "getName(...)");
                        num = t.i(name, ".dex", false) ? 1 : r.a(file2.getName(), "resources.arsc") ? 2 : num2;
                    }
                    File file3 = (File) t10;
                    if (r.a(file3.getName(), ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME)) {
                        num2 = 0;
                    } else {
                        String name2 = file3.getName();
                        r.d(name2, "getName(...)");
                        if (t.i(name2, ".dex", false)) {
                            num2 = 1;
                        } else if (r.a(file3.getName(), "resources.arsc")) {
                            num2 = 2;
                        }
                    }
                    return x1.b(num, num2);
                }
            }, lh.j.k(lh.j.i(l.p(sourceDir), new eh.l() { // from class: com.basitce.htmltoapk.data.apkgenerator.c
                @Override // eh.l
                public final Object invoke(Object obj2) {
                    return Boolean.valueOf(ApkGenerator.Companion.zipDirectory$lambda$13(sourceDir, (File) obj2));
                }
            })));
            BuildLogger.INSTANCE.detail(BuildLogger.BuildStage.ZIP_ORDER_KNOWN, R.string.build_log_zip_order, Integer.valueOf(listU.size()));
            byte[] bArr = new byte[8192];
            ArrayList arrayList2 = new ArrayList(qg.p.h(listU, 10));
            for (File file2 : listU) {
                CRC32 crc32 = new CRC32();
                FileInputStream fileInputStream = new FileInputStream(file2);
                while (true) {
                    try {
                        int i11 = fileInputStream.read(bArr);
                        if (i11 == -1) {
                            break;
                        } else {
                            crc32.update(bArr, 0, i11);
                        }
                    } finally {
                    }
                }
                f0 f0Var = f0.f21461a;
                fileInputStream.close();
                arrayList2.add(new pg.t(file2, Long.valueOf(file2.length()), Long.valueOf(crc32.getValue())));
            }
            final FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
            FilterOutputStream filterOutputStream = new FilterOutputStream(fileOutputStream) { // from class: com.basitce.htmltoapk.data.apkgenerator.ApkGenerator$Companion$zipDirectory$CountingOutputStream
                private long count;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(fileOutputStream);
                    r.e(fileOutputStream, "out");
                }

                public final long getCount() {
                    return this.count;
                }

                public final void setCount(long j10) {
                    this.count = j10;
                }

                @Override // java.io.FilterOutputStream, java.io.OutputStream
                public void write(int i12) throws IOException {
                    ((FilterOutputStream) this).out.write(i12);
                    this.count++;
                }

                @Override // java.io.FilterOutputStream, java.io.OutputStream
                public void write(byte[] b10, int i12, int i13) throws IOException {
                    r.e(b10, "b");
                    ((FilterOutputStream) this).out.write(b10, i12, i13);
                    this.count += i13;
                }
            };
            ZipOutputStream zipOutputStream = new ZipOutputStream(filterOutputStream);
            try {
                byte[] bArr2 = new byte[8192];
                int size = arrayList2.size();
                int i12 = 0;
                int i13 = 0;
                ApkGenerator$Companion$zipDirectory$CountingOutputStream apkGenerator$Companion$zipDirectory$CountingOutputStream = filterOutputStream;
                while (i13 < size) {
                    Object obj2 = arrayList2.get(i13);
                    i13++;
                    pg.t tVar = (pg.t) obj2;
                    File file3 = (File) tVar.f21479a;
                    long jLongValue = ((Number) tVar.f21480b).longValue();
                    long jLongValue2 = ((Number) tVar.f21481c).longValue();
                    String strH = l.h(l.l(file3, sourceDir));
                    if (t.p(strH, "META-INF/", false)) {
                        String strT = mh.x.T(strH, '/', strH);
                        if (strT.equals("MANIFEST.MF") || t.i(strT, ".SF", false) || t.i(strT, ".RSA", false) || t.i(strT, ".DSA", false) || t.i(strT, ".EC", false) || strT.equals("com.android.build.gradle.app-metadata.properties") || strT.equals("version-control-info.textproto")) {
                            BuildLogger buildLogger = BuildLogger.INSTANCE;
                            buildLogger.tick(BuildLogger.BuildTick.ZIP_SKIPPED_ENTRY);
                            buildLogger.detail(R.string.build_log_zip_skip_meta, strH);
                            obj = apkGenerator$Companion$zipDirectory$CountingOutputStream;
                            arrayList = arrayList2;
                            i10 = size;
                            c10 = 65535;
                            z10 = false;
                        } else {
                            ZipEntry zipEntry = new ZipEntry(strH);
                            boolean z11 = t.p(strH, "lib/", false) && t.i(strH, ".so", false);
                            if (z11 || strH.equals("resources.arsc") || strH.equals(ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME)) {
                                r.d(strH.getBytes(mh.a.f18238b), "getBytes(...)");
                                boolean z12 = z11;
                                obj = apkGenerator$Companion$zipDirectory$CountingOutputStream;
                                long count = apkGenerator$Companion$zipDirectory$CountingOutputStream.getCount() + r11.length + 30;
                                long j10 = z12 ? 16384L : 4L;
                                arrayList = arrayList2;
                                i10 = size;
                                int i14 = (int) ((j10 - (count % j10)) % j10);
                                if (i14 > 0) {
                                    if (i14 < 4) {
                                        i14 += (int) j10;
                                    }
                                    byte[] bArr3 = new byte[i14];
                                    bArr3[0] = 53;
                                    bArr3[1] = -39;
                                    int i15 = i14 - 4;
                                    bArr3[2] = (byte) (i15 & 255);
                                    bArr3[3] = (byte) ((i15 >> 8) & 255);
                                    zipEntry.setExtra(bArr3);
                                }
                                zipEntry.setMethod(0);
                                zipEntry.setSize(jLongValue);
                                zipEntry.setCompressedSize(jLongValue);
                                zipEntry.setCrc(jLongValue2);
                            } else {
                                zipEntry.setMethod(8);
                                obj = apkGenerator$Companion$zipDirectory$CountingOutputStream;
                                arrayList = arrayList2;
                                i10 = size;
                            }
                            zipOutputStream.putNextEntry(zipEntry);
                            FileInputStream fileInputStream2 = new FileInputStream(file3);
                            while (true) {
                                try {
                                    int i16 = fileInputStream2.read(bArr2);
                                    c10 = 65535;
                                    if (i16 == -1) {
                                        break;
                                    } else {
                                        zipOutputStream.write(bArr2, 0, i16);
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } finally {
                                    }
                                }
                            }
                            z10 = false;
                            f0 f0Var2 = f0.f21461a;
                            fileInputStream2.close();
                            zipOutputStream.closeEntry();
                            i12++;
                            if (i12 % 50 == 0) {
                                BuildLogger buildLogger2 = BuildLogger.INSTANCE;
                                buildLogger2.tick(BuildLogger.BuildTick.ZIP_FILE);
                                buildLogger2.detail(R.string.build_log_zip_packaging_tick, Integer.valueOf(i12));
                            }
                        }
                    }
                    sourceDir = file;
                    arrayList2 = arrayList;
                    size = i10;
                    apkGenerator$Companion$zipDirectory$CountingOutputStream = obj;
                }
                f0 f0Var3 = f0.f21461a;
                zipOutputStream.close();
                BuildLogger.INSTANCE.detail(R.string.build_log_zip_completed, Long.valueOf(outputFile.length()), Integer.valueOf(i12));
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    ah.c.a(zipOutputStream, th3);
                    throw th4;
                }
            }
        }

        private Companion() {
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.data.apkgenerator.ApkGenerator$generateAab$2", f = "ApkGenerator.kt", l = {215}, m = "invokeSuspend")
    /* renamed from: com.basitce.htmltoapk.data.apkgenerator.ApkGenerator$generateAab$2, reason: invalid class name */
    public static final class AnonymousClass2 extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {
        final /* synthetic */ BuildConfiguration $config;
        final /* synthetic */ File $outputFile;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BuildConfiguration buildConfiguration, File file, tg.e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$config = buildConfiguration;
            this.$outputFile = file;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return ApkGenerator.this.new AnonymousClass2(this.$config, this.$outputFile, eVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.label;
            try {
                try {
                    if (i10 == 0) {
                        q.b(obj);
                        ApkGenerator.this._buildState.setValue(BuildState.Idle.INSTANCE);
                        AabGenerator aabGenerator = new AabGenerator(ApkGenerator.this.context);
                        BuildConfiguration buildConfiguration = this.$config;
                        File file = this.$outputFile;
                        this.label = 1;
                        if (aabGenerator.generate(buildConfiguration, file, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        q.b(obj);
                    }
                    j0 j0Var = ApkGenerator.this._buildState;
                    String absolutePath = this.$outputFile.getAbsolutePath();
                    r.d(absolutePath, "getAbsolutePath(...)");
                    j0Var.setValue(new BuildState.Success(absolutePath));
                    CacheManager.cleanOldTempFiles$default(CacheManager.INSTANCE, ApkGenerator.this.context, 0L, 0L, 6, null);
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Exception e11) {
                    j0 j0Var2 = ApkGenerator.this._buildState;
                    String message = e11.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    j0Var2.setValue(new BuildState.Error(message));
                    CacheManager.cleanOldTempFiles$default(CacheManager.INSTANCE, ApkGenerator.this.context, 0L, 0L, 6, null);
                }
                return f0.f21461a;
            } catch (Throwable th2) {
                CacheManager.cleanOldTempFiles$default(CacheManager.INSTANCE, ApkGenerator.this.context, 0L, 0L, 6, null);
                throw th2;
            }
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((AnonymousClass2) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.data.apkgenerator.ApkGenerator$generateApk$2", f = "ApkGenerator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.basitce.htmltoapk.data.apkgenerator.ApkGenerator$generateApk$2, reason: invalid class name and case insensitive filesystem */
    public static final class C03612 extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {
        final /* synthetic */ BuildConfiguration $config;
        final /* synthetic */ File $outputFile;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03612(BuildConfiguration buildConfiguration, File file, tg.e<? super C03612> eVar) {
            super(2, eVar);
            this.$config = buildConfiguration;
            this.$outputFile = file;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return ApkGenerator.this.new C03612(this.$config, this.$outputFile, eVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0519 A[Catch: all -> 0x029c, Exception -> 0x029e, CancellationException -> 0x02a0, TryCatch #7 {CancellationException -> 0x02a0, Exception -> 0x029e, all -> 0x029c, blocks: (B:48:0x0255, B:49:0x0275, B:51:0x027e, B:53:0x028a, B:56:0x028f, B:57:0x0292, B:67:0x02a2, B:69:0x02d6, B:71:0x02e4, B:72:0x030d, B:74:0x031b, B:76:0x0351, B:78:0x035e, B:80:0x036f, B:82:0x03ab, B:84:0x03b1, B:85:0x03be, B:87:0x03cb, B:92:0x03f5, B:94:0x0403, B:95:0x0407, B:97:0x040f, B:99:0x041f, B:102:0x042c, B:104:0x0519, B:105:0x051c, B:107:0x0529, B:108:0x052c, B:91:0x03d9, B:117:0x05de, B:118:0x05e1, B:119:0x05e2, B:120:0x05f1, B:75:0x0347), top: B:147:0x0255 }] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0529 A[Catch: all -> 0x029c, Exception -> 0x029e, CancellationException -> 0x02a0, TryCatch #7 {CancellationException -> 0x02a0, Exception -> 0x029e, all -> 0x029c, blocks: (B:48:0x0255, B:49:0x0275, B:51:0x027e, B:53:0x028a, B:56:0x028f, B:57:0x0292, B:67:0x02a2, B:69:0x02d6, B:71:0x02e4, B:72:0x030d, B:74:0x031b, B:76:0x0351, B:78:0x035e, B:80:0x036f, B:82:0x03ab, B:84:0x03b1, B:85:0x03be, B:87:0x03cb, B:92:0x03f5, B:94:0x0403, B:95:0x0407, B:97:0x040f, B:99:0x041f, B:102:0x042c, B:104:0x0519, B:105:0x051c, B:107:0x0529, B:108:0x052c, B:91:0x03d9, B:117:0x05de, B:118:0x05e1, B:119:0x05e2, B:120:0x05f1, B:75:0x0347), top: B:147:0x0255 }] */
        /* JADX WARN: Removed duplicated region for block: B:110:0x05c1  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x03d9 A[Catch: all -> 0x029c, Exception -> 0x029e, CancellationException -> 0x02a0, TryCatch #7 {CancellationException -> 0x02a0, Exception -> 0x029e, all -> 0x029c, blocks: (B:48:0x0255, B:49:0x0275, B:51:0x027e, B:53:0x028a, B:56:0x028f, B:57:0x0292, B:67:0x02a2, B:69:0x02d6, B:71:0x02e4, B:72:0x030d, B:74:0x031b, B:76:0x0351, B:78:0x035e, B:80:0x036f, B:82:0x03ab, B:84:0x03b1, B:85:0x03be, B:87:0x03cb, B:92:0x03f5, B:94:0x0403, B:95:0x0407, B:97:0x040f, B:99:0x041f, B:102:0x042c, B:104:0x0519, B:105:0x051c, B:107:0x0529, B:108:0x052c, B:91:0x03d9, B:117:0x05de, B:118:0x05e1, B:119:0x05e2, B:120:0x05f1, B:75:0x0347), top: B:147:0x0255 }] */
        @Override // vg.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            File fileGenerateDefaultIcon;
            Object next;
            boolean z10;
            File parentFile;
            File parentFile2;
            String string;
            ug.a aVar = ug.a.f29706a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            ApkGenerator.this._buildState.setValue(BuildState.Idle.INSTANCE);
            BuildLogger.INSTANCE.reset();
            String string2 = mh.x.W(this.$config.getProject().getPackageName()).toString();
            Iterator<String> it = mh.x.D(this.$config.getProject().getAppName()).iterator();
            while (true) {
                mh.f fVar = (mh.f) it;
                if (!fVar.hasNext()) {
                    next = null;
                    break;
                }
                next = fVar.next();
                if (!mh.x.A((String) next)) {
                    break;
                }
            }
            String str = (String) next;
            String str2 = "App";
            if (str != null && (string = mh.x.W(str).toString()) != null) {
                String strB0 = y.b0(50, string);
                if (!mh.x.A(strB0)) {
                    str2 = strB0;
                }
            }
            String str3 = str2;
            k kVar = fg.X0;
            n nVarC = fg.f.c(string2, str3);
            String str4 = (String) nVarC.f21469a;
            String str5 = (String) nVarC.f21470b;
            if (str5 != null) {
                BuildLogger.INSTANCE.error(str5);
                ApkGenerator.this._buildState.setValue(new BuildState.Error(str5));
                return f0.f21461a;
            }
            BuildConfiguration buildConfiguration = this.$config;
            boolean showWatermark = true;
            BuildConfiguration buildConfigurationCopy$default = BuildConfiguration.copy$default(buildConfiguration, Project.copy$default(buildConfiguration.getProject(), 0L, null, str3, str4, 0, null, 0, 0, null, null, null, null, null, null, null, null, null, false, false, false, false, false, null, null, null, null, false, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, 0L, 0L, -13, -1, 3, null), null, null, null, null, null, false, this.$config.isPremium() && BuildHost.INSTANCE.genuine(ApkGenerator.this.context), false, 382, null);
            k kVar2 = l9.a.f16766a;
            String strA = l9.a.a(buildConfigurationCopy$default.getProject());
            try {
                if (strA != null) {
                    ApkGenerator apkGenerator = ApkGenerator.this;
                    BuildLogger.INSTANCE.error(strA);
                    apkGenerator._buildState.setValue(new BuildState.Error(strA));
                    return f0.f21461a;
                }
                try {
                    BuildLogger buildLogger = BuildLogger.INSTANCE;
                    buildLogger.step(R.string.build_log_apk_build_started, new Object[0]);
                    buildLogger.detail(R.string.build_log_package_name, buildConfigurationCopy$default.getProject().getPackageName());
                    buildLogger.detail(R.string.build_log_version_pair, i.a.a(buildConfigurationCopy$default.getProject().getVersionCode()), buildConfigurationCopy$default.getProject().getVersionName());
                    Integer numA = i.a.a(buildConfigurationCopy$default.getProject().getMinSdk());
                    Integer numA2 = i.a.a(buildConfigurationCopy$default.getProject().getTargetSdk());
                    Object maxSdk = buildConfigurationCopy$default.getProject().getMaxSdk();
                    String str6 = "none";
                    if (maxSdk == null) {
                        maxSdk = "none";
                    }
                    buildLogger.detail(R.string.build_log_sdk_levels, numA, numA2, maxSdk);
                    buildLogger.detail(R.string.build_log_permissions, x.I(buildConfigurationCopy$default.getProject().getPermissions(), null, null, null, null, 63));
                    String sourcePath = buildConfigurationCopy$default.getProject().getSourcePath();
                    if (sourcePath == null) {
                        sourcePath = "none";
                    }
                    String iconPath = buildConfigurationCopy$default.getProject().getIconPath();
                    if (iconPath == null) {
                        iconPath = "none";
                    }
                    String splashPath = buildConfigurationCopy$default.getProject().getSplashPath();
                    if (splashPath != null) {
                        str6 = splashPath;
                    }
                    buildLogger.detail(R.string.build_log_editor_paths, sourcePath, iconPath, str6);
                    ApkGenerator.this._buildState.setValue(BuildState.Extracting.INSTANCE);
                    buildLogger.step(BuildLogger.BuildStage.EXTRACTING_TEMPLATE, R.string.build_log_extract_template_apk, new Object[0]);
                    BuildWorkspaces buildWorkspaces = BuildWorkspaces.INSTANCE;
                    File filesDir = ApkGenerator.this.context.getFilesDir();
                    r.d(filesDir, "getFilesDir(...)");
                    File fileCreate = buildWorkspaces.create(filesDir, "apk_");
                    try {
                        File file = new File(fileCreate, "template");
                        file.mkdirs();
                        TemplateManager.INSTANCE.extractTemplate(ApkGenerator.this.context, file);
                        BuildLogger.BuildStage buildStage = BuildLogger.BuildStage.TEMPLATE_EXTRACTED;
                        Iterator<File> it2 = l.p(file).iterator();
                        int i10 = 0;
                        while (true) {
                            qg.b bVar = (qg.b) it2;
                            if (!bVar.hasNext()) {
                                buildLogger.success(buildStage, R.string.build_log_template_extracted, i.a.a(i10));
                                ApkGenerator.this._buildState.setValue(BuildState.ModifyingManifest.INSTANCE);
                                BuildLogger buildLogger2 = BuildLogger.INSTANCE;
                                buildLogger2.step(BuildLogger.BuildStage.UPDATING_MANIFEST, R.string.build_log_update_manifest_package, new Object[0]);
                                File file2 = new File(file, "resources.arsc");
                                if (file2.exists() && !r.a("com.htmltoapk.template", buildConfigurationCopy$default.getProject().getPackageName())) {
                                    l.q(file2, ApkResourceTableEditor.INSTANCE.updatePackageName(l.j(file2), "com.htmltoapk.template", buildConfigurationCopy$default.getProject().getPackageName()));
                                    buildLogger2.detail(BuildLogger.BuildStage.PACKAGE_NAME_UPDATED, R.string.build_log_arsc_package_updated, "com.htmltoapk.template", buildConfigurationCopy$default.getProject().getPackageName());
                                }
                                if (r.a("com.htmltoapk.template", buildConfigurationCopy$default.getProject().getPackageName())) {
                                    buildLogger2.detail(R.string.build_log_package_unchanged, "com.htmltoapk.template");
                                } else {
                                    buildLogger2.step(BuildLogger.BuildStage.REPACKAGING_DEX, R.string.build_log_repackage_dex, new Object[0]);
                                    DexRepackager.INSTANCE.rewriteDexDirectory(file, "com.htmltoapk.template", buildConfigurationCopy$default.getProject().getPackageName());
                                    buildLogger2.detail(BuildLogger.BuildStage.DEX_REPACKAGED, R.string.build_log_dex_repackaged, "com.htmltoapk.template", buildConfigurationCopy$default.getProject().getPackageName());
                                }
                                File file3 = new File(file, ApkUtils.ANDROID_MANIFEST_ZIP_ENTRY_NAME);
                                if (!file3.exists()) {
                                    buildLogger2.error(R.string.build_log_manifest_missing, new Object[0]);
                                    throw new IllegalStateException("AndroidManifest.xml not found in template! Build aborted.");
                                }
                                FileInputStream fileInputStream = new FileInputStream(file2);
                                try {
                                    TemplateResourceResolver templateResourceResolver = TemplateResourceResolver.INSTANCE;
                                    Companion companion = ApkGenerator.Companion;
                                    String strResolve = templateResourceResolver.resolve(companion.createManifestXml$app_release(buildConfigurationCopy$default), fileInputStream);
                                    ah.c.a(fileInputStream, null);
                                    l.q(file3, companion.encodeManifestXml$app_release(ApkGenerator.this.context, strResolve));
                                    buildLogger2.detail(BuildLogger.BuildStage.MANIFEST_RECREATED, R.string.build_log_manifest_recreated, new Object[0]);
                                    ApkGenerator.this._buildState.setValue(BuildState.InjectingAssets.INSTANCE);
                                    buildLogger2.step(BuildLogger.BuildStage.INJECTING_ASSETS, R.string.build_log_inject_assets, new Object[0]);
                                    File file4 = new File(file, "assets/www");
                                    if (file4.exists() && file4.isFile()) {
                                        buildLogger2.detail(BuildLogger.BuildStage.ASSET_DIR_PREPARED, R.string.build_log_assetdir_is_file, new Object[0]);
                                        file4.delete();
                                    }
                                    file4.mkdirs();
                                    String iconPath2 = buildConfigurationCopy$default.getProject().getIconPath();
                                    if (iconPath2 != null) {
                                        File file5 = new File(iconPath2);
                                        fileGenerateDefaultIcon = file5.exists() ? file5 : null;
                                        if (fileGenerateDefaultIcon == null) {
                                            fileGenerateDefaultIcon = IconGenerator.INSTANCE.generateDefaultIcon(ApkGenerator.this.context, buildConfigurationCopy$default.getProject().getAppName(), buildConfigurationCopy$default.getProject().getPrimaryColor());
                                        }
                                        Project project = buildConfigurationCopy$default.getProject();
                                        String iconPath3 = buildConfigurationCopy$default.getProject().getIconPath();
                                        if (iconPath3 == null) {
                                            iconPath3 = fileGenerateDefaultIcon.getAbsolutePath();
                                        }
                                        String str7 = iconPath3;
                                        if (!buildConfigurationCopy$default.isPremium()) {
                                            z10 = showWatermark;
                                            companion.injectAssets$app_release(BuildConfiguration.copy$default(buildConfigurationCopy$default, Project.copy$default(project, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, str7, null, null, null, false, false, false, false, false, null, null, null, null, z10, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, 0L, 0L, -67117057, -1, 3, null), null, null, null, null, null, false, false, false, 510, null), file4);
                                            buildLogger2.detail(BuildLogger.BuildStage.WEB_ASSETS_INJECTED, R.string.build_log_www_prepared, new Object[0]);
                                            companion.injectIcon$app_release(file, fileGenerateDefaultIcon, buildConfigurationCopy$default.getProject().getPrimaryColor());
                                            buildLogger2.detail(BuildLogger.BuildStage.ICON_INJECTED, R.string.build_log_icon_injected_name, fileGenerateDefaultIcon.getName());
                                            ApkGenerator.this._buildState.setValue(BuildState.Repacking.INSTANCE);
                                            buildLogger2.step(BuildLogger.BuildStage.REPACKAGING_ZIP, R.string.build_log_repackage_apk, new Object[0]);
                                            parentFile = this.$outputFile.getParentFile();
                                            if (parentFile != null) {
                                                parentFile.mkdirs();
                                            }
                                            File file6 = new File(fileCreate, "unsigned.apk");
                                            parentFile2 = file6.getParentFile();
                                            if (parentFile2 != null) {
                                                parentFile2.mkdirs();
                                            }
                                            companion.zipDirectory$app_release(file, file6);
                                            buildLogger2.detail(BuildLogger.BuildStage.UNSIGNED_ARTIFACT_CREATED, R.string.build_log_unsigned_apk_created, i.a.b(file6.length()));
                                            ApkGenerator.this._buildState.setValue(BuildState.Signing.INSTANCE);
                                            buildLogger2.step(BuildLogger.BuildStage.SIGNING, R.string.build_log_signing_apk, new Object[0]);
                                            SigningKey signingKeyResolve = SigningKeyResolver.INSTANCE.resolve(ApkGenerator.this.context, buildConfigurationCopy$default);
                                            ApkSignerHelper.INSTANCE.signApk(file6, this.$outputFile, signingKeyResolve.getFile(), signingKeyResolve.getPassword(), signingKeyResolve.getAlias(), signingKeyResolve.getKeyPassword(), "PKCS12");
                                            file6.delete();
                                            buildLogger2.detail(BuildLogger.BuildStage.SIGNED, R.string.build_log_signing_completed, new Object[0]);
                                            j0 j0Var = ApkGenerator.this._buildState;
                                            String absolutePath = this.$outputFile.getAbsolutePath();
                                            r.d(absolutePath, "getAbsolutePath(...)");
                                            j0Var.setValue(new BuildState.Success(absolutePath));
                                            buildLogger2.success(BuildLogger.BuildStage.COMPLETED, R.string.build_log_apk_build_completed, this.$outputFile.getName(), i.a.b(this.$outputFile.length()));
                                            if (fileCreate != null) {
                                                BuildWorkspaces.INSTANCE.release(fileCreate);
                                            }
                                        } else if (r.a(buildConfigurationCopy$default.getProject().getBuildMode(), "advanced")) {
                                            showWatermark = buildConfigurationCopy$default.getProject().getShowWatermark();
                                            z10 = showWatermark;
                                            companion.injectAssets$app_release(BuildConfiguration.copy$default(buildConfigurationCopy$default, Project.copy$default(project, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, str7, null, null, null, false, false, false, false, false, null, null, null, null, z10, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, 0L, 0L, -67117057, -1, 3, null), null, null, null, null, null, false, false, false, 510, null), file4);
                                            buildLogger2.detail(BuildLogger.BuildStage.WEB_ASSETS_INJECTED, R.string.build_log_www_prepared, new Object[0]);
                                            companion.injectIcon$app_release(file, fileGenerateDefaultIcon, buildConfigurationCopy$default.getProject().getPrimaryColor());
                                            buildLogger2.detail(BuildLogger.BuildStage.ICON_INJECTED, R.string.build_log_icon_injected_name, fileGenerateDefaultIcon.getName());
                                            ApkGenerator.this._buildState.setValue(BuildState.Repacking.INSTANCE);
                                            buildLogger2.step(BuildLogger.BuildStage.REPACKAGING_ZIP, R.string.build_log_repackage_apk, new Object[0]);
                                            parentFile = this.$outputFile.getParentFile();
                                            if (parentFile != null) {
                                            }
                                            File file62 = new File(fileCreate, "unsigned.apk");
                                            parentFile2 = file62.getParentFile();
                                            if (parentFile2 != null) {
                                            }
                                            companion.zipDirectory$app_release(file, file62);
                                            buildLogger2.detail(BuildLogger.BuildStage.UNSIGNED_ARTIFACT_CREATED, R.string.build_log_unsigned_apk_created, i.a.b(file62.length()));
                                            ApkGenerator.this._buildState.setValue(BuildState.Signing.INSTANCE);
                                            buildLogger2.step(BuildLogger.BuildStage.SIGNING, R.string.build_log_signing_apk, new Object[0]);
                                            SigningKey signingKeyResolve2 = SigningKeyResolver.INSTANCE.resolve(ApkGenerator.this.context, buildConfigurationCopy$default);
                                            ApkSignerHelper.INSTANCE.signApk(file62, this.$outputFile, signingKeyResolve2.getFile(), signingKeyResolve2.getPassword(), signingKeyResolve2.getAlias(), signingKeyResolve2.getKeyPassword(), "PKCS12");
                                            file62.delete();
                                            buildLogger2.detail(BuildLogger.BuildStage.SIGNED, R.string.build_log_signing_completed, new Object[0]);
                                            j0 j0Var2 = ApkGenerator.this._buildState;
                                            String absolutePath2 = this.$outputFile.getAbsolutePath();
                                            r.d(absolutePath2, "getAbsolutePath(...)");
                                            j0Var2.setValue(new BuildState.Success(absolutePath2));
                                            buildLogger2.success(BuildLogger.BuildStage.COMPLETED, R.string.build_log_apk_build_completed, this.$outputFile.getName(), i.a.b(this.$outputFile.length()));
                                            if (fileCreate != null) {
                                            }
                                        } else {
                                            z10 = false;
                                            companion.injectAssets$app_release(BuildConfiguration.copy$default(buildConfigurationCopy$default, Project.copy$default(project, 0L, null, null, null, 0, null, 0, 0, null, null, null, null, null, str7, null, null, null, false, false, false, false, false, null, null, null, null, z10, false, null, false, null, null, null, false, false, false, false, null, 0, null, null, null, false, null, null, null, null, null, false, null, false, false, false, false, false, false, 0, 0, 0, 0, null, false, null, null, 0L, 0L, -67117057, -1, 3, null), null, null, null, null, null, false, false, false, 510, null), file4);
                                            buildLogger2.detail(BuildLogger.BuildStage.WEB_ASSETS_INJECTED, R.string.build_log_www_prepared, new Object[0]);
                                            companion.injectIcon$app_release(file, fileGenerateDefaultIcon, buildConfigurationCopy$default.getProject().getPrimaryColor());
                                            buildLogger2.detail(BuildLogger.BuildStage.ICON_INJECTED, R.string.build_log_icon_injected_name, fileGenerateDefaultIcon.getName());
                                            ApkGenerator.this._buildState.setValue(BuildState.Repacking.INSTANCE);
                                            buildLogger2.step(BuildLogger.BuildStage.REPACKAGING_ZIP, R.string.build_log_repackage_apk, new Object[0]);
                                            parentFile = this.$outputFile.getParentFile();
                                            if (parentFile != null) {
                                            }
                                            File file622 = new File(fileCreate, "unsigned.apk");
                                            parentFile2 = file622.getParentFile();
                                            if (parentFile2 != null) {
                                            }
                                            companion.zipDirectory$app_release(file, file622);
                                            buildLogger2.detail(BuildLogger.BuildStage.UNSIGNED_ARTIFACT_CREATED, R.string.build_log_unsigned_apk_created, i.a.b(file622.length()));
                                            ApkGenerator.this._buildState.setValue(BuildState.Signing.INSTANCE);
                                            buildLogger2.step(BuildLogger.BuildStage.SIGNING, R.string.build_log_signing_apk, new Object[0]);
                                            SigningKey signingKeyResolve22 = SigningKeyResolver.INSTANCE.resolve(ApkGenerator.this.context, buildConfigurationCopy$default);
                                            ApkSignerHelper.INSTANCE.signApk(file622, this.$outputFile, signingKeyResolve22.getFile(), signingKeyResolve22.getPassword(), signingKeyResolve22.getAlias(), signingKeyResolve22.getKeyPassword(), "PKCS12");
                                            file622.delete();
                                            buildLogger2.detail(BuildLogger.BuildStage.SIGNED, R.string.build_log_signing_completed, new Object[0]);
                                            j0 j0Var22 = ApkGenerator.this._buildState;
                                            String absolutePath22 = this.$outputFile.getAbsolutePath();
                                            r.d(absolutePath22, "getAbsolutePath(...)");
                                            j0Var22.setValue(new BuildState.Success(absolutePath22));
                                            buildLogger2.success(BuildLogger.BuildStage.COMPLETED, R.string.build_log_apk_build_completed, this.$outputFile.getName(), i.a.b(this.$outputFile.length()));
                                            if (fileCreate != null) {
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th3) {
                                        ah.c.a(fileInputStream, th2);
                                        throw th3;
                                    }
                                }
                            } else if (((File) bVar.next()).isFile() && (i10 = i10 + 1) < 0) {
                                qg.p.n();
                                throw null;
                            }
                        }
                    } catch (CancellationException e10) {
                        throw e10;
                    } catch (Exception e11) {
                        e = e11;
                        fileGenerateDefaultIcon = fileCreate;
                        String message = e.getMessage();
                        if (message == null) {
                            message = ApkGenerator.this.context.getString(R.string.build_log_unknown_error);
                            r.d(message, "getString(...)");
                        }
                        BuildLogger.INSTANCE.error(message);
                        ApkGenerator.this._buildState.setValue(new BuildState.Error(message));
                        if (fileGenerateDefaultIcon != null) {
                            BuildWorkspaces.INSTANCE.release(fileGenerateDefaultIcon);
                            f0 f0Var = f0.f21461a;
                        }
                        CacheManager.cleanOldTempFiles$default(CacheManager.INSTANCE, ApkGenerator.this.context, 0L, 0L, 6, null);
                        return f0.f21461a;
                    } catch (Throwable th4) {
                        th = th4;
                        fileGenerateDefaultIcon = fileCreate;
                        if (fileGenerateDefaultIcon != null) {
                            BuildWorkspaces.INSTANCE.release(fileGenerateDefaultIcon);
                            f0 f0Var2 = f0.f21461a;
                        }
                        CacheManager.cleanOldTempFiles$default(CacheManager.INSTANCE, ApkGenerator.this.context, 0L, 0L, 6, null);
                        throw th;
                    }
                } catch (CancellationException e12) {
                    throw e12;
                } catch (Exception e13) {
                    e = e13;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((C03612) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }
    }

    public ApkGenerator(Context context) {
        r.e(context, "context");
        this.context = context;
        sh.z0 z0VarA = a1.a(BuildState.Idle.INSTANCE);
        this._buildState = z0VarA;
        this.buildState = z0VarA;
    }

    public final void emitError(String message) {
        r.e(message, "message");
        this._buildState.setValue(new BuildState.Error(message));
    }

    public final Object generateAab(BuildConfiguration buildConfiguration, File file, tg.e<? super f0> eVar) throws Throwable {
        wh.c cVar = ph.z0.f21632a;
        Object objE = ph.h.e(wh.b.f31563c, new AnonymousClass2(buildConfiguration, file, null), eVar);
        return objE == ug.a.f29706a ? objE : f0.f21461a;
    }

    public final Object generateApk(BuildConfiguration buildConfiguration, File file, tg.e<? super f0> eVar) throws Throwable {
        wh.c cVar = ph.z0.f21632a;
        Object objE = ph.h.e(wh.b.f31563c, new C03612(buildConfiguration, file, null), eVar);
        return objE == ug.a.f29706a ? objE : f0.f21461a;
    }

    public final y0<BuildState> getBuildState() {
        return this.buildState;
    }
}
