package b6;

import android.database.Cursor;
import android.util.Log;

/* loaded from: classes.dex */
public final class b {
    public static final int a(Cursor c10, String str) {
        String strX;
        kotlin.jvm.internal.r.e(c10, "c");
        int columnIndex = c10.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = c10.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames = c10.getColumnNames();
            kotlin.jvm.internal.r.d(columnNames, "getColumnNames(...)");
            strX = qg.o.x(63, columnNames);
        } catch (Exception e10) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e10);
            strX = "unknown";
        }
        throw new IllegalArgumentException(a.b("column '", str, "' does not exist. Available columns: ", strX));
    }
}
