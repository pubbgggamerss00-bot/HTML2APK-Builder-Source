package androidx.profileinstaller;

import java.io.File;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {
    public static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z6 = true;
        for (File file2 : fileArrListFiles) {
            z6 = a(file2) && z6;
        }
        return z6;
    }
}
