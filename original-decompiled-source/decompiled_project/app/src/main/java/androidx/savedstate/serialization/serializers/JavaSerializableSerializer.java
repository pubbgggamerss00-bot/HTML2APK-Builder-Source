package androidx.savedstate.serialization.serializers;

import android.os.Build;
import android.os.Bundle;
import b3.e;
import b3.l;
import b6.c;
import bi.f;
import bi.k;
import ci.d;
import java.io.Serializable;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.r;
import u3.c;
import zh.b;

/* loaded from: classes.dex */
public abstract class JavaSerializableSerializer<T extends Serializable> implements b<T> {
    private final f descriptor = k.c("java.io.Serializable", new f[0]);

    @Override // zh.i, zh.a
    public final f getDescriptor() {
        return this.descriptor;
    }

    @Override // zh.a
    public final T deserialize(d decoder) {
        T t3;
        r.e(decoder, "decoder");
        if (!(decoder instanceof f6.d)) {
            throw new IllegalArgumentException(c.a(this.descriptor.a(), decoder).toString());
        }
        f6.d dVar = (f6.d) decoder;
        Bundle bundle = dVar.f8865a;
        String key = dVar.f8866b;
        h hVarA = h0.a(Serializable.class);
        r.e(key, "key");
        Class clsC = e.c(hVarA);
        if (Build.VERSION.SDK_INT >= 34) {
            t3 = (T) c.a.d(bundle, key, clsC);
        } else {
            t3 = (T) bundle.getSerializable(key);
            if (!clsC.isInstance(t3)) {
                t3 = null;
            }
        }
        if (t3 != null) {
            return t3;
        }
        l.c(key);
        throw null;
    }

    @Override // zh.i
    public final void serialize(ci.e encoder, T value) {
        r.e(encoder, "encoder");
        r.e(value, "value");
        if (!(encoder instanceof f6.e)) {
            throw new IllegalArgumentException(b6.c.c(encoder, this.descriptor.a()).toString());
        }
        throw null;
    }
}
