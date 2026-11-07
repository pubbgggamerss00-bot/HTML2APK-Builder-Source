package i6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public interface c extends Closeable {

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14169a;

        public a(int i10) {
            this.f14169a = i10;
        }

        public static void a(String str) {
            if (str.equalsIgnoreCase(":memory:")) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = r.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void b(j6.f fVar) {
        }

        public abstract void c(j6.f fVar);

        public abstract void d(j6.f fVar, int i10, int i11);

        public abstract void e(j6.f fVar);

        public abstract void f(j6.f fVar, int i10, int i11);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f14170a;

        /* renamed from: b, reason: collision with root package name */
        public final String f14171b;

        /* renamed from: c, reason: collision with root package name */
        public final a f14172c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f14173d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f14174e;

        public b(Context context, String str, a callback, boolean z10, boolean z11) {
            r.e(context, "context");
            r.e(callback, "callback");
            this.f14170a = context;
            this.f14171b = str;
            this.f14172c = callback;
            this.f14173d = z10;
            this.f14174e = z11;
        }
    }

    /* renamed from: i6.c$c, reason: collision with other inner class name */
    public interface InterfaceC0132c {
        c a(b bVar);
    }

    i6.b P();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
