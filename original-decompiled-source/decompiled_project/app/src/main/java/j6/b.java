package j6;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import eh.r;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i6.e f15169a;

    public /* synthetic */ b(i6.e eVar) {
        this.f15169a = eVar;
    }

    @Override // eh.r
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        kotlin.jvm.internal.r.b(sQLiteQuery);
        this.f15169a.h(new j(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
