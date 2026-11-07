package ua;

import android.os.Parcel;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import ua.a;

/* loaded from: classes2.dex */
public abstract class b extends a implements qa.c {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        a aVar = (a) obj;
        for (a.C0303a<?, ?> c0303a : getFieldMappings().values()) {
            if (isFieldSet(c0303a)) {
                if (!aVar.isFieldSet(c0303a) || !o.a(getFieldValue(c0303a), aVar.getFieldValue(c0303a))) {
                    return false;
                }
            } else if (aVar.isFieldSet(c0303a)) {
                return false;
            }
        }
        return true;
    }

    @Override // ua.a
    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int iHashCode = 0;
        for (a.C0303a<?, ?> c0303a : getFieldMappings().values()) {
            if (isFieldSet(c0303a)) {
                Object fieldValue = getFieldValue(c0303a);
                p.f(fieldValue);
                iHashCode = (iHashCode * 31) + fieldValue.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // ua.a
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }

    public byte[] toByteArray() {
        Parcel parcelObtain = Parcel.obtain();
        writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
