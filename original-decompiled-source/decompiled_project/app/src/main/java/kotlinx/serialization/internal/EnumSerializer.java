package kotlinx.serialization.internal;

import java.lang.Enum;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class EnumSerializer<T extends Enum<T>> implements zh.b<T> {
    private final pg.j descriptor$delegate;
    private bi.f overriddenDescriptor;
    private final T[] values;

    public EnumSerializer(String serialName, T[] values) {
        kotlin.jvm.internal.r.e(serialName, "serialName");
        kotlin.jvm.internal.r.e(values, "values");
        this.values = values;
        this.descriptor$delegate = e9.w0.b(new q(0, this, serialName));
    }

    private final bi.f createUnmarkedDescriptor(String str) {
        p pVar = new p(str, this.values.length);
        for (T t3 : this.values) {
            pVar.j(t3.name(), false);
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bi.f descriptor_delegate$lambda$0(EnumSerializer enumSerializer, String str) {
        bi.f fVar = enumSerializer.overriddenDescriptor;
        return fVar == null ? enumSerializer.createUnmarkedDescriptor(str) : fVar;
    }

    @Override // zh.i, zh.a
    public bi.f getDescriptor() {
        return (bi.f) this.descriptor$delegate.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
    }

    @Override // zh.a
    public T deserialize(ci.d decoder) {
        kotlin.jvm.internal.r.e(decoder, "decoder");
        int i10 = decoder.i(getDescriptor());
        if (i10 >= 0) {
            T[] tArr = this.values;
            if (i10 < tArr.length) {
                return tArr[i10];
            }
        }
        throw new zh.h(i10 + " is not among valid " + getDescriptor().a() + " enum values, values size is " + this.values.length);
    }

    @Override // zh.i
    public void serialize(ci.e encoder, T value) {
        kotlin.jvm.internal.r.e(encoder, "encoder");
        kotlin.jvm.internal.r.e(value, "value");
        int iW = qg.o.w(this.values, value);
        if (iW != -1) {
            encoder.C(getDescriptor(), iW);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().a());
        sb.append(", must be one of ");
        String string = Arrays.toString(this.values);
        kotlin.jvm.internal.r.d(string, "toString(...)");
        sb.append(string);
        throw new zh.h(sb.toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumSerializer(String serialName, T[] values, bi.f descriptor) {
        this(serialName, values);
        kotlin.jvm.internal.r.e(serialName, "serialName");
        kotlin.jvm.internal.r.e(values, "values");
        kotlin.jvm.internal.r.e(descriptor, "descriptor");
        this.overriddenDescriptor = descriptor;
    }
}
