package i6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface b extends Closeable {
    Cursor B(e eVar);

    void G(Object[] objArr) throws SQLException;

    void H();

    void I();

    Cursor Q(String str);

    void U();

    Cursor X(e eVar, CancellationSignal cancellationSignal);

    boolean h0();

    void i();

    boolean isOpen();

    void n(String str) throws SQLException;

    boolean n0();

    f r(String str);

    default void u() {
        i();
    }

    int w0(ContentValues contentValues, Object[] objArr);
}
