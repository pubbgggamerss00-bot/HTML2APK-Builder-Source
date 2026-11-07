package e5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.EditText;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class i {
    public static float a(float f6, float f7, float f8) {
        return f6 < f7 ? f7 : f6 > f8 ? f8 : f6;
    }

    public static int b(int i6, int i7, int i8) {
        return i6 < i7 ? i7 : i6 > i8 ? i8 : i6;
    }

    public static void c(int i6, int i7, int i8, Object[] objArr, Object[] objArr2) {
        kotlin.jvm.internal.j.e("<this>", objArr);
        kotlin.jvm.internal.j.e("destination", objArr2);
        System.arraycopy(objArr, i7, objArr2, i6, i8 - i7);
    }

    public static void d(int i6, int i7, int[] iArr, int[] iArr2, int i8) {
        kotlin.jvm.internal.j.e("<this>", iArr);
        kotlin.jvm.internal.j.e("destination", iArr2);
        System.arraycopy(iArr, i7, iArr2, i6, i8 - i7);
    }

    public static /* synthetic */ void e(int i6, int i7, int i8, Object[] objArr, Object[] objArr2) {
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        c(0, i6, i7, objArr, objArr2);
    }

    public static final void f(int i6, int i7) {
        if (i6 <= i7) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i6 + ") is greater than size (" + i7 + ").");
    }

    public static boolean g(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static int h(float f6) {
        if (Float.isNaN(f6)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f6);
    }

    public static void i(Parcel parcel, int i6, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iS = s(i6, parcel);
        parcel.writeBundle(bundle);
        t(iS, parcel);
    }

    public static void j(Parcel parcel, int i6, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iS = s(i6, parcel);
        parcel.writeByteArray(bArr);
        t(iS, parcel);
    }

    public static void k(Parcel parcel, int i6, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iS = s(i6, parcel);
        parcel.writeStrongBinder(iBinder);
        t(iS, parcel);
    }

    public static void l(Parcel parcel, int i6, Parcelable parcelable, int i7) {
        if (parcelable == null) {
            return;
        }
        int iS = s(i6, parcel);
        parcelable.writeToParcel(parcel, i7);
        t(iS, parcel);
    }

    public static void m(Parcel parcel, int i6, String str) {
        if (str == null) {
            return;
        }
        int iS = s(i6, parcel);
        parcel.writeString(str);
        t(iS, parcel);
    }

    public static void n(Parcel parcel, int i6, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iS = s(i6, parcel);
        parcel.writeStringArray(strArr);
        t(iS, parcel);
    }

    public static void o(Parcel parcel, int i6, List list) {
        if (list == null) {
            return;
        }
        int iS = s(i6, parcel);
        parcel.writeStringList(list);
        t(iS, parcel);
    }

    public static void p(Parcel parcel, int i6, Parcelable[] parcelableArr, int i7) {
        if (parcelableArr == null) {
            return;
        }
        int iS = s(i6, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i7);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        t(iS, parcel);
    }

    public static void q(Parcel parcel, int i6, List list) {
        if (list == null) {
            return;
        }
        int iS = s(i6, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i7 = 0; i7 < size; i7++) {
            Parcelable parcelable = (Parcelable) list.get(i7);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        t(iS, parcel);
    }

    public static void r(Parcel parcel, int i6, int i7) {
        parcel.writeInt(i6 | (i7 << 16));
    }

    public static int s(int i6, Parcel parcel) {
        parcel.writeInt(i6 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void t(int i6, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i6 - 4);
        parcel.writeInt(iDataPosition - i6);
        parcel.setDataPosition(iDataPosition);
    }
}
