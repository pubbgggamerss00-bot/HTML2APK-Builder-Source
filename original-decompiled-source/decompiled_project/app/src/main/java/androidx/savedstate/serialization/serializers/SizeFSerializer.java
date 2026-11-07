package androidx.savedstate.serialization.serializers;

import android.os.Bundle;
import android.util.SizeF;
import b3.l;
import b6.c;
import bi.f;
import bi.k;
import ci.d;
import ci.e;
import kotlin.jvm.internal.r;
import zh.b;

/* loaded from: classes.dex */
public final class SizeFSerializer implements b<SizeF> {
    public static final SizeFSerializer INSTANCE = new SizeFSerializer();
    private static final f descriptor = k.c("android.util.SizeF", new f[0]);

    private SizeFSerializer() {
    }

    @Override // zh.i, zh.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // zh.a
    public SizeF deserialize(d decoder) {
        r.e(decoder, "decoder");
        if (!(decoder instanceof f6.d)) {
            throw new IllegalArgumentException(c.a(INSTANCE.getDescriptor().a(), decoder).toString());
        }
        f6.d dVar = (f6.d) decoder;
        Bundle bundle = dVar.f8865a;
        String key = dVar.f8866b;
        r.e(key, "key");
        SizeF sizeF = bundle.getSizeF(key);
        if (sizeF != null) {
            return sizeF;
        }
        l.c(key);
        throw null;
    }

    @Override // zh.i
    public void serialize(e encoder, SizeF value) {
        r.e(encoder, "encoder");
        r.e(value, "value");
        if (!(encoder instanceof f6.e)) {
            throw new IllegalArgumentException(c.c(encoder, INSTANCE.getDescriptor().a()).toString());
        }
        throw null;
    }
}
