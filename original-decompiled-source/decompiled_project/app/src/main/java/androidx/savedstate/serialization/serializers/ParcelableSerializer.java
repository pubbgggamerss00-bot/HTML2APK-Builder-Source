package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
import android.os.Parcelable;
import b3.e;
import b3.l;
import b6.c;
import bi.f;
import bi.k;
import ci.d;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.r;
import zh.b;

/* loaded from: classes.dex */
public abstract class ParcelableSerializer<T extends Parcelable> implements b<T> {
    private final f descriptor = k.c("android.os.Parcelable", new f[0]);

    @Override // zh.i, zh.a
    public final f getDescriptor() {
        return this.descriptor;
    }

    @Override // zh.a
    public final T deserialize(d decoder) {
        r.e(decoder, "decoder");
        if (!(decoder instanceof f6.d)) {
            throw new IllegalArgumentException(c.a(this.descriptor.a(), decoder).toString());
        }
        f6.d dVar = (f6.d) decoder;
        Bundle bundle = dVar.f8865a;
        String key = dVar.f8866b;
        h hVarA = h0.a(Parcelable.class);
        r.e(key, "key");
        T t3 = (T) u3.c.a(bundle, key, e.c(hVarA));
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
            throw new IllegalArgumentException(c.c(encoder, this.descriptor.a()).toString());
        }
        throw null;
    }
}
