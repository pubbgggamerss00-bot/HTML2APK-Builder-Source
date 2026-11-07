package androidx.work.impl.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public interface WorkTagDao {
    void a(WorkTag workTag);

    ArrayList b(String str);

    default void c(String str, Set<String> tags) {
        r.e(tags, "tags");
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            a(new WorkTag((String) it.next(), str));
        }
    }
}
