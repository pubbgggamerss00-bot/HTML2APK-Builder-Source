package u0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class o0<T> implements c0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<T, Float> f29088a;

    public o0(Map<T, Float> map) {
        this.f29088a = map;
    }

    @Override // u0.c0
    public final float a() {
        Float fValueOf;
        Collection<Float> collectionValues = this.f29088a.values();
        kotlin.jvm.internal.r.e(collectionValues, "<this>");
        Iterator<T> it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return Float.NaN;
    }

    @Override // u0.c0
    public final T b(float f10, boolean z10) {
        T next;
        Iterator<T> it = this.f29088a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fFloatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                float f11 = z10 ? fFloatValue - f10 : f10 - fFloatValue;
                if (f11 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    f11 = Float.POSITIVE_INFINITY;
                }
                do {
                    T next2 = it.next();
                    float fFloatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    float f12 = z10 ? fFloatValue2 - f10 : f10 - fFloatValue2;
                    if (f12 < CropImageView.DEFAULT_ASPECT_RATIO) {
                        f12 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f11, f12) > 0) {
                        next = next2;
                        f11 = f12;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // u0.c0
    public final T c(float f10) {
        T next;
        Iterator<T> it = this.f29088a.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(f10 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    T next2 = it.next();
                    float fAbs2 = Math.abs(f10 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (T) entry.getKey();
        }
        return null;
    }

    @Override // u0.c0
    public final float d(T t3) {
        Float f10 = this.f29088a.get(t3);
        if (f10 != null) {
            return f10.floatValue();
        }
        return Float.NaN;
    }

    @Override // u0.c0
    public final boolean e(T t3) {
        return this.f29088a.containsKey(t3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        return kotlin.jvm.internal.r.a(this.f29088a, ((o0) obj).f29088a);
    }

    @Override // u0.c0
    public final float f() {
        Float fValueOf;
        Collection<Float> collectionValues = this.f29088a.values();
        kotlin.jvm.internal.r.e(collectionValues, "<this>");
        Iterator<T> it = collectionValues.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return Float.NaN;
    }

    public final int hashCode() {
        return this.f29088a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.f29088a + ')';
    }
}
