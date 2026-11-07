package com.basitce.htmltoapk.data.apkgenerator;

import ah.l;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class BuildWorkspaces {
    public static final BuildWorkspaces INSTANCE = new BuildWorkspaces();
    private static final Set<File> active = new LinkedHashSet();
    public static final int $stable = 8;

    private BuildWorkspaces() {
    }

    public final synchronized void clean(File filesDir) {
        r.e(filesDir, "filesDir");
        File[] fileArrListFiles = new File(filesDir, "build_work").listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (!active.contains(file.getCanonicalFile())) {
                    l.f(file);
                }
            }
        }
    }

    public final synchronized File create(File filesDir, String prefix) {
        File canonicalFile;
        r.e(filesDir, "filesDir");
        r.e(prefix, "prefix");
        File file = new File(filesDir, "build_work");
        file.mkdirs();
        clean(filesDir);
        canonicalFile = Files.createTempDirectory(file.toPath(), prefix, new FileAttribute[0]).toFile().getCanonicalFile();
        Set<File> set = active;
        r.b(canonicalFile);
        set.add(canonicalFile);
        return canonicalFile;
    }

    public final synchronized void release(File directory) {
        r.e(directory, "directory");
        try {
            l.f(directory);
        } finally {
            active.remove(directory.getCanonicalFile());
        }
    }
}
