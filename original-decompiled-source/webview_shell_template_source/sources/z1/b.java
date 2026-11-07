package z1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public interface b extends Closeable {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class a {
        public static void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e6) {
                Log.w("SupportSQLite", "delete failed: ", e6);
            }
        }

        public abstract void b(a2.a aVar, int i6, int i7);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: z1.b$b, reason: collision with other inner class name */
    public static class C0109b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f15424a;

        /* renamed from: b, reason: collision with root package name */
        public final String f15425b;

        /* renamed from: c, reason: collision with root package name */
        public final a f15426c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f15427d;

        public C0109b(Context context, String str, a aVar, boolean z6) {
            this.f15424a = context;
            this.f15425b = str;
            this.f15426c = aVar;
            this.f15427d = z6;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface c {
        b a(C0109b c0109b);
    }

    z1.a g();

    void setWriteAheadLoggingEnabled(boolean z6);
}
