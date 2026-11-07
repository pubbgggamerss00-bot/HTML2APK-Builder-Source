package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x.a;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class u<T extends x.a<T>> {
    public abstract int a(Map.Entry<?, ?> entry);

    public abstract GeneratedMessageLite.c b(t tVar, MessageLite messageLite, int i10);

    public abstract x<T> c(Object obj);

    public abstract x<T> d(Object obj);

    public abstract boolean e(MessageLite messageLite);

    public abstract void f(Object obj);

    public abstract Object g(Object obj, l lVar, Object obj2, t tVar, x xVar, Object obj3, w1 w1Var) throws IOException;

    public abstract void h(n1 n1Var, Object obj, t tVar, x<T> xVar) throws IOException;

    public abstract void i(j jVar, Object obj, t tVar, x<T> xVar) throws IOException;

    public abstract void j(c2 c2Var, Map.Entry<?, ?> entry) throws IOException;
}
