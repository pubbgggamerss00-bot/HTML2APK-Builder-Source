package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
import b6.c;
import bi.f;
import bi.k;
import ci.d;
import ci.e;
import kotlin.jvm.internal.r;
import zh.b;

/* loaded from: classes.dex */
public final class SavedStateSerializer implements b<Bundle> {
    public static final SavedStateSerializer INSTANCE = new SavedStateSerializer();
    private static final f descriptor = k.c("androidx.savedstate.SavedState", new f[0]);

    private SavedStateSerializer() {
    }

    @Override // zh.i, zh.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // zh.a
    public Bundle deserialize(d decoder) {
        r.e(decoder, "decoder");
        if (!(decoder instanceof f6.d)) {
            throw new IllegalArgumentException(c.a(INSTANCE.getDescriptor().a(), decoder).toString());
        }
        f6.d dVar = (f6.d) decoder;
        Bundle source = dVar.f8865a;
        if (r.a(dVar.f8866b, "")) {
            return source;
        }
        r.e(source, "source");
        return c6.b.f(source, dVar.f8866b);
    }

    @Override // zh.i
    public void serialize(e encoder, Bundle value) {
        r.e(encoder, "encoder");
        r.e(value, "value");
        if (!(encoder instanceof f6.e)) {
            throw new IllegalArgumentException(c.c(encoder, INSTANCE.getDescriptor().a()).toString());
        }
        throw null;
    }
}
