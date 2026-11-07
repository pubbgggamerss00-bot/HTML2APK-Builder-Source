package androidx.savedstate.serialization.serializers;

import android.os.Parcelable;
import b6.c;
import bi.f;
import bi.k;
import ci.d;
import ci.e;
import java.util.List;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.r;
import zh.b;

/* loaded from: classes.dex */
public final class ParcelableListSerializer implements b<List<? extends Parcelable>> {
    public static final ParcelableListSerializer INSTANCE = new ParcelableListSerializer();
    private static final f descriptor = k.c("kotlin.collections.List<android.os.Parcelable>", new f[0]);

    private ParcelableListSerializer() {
    }

    @Override // zh.i, zh.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // zh.a
    public List<Parcelable> deserialize(d decoder) {
        r.e(decoder, "decoder");
        if (!(decoder instanceof f6.d)) {
            throw new IllegalArgumentException(c.a(INSTANCE.getDescriptor().a(), decoder).toString());
        }
        f6.d dVar = (f6.d) decoder;
        return c6.b.e(dVar.f8865a, dVar.f8866b, h0.a(Parcelable.class));
    }

    @Override // zh.i
    public void serialize(e encoder, List<? extends Parcelable> value) {
        r.e(encoder, "encoder");
        r.e(value, "value");
        if (!(encoder instanceof f6.e)) {
            throw new IllegalArgumentException(c.c(encoder, INSTANCE.getDescriptor().a()).toString());
        }
        throw null;
    }
}
