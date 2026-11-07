package kh;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface b<R> extends a {
    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    String getName();

    List<Object> getParameters();

    j getReturnType();

    List<Object> getTypeParameters();

    l getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
