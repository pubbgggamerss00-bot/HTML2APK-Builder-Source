package androidx.lifecycle;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.basitce.htmltoapk.R;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class c1 {
    public static final long a(float f10, float f11) {
        return (Float.floatToRawIntBits(f11) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static byte[] b(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = (byte) ((bArr[i10] << 1) & 254);
            bArr2[i10] = b10;
            if (i10 < 15) {
                bArr2[i10] = (byte) (((byte) ((bArr[i10 + 1] >> 7) & 1)) | b10);
            }
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    public static final t c(View view) {
        kotlin.jvm.internal.r.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            t tVar = tag instanceof t ? (t) tag : null;
            if (tVar != null) {
                return tVar;
            }
            Object objA = b4.a.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static final void d(View view, t tVar) {
        kotlin.jvm.internal.r.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, tVar);
    }

    public static void e(Parcel parcel, int i10, Bundle bundle, boolean z10) {
        if (bundle == null) {
            if (z10) {
                s(parcel, i10, 0);
            }
        } else {
            int iQ = q(i10, parcel);
            parcel.writeBundle(bundle);
            r(iQ, parcel);
        }
    }

    public static void f(Parcel parcel, int i10, byte[] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                s(parcel, i10, 0);
            }
        } else {
            int iQ = q(i10, parcel);
            parcel.writeByteArray(bArr);
            r(iQ, parcel);
        }
    }

    public static void g(Parcel parcel, int i10, Double d10) {
        if (d10 == null) {
            return;
        }
        s(parcel, i10, 8);
        parcel.writeDouble(d10.doubleValue());
    }

    public static void h(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iQ = q(i10, parcel);
        parcel.writeStrongBinder(iBinder);
        r(iQ, parcel);
    }

    public static void i(Parcel parcel, int i10, int[] iArr, boolean z10) {
        if (iArr == null) {
            if (z10) {
                s(parcel, i10, 0);
            }
        } else {
            int iQ = q(i10, parcel);
            parcel.writeIntArray(iArr);
            r(iQ, parcel);
        }
    }

    public static void j(Parcel parcel, int i10, Integer num) {
        if (num == null) {
            return;
        }
        s(parcel, i10, 4);
        parcel.writeInt(num.intValue());
    }

    public static void k(Parcel parcel, int i10, Long l10) {
        if (l10 == null) {
            return;
        }
        s(parcel, i10, 8);
        parcel.writeLong(l10.longValue());
    }

    public static void l(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z10) {
        if (parcelable == null) {
            if (z10) {
                s(parcel, i10, 0);
            }
        } else {
            int iQ = q(i10, parcel);
            parcelable.writeToParcel(parcel, i11);
            r(iQ, parcel);
        }
    }

    public static void m(Parcel parcel, int i10, String str, boolean z10) {
        if (str == null) {
            if (z10) {
                s(parcel, i10, 0);
            }
        } else {
            int iQ = q(i10, parcel);
            parcel.writeString(str);
            r(iQ, parcel);
        }
    }

    public static void n(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int iQ = q(i10, parcel);
        parcel.writeStringList(list);
        r(iQ, parcel);
    }

    public static void o(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int iQ = q(i10, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i11);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        r(iQ, parcel);
    }

    public static void p(Parcel parcel, int i10, List list, boolean z10) {
        if (list == null) {
            if (z10) {
                s(parcel, i10, 0);
                return;
            }
            return;
        }
        int iQ = q(i10, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
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
        r(iQ, parcel);
    }

    public static int q(int i10, Parcel parcel) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void r(int i10, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    public static void s(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }
}
