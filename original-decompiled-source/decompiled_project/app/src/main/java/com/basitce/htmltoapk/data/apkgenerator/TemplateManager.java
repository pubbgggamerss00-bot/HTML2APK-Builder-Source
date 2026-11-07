package com.basitce.htmltoapk.data.apkgenerator;

import ah.l;
import android.content.Context;
import com.basitce.htmltoapk.R;
import com.basitce.htmltoapk.data.apkgenerator.BuildLogger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.r;
import mh.x;
import pg.f0;

/* loaded from: classes.dex */
public final class TemplateManager {
    public static final int $stable = 0;
    public static final TemplateManager INSTANCE = new TemplateManager();
    private static final String TEMPLATE_ASSET_NAME = "webview_shell_template.apk";

    private TemplateManager() {
    }

    public final void extractTemplate(Context context, File outputDir) throws IOException {
        r.e(context, "context");
        r.e(outputDir, "outputDir");
        outputDir.mkdirs();
        File[] fileArrListFiles = outputDir.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                r.b(file);
                l.f(file);
            }
        }
        InputStream inputStreamOpen = context.getAssets().open(TEMPLATE_ASSET_NAME);
        try {
            ZipInputStream zipInputStream = new ZipInputStream(inputStreamOpen);
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                int i10 = 0;
                while (nextEntry != null) {
                    String name = nextEntry.getName();
                    r.d(name, "getName(...)");
                    if (x.A(name) || r.a(nextEntry.getName(), "/")) {
                        BuildLogger.INSTANCE.detail(R.string.build_log_tpl_skip_root, nextEntry.getName());
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String name2 = nextEntry.getName();
                        r.d(name2, "getName(...)");
                        if (x.r(name2, "..", false)) {
                            BuildLogger.INSTANCE.detail(R.string.build_log_tpl_skip_security, nextEntry.getName());
                            zipInputStream.closeEntry();
                            nextEntry = zipInputStream.getNextEntry();
                        } else {
                            File canonicalFile = new File(outputDir, nextEntry.getName()).getCanonicalFile();
                            File canonicalFile2 = outputDir.getCanonicalFile();
                            if (!r.a(canonicalFile, canonicalFile2)) {
                                r.b(canonicalFile);
                                r.b(canonicalFile2);
                                if (l.m(canonicalFile, canonicalFile2)) {
                                    if (nextEntry.isDirectory()) {
                                        canonicalFile.mkdirs();
                                    } else {
                                        File parentFile = canonicalFile.getParentFile();
                                        if (parentFile != null) {
                                            parentFile.mkdirs();
                                        }
                                        FileOutputStream fileOutputStream = new FileOutputStream(canonicalFile);
                                        try {
                                            ah.b.a(zipInputStream, fileOutputStream, 8192);
                                            fileOutputStream.close();
                                            i10++;
                                            if (i10 % 15 == 0) {
                                                BuildLogger buildLogger = BuildLogger.INSTANCE;
                                                buildLogger.tick(BuildLogger.BuildTick.TEMPLATE_FILE);
                                                buildLogger.detail(R.string.build_log_tpl_extract_tick, Integer.valueOf(i10));
                                            }
                                        } finally {
                                        }
                                    }
                                    zipInputStream.closeEntry();
                                    nextEntry = zipInputStream.getNextEntry();
                                }
                            }
                            BuildLogger.INSTANCE.detail(R.string.build_log_tpl_skip_outside, nextEntry.getName());
                            zipInputStream.closeEntry();
                            nextEntry = zipInputStream.getNextEntry();
                        }
                    }
                }
                BuildLogger.INSTANCE.detail(R.string.build_log_tpl_extract_total, Integer.valueOf(i10));
                f0 f0Var = f0.f21461a;
                zipInputStream.close();
                ah.c.a(inputStreamOpen, null);
            } finally {
            }
        } finally {
        }
    }

    public final boolean isTemplateAvailable(Context context) throws IOException {
        r.e(context, "context");
        try {
            context.getAssets().open(TEMPLATE_ASSET_NAME).close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
