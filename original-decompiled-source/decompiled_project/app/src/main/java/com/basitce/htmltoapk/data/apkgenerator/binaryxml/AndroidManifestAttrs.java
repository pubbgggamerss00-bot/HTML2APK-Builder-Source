package com.basitce.htmltoapk.data.apkgenerator.binaryxml;

import android.R;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import pg.n;
import qg.k0;
import qg.o;

/* loaded from: classes.dex */
public final class AndroidManifestAttrs {
    public static final String NAMESPACE = "http://schemas.android.com/apk/res/android";
    public static final AndroidManifestAttrs INSTANCE = new AndroidManifestAttrs();
    private static final Map<String, Integer> ids = k0.d(new n("allowBackup", Integer.valueOf(R.attr.allowBackup)), new n("appComponentFactory", Integer.valueOf(R.attr.appComponentFactory)), new n("authorities", Integer.valueOf(R.attr.authorities)), new n("compileSdkVersion", Integer.valueOf(R.attr.compileSdkVersion)), new n("compileSdkVersionCodename", Integer.valueOf(R.attr.compileSdkVersionCodename)), new n("configChanges", Integer.valueOf(R.attr.configChanges)), new n("directBootAware", Integer.valueOf(R.attr.directBootAware)), new n("enableOnBackInvokedCallback", Integer.valueOf(R.attr.enableOnBackInvokedCallback)), new n("enabled", Integer.valueOf(R.attr.enabled)), new n("excludeFromRecents", Integer.valueOf(R.attr.excludeFromRecents)), new n("exported", Integer.valueOf(R.attr.exported)), new n("extractNativeLibs", Integer.valueOf(R.attr.extractNativeLibs)), new n("grantUriPermissions", Integer.valueOf(R.attr.grantUriPermissions)), new n("host", Integer.valueOf(R.attr.host)), new n("icon", Integer.valueOf(R.attr.icon)), new n("initOrder", Integer.valueOf(R.attr.initOrder)), new n(AnnotatedPrivateKey.LABEL, Integer.valueOf(R.attr.label)), new n("launchMode", Integer.valueOf(R.attr.launchMode)), new n("maxSdkVersion", Integer.valueOf(R.attr.maxSdkVersion)), new n("mimeType", Integer.valueOf(R.attr.mimeType)), new n("minSdkVersion", Integer.valueOf(R.attr.minSdkVersion)), new n("name", Integer.valueOf(R.attr.name)), new n("networkSecurityConfig", Integer.valueOf(R.attr.networkSecurityConfig)), new n("path", Integer.valueOf(R.attr.path)), new n("pathPattern", Integer.valueOf(R.attr.pathPattern)), new n("pathPrefix", Integer.valueOf(R.attr.pathPrefix)), new n("permission", Integer.valueOf(R.attr.permission)), new n("port", Integer.valueOf(R.attr.port)), new n("protectionLevel", Integer.valueOf(R.attr.protectionLevel)), new n("required", Integer.valueOf(R.attr.required)), new n("resource", Integer.valueOf(R.attr.resource)), new n("roundIcon", Integer.valueOf(R.attr.roundIcon)), new n("scheme", Integer.valueOf(R.attr.scheme)), new n("screenOrientation", Integer.valueOf(R.attr.screenOrientation)), new n("targetSdkVersion", Integer.valueOf(R.attr.targetSdkVersion)), new n("taskAffinity", Integer.valueOf(R.attr.taskAffinity)), new n("theme", Integer.valueOf(R.attr.theme)), new n("usesCleartextTraffic", Integer.valueOf(R.attr.usesCleartextTraffic)), new n("value", Integer.valueOf(R.attr.value)), new n("versionCode", Integer.valueOf(R.attr.versionCode)), new n("versionName", Integer.valueOf(R.attr.versionName)), new n("windowSoftInputMode", Integer.valueOf(R.attr.windowSoftInputMode)));
    private static final Set<String> stringAttrs = o.C(new String[]{"appComponentFactory", "authorities", "compileSdkVersionCodename", "host", AnnotatedPrivateKey.LABEL, "mimeType", "name", "path", "pathPattern", "pathPrefix", "permission", "port", "scheme", "taskAffinity", "value", "versionName"});
    public static final int $stable = 8;

    private AndroidManifestAttrs() {
    }

    public final Map<String, Integer> getIds() {
        return ids;
    }

    public final Set<String> getStringAttrs() {
        return stringAttrs;
    }
}
