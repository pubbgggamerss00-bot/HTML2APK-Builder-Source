package u6;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g0 {
    public static final void a(Context context) {
        kotlin.jvm.internal.r.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        kotlin.jvm.internal.r.d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            t6.s.d().a(h0.f29298a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            kotlin.jvm.internal.r.d(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            kotlin.jvm.internal.r.d(noBackupFilesDir, "context.noBackupFilesDir");
            File file = new File(noBackupFilesDir, "androidx.work.workdb");
            String[] strArr = h0.f29299b;
            int iA = qg.j0.a(strArr.length);
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            for (Map.Entry entry : qg.k0.g(linkedHashMap, new pg.n(databasePath2, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        t6.s.d().g(h0.f29298a, "Over-writing contents of " + file3);
                    }
                    t6.s.d().a(h0.f29298a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }
}
