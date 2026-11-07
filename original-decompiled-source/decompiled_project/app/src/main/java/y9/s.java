package y9;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
import p.g0;

/* loaded from: classes.dex */
public final class s extends SQLiteOpenHelper {

    /* renamed from: c, reason: collision with root package name */
    public static final String f34348c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: d, reason: collision with root package name */
    public static final int f34349d = 5;

    /* renamed from: e, reason: collision with root package name */
    public static final List<a> f34350e = Arrays.asList(new n(), new o(), new p(), new q(), new r());

    /* renamed from: a, reason: collision with root package name */
    public final int f34351a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f34352b;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    public s(Context context, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f34352b = false;
        this.f34351a = i10;
    }

    public static void h(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<a> list = f34350e;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                list.get(i10).a(sQLiteDatabase);
                i10++;
            }
        } else {
            StringBuilder sbA = g0.a(i10, i11, "Migration from ", " to ", " was requested, but cannot be performed. Only ");
            sbA.append(list.size());
            sbA.append(" migrations are provided");
            throw new IllegalArgumentException(sbA.toString());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f34352b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f34352b) {
            onConfigure(sQLiteDatabase);
        }
        h(sQLiteDatabase, 0, this.f34351a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f34352b) {
            onConfigure(sQLiteDatabase);
        }
        h(sQLiteDatabase, 0, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f34352b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (!this.f34352b) {
            onConfigure(sQLiteDatabase);
        }
        h(sQLiteDatabase, i10, i11);
    }
}
