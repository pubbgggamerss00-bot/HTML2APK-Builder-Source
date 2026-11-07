package bi;

import java.lang.annotation.Annotation;
import java.util.List;
import qg.z;

/* loaded from: classes2.dex */
public interface f {
    String a();

    default boolean c() {
        return false;
    }

    int d(String str);

    int e();

    String f(int i10);

    List<Annotation> g(int i10);

    default List<Annotation> getAnnotations() {
        return z.f22752a;
    }

    l getKind();

    f h(int i10);

    boolean i(int i10);

    default boolean isInline() {
        return false;
    }
}
