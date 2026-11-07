package androidx.work.impl.model;

import c7.j;
import java.util.ArrayList;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public interface SystemIdInfoDao {
    ArrayList a();

    void b(SystemIdInfo systemIdInfo);

    SystemIdInfo c(int i10, String str);

    default void d(j id2) {
        r.e(id2, "id");
        f(id2.f5007b, id2.f5006a);
    }

    default SystemIdInfo e(j id2) {
        r.e(id2, "id");
        return c(id2.f5007b, id2.f5006a);
    }

    void f(int i10, String str);

    void g(String str);
}
