package com.basitce.htmltoapk.data.apkgenerator;

import ah.l;
import android.content.Context;
import i0.x1;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.r;
import lh.e;
import mh.t;
import qg.p;
import qg.x;

/* loaded from: classes.dex */
public final class CacheManager {
    public static final int $stable = 0;
    private static final long DEFAULT_MAX_CACHE_SIZE_BYTES = 209715200;
    public static final CacheManager INSTANCE = new CacheManager();

    private CacheManager() {
    }

    public static /* synthetic */ void cleanAllBuildCaches$default(CacheManager cacheManager, Context context, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 60000;
        }
        cacheManager.cleanAllBuildCaches(context, j10);
    }

    public static /* synthetic */ void cleanOldTempFiles$default(CacheManager cacheManager, Context context, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 60000;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = DEFAULT_MAX_CACHE_SIZE_BYTES;
        }
        cacheManager.cleanOldTempFiles(context, j12, j11);
    }

    private final void enforceCacheLimit(Context context, List<String> list, long j10) {
        File[] fileArrListFiles;
        BuildWorkspaces buildWorkspaces = BuildWorkspaces.INSTANCE;
        File filesDir = context.getFilesDir();
        r.d(filesDir, "getFilesDir(...)");
        buildWorkspaces.clean(filesDir);
        File cacheDir = context.getCacheDir();
        if (cacheDir == null || (fileArrListFiles = cacheDir.listFiles()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str = (String) it.next();
                        String name = file.getName();
                        r.d(name, "getName(...)");
                        if (t.p(name, str, false)) {
                            arrayList.add(file);
                            break;
                        }
                    }
                }
            }
        }
        List<File> listU = x.U(new Comparator() { // from class: com.basitce.htmltoapk.data.apkgenerator.CacheManager$enforceCacheLimit$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                return x1.b(Long.valueOf(((File) t3).lastModified()), Long.valueOf(((File) t10).lastModified()));
            }
        }, arrayList);
        Iterator it2 = listU.iterator();
        long length = 0;
        while (it2.hasNext()) {
            length += ((File) it2.next()).length();
        }
        if (length <= j10) {
            return;
        }
        for (File file2 : listU) {
            if (length <= j10) {
                return;
            }
            long length2 = file2.length();
            if (l.f(file2)) {
                length -= length2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getCacheSize$lambda$12$lambda$10(File it) {
        r.e(it, "it");
        return it.isFile();
    }

    public final void cleanAllBuildCaches(Context context, long j10) {
        r.e(context, "context");
        BuildWorkspaces buildWorkspaces = BuildWorkspaces.INSTANCE;
        File filesDir = context.getFilesDir();
        r.d(filesDir, "getFilesDir(...)");
        buildWorkspaces.clean(filesDir);
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return;
        }
        List listJ = p.j("apk_build_", "aab_build_");
        File[] fileArrListFiles = cacheDir.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (!listJ.isEmpty()) {
                    Iterator it = listJ.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str = (String) it.next();
                            String name = file.getName();
                            r.d(name, "getName(...)");
                            if (t.p(name, str, false)) {
                                if (System.currentTimeMillis() - file.lastModified() > j10) {
                                    if (file.isDirectory()) {
                                        l.f(file);
                                    } else {
                                        file.delete();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void cleanOldTempFiles(Context context, long j10, long j11) {
        r.e(context, "context");
        BuildWorkspaces buildWorkspaces = BuildWorkspaces.INSTANCE;
        File filesDir = context.getFilesDir();
        r.d(filesDir, "getFilesDir(...)");
        buildWorkspaces.clean(filesDir);
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return;
        }
        List<String> listJ = p.j("apk_build_", "aab_build_");
        File[] fileArrListFiles = cacheDir.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (!listJ.isEmpty()) {
                    Iterator<T> it = listJ.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str = (String) it.next();
                            String name = file.getName();
                            r.d(name, "getName(...)");
                            if (t.p(name, str, false)) {
                                if (System.currentTimeMillis() - file.lastModified() > j10) {
                                    if (file.isDirectory()) {
                                        l.f(file);
                                    } else {
                                        file.delete();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        enforceCacheLimit(context, listJ, j11);
    }

    public final void clearAppCache(Context context) {
        File[] fileArrListFiles;
        r.e(context, "context");
        BuildWorkspaces buildWorkspaces = BuildWorkspaces.INSTANCE;
        File filesDir = context.getFilesDir();
        r.d(filesDir, "getFilesDir(...)");
        buildWorkspaces.clean(filesDir);
        File cacheDir = context.getCacheDir();
        if (cacheDir == null || (fileArrListFiles = cacheDir.listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (!r.a(file.getName(), "apk_output") && System.currentTimeMillis() - file.lastModified() > 30000) {
                if (file.isDirectory()) {
                    l.f(file);
                } else {
                    file.delete();
                }
            }
        }
    }

    public final long getCacheSize(Context context) {
        r.e(context, "context");
        BuildWorkspaces buildWorkspaces = BuildWorkspaces.INSTANCE;
        File filesDir = context.getFilesDir();
        r.d(filesDir, "getFilesDir(...)");
        buildWorkspaces.clean(filesDir);
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return 0L;
        }
        File[] fileArrListFiles = cacheDir.listFiles();
        int i10 = 0;
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            if (!r.a(file.getName(), "apk_output")) {
                arrayList.add(file);
            }
        }
        int size = arrayList.size();
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            File file2 = (File) obj;
            r.b(file2);
            e.a aVar = new e.a(lh.j.i(l.p(file2), new d()));
            long length = 0;
            while (aVar.hasNext()) {
                length += ((File) aVar.next()).length();
            }
            j10 += length;
        }
        return j10;
    }
}
