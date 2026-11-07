package androidx.room;

import android.content.Context;
import androidx.room.g0;

/* loaded from: classes.dex */
public final class x {
    public static final <T extends g0> g0.a<T> a(Context context, Class<T> cls, String str) {
        kotlin.jvm.internal.r.e(context, "context");
        if (mh.x.A(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        if (str.equals(":memory:")) {
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new g0.a<>(context, cls, str);
    }
}
