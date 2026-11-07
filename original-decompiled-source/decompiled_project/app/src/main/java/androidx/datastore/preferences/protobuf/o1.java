package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.d;
import java.io.IOException;

/* loaded from: classes.dex */
public interface o1<T> {
    int a(AbstractMessageLite abstractMessageLite);

    int b(GeneratedMessageLite generatedMessageLite);

    void c(T t3, c2 c2Var) throws IOException;

    boolean d(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2);

    void e(Object obj, l lVar, t tVar) throws IOException;

    void f(T t3, byte[] bArr, int i10, int i11, d.a aVar) throws IOException;

    boolean isInitialized(T t3);

    void makeImmutable(T t3);

    void mergeFrom(T t3, T t10);

    T newInstance();
}
