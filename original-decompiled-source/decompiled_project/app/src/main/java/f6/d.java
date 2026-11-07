package f6;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.savedstate.serialization.serializers.CharSequenceArraySerializer;
import androidx.savedstate.serialization.serializers.CharSequenceListSerializer;
import androidx.savedstate.serialization.serializers.CharSequenceSerializer;
import androidx.savedstate.serialization.serializers.DefaultJavaSerializableSerializer;
import androidx.savedstate.serialization.serializers.DefaultParcelableSerializer;
import androidx.savedstate.serialization.serializers.IBinderSerializer;
import androidx.savedstate.serialization.serializers.ParcelableArraySerializer;
import androidx.savedstate.serialization.serializers.ParcelableListSerializer;
import androidx.savedstate.serialization.serializers.SparseParcelableArraySerializer;
import b3.l;
import bi.f;
import bi.m;
import java.util.Arrays;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class d extends ci.a {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f8865a;

    /* renamed from: b, reason: collision with root package name */
    public String f8866b;

    /* renamed from: c, reason: collision with root package name */
    public int f8867c;

    public d(Bundle bundle) {
        r.e(null, "configuration");
        this.f8865a = bundle;
        this.f8866b = "";
        throw null;
    }

    @Override // ci.a, ci.d
    public final byte B() {
        Bundle source = this.f8865a;
        r.e(source, "source");
        return (byte) c6.b.b(source, this.f8866b);
    }

    @Override // ci.a, ci.d
    public final short C() {
        Bundle source = this.f8865a;
        r.e(source, "source");
        return (short) c6.b.b(source, this.f8866b);
    }

    @Override // ci.a, ci.d
    public final float D() {
        Bundle source = this.f8865a;
        r.e(source, "source");
        return c6.b.a(source, this.f8866b);
    }

    @Override // ci.a, ci.d
    public final double E() {
        String key = this.f8866b;
        r.e(key, "key");
        Bundle bundle = this.f8865a;
        double d10 = bundle.getDouble(key, Double.MIN_VALUE);
        if (d10 != Double.MIN_VALUE || bundle.getDouble(key, Double.MAX_VALUE) != Double.MAX_VALUE) {
            return d10;
        }
        l.c(key);
        throw null;
    }

    @Override // ci.d, ci.b
    public final ei.b a() {
        return null;
    }

    @Override // ci.a, ci.d
    public final ci.b c(f descriptor) {
        r.e(descriptor, "descriptor");
        if (r.a(this.f8866b, "")) {
            return this;
        }
        new d(c6.b.f(this.f8865a, this.f8866b));
        throw null;
    }

    @Override // ci.a, ci.d
    public final boolean f() {
        String key = this.f8866b;
        r.e(key, "key");
        Bundle bundle = this.f8865a;
        boolean z10 = bundle.getBoolean(key, false);
        if (z10 || !bundle.getBoolean(key, true)) {
            return z10;
        }
        l.c(key);
        throw null;
    }

    @Override // ci.b
    public final int g(f descriptor) {
        r.e(descriptor, "descriptor");
        boolean zA = r.a(descriptor.getKind(), m.b.f4279a);
        Bundle bundle = this.f8865a;
        int size = (zA || r.a(descriptor.getKind(), m.c.f4280a)) ? bundle.size() : descriptor.e();
        while (true) {
            int i10 = this.f8867c;
            if (i10 < size && descriptor.i(i10)) {
                String key = descriptor.f(this.f8867c);
                r.e(key, "key");
                if (bundle.containsKey(key)) {
                    break;
                }
                this.f8867c++;
            } else {
                break;
            }
        }
        int i11 = this.f8867c;
        if (i11 >= size) {
            return -1;
        }
        this.f8866b = descriptor.f(i11);
        int i12 = this.f8867c;
        this.f8867c = i12 + 1;
        return i12;
    }

    @Override // ci.a, ci.d
    public final char h() {
        String key = this.f8866b;
        r.e(key, "key");
        Bundle bundle = this.f8865a;
        char c10 = bundle.getChar(key, (char) 0);
        if (c10 != 0 || bundle.getChar(key, (char) 65535) != 65535) {
            return c10;
        }
        l.c(key);
        throw null;
    }

    @Override // ci.a, ci.d
    public final int i(f enumDescriptor) {
        r.e(enumDescriptor, "enumDescriptor");
        Bundle source = this.f8865a;
        r.e(source, "source");
        return c6.b.b(source, this.f8866b);
    }

    @Override // ci.a, ci.d
    public final int m() {
        Bundle source = this.f8865a;
        r.e(source, "source");
        return c6.b.b(source, this.f8866b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.d
    public final <T> T q(zh.a<? extends T> deserializer) {
        Object objDeserialize;
        Object stringArray;
        r.e(deserializer, "deserializer");
        f descriptor = deserializer.getDescriptor();
        T t3 = null;
        if (r.a(descriptor, c.f8850a)) {
            objDeserialize = CharSequenceSerializer.INSTANCE.deserialize((ci.d) this);
        } else if (r.a(descriptor, c.f8851b)) {
            objDeserialize = DefaultParcelableSerializer.INSTANCE.deserialize((ci.d) this);
        } else if (r.a(descriptor, c.f8852c)) {
            objDeserialize = DefaultJavaSerializableSerializer.INSTANCE.deserialize((ci.d) this);
        } else if (r.a(descriptor, c.f8853d)) {
            objDeserialize = IBinderSerializer.INSTANCE.deserialize((ci.d) this);
        } else if (r.a(descriptor, c.f8858i) || r.a(descriptor, c.f8859j)) {
            objDeserialize = CharSequenceArraySerializer.INSTANCE.deserialize((ci.d) this);
        } else if (r.a(descriptor, c.f8860k) || r.a(descriptor, c.f8861l)) {
            objDeserialize = CharSequenceListSerializer.INSTANCE.deserialize((ci.d) this);
        } else if (r.a(descriptor, c.f8854e)) {
            Parcelable[] parcelableArrDeserialize = ParcelableArraySerializer.INSTANCE.deserialize((ci.d) this);
            T tDeserialize = deserializer.deserialize(a.f8839a);
            r.b(tDeserialize);
            objDeserialize = Arrays.copyOf(parcelableArrDeserialize, parcelableArrDeserialize.length, b3.e.c(h0.a(tDeserialize.getClass())));
        } else {
            objDeserialize = r.a(descriptor, c.f8855f) ? ParcelableArraySerializer.INSTANCE.deserialize((ci.d) this) : (r.a(descriptor, c.f8856g) || r.a(descriptor, c.f8857h)) ? ParcelableListSerializer.INSTANCE.deserialize((ci.d) this) : (r.a(descriptor, c.f8862m) || r.a(descriptor, c.f8863n) || r.a(descriptor, c.f8864o)) ? SparseParcelableArraySerializer.INSTANCE.deserialize((ci.d) this) : null;
        }
        if (objDeserialize == null) {
            f descriptor2 = deserializer.getDescriptor();
            boolean zA = r.a(descriptor2, b.f8841a);
            Bundle bundle = this.f8865a;
            if (zA) {
                String key = this.f8866b;
                r.e(key, "key");
                stringArray = bundle.getIntegerArrayList(key);
                if (stringArray == null) {
                    l.c(key);
                    throw null;
                }
            } else if (r.a(descriptor2, b.f8842b)) {
                t3 = (T) c6.b.h(bundle, this.f8866b);
            } else if (r.a(descriptor2, b.f8843c)) {
                String key2 = this.f8866b;
                r.e(key2, "key");
                stringArray = bundle.getBooleanArray(key2);
                if (stringArray == null) {
                    l.c(key2);
                    throw null;
                }
            } else if (r.a(descriptor2, b.f8844d)) {
                String key3 = this.f8866b;
                r.e(key3, "key");
                stringArray = bundle.getCharArray(key3);
                if (stringArray == null) {
                    l.c(key3);
                    throw null;
                }
            } else if (r.a(descriptor2, b.f8845e)) {
                String key4 = this.f8866b;
                r.e(key4, "key");
                stringArray = bundle.getDoubleArray(key4);
                if (stringArray == null) {
                    l.c(key4);
                    throw null;
                }
            } else if (r.a(descriptor2, b.f8846f)) {
                String key5 = this.f8866b;
                r.e(key5, "key");
                stringArray = bundle.getFloatArray(key5);
                if (stringArray == null) {
                    l.c(key5);
                    throw null;
                }
            } else if (r.a(descriptor2, b.f8847g)) {
                t3 = (T) c6.b.c(bundle, this.f8866b);
            } else if (r.a(descriptor2, b.f8848h)) {
                String key6 = this.f8866b;
                r.e(key6, "key");
                stringArray = bundle.getLongArray(key6);
                if (stringArray == null) {
                    l.c(key6);
                    throw null;
                }
            } else if (r.a(descriptor2, b.f8849i)) {
                String key7 = this.f8866b;
                r.e(key7, "key");
                stringArray = bundle.getStringArray(key7);
                if (stringArray == null) {
                    l.c(key7);
                    throw null;
                }
            }
            t3 = (T) stringArray;
        } else {
            t3 = (T) objDeserialize;
        }
        return t3 == null ? deserializer.deserialize(this) : t3;
    }

    @Override // ci.a, ci.d
    public final String r() {
        Bundle source = this.f8865a;
        r.e(source, "source");
        return c6.b.g(source, this.f8866b);
    }

    @Override // ci.a, ci.d
    public final long v() {
        Bundle source = this.f8865a;
        r.e(source, "source");
        return c6.b.d(source, this.f8866b);
    }

    @Override // ci.a, ci.d
    public final boolean x() {
        Bundle source = this.f8865a;
        r.e(source, "source");
        return !c6.b.i(source, this.f8866b);
    }
}
