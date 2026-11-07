package com.basitce.htmltoapk.data.apkgenerator;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import com.yalantis.ucrop.view.CropImageView;
import i0.u2;
import j2.y;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.r;
import qg.x;
import qg.z;
import sh.a1;
import sh.j0;
import sh.y0;
import sh.z0;

/* loaded from: classes.dex */
public final class BuildLogger {
    public static final int $stable;
    public static final BuildLogger INSTANCE = new BuildLogger();
    private static final String LOG_TAG = "HtmlToApkBuild";
    private static final int MAX_LOGS = 300;
    private static final j0<List<String>> _logs;
    private static final j0<List<String>> _logsEn;
    private static final j0<Integer> _progress;
    private static float currentProgressFloat;
    private static final y0<List<String>> logs;
    private static final y0<List<String>> logsEn;
    private static final y0<Integer> progress;
    private static Context strings;
    private static Context stringsEn;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BuildStage {
        private static final /* synthetic */ wg.a $ENTRIES;
        private static final /* synthetic */ BuildStage[] $VALUES;
        private final int percent;
        public static final BuildStage EXTRACTING_TEMPLATE = new BuildStage("EXTRACTING_TEMPLATE", 0, 5);
        public static final BuildStage TEMPLATE_EXTRACTED = new BuildStage("TEMPLATE_EXTRACTED", 1, 20);
        public static final BuildStage UPDATING_MANIFEST = new BuildStage("UPDATING_MANIFEST", 2, 24);
        public static final BuildStage PACKAGE_NAME_UPDATED = new BuildStage("PACKAGE_NAME_UPDATED", 3, 28);
        public static final BuildStage REPACKAGING_DEX = new BuildStage("REPACKAGING_DEX", 4, 54);
        public static final BuildStage DEX_REPACKAGED = new BuildStage("DEX_REPACKAGED", 5, 56);
        public static final BuildStage MANIFEST_ENCODING_UNICODE = new BuildStage("MANIFEST_ENCODING_UNICODE", 6, 58);
        public static final BuildStage MANIFEST_ENCODED = new BuildStage("MANIFEST_ENCODED", 7, 60);
        public static final BuildStage MANIFEST_DECODED = new BuildStage("MANIFEST_DECODED", 8, 61);
        public static final BuildStage MANIFEST_RECREATED = new BuildStage("MANIFEST_RECREATED", 9, 62);
        public static final BuildStage ASSET_DIR_PREPARED = new BuildStage("ASSET_DIR_PREPARED", 10, 66);
        public static final BuildStage INJECTING_ASSETS = new BuildStage("INJECTING_ASSETS", 11, 68);
        public static final BuildStage WEB_ASSETS_INJECTED = new BuildStage("WEB_ASSETS_INJECTED", 12, 74);
        public static final BuildStage ICON_INJECTED = new BuildStage("ICON_INJECTED", 13, 80);
        public static final BuildStage ICON_FILES_INJECTED = new BuildStage("ICON_FILES_INJECTED", 14, 82);
        public static final BuildStage REPACKAGING_ZIP = new BuildStage("REPACKAGING_ZIP", 15, 84);
        public static final BuildStage ZIP_ORDER_KNOWN = new BuildStage("ZIP_ORDER_KNOWN", 16, 85);
        public static final BuildStage UNSIGNED_ARTIFACT_CREATED = new BuildStage("UNSIGNED_ARTIFACT_CREATED", 17, 89);
        public static final BuildStage SIGNING = new BuildStage("SIGNING", 18, 92);
        public static final BuildStage SIGNED = new BuildStage("SIGNED", 19, 97);
        public static final BuildStage COMPLETED = new BuildStage("COMPLETED", 20, 100);

        private static final /* synthetic */ BuildStage[] $values() {
            return new BuildStage[]{EXTRACTING_TEMPLATE, TEMPLATE_EXTRACTED, UPDATING_MANIFEST, PACKAGE_NAME_UPDATED, REPACKAGING_DEX, DEX_REPACKAGED, MANIFEST_ENCODING_UNICODE, MANIFEST_ENCODED, MANIFEST_DECODED, MANIFEST_RECREATED, ASSET_DIR_PREPARED, INJECTING_ASSETS, WEB_ASSETS_INJECTED, ICON_INJECTED, ICON_FILES_INJECTED, REPACKAGING_ZIP, ZIP_ORDER_KNOWN, UNSIGNED_ARTIFACT_CREATED, SIGNING, SIGNED, COMPLETED};
        }

        static {
            BuildStage[] buildStageArr$values = $values();
            $VALUES = buildStageArr$values;
            $ENTRIES = u2.e(buildStageArr$values);
        }

        private BuildStage(String str, int i10, int i11) {
            this.percent = i11;
        }

        public static wg.a<BuildStage> getEntries() {
            return $ENTRIES;
        }

        public static BuildStage valueOf(String str) {
            return (BuildStage) Enum.valueOf(BuildStage.class, str);
        }

        public static BuildStage[] values() {
            return (BuildStage[]) $VALUES.clone();
        }

        public final int getPercent() {
            return this.percent;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BuildTick {
        private static final /* synthetic */ wg.a $ENTRIES;
        private static final /* synthetic */ BuildTick[] $VALUES;
        private final int cap;
        private final float delta;
        public static final BuildTick TEMPLATE_FILE = new BuildTick("TEMPLATE_FILE", 0, 1.2f, 20);
        public static final BuildTick DEX_FILE = new BuildTick("DEX_FILE", 1, 6.0f, 56);
        public static final BuildTick DEX_WRITTEN = new BuildTick("DEX_WRITTEN", 2, 4.0f, 56);
        public static final BuildTick ZIP_FILE = new BuildTick("ZIP_FILE", 3, 1.5f, 88);
        public static final BuildTick ZIP_SKIPPED_ENTRY = new BuildTick("ZIP_SKIPPED_ENTRY", 4, 0.4f, 88);

        private static final /* synthetic */ BuildTick[] $values() {
            return new BuildTick[]{TEMPLATE_FILE, DEX_FILE, DEX_WRITTEN, ZIP_FILE, ZIP_SKIPPED_ENTRY};
        }

        static {
            BuildTick[] buildTickArr$values = $values();
            $VALUES = buildTickArr$values;
            $ENTRIES = u2.e(buildTickArr$values);
        }

        private BuildTick(String str, int i10, float f10, int i11) {
            this.delta = f10;
            this.cap = i11;
        }

        public static wg.a<BuildTick> getEntries() {
            return $ENTRIES;
        }

        public static BuildTick valueOf(String str) {
            return (BuildTick) Enum.valueOf(BuildTick.class, str);
        }

        public static BuildTick[] values() {
            return (BuildTick[]) $VALUES.clone();
        }

        public final int getCap() {
            return this.cap;
        }

        public final float getDelta() {
            return this.delta;
        }
    }

    static {
        z zVar = z.f22752a;
        z0 z0VarA = a1.a(zVar);
        _logs = z0VarA;
        logs = gg.a.a(z0VarA);
        z0 z0VarA2 = a1.a(zVar);
        _logsEn = z0VarA2;
        logsEn = gg.a.a(z0VarA2);
        z0 z0VarA3 = a1.a(0);
        _progress = z0VarA3;
        progress = gg.a.a(z0VarA3);
        $stable = 8;
    }

    private BuildLogger() {
    }

    public static /* synthetic */ void addProgress$default(BuildLogger buildLogger, float f10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 100;
        }
        buildLogger.addProgress(f10, i10);
    }

    public static /* synthetic */ void log$default(BuildLogger buildLogger, String str, int i10, Object[] objArr, boolean z10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        buildLogger.log(str, i10, objArr, z10);
    }

    private final String resolve(Context context, int i10, Object[] objArr) {
        if (context == null) {
            return y.a(i10, "log#");
        }
        try {
            return objArr.length == 0 ? context.getString(i10) : context.getString(i10, Arrays.copyOf(objArr, objArr.length));
        } catch (Exception unused) {
            return y.a(i10, "log#");
        }
    }

    private final String time() {
        String str = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
        r.d(str, "format(...)");
        return str;
    }

    public final void addProgress(float f10, int i10) {
        float f11 = currentProgressFloat + f10;
        float f12 = i10;
        if (f11 > f12) {
            f11 = f12;
        }
        currentProgressFloat = f11;
        int iM = jh.j.m((int) f11, 0, 100);
        j0<Integer> j0Var = _progress;
        if (iM > j0Var.getValue().intValue()) {
            j0Var.setValue(Integer.valueOf(iM));
        }
    }

    public final void attach(Context context) {
        r.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        strings = applicationContext;
        Configuration configuration = new Configuration(applicationContext.getResources().getConfiguration());
        configuration.setLocale(Locale.ENGLISH);
        stringsEn = applicationContext.createConfigurationContext(configuration);
    }

    public final void detail(String message) {
        r.e(message, "message");
        log("   • ".concat(message));
    }

    public final void error(String message) {
        r.e(message, "message");
        try {
            Log.e(LOG_TAG, message);
        } catch (Exception unused) {
        }
        log("✗ [ERROR] ".concat(message));
    }

    public final y0<List<String>> getLogs() {
        return logs;
    }

    public final y0<List<String>> getLogsEn() {
        return logsEn;
    }

    public final y0<Integer> getProgress() {
        return progress;
    }

    public final String localized(int i10, Object... args) {
        r.e(args, "args");
        return resolve(strings, i10, args);
    }

    public final String localizedEn(int i10, Object... args) {
        r.e(args, "args");
        return resolve(stringsEn, i10, args);
    }

    public final void log(String message) {
        r.e(message, "message");
        log(message, message);
    }

    public final void reset() {
        j0<List<String>> j0Var = _logs;
        z zVar = z.f22752a;
        j0Var.setValue(zVar);
        _logsEn.setValue(zVar);
        currentProgressFloat = CropImageView.DEFAULT_ASPECT_RATIO;
        _progress.setValue(0);
    }

    public final void restore(List<String> local, List<String> english) {
        r.e(local, "local");
        r.e(english, "english");
        _logs.setValue(x.X(MAX_LOGS, local));
        _logsEn.setValue(x.X(MAX_LOGS, english));
    }

    public final void setProgress(int i10) {
        int iM = jh.j.m(i10, 0, 100);
        j0<Integer> j0Var = _progress;
        if (iM > j0Var.getValue().intValue()) {
            currentProgressFloat = iM;
            j0Var.setValue(Integer.valueOf(iM));
        }
    }

    public final void step(String message) {
        r.e(message, "message");
        log("→ ".concat(message));
    }

    public final void success(String message) {
        r.e(message, "message");
        log("✓ [SUCCESS] ".concat(message));
    }

    public final void tick(BuildTick tick) {
        r.e(tick, "tick");
        addProgress(tick.getDelta(), tick.getCap());
    }

    private final void log(String str, String str2) {
        List<String> value;
        List<String> listX;
        List<String> value2;
        List<String> listX2;
        try {
            Log.d(LOG_TAG, str2);
        } catch (Exception unused) {
        }
        String strTime = time();
        j0<List<String>> j0Var = _logs;
        do {
            value = j0Var.getValue();
            ArrayList arrayListP = x.P(strTime + " " + str, value);
            int size = arrayListP.size();
            listX = arrayListP;
            if (size > MAX_LOGS) {
                listX = x.X(MAX_LOGS, arrayListP);
            }
        } while (!j0Var.a(value, listX));
        j0<List<String>> j0Var2 = _logsEn;
        do {
            value2 = j0Var2.getValue();
            ArrayList arrayListP2 = x.P(strTime + " " + str2, value2);
            int size2 = arrayListP2.size();
            listX2 = arrayListP2;
            if (size2 > MAX_LOGS) {
                listX2 = x.X(MAX_LOGS, arrayListP2);
            }
        } while (!j0Var2.a(value2, listX2));
    }

    public final void detail(int i10, Object... args) {
        r.e(args, "args");
        log$default(this, "   • ", i10, args, false, 8, null);
    }

    public final void step(int i10, Object... args) {
        r.e(args, "args");
        log$default(this, "→ ", i10, args, false, 8, null);
    }

    public final void success(int i10, Object... args) {
        r.e(args, "args");
        log$default(this, "✓ [SUCCESS] ", i10, args, false, 8, null);
    }

    public final void detail(BuildStage stage, int i10, Object... args) {
        r.e(stage, "stage");
        r.e(args, "args");
        setProgress(stage.getPercent());
        log$default(this, "   • ", i10, args, false, 8, null);
    }

    public final void error(int i10, Object... args) {
        r.e(args, "args");
        log("✗ [ERROR] ", i10, args, true);
    }

    public final void step(BuildStage stage, int i10, Object... args) {
        r.e(stage, "stage");
        r.e(args, "args");
        setProgress(stage.getPercent());
        log$default(this, "→ ", i10, args, false, 8, null);
    }

    public final void success(BuildStage stage, int i10, Object... args) {
        r.e(stage, "stage");
        r.e(args, "args");
        setProgress(stage.getPercent());
        log$default(this, "✓ [SUCCESS] ", i10, args, false, 8, null);
    }

    private final void log(String str, int i10, Object[] objArr, boolean z10) {
        if (z10) {
            try {
                Log.e(LOG_TAG, resolve(stringsEn, i10, objArr));
            } catch (Exception unused) {
            }
        }
        log(k3.a.a(str, resolve(strings, i10, objArr)), k3.a.a(str, resolve(stringsEn, i10, objArr)));
    }
}
