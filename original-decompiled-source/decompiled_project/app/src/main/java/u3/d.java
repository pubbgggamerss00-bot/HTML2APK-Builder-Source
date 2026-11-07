package u3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.jvm.internal.r;
import pg.n;

/* loaded from: classes.dex */
public final class d {
    /* JADX WARN: Multi-variable type inference failed */
    @pg.d
    public static final Bundle a(n<String, ? extends Object>... nVarArr) {
        Bundle bundle = new Bundle(nVarArr.length);
        for (n<String, ? extends Object> nVar : nVarArr) {
            String str = nVar.f21469a;
            B b10 = nVar.f21470b;
            if (b10 == 0) {
                bundle.putString(str, null);
            } else if (b10 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) b10).booleanValue());
            } else if (b10 instanceof Byte) {
                bundle.putByte(str, ((Number) b10).byteValue());
            } else if (b10 instanceof Character) {
                bundle.putChar(str, ((Character) b10).charValue());
            } else if (b10 instanceof Double) {
                bundle.putDouble(str, ((Number) b10).doubleValue());
            } else if (b10 instanceof Float) {
                bundle.putFloat(str, ((Number) b10).floatValue());
            } else if (b10 instanceof Integer) {
                bundle.putInt(str, ((Number) b10).intValue());
            } else if (b10 instanceof Long) {
                bundle.putLong(str, ((Number) b10).longValue());
            } else if (b10 instanceof Short) {
                bundle.putShort(str, ((Number) b10).shortValue());
            } else if (b10 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) b10);
            } else if (b10 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) b10);
            } else if (b10 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) b10);
            } else if (b10 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) b10);
            } else if (b10 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) b10);
            } else if (b10 instanceof char[]) {
                bundle.putCharArray(str, (char[]) b10);
            } else if (b10 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) b10);
            } else if (b10 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) b10);
            } else if (b10 instanceof int[]) {
                bundle.putIntArray(str, (int[]) b10);
            } else if (b10 instanceof long[]) {
                bundle.putLongArray(str, (long[]) b10);
            } else if (b10 instanceof short[]) {
                bundle.putShortArray(str, (short[]) b10);
            } else if (b10 instanceof Object[]) {
                Class<?> componentType = b10.getClass().getComponentType();
                r.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) b10);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) b10);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) b10);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) b10);
                }
            } else if (b10 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) b10);
            } else if (b10 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) b10);
            } else if (b10 instanceof Size) {
                bundle.putSize(str, (Size) b10);
            } else {
                if (!(b10 instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + b10.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) b10);
            }
        }
        return bundle;
    }
}
