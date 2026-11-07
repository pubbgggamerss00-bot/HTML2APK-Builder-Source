package androidx.savedstate.serialization.serializers;

import android.os.Build;
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
import u3.c;
import zh.b;

/* loaded from: classes.dex */
public final class ParcelableArraySerializer implements b<Parcelable[]> {
    public static final ParcelableArraySerializer INSTANCE = new ParcelableArraySerializer();
    private static final f descriptor = k.c("kotlin.Array<android.os.Parcelable>", new f[0]);

    private ParcelableArraySerializer() {
    }

    @Override // zh.i, zh.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // zh.a
    public Parcelable[] deserialize(d decoder) {
        r.e(decoder, "decoder");
        if (!(decoder instanceof f6.d)) {
            throw new IllegalArgumentException(c.a(INSTANCE.getDescriptor().a(), decoder).toString());
        }
        f6.d dVar = (f6.d) decoder;
        Bundle bundle = dVar.f8865a;
        String key = dVar.f8866b;
        h hVarA = h0.a(Parcelable.class);
        r.e(key, "key");
        Parcelable[] parcelableArray = Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) c.a.b(bundle, key, e.c(hVarA)) : bundle.getParcelableArray(key);
        if (parcelableArray == null) {
            parcelableArray = null;
        }
        if (parcelableArray != null) {
            return parcelableArray;
        }
        l.c(key);
        throw null;
    }

    @Override // zh.i
    public void serialize(ci.e encoder, Parcelable[] value) {
        r.e(encoder, "encoder");
        r.e(value, "value");
        if (!(encoder instanceof f6.e)) {
            throw new IllegalArgumentException(b6.c.c(encoder, INSTANCE.getDescriptor().a()).toString());
        }
        throw null;
    }
}
